package com.me.lambda;

public class LambdaExpressions {

	interface FuncInterface {
        int operation(int a, int b);
    }

    private int operate(int a, int b, FuncInterface funcObj) {
        return funcObj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInterface add = (int x, int y) -> x + y;

        LambdaExpressions lambda = new LambdaExpressions();
        System.out.println(lambda.operate(5, 7, add));
    }
	
}
