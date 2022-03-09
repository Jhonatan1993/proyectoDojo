package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.AgendarCita;

public class Agendar implements Task {

    private AgendarCita agendarCita;

    public static Agendar cita() {
        return Tasks.instrumented(Agendar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(agendarCita.BTN_AGENDAR_CITA),
                Enter.theValue("03/16/2022").into(agendarCita.FECHA),
                Enter.theValue("9564696798").into(agendarCita.DOCUMENTO_PACIENTE),
                Enter.theValue("134657895454").into(agendarCita.DOCUMENTO_DOCTOR),
                Enter.theValue("Observaciones").into(agendarCita.OBSERVACIONES),
                Click.on(agendarCita.BTN_GUARDAR)
                );
    }
}
