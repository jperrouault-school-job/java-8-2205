const serverPort = 3000;
const WebSocketServer = require('websocket').server;
const http = require('http');
const server = http.createServer();

server.listen(serverPort, function() {
    console.log(`Serveur en écoute sur le port ${ serverPort } `);
});

// Création du serveur WebSocket
const wsServer = new WebSocketServer({
    httpServer: server
});


// Serveur WebSocket
wsServer.on('request', function(request) {
    let connection = request.accept(null, request.origin);
    console.log("Connexion entrante.");

    connection.sendUTF("Bienvenue.");

    // On envoie un message toutes les 2 secondes
    let interval = setInterval(() => {
        if (connection) {
            console.log("Envoie d'un message ...");
            connection.sendUTF(Date.now());
            connection.sendUTF("2 fois");
        }

        else {
            clearInterval(interval);
        }
    }, 2000);

    // Données entrantes
    connection.on('message', (message) => {
        console.log(`Un message est reçu : ${ message }`);
    });

    // Connexion fermée / perdue
    connection.on('close', () => {
        connection = null;
        console.log("Fermeture de la connexion.");
    });
});