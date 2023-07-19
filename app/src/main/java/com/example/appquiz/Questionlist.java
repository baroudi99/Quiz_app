package com.example.appquiz;

public class Questionlist {
    private String tv1 , op1,op2,op3 , answers;
    private String UserSelectAnswers;

    public Questionlist(String tv1, String op1, String op2, String op3, String answers, String userSelectAnswers) {
        this.tv1 = tv1;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.answers = answers;
        UserSelectAnswers = userSelectAnswers;
    }

    public Questionlist(String tv1, String op1, String op2, String op3, String answers) {
    }

    public String getTv1() {
        return tv1;
    }

    public String getOp1() {
        return op1;
    }

    public String getOp2() {
        return op2;
    }

    public String getOp3() {
        return op3;
    }

    public String getAnswers() {
        return answers;
    }

    public String getUserSelectAnswers() {
        return UserSelectAnswers;
    }
}
