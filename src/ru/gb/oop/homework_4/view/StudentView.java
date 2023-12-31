package ru.gb.oop.homework_4.view;

import ru.gb.oop.homework_4.data.Student;

import java.util.List;

public class StudentView implements UserViewInterface<Student> {
    @Override
    public void sendOnConsole(List<Student> listT){
        System.out.println("Spisok studentov");
        for (Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}
