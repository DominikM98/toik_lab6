package com.company;

class QuizImpl implements Quiz{
    private int digit;

    public QuizImpl(){
        this.digit = 254;
    }

    @Override
    public void isCorrectValue(int value) throws ParamTooLarge, ParamTooSmall {
        if (value > digit){
            throw new ParamTooLarge();
        }else if (value < digit){
            throw new ParamTooSmall();
        }
    }
}
