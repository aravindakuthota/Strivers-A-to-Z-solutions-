class Solution {
    public int myAtoi(String s) {

        // Remove spaces
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        int num = 0;
        int n = s.length();

        // Check sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // Overflow check BEFORE adding
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}
