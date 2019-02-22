public class FactorialException extends Exception{
    private int number;

    public FactorialException(String message, int number) {
        super(message);//представляет экземпляр родительского класса
        this.number = number;
    }
    public int getNumber() {//создаём геттер для получения зн-я поля
        return number;
    }
}
