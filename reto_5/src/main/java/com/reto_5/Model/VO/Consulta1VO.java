package com.reto_5.Model.VO;

import java.sql.*;
import java.util.ArrayList;

import com.reto_5.Model.DAO.*;

public class Consulta1VO {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        try {
            ResultSet rs = Consulta1DAO.consulta();
            while (rs.next()) {
                int ID = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");
                salida_vo.add(new String[] { ID + "", nombre, apellido, ciudad });
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return salida_vo;
    }
}