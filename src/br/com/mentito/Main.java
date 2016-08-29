package br.com.mentito;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static final String TESTS_PATH = System.getProperty("user.dir") + "/tests/";

    public static void main(String[] args)
    {
        try {
            Scanner scanner = new Scanner(new File(TESTS_PATH + "c05000")).useDelimiter("\n");;

            Frame frame = new Frame();
            boolean second = false;

            while (scanner.hasNext()) {
                String[] line = scanner.next().split(" ");

                try {
                    Rectangle rectangle = new Rectangle(
                            Integer.parseInt(line[0]),
                            Integer.parseInt(line[1]),
                            Integer.parseInt(line[2]),
                            Integer.parseInt(line[3])
                    );

                    frame.add(rectangle);
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }

            }

            frame.calculate();
            System.out.println(frame.amount());
            frame.getFirst().overlap(frame.getFirst());
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }


}
