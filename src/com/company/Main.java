package com.company;

public class Main {

    public static void main(String[] args){
        // write your code here

        Quiz quiz = new QuizImpl();

        int max_value = quiz.MAX_VALUE;
        int min_value = quiz.MIN_VALUE;

        int digit = (max_value + min_value)/2; //zaincjowanie zmiennej

        for(int counter = 1;;counter++){

            try{
                quiz.isCorrectValue(digit);
                System.out.println("Trafiona proba!! Szukana liczba to: "+digit+" Ilosc prob: "+counter);
                break;
            }catch (Quiz.ParamTooLarge g){
                System.out.println("Argument jest za duzy!!");
                // implementacja logiki...
                max_value = digit;
                digit = (max_value + min_value)/2;

            }catch (Quiz.ParamTooSmall e){
                System.out.println("Argument jest za maly!!");
                // implementacja logiki...
                min_value = digit;
                digit = (max_value + min_value)/2;
            }
        }
    }
}
