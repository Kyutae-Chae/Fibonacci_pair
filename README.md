# Fibonacci_pair
## 2022년 5월 20일 (금) 진행
### Fibonacci_0.java : 첫번째 코드  
main 메서드 안에 모든 기능 구현함 
### Fibonacci_1.java : 리팩토링 #1
아래 메서드를 추출하여 구현한다.  
private static int getUserInput()
> 메서드의 목적 : 피보나치 수열 개수를 사용자로부터 입력받는다.  
메서드의 이름 : getUserInput()  
메서드의 입력 : 없음  
메서드의 출력 : 피보나치 수열 개수  
반환 데이터 타입 : int

### Fibonacci_2.java : 리팩토링 #2
아래 메서드를 추출하여 구현한다.  
private static void getFibonacci()
> 메서드의 목적 : 피보나치 수열을 생성한다.
메서드의 이름 : getFibonacci()
메서드의 입력 : 피보나치 배열
메서드의 출력 : 없음
반환 데이터 타입 : void

### Fibonacci_3.java : 리팩토링 #3
아래 메서드를 추출하여 구현한다.  
private static void printNumbers()
> 메서드의 목적 : 임의의 수열을 출력한다.  
메서드의 이름 : printNumbers()  
메서드의 입력 : 숫자 배열  
메서드의 출력 : 없음  
반환 데이터 타입 : void

### Fibonacci_4.java : 나만의 프로그램
getFibonacci 함수를 재귀를 이용하여 구현한다.  
**<함수 flow>**  
``` java
public static void main(String[] args)  
->  
private static int getUserInput()  
->  
private static int getFibonacciRecursion(int count)  
->  
private static void printNumbers()
```
<!--![이미지](https://mblogthumb-phinf.pstatic.net/MjAxNzA2MjVfMTQ1/MDAxNDk4MzY5OTMxMjU5.b7T4_iUcVVnDaIxeA9QC6HcIdkipcEd12L_zUHPXwaog.ugJUmnxQvsQFuAEvDqDq6rFjJx07ckLSSaM2dOEvgtYg.PNG.archslave/1.png?type=w800)-->


<img src="https://mblogthumb-phinf.pstatic.net/MjAxNzA2MjVfMTQ1/MDAxNDk4MzY5OTMxMjU5.b7T4_iUcVVnDaIxeA9QC6HcIdkipcEd12L_zUHPXwaog.ugJUmnxQvsQFuAEvDqDq6rFjJx07ckLSSaM2dOEvgtYg.PNG.archslave/1.png?type=w800" width = "700">
