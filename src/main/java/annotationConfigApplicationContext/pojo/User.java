package annotationConfigApplicationContext.pojo;

import org.springframework.stereotype.Component;

@Component("user")
//如果不传值 Component会把类名首字母小写作为Bean的名称 放入到IoC容器中
public class User {
    private long id;
    private String username;
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
