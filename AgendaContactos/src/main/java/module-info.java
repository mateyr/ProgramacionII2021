module com.mateyr.agendacontactos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mateyr.agendacontactos to javafx.fxml;
    exports com.mateyr.agendacontactos;
    exports  com.mateyr.agendacontactos.Controller;
    
}
