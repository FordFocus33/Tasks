package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleThreadExecutor {
    /*
    Зачем это нужно?
    Интерфейс - это контракт, соглашение. Интерфейс в стандартной библиотеке - это хорошо, он задает единый стиль.
     Future - это контракт чего-то, что имеет результат, но на момент получения результат может быть еще не готов.
      И тут есть варианты - периодически проверять, не блокируя свой поток, готово ли оно, или тупо спросить значение и заблокироваться.
     */

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Выполнение долгой операции...");
            Thread.sleep(2000);
            return 42;
        });

        if (!future.isDone()) {
            System.out.println("Задача ещё выполняется...");
        }

        int result = future.get();
        System.out.println("Результат - " + result);

        executorService.shutdown();
    }

}
