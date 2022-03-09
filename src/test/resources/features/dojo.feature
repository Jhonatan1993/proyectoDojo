#language:es
#Autor: Jhonatan Paternina Rojas

@HU
Característica: Como paciente
  Quiero realizar la solicitud de una cita médica
  A través del sistema de Administración de Hospitales

  @Escenario1
  Escenario: Realizar el Registro de un Doctor
    Dado que Carlos necesita registrar un nuevo doctor
    Cuando el realiza el registro del mismo en el aplicativo de Administracion de Hospitales
    Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente.

  @Escenario2
  Escenario: Realizar el Registro de un Paciente
    Dado que Carlos necesita registrar un nuevo paciente
    Cuando el realiza el registro del Paciente en el aplicativo de Administracion de Hospitales
    Entonces el verifica que se presenta en pantalla el mensaje Datos guardados correctamente.

  @Escenario3
  Escenario: Realizar el Agendamiento de una Cita
    Dado que Carlos necesita asistir al medico
    Cuando el realiza el agendamiento de una Cita
    Entonces el verifica que presente en pantalla el mensaje Datos guardados correctamente.
