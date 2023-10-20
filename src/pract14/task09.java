package pract14;
import java.util.HashMap;
import java.util.Map;

class LetterFrequencyCounter {
    public static void main(String[] args) {
        String text = "Этот текст предназначен для анализа частоты букв в русском алфавите.";

        Map<Character, Integer> frequencyMap = new HashMap<>();


        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Выводим результаты
        for (char letter : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(letter);
            System.out.println(letter + ": " + frequency);
        }
    }
}
