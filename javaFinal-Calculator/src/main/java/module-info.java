module com.example.javafinalcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;


    opens com.example.javafinalcalculator to javafx.fxml;
    exports com.example.javafinalcalculator;
}