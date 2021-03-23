package Lab_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFIles {
    public static void main(String[] args) {
        String fileName = "D:\\Programs\\IntelliJ\\Data Structures\\src\\Lab_1\\text3.txt";
        String delimiter = "; ";
        readFIle(fileName, delimiter);
    }

    public static void readFIle(String FileName, String delimiter){
        int numOfChars = 0;
        try {
            Scanner input = new Scanner(new FileInputStream(FileName));
            while (input.hasNextLine()) {
                String str = input.nextLine();
                String[] strArray = str.split(delimiter);
                printLine(strArray);
                numOfChars += countNumOfChars(strArray);
            }
            input.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        }
        System.out.println("Number of characters : " + numOfChars);
    }

    public static void printLine(String[] strArray) {
        for (String s : strArray) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static int countNumOfChars(String[] strArray) {
        int numOfChars = 0;
        for (int i = 0; i < strArray.length; i++) {
            numOfChars += strArray[i].length();
        }
        return numOfChars;
    }
}
