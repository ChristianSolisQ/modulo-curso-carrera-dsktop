package controller;

import Exceptions.GlobalException;
import Exceptions.NoDataException;
import LogicaNegocios.Usuario;
import java.sql.SQLException;

import models.Model;
import presentation.Login;

public class LoginController {

    Model model;
    Login view;

    public LoginController(Model model, Login view) {
        this.model = model;
        this.view = view;
        view.setController(this);
        view.setModel(model);
    }

    public void verificaCredenciales(String user, String pass) throws SQLException, GlobalException, NoDataException {
        //model.setUsuarioActual(new Usuario(user, pass));
        model.validarCredenciales(user, pass);
        //model.setUsuarioActual(new Usuario());
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }

    public void mostrarVentanaPrincipal() {
        hide();
        laboratorio.Laboratorio.MenuPrincipalController.show();
    }

}
