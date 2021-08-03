public class OssNumException extends Exception {
    private final int ERR_CODE;
    OssNumException(String msg, int errCode){
        super(msg);
        this.ERR_CODE = errCode;
    }
    OssNumException(String msg){
        this(msg,100);
    }
}
