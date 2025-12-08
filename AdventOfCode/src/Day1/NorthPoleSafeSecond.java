package Day1;

import java.io.*;
import java.util.*;

public class NorthPoleSafeSecond {

    public static void main(String[] args) {
        List<String> rotations = new ArrayList<>();


        try (InputStream is = NorthPoleSafe.class.getResourceAsStream("input.txt")) {
            if (is == null) {
                System.out.println("File not found in package Day1!");
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                rotations.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        int dial = 50;
        int zeroCount = 0;

        for (String rotation : rotations) {
            char direction = rotation.charAt(0);
            int steps = Integer.parseInt(rotation.substring(1));


            for (int i = 0; i < steps; i++) {
                if (direction == 'L') {
                    dial = (dial - 1 + 100) % 100;
                } else {
                    dial = (dial + 1) % 100;
                }

                if (dial == 0) {
                    zeroCount++;
                }
            }
        }

        System.out.println("The password (method 0x434C49434B) is: " + zeroCount);
    }
}

