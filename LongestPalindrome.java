
public class LongestPalindrome {
	    int st;
	    int l;
	    public String longestPalindrome(String s) {
	        int len=s.length();
	        if(len<2){
	            return s;
	        }
	        for(int i=0;i<len-1;i++){
	            range(s,i,i);
	            range(s,i,i+1);
	        }
	        return s.substring(st,st+l);
	        
	    }
	    private void range(String str,int begin,int end){
	        while(begin>=0 && end<str.length()&& str.charAt(begin)==str.charAt(end)){
	            begin--;
	            end++;
	        }
	        if(l<end-begin-1){
	            st=begin+1;
	            l=end-begin-1;
	        }
	    }
}
