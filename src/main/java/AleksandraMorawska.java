import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;

@WebServlet("/AleksandraMorawska")
public class AleksandraMorawska extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        writer.println("Aleksandra Morawska");
        writer.println("</br>");
        writer.println("Okularnicy");
        writer.println("</br>");
        writer.println(formatDateTime);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body>");

        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement().toString();
            writer.print("<tr>");
            writer.println("<td>" + parameterName + "</td>");
            writer.print("</tr>");
            String[] parameterValues = request.getParameterValues(parameterName);
            writer.println("<ol>");

            for (int i = 0; i < parameterValues.length; i++) {
                String parameterValue = parameterValues[i];
                writer.println("<tr>");
                writer.println("<th>" + parameterValue + "</th>");
                writer.println("</tr>");
                writer.println("<tr>");
            }
            writer.println("</ol>");
        }
        writer.println("<body>");
        writer.println("<html>");
    }
}



