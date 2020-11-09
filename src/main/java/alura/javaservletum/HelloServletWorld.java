package alura.javaservletum;

import org.springframework.web.bind.ServletRequestParameterPropertyValues;

import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// estendendo para criar uma classe servlet
@WebServlet(urlPatterns = "/hello") // anotacao para mapear a URL para uma servlet
public class HelloServletWorld extends HttpServlet {

    // TomCat == middleware / intermediario == ele é um container

    // Singleton == instancia unica dentro do servlet /
    // singleton = uma vez criado (enqto estiver no ar) ele vive para sempre
    // Mas só será criado depois de chamá-lo, porque qdo roda apenas deixa em standby

    // inversao de controle == IOC / ao inves do meu metodo main instanciar o objeto,
    // quem cuida do objeto é o Tomcat


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // definir a resposta
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("hello world, congrats you wrote your first servlet");
        out.println("</body>");
        out.println("</html>");

        System.out.println("O HelloServletWorld está rodando");

    }
}
