package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Seminar3.domain.Student;
import Seminar3.domain.StudentGroup;
import Seminar3.domain.StudentSteam;

public class main {
  public static void main(String[] args) {
    Student student1 = new Student("Timur", 25);
    Student student2 = new Student("Kirill", 26);
    Student student3 = new Student("Andrey", 24);
    Student student4 = new Student("Olga", 23);
    Student student5 = new Student("Anastasiya", 20);
    Student student6 = new Student("Anna", 28);
    Student student7 = new Student("Elena", 42);
    Student student8 = new Student("Evneny", 29);
    Student student9 = new Student("Alex", 26);
    Student student10 = new Student("Bob", 30);

    List<Student> list1 = new ArrayList<>();
    list1.add(student1);
    list1.add(student2);
    list1.add(student3);
    List<Student> list2 = new ArrayList<>();
    list2.add(student4);
    list2.add(student5);
    list2.add(student6);
    list2.add(student7);
    List<Student> list3 = new ArrayList<>();
    list3.add(student8);
    list3.add(student9);
    list3.add(student10);

    StudentGroup group1 = new StudentGroup(list1, 1);
    StudentGroup group2 = new StudentGroup(list2, 2);
    StudentGroup group3 = new StudentGroup(list3, 3);

    System.out.println("Не отсортированный вывод групп");
    for (Student student : group1) {
      System.out.println(student);
    }
    System.out.println("-------");
    for (Student student : group2) {
      System.out.println(student);
    }
    System.out.println("Отсортированный вывод групп");

    Collections.sort(group1.getList());
    Collections.sort(group2.getList());
    // System.out.println("------");

    for (Student student : group1) {
      System.out.println(student);
    }
    System.out.println("-------");
    for (Student student : group2) {
      System.out.println(student);
    }

    List<StudentGroup> steam = new ArrayList<>();
    steam.add(group1);
    steam.add(group2);
    steam.add(group3);
    System.out.println("Не отсортированный вывод потока");

    for (StudentGroup studentgroup : steam) {
      System.out.println(studentgroup);
    }

    System.out.println("Отсортированный вывод потока");
    Collections.sort(steam);
    for (StudentGroup studentgroup : steam) {
      System.out.println(studentgroup);
    }

    System.out.println("-------");
    System.out.println(steam);

  }
}
