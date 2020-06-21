package www.maxinhai.com.commonshare.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class EasywareMessage {

    @Getter
    @Setter(AccessLevel.PRIVATE)
    private int paramsCount;

    @Getter
    @Setter(AccessLevel.PRIVATE)
    private String resourceName;

    public EasywareMessage(String resourceName, int paramsCount) {
        this.resourceName = resourceName;
        this.paramsCount = paramsCount;
    }

}
