package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 양의 정수 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();
        // 사칙연산 기호 입력 받기
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);

        while (true) {
            // 연산 진행후 결과값을 출력
            int result;
            if (operator == '+') {
                result = firstNum + secondNum;
                System.out.println("결과값은 " + result + " 입니다");
            } else if (operator == '-') {
                result = firstNum - secondNum;
                System.out.println("결과값은 " + result + " 입니다");
            } else if (operator == '*') {
                result = firstNum * secondNum;
                System.out.println("결과값은 " + result + " 입니다");
            } else if (operator == '/') {
                if (secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = firstNum / secondNum;
                System.out.println("결과값은 " + result + " 입니다");
            } else {
                System.out.println("잘못된 연산기호를 입력하였습니다.");
            }

            // exit를 입력하기 전까지 무한으로 반복
            System.out.print("계속 계산 하시겠습니까? (exit 입력 시 종료): ");
            String next = sc.next();
            if ("exit".equals(next)) {
                System.out.println("계산을 종료합니다.");
                break;
            }
        }
    }
}
