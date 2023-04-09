// Демонстрация применения throw
public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("Демонстрация");
        }catch (NullPointerException e){
            System.out.println("Перехвачено внутри demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Повторно перехвачено: " + e);
        }
    }
}
/*
Перехвачено внутри demoproc()
Повторно перехвачено: java.lang.NullPointerException: Демонстрация
 */