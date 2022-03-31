//Body parser
//permite tener acceso al objeto req.body cuando haces una peticion post

// 1 Se instala la librería body parser

var express = require('express');
var app = express();

//bodyParser es un módulo como cualquier otro así que debes declararlo con var y cargar el módulo con require
var bodyParser = require('body-parser');

/*Cualquier formato en el que llegue la información el body-parser
permite entenderlo*/
// parse application/json
app.use(bodyParser.json());
// parse application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({ extended: false }));
// parse the raw data
app.use(bodyParser.raw());
// parse text
app.use(bodyParser.text());

var formulario = '<form method="post" action="/saludo">' +
    '<label for="nombre">¿Cómo te llamas? </label>' +
    '<input type="text" name="nombre" id="nombre">' +
    '<input type="submit" value="Enviar"/>' +
    '</form>';

var cabecera = '<h1>Saludo</h1>';

app.get('/saludo', function (req, res) {

    res.send('<html><body>' +
        cabecera +
        formulario +
        '</html></body>'
    );

});

app.post('/saludo', function (req, res) {

    var nombre = req.body.nombre || '';
    var saludo = '';

    if (nombre != '')
        saludo = "Bienvenido " + nombre;

    res.send('<html><body>' +
        cabecera +
        '<p>' + saludo + '</p>' +
        formulario +
        '</html></body>'
    );

});



app.get('/', function (req, res) {
    res.send("Llama a localhost:8080/saludo.. anda chato");
    res.send('Esto no lo ves. Fallan las cabecera que no incluyes');
});


app.listen(8081, function () {
    console.log('Escuchando por el puerto 8081');
});