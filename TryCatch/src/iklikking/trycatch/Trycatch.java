package iklikking.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch 
{
	public static void main(String[] args)
	{
		int licznik, mianownik;
		Scanner skaner;
		skaner = new Scanner(System.in); 
		try 
		{
			System.out.println("Wprowadz licznik\n");
			licznik = skaner.nextInt() ; 
			System.out.println("Wprowadz mianownik\n");
			mianownik = skaner.nextInt() ;
			System.out.println("Wynik dzialania:" + licznik + " / " + mianownik + " = "
			+ licznik/mianownik);
		} 
		catch (InputMismatchException ime) 
		{
			// TODO Auto-generated catch block
			//ime.printStackTrace();
			System.err.println("Zle Dane Wejsciowe:(");
		} 
		catch (ArithmeticException ae) 
		{
			// TODO Auto-generated catch block
			//ae.printStackTrace();
			System.err.println("Dzielenie przez zero :(");
		} 
		
		skaner.close();
	}
}
