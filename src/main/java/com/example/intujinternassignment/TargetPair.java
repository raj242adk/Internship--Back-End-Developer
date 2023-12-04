package com.example.intujinternassignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TargetPair {

    public static void findPair(int[] nums, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                // Pair found
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return;
            }

            seenNumbers.add(num);
        }

        // If no pair is found
        System.out.println("Pair not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        findPair(nums, target);

        scanner.close();
    }
}
