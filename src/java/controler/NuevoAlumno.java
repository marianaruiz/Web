/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Alumno;
import model.Direccion;
import model.daos.AlumnoDAO;
import model.email;
import model.estado;
import model.from.AlumnoFromBean;
import model.telefono;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Mariana
 */
public class NuevoAlumno extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private final static String FAILURE = "failure";
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            AlumnoFromBean bean =(AlumnoFromBean) form;
            Alumno alumno=new Alumno();
            AlumnoDAO aDAO=new AlumnoDAO();
            alumno.setBoleta(bean.getBoleta());
            alumno.setNombre(bean.getNombre());
            alumno.setPaterno(bean.getPaterno());
            alumno.setMaterno(bean.getMaterno());
            alumno.setContrasena(bean.getNombre());
            telefono tel=new telefono(bean.getTelCasa(),bean.getTelpar(),bean.getTelcel());
            alumno.setTel(tel);
            estado e = new estado();
            e.setEstadoDes("activo");
            alumno.setEstado(e);
            Direccion dir = new Direccion(bean.getCalle(),bean.getNoExt(),bean.getNoInt(),bean.getCol(),bean.getCp(),bean.getDel(),bean.getEstado());
            alumno.setDir(dir);
            List<email> listamail=new ArrayList();
            email email=new email(bean.getEmail());
            listamail.add(email);
            alumno.setEmails(listamail);
            alumno.setFechaIngreso(Date.valueOf(LocalDate.now()));
            aDAO.create(alumno);
        return mapping.findForward(SUCCESS);
    }
}
