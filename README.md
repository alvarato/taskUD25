# taskUD25
GET http://localhost:8181/articulos/findAll

GET http://localhost:8181/fabricantes/findAll

PUT http://localhost:8181/fabricantes/delete1

PUT http://localhost:8181/articulos/delete1

PUT  http://localhost:8181/fabricantes/create    {"codigo": 4,"nombre": "DELL"}

PUT   http://localhost:8181/articulos/create  {"codigo": 6,"nombre": "Pantalla LCD","precio": 300,"fabricante": {"codigo": 2}}

PUT  http://localhost:8181/fabricantes/update    {"codigo": 4,"nombre": "DELL"}

PUT   http://localhost:8181/articulos/update  {"codigo": 6,"nombre": "Pantalla LCD","precio": 300,"fabricante": {"codigo": 2}}
