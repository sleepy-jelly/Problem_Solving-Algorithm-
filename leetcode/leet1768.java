public class leet1768 {

    // https://leetcode.com/problems/merge-strings-alternately 
    public static void main(String[] args) throws NullPointerException{

        leet1768 nData= new leet1768();
        System.out.println(nData.mergeAlternately("abc","pqr"));

    }
    private String mergeAlternately(String word1, String word2) {
        if(null==word1||null==word2){
            throw new NullPointerException();
        }
        final int wordLength = Math.min(word1.length(), word2.length());


        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < wordLength; ++i){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        word2.substring(wordLength);



        
          return sb.append(word1.substring(wordLength)).append(word2.substring(wordLength)).toString();
    
    }

}
