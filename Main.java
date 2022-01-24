public class Main {
public static void main(String[] args){
    Human human = new Human("Brown","Ric","Сергеевич",34);
    Book book = new Book("java",2021,"Rick",);
    Human human1 = new Human();
    Calculator calculator = new Calculator(5,3);
    Matrix matrix = new Matrix(3,3);
    System.out.println(human);
    System.out.println(human1);
    System.out.println(calculator.sum());
    System.out.println(calculator.subtraction());
    System.out.println(calculator.multiplication());
    System.out.println(calculator.division());
    }
}
