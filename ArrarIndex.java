package Exceptionhandling.com;

public class ArrarIndex {
	public static void main(String[] args) {

		 try{

		        int a[]=new int[6];

		        a[10] = 9;

		      }

		      catch(ArrayIndexOutOfBoundsException e){

		         System.out.println ("ArrayIndexOutOfBounds");

		      }



	}
}
