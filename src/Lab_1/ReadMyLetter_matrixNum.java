package Lab_1;

import java.io.*;
import java.util.Scanner;

public class ReadMyLetter_matrixNum {
    public static void main(String[] args) {
        String fileName = "D:\\Programs\\IntelliJ\\Data Structures\\src\\Lab_1\\Darren_U2005252.txt";
        readLetter(fileName);
        clearScreen();
        appendLetter(fileName);
        clearScreen();
        readLetter(fileName);
    }

    public static void clearScreen(){
        System.out.println("_________________________________________________________________________");
        System.out.println();
    }

    public static void readLetter(String FileName){
        try {
            Scanner input = new Scanner(new FileInputStream(FileName));
            while (input.hasNextLine()) {
                String str = input.nextLine();
                System.out.println(str);
            }

            input.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        }
    }

    public static void appendLetter(String FileName){
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream(FileName, true));
            output.println();
            output.println();
            output.println("Thursday, 18 June 2021.");
            output.println(readInput());
            output.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    //This is the text to be appended
    /**
     * It’s me again. Finally, it’s the end of the term and the DS class has finished! I think I did well in this course. I was happy with my performance on this course and I throughly enjoyed programming. DS has taught me that there will always be a more efficient structure to handling a particular problem. I'm not sure my target grade is changed or not as the results are not released yet. But I'm feeling confident that I will score. I did well communicating with my group members on the group assignment and I was particularly happy with that. The thing is, I'm not sure what I can do better. If I were to pinpoint something, I would say I would be happier if I could study harder about DS. But as they said, 'Time is a luxury not many can enjoy'.
     * @return String to be appended
     */
    public static String readInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please continue you letter as of 18 June 2021");
        System.out.print("Input: ");
        String str = input.nextLine();
        return str;
    }
}
