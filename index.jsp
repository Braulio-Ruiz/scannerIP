<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Escáner de Puertos</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>

    <body>
        <div class="container">
            <h1><span>🌐 </span> Escáner de Puertos</h1>
            <form action="nmap" method="post">
                <input type="text" id="ip" name="ip" placeholder="Ingrese la dirección IP" required>
                <button type="submit">Escanear <span> 🔍</span></button>
            </form>
        </div>
        <footer>Creado por Braulio Ruiz Niñoles</footer>
    </body>

    </html>