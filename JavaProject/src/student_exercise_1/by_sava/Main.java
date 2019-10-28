package student_exercise_1.by_sava;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student(382, "Ivan", "Ivanov",
                2019, 11.0,
                9.5, 8.3);


        Student secondStudent = new Student(383, "Petro", "Petrov",
                2019, 8.5,
                10.0, 8.5);

        Student lastStudent = new Student(384, "David", "Davidov",
                2019, 11.5,
                7.0, 8.8);

        System.out.println("Студент :" + firstStudent.name + " " + firstStudent.secondName + " № " + firstStudent.id + " Рік " + firstStudent.yearOfBirth);
        System.out.println("Середня оцінка студента :" + firstStudent.getAvarageScors());
        System.out.println("Студент :" + secondStudent.name + " " + secondStudent.secondName + " № " + secondStudent.id + " Рік " + lastStudent.yearOfBirth);
        System.out.println("Середня оцінка студента :" + secondStudent.getAvarageScors());
        System.out.println("Студент :" + lastStudent.name + " " + lastStudent.secondName + " № " + lastStudent.id + " Рік " + lastStudent.yearOfBirth);
        System.out.println("Середня оцінка студента :" + lastStudent.getAvarageScors());
    }
}
