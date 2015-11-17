package com.codingthrough.hackerrank.practice.java.collections;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem Statement:
 * You are given a list of student information: ID, FirstName,
 * and CGPA. Your task is to rearrange them according to their
 * CGPA in decreasing order. If two student have the same CGPA,
 * then arrange them according to their first name in alphabetical
 * order. If those two students also have the same first name, then
 * order them according to their ID. No two students have the same ID.
 * <p>
 * Hint: You can use comparators to sort a list of objects. See the
 * oracle docs to learn about comparators.
 * <p>
 * Input Format:
 * The first line of input contains an integer N, representing the
 * total number of students. The next N lines contains a list of
 * student information in the following structure:
 * ID Name CGPA
 * <p>
 * Constraints:
 * 2?N?1000
 * 0?ID?100000
 * 5?|Name|?30
 * 0?CGPA?4.00
 * The name contains only lowercase English letters. The ID contains
 * only integer numbers without leading zeros. The CGPA will contain,
 * at most, 2 digits after the decimal point.
 * <p>
 * Output Format:
 * After rearranging the students according to the above rules, print
 * the first name of each student on a separate line.
 * <p>
 * Sample Input:
 * 5
 * 33 Rumpa 3.68
 * 85 Ashis 3.85
 * 56 Samiha 3.75
 * 19 Samara 3.75
 * 22 Fahim 3.76
 * <p>
 * Sample Output:
 * Ashis
 * Fahim
 * Samara
 * Samiha
 * Rumpa
 */
public class JavaSort {
    static class Student {
        int id;
        String name;
        double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students[i] = new Student(id, name, cgpa);
        }

        Arrays.sort(students, (a, b) -> {
            if (a.cgpa == b.cgpa) {
                if (a.name.equals(b.name)) {
                    return a.id <= b.id ? -1 : 1;
                }

                return a.name.compareTo(b.name);
            }

            return a.cgpa > b.cgpa ? -1 : 1;
        });

        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}
