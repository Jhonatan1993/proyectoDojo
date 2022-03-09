package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroDoctor extends PageObject {
    public static final Target BTN_AGREGAR_DOCTOR = Target.the("Boton para agregar doctor")
            .located(By.xpath("//a[contains(@href,'addDoctor')]"));
    public static final Target NOMBRE = Target.the("Ingresar nombre del doctor")
            .located(By.id("name"));
    public static final Target APELLIDO = Target.the("Ingresar apellido del doctor")
            .located(By.id("last_name"));
    public static final Target TELEFONO = Target.the("Numero de telefono")
            .located(By.id("telephone"));
    public static final Target TIPO_DOCUMENTO = Target.the("Seleccionar tipo de documento")
            .located(By.xpath("//option[contains(@value,'Pasaportes')]"));
    public static final Target NUMERO_DOCUMENTO = Target.the("Ingresar numero de documento")
            .located(By.id("identification"));
    public static final Target BTN_GUARDAR = Target.the("Boton guardar")
            .located(By.xpath("//a[contains(text(),'Guardar')]"));
    public static final Target TEXTO = Target.the("Texto a validar")
            .located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));
}
