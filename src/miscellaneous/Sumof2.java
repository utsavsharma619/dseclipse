package miscellaneous;

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
public class Sumof2 {
	public static void main(String[] args) {
		Node root = new Node(0);
		System.out.println(maxDepth(root));
	}
	public static int maxDepth(Node root)
	{
        int a1=0;
        int a2=0;
        if(root==null)
        {
            return 0;
        }
        Node p = root;
        Node q = root;
        while(p!=null)
        {
            a1++;
            p=p.left;
        }
        while(q!=null)
        {
            a2++;
            q=q.right;
        }
        return a1>a2?a1:a2;
    }
}
