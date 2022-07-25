package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Matricula;
import servicios.MatriculaService;
import servicios.MatriculaServiceImpl;

@WebServlet("/matricula")
public class MatriculaServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public MatriculaServlet() {
		super();
	}
	
	MatriculaService service = new MatriculaServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("op");
		if (op == null) {
			op = "list";
		}

		String jsp = "/vista/matriculas.jsp";

		request.setAttribute("op", op);

		switch (op) {
		case "list": {

			request.setAttribute("matriculas", service.leer());

			break;
		}
		case "edit": {

			String id = request.getParameter("id");

			request.setAttribute("matricula", service.leer(Integer.parseInt(id)));
			jsp = "/vista/matricula.jsp";

			break;
		}
		case "new": {
			jsp = "/vista/matricula.jsp";
			break;
		}		
		case "del": {
			//obtengo el ID de Customer que se quiere borrar.
			String id = request.getParameter("id");
			//borramos el cliente
			service.borrar(Integer.parseInt(id));
			
			//obtengo la lista de clietnes restantes, y se las paso al request.
			request.setAttribute("matriculas", service.leer());
			break;
		}
		
		default:
			break;
		}

		getServletContext().getRequestDispatcher(jsp).forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("op");
		if (op == null) {
			op = "new";
		}

		String jsp = "/vista/matriculas.jsp";

		request.setAttribute("op", op);

		switch (op) {
		case "new": {

			Matricula m = new Matricula();
			m.setIdMatricula(0);
			m.setIdEstudianteFK(Integer.parseInt(request.getParameter("IdEstudiante")));
			m.setIdCursoFK(Integer.parseInt(request.getParameter("idCurso")));
			
			service.crear(m);
			
			break;
		}
		case "edit": {

			String id = request.getParameter("idMatricula");			
			Matricula m = service.leer(Integer.parseInt(id));
			
			m.setIdEstudianteFK(Integer.parseInt(request.getParameter("idEstudiante")));
			m.setIdCursoFK(Integer.parseInt(request.getParameter("idCurso")));
			
			service.actualizar(m);

			break;
		}
		default:
			break;
		}

		request.setAttribute("matriculas", service.leer());
		jsp = "/vista/matriculas.jsp";
		
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
		}
	}
