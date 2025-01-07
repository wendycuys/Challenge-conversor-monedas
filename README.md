# Conversor de Monedas en Java

Este es un proyecto de conversión de monedas en Java, utilizando la API de **ExchangeRate API** para obtener las tasas de cambio actuales entre varias monedas. El proyecto está basado en programación orientada a objetos y hace uso de clases como `CurrencyConverter`, `ExchangeRateService`, y `ConfigLoader` para la integración con la API.

## Descripción

Este conversor permite convertir cantidades entre las siguientes monedas:

- **Dólar estadounidense (USD)**
- **Peso argentino (ARS)**
- **Peso colombiano (COP)**
- **Real brasileño (BRL)**


El usuario puede elegir entre un menú de opciones predefinido para realizar las conversiones. Los resultados de la conversión se muestran con una precisión de dos decimales.

## Funcionalidades

- **Conversión entre diferentes monedas**: El sistema permite convertir entre monedas como COP, USD, BRL y ARS.
- **Interfaz de línea de comandos**: La aplicación interactúa con el usuario a través de la consola.
- **Redondeo de resultados**: Los resultados de las conversiones se redondean a dos decimales para mayor legibilidad.
- **Seguridad de la API**: La clave API de la ExchangeRate API se maneja de forma segura mediante un archivo de configuración externo `config.properties`, que está incluido en el `.gitignore` para evitar que se suba a GitHub.

## Requisitos

- **Java JDK 11 o superior**: Este proyecto fue desarrollado en Java 11 y debería funcionar con versiones posteriores.
- **Biblioteca Gson**: Se usa para manejar el formato JSON de la API.
- **Postman** (opcional): Puede usarse para probar la API y verificar las respuestas antes de integrarlas al proyecto.
- **IDE recomendado**: IntelliJ IDEA (opcional, cualquier editor de Java es válido).

## Instalación

### Paso 1: Clonar el repositorio

git clone https://github.com/tu_usuario/Challenge-conversor-monedas.git

### Paso 2: Agregar tu clave API

Dirígete al sitio de ExchangeRate API y regístrate para obtener una clave API.
Crea un archivo config.properties en la raíz del proyecto con el siguiente contenido:

api.key=TU_CLAVE_API_AQUI

### Paso 3: Ejecutar el proyecto

Seguir el menù de instrucciones




