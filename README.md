# AppTravel
Aplicación viajes para la AA de Entornos de Desarrollo

Se trata de una aplicación para que una operadora de viajes pueda gestionar algunos aspectos básicos:
- Consultar viajes disponibles
- Añadir nuevos viajes al catálogo
- Consultar reservas
- Realizar reservas
- Consultar viajeros
- Registrar nuevos viajeros

Para la AA he realizado los siguientes puntos:
Puntos obligatorios:
- Crea un repositorio en GitHub para almacenar el código del proyecto de forma que dispongan de las ramas master y develop. Configura también el fichero README.md del repositorio para que explique en que consiste la aplicación y enumere los puntos que has realizado
- Para cada nueva funcionalidad se creará una nueva rama feature y se fusionará con develop mediante Pull Request: Crear las 3 clases, Crear las opciones de menú para registrar objetos de las 3 clases, Crear las opciones de menú para visualizar los objetos creados --> se puede ver en el historial de actividad del repositorio
- Configura un job en Jenkins para obtener el código del proyecto del repositorio y que se compile y empaquete el proyecto --> se puede ver en el vídeo que adjunto con la AA
- Añade al Job la configuración necesaria para que el código del proyecto sea analizado por un SonarQube --> se puede ver en el vídeo que adjunto con la AA
- Instala y ejecuta VisualVM y monitoriza el rendimiento y el uso de memoria de tu aplicación --> se puede ver en el vídeo que adjunto con la AA

Puntos adicionales:
- Configura maven para poder lanzar un análisis de código del proyecto directamente con esta herramienta --> se puede ver en el archivo POM.xml del repositorio
- Añade algunos test JUnit al proyecto y configura el Job de Jenkins para que se ejecuten cada vez que éste se lance: Test para comprobar que se puede crear cada uno de los objetos, invocando al constructor y comprobando luego los valores de sus atributos --> se puede ver en las clases de test del código del proyecto y en el vídeo adjunto de la configuración de jetkins. He comprobado solo un atributo por cada objeto, pero se podrían replicar los test para cada atributo.
- Añade una release del proyecto al repositorio para que los usuarios puedan descargarse tu aplicación para usarla directamente --> se puede ver en este repositorio
- Utiliza el gestor de issues para registrar como features cada una de las funcionalidades que realices del proyecto. Registra también, al menos, 3 bugs que hayas encontrado durante su desarrollo --> se puede ver en este repositorio
- Diseña el diagrama de clases de tu proyecto --> adjunto el diagrama en la AA
