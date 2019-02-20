import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;





public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sabela = new Scanner(System.in);

		System.out.println("Enter the current base ");
			int oldBase = sabela.nextInt();
		
				System.out.println("Enter the desired base ");
					int newBase = sabela.nextInt();
		
							System.out.println("Enter a number ");
									Scanner sabelas = new Scanner(System.in);
											String value = sabelas.nextLine();
		
													BaseConverter zzrot = new BaseConverter();
															String bar = zzrot.convertBase(oldBase, newBase, value);

System.out.println("You entered the number " + value + ", converting from " + oldBase + " to new base " + newBase+ " to get a final value of " + bar);
		
											}
						}
