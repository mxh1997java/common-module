package www.maxinhai.com.common.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.util.UUID;

public abstract class Entity implements Identify {

    @Setter
    @Getter
    @Id
    private UUID id;

    @Setter
    @Getter
    private int version;

}
