package module2ForEnterprise;

/**
 * Created by denys on 12.04.16.
 */
public interface Task<T> {
    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    T getResult();
}
