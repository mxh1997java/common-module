package www.maxinhai.com.common.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 业务实体类
 */
public abstract class BusinessEntity extends AuditEntity implements Stateful,Extendable{

    public void setUdaInstance(Map<String, Object> udaInstance) {
        this.udaInstance = udaInstance;
    }

    @Getter
    private Map<String, Object> udaInstance = new ConcurrentHashMap<>();

    @Getter
    @Setter
    private UUID stateModelId;

    @Getter
    @Setter
    private String stateModelName;

    @Getter
    @Setter
    private UUID previousStateId;

    @Getter
    @Setter
    private String previousStateName;

    @Getter
    @Setter
    private UUID currentStateId;

    @Getter
    @Setter
    private String currentStateName;

    @Override
    public <T> T getUDA(String itemName) {
        return (T) udaInstance.get(itemName);
    }

    @Override
    public Map<String, Object> getUDAs() {
        return Collections.unmodifiableMap(udaInstance);
    }

    @Override
    public void putUDA(String itemName, Object value) {
        udaInstance.put(itemName, value);
    }

}
