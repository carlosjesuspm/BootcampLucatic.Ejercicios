// importar
var express = require('express');

// instanciar
var app = express();

//Indico la carpeta estática donde están los ficheros
//Puedes declarar todas las carpetas que quieras (cada una en una línea)
// http://expressjs.com/es/starter/static-files.html
// Si no lo declaro no se puede desde fuera llamar a algo que esté en esa carpeta
app.use(express.static('archivos'));

// ruteo
// hacemos uso de la variable __dirname creada automáticamente por Node
// contiene la ruta en la cuál se está ejecutando nuestro script.
app.get('/', function(req, res) {
    res.sendFile(__dirname + '/archivos/index.html');
});

app.get('/hola.txt', function(req, res) {
    res.send('Hola mundo');
});

app.get('/hola.html', function(req, res) {
    res.sendFile(__dirname + '/archivos/hola.html');
});

app.get('/hola.json', function(req, res) {
    // Indicamos el tipo de contenido a devolver en las cabeceras de nuestra respuesta
    res.contentType('application/json');
    res.sendFile(__dirname + '/archivos/hola.json');
});

app.get('/hola.xml', function(req, res) {
    // Indicamos el tipo de contenido a devolver en las cabeceras de nuestra respuesta
    res.contentType('application/xml');
    res.sendFile(__dirname + '/archivos/hola.xml');
});

// escuchar
app.listen(8080);

console.log("Servidor Express escuchando en modo %s", app.settings.env);