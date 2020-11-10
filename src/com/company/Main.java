package com.company;

public class Main {

    public static void main(String[] args) throws Quiz.ParamTooLarge, Quiz.ParamTooSmall {
	// write your code here

        Quiz quiz = new QuizImpl();
        int digit;

        for(int counter = 1;counter++){
          try{
              quiz.isCorrectValue(digit);
              System.out.println("Trafiona proba!! Szukana liczba to: "+digit+" Ilosc prob: "+counter);
          }catch (Quiz.ParamTooLarge g){
              System.out.println("Argument za duzy!!");
          }catch (Quiz.ParamTooSmall e){
              System.out.println("Argument za maly!!");
          }
      }
    }
}
