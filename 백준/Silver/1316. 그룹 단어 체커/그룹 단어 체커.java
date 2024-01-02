import java.util.*;
public class Main {
static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        int cnt = 0;
        int nData = sc.nextInt();

        for(int i=0; i<nData;i++){
            if(check()==true){
                cnt++;
            }
        }
        System.out.println(cnt);

        }
    public static boolean check(){
       boolean[] check = new boolean[26];
       int previous = 0;
       String nStr = sc.next();

       for(int i = 0; i<nStr.length(); i++){
           int now = nStr.charAt(i);

           if(previous !=now){
            if(!check[now - 'a']){
                check[now-'a']= true;
                previous=now;
            }
            else{
                return false;
            }
           }

        else{
            continue;
           }
       }
    return true;

    }





}