import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.User;

public class Mess {
     private long chat_id;
     private String text;
     private int id;
     private String userName;
     private String firstName;

    public Mess(Update update) {
        this.chat_id = update.getMessage().getChatId();
        this.text = update.getMessage().getText();
        User u = update.getMessage().getFrom();
        this.id = u.getId();
        this.firstName = u.getFirstName();
        this.userName = u.getUserName();
    }
    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public void setText(String message_text) {
        this.text = message_text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getChat_id() {
        return chat_id;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }



}
