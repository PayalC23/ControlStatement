package ControlStatement;

public class Main {

	public static void main(String[] args) {
		
				int d = 11;//It is a variable with value
			
				/*Unary Operator*/
				//Printing the variable d 
				System.out.println("Print Unary Operation :");
				System.out.println("**************");
				System.out.println("Value of Post-Inc :"+ d++);//11 (12)use value at the time of computing then change value 
				System.out.println("Value of Pre-Inc :"+ ++d);//13 (13)change value at the time of computing then use value 
				System.out.println("Value of Pre-Dec :"+ --d);// 12 (12)change value at the time of computing then assign value
				System.out.println("Value of Post-Dec :"+ d--);//12 (11)assign value at the time of computing then change value
				System.out.println("============================");
				
				/* Arithmetic Operator*/
				
				int a = 4;int b = 2;//It is a variable with value
				
				//Printing the variable a and d
				System.out.println("Print Arithmetic Operation :");
				System.out.println("**************");
				System.out.println(a+b);
				System.out.println(a-b);
				System.out.println(a*b);
				System.out.println(a/b);
				System.out.println(a%b);
				System.out.println("==============================");
				
				/*SHift Operator Left And Right Shift
				 * 1.Left shift << is used to shift all of the bits in a value to the left side of a specified number of times. 
				 * 2.Right shift operator >> is used to move the value of the left operand to right by the number of bits 
				 * specified by the right operand.
				 */
				
				//Printing the variable a and d 
				System.out.println("Print Left Shift Operation :");
				System.out.println("**************");
				System.out.println(a<<b);//Left Shift -4 * 2^2 = 4*4 =16
				System.out.println(10<<3);//Left Shift - 10* 2^3= 10*8 = 80
				System.out.println("Print Right Shift Operation :");
				System.out.println("**************");
				System.out.println(a>>b);//Right SHift- 4/2^2=4/4=1
				System.out.println(10>>3);//Right Shift- 10/2^3=10/8=1
				System.out.println(-10>>>2);
				System.out.println("==============================");
				
				 /* 
				  * Logical AND, Bitwise Operators
				  * 1.The logical && operator doesn't check the second condition if the first condition is false. 
				  * It checks the second condition only if the first one is true.
				  * 2.The bitwise & operator always checks both conditions whether first condition is true or false.

				  */
				//a=4,b=2,d=11
				System.out.println("Print Logical And ,Bitwise Operation :");
				System.out.println("**************");
				System.out.println(a<b&&a<d);//false && true = false  
				System.out.println(a<b&a<d);//false & true = false 
				System.out.println("-------------------------------"); 
				
				
				 /*
				  * Logical OR , Bitwise Operator
				  * 1.The logical || operator doesn't check the second condition if the first condition is true. 
				  * It checks the second condition only if the first one is false.
				  * 2.The bitwise | operator always checks both conditions whether first condition is true or false.
				  */
				  //a=4,b=2,d=11
				System.out.println("Print Logical OR, Bitwise Operation :");
				System.out.println("**************");
				System.out.println(a<b||a<d);//false || true = True
				System.out.println(a<b|a<d); // False || true = True
				System.out.println("==============================");
				
				/*Ternary Operator*/
				System.out.println("Print Ternary Operation :");
				System.out.println("**************");
				int c;
				c=(a<d)?a:d; // a=4 , d= 11 
				System.out.println(c);
				System.out.println("==============================");
				
				/*
				 * Assignment Operator
				 * It is used to assign the value on its right to the operand on its left.
				 */
				System.out.println("Print Assignment Operation :");
				System.out.println("**************");
				a+=4;//a=a+4 (a=4+4)  
				b-=4;//b=b-4 (b=2-4)
				System.out.println(a);  
				System.out.println(b);  
				}
		        
			
		


	}


