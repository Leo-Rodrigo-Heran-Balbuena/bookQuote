package nl.utwente.di.celToFar;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Page extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Converter converter;

    public void init() throws ServletException {
        converter = new Converter();
    }


    // it inputs the Http requests found and ?

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType =
                "<!DOCTYPE HTML>\n";
        String title = "Celsius to Fahrenheit Converter";
        out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                "</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +
                "  <P>Celsius number: " +
                request.getParameter("celsius") + "\n" +
                "  <P>Price: " +
                Double.toString(converter.convertcelsius(request.getParameter("celsius"))) +
                "</BODY></HTML>");
    }


}