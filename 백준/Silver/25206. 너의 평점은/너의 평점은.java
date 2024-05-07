import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalSubjectCnt = 20;                                       //default value 20. 

        double result = 0.0;                                            // value for final calculate
        double creditSum = 0.0;                                         // value for final calculate

        Map<String, Double> gradeMap = new HashMap<String, Double>();   //make new HashMap that contains Grade and Score
        initMap(gradeMap);

        
        for(int i=0; i<totalSubjectCnt; i++){                           //normally subject count is 20

            double credit = 0;
            double grade = 0;

            String[] strArr = br.readLine().split(" ");
            credit += Double.parseDouble(strArr[1]);

            if(gradeMap.containsKey(strArr[2])){
                grade +=  gradeMap.get(strArr[2]);
            }
            else if(strArr[2].equals("P")){                    //if grade equals to pass (P) not gonna claculate
                grade += 0;
				credit = 0;

            }else{
                System.out.println("strArr[2]=>" + strArr[2]);                                                // for debug
                throw new RuntimeException("idk maybe input changed or something maybe i wrong");     //  lol
            }

            creditSum += credit;
            result += credit * grade;

        }
        br.close();
        System.out.println(result/creditSum);

    }


    private static void initMap(Map<String, Double> gradeMap) {
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);

        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);

        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);

        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);

        gradeMap.put("F", 0.0);
    }

}