//hackerrank problem
import java.util.*;
public class JavaStack {
	public static void main(String []args)
		{
	        Scanner sc=new Scanner(System.in);
	        while(sc.hasNextLine()){
	            String s=sc.nextLine();
	            boolean b=balanced(s);
	            System.out.println(b);
	        }
			
		}
	    public static boolean balanced(String s){
	        Stack<Character> st=new Stack<>();
	        for(char c:s.toCharArray()){
	            if(c=='('|| c=='[' || c=='{'){
	                st.push(c);
	            }
	            else if(c==')' || c==']' ||c=='}'){
	                if(st.isEmpty()){
	                    return false;
	                }
	                char topElement=st.pop();
	                if(!((c==')'&& topElement=='(') || (c==']'&& topElement=='[') ||(c=='}' && topElement=='{'))){
	                    return false;
	                }
	                
	            }
	        }
	        return st.isEmpty();
	    }
	}


