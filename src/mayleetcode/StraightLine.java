package mayleetcode;

public class StraightLine {

	public static void main(String[] args) {
		int[][] coordinates = {{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
		int i=0;
        boolean ans=true;
        float set=(float)(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);
        float m=(float)set;
        while(i<coordinates.length-1)
        {
        	m=(float)(coordinates[i+1][1]-coordinates[i][1])/(coordinates[i+1][0]-coordinates[i][0]);
            i++;
            System.out.println(set);
            if(set!=m)
            {
            	ans=false;
            	break;
            }
        }
        System.out.println(ans);
	}

}
