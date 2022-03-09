package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgendarCita extends PageObject {
    public static final Target BTN_AGENDAR_CITA = Target.the("Opcion agendar cita")
            .located(By.xpath("//a[contains(@href,'appointmentScheduling')]"));
    public static final Target FECHA = Target.the("Seleccionar fecha de la cita")
            .located(By.id("datepicker"));
    public static final Target DOCUMENTO_PACIENTE = Target.the("Ingresar numero de documento del paciente")
            .located(By.xpath("//input[contains(@placeholder,'Ingrese el documento de identidad del paciente')]"));
    public static final Target DOCUMENTO_DOCTOR = Target.the("Ingresar numero de documento del doctor")
            .located(By.xpath("//input[contains(@placeholder,'Ingrese el documento de identidad del doctor')]"));
    public static final Target OBSERVACIONES = Target.the("Ingresar observaciones")
            .located(By.xpath("//textarea[contains(@rows,'3')]"));
    public static final Target BTN_GUARDAR = Target.the("Boton guardar")
            .located(By.xpath("//a[contains(text(),'Guardar')]"));
    public static final Target TEXTO = Target.the("Texto a verificar")
            .located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));

}
