package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.RegistroDoctor;

public class VerificarCita implements Question<Boolean> {

    private String respuesta;

    public VerificarCita(String respuesta) {this.respuesta = respuesta;}

    public static VerificarCita toThe(String respuesta) {
        return new VerificarCita(respuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(RegistroDoctor.TEXTO).viewedBy(actor).asString();
        if (respuesta.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}
