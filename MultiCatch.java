// Демонстрация средства множественного перехвата
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] vals = {1, 2, 3};
        try {
            int result = a/b;
            //vals[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){ //конструкция множественного перехвата
            System.out.println("Перехвачено исключение: " + e);
        }
        System.out.println("После множественного перехвата");
    }
}
/*
Перехвачено исключение: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
После множественного перехвата
 */
/*
Перехвачено исключение: java.lang.ArithmeticException: / by zero
После множественного перехвата
 */