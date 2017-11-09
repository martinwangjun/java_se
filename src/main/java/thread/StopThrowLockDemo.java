package thread;

class SynchronizedObject{
    private String username = "a";
    private String password = "aa";
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    synchronized public void printString(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThreadSync extends Thread{
    private SynchronizedObject object;
    public MyThreadSync(SynchronizedObject object) {
        super();
        this.object = object;
    }
    @Override
    public void run() {
        object.printString("b", "bb");
    }
}

public class StopThrowLockDemo {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThreadSync t = new MyThreadSync(object);
            t.start();
            Thread.sleep(500);
            t.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
