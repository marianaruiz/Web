<%-- 
    Document   : newCurso
    Created on : 8/03/2015, 04:55:55 PM
    Author     : Mariana
--%>

<%@page import="java.util.ResourceBundle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
         <script src="//code.jquery.com/jquery-1.10.2.js"></script>
         <script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        <link href="../CSS/bootstrap/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../CSS/bootstrap/signin.css" rel="stylesheet" type="text/css">
        <script src="../CSS/bootstrap/bootstrap.js"></script>
        <title>Ingresar Cursos</title>
    </head>
    <body>
     <div class="navbar navbar-inverse " role="navigation">
         <script>
                $(function() {
                $( ".datepicker" ).datepicker({
                showOn: "button",
                buttonImage: "../CSS/jq/images/calendario.png",
                buttonImageOnly: true,
                buttonText: "Ingresa la fecha"
                });
                });
            </script>
        </div>
        <div class="jumbotron boxlogin">
            <html:form action="/crearCurso" >   
                <fieldset>
                  <legend class="form-signin-heading">Datos del Curso</legend>
                  <table>
                      <tr>
                            <td>Nombre curso</td>
                            <td><html:text property="nombre" styleClass="form-control"/></td>
                      </tr>
                      <tr>
                          <td>Fecha de Inicio</td>
                          <td><html:text property="fechaInicio" styleClass="datepicker" /></td>
                          
                      </tr>
                      <tr>
                            <td>Fecha de Termino</td>
                            <td><html:text property="fechaTermino" styleClass="datepicker"/></td>
                      </tr>
                      <tr>
                          <td>Ubicacion</td>
                          <td><html:text property="hubicacion" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>Precio del Curso </td>
                          <td><html:text property="precio" styleClass="form-control" /></td>
                      </tr>
                      
                      <tr>
                          <td>Profesor</td>
                          <td><html:text property="prof" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td><html:submit value="cancelar" styleClass="btn btn-lg btn-success"/></td>
                          <td><html:submit value="crear" styleClass="btn btn-lg btn-success"/></td>
                      </tr>
                  </table>
            </fieldset>
            </html:form>
        </div>
    </body>
</html>
