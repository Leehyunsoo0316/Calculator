package com.example.calculator2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

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
            double result = calculator.calculate(firstNum, secondNum, operator);
            System.out.println("결과값은 " + result + " 입니다.");

            // 결과 조회
            System.out.print("결과를 조회 하시겠습니까?(yes 입력 시 조회): ");
            String select = sc.next();
            if ("yes".equals(select)) {
                System.out.println(calculator.getResultList());
            }

            // 첫번째 결과 삭제
            System.out.print("첫번째 결과를 삭제 하시겠습니까?(yes 입력 시 삭제): ");
            String remove = sc.next();
            if ("yes".equals(remove)) {
                calculator.remove();
                System.out.println(calculator.getResultList());
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