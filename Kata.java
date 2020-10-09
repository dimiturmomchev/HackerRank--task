public class Kata {
    public static long nextBiggerNumber(long n) {

        String input = String.valueOf(n);

        Long token = null;

        if (input.length() == 1) {
            token = Long.valueOf(-1);
        } else {
            String result = input;
            String result2 = input;
            char digit1 = input.charAt(input.length() - 1);
            char digit2 = input.charAt(input.length() - 2);

            result = String.valueOf(digit1) + String.valueOf(digit2);
            result2 = String.valueOf(digit2) + String.valueOf(digit1);

            if (Integer.parseInt(result) <= Integer.parseInt(result2)) {
                token = Long.valueOf(-1);
            } else {
                token = Long.parseLong(input.replace(result2, result));
            }
        }

        return token;
    }

}
