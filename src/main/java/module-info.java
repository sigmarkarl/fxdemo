module org.simmi.fxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.simmi.fxdemo to javafx.fxml;
    exports org.simmi.fxdemo;
}