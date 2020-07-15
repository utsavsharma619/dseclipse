package mayleetcode;

public class TownJudge {
	public static void main(String[] args) {		
		int[][] arr = {{1,1}};
		System.out.println(findJudge(1,arr));
	}

	public static int findJudge(int N, int[][] trust) {
        int i,j,man=0,count=0,main=0,ans=0;
        for(i=1;i<=N;i++)
        {
            man=0;
            for(j=0;j<trust.length;j++)
            {
                if(trust[j][0]!=i)
                {
                    man++;
                }
                if(man==trust.length)
                {
                    main=i;
                    break;
                }
            }
        }
        for(int kr=0;kr<trust.length;kr++)
        {
            if(trust[kr][1]==main)
            {
                count++;
            }
        }
        if(count==N-1)
        {
            ans=main;
        }
        else if(N==1)
        {
            ans=1;
        }
        else
        {
            ans=-1;
        }
        return ans;
    }
}