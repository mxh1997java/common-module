package www.maxinhai.com.commonshare.extension;

import www.maxinhai.com.commonshare.exception.EasywareException;
import www.maxinhai.com.commonshare.exception.EasywareMessage;

/**
 * 断言
 */
public class Validate {

    public static void execAssert(boolean isTrue, EasywareMessage easywareMessage, String... args) throws EasywareException {

        assert(easywareMessage.getParamsCount() == args.length);

        if (!isTrue) {
            throw new EasywareException(easywareMessage.getResourceName(), args);
        }

    }

    public static void execAssert(boolean isTrue, String message, String... args) throws EasywareException {
        if (!isTrue) {
            throw new EasywareException(message, args);
        }
    }

}
