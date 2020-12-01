#Author: Luz Ramos
# encoding: utf-8

Feature: Busqueda Vuelo
Yo como usuario en la aplicación
Quiero realizar la búsqueda de vuelos
Para conocer disponibilidad
 
 Scenario: buscar vuelo
 Given usuario ingresa a la pagina de vuelos
 When usuario busca el vuelo
 Then usuario visualiza la busqueda