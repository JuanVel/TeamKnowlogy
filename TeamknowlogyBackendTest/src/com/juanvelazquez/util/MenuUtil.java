package com.juanvelazquez.util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuUtil {

    public void showMenu() {
        System.out.println();
        System.out.println("Type the number of the option you want to execute: ");
        System.out.println("1 Find combination");
        System.out.println("2 Exit program");
    }

    public List<Integer> fillNumbersList() {
        System.out.println("Enter the array of numbers separated by comma, example: 1,3,5,7,9");
        return Arrays.stream(new Scanner(System.in).nextLine().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public int fillObjectiveNumber() {
        System.out.println("Enter the objective number: ");
        return new Scanner(System.in).nextInt();
    }

    public void findCombination(List<Integer> list, int number) {
        OperationsUtil operationsUtil = new OperationsUtil();
        List<Integer> result = operationsUtil.findCombination(list, number);
        System.out.println("RESULT: " + (result.isEmpty() ? "null" : "Found combination at indexes: " + result));
    }
}
