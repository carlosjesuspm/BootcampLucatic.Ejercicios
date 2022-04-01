const express = require('express');
const port = 3000;
const app = express();

//Middleware
app.get('/users', (req, res, next) => {
    try {
        throw new Error('There was an error getting the users');
    } catch (err) {
        //Permite capturar el error, pero deja seguir ejecutando el código
        next(err);
    }
});

//Midleware similar al anterior pero con promesas
/*
app.get('/users', function(req, res, next) {
    Promise.resolve().then(function() {
            throw new Error('There was an error getting the users')
        }).catch(next) // Errors will be passed to Express.
})
*/

//Middleware
app.get('/books', (req, res, next) => {
    try {
        throw new Error('There was an error getting the books');
    } catch (err) {
        next(err);
    }
});

function handleErrors(err, req, res, next) {
    console.log(err);
    res.status(500).send(err + 'An internal server error occurred');
    //res.status(500).send({err: 'An internal server error occurred'});
};

app.use(handleErrors);


app.listen(port, () => {
    console.log(`Server listening on port ${port}`);
});