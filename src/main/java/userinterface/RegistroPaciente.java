package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPaciente extends PageObject {

    public static final Target AGREGAR_PACIENTE = Target.the("Opcion agregar paciente")
            .located(By.xpath("//a[contains(@href,'addPatient')]"));
    public static final Target NOMBRES = Target.the("Ingresar nombres")
            .located(By.xpath("//input[contains(@placeholder,'Ingrese el nombre')]"));
    public static final Target APELLIDOS = Target.the("Ingresar apellidos")
            .located(By.xpath("//input[contains(@name,'last_name')]"));
    public static final Target TELEFONO = Target.the("Ingresar numero de telefono")
            .located(By.xpath("//input[contains(@name,'telephone')]"));
    public static final Target TIPO_DOCUMENTO = Target.the("Seleccionar tipo de documento")
            .located(By.xpath("//option[contains(@value,'Pasaportes')]"));
    public static final Target NUMERO_DOCUMENTO = Target.the("Ingresar numero de documento")
            .located(By.xpath("//input[contains(@name,'identification')]"));
    public static final Target CHECKBOX = Target.the("Seleccionar salud prepagada")
            .located(By.xpath("//input[contains(@name,'prepaid')]"));
    public static final Target BTN_GUARDAR = Target.the("Boton guardar datos")
            .located(By.xpath("//a[contains(text(),'Guardar')]"));
    public static final Target TEXTO = Target.the("Texto a verificar")
            .located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));
}
