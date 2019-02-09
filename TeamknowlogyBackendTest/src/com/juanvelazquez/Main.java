package com.juanvelazquez;

import com.juanvelazquez.util.MenuUtil;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MenuUtil menu = new MenuUtil();
        System.out.println("Program has started.");
        menu.showMenu();
        boolean runProgram = new Scanner(System.in).nextInt() == 1;
        while (runProgram) {
            try {
                List<Integer> numbers = menu.fillNumbersList();
                int number = menu.fillObjectiveNumber();
                menu.findCombination(numbers, number);
                menu.showMenu();
                runProgram = new Scanner(System.in).nextInt() == 1;
            } catch (Exception ex) {
                System.out.println("An error occurred, please try again");
            }
        }
    }
}
