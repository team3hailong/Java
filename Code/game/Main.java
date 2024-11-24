package game;

import java.util.Scanner;
import gamemanager.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Leaderboard leaderboard = new Leaderboard();
        while (true) {
            try {
                menu.seaBattle();
                System.out.print("Chọn một tùy chọn: ");
                int option = Integer.parseInt(scanner.nextLine());
                if (option == 1 || option == 2) {
                    int size = 0;
                    boolean isValid = false;
                    while (!isValid) {
                        try {
                            System.out.print("Hãy chọn kích thước bảng: ");
                            size = Integer.parseInt(scanner.nextLine());
                            isValid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                        }
                    }
                    System.out.println("+ Vui lòng nhập tên người chơi trước khi bắt đầu +");

                    String player1Name;
                    String player2Name = "BotMadeByHaiLong";
                    if (option == 1) {
                        System.out.print("Nhập tên người chơi 1: ");
                        player1Name = scanner.nextLine();
                        System.out.print("Nhập tên người chơi 2: ");
                        player2Name = scanner.nextLine();
                    } else {
                        System.out.print("Nhập tên của bạn: ");
                        player1Name = scanner.nextLine();
                    }

                    Game game = new Game(player1Name, player2Name, size);
                    BoardController boardController1 = new BoardController(game.getPlayer1().getBoard());
                    BoardController boardController2 = new BoardController(game.getPlayer2().getBoard());
                    PlayerFunction playerFunction1 = new PlayerFunction(boardController1);
                    PlayerFunction playerFunction2 = new PlayerFunction(boardController2);
                    BotFunction botFunction = new BotFunction(boardController2);
                    GameFunction gameFunction;
                    if (option == 1)
                        gameFunction = new GameFunction(game, leaderboard, playerFunction1, playerFunction2, null, false);
                    else
                        gameFunction = new GameFunction(game, leaderboard, playerFunction1, null, botFunction, true);
                    gameFunction.startGame();
                } else if (option == 3) {
                    leaderboard.display();
                    System.out.println("Vui lòng nhập bất kì kí tự nào để thoát bảng xếp hạng.");
                    scanner.nextLine();
                } else if (option == 0) {
                    System.out.println("Cảm ơn bạn đã chơi trò chơi!");
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Lựa chọn không tồn tại, vui lòng nhập lại");
            }
        }
    }
}