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
import model.Direccion;
import model.Profesor;
import model.daos.ProfesorDAO;
import model.email;
import model.estado;
import model.from.ProfesorFrom;
import model.telefono;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Mariana
 */
public class NuevoProfesor extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String Fail = "fail";

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
            ProfesorFrom bean =(ProfesorFrom) form;
            Profesor prof=new Profesor();
            ProfesorDAO pDAO=new ProfesorDAO();
            prof.setRFC(bean.getRfc());
            prof.setNombre(bean.getNombre());
            prof.setPaterno(bean.getPaterno());
            prof.setMaterno(bean.getMaterno());
            prof.setContrasena(bean.getNombre());
            telefono tel=new telefono(bean.getTelCasa(),bean.getTelpar(),bean.getTelcel());
            prof.setTel(tel);
            estado e = new estado();
            e.setEstadoDes("activo");
            prof.setEstado(e);
            Direccion dir = new Direccion(bean.getCalle(),bean.getNoExt(),bean.getNoInt(),bean.getCol(),bean.getCp(),bean.getDel(),bean.getEstado());
            prof.setDir(dir);
            List<email> listamail=new ArrayList();
            email email=new email(bean.getEmail());
            listamail.add(email);
            prof.setEmails(listamail);
            prof.setFechaIngreso(Date.valueOf(LocalDate.now()));
            if (pDAO.create(prof)== 1){
                return mapping.findForward(SUCCESS);
            }
            else{
               return mapping.findForward(Fail);
            }
    }
}
