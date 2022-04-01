const { write } = require("fs");
var http = require("http");

function control(req, resp) {

    /*Si se inicia correctamente la respuesta tiene
    - Cabecera: con respuesta*/
    resp.writeHead(200, { "Content-Type": "text/html" });

    // Cuerpo
    resp.write("Ejemplo 1: Hola Mundo");

    // Por último, se finaliza
    resp.end();

}

// Creación del servidor pasándole la función control cuando escuche el puerto indicado
http, http.createServer(control).listen(8081);
console.log("Servidor iniciado");