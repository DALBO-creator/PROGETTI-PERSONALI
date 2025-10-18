//In espressioni che coinvolgono valori numerici e stringa con il +operatore,
//  JavaScript converte i valori numerici in stringhe. Ad esempio, si consideri le seguenti affermazioni:

x = "La risposta è " + 42; // "La risposta è 42"
y = 42 + " è la risposta"; // "42 è la risposta"
z = "37" + 7; // "377"
console.log(x);
console.log(y);
console.log(z);

//Con tutti gli altri operatori, JavaScript non converte i valori numerici in stringhe. Per esempio:
console.log("37" - 7); // 30
console.log("37" * 2); // 74
console.log("37" / 2); // 18.5 
console.log("37" % 2); // 1

//In questi esempi, JavaScript converte le stringhe in valori numerici.
// Se la stringa non può essere convertita in un numero valido, il risultato è NaN (Not a Number).
console.log("ciao" - 7); // NaN
console.log("ciao" * 2); // NaN
console.log("ciao" / 2); // NaN
console.log("ciao" % 2); // NaN  
console.log(NaN + 5); // NaN

let stringaIntera = "42";
let stringaDecimale = "3.14";
let stringaMista = "42 euro";


