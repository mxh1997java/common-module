package www.maxinhai.com.common.domain;

import java.util.UUID;

public interface Stateful {

    UUID getStateModelId();

    String getStateModelName();

    UUID getPreviousStateId();

    String getPreviousStateName();

    UUID getCurrentStateId();

    String getCurrentStateName();

}
