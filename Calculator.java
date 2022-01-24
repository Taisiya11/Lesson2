/**
 * Класс, производящий простые действия между числами на основе калькулятора
 */
public class Calculator {
   int number1;
   int number2;

   Calculator (int number1,int number2){
       this.number1=number1;
       this.number2=number2;
   }
   public int sum(){
       return number1+number2;
   }
   public int subtraction(){
       return number1-number2;
   }
   public int multiplication(){
       return number1*number2;
   }
   public int division(){
       return number1/number2;
   }
}
