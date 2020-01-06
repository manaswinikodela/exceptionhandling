package Exceptionhandling.com;

public class NullPointer {
     private static String str;



		public static void main(String[] args) {

			try{

				str = null;

				System.out.println (str.length());

			}

		        catch(Exception e){

				System.out.println("NullPointerException..");

			}

		   }



		}




