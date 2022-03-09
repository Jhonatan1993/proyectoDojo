package stepsDesinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarCita;
import questions.VerificarDoctor;
import questions.VerificarPaciente;
import tasks.Abrir;
import tasks.Agendar;
import tasks.RegistrarDoctor;
import tasks.RegistrarPaciente;

public class DojoStepDefinitions {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    //Primer escenario
    @Dado("^que Carlos necesita registrar un nuevo doctor$")
    public void queCarlosNecesitaRegistrarUnNuevoDoctor() {
        OnStage.theActorCalled("Carlos").wasAbleTo(Abrir.pagina());
    }

    @Cuando("^el realiza el registro del mismo en el aplicativo de Administracion de Hospitales$")
    public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitales() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDoctor.Registro());
    }


    @Entonces("^el verifica que se presente en pantalla el mensaje (.*)$")
    public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String respuesta) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarDoctor.toThe(respuesta)));
    }

    //Segundo escenario

    @Dado("^que Carlos necesita registrar un nuevo paciente$")
    public void queCarlosNecesitaRegistrarUnNuevoPaciente() {
        OnStage.theActorCalled("Carlos").wasAbleTo(Abrir.pagina());
    }

    @Cuando("^el realiza el registro del Paciente en el aplicativo de Administracion de Hospitales$")
    public void elRealizaElRegistroDelPacienteEnElAplicativoDeAdministracionDeHospitales() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarPaciente.Registro());
    }

    @Entonces("^el verifica que se presenta en pantalla el mensaje (.*)$")
    public void elVerificaQueSePresentaEnPantallaElMensajeDatosGuardadosCorrectamente(String respuesta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarPaciente.toThe(respuesta)));
    }

    //Tercer escenario


    @Dado("^que Carlos necesita asistir al medico$")
    public void queCarlosNecesitaAsistirAlMedico() {
        OnStage.theActorCalled("Carlos").wasAbleTo(Abrir.pagina());
    }


    @Cuando("^el realiza el agendamiento de una Cita$")
    public void elRealizaElAgendamientoDeUnaCita() {
        OnStage.theActorInTheSpotlight().attemptsTo(Agendar.cita());
    }

    @Entonces("^el verifica que presente en pantalla el mensaje (.*)$")
    public void elVerificaQuePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String respuesta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarCita.toThe(respuesta)));
    }


}
