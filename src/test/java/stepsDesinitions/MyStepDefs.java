package stepsDesinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.TablaDeDatos;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;
import tasks.RegistrarDoctorV2;
import java.util.List;

public class MyStepDefs {
    @Before
    public void iniciarEscenario() {
    OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) necesita registrar un nuevo doctor$")
    public void queJhonatanNecesitaRegistrarUnNuevoDoctor(String actor) {
        OnStage.theActor(actor).wasAbleTo(Abrir.pagina());
    }

    @Cuando("^el realiza el registro del mismo en el aplicativo de Administracion de Hospital$")
    public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospital(List<TablaDeDatos> TablaDeDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDoctorV2.formulario(
                TablaDeDatos.get(0).getNombreCompleto(),
                TablaDeDatos.get(1).getApellidos(),
                TablaDeDatos.get(2).getTelefono(),
                TablaDeDatos.get(3).getTipoDocumento(),
                TablaDeDatos.get(4).getNumeroDeDocumento()
        ));

    }


    @Entonces("^verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
    public void verificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente() {
    }
}
