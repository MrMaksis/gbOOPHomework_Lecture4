package ru.gb.oop.homework_4;

import ru.gb.oop.homework_4.controller.TeacherController;
import ru.gb.oop.homework_4.data.Teacher;
import ru.gb.oop.homework_4.data.TeacherGroup;
import ru.gb.oop.homework_4.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов", "Иван", 12379L);
        Teacher teacher2 = new Teacher("Комаров", "Андрей", 756485L);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        TeacherGroup teachers = new TeacherGroup("Информатика", teacherList);
        TeacherController teacherController = new TeacherController();
        teacherController.create("Иванов", "Иван", 12379L);
        teacherController.create("Комаров", "Андрей", 756485L);

        teacherController.printConsole(teacherList);
    }
}
