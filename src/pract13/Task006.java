package pract13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task006 {

    public static String getLine(List<String> words) {
        if (words.isEmpty()) {
            return "";
        }

        // Перебираем слова и пытаемся найти подходящее следующее слово
        for (String word : words) {
            if (word != null && !word.isEmpty()) {
                char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));
                List<String> remainingWords = new ArrayList<>(words);
                remainingWords.remove(word);

                String chain = getLine(remainingWords);
                if (chain != null && chain.toLowerCase().charAt(0) == lastChar) {
                    return word + (chain.isEmpty() ? "" : " " + chain);
                }
            }
        }

        return null;
    }

    public static void main(String[] args) throws IOException {
        // Чтение слов из файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите путь к файлу: ");
        String filePath = reader.readLine();
        reader.close();

        List<String> words = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] wordArray = line.split(" ");
            for (String word : wordArray) {
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
        }
        fileReader.close();

        // Построение цепочки слов
        String wordChain = getLine(words);
        System.out.println("Цепочка слов: " + wordChain);
    }
}
