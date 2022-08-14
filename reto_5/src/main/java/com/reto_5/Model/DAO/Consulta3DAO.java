package com.reto_5.Model.DAO;

import com.reto_5.Utilidades.*;
import java.sql.*;

public class Consulta3DAO {
    public static ResultSet consulta() {
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        String csql = "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra INNER JOIN Proyecto USING (ID_Proyecto) WHERE Ciudad = 'Salento' AND Proveedor = 'Homecenter';";
        try {
            conn = JDBCUtilities.conexion();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
}
