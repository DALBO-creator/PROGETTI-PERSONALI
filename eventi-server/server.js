// Importo il modulo http di Node
const http = require("http");

// Creo il server
const server = http.createServer((req, res) => {
  // Imposto intestazioni di risposta
  res.writeHead(200, { "Content-Type": "text/plain" });

  // Risposta semplice
  if (req.url === "/") {
    res.end("Benvenuto nel mio server Node!");
  } else if (req.url === "/about") {
    res.end("Questa è la pagina About.");
  } else {
    res.writeHead(404, { "Content-Type": "text/plain" });
    res.end("Pagina non trovata");
  }
});

// Avvio il server sulla porta 3000
server.listen(3000, () => {
  console.log("Server avviato su http://localhost:3000");
});
