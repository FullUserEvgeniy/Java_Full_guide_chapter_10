// Демонстрация применения нескольких конструкций catch
public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("args.length = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за допустимые пределы индекса в массиве: " + e);
        }
        //При использовании нескольких конструкций catch важно помнить о
        //том, что подклассы исключений должны предшествовать любым из своих
        //суперклассов
        System.out.println("После блока try/catch");
    }
}
/*
args.length = 0
Деление на ноль: java.lang.ArithmeticException: / by zero
После блока try/catch
 */
