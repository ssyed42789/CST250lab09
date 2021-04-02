
package cst250lab09;

import java.util.Stack;


public class CST250lab09 {

    
    public static void main(String[] args) {
        System.out.println(isBalanced("(2+4) * 8 + ((3-1) + 7)") );
        System.out.println(isBalanced("(2+4*7 + (3 -1) + 8 ") );
  
       
    }
    public static Boolean isBalanced(String expression){
        
        char[] exp = expression.toCharArray();
        Stack<Character> stack = new Stack();
        
        for(int i=0; i<exp.length; i++){
            if(exp[i] == '('){
                stack.push('(');
            }    
            if(exp[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        
            }
            if(stack.isEmpty()){
                return true;
            }
            return false;
        }
    }

        

    

        
    
    

        
    

