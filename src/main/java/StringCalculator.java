public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int val = Integer.parseInt(number.trim());
                if (val < 0){
                    throw new IllegalArgumentException("negatives not allowed.");
                }
                if (val > 1000) {
                    val = 0;
                }
                returnValue += val;
            }
        }
        return returnValue;
    }
}
