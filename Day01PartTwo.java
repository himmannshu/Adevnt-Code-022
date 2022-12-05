import java.util.*;
import java.io.*;

// part of day 01 challenge
public class Day01PartTwo {
    private static long max1 = 0;
    private static long max2 = 0;
    private static long max = 0;
    private static long temp = 0;

    public static void main(String[] args) {
        File file = new File("input01.txt");

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                if (data.equals("")) {
                    maxThree(temp);
                    temp = 0;
                } else {
                    temp += Long.valueOf(data);
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        maxThree(temp);
        System.out.println(max + max1 + max2);
    }

    private static void maxThree(long val) {
        if (val >= max) {
            max2 = max1;
            max1 = max;
            max = val;
        } else if (val >= max1) {
            max2 = max1;
            max1 = val;
        } else if (val > max2) {
            max2 = val;
        }
    }

}