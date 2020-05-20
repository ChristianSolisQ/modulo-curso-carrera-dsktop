package controller;

import Exceptions.GlobalException;
import Exceptions.NoDataException;
import LogicaNegocios.Curso;
import java.util.ArrayList;

import models.Model;
import presentation.Cursos;

public class CursoController {

    Model model;
    Cursos cursoView;

    public CursoController(Model model, Cursos cursoView) throws GlobalException, NoDataException {
        this.model = model;
        this.cursoView = cursoView;
        cursoView.setCursoController(this);
        cursoView.setModel(model);
    }

    public void insertar_curso(String codigo, String nombre, int creditos, int horas, String nivel, String ciclo, String codCarrera) throws GlobalException, NoDataException {
        model.setCursoActual(new Curso(codigo, nombre, creditos, horas, nivel, ciclo, codCarrera));
        model.insertar_curso(model.getCursoActual());
        model.setCursoActual(new Curso());

    }

    public void modificar_curso(String codigo, String nombre, int creditos, int horas, String nivel, String ciclo, String codCarrera) throws NoDataException, GlobalException {
        model.setCursoActual(new Curso(codigo, nombre, creditos, horas, nivel, ciclo, codCarrera));
        model.modificar_curso(model.getCursoActual());
        model.setCursoActual(new Curso());
    }

    public void eliminar_curso(String codigo) throws GlobalException, NoDataException {
        model.eliminar_curso(codigo);
    }

    public void buscar_curso(String codigo) throws GlobalException, NoDataException {
        model.setCursoActual(model.buscar_curso(codigo));
    }

    public void listar_curso() throws GlobalException, NoDataException {
        ArrayList<Curso> curso = model.listar_curso();
        model.updateTablaCursos(curso);
    }

    public void show() {
        cursoView.setVisible(true);
    }

    public void hide() {
        cursoView.setVisible(false);
    }

    public void regresarMenuPrincipal() {
        hide();
        laboratorio.Laboratorio.MenuPrincipalController.show();
    }

}
