package DataStructure;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class StackUnderFlowException extends NullPointerException{

    private String message;

    public StackUnderFlowException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
