package midterm2018;

import com.google.gson.*;
import java.util.*;

public class Main {
     static void countWords(final String text) {
        // used https://stackoverflow.com/questions/22981210/counting-unique-words-in-a-string-without-using-an-array
        Scanner read = new Scanner(text);
        Set<String> uniqueWords = new HashSet<String>();

        while (read.hasNext()) {
            uniqueWords.add(read.next());
        }
        read.close();
        System.out.println("Question 4: " + uniqueWords.size());
        uniqueWords.remove("the");
    }

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
            + "Host: localhost:1298\n"
            + "Connection: keep-alive\n"
            + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
            + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
            + "Referer: http://localhost:1298/\n"
            + "Accept-Encoding: gzip, deflate, br\n"
            + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
            + "    \"task\" : \"inc\",\n"
            + "    \"num\" : 3\n"
            + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        System.out.println(question1and2);
        System.out.println(question3);
        System.out.println(question4and5);

        // print each answer at the end

        // Question 1
        // Return the Host
        String[] parts = question1and2.split("\n");
        String q1 = parts[1];
        String[] q = q1.split(": ");
        String host = q[1];
        System.out.println("\nQuestion 1: " + host);

        // Question 2
        // return sum of a and b
        String[] q2 = parts[0].split(" ");
        String[] q21 = q2[1].split("\\?");
        String[] param = q21[1].split("&");
        String aaa[] = param[0].split("=");
        String bbb[] = param[1].split("=");
        int aResult = Integer.parseInt(aaa[1]);
        int bResult = Integer.parseInt(bbb[1]);
        int sum = aResult + bResult;
        System.out.println("Question 2: " + sum);

        // Question 3
        // convert to java object, increment num, convert back to json and return
        Gson gson = new Gson();
        Question3 obj = gson.fromJson(question3, Question3.class);
        obj.incrementNum();
        String jsonString = gson.toJson(obj);
        System.out.println("Question 3: " + jsonString);

        // Question 4
        // return unique words
        countWords(question4and5);

        // Question 5
        // return 2nd most common word
        // unset (get rid of) a key
        System.out.println("Question 5: ");

    }
}
