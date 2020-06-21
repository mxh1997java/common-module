package www.maxinhai.com.common.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

public abstract class AuditEntity extends NameEntity implements Auditable {

    @Getter
    @Setter
    private String creator;

    @Getter
    @Setter
    private Date createTime;

    @Getter
    @Setter
    private String editor;

    @Getter
    @Setter
    private Date editTime;

    @Getter
    @Setter
    private String description;

}
