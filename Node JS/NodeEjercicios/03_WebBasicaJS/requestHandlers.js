function iniciar(response) {
    console.log("Se ha llamado al handler para peticiones 'iniciar'");

    var body = '<html>' +
        '<head>' +
        '<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />' +
        '</head>' +
        '<body>' +
        '<h1>Ejemplo 07</h1>' +
        '<form action="/respuesta" method="post">' +
        '<textarea name="text" rows="5" cols="30"></textarea><br/>' +
        '<input type="submit" value="Enviar texto" />' +
        '</form>' +
        '</body>' +
        '</html>';

    response.writeHead(200, { "Content-Type": "text/html" });
    response.write(body);
    response.end();
}

function respuesta(response) {
    console.log("Se ha llamado al handler para peticiones 'respuesta'");
    response.writeHead(200, { "Content-Type": "text/html" });
    response.write("<h1>Ejemplo 07 - respuesta</h1><br/>");
    response.write("Gracias por enviar la informacion");
    response.end();
}

exports.iniciar = iniciar;
exports.respuesta = respuesta;