API REST - Agricultura Extremeña

Esta aplicación de Spring Boot gesiona una API REST que permite gestionar cultivos relacionados con la práctica que ya realicé sobre que cultivamos en mi familia

Para la creación he utilizado la aplicación de POSTMAN

He utilizado los cuatro métodos medidos: 

| Método | Ruta                        | Cuerpo JSON                                                           | Descripción                          | Respuesta |
|--------|-----------------------------|----------------------------------------------------------------------|--------------------------------------|-----------|
| POST   | `/api/cultivos`             | `{ "nombre": "Arroz", "tipoRiego": "innundación", "hectareas": 20 }` | Crear nuevo cultivo                  | 201 Created |
| GET    | `/api/cultivos/Arroz`       | –                                                                    | Obtener cultivo por nombre                                   | 200 OK / 404 Not Found |
| PUT    | `/api/cultivos/Arroz`       | `{ "nombre": "Arroz", "tipoRiego": "inundación", "hectareas": 60 }` |  Actualizar cultivo                     | 200 OK / 404 |
| DELETE | `/api/cultivos/Arroz`       | – 

He utilizado métodos vistos en clase como el @NotBlank:
        @NotBlank(message = "El tipo de riego es obligatorio")
        String tipoRiego,


Autor: Alberto Loro Parras

Práctica 4: API REST
