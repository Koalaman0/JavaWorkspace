package ch02.sec04;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("학년 입력 : ");
		int year = sc.nextInt();
		
		System.out.println("점수 입력 : ");
		double score = sc.nextDouble();
		
		char grade;
		System.out.println("학점 입력 : ");
		grade = sc.next().charAt(0);
		
		System.out.println("-------------");
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + year);
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
		
		
		
		
		
		
		

	}

}
