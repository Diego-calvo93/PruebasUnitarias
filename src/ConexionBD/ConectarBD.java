
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ConectarBD {
    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaConeccion = "jdbc:mysql://127.0.0.1/pruebasunitarias?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String usuario = "root";
    private String contraseña = "";
    
    public Connection con; 

    public ConectarBD() {
      /*  try{
         Class.forName(driver);
        con = DriverManager.getConnection(cadenaConeccion,usuario, contraseña);
                    JOptionPane.showMessageDialog(null, "Se realizo la conexion");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexion" + e.getMessage());
        }*/ 
        
    }
    
    public Connection getCon(){
        try{
            //Cargar la conexion
            Class.forName (driver);
            
            con = DriverManager.getConnection (cadenaConeccion,usuario, contraseña);
            
            System.out.println("Conexion establecida");
            
            //JOptionPane.showMessageDialog(null,"Conexion esta establecida" );
            
        }catch (ClassNotFoundException | SQLException e){
            
            System.out.println("Error en la conexion");
            
            JOptionPane.showMessageDialog(null,"Error de conexion" +e);
            
        }
        return con;
    }
    
    
}
