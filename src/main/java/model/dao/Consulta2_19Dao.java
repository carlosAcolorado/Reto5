package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta2_19Dao {

    public ArrayList<Consulta2VO_19> consulta2DAO() throws SQLException {

        ArrayList<Consulta2VO_19> tipo = new ArrayList<Consulta2VO_19>();

        String sql = "SELECT  ID_Proyecto, Area_Max FROM Proyecto p JOIN Tipo t USING (ID_Tipo) WHERE p.Numero_Habitaciones = 2";

        try (Connection conectar = JDBCUtilities.getConnection();
                PreparedStatement ps = conectar.prepareStatement(sql);
                ResultSet query = ps.executeQuery();) {

            while (query.next()) {
                Consulta2VO_19 objConsulta2vo_19 = new Consulta2VO_19();
                objConsulta2vo_19.setIdProyecto(query.getInt("ID_Proyecto"));
                objConsulta2vo_19.setAreMax(query.getInt("Area_Max"));

                tipo.add(objConsulta2vo_19);
            }
            query.close();
            ps.close();
        }
        return tipo;

    }
}
