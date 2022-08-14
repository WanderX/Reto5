package com.reto_5.Model.VO;

import java.sql.*;
import java.util.ArrayList;

import com.reto_5.Model.DAO.*;

public class Consulta3VO {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        try {
            ResultSet rs = Consulta3DAO.consulta();
            while (rs.next()) {
                int ID = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String banco = rs.getString("Banco_Vinculado");
                salida_vo.add(new String[] { ID + "", constructora, banco });
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return salida_vo;
    }
}
