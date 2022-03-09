package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.RegistroPaciente;

public class VerificarPaciente implements Question<Boolean> {

    private String respuesta;

    public VerificarPaciente(String respuesta) {
        this.respuesta = respuesta;
    }

    public static VerificarPaciente toThe(String respuesta) {
        return new VerificarPaciente(respuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(RegistroPaciente.TEXTO).viewedBy(actor).asString();
        if (respuesta.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}
