import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String res="."+Integer.toString(year);
        if(year<1918){
            if(year%4==0) res="12.09"+res;
            else res="13.09"+res;
            return res;
        }
        else if(year==1918){
            res="26.09"+res;
            return res;
        }
        else{
            if(year%400==0||(year%4==0 && year%100!=0)) res="12.09"+res;
            else res="13.09"+res;
            return res;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}