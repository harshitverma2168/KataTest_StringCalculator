package calculator;

import java.util.regex.Pattern;

public class StringCalculator {
    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String[] nums = splitNumbers(numbers);
            int sum = 0;

            for (String num : nums) {
                sum += Integer.parseInt(num);
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
