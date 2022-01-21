
package ConectaBD;

import java.sql.*;

public class Conecta_Pokemon {
    
    public static void main(String[] args) {
        
        try{
         //   Class.forName("com.mysql.jdbc.Driver");
        //1.  Crear conexión    
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/base","user","password");
        
        //2.    Crear objeto statement
          Statement miStatement = miConexion.createStatement();
          
        //3. Ejecutar las instrucción sql
          ResultSet miResultado = miStatement.executeQuery("SELECT * FROM Especies");
        
        //4. Recorrer el resultset
          while(miResultado.next()){
              System.out.println(miResultado.getString("Nombre")+" "+miResultado.getString("Tipo1"));
          }
           
        }catch(Exception e){
            System.out.println("Error al conectar");
            e.printStackTrace();
        }
        
    }
    
}
