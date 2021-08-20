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

public class Consulta3_19Dao {
    public ArrayList<Consulta3VO_19> consulta3DAO() throws SQLException {

        ArrayList<Consulta3VO_19> lider = new ArrayList<Consulta3VO_19>();

        String sql = "SELECT ID_Proyecto, Nombre||' '||Primer_Apellido AS nombreapellido FROM Proyecto JOIN Lider l USING (ID_Lider) WHERE Banco_Vinculado = 'Bancolombia'";
        try (Connection conectar = JDBCUtilities.getConnection();
                PreparedStatement ps = conectar.prepareStatement(sql);
                ResultSet query = ps.executeQuery();) {

            while (query.next()) {
                Consulta3VO_19 objConsulta3vo_19 = new Consulta3VO_19();
                objConsulta3vo_19.setIdProyecto(query.getInt("ID_Proyecto"));
                objConsulta3vo_19.setNombreApellido(query.getString("nombreapellido"));

                lider.add(objConsulta3vo_19);
            }
            query.close();
            ps.close();
        }
        return lider;

    }
}
