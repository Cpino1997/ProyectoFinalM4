package controlador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.Estudiante;
import servicios.EstudianteService;
import servicios.EstudianteServiceImpl;

@WebServlet("/estudiante")
public class EstudianteServlet extends HttpServlet{

private static final long serialVersionUID = 1L;
	
	public EstudianteServlet() {
		super();
	}

	EstudianteService service = new EstudianteServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getParameter("op");
		if (op == null) {
			op = "list";
		}

		String jsp = "/vista/estudiantes.jsp";

		request.setAttribute("op", op);

		switch (op) {
		case "list": {
			request.setAttribute("estudiantes", service.leer());
			break;
		}
		case "edit": {

			String id = request.getParameter("id");
			request.setAttribute("estudiante", service.leer(Integer.parseInt(id)));
			jsp = "/vista/estudiante.jsp";


			break;
		}
		case "new": {
			jsp = "/vista/estudiante.jsp";
			break;
		}		
		case "del": {
			String id = request.getParameter("id");
			service.borrar(Integer.parseInt(id));
			request.setAttribute("estudiantes", service.leer());
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

		String jsp = "/vista/estudiantes.jsp";

		request.setAttribute("op", op);

		switch (op) {
		case "new": {

			Estudiante e = new Estudiante();
			e.setIdEstudiante(0);
			e.setNombreEstudiante(request.getParameter("nombreEstudiante"));
			e.setRutEstudiante(request.getParameter("rutEstudiante"));
			e.setEmailEstudiante(request.getParameter("emailEstudiante"));
			e.setTelefonoEstudiante(request.getParameter("telefonoEstudiante"));
			
			service.crear(e);
			
			break;
		}
		case "edit": {
			String id = request.getParameter("idEstudiante");			
			Estudiante e = service.leer(Integer.parseInt(id));

			e.setNombreEstudiante(request.getParameter("nombreEstudiante"));
			e.setRutEstudiante(request.getParameter("rutEstudiante"));
			e.setEmailEstudiante(request.getParameter("emailEstudiante"));
			e.setTelefonoEstudiante(request.getParameter("telefonoEstudiante"));
			service.actualizar(e);

			break;
		}
		default:
			break;
		}

		request.setAttribute("estudiantes", service.leer());
		jsp = "/vista/estudiantes.jsp";
		
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
		
	}

}
