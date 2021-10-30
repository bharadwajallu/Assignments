import java.util.*;
public class student
{
	public static void main(String args[])
	{
		int s1[]={44,55,66};
		int s2[]={54,88,68};
		int s3[]={48,54,83};

		int eachstudentTotal[]=new int[3];
		int subStudentAve[]=new int[3];
		int eachSubjectAvg[]=new int[3];

		eachstudentTotal[0]=s1[0]+s1[1]+s1[2];
		eachstudentTotal[1]=s2[0]+s2[1]+s2[2];
		eachstudentTotal[2]=s3[0]+s3[1]+s3[2];

		subStudentAve[0]=eachstudentTotal[0]/3;
		subStudentAve[1]=eachstudentTotal[1]/3;
		subStudentAve[2]=eachstudentTotal[2]/3;

		eachSubjectAvg[0]=(s1[0]+s2[0]+s3[0])/3;
		eachSubjectAvg[0]=(s1[1]+s2[1]+s3[1])/3;
		eachSubjectAvg[0]=(s1[2]+s2[2]+s3[2])/3;

		for(int i=0;i<3;i++)
		{
			System.out.println();
			System.out.println("Student "+(i+1)+" :");
			System.out.println("Total :"+eachstudentTotal[i]);
			System.out.println("Average :"+subStudentAve[i]);
			for(int j=0;j<3;j++)
			{
				System.out.println("Subject "+ (j+1) +" mark : " + s1[j] + "Subject" + (i+1) + "Average :"+eachSubjectAvg[i]);
			}
		}
	}
}
					