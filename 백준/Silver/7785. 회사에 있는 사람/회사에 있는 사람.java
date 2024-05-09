import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        

        int nCount = 0;
        nCount = sc.nextInt();

        HashSet<String> hashSet = new HashSet<String>();

        for(int i = 0 ; i < nCount; i ++){
            String userName = sc.next();

            boolean isEnter = true;
            isEnter = sc.next().equals("enter") ? true : false;

            
            if(isEnter){
                hashSet.add(userName);
            }else{
                hashSet.remove(userName);
            }
		}

        ArrayList<String> list =  new ArrayList<String>(hashSet);
        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }



        sc.close();
    }
}   