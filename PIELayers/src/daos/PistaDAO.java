package daos;

import domains.Pista;
import java.sql.*;

public class PistaDAO {

    public boolean addPistaBD(Pista pista) throws ClassNotFoundException, SQLException {
        boolean aniadido = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("INSERT INTO pistas (num_pista, en_mantenimiento) "
                + "VALUES (" + pista.getNumPista()+ "," + pista.getEn_mantenimiento()+ ")");

        if (lineas > 0) {
            aniadido = true;
        }

        ManageDB.closeConnection(connection);
        return aniadido;
    }

    public static boolean addPistaBDStatic(Pista pista) throws SQLException {
        boolean aniadido = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("INSERT INTO pistas (num_pista, en_mantenimiento) "
                + "VALUES (" + pista.getNumPista()+ "," + pista.getEn_mantenimiento()+ ")");

        if (lineas > 0) {
            aniadido = true;
        }

        ManageDB.closeConnection(connection);
        return aniadido;
    }

    public boolean removePistarBD(Pista pista) throws ClassNotFoundException, SQLException {
        boolean eliminado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("DELETE FROM pistas WHERE id = " + pista.getId());

        if (lineas > 0) {
            eliminado = true;
        }

        ManageDB.closeConnection(connection);
        return eliminado;
    }

    public static boolean removePistaBDStatic(Pista pista) throws SQLException {
        boolean eliminado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("DELETE FROM pistas WHERE id = " + pista.getId());

        if (lineas > 0) {
            eliminado = true;
        }

        ManageDB.closeConnection(connection);
        return eliminado;
    }

    public Pista getPistaBD(int id) throws SQLException {
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM pistas WHERE id = " + id);
        rs.next();
        Pista pista = new Pista(rs.getInt(1), rs.getInt(2), rs.getInt(3));
        ManageDB.closeConnection(connection);
        return pista;
    }

    public static Pista getPistaBDStatic(int id) throws SQLException {
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM pistas WHERE id = " + id);
        rs.next();
        Pista pista = new Pista(rs.getInt(1), rs.getInt(2), rs.getInt(3));
        ManageDB.closeConnection(connection);
        return pista;
    }

    public boolean modifyPistaBD(Pista pista) throws SQLException {
        boolean modificado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("UPDATE pistas SET numPista = " + pista.getNumPista()
                + ", en_mantenimiento = " + pista.getEn_mantenimiento());

        if (lineas > 0) {
            modificado = true;
        }

        ManageDB.closeConnection(connection);
        return modificado;
    }

    public static boolean modifyPistaBDStatic(Pista pista) throws SQLException {
        boolean modificado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("UPDATE pistas SET numPista = " + pista.getNumPista()
                + ", en_mantenimiento = " + pista.getEn_mantenimiento());

        if (lineas > 0) {
            modificado = true;
        }

        ManageDB.closeConnection(connection);
        return modificado;
    }
}
