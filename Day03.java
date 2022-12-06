import java.util.*;
import java.io.*;

public class Day03 {

    public static void main(String[] args) {
        File file = new File("input03.txt");
        long score = 0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String rucksack = sc.nextLine();
                String rucksack1 = sc.nextLine();
                String rucksack2 = sc.nextLine();

                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < rucksack.length(); i++) {
                    set.add(rucksack.charAt(i));
                }
                HashSet<Character> set2 = new HashSet<>();
                for (int i = 0; i < rucksack1.length(); i++) {
                    if (set.contains(rucksack1.charAt(i))) {
                        set2.add(rucksack1.charAt(i));
                    }
                }

                for (int i = 0; i < rucksack2.length(); i++) {
                    if (set2.contains(rucksack2.charAt(i))) {
                        set2.remove(rucksack2.charAt(i));
                        if (rucksack2.charAt(i) >= 'a' && rucksack2.charAt(i) <= 'z') {
                            score += rucksack2.charAt(i) - 'a' + 1;
                        } else {
                            score += 26 + rucksack2.charAt(i) - 'A' + 1;
                        }
                    }
                }
                // Part I
                /*
                 * int dataLength = data.length();
                 * HashSet<Character> set = new HashSet<>();
                 * for (int i = 0; i < dataLength / 2; i++) {
                 * set.add(data.charAt(i));
                 * }
                 * 
                 * for (int i = dataLength / 2; i < dataLength; i++) {
                 * if (set.contains(data.charAt(i))) {
                 * set.remove(data.charAt(i));
                 * if (data.charAt(i) >= 'a' && data.charAt(i) <= 'z') {
                 * score += data.charAt(i) - 'a' + 1;
                 * } else {
                 * score += 26 + data.charAt(i) - 'A' + 1;
                 * }
                 * }
                 * }
                 */

                // Part II

            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(score);

    }
}
