package models;

import LogicaNegocios.Carrera;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class CarrerasTableModel extends AbstractTableModel {

    private ArrayList<Carrera> carreras;

    public CarrerasTableModel(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public int getRowCount() {
        return carreras.size();

    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Carrera c = carreras.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = c.getCodigo();
                break;
            case 1:
                value = c.getNombre();
                break;
            case 2:
                value = c.getTitulo();
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
                name = "Titulo";
                break;

        }
        return name;

    }

}
