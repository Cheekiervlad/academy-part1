package by.academy.tasks.collections.task9;

//9.Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
// Создать коллекцию, содержащую объекты класса Student. Написать метод, который удаляет студентов со средним
// баллом <3. Если средний балл>=3, студент переводится на следующий курс.
// Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
// А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.

import java.util.ArrayList;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Вася", 11201613, 3, 6.8));
        students.add(new Student("Петя", 11201613, 3, 2));
        students.add(new Student("Дима", 11201612, 2, 7.8));

        printStudents(students, 3);
        newCourses(students);
        printStudents(students, 4);

    }

    private static void newCourses(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageMark() < 3) {
                students.remove(student);
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}