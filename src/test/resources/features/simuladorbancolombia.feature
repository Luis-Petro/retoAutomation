#Author: Luis Petro
 # language: es

@stories
Característica: Verificar el funcionamiento de la pantalla
  de simulación de Canon Financiero expuesta por el grupo Bancolombia - Leasing,
  en cuanto a la presentación de los valores calculados.

  como cliente de Grupo Bancolombia
  quiero  simular un
  para ver los resultados que me arroja

  @esenario1
  Esquema del escenario: Verificar el resultado del simulador de crédito de vivienda con
  entradas válidas
    Dado Que Luis ingresa al portal
    Y Seleciona productos y servicios para dirigirse a Leasing
    Y Selecciona Leasing habitacional
    Cuando Cuando selecciona simular para dirigirse a segun valor de vivienda
    Y Diligencia los campos del formulario con datos validos "<ValorVivivenda>" "<plazo>"

    Entonces Verifica que al simular su credito obtiene el resultado de la simulacion


    Ejemplos:
      | ValorVivivenda | plazo |
      | 180000000      | 10    |
      | 160000000      | 15    |