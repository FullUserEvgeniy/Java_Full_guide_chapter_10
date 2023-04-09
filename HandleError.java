import java.util.Random;
// генерируем и перехватываем исключение
public class HandleError {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random random = new Random();
        try {
            for (int i=0; i<32000; i++) {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
                System.out.println(" | " + a);
            }
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль");
            System.out.println(e);
            a = 0;
        }
        System.out.println("a = " + a);
    }
}
/*
 | -12345
Деление на ноль
java.lang.ArithmeticException: / by zero
a = 0
 */