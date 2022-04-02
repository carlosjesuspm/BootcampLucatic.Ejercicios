const sum = require('./test01');
describe('Operaciones matemáticas suma', () => {
  test('adds 1 + 2 to equal 3', () => {
    expect(sum(1, 2)).toBe(3);
  });

  test('adds 3 + 5 to equal 8', () => {
    expect(sum(3, 5)).toBe(8);
  });

  test('adds 3 + -3 to equal 0', () => {
    expect(sum(3, -3)).toBe(0);
  });

  //Provocale un fallo
  test('adds 3 + -4 to equal -1', () => {
    expect(sum(3, -4)).toBe(-1);
  });
});