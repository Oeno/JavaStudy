package Extends;

/**
 * Created by oeno on 2017. 4. 23..
 */
public class TCP extends Team{
    private volatile static TCP instance;

    private TCP() {
        super("TCP");
    }

    public synchronized static TCP getInstance() {
        if (instance == null) {
            instance = new TCP();
        }

        return instance;
    }

}
