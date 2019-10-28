package student_exercise_1.by_sava;

public class Student {
    int id;
    String name;
    String secondName;
    int yearOfBirth;
    double mathScore;
    double economicsScore;
    double englishScore;

    public Student(int id, String name, String secondName, int yearOfBirth, double mathScore, double economicsScore, double englishScore) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.mathScore = mathScore;
        this.economicsScore = economicsScore;
        this.englishScore = englishScore;
    }

    public double getAvarageScors(){
        return (mathScore + economicsScore + englishScore) / 3;
    }
}
