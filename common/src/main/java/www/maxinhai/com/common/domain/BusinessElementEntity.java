package www.maxinhai.com.common.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class BusinessElementEntity extends AuditEntity implements Extendable {

    @Getter
    @Setter
    private Map<String, Object> udaInstance = new ConcurrentHashMap<>();

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
