
package Factory;

public class FactoryConexionDB {
    public static final int MySQL = 1; //Para conectar Mysql
    public static String[] configMySQL ={"bd_rinventario","root",""};
    
    public static ConexionDB open (int tipoDB){
    switch(tipoDB){
        case FactoryConexionDB.MySQL:
        return new MySQLConexionFactory(configMySQL);
        default:
            return null;
    }
    }
}
