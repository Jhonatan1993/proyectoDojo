package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.AgendarCita;

public class VerificarDoctor implements Question<Boolean> {

    private String respuesta;

    public VerificarDoctor(String respuesta) {
        this.respuesta = respuesta;
    }

    public static VerificarDoctor toThe(String respuesta) {
        return new VerificarDoctor(respuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(AgendarCita.TEXTO).viewedBy(actor).asString();
        if (respuesta.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }

        return result;
    }


}
