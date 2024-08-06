
class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String[] parts = str.split("\\.");

        // Check if there are exactly four parts
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            // Check if the part is a digit
            if (!isNumeric(part)) {
                return false;
            }

            // Convert the part to an integer
            int num;
            try {
                num = Integer.parseInt(part);
            } catch (NumberFormatException e) {
                return false;
            }

            // Check if the number falls within the valid range
            if (num < 0 || num > 255) {
                return false;
            }

            // Check for leading zeros
            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }
        }

        return true;
    }

    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
