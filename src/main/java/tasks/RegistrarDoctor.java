package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.RegistroDoctor;

public class RegistrarDoctor implements Task {

    private RegistroDoctor registroDoctor;

    public static RegistrarDoctor Registro() {
        return Tasks.instrumented(RegistrarDoctor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroDoctor.BTN_AGREGAR_DOCTOR),
                Enter.theValue("Jhonyssa").into(RegistroDoctor.NOMBRE),
                Enter.theValue("Rojasssa").into(RegistroDoctor.APELLIDO),
                Enter.theValue("798465125444").into(RegistroDoctor.TELEFONO),
                Click.on(registroDoctor.TIPO_DOCUMENTO),
                Enter.theValue("134657895454").into(RegistroDoctor.NUMERO_DOCUMENTO),
                Click.on(RegistroDoctor.BTN_GUARDAR)
                );

    }
}
