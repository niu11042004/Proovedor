package Cod;

import java.sql.Connection;
import java.sql.SQLException;


public class ProveedorDao {
    Connection con;
    Conexion cn= new Conexion();
    public boolean RegistrarProveedor(Proveedor pr){
        String sql= "INSERT INTO proveedor (ruc, nombre, telefono, correo, direccion) VALUES(?,?,?,?)";
        try {
          con = cn.getConnection();
          ps = con.prepareStatement(sql);
          ps.setInt (1,pr.getRuc());
          ps.setString(2,pr.getNombre());
          ps.setString(3, pr.getTelefono());
          ps.setString(4, pr.getCorreo());
          ps.setString(5, pr.getDireccion());
          ps.execute();
          return true;        
                   
     } catch (SQLException e){
            System.out.println(e.toString());
            return false;
         
     }
}
    }
