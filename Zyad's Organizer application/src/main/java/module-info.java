module com.big {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nishAppZyad to javafx.fxml;
    exports com.nishAppZyad;
}