# ComanditosUwU

# PUERTOS: 🔮
*En esta ocasion 8085 estara en uso:*
 
- sudo lsof -i :8085
 
*Para pausarlo :*

- kill -9 "PID" (PID es el ID que se mostrara del puerto en uso)

*Base 64*

- #echo -n "demo123" | base64
  
*Decodificador de 64*

- #echo "OVJyaVZ5UDdjV1pH" | base64 --decode
  
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
 - docker pull imagen:tag  

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

# Angular 🚀
*Listar versiones de Node.js con la versión Angular (LTS)*

- npm show @angular/cli dist-tags
  
*Instalar una versión de Node.js según la lista anterior, por ejemplo:*

- nvm install 17
  
*Instalar una versión de Angular compatible con Node.js según la lista anterior, por ejemplo:*

- npm install -g @angular/cli@17.3.8
  
*Verificar las versiones instaladas de Node.js y Angular*

- ng version
  
*Instalar las dependencias de tu archivo package.json y crear la carpeta node_modules*

- npm start
  
*Para crear un nuevo proyecto standalone (app.module.ts) o sin standalone (sin app.module.ts)*

- ng new "nombre del proyecto" --standalone false
- ng new "nombre del proyecto"
  
*Para crear un service:*

- ng generate service "<nombre-del-servicio>"
  
*Para encender el servidor:*

- ng serve

# Java: 🎰

*Listar versiones de JDK (LTS)*

- sdk list java

*Instalar una versión de JDK según la lista anterior, por ejemplo:*

- sdk install java 17.0.11-jbr

*Para activar el microservicio de java*

- mvn spring-boot:run
  
*Para crear un jar de java ejecutable*
- mvn clean package -DskipTests 

# Swagger: 🌀
*Para localhost:*

- http://localhost:8085/swagger-ui.html (Swagger  Local)
  
*Para url de codespace o WebIDE's*

- https://redesigned-space-broccoli-qjrvxv9996v2rj7-8085.app.github.dev/webjars/swagger-ui/index.html#/
  
usarlo desde el path {URL_BRINDADA}/webjars/swagger-ui/index.html#/

# Kubernetes: 🧿⚙️

consultar versión de minikube
  
-  minikube version

iniciar clúster kubernetes
  
- minikube start

listar namespace
  
- kubectl get namespace
- kubectl get ns

crear un namespace "juan" por comando
  
- kubectl create namespace juan

crear un namespace "juan" por comando y un "namespace.yml"
  
- kubectl apply -f namespace.yml

consultar namespace en uso por "default"
  
- kubectl config view --minify | grep namespace

cambiar un namespace en uso por "default" a "juan"
  
- kubectl config set-context --current --namespace=juan

consultar todos los recursos de un namespace "juan"
  
- kubectl get all -n juan

consultar todos los recursos y secret de un namespace "juan"
  
- kubectl get all,secrets -n juan

listar services del namespace "juan"
  
- minikube service content-moderator-be -n juan
- minikube service list

probar el microservicio dentro del clúster con curl
  
- curl http://192.168.49.2:30001/ms_content_moderator
- curl http://192.168.49.2:30001/ms_content_moderator/id/1

crear un túnel de puerto la máquina local (host) y el clúster de Kubernetes
- kubectl port-forward service/content-moderator-be 8085:30001

ver los logs del pod (logs del proyecto)
- kubectl logs nombre-pod
