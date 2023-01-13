package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice11 {

	public void practice1(){
		Scanner sc = new Scanner(System.in);
		String result = "";

		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		if(input<0) {
			result = "양수만 입력해주세요.";
		}else {
			
			
			
			
		
		
		
		if(input%2==0) {
			result = "짝수입니다.";
		}else {
			result = "홀수입니다.";
		}
			
		}
		
		System.out.print(result);
		
	}
	
}
