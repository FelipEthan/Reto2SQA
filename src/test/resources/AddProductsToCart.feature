Feature: Agregar productos al carrito de compras

  Scenario: Verificar que se muestren los productos de esta categoria
  Given Que estoy en la página principal de la tienda
  When Selecciono la categoría "Agradecimientos"
  Then Se visualizarán los productos para esta categoría

  Scenario: Añadir dos productos de la categoría "Agradecimientos" al carrito
  Given Que estoy en la página principal de la tienda
  And Selecciono la categoría "Agradecimientos"
  And Selecciono un producto "MDF 00015"
  When De clic en la opción "Añadir al carrito"
  And Selecciono un nuevo producto "Ferrero rocher x8 unidades"
  When De clic en la opción "Añadir al carrito"
  Then El producto se agregará al carrito de compras

  Scenario: Validar productos en el carrito de compreas
    Given Que estoy en la página principal de la tienda
    And Selecciono la categoría "Agradecimientos"
    And Selecciono un producto "MDF 00015"
    When De clic en la opción "Añadir al carrito"
    And Selecciono un nuevo producto "Ferrero rocher x8 unidades"
    When De clic en la opción "Añadir al carrito"
    When De clic en la opción "CARRO"
    Then Se deberán visualizar los productos agregados