/* ECMA Script prevede 8 tipti di dati:

7 tipi di dati primitivi:

   1 Boolean. true e false.
   2 null. Una parola chiave speciale che indica un valore nullo. (Perché JavaScript è case-sensitive, nullNon è la stessa cosa di Null, NULL, o qualsiasi altra variante.)
   3 undefined. Una proprietà di primo livello il cui valore non è definito.
   4 Number. un numero intero o float. es: 42 o 3.14159.
   5 BigInt. Un numero intero con precisione arbitraria. es: 9007199254740992n.
   6 String. una sequenza di caratteri che rappresenta un valore testuale. es: "ciao", "Luca".
   7 Symbol. Un tipo di dati le cui istanze sono uniche e immutabili

un tipo di dato non primitivo:

   8 Object. Una collezione di proprietà, e una proprietà è un'associazione tra un nome (o chiave) e un valore.
   
   Sebbene questi tipi di dati siano relativamente pochi, consentono di eseguire operazioni utili con le applicazioni.
   
   Le funzioni sono gli altri elementi fondamentali del linguaggio. Mentre le funzioni sono tecnicamente un tipo di oggetto,
    puoi pensare agli oggetti come contenitori denominati per i valori e alle funzioni come procedure che il tuo script può eseguire.
*/

//riassegnazione possibile all'interno del blocco:
if(true){
    let x = "luca";
    x = 14;         //x: riassegnabile all'interno del blocco
    console.log(x);
}
//DICHIARAZIONE DI VARIABILI DI TIPO DIVERSO
if (true){
    let isAcceso = false;
    let nullValue = null;
    let undefinedValue; //valore: undefined
    let numberValue = 42;
    let bigIntValue = 9007199254740992n;
    let stringValue = "Ciao, mondo!";
    let symbolValue = Symbol("id");
    let objectValue = { nome: "Luca", eta: 25 };
    console.log(isAcceso, nullValue, undefinedValue, numberValue, bigIntValue, stringValue, symbolValue, objectValue);
}

if (true){
    let a = 42;    
    a = "Luca";
    console.log(a); 
    //Output: Luca
    //In JavaScript, le variabili sono dinamicamente tipizzate, 
    // il che significa che puoi assegnare valori di tipi diversi alla stessa variabile nel corso del tempo.
    }

    


