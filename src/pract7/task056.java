package pract7;
interface StringManipulator {
    int countCharacters(String str);
    String getOddPositionCharacters(String str);
    String reverseString(String str);
}

class ProcessStrings implements StringManipulator {

    @Override
    public int countCharacters(String str) {
        return str.length();
    }

    @Override
    public String getOddPositionCharacters(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

class task056{
    public static void main(String[] args) {
        StringManipulator manipulator = new ProcessStrings();

        String inputString = "Hello, World!";
        System.out.println("Input String: " + inputString);

        int charCount = manipulator.countCharacters(inputString);
        System.out.println("Character count: " + charCount);

        String oddPositionChars = manipulator.getOddPositionCharacters(inputString);
        System.out.println("Characters at odd positions: " + oddPositionChars);

        String reversedString = manipulator.reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}