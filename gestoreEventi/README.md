# 📘 Diario di Apprendimento JavaScript

Oggi ho iniziato a scrivere codice JavaScript per la prima volta. Ho creato due pagine:
- `index.html`: mostra gli eventi e permette di aggiungerli ai preferiti o acquistare biglietti
- `preferiti.html`: visualizza gli eventi salvati nei preferiti

Questo file tiene traccia di ciò che ho imparato, con spiegazioni semplici riga per riga.

---

## 🏠 index.html – Pagina principale

### 🔍 Selezione dei bottoni

```js
const favoriteButtons = document.querySelectorAll('.addToFavorite');
const ticketButtons = document.querySelectorAll('.buyTicket');
```

- `querySelectorAll()` seleziona tutti gli elementi con la classe indicata.
- `favoriteButtons` contiene tutti i bottoni "Aggiungi ai Preferiti".
- `ticketButtons` contiene tutti i bottoni "Acquista Biglietto".

---

### 🖱️ Ascolto del click

```js
button.addEventListener('click', () => {
   // codice da eseguire al click
});
```

- `addEventListener()` serve per ascoltare eventi (in questo caso, il click).
- Quando l’utente clicca, viene eseguita la funzione.

---

### 📦 Raccolta dati dell’evento

```js
const card = button.closest('.eventCard');
const paragraphs = card.querySelectorAll('p');
const eventData = {
   image: card.querySelector('img').src,
   title: card.querySelector('h2').textContent,
   date: paragraphs[0].textContent,
   location: paragraphs[1].textContent,
};
```

- `closest('.eventCard')`: trova il contenitore dell’evento.
- `querySelectorAll('p')`: prende tutti i paragrafi (data e luogo).
- `eventData`: oggetto che contiene i dati dell’evento.

---

### 💾 Salvataggio nei preferiti

```js
let preferiti = JSON.parse(localStorage.getItem('preferiti')) || [];
```

- `localStorage.getItem()`: legge i dati salvati nel browser.
- `JSON.parse()`: converte la stringa in array.
- Se non ci sono dati, usa `[]`.

---

### 🔁 Controllo duplicati

```js
const exists = preferiti.some(event =>
   event.title === eventData.title && event.date === eventData.date
);
```

- `.some()` controlla se esiste già un evento con lo stesso titolo e data.
- Restituisce `true` o `false`.
- `===` Controlla se due elementi sono uguali (anche il tipo della variabile, `==` Controlla se due elementi sono uguali, (anche tipo di variabile diverso).

📌 Alternativa: `.find()` restituisce l’elemento trovato, oppure si può usare un ciclo `for`.

---

### ✅ Aggiunta ai preferiti

```js
if (exists) {
   alert('Evento già presente nei preferiti!');
   return;
} else {
   preferiti.push(eventData);
   localStorage.setItem('preferiti', JSON.stringify(preferiti));
   alert('Evento aggiunto ai preferiti!');
}
```

- Se l’evento è già presente, mostra un messaggio.
- Altrimenti, lo aggiunge e lo salva.

---

### 🎟️ Acquisto biglietto

```js
let biglietti = JSON.parse(localStorage.getItem('biglietti')) || [];

const exist = biglietti.some(event =>
   event.title === eventData.title && event.date === eventData.date
);

if (exist) {
   alert('Biglietto già acquistato per questo evento!');
   return;
} else {
   biglietti.push(eventData);
   localStorage.setItem('biglietti', JSON.stringify(biglietti));
   alert('Biglietto acquistato con successo!');
}
```

- Salva i dati nella chiave `"biglietti"` di `localStorage`.
- Controlla se il biglietto è già stato acquistato.

---

## ⭐ preferiti.html – Visualizzazione dei preferiti

### 📤 Recupero dei dati

```js
const container = document.getElementById("favoriteContainer");
const preferiti = JSON.parse(localStorage.getItem("preferiti")) || [];
```

- Seleziona il contenitore dove mostrare gli eventi.
- Recupera i dati salvati nei preferiti.

---

### 📭 Controllo se ci sono eventi

```js
if (preferiti.length === 0) {
   container.innerHTML = "<p>Nessun evento tra i preferiti.</p>";
}
```

- Se l’array è vuoto, mostra un messaggio.

---

### 🧱 Creazione dinamica delle card

```js
preferiti.forEach(event => {
   const card = document.createElement("div");
   card.classList.add("eventCard");
   card.innerHTML = `
      <img src="${event.image}" alt="${event.title}">
      <h2>${event.title}</h2>
      <p>${event.date}</p>
      <p>${event.location}</p>
   `;
   container.appendChild(card);
});
```

- Per ogni evento:
  - Crea un `<div>` con classe `eventCard`
  - Inserisce i dati dell’evento
  - Lo aggiunge al contenitore

---

## 🧠 Concetti chiave appresi

- Selezione di elementi HTML con `querySelector` e `querySelectorAll`
- Ascolto degli eventi con `addEventListener`
- Creazione dinamica di elementi con `document.createElement`
- Manipolazione del DOM con `innerHTML` e `appendChild`
- Uso di `localStorage` per salvare e leggere dati
- Conversione tra oggetti e stringhe con `JSON.stringify` e `JSON.parse`
- Controllo dei duplicati con `.some()`

---

### 🔍 Svuotare la localStroage (resettare il sito e rimuovere i prefriti/biglitti acquistati)

- analizzare la pagina
- cliccare su console
- scrivere localStorage.clear();

## 📅 Prossimi obiettivi

- Aggiungere la rimozione dai preferiti
- Visualizzare i biglietti acquistati in `biglietti.html`
- Migliorare lo stile con CSS
- Rendere il sito responsive
- Aggiungere funzionalità di ricerca
```
 # 📘 Diario di Apprendimento JavaScript – Giorno 1

Oggi ho iniziato a scrivere codice JavaScript per la prima volta. Ho creato due pagine:
- `index.html`: mostra gli eventi e permette di aggiungerli ai preferiti o acquistare biglietti
- `preferiti.html`: visualizza gli eventi salvati nei preferiti

Questo file tiene traccia di ciò che ho imparato, con spiegazioni semplici riga per riga.

---

## 🏠 index.html – Pagina principale

### 🔍 Selezione dei bottoni

```js
const favoriteButtons = document.querySelectorAll('.addToFavorite');
const ticketButtons = document.querySelectorAll('.buyTicket');
```

- `querySelectorAll()` seleziona tutti gli elementi con la classe indicata.
- `favoriteButtons` contiene tutti i bottoni "Aggiungi ai Preferiti".
- `ticketButtons` contiene tutti i bottoni "Acquista Biglietto".

---

### 🖱️ Ascolto del click

```js
button.addEventListener('click', () => {
   // codice da eseguire al click
});
```

- `addEventListener()` serve per ascoltare eventi (in questo caso, il click).
- Quando l’utente clicca, viene eseguita la funzione.

---

### 📦 Raccolta dati dell’evento

```js
const card = button.closest('.eventCard');
const paragraphs = card.querySelectorAll('p');
const eventData = {
   image: card.querySelector('img').src,
   title: card.querySelector('h2').textContent,
   date: paragraphs[0].textContent,
   location: paragraphs[1].textContent,
};
```

- `closest('.eventCard')`: trova il contenitore dell’evento.
- `querySelectorAll('p')`: prende tutti i paragrafi (data e luogo).
- `eventData`: oggetto che contiene i dati dell’evento.

---

### 💾 Salvataggio nei preferiti

```js
let preferiti = JSON.parse(localStorage.getItem('preferiti')) || [];
```

- `localStorage.getItem()`: legge i dati salvati nel browser.
- `JSON.parse()`: converte la stringa in array.
- Se non ci sono dati, usa `[]`.

---

### 🔁 Controllo duplicati

```js
const exists = preferiti.some(event =>
   event.title === eventData.title && event.date === eventData.date
);
```

- `.some()` controlla se esiste già un evento con lo stesso titolo e data.
- Restituisce `true` o `false`.
- `===` Controlla se due elementi sono uguali (anche il tipo della variabile, `==` Controlla se due elementi sono uguali, (anche tipo di variabile diverso).

📌 Alternativa: `.find()` restituisce l’elemento trovato, oppure si può usare un ciclo `for`.

---

### ✅ Aggiunta ai preferiti

```js
if (exists) {
   alert('Evento già presente nei preferiti!');
   return;
} else {
   preferiti.push(eventData);
   localStorage.setItem('preferiti', JSON.stringify(preferiti));
   alert('Evento aggiunto ai preferiti!');
}
```

- Se l’evento è già presente, mostra un messaggio.
- Altrimenti, lo aggiunge e lo salva.

---

### 🎟️ Acquisto biglietto

```js
let biglietti = JSON.parse(localStorage.getItem('biglietti')) || [];

const exist = biglietti.some(event =>
   event.title === eventData.title && event.date === eventData.date
);

if (exist) {
   alert('Biglietto già acquistato per questo evento!');
   return;
} else {
   biglietti.push(eventData);
   localStorage.setItem('biglietti', JSON.stringify(biglietti));
   alert('Biglietto acquistato con successo!');
}
```

- Salva i dati nella chiave `"biglietti"` di `localStorage`.
- Controlla se il biglietto è già stato acquistato.

---

## ⭐ preferiti.html – Visualizzazione dei preferiti

### 📤 Recupero dei dati

```js
const container = document.getElementById("favoriteContainer");
const preferiti = JSON.parse(localStorage.getItem("preferiti")) || [];
```

- Seleziona il contenitore dove mostrare gli eventi.
- Recupera i dati salvati nei preferiti.

---

### 📭 Controllo se ci sono eventi

```js
if (preferiti.length === 0) {
   container.innerHTML = "<p>Nessun evento tra i preferiti.</p>";
}
```

- Se l’array è vuoto, mostra un messaggio.

---

### 🧱 Creazione dinamica delle card

```js
preferiti.forEach(event => {
   const card = document.createElement("div");
   card.classList.add("eventCard");
   card.innerHTML = `
      <img src="${event.image}" alt="${event.title}">
      <h2>${event.title}</h2>
      <p>${event.date}</p>
      <p>${event.location}</p>
   `;
   container.appendChild(card);
});
```

- Per ogni evento:
  - Crea un `<div>` con classe `eventCard`
  - Inserisce i dati dell’evento
  - Lo aggiunge al contenitore

---

## 🧠 Concetti chiave appresi

- Selezione di elementi HTML con `querySelector` e `querySelectorAll`
- Ascolto degli eventi con `addEventListener`
- Creazione dinamica di elementi con `document.createElement`
- Manipolazione del DOM con `innerHTML` e `appendChild`
- Uso di `localStorage` per salvare e leggere dati
- Conversione tra oggetti e stringhe con `JSON.stringify` e `JSON.parse`
- Controllo dei duplicati con `.some()`

---

### 🔍 Svuotare la localStroage (resettare il sito e rimuovere i prefriti/biglitti acquistati)

- analizzare la pagina
- cliccare su console
- scrivere localStorage.clear();

## 📅 Prossimi obiettivi

- Aggiungere la rimozione dai preferiti
- Visualizzare i biglietti acquistati in `biglietti.html`
- Migliorare lo stile con CSS
- Rendere il sito responsive
- Aggiungere funzionalità di ricerca
```
Certo Davide! Ecco il contenuto aggiornato da inserire nel tuo `README.md`, in formato Markdown, che documenta le ultime funzionalità che hai aggiunto: la searchbar e la pagina account con contatori.

---

## 📘 Diario di Apprendimento JavaScript – Giorno 2

Oggi ho aggiunto due nuove funzionalità importanti:
- Una **searchbar funzionante** per filtrare gli eventi
- Una nuova pagina **`account.html`** che mostra i dati utente e i contatori di attività

---

### 🔎 Funzionalità di ricerca eventi

```js
document.querySelector('.searchbar input').addEventListener('input', e => {
  const inputAttuale = e.target.value.toLowerCase().trim();
  const cards = document.querySelectorAll('.eventCard');

  cards.forEach(card => {
    const title = card.querySelector('h2').textContent.toLowerCase();
    const data = card.querySelector('p').textContent.toLowerCase();

    if (title.includes(inputAttuale) || data.includes(inputAttuale)) {
      card.style.display = '';
    } else {
      card.style.display = 'none';
    }
  });
});
```

- `addEventListener('input')`: ascolta ogni modifica nella barra di ricerca.
- `toLowerCase().trim()`: rende la ricerca insensibile a maiuscole/spazi.
- `includes()`: verifica se il testo cercato è presente nel titolo o nella data.
- `card.style.display`: mostra solo le card che corrispondono alla ricerca.

---

### 👤 Pagina Account con contatori

```js
function CounterUpdate() {
  const preferiti = JSON.parse(localStorage.getItem("preferiti")) || [];
  const biglietti = JSON.parse(localStorage.getItem("biglietti")) || [];

  document.querySelector(".added").textContent = `⭐ Eventi nei preferiti: ${preferiti.length}`;
  document.querySelector(".bought").textContent = `🎟️ Biglietti acquistati: ${biglietti.length}`;
}
```

- Funzione che legge i dati da `localStorage` e aggiorna i contatori.
- I contatori si aggiornano anche dopo lo svuotamento dei dati.

---

### 🧹 Svuotamento dei dati con aggiornamento live

```js
document.querySelector(".clearFavorite").addEventListener("click", () => {
  localStorage.removeItem("preferiti");
  CounterUpdate();
  alert("Preferiti svuotati!");
});

document.querySelector(".clearTicket").addEventListener("click", () => {
  localStorage.removeItem("biglietti");
  CounterUpdate();
  alert("Biglietti svuotati!");
});
```

- Dopo la rimozione, viene richiamata `CounterUpdate()` per aggiornare il numero.
- Stessa logica usata per i biglietti.

---

## 🧠 Nuovi concetti appresi

- Uso di `includes()` per confronti parziali tra stringhe.
- Gestione dinamica della visibilità con `style.display`.
- Creazione di funzioni riutilizzabili per aggiornare il DOM.
- Integrazione tra HTML e JavaScript per creare pagine interattive.
- Aggiornamento live del contenuto dopo modifiche al `localStorage`.

---

## 📅 Prossimi obiettivi aggiornati

- Aggiungere badge o icone visive per eventi acquistati.
- Migliorare la UX della searchbar (es. placeholder, reset).
- Aggiungere un form per modificare i dati utente in `account.html`.
- Separare il codice JS in file esterni.
- Aggiungere filtro per data o prezzo.

---

## nuove funzionalità

- Aggiunta possibilità di modificare l'email nella sezione account.

---




 

