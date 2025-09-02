// Detect and remove consecutive duplicate characters (e.g., "aabbcc" → "abc").
public class q28{

    public static String removeConsecutiveDuplicates(String input) {
        if (input == null || input.length() <= 1) return input;

        StringBuilder result = new StringBuilder();
        char previousChar = input.charAt(0);
        result.append(previousChar);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != previousChar) {
                result.append(currentChar);
                previousChar = currentChar;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aabbccddeeeffggh";
        String output = removeConsecutiveDuplicates(input);
        System.out.println("Cleaned string: " + output);
    }
}
