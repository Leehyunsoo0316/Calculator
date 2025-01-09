package com.example.calculator3;

import java.util.ArrayList;

public class ArithmeticCalculator {
    private int result;
    private ArrayList<Integer> resultList = new ArrayList<Integer>();

    // 생성자
    public ArithmeticCalculator() {

    }

    public int calculator (Operator operator, int firstNum, int secondNum) {
        switch (operator) {
            case ADD:
                result = firstNum + secondNum;
                resultList.add(result);
                return result;
            case SUBTRACT:
                result = firstNum - secondNum;
                resultList.add(result);
                return result;
            case MULTIPLY:
                result = firstNum * secondNum;
                resultList.add(result);
                return result;
            case DIVIDE:
                if (secondNum == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = firstNum / secondNum;
                resultList.add(result);
                return result;
            case REM:
                result = firstNum % secondNum;
                resultList.add(result);
                return result;
            default:
                throw new IllegalArgumentException("유효하지 않은 연산자입니다.");
        }
    }

    public int getResult() {
        return result;
    }

    public ArrayList<Integer> getResultList() {
        return resultList;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void deleteResultList(int A) {
        resultList.remove(A);
    }
}