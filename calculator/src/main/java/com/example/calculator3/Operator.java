package com.example.calculator3;

public enum Operator {
    ADD("+"), // 더하기
    SUBTRACT("-"), // 빼기
    MULTIPLY("*"), // 곱하기
    DIVIDE("/"), // 나누기
    REM("%"); // 나머지

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public static Operator fromSymbol (String symbol) {
        for (Operator operator : values()) {
            if (operator.symbol.equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol);
    }

    public String getSymbol() {
        return symbol;
    }
}