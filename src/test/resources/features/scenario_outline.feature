#language:es
#Autor: Jhonatan Paternina Rojas

@HU
Característica: : Como paciente
  Quiero realizar la solicitud de una cita médica
  A través del sistema de Administración de Hospitales

  @Escenario1
  Esquema del escenario: Realizar el Registro de un Doctor
    Dado que <actor> necesita registrar un nuevo doctor

    Cuando el realiza el registro del mismo en el aplicativo de Administracion de Hospital
      | <NombreCompleto> | <Apellidos> | <Telefono> | <TipoDocumento> | <NumeroDeDocumento> |
    Entonces verifica que se presente en pantalla el mensaje Datos guardados correctamente
    Ejemplos:
      | actor    | NombreCompleto | Apellidos | Telefono | TipoDocumento | NumeroDeDocumento |
      | Jhonatan | Juan           | Perez     | 3321654  | pasaporte     | 123548789         |