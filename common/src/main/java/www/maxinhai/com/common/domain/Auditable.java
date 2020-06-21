package www.maxinhai.com.common.domain;

import java.util.Date;

public interface Auditable {

    String getCreator();

    void setCreator(String creator);

    Date getCreateTime();

    void setCreateTime(Date createTime);

    String getEditor();

    void setEditor(String editor);

    Date getEditTime();

    void setEditTime(Date editTime);

    void setDescription(String description);

    String getDescription();

}
