package example;

import java.util.Scanner;

public class Fibonacci_4 {
    static int sCount;
    static int[] sFibonacci;

    private static int getUserInput() {
        //2. 수열의 갯수 입력받기
        Scanner scan = new Scanner(System.in);
        int count; //수열의 개수
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
        scan.close(); //scanner close
        return count;
    }

    private static void getFibonacci() {
        sFibonacci = new int[sCount];
        sFibonacci[0] = sFibonacci[1] = 1;
        for (int i = 2; i < sCount; i++) {
            sFibonacci[i] = sFibonacci[i - 2] + sFibonacci[i - 1];
        }
    }
//    getFibonacci 함수를 재귀로 구현함
    private static int getFibonacciRecursion(int count) {
        int index = count - 1;
        if (index == 0) {
            sFibonacci[0] = 1;
            return 1;
        }
        if (index == 1) {
            sFibonacci[1] = 1;
            return 1;
        }
        sFibonacci[index] = getFibonacciRecursion(count - 2) + getFibonacciRecursion(count - 1);
        return sFibonacci[index];
    }

    private static void printNumbers() {
        for (int i = 0; i < sCount; i++) {
            System.out.println(sFibonacci[i]);
        }
    }

    public static void main(String[] args) {
        //1. 시작 안내문구 출력
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        //2. 수열의 갯수 입력받기
        //수열의 개수
        sCount = getUserInput();
        sFibonacci = new int[sCount];

        //3. fibonacci 배열 생성 & 연산
        getFibonacciRecursion(sCount);

        //4. 수열 출력하기
        printNumbers();

        //5. 종료 메세지 출력
        System.out.println("[안내]프로그램을 종료합니다.");
    }
}
