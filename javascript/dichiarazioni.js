/* 
let: per variabili che cambiano valore
const: per tutto il resto (default consigliato)
let e const vivono solo all'interno del blocco {}
var: sconsigliato variabili vivono anche all'esterno del blocco
*/ 

if(true){
    let x = "luca";
    x = 14;         //x: riassegnabile all'interno del blocco
    console.log(x);
}

/* 
    if(true){
    let x = "luca";
   }
console.log(x);
ERRORE: X NON è DEFINITA --> console.log(x); viene chiamato fuori dal blocco if 
*/

if(true){
    const x = "ciao";
    //x = 14;         //x: non è riassegnabile (const--->costante)
    // ERROE: ASSIGNMENT TO CONSTANT VARIABLE
    console.log(x);
}

if (true){
let x; //valore:undefined ( non viene inizalizzata) --> si può inizalizzare successivamente alla sua dichiarazione
console.log(x); //stampa "undefined"
}

//const y; // SyntaxError: Missing initializer in const declaration (la variabile non viene inizializzata)
//non si può inizializzare dopo la sua dichiarazione;

if (true) {
  var z = 5;
}
console.log(z); // z is 5

//HOISTING:
if (true){
console.log(x); // stampa: undefined (la variabile esiste, ma non ha ancora un valore)
var x = 5;
}
//equivalente di:
if (true){
var x;          // dichiarazione “alzata” all'inizio
console.log(x); // undefined
x = 5;          // assegnazione dopo
}

//funziona anche con LET e CONST, ma interviene la TDZ (zona morta temporale):
/*
if (true){
console.log(y); // Errore! y non può essere usata prima della dichiarazione (sei nella TDZ)
let y = 10;
}
*/

//Dichiarazioni globali:
// In un browser, le variabili globali diventano proprietà dell'oggetto window
// In Node.js, le variabili globali diventano proprietà dell'oggetto global
// In entrambi i casi, globalThis fornisce un modo standard per accedere all'oggetto globale indipendentemente dall'ambiente
require("./globals.js");        // importa il file globals.js   require() funzione usata per importare moduli (altri file JavaScript).      
                                //                              "./globals.js" è il percorso relativo del file da importare.
console.log(globalThis.nome); // "Luca"
console.log(globalThis.cognome); // "Rossi"
console.log(globalThis.eta); // 25   






