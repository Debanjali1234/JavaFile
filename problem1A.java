//Q-1> (Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.)

import java.util.*;

public class problem1A {

    public static int PROBLEMA(int nums[]) {
        // using loops :-
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return 1;
                }
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 8, 1, 7 };
        int result = PROBLEMA(nums);
        System.out.println(result);

    }
}
