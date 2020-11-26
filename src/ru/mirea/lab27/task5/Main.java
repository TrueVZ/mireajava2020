package ru.mirea.lab27.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static boolean solution(String current, ArrayList<String> wordsList, StringBuilder result){
        if (wordsList.size() == 1){
            result.append(current);
            return true;
        }
        wordsList.remove(current);
        for (String next : wordsList){
            if (next.toLowerCase().substring(0, 1).equals(current.toLowerCase().substring(current.length() - 1))){
                if (solution(next, wordsList, result)){
                    result.insert(0, current + " ");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        String path = "/Users/valyazaikin/IdeaProjects/mirea/test.txt";
        String content = new String(Files.readAllBytes(Paths.get(path)));
        String[] words = content.split(" ");
        StringBuilder result = new StringBuilder();
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        for(String word : words){
            if (solution(word, wordsList, result))
                break;
        }
        System.out.println(result.toString());
    }
}
