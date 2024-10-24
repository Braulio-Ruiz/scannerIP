package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/scanner")
public class scanner extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtenemos la IP ingresada por el usuario desde el formulario.
        String ip = request.getParameter("ip");

        // Ejecutamos el comando Nmap.
        StringBuilder resultado = new StringBuilder();
        try {
            // Ejecuta el comando Nmap para escanear puertos 1-1024.
            Process process = new ProcessBuilder("nmap", "-p", "1-1024", ip).start();

            // Leemos la salida del proceso.
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                resultado.append(linea).append("<br>");
            }
            reader.close();

            // Esperamos a que el proceso termine.
            process.waitFor();
        } catch (Exception e) {
            resultado.append("Error al ejecutar Nmap: ").append(e.getMessage());
        }

        // Enviamos los resultados a la página JSP.
        request.setAttribute("resultado", resultado.toString());
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
