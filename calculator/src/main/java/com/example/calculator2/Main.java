package com.example.calculator2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        while (true) { // 계산기 반복 실행
            System.out.print("첫 번째 숫자를 입력하세요: ");
            calculator.setFirstNum(sc.nextInt());
            System.out.print("두 번째 숫자를 입력하세요: ");
            calculator.setSecondNum(sc.nextInt());
            System.out.print("사칙연산 기호를 입력하세요: ");
            calculator.setSign(sc.next().toCharArray()[0]);

            while (true) {
                // 연산
                if (calculator.getSign() == '+') {
                    calculator.plus();
                    System.out.println("결과는 :" + calculator.getResultNum());
                    calculator.addResultList();
                    break;
                } else if (calculator.getSign() == '-') {
                    calculator.minus();
                    System.out.println("결과는 :" + calculator.getResultNum());
                    calculator.addResultList();
                    break;
                } else if (calculator.getSign() == '*') {
                    calculator.multiply();
                    System.out.println("결과는 :" + calculator.getResultNum());
                    calculator.addResultList();
                    break;
                } else if (calculator.getSign() == '/') {
                    if (calculator.getSecondNum() == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        calculator.divide();
                        System.out.println("결과는 :" + calculator.getResultNum());
                        calculator.addResultList();
                        break;
                    }
                }
            }
            System.out.print("계속 계산하시겠습니까? (Y(y) 또는 N(n) 입력): ");
            String A = sc.next();
            if (A.equals("n") || A.equals("N")) {
                System.out.println("계산기 종료");
                break;
            } else if (A.equals("y") || A.equals("Y")) {
                System.out.println("계산을 계속 합니다.");
            }
        }
        // 결과값 저장 확인, 삭제
        while (true) {
            System.out.println(calculator.getResultList());
            System.out.print("결과를 삭제하시겠습니까?(Y/N) : ");
            String B = sc.next();
            if (B.equals("N") || B.equals("n")) {
                System.out.println("종료");
                break;
            } else if (B.equals("Y") || B.equals("y")) {
                System.out.print("몇번째 결과를 삭제하시겠습니까? : ");
                int C = sc.nextInt();
                calculator.deleteResultList(C-1);
            } else {
                System.out.println("잘못된 값을 입력하였습니다.");
            }
        }
    }
}
