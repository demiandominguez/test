@Complete @test
Feature: Test - Sodimac

  @test1
  Scenario: Validación de precios en listado exitosa
    Given Que me encuentro en la página inicial de sodimac
    And Busco el producto "Pintura blanca"
    When Hago tap en el boton para completar la búsqueda
    Then Valido que se ve el precio del primer item de la lista

  @test2
    Scenario: Validación de precios en detalle exitosa
    Given Guardo el precio del producto
    When Entro al detalle del primer elemento del listado
    Then Valido el precio mostrado en el detalle