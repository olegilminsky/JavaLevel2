package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private TextArea history;

    @FXML
    private TextField message;

    @FXML
    public void clickButtonSend(ActionEvent actionEvent) {
        if (!message.getText().trim().isEmpty()) {
            history.appendText("You: " + message.getText().trim() + "\n");
            message.clear();
            message.requestFocus();
        }
    }

    public void sendMessage(KeyEvent keyEvent) {
        if (!message.getText().trim().isEmpty() && keyEvent.getCode().equals(KeyCode.ENTER)) {
            history.appendText("You: " + message.getText().trim() + "\n");
            message.clear();
            message.requestFocus();
        }
    }
}

