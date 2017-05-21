package ie.cit.brian.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by brian on 20/05/17.
 */

@WebServlet("/PlanetsServlet")
public class PlanetsServlet {


    PlanetsServlet() {
        super();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        createHTMLDoc();
    }


    private StringBuffer createHTMLDoc() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("<html><head>\n");
        stringBuff.append("<title>Screech Web Application</title>\n");
        stringBuff.append("<style> table, th, td { border: 1px solid black; border-collapse: collapse; } th, tr,td { padding: 10px; }</style>");
        stringBuff.append("</head><body>\n");
        stringBuff.append("<jsp:getProperty name='CarBean' property='skidMarks'/>");
        stringBuff.append("<table>");
        stringBuff.append("<tr><th>Avg skid distance</th><th>Surface type</th><th>Breaking Efficiency</th><th>Calculated Speed</th></tr>");
        stringBuff.append("<table>");
        stringBuff.append("</body></html>");
        return stringBuff;
    }


}
