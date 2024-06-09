# Controles

![](https://scontent.fgye30-1.fna.fbcdn.net/v/t1.15752-9/447772013_1878082509329516_1410463841790404907_n.png?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHXhCY3za8yK8NZYDwGrW1P7iFux0dQMAPuIW7HR1AwA3P0rjgBwDrYHvc4BwwJA98pHRj9NoLaPlIlYY7PK27B&_nc_ohc=wopGNY3-NdwQ7kNvgF4yquT&_nc_ht=scontent.fgye30-1.fna&oh=03_Q7cD1QHfWrNTW3TXWhyhvyayQIleB2I4WTFbQ1TBDG3A4uP_tg&oe=668D7C02)



# JavaFX Controls Demo

Este proyecto es una demostración de varios controles de JavaFX organizados en una interfaz gráfica de usuario (GUI). Está diseñado para mostrar cómo se ven y se comportan diferentes controles de JavaFX en una aplicación de escritorio.

## Descripción del Código

El código está escrito en Java utilizando el framework JavaFX. La clase principal `Main` extiende `Application`, que es la clase base para todas las aplicaciones JavaFX.

### Configuración de la Ventana

- La ventana principal (`Stage`) se titula "All Controls Demo".
- La ventana no es redimensionable (`primaryStage.setResizable(false)`), lo que significa que el usuario no puede cambiar su tamaño.

### Layout y Organización

- Se utiliza un `GridPane` como layout principal, que organiza los elementos en filas y columnas.
- El `GridPane` tiene un espacio horizontal (`setHgap(10)`) y vertical (`setVgap(10)`) entre los elementos, y un padding (`setPadding(new Insets(20))`) alrededor.
- Las columnas del `GridPane` tienen anchos porcentuales:
  - La primera columna (`column1`) ocupa el 30% del ancho de la ventana.
  - La segunda columna (`column2`) ocupa el 70% restante.

### Controles Demostrados

1. **Primera Columna (30% de ancho):**
   - Contiene `Label`s que describen los controles en la segunda columna.

2. **Segunda Columna (70% de ancho):**
   - `Button`: Un botón clickeable con el texto "Click Me".
   - `CheckBox`: Una casilla de verificación con el texto "Check Me".
   - `Hyperlink`: Un enlace (no funcional en este demo) con el texto "JavaFX Link".
   - `ToggleButton`: Un botón que se puede alternar (activar/desactivar) con el texto "Toggle Me".
   - `RadioButton`: Un botón de radio (parte de un `ToggleGroup`) con el texto "Option 1".
   - `Label`: Una etiqueta de texto simple con el contenido "Sample Label".
   - `TextField`: Un campo de texto editable con el texto inicial "Edit Me".
   - `PasswordField`: Un campo de texto para contraseñas (oculta los caracteres).
   - `TextArea`: Un área de texto multilínea con el contenido "Multi-line\nText Area".
   - `ProgressIndicator`: Un indicador de progreso circular, fijado al 75% (`setProgress(0.75)`).
   - `ProgressBar`: Una barra de progreso, fijada al 50% (`setProgress(0.5)`).
   - `Slider`: Un control deslizante con rango de 0 a 100, valor inicial 50.

### Escena y Visualización

- Se crea una `Scene` con el `GridPane` como root y dimensiones de 400x500 píxeles.
- La escena se establece en el `Stage` y se muestra (`primaryStage.show()`).

## Cómo Ejecutar

1. Asegúrate de tener Java y JavaFX instalados en tu sistema.
2. Compila el código con `javac Main.java`.
3. Ejecuta la aplicación con `java Main`.

## Propósito

Este código sirve como una introducción visual a los controles básicos de JavaFX. Es útil para:

- Desarrolladores nuevos en JavaFX que quieren ver cómo se ven y se usan los controles.
- Pruebas rápidas de estilos o comportamientos de controles.
- Demostración en presentaciones o tutoriales sobre JavaFX.

## Notas

- Los controles no tienen funcionalidad real más allá de su comportamiento predeterminado.
- En una aplicación real, normalmente se personalizarían estos controles y se les añadirían manejadores de eventos para realizar acciones específicas.
