package com.example.calculator3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int firstNum = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int secondNum = sc.nextInt();
                System.out.print("연산기호를 입력하세요: ");
                String operatorSymbol = sc.next();

                Operator operator = Operator.fromSymbol(operatorSymbol);
                calculator.setResult(calculator.calculator(operator, firstNum, secondNum));
                System.out.println("결과: " + calculator.getResult());
            } catch (IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage());
            }

            boolean a = true;

            while (true) {
                System.out.print("더 계산 하시겠습니까?(Y/N): ");
                String continueInput = sc.next();
                if (continueInput.equals("n") || continueInput.equals("N")) {
                    System.out.println("계산기 종료");
                    a = true;
                    break;
                } else if (continueInput.equals("y") || continueInput.equals("Y")) {
                    System.out.println("계산을 계속 합니다.");
                    a = false;
                    break;
                } else {
                    System.out.println("잘못된 값을 입력하였습니다.");
                    a = false;
                }
            }
            if (a) {
                break;
            }
        }

        while (true) {
            System.out.println("결과 리스트 : " + calculator.getResultList());
            System.out.print("결과를 삭제하시겠습니까?(Y/N) : ");
            String B = sc.next();
            if (B.equals("N") || B.equals("n")) {
                System.out.println("종료");
                break;
            } else if (B.equals("Y") || B.equals("y")) {
                System.out.print("몇번째 결과를 삭제하시겠습니까?(1부터 시작) : ");
                int C = sc.nextInt();
                calculator.deleteResultList(C - 1);
            } else {
                System.out.println("잘못된 값을 입력하였습니다.");
            }
        }
    }
}
