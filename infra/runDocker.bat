@echo off
::Se debe cambiar nombre del proyecto [PROYECTO], el [PUERTO] y el [IMAGE] según su proyecto
SET PROYECTO=Apoyo Seleccion
Title Creando Imagen DOCKER - PersonalSoft Proyecto %PROYECTO%
::Se definen las variables.
::Puerto definido en el application.yml [port: ${EUREKAPORT:puerto}]
SET PUERTO=8001
::Nombre de la imagen docker a construir
SET IMAGE=seleccion-server
::Nombre del JAR a copiar y ejeuctar dentro de la imagen docker
SET JAR=%IMAGE%-1.0.jar
echo.
echo Se inicia el proceso... Fecha:%date%-Hora:%time%
echo.
::Impresión banner diseño by Fernando Baños Lozano
COLOR 1F
echo *****                                          **                 ***   **
echo ******                                         **                *****  **
echo **  **                                         **                **     **
echo ****** ****  ** *** ****   ****  ** **   *** * **  ****   ****  ***** ******
echo ***** ****** ****  ****** ****** ****** ****** ** ****** ****** ***** ******  
echo **    **  ** **    ***    **  ** **  ** **  ** ** ***    **  **  **     **  
echo **    *****  **     ****  **  ** **  ** **  ** **  ****  **  **  **     **  
echo **    **     **       *** **  ** **  ** **  ** **    *** **  **  **     **   
echo **    ****** **    ****** ****** **  ** ****** ** ****** ******  **     **  
echo **     ****  **     ****   ****  **  **  *** * **  ****   ****   **     **
 ::Inicio ejecución de comandos
echo.
echo..
echo...
echo Deteniendo la ejecucion del docker.... 
docker stop %IMAGE%

echo.
echo..
echo...
echo Borrando el docker del listado de ejecucion.... 
docker rm %IMAGE%

echo.
echo..
echo...
echo Listado de dockers en ejecucion....
docker ps -a

echo.
echo..
echo...
echo Listado de imagenes docker....
docker images

echo.
echo..
echo...
echo Eliminando imagen docker del proyecto %IMAGE% ....
docker rmi %IMAGE%

echo.
echo..
echo...
echo Construyendo imagen con el artefacto %JAR% ....
docker build -t %IMAGE% .

echo.
echo..
echo...
echo Ejecutando docker con el artefacto %JAR% ....
docker run -p %PUERTO%:%PUERTO% --name %IMAGE% --restart always -d %IMAGE%:latest

echo.
echo..
echo...
echo El proceso de creacion y ejecucion de la imagen docker a finalizado ....
echo Pulse cualquier tecla para finalizar ....
PAUSE>NUL
