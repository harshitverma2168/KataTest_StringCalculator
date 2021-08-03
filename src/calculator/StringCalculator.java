package calculator;

public class StringCalculator {
    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.indexOf(",") > -1){
            String[] nums = numbers.split(",");
            return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
        } else
        {
            return Integer.parseInt(numbers);
        }
    }
}
