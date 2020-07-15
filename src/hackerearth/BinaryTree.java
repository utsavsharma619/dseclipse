package hackerearth;

import java.util.Scanner;

class Node
{
    int data;
    Node left=null;
    Node right=null;
    Node(int x)
    {
        this.data=x;
    }
}

public class BinaryTree {
	static Node root = null;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
        int T = scan.nextInt();
        int X = scan.nextInt();
        Node temp = new Node(X);
        root = temp;
        for(int i=0;i<T-1;i++)
        {
            check();
        }
    }
    public static void check()
    {
    	String dir = scan.nextLine();
    	int number = scan.nextInt();
        Node temp = new Node(number);
        if(dir=="L")
    	{
    		root.left=temp;
    	}
    	else if(dir=="R")
    	{
    		root.right=temp;
    	}
    	else if(dir=="LL")
    	{
    		root.left.left=temp;
    	}
    	else if(dir=="LR")
    	{
    		root.left.right=temp;
    	}
    	else if(dir.equals("RR"))
    	{
    		root.right.right=temp;
    	}
    	else if(dir.equals("RL"))
    	{
    		root.right.left=temp;
    	}
        System.out.println(root.data);
	}
}