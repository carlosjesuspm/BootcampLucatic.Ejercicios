// Se recogen en variables los otros módulos que se quieran usar
var server = require("./server");
var router = require("./router");
var requestHandlers = require("./requestHandlers");

// Cada sentencia corresponde a las páginas web que componen el proyecto
var handle = {}
handle["/"] = requestHandlers.iniciar;
handle["/iniciar"] = requestHandlers.iniciar;
handle["/respuesta"] = requestHandlers.respuesta;

server.iniciar(router.route, handle);