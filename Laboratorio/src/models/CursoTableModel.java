package models;

import LogicaNegocios.Curso;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class CursoTableModel extends AbstractTableModel {

    private ArrayList<Curso> cursos;

    public CursoTableModel(ArrayList<Curso> carreras) {
        this.cursos = carreras;
    }

    public ArrayList<Curso> getCarreras() {
        return cursos;
    }

    public void setCarreras(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public int getRowCount() {
        return cursos.size();

    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Curso c = cursos.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = c.getCodigo();
                break;
            case 1:
                value = c.getNombre();
                break;
            case 2:
                value = c.getCreditos();
                break;
            case 3:
                value = c.getHoras_semanales();
                break;
            case 4:
                value = c.getNivel();
                break;
            case 5:
                value = c.getCiclo();
                break;
            case 6:
                value = c.getCodigo_carrera();
                break;
        }
        return value;

    }

    @Override
    public String getColumnName(int column) {
        String name = "???";
        switch (column) {
            case 0:
                name = "Codigo";
                break;
            case 1:
                name = "Nombre";
                break;
            case 2:
                name = "Creditos";
                break;
            case 3:
                name = "Horas Semanales";
                break;
            case 4:
                name = "Nivel";
                break;
            case 5:
                name = "Ciclo";
                break;
            case 6:
                name = "Codigo Carrera";
                break;
        }
        return name;
    }

} // CLASS LLAVE
