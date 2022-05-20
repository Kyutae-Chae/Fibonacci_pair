package example;

import java.util.Scanner;

public class Fibonacci_0 {
    public static void main(String [] args) {
        Scanner scan;
        int count; //수열의 개수

        //1. 시작 안내문구 출력
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        //2. 수열의 갯수 입력받기
        scan = new Scanner(System.in);
        while (true) {
            System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
            if (!scan.hasNextInt()) {
                scan.next(); //입력한것 버리기
                System.out.println("자연수만 입력해주세요.");
                continue;
            }
            count = scan.nextInt();
            if (count < 1) {
                System.out.println("자연수만 입력해주세요.");
                continue;
            }
            break;
        }
        System.out.println("count : "+count);

        //3. fibonacci 배열 생성 & 연산
        int[] fibonacci = new int[count];
        fibonacci[0] = fibonacci[1] = 1;
        for (int i = 2; i < count; i++) {
            //fibonacci[2] = fibonacci[0] + fibonacci[1];
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }

        //4. 수열 출력하기
        for (int i = 0; i < count; i++) {
            System.out.println(fibonacci[i]);
        }

        //5. 종료 메세지 출력
        System.out.println("[안내]프로그램을 종료합니다.");

        scan.close(); //scanner close
    }
}
