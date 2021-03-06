package com.codingthrough.hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * Your teacher has given you the task of drawing a staircase
 * structure. Being an expert programmer, you decided to make
 * a program to draw it for you instead. Given the required height,
 * can you print a staircase as shown in the example?
 * <p>
 * Input:
 * You are given an integer N depicting the height of the staircase.
 * <p>
 * Output:
 * Print a staircase of height N that consists of # symbols and spaces.
 * For example for N=6, here's a staircase of that height:
 * <p>
 * _____#
 * ____##
 * ___###
 * __####
 * _#####
 * ######
 * Note: The last line has 0 spaces before it.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.println(String.format(String.format("%%%ds%%0%dd", n - i - 1, i + 1), " ", 0).replace("0", "#"));
        }

        System.out.println(String.format(String.format("%%%ds", n), " ").replace(" ", "#"));
    }
}
