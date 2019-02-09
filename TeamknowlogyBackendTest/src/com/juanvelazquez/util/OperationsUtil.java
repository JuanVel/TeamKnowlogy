package com.juanvelazquez.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OperationsUtil {

    public List<Integer> findCombination(List<Integer> list, int number) {
        Collections.sort(list);
        System.out.println("Ordered list " + list);
        System.out.println("Objective number " + number);

        for (int firstIndex = 0; firstIndex < list.size(); firstIndex++) {
            int firstNumber = list.get(firstIndex);

            for (int secondIndex = 0; secondIndex < list.size(); secondIndex++) {
                int secondNumber = list.get(secondIndex);
                if (firstNumber == secondNumber) continue;

                for (int thirdIndex = 0; thirdIndex < list.size(); thirdIndex++) {
                    int thirdNumber = list.get(thirdIndex);
                    if (firstNumber == thirdNumber || secondNumber == thirdNumber) continue;

                    if (firstNumber + secondNumber - thirdNumber == number) {
                        printOperationNumbers(Arrays.asList(firstNumber, secondNumber, thirdNumber), number);
                        return Arrays.asList(firstIndex, secondIndex, thirdIndex);
                    }
                }
            }
        }

        return Collections.emptyList();
    }

    private void printOperationNumbers(List<Integer> numbers, int result) {
        System.out.println("Operation: " + numbers.get(0) + " + " + numbers.get(1) + " - " + numbers.get(2) + " = " + result);
        System.out.println("Found combination numbers: " + numbers);
    }
}
