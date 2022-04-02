// test-5.js
//Usaremos JEST para ejecutarlo
//npm run test


const { suma, resta } = require('./funcionesMatematicas')

test('Suma 2 números positivos correctamente', () => {
    const resultado = suma(2, 3)
    const esperado = 5
    //Expresiones Jest
    expect(resultado).toBe(esperado)
})

test('Resta 2 números positivos correctamente', () => {
    const resultado = resta(8, 3)
    const esperado = 5
    expect(resultado).toBe(esperado)
})