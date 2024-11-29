# ComanditosUwU

# PUERTOS: 🔮
 *En esta ocasion 8085 estara en uso:*
 
 - sudo lsof -i :8085
   
*Para pausarlo :*

- kill -9 "PID" (PID es el ID que se mostrara del puerto en uso)

# Docker: 🐳
 *Para saber los contenedores pausados:*
 
 - docker ps
   
 *Para saber contenedores que estan en uso:*

 - docker ps -a

 *Para eliminar un contenedor que esta en stop:*

 - docker rm "id del contenedor"
   
 *Para mirar imagenes:*

 - docker images
   
 *Para eliminar los contenedores y cuales estan en uso*

 - docker rmi "id de la imagen"

 *descargar una imagen:*
 - docker pull <imagen>:<tag>

 *Para construir un imagen:* 
 
 - docker build -t "nombre de la imagen" . (local)
   
 - docker build -t "usuario/nombre de la imagen" . (con usuario)

 *Comando para crear un contenedor y consumir la imagen en un puerto definido*
 
 - docker run -d --name <nombre_contenedor> -p <puerto_local>:<puerto_contenedor> <imagen>

 *Iniciar contenedores detenidos:*
 
 - docker start <nombre_contenedor>

 *Inspeccionar contenedores e imágenes:*

 -  docker inspect <nombre_contenedor> (Ver detalles de un contenedor)
 -  docker logs <nombre_contenedor> (Ver los logs de un contenedor)
 -  docker exec -it <nombre_contenedor> /bin/bash (Conectarse a un contenedor en ejecución (modo interactivo)

 *Eliminar contenedores detenidos todos:*
 
 - docker container prune

 *Para eliminar imagenes no utilizadas:*

 - docker image prune -a

# Docker Compose: 🐳 

*Levantar servicios definidos en un archivo docker-compose.yml:*
- docker-compose up -d
- docker-compose up

*Detener servicios levantados por docker-compose:*
- docker-compose down

*Ver logs de todos los servicios:*
- docker-compose logs

*Compose activos*
- docker-compose ps

*Eliminar contenedores, redes, volúmenes y imágenes que no estén en uso:*
- docker-compose down --rmi all --volumes


# Angular









# Java
