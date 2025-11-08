# Guía para ejecutar la base de datos con Docker y conectarla al proyecto

Esta guía explica cómo iniciar la base de datos PostgreSQL en Docker y cómo conectar la aplicación Spring Boot.

## 1. Requisitos

* Docker instalado
* Docker Compose instalado
* Proyecto clonado

## 2. Archivo `docker-compose.yml`

Este es el arhivo encargado de crear la base de datos, aségurese de tenerlo. Si tiene problemas con los puertos, desde este archivo lo puede cambiar

```yaml
version: '3.9'

services:
  postgres:
    image: postgres:15
    container_name: concesionario_db
    restart: always
    environment:
      POSTGRES_USER: admin
      POSTGRES_PASSWORD: 1234
      POSTGRES_DB: concesionario
    ports:
      - "5433:5432"
    volumes:
      - ./DataBase/init:/docker-entrypoint-initdb.d
      - concesionario_data:/var/lib/postgresql/data

volumes:
  concesionario_data:

```

## 3. Arrancar la base de datos

Primero se debe situar en la raiz del proyecto, luego desde una consola, ejecutar el siguiente comando:

```
docker compose up -d
```

## 4. Verificar estado

Para verificar que este en funcionamiento, ejecute el siguiente comando:

```
docker ps
```

Debe aparecer el contenedor `concesionario_db`.

## 5. Conectarse a PostgreSQL (opcional)

Para comprobar que todo este correcto, puede ejecutar el siguiente comando para entrar en la base de datos:

```
docker exec -it concesionario_db psql -U admin -d concesionario
```

Para salir solo basta con escribir exit

## 6. Conectar con pgAdmin u otra herramienta

Tiene que registrar un nuevo servidor, al que le debe coloca en la parte de connection los siguiente:

* Host: `localhost`
* Puerto: `5433`
* Usuario: `admin`
* Contraseña: `1234`
* Base de datos: `concesionario`

## 7. Apagar la base de datos

```
docker stop biblioteca_db
```

## 8. Si deseas borrar datos completamente

detener contenedor:

```
docker compose down
```

borrar volumen:

```
docker volume rm nombre_del_volumen
```
