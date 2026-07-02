import java.util.*;
public class Main{
    public static void main(String[] args){
        String str = "Hari Prasath";
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length();i++){
            for(j=i+1;j<ch.length();j++){
                if(ch[i] == ch[j]){
                    System.out.print("Duplicate charcters: ",ch[j]);
                    count++;
                }
            }
            System.out.print(count);
        }
    }
}
