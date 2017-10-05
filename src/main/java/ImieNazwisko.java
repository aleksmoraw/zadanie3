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

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        LocalDateTime localDateTime = LocalDateTime.now();
        writer.println("Aleksandra");
        writer.println("Morawska");
        writer.println("</br>");
        writer.println("Grupa: Okularnicy");
        writer.println("</br>");
        writer.println(localDateTime);

//        String firstNameParam = request.getParameter("firstName");
//        String lastNameParam = request.getParameter("lastName");
//        String teamNameParam = request.getParameter("teamName");
//        String actualDateAndTimeParam = request.getParameter("actualDateAndTime");

    }
}
