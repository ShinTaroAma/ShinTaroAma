package student_exercise_1;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.name = "Ivan";
        firstStudent.secondName = "Ivanov";
        firstStudent.yearOfBirth = 2019;
        firstStudent.id = 382;
        firstStudent.economicsScore = 11.0;
        firstStudent.mathScore = 9.5;
        firstStudent.englishScore = 8.3;
        double average1 = (firstStudent.economicsScore + firstStudent.mathScore + firstStudent.englishScore) / 3;

        Student St2 = new Student();
        St2.name = "Petro";
        St2.secondName = "Petrov";
        St2.yearOfBirth = 2019;
        St2.id = 383;
        St2.economicsScore = 10.0;
        St2.mathScore = 8.5;
        St2.englishScore = 8.5;
        double average2 = (St2.economicsScore + St2.mathScore + St2.englishScore) / 3;

        Student St3 = new Student();
        St3.name = "David";
        St3.secondName = "Davidov";
        St3.yearOfBirth = 2019;
        St3.id = 384;
        St3.economicsScore = 7.0;
        St3.mathScore = 11.5;
        St3.englishScore = 8.8;
        double average3 = (St3.economicsScore + St3.mathScore + St3.englishScore) / 3;

        System.out.println("Студент :" + firstStudent.name + " " + firstStudent.secondName + " № " + firstStudent.id + " Рік " + firstStudent.yearOfBirth);
        System.out.println("Середня оцінка студента :" + average1);
        System.out.println("Студент :" + St2.name + " " + St2.secondName + " № " + St2.id + " Рік " + St3.yearOfBirth);
        System.out.println("Середня оцінка студента :" + average2);
        System.out.println("Студент :" + St3.name + " " + St3.secondName + " № " + St3.id + " Рік " + St3.yearOfBirth);
        System.out.println("Середня оцінка студента :" + average3);
    }
}
