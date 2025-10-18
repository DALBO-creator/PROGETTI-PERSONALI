/**
 * ==========================================================
 * CONVERSIONE DA STRINGA A NUMERO IN JAVASCRIPT
 * ==========================================================
 * * Ci sono tre metodi principali per convertire stringhe che
 * rappresentano numeri in veri tipi numerici in JavaScript.
 */

// Stringhe di esempio da convertire
let stringaIntera = "42";
let stringaDecimale = "3.14";
let stringaMista = "42 euro e 50 centesimi";
let stringaBinaria = "101";


// ----------------------------------------------------------
// 1. parseInt() - Converte in numero INTERO
// ----------------------------------------------------------
/*
 * - Utilizzo: Restituisce la parte intera del numero.
 * - Comportamento: Legge la stringa da sinistra e si ferma
 * al primo carattere non numerico.
 */
console.log("--- parseInt() ---");
console.log(parseInt(stringaIntera));   // 42 (Converte l'intera stringa)
console.log(parseInt(stringaDecimale));  // 3 (Ignora i decimali)
console.log(parseInt(stringaMista));     // 42 (Si ferma allo spazio ' ')


// ----------------------------------------------------------
// 2. parseFloat() - Converte in numero DECIMALE (floating-point)
// ----------------------------------------------------------
/*
 * - Utilizzo: Restituisce il numero, gestendo il punto decimale.
 * - Comportamento: Simile a parseInt(), ma riconosce il primo
 * punto decimale come parte del numero.
 */
console.log("\n--- parseFloat() ---");
console.log(parseFloat(stringaDecimale)); // 3.14 (Converte il numero decimale)
console.log(parseFloat(stringaMista));    // 42 (Si ferma allo spazio ' ')
console.log(parseFloat("42.50 euro"));   // 42.5 (Gestisce i decimali e si ferma)


// ----------------------------------------------------------
// 3. Number() - Casting Rigoroso
// ----------------------------------------------------------
/*
 * - Utilizzo: Converte un intero valore o variabile nel tipo Number.
 * - Comportamento: È il metodo più rigoroso. Funziona solo se
 * l'intera stringa è un numero valido (intero o decimale).
 * - Risultato: Restituisce NaN (Not a Number) se la stringa
 * contiene caratteri non numerici (es. spazi, lettere).
 */
console.log("\n--- Number() ---");
console.log(Number(stringaIntera));       // 42 (Intero)
console.log(Number(stringaDecimale));     // 3.14 (Decimale)
console.log(Number(stringaMista));        // NaN (La stringa contiene ' euro...')


// ----------------------------------------------------------
// 4. PARTE CRUCIALE: Il Radix in parseInt()
// ----------------------------------------------------------
/*
 * Il 'radix' (o base) è il secondo parametro OPZIONALE di parseInt().
 * Specifica il sistema numerico (base) in cui interpretare la stringa.
 * * Esempi di Radix comuni:
 * 2: Binario (base 2)
 * 8: Ottale (base 8)
 * 10: Decimale (base 10) <-- IL PIÙ USATO PER LA CONVERSIONE NORMALE
 * 16: Esadecimale (base 16)
 */
console.log("\n--- Radix in parseInt() ---");

// Esempio Pratico: Conversione da Binario (base 2) a Decimale (base 10)
// La stringa "101" in base 2 è: (1 * 2^2) + (0 * 2^1) + (1 * 2^0) = 4 + 0 + 1 = 5
console.log(parseInt(stringaBinaria, 2)); // 5

// Esempio: Conversione da Esadecimale (base 16) a Decimale (base 10)
console.log(parseInt("FF", 16));          // 255 (FF in esadecimale)

// Esempio: Conversione in base decimale standard (radix 10)
console.log(parseInt(stringaIntera, 10)); // 42 (Uso corretto per numeri standard)

/*
 * BUONA PRATICA: INCLUDERE SEMPRE IL RADIX 10!
 * * Ragione: Nelle vecchie versioni di JavaScript (e in certi contesti ambigui)
 * se la stringa iniziava con '0' e il radix era omesso, poteva essere
 * interpretata erroneamente come un numero OTTALE (base 8).
 */
let stringaPericolosa = "010";

// Comportamento non sicuro (radix omesso): Potrebbe essere 8 o 10
// console.log(parseInt(stringaPericolosa));

// Comportamento SICURO e RACCOMANDATO (forza la base 10)
console.log("Comportamento sicuro con radix 10:");
console.log(parseInt(stringaPericolosa, 10)); // 10 (Senza ambiguità)