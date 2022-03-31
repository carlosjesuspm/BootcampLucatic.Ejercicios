const express = require('express');
const app = express();
const port = 3000;

// Middleware que verifica si el usuario es un administrador.
function isAdmin(req, res, next) {
    if (req.body.isAdmin) {
        next();
    } else {
        res.status(403).send(`You are not an admin. You don't have access to route ${req.url}`);
    }
}

// Permite recibir parámetros en formato JSON.
app.use(express.json());

// Se agrega el middleware en la aplicación. Lo agrega a todas las rutas
app.use(isAdmin);



// Ruta a la cual solo deben ingresar usuarios administradores.
app.get('/dashboard', (req, res) => {
    res.send('You are an admin');
});

//Para agregarlo a este endpoint, no indicamos la linea 18 y habria sigo algo como
// app.route('/dashboard').get(isAdmin, (req, res) => {
//      res.send('You are an admin');
// });


app.listen(port, () => {
    console.log(`Server listening on port ${port}`)
});