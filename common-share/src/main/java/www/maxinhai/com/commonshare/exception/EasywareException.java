package www.maxinhai.com.commonshare.exception;

/**
 * 自定义异常
 */
public class EasywareException extends Exception {

    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public EasywareException(String message) {
        super(message);
    }

    public EasywareException(String errorCode, String message) {
        super(message);
        setErrorCode(errorCode);
    }

    public EasywareException(String message, String... args) {
        super(String.format(message, args));
    }

}
