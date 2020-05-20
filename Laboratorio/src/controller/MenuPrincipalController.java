package controller;

import models.Model;
import presentation.MenuPrincipal;

public class MenuPrincipalController {

    Model model;
    MenuPrincipal view;

    public MenuPrincipalController(Model model, MenuPrincipal view) {
        this.model = model;
        this.view = view;
        view.setController(this);
        view.setModel(model);
    }

    public void show() {
        view.setVisible(true);
    }

    public void hide() {
        view.setVisible(false);
    }

    public void cerrarSesion() {
        model.setLogged(0);
        hide();
        laboratorio.Laboratorio.LoginController.show();
    }

    public void verGestionCarreras() {
        hide();
        laboratorio.Laboratorio.CarreraController.show();
    }

    public void verGestionCursos() {
        hide();
        laboratorio.Laboratorio.CursosController.show();
    }
}
