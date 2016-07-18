package org.learn.Client;

import org.learn.Question.IsLeavesAtSameLevel;
import org.learn.Question.Node;

public class App 
{
    public static void main( String[] args )
    {  
       //root level 0
       Node A = Node.createNode(50);
       //Level 1
       Node B = Node.createNode(25);
       Node C = Node.createNode(75);
       //Level 2
       Node D = Node.createNode(10);
       Node E = Node.createNode(30);
       Node F = Node.createNode(60);
       Node G = Node.createNode(80);
       //Level 3
       Node H = Node.createNode(55);
       Node I = Node.createNode(65);
             
       //connect Level 0 and 1
       A.left = B;
       A.right = C;
       //connect level 1 and level 2
       B.left = D;
       B.right = E;
       C.left = F;
       C.right = G;
       
       boolean isLeafAtSameLevel = IsLeavesAtSameLevel.isLeavesAtSameLevel(A);      
       if(isLeafAtSameLevel) {
    	   System.out.println("1. Leaf nodes of binary tree are at same level");
       } else {
    	   System.out.println("1. Leaf nodes of binary tree are not at same level");
       }
       
       //Connect level 2 and level 3
       F.left = H;
       F.right = I; 
       isLeafAtSameLevel = IsLeavesAtSameLevel.isLeavesAtSameLevel(A);      
       if(isLeafAtSameLevel) {
    	   System.out.println("2. Leaf nodes of binary tree are at same level");
       } else {
    	   System.out.println("2. Leaf nodes of binary tree are not at same level");
       }
    }
}