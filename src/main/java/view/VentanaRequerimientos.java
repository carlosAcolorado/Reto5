package view;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import controller.ControladorRequerimientosReto4;
import model.vo.Consulta1VO_19;
import model.vo.Consulta2VO_19;
import model.vo.Consulta3VO_19;

public class VentanaRequerimientos extends JFrame {

    private JTable tabla;
    private JTable tabla2;
    private JTable tabla3;
    private ControladorRequerimientosReto4 controlador;

    public VentanaRequerimientos() {
        controlador = new ControladorRequerimientosReto4();
        initUI();
        setLocationRelativeTo(null);
    }

    public void initUI() {
        setTitle("Interfaz reto 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        JTabbedPane tbd = new JTabbedPane();
        
        getContentPane().add(tbd, BorderLayout.CENTER);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());

        JPanel panel3 = new JPanel();
        panel3.setLayout( new BorderLayout());

        tbd.addTab("Consulta Requerimiento 1", panel);
        tbd.addTab("Consulta Requerimiento 2", panel2);
        tbd.addTab("Consulta Requerimiento 3", panel3);

        tbd.setFont(new Font("Arial Black", Font.PLAIN, 12));
        

        JPanel panelEntrada = new JPanel();
        panelEntrada.add(new JLabel());
        //panelEntrada.setBackground(Color.WHITE);

        JPanel panelEntrada2 = new JPanel();
        panelEntrada2.add(new JLabel());

        JPanel panelEntrada3 = new JPanel();
        panelEntrada3.add(new JLabel());

        JButton btnConsulta = new JButton("Consultar");
        JButton btnConsulta2 = new JButton("Consultar");
        JButton btnConsulta3 = new JButton("Consultar");

        btnConsulta.addActionListener(e -> cargarTablaConsulta());
        btnConsulta2.addActionListener(c -> cargarTablaConsulta2());
        btnConsulta3.addActionListener(f -> cargarTablaConsulta3());

        panelEntrada.add(btnConsulta);
        panelEntrada2.add(btnConsulta2);
        panelEntrada3.add(btnConsulta3);

        panel.add(panelEntrada, BorderLayout.PAGE_START);
        panel2.add(panelEntrada2, BorderLayout.PAGE_START);
        panel3.add(panelEntrada3,BorderLayout.PAGE_START);

        tabla = new JTable();
        tabla2 = new JTable();
        tabla3 = new JTable();

        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);
        panel2.add(new JScrollPane(tabla2), BorderLayout.CENTER);
        panel3.add(new JScrollPane(tabla3), BorderLayout.CENTER);
    }

    // contenido consulta 1
    private void cargarTablaConsulta() {
        try {
            ArrayList<Consulta1VO_19> lista = controlador.realizarConsulta1();

            Consulta1TableModel tableModel = new Consulta1TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private class Consulta1TableModel extends AbstractTableModel {
        private ArrayList<Consulta1VO_19> data;

        public void setData(ArrayList<Consulta1VO_19> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "ID_Proyecto";
                case 1:
                    return "Fecha_Inicio";
                case 2:
                    return "Constructora";
                case 3:
                    return "Serial";
            }
            return super.getColumnName(column);
        }

        public int getRowCount() {

            return data.size();
        }

        public int getColumnCount() {

            return 4;
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            Consulta1VO_19 registro = data.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return registro.getIdProyecto();
                case 1:
                    return registro.getFechaInicio();
                case 2:
                    return registro.getConstructora();
                case 3:
                    return registro.getSerial();
            }
            return null;
        }

    }

    // contenido consulta 2

    private void cargarTablaConsulta2() {
        try {
            ArrayList<Consulta2VO_19> lista = controlador.realizarConsulta2();

            Consulta2TableModel tableModel = new Consulta2TableModel();
            tableModel.setData(lista);
            tabla2.setModel(tableModel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }

    }

    private class Consulta2TableModel extends AbstractTableModel {
        private ArrayList<Consulta2VO_19> data;

        public void setData(ArrayList<Consulta2VO_19> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "ID_Proyecto";
                case 1:
                    return "Area_max";
            }
            return super.getColumnName(column);
        }

        public int getRowCount() {

            return data.size();
        }

        public int getColumnCount() {

            return 2;
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            Consulta2VO_19 registro = data.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return registro.getIdProyecto();
                case 1:
                    return registro.getAreMax();

            }
            return null;
        }

    }
    // contenido consulta 3

    private void cargarTablaConsulta3() {
        try {
            ArrayList<Consulta3VO_19> lista = controlador.realizarConsulta3();

            Consulta3TableModel tableModel = new Consulta3TableModel();
            tableModel.setData(lista);
            tabla3.setModel(tableModel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private class Consulta3TableModel extends AbstractTableModel {
        private ArrayList<Consulta3VO_19> data;

        public void setData(ArrayList<Consulta3VO_19> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "ID_Proyecto";
                case 1:
                    return "NombreApellido";
            }
            return super.getColumnName(column);
        }

        public int getRowCount() {

            return data.size();
        }

        public int getColumnCount() {

            return 2;
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            Consulta3VO_19 registro = data.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return registro.getIdProyecto();
                case 1:
                    return registro.getNombreApellido();

            }
            return null;
        }

    }

}
