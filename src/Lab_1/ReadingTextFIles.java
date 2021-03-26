package Lab_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingTextFIles {
    public static void main(String[] args) {
        //text1.txt
        System.out.println("Text File 1 -------------------------------");
        String fileName1 = "D:\\Programs\\IntelliJ\\Data Structures\\src\\Lab_1\\text1.txt";
        String delimiter = ",";
        readFIle(fileName1, delimiter);
        System.out.println("--------------------------------------------------");

        //text2.txt
        System.out.println("Text File 2 -------------------------------");
        String fileName2 = "D:\\Programs\\IntelliJ\\Data Structures\\src\\Lab_1\\text2.txt";
        String delimiter2 = ", ";
        readFIle(fileName2, delimiter2);
        System.out.println("--------------------------------------------------");

        //text3.txt
        System.out.println("Text File 3 -------------------------------");
        String fileName3 = "D:\\Programs\\IntelliJ\\Data Structures\\src\\Lab_1\\text3.txt";
        String delimiter3 = "; ";
        readFIle(fileName3, delimiter3);
        System.out.println("--------------------------------------------------");

        //text4.txt
        System.out.println("Text File 4 -------------------------------");
        String fileName4 = "D:\\Programs\\IntelliJ\\Data Structures\\src\\Lab_1\\text4.txt";
        String regex = "(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)";
        readText4FIle(fileName4, regex);
        System.out.println("--------------------------------------------------");
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

    public static void readText4FIle(String FileName, String delimiter){
        int numOfChars = 0;
        try {
            Scanner input = new Scanner(new FileInputStream(FileName));
            while (input.hasNextLine()) {
                String str = input.nextLine();
                String[] tempStrArray = str.split(delimiter);
                String[] strArray = returnNewStrArray(tempStrArray);
                printLine(strArray);
                numOfChars += countNumOfChars(strArray);
            }
            input.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        }
        System.out.println("Number of characters : " + numOfChars);
    }

    public static String[] returnNewStrArray(String[] strArray) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            if (Character.isLetter(strArray[i].charAt(0))) {
                stringArrayList.add(strArray[i]);
            }
        }
        String[] returnArray = new String[stringArrayList.size()];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = stringArrayList.get(i);
        }
        return returnArray;
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
