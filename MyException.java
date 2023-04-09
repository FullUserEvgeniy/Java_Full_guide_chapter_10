// В этой программе создается специальный тип исключения
public class MyException extends Exception{
    private int detal;

    MyException(int detal){
        this.detal = detal;
    }
    public String toString(){
        return "MyExceptoin[" + detal + "]";
    }
}
class ExceptionDemo{
    static void compute(int detal) throws MyException {
        System.out.println("Вызов compute(" + detal + ")");
        if (detal > 10) throw new MyException(detal);
        System.out.println("Нормальное завершение");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }catch (MyException e){
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
/*
Вызов compute(1)
Нормальное завершение
Вызов compute(20)
Перехвачено исключение: MyExceptoin[20]
 */