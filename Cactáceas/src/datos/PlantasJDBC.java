package datos;

import domain.Planta;
import java.util.ArrayList;
import java.util.List;

public class PlantasJDBC {
    
    private static final String SQL_SELECT = "SELECT id_planta, nombre_cientifico, nombre_común, tamaño FROM plantas";
    private static final String SQL_INSERT = "INSERT INTO plantas(id_planta, nombre_cientifico, nombre_común, región, precio, tamaño) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE plantas SET nombre_cientifico = ?, nombre_común = ?, región = ?, precio = ?, tamaño = ? WHERE id_planta = ? ";
    private static final String SQL_DELETE = "DELETE FROM plantas WHERE id_planta = ?";
    
    
    public List<Usuario> select(){
        Connection conn  = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Planta planta = null;
        
        List<Planta> plantas = new ArrayList<Planta>();
    
    }
    
    
}
