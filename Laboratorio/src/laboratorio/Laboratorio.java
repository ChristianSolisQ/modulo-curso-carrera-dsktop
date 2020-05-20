/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import Exceptions.GlobalException;
import Exceptions.NoDataException;
import controller.CarrerasController;
import controller.CursoController;
import controller.LoginController;
import controller.MenuPrincipalController;
import static laboratorio.Laboratorio.MenuPrincipalController;
import models.Model;
import presentation.Carreras;
import presentation.Cursos;
import presentation.Login;
import presentation.MenuPrincipal;

public class Laboratorio {

    public static void main(String[] args) throws GlobalException, NoDataException {

        Model model = new Model();

        Login loginView = new Login();
        LoginController = new LoginController(model, loginView);
        loginView.setVisible(true);

        Cursos cursosView = new Cursos();
        CursosController = new CursoController(model, cursosView);

        Carreras carrerasView = new Carreras();
        CarreraController = new CarrerasController(model, carrerasView);
        
        MenuPrincipal menuPrincipalView = new MenuPrincipal();
        MenuPrincipalController = new MenuPrincipalController(model, menuPrincipalView);

    }

    public static controller.CursoController CursosController;
    public static controller.CarrerasController CarreraController;
    public static controller.LoginController LoginController;
    public static controller.MenuPrincipalController MenuPrincipalController;

}
