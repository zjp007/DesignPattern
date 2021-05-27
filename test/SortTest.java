package com.zjp.DesignPattern.test;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

    public static void displayArray(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void displayArray(Integer[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void displayArray(Student[] student) {
        for (Student s : student) {
            System.out.println(s);
        }
    }

    public static void displayArray(Teacher[] student) {
        for (Teacher s : student) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        //ArraySortAsc();
        //ArraySortDesc();
        //ArraySortPOJO();
        ArraySortPOJO2();
    }

    private static void ArraySortAsc() {
        int[] arr = new int[]{43, 84, 3, 8, 4, 7, 3, 75, 82, 748, 35};

        System.out.println("排序前:");
        displayArray(arr);

        Arrays.sort(arr);

        System.out.println("排序后:");
        displayArray(arr);
    }

    private static void ArraySortDesc() {
        Integer[] arr = new Integer[]{43, 84, 3, 8, 4, 7, 3, 75, 82, 748, 35};

        System.out.println("排序前:");
        displayArray(arr);

        Arrays.sort(arr, new JX());

        System.out.println("排序后:");
        displayArray(arr);
    }

    private static void ArraySortPOJO() {
        Student[] s = new Student[5];
        s[0] = new Student("wwww", 20, 2.34);
        s[1] = new Student("kkkk", 2, 2.34);
        s[2] = new Student("pppp", 25, 3.34);
        s[3] = new Student("hhhh", 12, 4.34);
        s[4] = new Student("jjjj", 10, 5.34);

        System.out.println("排序前:");
        displayArray(s);

        Arrays.sort(s);

        System.out.println("排序后:");
        displayArray(s);
    }

    private static void ArraySortPOJO2() {
        Teacher[] s = new Teacher[5];
        s[0] = new Teacher("wwww", 20, 2.34);
        s[1] = new Teacher("kkkk", 2, 2.34);
        s[2] = new Teacher("pppp", 25, 3.34);
        s[3] = new Teacher("hhhh", 12, 4.34);
        s[4] = new Teacher("jjjj", 10, 5.34);

        System.out.println("排序前:");
        displayArray(s);

        //Arrays.sort(s, new SortByAge());
        Arrays.sort(s, new SortByHeight());

        System.out.println("排序后:");
        displayArray(s);
    }
}

class JX implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 <= o2)
            return 1;
        return -1;
    }
}

/*
 * 根据年龄进行非降序排序
 */
class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    // 根据年龄进行非降序排序
    public int compareTo(Student o) {
        if (this.age <= o.age) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age + " Height: " + height;
    }
}

class Teacher{
    private String name;
    private int age;
    private double height;

    public Teacher(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age + " Height: " + height;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }
}

class SortByAge implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        if(o1.getAge() <= o2.getAge())
            return -1;
        return 1;
    }
}

class SortByHeight implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        if(o1.getHeight() <= o2.getHeight())
            return 1;
        return -1;
    }
}