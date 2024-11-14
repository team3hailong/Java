

public class Student {
    public int age;
    public double mathScore;
    public double literatureScore;
    public double englishScore;
    public String name;
    public String address;
    public Student(String name, int age, String address, double mathScore, double literatureScore, double englishScore) {
        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMathScore() {
        return mathScore;
    }

    public double getLiteratureScore() {
        return literatureScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public String getAddress() {
        return address;
    }
}
