package ru.mirea.lab20;

import java.io.*;
import java.util.*;

public class Main {
    private static final String PATH = "WarAndPeace.txt";

    public static void topTenWord(File file) throws IOException {
        HashMap<String, Integer> data = new HashMap<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String[] array = scanner.nextLine().split(" ");
            for (String word : array){
                if (!word.contains("–") && !word.equals("")) {
                    if (data.containsKey(word)) {
                        int value = data.get(word);
                        data.put(word, value + 1);
                    } else {
                        data.put(word, 1);
                    }
                }
            }
        }
        List<Map.Entry<String, Integer>> words = new ArrayList<>(data.entrySet());
        words.sort((o1, o2) -> -o1.getValue().compareTo(o2.getValue()));
        List<Map.Entry<String, Integer>> top = words.subList(0, 9);
        for(Map.Entry<String, Integer> word : top){
            System.out.println(word.getKey() + " : " + word.getValue());
        }

    }

    public static void replaceFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        FileWriter fw = new FileWriter("result.txt");
        String str;
        while((str = br.readLine()) != null){
            fw.write(str.replaceAll("\\s+", "#").trim().concat("\n"));
        }
        br.close();
        fw.close();

    }
    public static void main(String[] args) throws IOException {
        File file = new File(PATH);
        topTenWord(file);
        replaceFile(file);
    }
}
