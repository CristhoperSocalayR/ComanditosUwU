# 🚀 Developer Command Hub - ComanditosUwU

> Una colección completa de comandos esenciales para desarrollo moderno. Tu guía de referencia rápida para todas las tecnologías.

[![Made with ❤️](https://img.shields.io/badge/Made%20with-❤️-red.svg)](https://github.com/yourusername)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](http://makeapullrequest.com)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## 📋 Tabla de Contenidos

- [🔮 Gestión de Puertos](#-gestión-de-puertos)
- [🐳 Docker](#-docker)
- [🐳 Docker Compose](#-docker-compose)
- [🚀 Angular](#-angular)
- [⚛️ React](#️-react)
- [💚 Vue.js](#-vuejs)
- [🎰 Java](#-java)
- [🟢 Node.js](#-nodejs)
- [🌀 Swagger](#-swagger)
- [🧿 Kubernetes](#-kubernetes)
- [📦 Git & GitHub](#-git--github)
- [🔄 Git Flow](#-git-flow)
- [🎯 Utilidades Base64](#-utilidades-base64)
- [💾 Base de Datos](#-base-de-datos)

---

## 🔮 Gestión de Puertos

### Ver procesos en puerto específico
```bash
sudo lsof -i :8085
```
> Muestra qué procesos están usando el puerto 8085

### Terminar proceso por PID
```bash
kill -9 <PID>
```
> Termina forzadamente un proceso usando su ID

### Ver todos los puertos en uso
```bash
netstat -tulpn | grep LISTEN
```
> Lista todos los puertos que están escuchando conexiones

---

## 🐳 Docker

### Comandos Básicos
```bash
# Ver contenedores activos
docker ps

# Ver todos los contenedores (activos e inactivos)
docker ps -a

# Ver imágenes disponibles
docker images

# Descargar una imagen
docker pull <imagen:tag>
```

### Gestión de Contenedores
```bash
# Crear y ejecutar contenedor
docker run -d --name <nombre_contenedor> -p <puerto_local>:<puerto_contenedor> <imagen>

# Iniciar contenedor detenido
docker start <nombre_contenedor>

# Detener contenedor
docker stop <nombre_contenedor>

# Eliminar contenedor
docker rm <nombre_contenedor>

# Conectarse a contenedor en ejecución
docker exec -it <nombre_contenedor> /bin/bash
```

### Construcción y Limpieza
```bash
# Construir imagen local
docker build -t <nombre_imagen> .

# Construir imagen con usuario
docker build -t <usuario/nombre_imagen> .

# Ver logs de contenedor
docker logs <nombre_contenedor>

# Inspeccionar contenedor
docker inspect <nombre_contenedor>

# Limpiar contenedores detenidos
docker container prune

# Limpiar imágenes no utilizadas
docker image prune -a

# Limpiar todo el sistema
docker system prune -a --volumes
```

---

## 🐳 Docker Compose

### Comandos Esenciales
```bash
# Levantar servicios (detached)
docker-compose up -d

# Levantar servicios (con logs)
docker-compose up

# Detener servicios
docker-compose down

# Ver logs de todos los servicios
docker-compose logs

# Ver servicios activos
docker-compose ps

# Reconstruir servicios
docker-compose up --build

# Eliminar todo (contenedores, redes, volúmenes, imágenes)
docker-compose down --rmi all --volumes
```

---

## 🚀 Angular

### Gestión de Versiones
```bash
# Listar versiones disponibles
npm show @angular/cli dist-tags

# Instalar versión específica de Angular CLI
npm install -g @angular/cli@17.3.8

# Ver versión actual
ng version

# Actualizar Angular CLI globalmente
npm update -g @angular/cli
```

### Creación y Gestión de Proyectos
```bash
# Nuevo proyecto con módulos (tradicional)
ng new <nombre_proyecto> --standalone false

# Nuevo proyecto standalone (moderno)
ng new <nombre_proyecto>

# Nuevo proyecto con routing y SCSS
ng new <nombre_proyecto> --routing --style=scss

# Instalar dependencias
npm install

# Ejecutar servidor de desarrollo
ng serve

# Ejecutar en puerto específico
ng serve --port 4200
```

### Generación de Código
```bash
# Generar servicio
ng generate service <nombre_servicio>

# Generar componente
ng generate component <nombre_componente>

# Generar módulo
ng generate module <nombre_modulo>

# Generar guard
ng generate guard <nombre_guard>

# Generar pipe
ng generate pipe <nombre_pipe>

# Build para producción
ng build --prod
```

---

## ⚛️ React

### Creación de Proyectos
```bash
# Crear nuevo proyecto React
npx create-react-app <nombre_proyecto>

# Crear proyecto con TypeScript
npx create-react-app <nombre_proyecto> --template typescript

# Crear proyecto con Vite (más rápido)
npm create vite@latest <nombre_proyecto> -- --template react

# Navegar al proyecto
cd <nombre_proyecto>
```

### Comandos de Desarrollo
```bash
# Iniciar servidor de desarrollo
npm start

# Ejecutar tests
npm test

# Build para producción
npm run build

# Instalar dependencias
npm install

# Instalar dependencia específica
npm install <paquete>

# Instalar dependencia de desarrollo
npm install --save-dev <paquete>
```

### React con Next.js
```bash
# Crear proyecto Next.js
npx create-next-app@latest <nombre_proyecto>

# Con TypeScript
npx create-next-app@latest <nombre_proyecto> --typescript

# Ejecutar en desarrollo
npm run dev

# Build para producción
npm run build

# Iniciar en producción
npm start
```

---

## 💚 Vue.js

### Instalación y Configuración
```bash
# Instalar Vue CLI globalmente
npm install -g @vue/cli

# Ver versión de Vue CLI
vue --version

# Crear nuevo proyecto
vue create <nombre_proyecto>

# Crear proyecto con interfaz gráfica
vue ui
```

### Gestión de Proyectos Vue
```bash
# Ejecutar servidor de desarrollo
npm run serve

# Build para producción
npm run build

# Ejecutar tests
npm run test:unit

# Linting del código
npm run lint

# Agregar plugin
vue add <plugin>
```

### Vue 3 con Vite
```bash
# Crear proyecto Vue 3 con Vite
npm create vue@latest <nombre_proyecto>

# Navegar al proyecto
cd <nombre_proyecto>

# Instalar dependencias
npm install

# Ejecutar en desarrollo
npm run dev

# Build para producción
npm run build
```

---

## 🎰 Java

### Gestión de Versiones Java (SDKMAN)
```bash
# Listar versiones disponibles de JDK
sdk list java

# Instalar versión específica
sdk install java 17.0.11-jbr

# Usar versión específica
sdk use java 17.0.11-jbr

# Ver versión actual
java -version
```

### Maven Commands
```bash
# Ejecutar aplicación Spring Boot
mvn spring-boot:run

# Crear JAR ejecutable
mvn clean package -DskipTests

# Ejecutar tests
mvn test

# Limpiar proyecto
mvn clean

# Compilar proyecto
mvn compile

# Instalar dependencias
mvn clean install

# Ver dependencias del proyecto
mvn dependency:tree
```

### Gradle Commands
```bash
# Ejecutar aplicación
./gradlew bootRun

# Build del proyecto
./gradlew build

# Ejecutar tests
./gradlew test

# Limpiar proyecto
./gradlew clean
```

---

## 🟢 Node.js

### Gestión de Versiones (NVM)
```bash
# Instalar versión específica de Node
nvm install 18.17.0

# Usar versión específica
nvm use 18.17.0

# Listar versiones instaladas
nvm list

# Ver versión actual
node --version
```

### NPM Commands
```bash
# Inicializar proyecto
npm init -y

# Instalar dependencias
npm install

# Instalar paquete globalmente
npm install -g <paquete>

# Actualizar dependencias
npm update

# Ver paquetes desactualizados
npm outdated

# Ejecutar script personalizado
npm run <script>
```

---

## 🌀 Swagger

### URLs de Acceso
```bash
# Swagger UI Local
http://localhost:8085/swagger-ui.html

# Swagger UI para Codespaces/WebIDE
https://<tu-url-base>/webjars/swagger-ui/index.html#/

# Documentación API en formato JSON
http://localhost:8085/v2/api-docs
```

---

## 🧿 Kubernetes

### Minikube
```bash
# Ver versión de minikube
minikube version

# Iniciar clúster
minikube start

# Detener clúster
minikube stop

# Ver estado del clúster
minikube status

# Dashboard de Kubernetes
minikube dashboard
```

### Gestión de Namespaces
```bash
# Listar namespaces
kubectl get namespaces
kubectl get ns

# Crear namespace
kubectl create namespace <nombre>

# Aplicar desde archivo YAML
kubectl apply -f namespace.yml

# Ver namespace actual
kubectl config view --minify | grep namespace

# Cambiar namespace activo
kubectl config set-context --current --namespace=<nombre>
```

### Gestión de Recursos
```bash
# Ver todos los recursos de un namespace
kubectl get all -n <namespace>

# Ver recursos y secretos
kubectl get all,secrets -n <namespace>

# Describir recurso específico
kubectl describe <tipo> <nombre>

# Ver logs de un pod
kubectl logs <nombre-pod>

# Conectarse a un pod
kubectl exec -it <nombre-pod> -- /bin/bash
```

### Port Forwarding y Servicios
```bash
# Crear túnel de puerto
kubectl port-forward service/<servicio> <puerto-local>:<puerto-servicio>

# Listar servicios con minikube
minikube service list

# Exponer servicio
minikube service <nombre-servicio> -n <namespace>
```

---

## 📦 Git & GitHub

### Configuración Inicial
```bash
# Configurar nombre de usuario
git config --global user.name "Tu Nombre"

# Configurar email
git config --global user.email "tu@email.com"

# Ver configuración actual
git config --list

# Inicializar repositorio
git init
```

### Comandos Básicos de Git
```bash
# Ver estado del repositorio
git status

# Añadir archivos al staging
git add .
git add <archivo>

# Hacer commit
git commit -m "Mensaje del commit"

# Ver historial de commits
git log
git log --oneline

# Ver diferencias
git diff
git diff --staged
```

### Trabajo con Ramas
```bash
# Listar ramas
git branch

# Crear nueva rama
git branch <nombre-rama>

# Cambiar a una rama
git checkout <nombre-rama>

# Crear y cambiar a nueva rama
git checkout -b <nombre-rama>

# Eliminar rama local
git branch -d <nombre-rama>

# Eliminar rama remota
git push origin --delete <nombre-rama>
```

### Trabajo con Remotos
```bash
# Añadir origen remoto
git remote add origin <url-repositorio>

# Ver remotos configurados
git remote -v

# Subir cambios
git push origin <rama>

# Subir y establecer upstream
git push -u origin <rama>

# Bajar cambios
git pull origin <rama>

# Clonar repositorio
git clone <url-repositorio>

# Obtener cambios sin merge
git fetch
```

### Comandos Avanzados
```bash
# Combinar ramas
git merge <rama>

# Rebase interactivo
git rebase -i HEAD~3

# Stash (guardar cambios temporalmente)
git stash
git stash pop
git stash list

# Deshacer último commit (mantener cambios)
git reset --soft HEAD~1

# Deshacer último commit (eliminar cambios)
git reset --hard HEAD~1

# Ver culpables de cada línea
git blame <archivo>

# Buscar en el código
git grep "<término-busqueda>"
```

---

## 🔄 Git Flow

Git Flow es una metodología que define un modelo de ramificación estricto diseñado alrededor del lanzamiento del proyecto.

### Instalación
```bash
# Instalar git-flow (Ubuntu/Debian)
sudo apt-get install git-flow

# Instalar git-flow (macOS)
brew install git-flow-avh

# Instalar git-flow (Windows con Git Bash)
# Descargar desde: https://github.com/nvie/gitflow/wiki/Windows
```

### Inicialización de Git Flow
```bash
# Inicializar git flow en el proyecto
git flow init

# Usar configuración por defecto
git flow init -d
```

### Trabajar con Features (Características)
```bash
# Iniciar nueva feature
git flow feature start <nombre-feature>

# Finalizar feature (merge a develop)
git flow feature finish <nombre-feature>

# Publicar feature en remoto
git flow feature publish <nombre-feature>

# Listar features
git flow feature list
```

### Trabajar con Releases (Lanzamientos)
```bash
# Iniciar nuevo release
git flow release start <version>

# Finalizar release (merge a master y develop)
git flow release finish <version>

# Publicar release
git flow release publish <version>
```

### Trabajar con Hotfixes (Correcciones Urgentes)
```bash
# Iniciar hotfix desde master
git flow hotfix start <version>

# Finalizar hotfix
git flow hotfix finish <version>
```

### Flujo Simplificado de Git Flow

1. **Desarrollo normal**: Trabaja en `develop`
2. **Nueva característica**: `git flow feature start mi-feature`
3. **Terminar característica**: `git flow feature finish mi-feature`
4. **Preparar lanzamiento**: `git flow release start 1.0.0`
5. **Finalizar lanzamiento**: `git flow release finish 1.0.0`
6. **Corrección urgente**: `git flow hotfix start 1.0.1`

---

## 🎯 Utilidades Base64

### Codificación
```bash
# Codificar string a Base64
echo -n "demo123" | base64

# Codificar archivo a Base64
base64 <archivo> > archivo_codificado.txt

# Codificar sin saltos de línea
echo -n "texto" | base64 -w 0
```

### Decodificación
```bash
# Decodificar string Base64
echo "OVJyaVZ5UDdjV1pH" | base64 --decode

# Decodificar archivo Base64
base64 --decode <archivo_codificado> > archivo_original
```

---

## 💾 Base de Datos

### MySQL
```bash
# Conectar a MySQL
mysql -u <usuario> -p

# Crear base de datos
mysql -u root -p -e "CREATE DATABASE mi_db;"

# Ejecutar script SQL
mysql -u <usuario> -p <database> < script.sql

# Hacer backup
mysqldump -u <usuario> -p <database> > backup.sql

# Restaurar backup
mysql -u <usuario> -p <database> < backup.sql
```

### PostgreSQL
```bash
# Conectar a PostgreSQL
psql -U <usuario> -d <database>

# Crear base de datos
createdb -U <usuario> <nombre_db>

# Hacer backup
pg_dump -U <usuario> <database> > backup.sql

# Restaurar backup
psql -U <usuario> -d <database> -f backup.sql
```

### MongoDB
```bash
# Iniciar MongoDB
mongod

# Conectar a MongoDB
mongo

# Hacer backup
mongodump --db <database> --out <directorio>

# Restaurar backup
mongorestore <directorio>
```

---

## 🤝 Contribuir

¿Encontraste un comando útil que no está aquí? ¡Las contribuciones son bienvenidas!

1. Fork el proyecto
2. Crea tu rama de feature (`git checkout -b feature/nuevo-comando`)
3. Commit tus cambios (`git commit -m 'Agregar nuevo comando'`)
4. Push a la rama (`git push origin feature/nuevo-comando`)
5. Abre un Pull Request

---

## 📝 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE.md](LICENSE.md) para detalles.

---

## ⭐ ¿Te gustó este README?

Si este README te fue útil, ¡dale una estrella al repositorio! ⭐

---

<div align="center">
  <p>Hecho con ❤️ por <a href="https://github.com/tu-usuario">ComanditosUwU</a></p>
  <p>¿Preguntas? <a href="https://github.com/tu-usuario/tu-repo/issues">Abrir un issue</a></p>
</div>
