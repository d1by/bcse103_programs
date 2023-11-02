import java.io.*;
import java.util.*;
import java.util.Map.*;

public class prac_prg3 {
    static void getWords(String fname, Map<String, Integer> words) throws IOException{
        Scanner sc = new Scanner(new File(fname));
        
        while(sc.hasNext()){
            String word = sc.next();
            
            Integer count = words.get(word);

            if(count != null){
                count++;
            }
            else{
                count=1;
            }

            words.put(word, count);
        }

        sc.close();
    }

    static int maxWords(Map<String, Integer> words){
        int max = -1;

        for(Entry<String, Integer> word : words.entrySet()){
            if(word.getValue() > max){
                max = word.getValue();
            }
        }

        return max;
    }

    public static void main(String args[])throws IOException{
        Map<String, Integer> words = new HashMap<String, Integer>();

        getWords("test.txt", words);
        int max = maxWords(words);

        for(Entry<String, Integer> word : words.entrySet()){
            if(word.getValue() == max){
                System.out.println(word);
            }
        }
    }
}
