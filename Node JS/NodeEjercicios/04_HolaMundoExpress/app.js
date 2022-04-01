
// Indicación para trabajar con express
var express = require('express');

// Se guarda la función en una variable
var app = express();

// Se realiza petición de tipo get /
app.get('/', function (req, res) {
    res.send('Hola a todos');
});

// Petición get / prueba
app.get('/prueba', function (req, res) {
    res.send('{"results":[{"gender":"female","name":{"title":"Miss","first":"سوگند","last":"نكو نظر"},"location":{"street":{"number":7040,"name":"آیت الله طالقانی"},"city":"خمینی‌شهر","state":"آذربایجان غربی","country":"Iran","postcode":51174,"coordinates":{"latitude":"30.7455","longitude":"168.4320"},"timezone":{"offset":"0:00","description":"Western Europe Time, London, Lisbon, Casablanca"}},"email":"swgnd.nkwnzr@example.com","login":{"uuid":"8c17b050-7e3c-4419-9ac5-ca40f70b4d5e","username":"goldenrabbit684","password":"september","salt":"6oXsgLeN","md5":"8737d654bb1aea4b4afae7eb6fb30299","sha1":"af38c0ed6808df7ed34cc2603a4e6bf096b932d8","sha256":"12d6b50a323e3a88a9fbcda1eba3bd4c484cf33ad012b8c6a8b36ab83d998d3a"},"dob":{"date":"1960-01-09T02:35:44.497Z","age":62},"registered":{"date":"2002-11-09T08:28:25.898Z","age":20},"phone":"040-72839552","cell":"0983-212-2786","id":{"name":"","value":null},"picture":{"large":"https://randomuser.me/api/portraits/women/95.jpg","medium":"https://randomuser.me/api/portraits/med/women/95.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/95.jpg"},"nat":"IR"}],"info":{"seed":"2ee04d1d842f750a","results":1,"page":1,"version":"1.3"}}');
});

//Escuchar por el puerto 8080
app.listen(8081, function () {
    console.log('Escuchando por el puerto 8080');
});