package programmes;

import java.util.Scanner;

public class Assignment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the highest among the given 3 numbers.
		int a,b,c;
		System.out.println("enter the three numbers");
		Scanner inputreader=new Scanner(System.in);
		a=inputreader.nextInt();
		b=inputreader.nextInt();
		c=inputreader.nextInt();
		if(a<b){
			if(b<c){System.out.println(+c+ " is the highest number" );
				
			}else{System.out.println(+b+ " is the highest number" );}}
			else{
				if(a<c){System.out.println(+c+ " is the highest number" );
				
				}else{System.out.println(+a+ " is the highest number" );}
			}
		}
	}


