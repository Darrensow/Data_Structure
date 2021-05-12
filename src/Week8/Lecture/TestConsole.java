package Week8.Lecture;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class TestConsole {
    public static void main(String[] args) {
        String filePath = "D:\\Programs\\IntelliJ\\Data Structures\\src\\Week8\\Lecture\\a.html";
        System.out.println(isHTMLMatched(readHTMLFile(filePath)));
    }

    public static String readHTMLFile(String filePath) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            while ((str = in.readLine()) != null) {
                sb.append(str);
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found");
        } catch (IOException e ) {
            System.out.println("Problem with reading from the file");
        }
        return sb.toString();
    }

    public static boolean isHTMLMatched(String html) {
        Stack<String> buffer = new Stack<>( );
        int j = html.indexOf('<');                      // find first ’<’ character (if any)
        while (j != -1) {                               // if there is no '<' to be found
            int k = html.indexOf('>', j+1); // find next ’>’ character
            if (k == -1)
                return false;                           // if no '>' tag is found
            String tag = html.substring(j+1, k);        // retains the string within the < >
            if (!tag.startsWith("/"))                   // this is an opening tag
                buffer.push(tag);
            else {                                      // this is a closing tag
                if (buffer.isEmpty( ))
                    return false;                       // no tag to match
                if (!tag.substring(1).equals(buffer.pop( )))
                    return false;                       // mismatched tag (substring(1) discard the '/'
            }
            j = html.indexOf('<', k+1);     // find next ’<’ character (if any)
        }
        return buffer.isEmpty( );                       // were all opening tags matched?}
    }
}
