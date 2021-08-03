package calculator;

import java.util.ArrayList;

import static java.lang.String.join;

public class StringCalculator {
    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String[] nums = splitNumbers(numbers);
            ArrayList<Integer> negatives = new ArrayList<>();

            for (String num : nums) {
                int el  = Integer.parseInt(num);
                if (el < 0){
                    negatives.add(el);
                }
            }
            if(negatives.size() == 1){
                throw new RuntimeException("Negatives are not allowed");
            } else if(negatives.size() > 1){
                throw new RuntimeException("Negatives are not allowed: " + negatives);
            }

            int sum = 0;
            for (String num : nums) {
                int x =  Integer.parseInt(num);
                sum += x;
            }
            return sum;
        }
    }

    private static String[] splitNumbers(String numbers) {
        String numberString = numbers;
        String delimiter = ",|\n";
        if (numberString.startsWith("//")) {
            delimiter = numberString.substring(2, 3);
            numberString = numberString.substring(4);
        }
        String[] nums = numberString.split(delimiter);
        return nums;
    }
}
