package calculator;

public class StringCalculator {
    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.indexOf(",") > -1) {
            String[] nums = numbers.split(",");
            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }
            return sum;
        } else {
            return Integer.parseInt(numbers);
        }
    }
}
