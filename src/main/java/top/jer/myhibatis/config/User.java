package top.jer.myhibatis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
//如果不传值 Component会把类名首字母小写作为Bean的名称 放入到IoC容器中
public class User {
    @Value("1")
    private long id;
    @Value("user_name_2")
    private String username;
    @Value("note_1")
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
