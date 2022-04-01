var http = require("http");

var url = require("url");

function iniciar() {

    function onRequest(request, response) {

        // Obtiene protocolo http y host 8081
        const baseURL = request.protocol + '://' + request.headers.host + '/';
        const reqUrl = new URL(request.url, baseURL);
        console.log("---- " + request.url);
        const pathname = reqUrl.host;
        console.log("Petición para " + pathname + " recibida.");
        console.log(reqUrl);
        response.writeHead(200, { "Content-Type": "text/html" });
        response.write("Ejemplo 02: Hola Mundo Server URL Module");
        response.end();


    }

    http, http.createServer(onRequest).listen(8081);
    console.log("Servidor iniciado");
}

exports.iniciar = iniciar; 
