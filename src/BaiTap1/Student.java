/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Latitude 7420
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public void display_info(){
        System.out.println("Tên: " + name);
        System.out.println("Id: " + id);
        System.out.println("Age: " + age);
        System.out.println("Gpa: " + String.format("%.2f", gpa));
        System.out.println("===============");
    }
    public void nhapSV(Scanner sc){
        System.out.println("Tên sinh viên: ");
        this.name = sc.nextLine();
        System.out.println("Mã sinh viên: ");
        this.id = sc.nextLine();
        System.out.println("Tuổi sinh viên: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Gpa sinh viên: ");
        this.gpa = sc.nextDouble();
        sc.nextLine();
    }
}
