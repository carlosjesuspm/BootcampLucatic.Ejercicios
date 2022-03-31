// Para instalar express
// $ npm install express --save


var express = require('express');
var app = express();
//Node es javascript y en javascript todas las variables deben ser declaradas eso incluye a los //módulos de tu aplicación. 
//bodyParser es un módulo como cualquier otro así que debes declararlo con var y cargar el módulo con require
var bodyParser = require('body-parser');

//Ahora vamos a leer ficheros externos
var fs = require('fs');

//En el caso de Express se cuenta con un middleware llamado body-parser el cual nos ayudará a //acceder al contenido del cuerpo de los mensajes.
//Para instalar el middleware body-parser en nuestra aplicación lo hacemos mediante npm.
//$ npm install body-parser

// parse application/json
app.use(bodyParser.json());
// parse application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({
    extended: false
}));
// parse the raw data
app.use(bodyParser.raw());
// parse text
app.use(bodyParser.text());


app.get('/saludo', function(req, res) {

    fs.readFile('./entrada.html', 'utf8', function(err, data) {
        if (err) {
            console.log(err)
        } else {
            //Para volcar el contenido
            //console.log(data);
            res.send(data);
        }
    });
});


app.post('/saludo', function(req, res) {

    var nombre = req.body.nombre || '';
    var saludo = '';

    if (nombre != '')
        saludo = "Estupendo " + nombre + ". Es un placer conocerte";

    res.send('<html><body><p>' + saludo + '</p></html></body>');

});


app.get('/', function(req, res) {
    res.send("Llama a localhost:8080/saludo.. anda chato");
    res.send('Hola a todos');
});


app.listen(8080, function() {
    console.log('Escuchando por el puerto 8080');
});