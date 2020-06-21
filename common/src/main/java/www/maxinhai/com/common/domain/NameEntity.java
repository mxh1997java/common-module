package www.maxinhai.com.common.domain;

import lombok.Getter;
import lombok.Setter;

public abstract class NameEntity extends Entity implements Name {

    @Setter
    @Getter
    private String name;

}
