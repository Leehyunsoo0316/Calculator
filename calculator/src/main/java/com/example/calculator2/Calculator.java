package com.example.calculator2;

import java.util.ArrayList;

public class Calculator {
    private char sign; // 연산기호
    private int firstNum; // 첫번째 숫자
    private int secondNum; // 두번째 숫자
    private int result; // 결과값
    private ArrayList<Integer> resultList = new ArrayList<Integer>();

    // 생성자
    public Calculator() {
    // 로직
    }

    // 첫번째 정수 setter
    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    // 두번째 정수 setter
    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    // 연산기호 setter
    public void setSign(char sign) {
        this.sign = sign;
    }

    // 첫번째 정수 getter
    public int getFirstNum() {
        return firstNum;
    }

    // 두번째 정수 getter
    public int getSecondNum() {
        return secondNum;
    }

    // 연산기호 getter
    public char getSign() {
        return sign;
    }

    // 결과값 getter
    public int getResultNum() {
        return result;
    }

    // 결과 리스트 getter
    public ArrayList<Integer> getResultList() {
        return resultList;
    }

    // 더하기
    public void plus() {
        result = firstNum + secondNum;
    }

    // 빽기
    public void minus() {
        result = firstNum - secondNum;
    }

    // 곱하기
    public void multiply() {
        result = firstNum * secondNum;
    }

    // 나누기
    public void divide() {
        result = firstNum / secondNum;
    }

    // 결과 저장
    public void addResultList() {
        resultList.add(result);
    }

    // 결과 삭제
    public void deleteResultList(int A) {
        resultList.remove(A);
    }
}
