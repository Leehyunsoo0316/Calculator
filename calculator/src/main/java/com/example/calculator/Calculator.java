package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int A = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int B = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char C = sc.next().toCharArray()[0];

            double DA = A;
            double DB = B;

            while (true) {
                if (C == '+') {
                    System.out.println("정답은 " + (A+B) + "입니다.");
                    break;
                } else if (C == '-') {
                    System.out.println("정답은 " + (A-B) + "입니다.");
                    break;
                } else if (C == '*') {
                    System.out.println("정답은 " + (A*B) + "입니다.");
                    break;
                } else if (C == '/') {
                    if (B == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        System.out.println("정답은 " + (DA/DB) + "입니다.");
                        break;
                    }
                } else if (C != '+' || C != '-' || C != '*' || C != '/') {
                    System.out.println("잘못된 기호를 입력하셨습니다.");
                    break;
                } else {
                    System.out.println("잘못된 숫자를 입력하셨습니다.");
                    break;
                }
            }
            System.out.print("계속 계산하시겠습니까? (exit 입력 시 종료): ");
            String D = sc.next();
            if (D.equals("exit")) {
                break;
            }
        }
    }
}
