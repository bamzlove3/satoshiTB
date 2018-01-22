import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import parametrs.Var;

public class SatoshiBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            //my class for messegee;
            Mess m = new Mess(update);

            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(m.getChat_id())
                    .setText(m.getText());
            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return Var.getName();
    }

    public String getBotToken() {
        return Var.getToken();
    }
}
