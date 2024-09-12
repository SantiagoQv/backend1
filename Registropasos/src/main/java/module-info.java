module org.example.registropasos {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.registropasos to javafx.fxml;
    exports org.example.registropasos;
}