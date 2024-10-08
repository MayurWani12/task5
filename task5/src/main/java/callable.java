



import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callable {
    public static void main(String[] args) {
        
        Callable<Integer> callable = new Callable<Integer>() {
            private final int number = 5;

            @Override
            public Integer call() {
                return number * number;
            }
        };

      
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(callable);

        try {
          
            Integer result = future.get();
            System.out.println("The square is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); 
        }
    }
}


