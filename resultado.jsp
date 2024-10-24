<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Resultados del Escaneo</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>

    <body>
        <div class="container">
            <h1><span>📊</span> Resultados del Escaneo</h1>
            <div class="resultado">
                <p><span>📍</span> <strong>IP Escaneada:</strong> ${param.ip}</p>
                <hr>
                <pre>${resultado}</pre>
            </div>
            <a type="button" href="index.jsp"><span>🔙</span> Volver</a>
        </div>
        <footer>Creado por Braulio Ruiz Niñoles</footer>
    </body>

    </html>