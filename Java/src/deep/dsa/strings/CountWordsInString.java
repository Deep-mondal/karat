package deep.dsa.strings;

import java.util.StringTokenizer;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "Java is very powerful";
        StringTokenizer s=new StringTokenizer(str);
        int c=0;
        while(s.hasMoreTokens()){
            s.nextToken();
            c++;
        }
        System.out.println(c);
    }
}
