package hsbclearn.simpleapp;

import hsbclearn.simpleapp.datatype.IntegerWrapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by FIKOWALI on 2017-05-19.
 */
@WebServlet("/JMSSRV")
public class JMSServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public JMSServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.getWriter()
        //        .append("Served at: ")
        //        .append(request.getContextPath());
        Executor exec = new Executor();
        List<IntegerWrapper> data = exec.execute();
        response.getWriter().append("Processed data: " + data);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
