import java.util.*;
import java.io.*;

public class Day01 {

    public static void main(String[] args) {
        File file = new File("input01.txt");
        long ans = 0;
        long temp = 0;
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                if (data.equals("")) {
                    ans = Math.max(temp, ans);
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
        ans = Math.max(temp, ans);
        System.out.println(ans);

    }

}