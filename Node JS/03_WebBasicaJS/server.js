var http = require("http");

function iniciar(route, handle) {
    function onRequest(request, response) {
        const baseURL = request.protocol + '://' + request.headers.host + '/';
        const reqUrl = new URL(request.url, baseURL);
        const pathname = reqUrl.pathname;
        console.log("--------------------------------");
        console.log("Peticion para " + pathname + " recibida.");

        route(handle, pathname, response);
    }

    http.createServer(onRequest).listen(8081);
    console.log("Servidor Iniciado.");
}

exports.iniciar = iniciar;
