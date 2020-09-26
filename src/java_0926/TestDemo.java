package java_0926;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-26
 * Time:20:03
 **/

public class TestDemo {
    static class MyRunnable implements Runnable{

        public void run(){

        }
    }
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread thread = (Thread) runnable;
    }
}
