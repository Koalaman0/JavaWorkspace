package ch03.sec02;

import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		// 시간, 분, 초로 나누어 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간 입력 (초) : ");
		int time = sc.nextInt();
		
		int sec = time % 60;
		int min = (time % 3600) / 60;
		int hour = time / 3600;
		System.out.print(time+"초는 "+hour+"시간, "+min+"분, "+sec+"초입니다.");
		
		sc.close();
	}

}
