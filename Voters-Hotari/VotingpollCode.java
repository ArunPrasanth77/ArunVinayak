package objects;

import java.util.Scanner;
import java.lang.NumberFormatException;
public class Votingpoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Scanner read1 = new Scanner(System.in);
		Scanner read2 = new Scanner(System.in);
		Scanner read3 = new Scanner(System.in);
		System.out.println("Enter the First  Candidate Name:\n");
		String candidate1 = read.nextLine();
		System.out.println("Enter the Second Candidate Name:\n");
		String candidate2 = read1.nextLine();
		char s1 = candidate1.charAt(0);
		char s2 = candidate2.charAt(0);
		int v1 = s1;
		int v2 = s2;
	     System.out.println("Enter the total no of Voters:\n");
		int totalVoters = read2.nextInt();
		String Voting[] = new String[totalVoters] ;
		for(int i=0;i<totalVoters;i++)
		{
			System.out.println("Enter Your Vote");
			Voting[i] = read3.nextLine();
		}
		int votesForVoter1 = 0;
		int votesForVoter2 = 0;
		for(int j=0;j<Voting.length;j++)
		{
			if(Voting[j].equals(candidate1)) {
				votesForVoter1++;
			}else
			{
				votesForVoter2++;
			}
			
		}
	if(votesForVoter1 > votesForVoter2)
	{
		System.out.println("Winner is " +candidate1);
	} else if(votesForVoter1 < votesForVoter2)
	{
		System.out.println("Winner is " +candidate2);
	}else 
	{
		int x = Math.max(v1,v2);
	    char y = (char) x;
	    String z = String.valueOf(y);
	    if(z.equals(candidate1.substring(0,1))) {
	    	System.out.println("Winner is "+candidate1);
	    }else {
	    	System.out.println("Winner is "+candidate2);
	    }
	}
		read.close();
		read1.close();
                read2.close();
                read3.close();
}
}