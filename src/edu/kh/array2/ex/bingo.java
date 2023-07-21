package edu.kh.array2.ex;

import java.util.Scanner;

public class bingo {
	
	public void bingogo() {
		
		Scanner sc = new Scanner(System.in);
		
		/* 5 * 5 의 겹치지않는 1~25의 랜덤판 출력  -> 겹치지 않는이 안됨.
		 * 
		 * 1~25의 숫자를 입력받기 -> 해결
		 * 일치하는 숫자칸0으로 변경 -> 해결
		 * 
		 * 변경후 다시 출력  -> 해결
		 * 
		 * while 문 사용하여 0은 종료 1~25 입력시 game[row][col] 값을 0으로 변경 -> 해결
		 */
		
		// 1~25 랜덤 입력
		int[][] game = new int[5][5];
		
		for ( int row = 0; row < game.length; row++) {
		
			
			for ( int col = 0; col < game[row].length; col++) {
			
				
				int random = (int) (Math.random() * 25 + 1);
				
				game[row][col] = random;

				
				// 변수값 중복 방지
				 
				
					
			}
			
			
		}
		
		
            
                
		
		
		int input = -1;
		while (input  !=0 ) {
			
			
			for ( int row = 0; row < game.length; row++) {
				
				for ( int col = 0; col < game[row].length; col++) {
				
					if (game[row][col] > 9) {
						System.out.print(game[row][col] +" ");
					}
					else {
						System.out.print(" " + game[row][col] +" ");
					}
				
				}
				System.out.println();
			}
			System.out.print("1~25의 숫자를 입력하세요.  (종료:0)  > ");
			input = sc.nextInt();
			
			for ( int row = 0; row < game.length; row++) {
				
				for ( int col = 0; col < game[row].length; col++) {
					
					if (game[row][col] == input) {
						game[row][col] = 0;
					}
				}
			}
		}
		
	
	}

}
