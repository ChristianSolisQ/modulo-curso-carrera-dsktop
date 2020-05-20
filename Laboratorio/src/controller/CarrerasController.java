package controller;


import Exceptions.GlobalException;
import Exceptions.NoDataException;
import LogicaNegocios.Carrera;
import java.util.ArrayList;

import models.Model;
import presentation.Carreras;

public class CarrerasController {

    Model model;
    Carreras carrerasView;

    public CarrerasController(Model model, Carreras carrerasView) throws GlobalException, NoDataException {
        this.model = model;
        this.carrerasView = carrerasView;
        carrerasView.setCarrerasController(this);
        carrerasView.setModel(model);
    }

    public void insertar_carrera(String codigo, String nombre, String titulo) throws GlobalException, NoDataException {
        model.setCarreraActual(new Carrera(codigo, nombre, titulo));
        model.insertar_carrera(model.getCarreraActual());
        model.setCarreraActual(new Carrera());
        
    }

    public void modificar_carrera(String codigo, String nombre, String titulo) throws GlobalException, NoDataException {
        model.setCarreraActual(new Carrera(codigo, nombre, titulo));
        model.modificar_carrera(model.getCarreraActual());
        model.setCarreraActual(new Carrera());
    }

    public void eliminar_carrera(String codigo) throws GlobalException, NoDataException {
        model.eliminar_carrera(codigo);
    }

    public void buscar_carrera(String codigo) throws GlobalException, NoDataException {
        model.setCarreraActual(model.buscar_carrera(codigo));
    }

    public void listar_Carreras() throws GlobalException, NoDataException {
        ArrayList<Carrera> carreras = model.listar_carrera();
        model.updateTablaCarreras(carreras);
    }

    public void show() {
        carrerasView.setVisible(true);
    }

    public void hide() {
        carrerasView.setVisible(false);
    }

    public void regresarMenuPrincipal() {
        hide();
        laboratorio.Laboratorio.MenuPrincipalController.show();
    }

}
