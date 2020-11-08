package alura.javaservletum;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("web/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Cadastrando nova empresa");

        String nomeEmpresa = req.getParameter("Caramelos");
        Empresa empresa = new Empresa();
        empresa.setNome("Caramelos");

        // simular um banco de dados
        Banco banco = new Banco();
        banco.adiciona(empresa);

        PrintWriter out = resp.getWriter();
        out.println("<html><body>Empresa" + nomeEmpresa + "cadastrada com sucesso</body></html>");

    }
}
