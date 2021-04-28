module com.mateyr.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mateyr.javafxdemo to javafx.fxml;
    exports com.mateyr.javafxdemo;
}
