package ch04.sec01;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		// 제어문 연습문제
		
		Scanner sc = new Scanner(System.in);
		
		int num, amount;
		int digi = 400000;
		int note = 1200000;
		
		
		System.out.println("***************상품정보***************" );
		System.out.println("1 노트북 : 1,200,000원 : " );
		System.out.println("2 디지털카메라 : 400,000원 : " );
		System.out.println("***********************************" );
		
		System.out.print("상품번호 입력 : " );
		num = sc.nextInt();
		
		
		if(num == 1 || num==2) {
			System.out.println("주문수량 입력 : ");
			amount = sc.nextInt();
			
			if(num==1) {
				int totalNote ;
				totalNote=digi*amount;
				System.out.println("상품명 : 노트북");
				System.out.println("가격 : 1200000 원");
				System.out.println("주문 수량 : " + amount);
				System.out.println("주문액 : " + totalNote);
				if(totalNote>=1000000) {
					System.out.println("할인액 : " + (int)(totalNote*0.1) + "원");
					int total = totalNote - (int)(totalNote*0.1);
					System.out.println("총지불액 :" + total + "원");
				}
				else {
					System.out.println("할인액 : " + (int)(totalNote*0.05) + "원");
					int total = totalNote - (int)(totalNote*0.05);
					System.out.println("총지불액 :" + total + "원");
				}
				
				
			} else {
				switch() {
				case 1:
				}
			}
			
		}else
			System.out.println("잘못 입력하였습니다. 종료하였습니다.");
		
		
		
		
		
		
		
		sc.close();

	}

}
