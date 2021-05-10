module com.mateyr.agendacontactos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.desktop;
    requires java.logging;

    opens com.mateyr.agendacontactos to javafx.fxml;
    exports com.mateyr.agendacontactos;
    exports  com.mateyr.agendacontactos.Controller;
    exports com.mateyr.pojo;
    requires javafx.graphicsEmpty;
    
}
