package www.maxinhai.com.common.domain;

import java.util.Map;

/**
 * 可扩展接口
 */
public interface Extendable {

    <T> T getUDA(String itemName);

    Map<String, Object> getUDAs();

    <T> void putUDA(String itemName, T value);

}
