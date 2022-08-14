package com.reto_5.Model.VO;

import java.sql.*;
import java.util.ArrayList;

import com.reto_5.Model.DAO.*;

public class Consulta2VO {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        try {
            ResultSet rs = Consulta2DAO.consulta();
            while (rs.next()) {
                int ID = rs.getInt("ID_Proyecto");
                String constructora = rs.getString("Constructora");
                String nh = rs.getString("Numero_Habitaciones");
                String ciudad = rs.getString("Ciudad");
                salida_vo.add(new String[] { ID + "", constructora, nh, ciudad });
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return salida_vo;
    }
}
