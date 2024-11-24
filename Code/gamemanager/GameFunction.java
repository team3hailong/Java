package gamemanager;

import game.*;
import enums.FireResult;
import enums.GameStatus;


public class GameFunction {
    public Game game;
    public PlayerFunction playerFunction1;
    public PlayerFunction playerFunction2;
    public BotFunction botFunction;
    public Menu menu;
    public Leaderboard leaderboard;
    public boolean isPvE;

    public GameFunction(Game game, Leaderboard leaderboard, PlayerFunction playerFunction1, PlayerFunction playerFunction2, BotFunction botFunction, boolean isPvE) {
        this.game = game;
        this.leaderboard = leaderboard;
        this.playerFunction1 = playerFunction1;
        this.playerFunction2 = playerFunction2;
        this.botFunction = botFunction;
        this.menu = new Menu();
        this.isPvE = isPvE;
    }

    public void startGame() {
        ready();
        int turn=1;
        while (game.getStatus() == GameStatus.IN_PROGRESS) {
            ++turn;
            Player currentTurn = game.getCurrentTurn();
            Player opponent = (currentTurn == game.getPlayer1()) ? game.getPlayer2() : game.getPlayer1();
            System.out.println("Lượt bắn của " + currentTurn.getName() + " sẽ bắt đầu sau 3 giây, hãy sẵn sàng!");
            clearScreen(3);
            PlayerFunction currentPlayerFunction = (currentTurn == game.getPlayer1()) ? playerFunction1 : playerFunction2;
            if (isPvE && currentTurn == game.getPlayer2()) {
                botTurn(currentTurn, opponent);
            } else {
                playerTurn(currentTurn, opponent);
            }
            if (opponent.getRemainingShips() == 0) {
                end(currentTurn, opponent, turn);
                break;
            }
            game.setCurrentTurn(opponent);
        }
    }

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void clearScreen(int seconds) {
        sleep(seconds*1000);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void ready() {
        menu.start();
        clearScreen(1);
        playerFunction1.placeShips(game.getPlayer1());
        if (isPvE)
            botFunction.placeShips(game.getPlayer2());
        else
            playerFunction2.placeShips(game.getPlayer2());
        game.setStatus(GameStatus.IN_PROGRESS);
        System.out.println("===== Khai màn trận chiến =====");
    }

    public void status(Player currentTurn, Player opponent) {
        System.out.println("\n===== Lượt của " + currentTurn.getName() + " =====");
        System.out.println("Số tàu còn lại của địch: " + opponent.getRemainingShips());
        System.out.println("Số lần bắn trúng tàu địch: " + opponent.getHits());
        System.out.println("Số tàu của bạn đã bị phá hủy: " + currentTurn.getSunkShips());
        System.out.println("===== Bảng của " + currentTurn.getName() + " =====");
        currentTurn.getBoard().displayFullBoard();
        System.out.println("===== Bảng sương mù của " + opponent.getName() + " =====");
        opponent.getBoard().displayFogOfWar();
    }

    private void playerTurn(Player currentTurn, Player opponent) {
        PlayerFunction currentPlayerFunction = (currentTurn == game.getPlayer1()) ? playerFunction1 : playerFunction2;
        while (true) {
            status(currentTurn, opponent);
            FireResult result = currentPlayerFunction.fireAt(currentTurn, opponent);
            handleFireResult(result);
            if (result == FireResult.MISS || opponent.getRemainingShips() == 0) {
                break;
            }
            System.out.println("Bạn đã trúng tàu địch, bạn được bắn thêm lần nữa!");
            sleep(1000);
        }
    }

    private void botTurn(Player currentTurn, Player opponent) {
        while (true) {
            //status(currentTurn, opponent);
            System.out.println("\n===== Lượt của " + currentTurn.getName() + " =====");
            FireResult result = botFunction.fireAt(currentTurn, opponent);
            handleFireResult(result);
            if (result == FireResult.MISS || opponent.getRemainingShips() == 0) {
                break;
            }
            System.out.println(currentTurn.getName() + " đã trúng tàu của bạn, nó sẽ bắn thêm lần nữa!");
            sleep(1000);
        }
    }

    private void handleFireResult(FireResult result) {
        switch (result) {
            case HIT:
                menu.hit();
                break;
            case MISS:
                menu.miss();
                break;
            case SUNK:
                menu.sunk();
                break;
        }
    }

    public void end(Player currentTurn, Player opponent, int turn){
        clearScreen(1);
        game.setStatus(GameStatus.FINISHED);
        menu.end();
        System.out.println(currentTurn.getName() + " chiến thắng!");
        sleep(1000);
        System.out.println("===== Bảng của " + currentTurn.getName() + " =====");
        currentTurn.getBoard().displayFullBoard();
        System.out.println("===== Bảng của " + opponent.getName() + " =====");
        opponent.getBoard().displayFullBoard();
        System.out.println("Màn hình chính sẽ được mở sau 3s.");
        clearScreen(3);
        leaderboard.addRecord(new PlayerRecord(currentTurn.getName(), turn/2, currentTurn.getRemainingShips()));
    }
}