package interviewQ;

public class longestString {

    public static void main(String[] args) {
        
        String s = "ABCABCDEFGHIJKABCDEFGHIJ";
        String res="";
        String ans="";
        char container = 64;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>container){
                res+=""+s.charAt(i);
                container=s.charAt(i);
            }
            else if(res.length()>ans.length()){
                container=64;
                ans=res;
                res=""+s.charAt(i);
            }
            if(res.length()>ans.length() && i==s.length()-1) ans=res;

        }

        System.out.println(ans);
    }
    
}
