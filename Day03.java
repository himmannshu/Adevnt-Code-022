import java.util.*;
import java.io.*;

public class Day03 {

    public static void main(String[] args) {
        File file = new File("input03.txt");
        try {
            Scanner sc = new Scanner(file);
            String data = sc.nextLine();
            int dataLength = data.length();
            HashSet<Character> set = new HashSet<>();

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
