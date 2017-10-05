import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/ImieNazwisko")
public class ImieNazwisko extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String teamName = request.getParameter("teamName");

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<table border=\"3\">");
        writer.println("<tr>");
        writer.println("<th>Parametr</th>");
        writer.println("<th>Wartosc parametru</th>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<th>Imie</th>");
        writer.println("<th>" + firstName + "</th>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<th>Nazwisko</th>");
        writer.println("<th>" + lastName + "</th>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<th>Nazwa grupy</th>");
        writer.println("<th>" + teamName + "</th>");
        writer.println("</tr>");
        writer.println("</table>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String teamName = request.getParameter("teamName");

        PrintWriter writer = response.getWriter();
        LocalDateTime localDateTime = LocalDateTime.now();
        writer.println(firstName);
        writer.println(lastName);
        writer.println("</br>");
        writer.println(teamName);
        writer.println("</br>");
        writer.println(localDateTime);
    }
}
