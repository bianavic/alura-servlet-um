package alura.javaservletum;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("web/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    public ListaEmpresasServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Banco banco = new Banco();
        List<Empresa> listaEmpresas = banco.getEmpresas();

//        HttpServletResponse response;
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<ul>");

        for (Empresa empresa : listaEmpresas) {
            out.println("<li>" + empresa.getNome() + "</li>");
        }

        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");

    }
}
