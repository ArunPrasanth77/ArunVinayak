package permutationOfNo;

public class Permutation {
		public static void main(String[] args) {
			 
			   permute("123");
		        } 
		public static void permute(String full) {
			permute("",full);
		}
		private static void permute(String prefix,String remaining) {
			if(remaining.length() ==0) {
				System.out.println(prefix);
				int k = Integer.parseInt(prefix);
				
				if(k%8 ==0) {
				System.out.println("It is divisible by 8");
				}
				else {
					System.out.println("It is not Divisible by 8");
				}
			}
			for(int i=0;i<remaining.length();i++) {
				permute(prefix + remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1,remaining.length()));
			}
		}
		
	}

