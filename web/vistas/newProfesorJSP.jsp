<%-- 
    Document   : newProfesorJSP
    Created on : 7/03/2015, 10:36:50 PM
    Author     : Mariana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="../CSS/bootstrap/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../CSS/bootstrap/signin.css" rel="stylesheet" type="text/css">
        <script src="../js/jquery/jquery-2.1.1.js"></script>
        <script src="../CSS/bootstrap/bootstrap.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IngresarProfesor</title>
    </head>
    <body>
        <div class="navbar navbar-inverse " role="navigation">
        <div class="navbar-header ">
            <a class="navbar-brand  " href="ReAdmin.html">Administrador</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              
              <li><a href="ReAdmin.html">Perfil</a></li>
              
             <li class="dropdown active">
			<a class="dropdown-toggle"data-toggle="dropdown"href="#">
			Alumnos
			<b class="caret"></b>
			</a>
			<ul class="dropdown-menu">
				<li><a href="registroAlumno.html">Registrar Alumno</a></li>
				<li><a href="../VerAlumnosS">Ver Alumnos</a></li>
				
			</ul>
		</li>
                
                <li class="dropdown">
			<a class="dropdown-toggle"data-toggle="dropdown"href="#">
			Profesores
			<b class="caret"></b>
			</a>
			<ul class="dropdown-menu">
				<li><a href="registroProfesor.html">Registrar Profesor</a></li>
				<li><a href="../VerProfesorS">Ver Profesores</a></li>
				
			</ul>
		</li>
                
                 <li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown"href="#">
			Carreras
			<b class="caret"></b>
			</a>
			<ul class="dropdown-menu">
				<li><a href="Crearcarrera.html">Crear Carrera</a></li>
				
				
			</ul>
		</li>
                         
            </ul>
            </div>
        </div>
        <div class="jumbotron boxlogin">
            <html:form action="/crearProfesor" >   
                <fieldset>
                  <legend class="form-signin-heading">Datos del Profesor</legend>
                  <table>
                      <tr>
                            <td>RFC</td>
                            <td><html:text property="rfc" styleClass="form-control"/></td>
                      </tr>
                      <tr>
                          <td>Nombre</td>
                          <td><html:text property="nombre" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>Apallido Paterno </td>
                          <td><html:text property="paterno" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>Apellido Materno </td>
                          <td><html:text property="materno" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>Correo Electronico</td>
                          <td><html:text property="email" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>Direcion</td>
                          <td></td>
                      </tr>
                      <tr>
                          <td>Calle</td>
                          <td><html:text property="calle" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>NO.Exterior</td>
                          <td><html:text property="noExt" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>No.Interior</td>
                          <td><html:text property="noInt" styleClass="form-conrol" /></td>
                      </tr>
                      <tr>
                          <td>Colonia</td>
                          <td><html:text property="col" styleClass="form-conrol" /></td>
                      </tr>
                      <tr>
                          <td>Codigo Postal</td>
                          <td><html:text property="cp" styleClass="form-conrol" /></td>
                      </tr>
                      <tr>
                          <td>Municipio/Delegacion</td>
                          <td><html:text property="del" styleClass="form-conrol" /></td>
                      </tr>
                      <tr>
                          <td>Estado</td>
                          <td><html:text property="estado" styleClass="form-conrol" /></td>
                      </tr>
                      <tr>
                          <td>Telefono Particularr</td>
                          <td><html:text property="telpar" styleClass="form-conrol" /></td>
                      </tr>
                      <tr>
                          <td>Telefono Particularrr</td>
                          <td><html:text property="telCasa" styleClass="form-conrol" /></td>
                      </tr>
                      <tr>
                          <td>Telefono Celular</td>
                          <td><html:text property="telcel" styleClass="form-conrol" /></td>
                      </tr>
                      <tr>
                          <td><html:submit value="crear" styleClass="btn btn-lg btn-success"/></td>
                          
                      </tr>
                  </table>
            </fieldset>
            </html:form>
        </div>
    </body>
</html>
