package mayleetcode;

public class Complement {

	public static void main(String[] args) {
		int n=13;
        int k=1,j=0;
        while(k<=n)
        {
        	k=k*2;
        	j++;
        }
        int[] arr = new int[j];
        for(int i=j-1;i>=0;i--)
        {
        	arr[i] = (int) Math.pow(2,i);
        }
        int sm=0;
        int diff=0;
        int[] mai = new int[j];
        
        for(int i=j-1;i>=0;i--)
        {
        	diff = n - sm;
        	if(diff>=arr[i])
        	{
        		sm = sm + arr[i];
        		mai[i] = 1;
        	}
        	else if(diff<arr[i])
        	{
        		mai[i] = 0;
        	}
        	if(sm == n)
        	{
        		break;
        	}
        }
        for(int i=j-1;i>=0;i--)
        {
        	if(mai[i]==1)
        	{
        		mai[i]=0;
        	}
        	else if(mai[i]==0)
        	{
        		mai[i]=1;
        	}
        }
        int z=mai.length-1;
        while(z>-1 && mai[z]!=1)
        {
        	z--;
        }
        int s = 0;
        for(int x=z;x>=0;x--)
        {
        	s=s+(int)Math.pow(2,x);
        }
        if(n%2==1)
        {
        	s = s-1;
        }
        System.out.println(s);
	}
}