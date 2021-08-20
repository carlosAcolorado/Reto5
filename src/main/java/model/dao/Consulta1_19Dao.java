package model.dao;

//Estructura de datos
import java.util.ArrayList;
//import java.util.List;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta1_19Dao {

    public ArrayList<Consulta1VO_19> consulta1DAO() throws SQLException {

        ArrayList<Consulta1VO_19> proyecto = new ArrayList<Consulta1VO_19>();

        String sql = "SELECT  ID_Proyecto, Fecha_Inicio, Constructora, Serial FROM Proyecto WHERE ID_Proyecto < 15 ";
        try (Connection conectar = JDBCUtilities.getConnection();
                PreparedStatement ps = conectar.prepareStatement(sql);
                ResultSet query = ps.executeQuery();) {

            while (query.next()) {
                Consulta1VO_19 objConsulta1vo_19 = new Consulta1VO_19();
                objConsulta1vo_19.setIdProyecto(query.getInt("ID_Proyecto"));
                objConsulta1vo_19.setFechaInicio(query.getString("Fecha_Inicio"));
                objConsulta1vo_19.setConstructora(query.getString("Constructora"));
                objConsulta1vo_19.setSerial(query.getString("Serial"));
                proyecto.add(objConsulta1vo_19);
            }
            query.close();
            ps.close();
        }

        return proyecto;

    }

}
