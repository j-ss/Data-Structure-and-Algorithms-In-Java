package com.tree;

import java.util.Stack;

public class ExpressionTreeFromPostFix {
   /* when an operand occur then push it into stack
    when an operator occur then pop two element from stack
    and assign right and left of current element and push again
    into stack.*/

   private static BinaryTree logic(char[] postfixEx){
       Stack<BinaryTree> stack = new Stack<>();
       for(int i=0;i<postfixEx.length;i++){
           if(isOperand(postfixEx[i])){
               BinaryTree node = new BinaryTree(postfixEx[i]);
               stack.push(node);
           }else{
               BinaryTree right=stack.pop(),left=stack.pop();
               BinaryTree node = new BinaryTree(postfixEx[i]);
               node.setRightChild(right);
               node.setLeftChild(left);
               stack.push(node);
           }
       }
       return stack.pop();
   }
   private static boolean isOperand(char c){
       if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) return true;
       else return false;
   }
}
