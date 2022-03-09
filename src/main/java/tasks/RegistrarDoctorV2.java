package tasks;

import model.TablaDeDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.RegistroDoctor;
import java.util.List;

public class RegistrarDoctorV2 implements Task {
    private TablaDeDatos tablaDeDatos;

    public static Performable formulario(String nombreCompleto, String apellidos, String telefono, String tipoDocumento, String numeroDeDocumento) {
        return Tasks.instrumented(RegistrarDoctorV2.class, nombreCompleto, apellidos, telefono, tipoDocumento, numeroDeDocumento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroDoctor.BTN_AGREGAR_DOCTOR),
                Enter.theValue(tablaDeDatos.getNombreCompleto()).into(RegistroDoctor.NOMBRE),
                Enter.theValue(tablaDeDatos.getApellidos()).into(RegistroDoctor.APELLIDO),
                Enter.theValue(tablaDeDatos.getTelefono()).into(RegistroDoctor.TELEFONO),
                Click.on(RegistroDoctor.TIPO_DOCUMENTO),
                Enter.theValue(tablaDeDatos.getNumeroDeDocumento()).into(RegistroDoctor.NUMERO_DOCUMENTO),
                Click.on(RegistroDoctor.BTN_GUARDAR)
        );

    }
}
