package com.example.calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Double> resultList = new ArrayList<>(); // 결과값 리스트

    // 연산을 진행하고 결과값을 리스트에 추가하는 메서드
    public double calculate(int firstNum, int secondNum, char operator) {
        double result = 0;
        if (operator == '+') {
            result = firstNum + secondNum;
        } else if (operator == '-') {
            result = firstNum - secondNum;
        } else if (operator == '*') {
            result = firstNum * secondNum;
        } else if (operator == '/') {
            if (secondNum == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            result = (double) firstNum / secondNum;
        } else {
            System.out.println("잘못된 연산기호를 입력하였습니다.");
        }
        addResult(result);
        return result;
    }

    // getter
    public List<Double> getResultList() {
        return resultList;
    }

    // setter
    public void addResult(double result) {
        resultList.add(result);
    }

    public void remove() {
        resultList.remove(0);
    }
}