package baseline;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


public class FXMLController implements Initializable {

    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectDate.setValue(LocalDate.now());
    }
    @FXML
    Button addButton;
    @FXML
    TextField addDescription;
    @FXML
    DatePicker selectDate;
    @FXML
    ListView<EventList> toDoList;

    @FXML
    private void addEvent(Event e){

    }
}
