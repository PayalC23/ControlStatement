package ControlStatement;

import java.util.Scanner;

public class ControlStatement {
	

		public static void main(String[] args) {
			// Declare the variables
			 System.out.println("Select your choice from below options of 1 - 5 \n" + "\n1 : Factorial Num" +
		                "\n2 : Fibonacci Series" + "\n3 : Prime Num" + "\n4 : Sum of Digits" + "\n5 : Reverse Num");
		        System.out.println("\nPlease select choice :");
		        
		        // For loop
		        Scanner sc = new Scanner(System.in); // scanner class for taking o/p for user
		        for (int i = 1; i <= 5; i++) {
		            int choice = sc.nextInt();
		            // Conditional Statement
		            switch (choice) {

				case 1:
					System.out.println("You have chosen a method Factorial Num" );
					ControlStatement z = new ControlStatement();
					z.Factorial();
					System.out.println("==================================\n");
					break;
				case 2:
					System.out.println("You have chosen a method Fibonacci Series");
					ControlStatement z1 = new ControlStatement();
					z1.Fibonaccie();
					System.out.println("\n==================================\n");
					break;
				case 3:
					System.out.println("You have chosen a method Prime Num");
					ControlStatement z2 = new ControlStatement();
					z2.PrimeNum();
					System.out.println("==================================\n");
					break;
				case 4:
					System.out.println("You have chosen a method Sum of Digits");
					ControlStatement z3 = new ControlStatement();
					z3.SumofDigits();
					System.out.println("==================================\n");
					break;
				case 5:
					System.out.println("You have chosen a method Reverse Num" );
					ControlStatement z4 = new ControlStatement();
					z4.ReverseNum();
					System.out.println("\n");
					System.out.println("Done all methods.....\n");
					break;
				default:

					System.out.println(" Select only from the available choice of 1 - 5\n Exit.");
					break;

				}

			}

		}

		// Making a Method
		public void Factorial() {
			Scanner sc = new Scanner(System.in);
			// Declare and Initialize the variable
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			int i = 1, fact = 1;
			// Control statement
			while (i <= num) {
				fact = fact * i;
				i++;
			}
			System.out.println("Factorial of the number: " + fact);
		}

		// Making a method
		public void Fibonaccie() {
			int n, a = 0, b = 1,c=0 ;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter value of number:");
			n = s.nextInt();
			System.out.print("Fibonacci Series:");
			// Control statement
			for (int i = 1; i <= n; i++) {
				System.out.print(a + " ");
				c = a + b;
				a = b;
				b = c;
				//c = a + b;
				//System.out.print(a + " ");
			}
		}

		// Making a method
		public void PrimeNum() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number :");
			int num = s.nextInt();
			// int num = 33,
			int i = 2;
			boolean flag = false;
			while (i <= num / 2) {
				// condition for non-prime number
				if (num % i == 0) {
					flag = true;
					break;
				}

				++i;
			}

			if (!flag)
				System.out.println(num + " is a prime number.");
			else
				System.out.println(num + " is not a prime number.");
		}

		// Making a method
		public void SumofDigits() {
			long number, sum;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			// reads a long number from the user
			number = sc.nextLong();
			// executes until the condition number!=0 becomes false
			for (sum = 0; number != 0; number = number / 10) {
				// finds the last digit and add it to the variable sum
				sum = sum + number % 10;
			}
			// prints the result
			System.out.println("Sum of digits: " + sum);
		}

		// Making a method
		public void ReverseNum() {
			int i;
			Scanner scan = new Scanner(System.in);

			System.out.print("Enter the Size of Array: ");
			int res = scan.nextInt();
			int[] arr = new int[res];

			System.out.print("Enter " + res + " Elements for the Array: ");
			for (i = 0; i < res; i++)
				arr[i] = scan.nextInt();

			System.out.println("\nReverse of Given Array is: ");
			for (i = (res - 1); i >= 0; i--)
				System.out.print(arr[i] + " ");
		}
	}


