import java.util.*;
import java.io.*;

public class Day02 {

    public static void main(String[] args) {
        /* Part I */
        HashMap<String, String> winMap = new HashMap<>();

        winMap.put("A", "Y");
        winMap.put("B", "Z");
        winMap.put("C", "X");

        HashMap<String, String> map = new HashMap<>();

        map.put("A", "X");
        map.put("B", "Y");
        map.put("C", "Z");

        HashMap<String, Long> scores = new HashMap<>();

        scores.put("X", 1l);
        scores.put("Y", 2l);
        scores.put("Z", 3l);

        long finalScore = 0;

        long partTwoScore = 0;

        // draw = 3, win = 6, 0 = lost
        File file = new File("input02.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {

                // Part I
                // X, A Rock
                // Y, B Paper
                // Z, C Scissor

                String game = sc.nextLine();
                String[] playerInputs = game.split(" ");

                if (winMap.get(playerInputs[0]).equals(playerInputs[1])) {
                    finalScore += 6;
                } else if (map.get(playerInputs[0]).equals(playerInputs[1])) {
                    finalScore += 3;
                }
                finalScore += scores.get(playerInputs[1]);

                // Part II
                // X : lose
                // Y: draw
                // Z: win

                if (playerInputs[1].equals("X")) {
                    if (playerInputs[0].equals("A")) {
                        partTwoScore += 3;
                    } else if (playerInputs[0].equals("B")) {
                        partTwoScore += 1;
                    } else {
                        partTwoScore += 2;
                    }
                } else if (playerInputs[1].equals("Z")) {
                    partTwoScore += 6 + scores.get(winMap.get(playerInputs[0]));
                } else {
                    partTwoScore += 3 + scores.get(map.get(playerInputs[0]));
                }

            }

            sc.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Part I Score: " + finalScore);
        System.out.println("Part II Score: " + partTwoScore);
    }

}
