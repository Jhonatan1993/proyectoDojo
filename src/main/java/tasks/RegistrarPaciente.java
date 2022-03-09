package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.RegistroPaciente;

public class RegistrarPaciente implements Task {
    private RegistroPaciente registroPaciente;
    public static RegistrarPaciente Registro() {
        return Tasks.instrumented(RegistrarPaciente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RegistroPaciente.AGREGAR_PACIENTE),
                Enter.theValue("Antionio").into(RegistroPaciente.NOMBRES),
                Enter.theValue("Perez").into(RegistroPaciente.APELLIDOS),
                Enter.theValue("4679321").into(RegistroPaciente.TELEFONO),
                Click.on(RegistroPaciente.TIPO_DOCUMENTO),
                Enter.theValue("9564696798").into(RegistroPaciente.NUMERO_DOCUMENTO),
                Click.on(RegistroPaciente.CHECKBOX),
                Click.on(RegistroPaciente.BTN_GUARDAR)
        );
    }
}
