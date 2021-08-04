package calculator;
import java.util.ArrayList;

public class StringCalculator {
    public static int count = 0;

    public static int Add(String numbers) {
        ++count;
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String[] nums = splitNumbers(numbers);
            validateNegativeNumbers(nums);

            int sum = 0;
            for (String num : nums) {
                int x = Integer.parseInt(num);
                if (x > 1000) {
                    continue;
                }
                sum += x;
            }
            return sum;
        }
    }

    private static void validateNegativeNumbers(String[] nums) {
        ArrayList<Integer> negatives = new ArrayList<>();
        for (String num : nums) {
            int el = Integer.parseInt(num);
            if (el < 0) {
                negatives.add(el);
            }
        }
        if (negatives.size() == 1) {
            throw new RuntimeException("Negatives are not allowed");
        } else if (negatives.size() > 1) {
            throw new RuntimeException("Negatives are not allowed: " + negatives);
        }
    }

    private static String[] splitNumbers(String numbers) {
        String numberString = numbers;
        String delimiter = ",|\n";
        if (numberString.startsWith("//")) {
            delimiter = numberString.substring(2, numberString.indexOf("\n"));
            numberString = numberString.substring(numberString.indexOf("\n") + 1);
        }
        String[] nums = numberString.split(delimiter);
        return nums;
    }


    public int GetCalledCount() {
        return count;
    }

}
