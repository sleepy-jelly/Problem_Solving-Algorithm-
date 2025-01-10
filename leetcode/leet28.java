public class leet28 {

    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    public static void main(String[] args) {
        leet28 nData= new leet28();
        System.out.println(nData.strStr("sadbutsad", "sad"));
    }
    
    public int strStr(String haystack, String needle) {
        int answer = haystack.indexOf(needle);
        return answer;
    }
}
