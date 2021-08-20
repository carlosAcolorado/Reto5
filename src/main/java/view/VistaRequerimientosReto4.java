package view;

import controller.ControladorRequerimientosReto4;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void consulta1() {
        System.out.println("-----Consulta 1-------");
        try {

            ArrayList<Consulta1VO_19> lista = controlador.realizarConsulta1();
            System.out.println("id_proyecto Fecha Constructora Serial");

            for (Consulta1VO_19 proyecto : lista) {

                System.out.println(proyecto.getIdProyecto() + " " + proyecto.getFechaInicio() + " "
                        + proyecto.getConstructora() + " " + proyecto.getSerial());

            }

            // Cada VO cargado, mostrarlo en la vista

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void consulta2() {
        System.out.println("-----Consulta 2-------");
        try {

            ArrayList<Consulta2VO_19> listas = controlador.realizarConsulta2();
            System.out.println("id_proyecto area_max");

            for (Consulta2VO_19 tipo : listas) {

                System.out.println(tipo.getIdProyecto() + " " + tipo.getAreMax());

            }
            // Encabezado del resultado

            // Cada VO cargado, mostrarlo en la vista

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void consulta3() {
        System.out.println("-----Consulta 3-------");
        try {

            ArrayList<Consulta3VO_19> listados = controlador.realizarConsulta3();

            System.out.println("id_proyecto nombreapellido");

            for (Consulta3VO_19 lider : listados) {

                System.out.println(lider.getIdProyecto() + " " + lider.getNombreApellido());

            }

            // Encabezado del resultado

            // Cada VO cargado, mostrarlo en la vista

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

}
