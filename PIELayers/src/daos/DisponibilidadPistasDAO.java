package daos;

import domains.DisponibilidadPistas;
import java.sql.*;

public class DisponibilidadPistasDAO {

    public boolean addDisponibilidadPistasBD(DisponibilidadPistas disponibilidadPista) throws ClassNotFoundException, SQLException {
        boolean aniadido = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("INSERT INTO disponibilidadPistas (dia, franjaHoraria, pagado, idUsuario, idPista) "
                + "VALUES (" + disponibilidadPista.getDia() + "," + disponibilidadPista.getFranjaHoraria() + ","
                + disponibilidadPista.getPagado() + ", " + disponibilidadPista.getIdUsuario() + ", " + disponibilidadPista.getIdPista() + ")");

        if (lineas > 0) {
            aniadido = true;
        }

        ManageDB.closeConnection(connection);
        return aniadido;
    }

    public static boolean addDisponibilidadPistasBDStatic(DisponibilidadPistas disponibilidadPista) throws SQLException {
        boolean aniadido = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("INSERT INTO disponibilidadPistas (dia, franjaHoraria, pagado, idUsuario, idPista) "
                + "VALUES (" + disponibilidadPista.getDia() + "," + disponibilidadPista.getFranjaHoraria() + ","
                + disponibilidadPista.getPagado() + ", " + disponibilidadPista.getIdUsuario() + ", " + disponibilidadPista.getIdPista() + ")");

        if (lineas > 0) {
            aniadido = true;
        }

        ManageDB.closeConnection(connection);
        return aniadido;
    }

    public boolean removeDisponibilidadPistasrBD(DisponibilidadPistas disponibilidadPista) throws ClassNotFoundException, SQLException {
        boolean eliminado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("DELETE FROM disponibilidadPistas WHERE id = " + disponibilidadPista.getId());

        if (lineas > 0) {
            eliminado = true;
        }

        ManageDB.closeConnection(connection);
        return eliminado;
    }

    public static boolean removeDisponibilidadPistasBDStatic(DisponibilidadPistas disponibilidadPista) throws SQLException {
        boolean eliminado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("DELETE FROM disponibilidadPistas WHERE id = " + disponibilidadPista.getId());

        if (lineas > 0) {
            eliminado = true;
        }

        ManageDB.closeConnection(connection);
        return eliminado;
    }

    public DisponibilidadPistas getDisponibilidadPistasBD(int id) throws SQLException {
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM disponibilidadPistas WHERE id = " + id);
        rs.next();
        DisponibilidadPistas disponibilidadPista = new DisponibilidadPistas(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                rs.getInt(5), rs.getInt(6));
        ManageDB.closeConnection(connection);
        return disponibilidadPista;
    }

    public static DisponibilidadPistas getDisponibilidadPistasBDStatic(int id) throws SQLException {
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM disponibilidadPistas WHERE id = " + id);
        rs.next();
        DisponibilidadPistas disponibilidadPista = new DisponibilidadPistas(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                rs.getInt(5), rs.getInt(6));
        ManageDB.closeConnection(connection);
        return disponibilidadPista;
    }

    public boolean modifyDisponibilidadPistasBD(DisponibilidadPistas disponibilidadPista) throws SQLException {
        boolean modificado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("UPDATE disponibilidadPistas SET dia = " + disponibilidadPista.getDia()
                + ", franjaHoraria = " + disponibilidadPista.getFranjaHoraria() + ", pagado = " + disponibilidadPista.getPagado() + ", idUsuario"
                + disponibilidadPista.getIdUsuario() + ", idPista = " + disponibilidadPista.getIdPista());

        if (lineas > 0) {
            modificado = true;
        }

        ManageDB.closeConnection(connection);
        return modificado;
    }

    public static boolean modifyDisponibilidadPistasBDStatic(DisponibilidadPistas disponibilidadPista) throws SQLException {
        boolean modificado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("UPDATE disponibilidadPistas SET dia = " + disponibilidadPista.getDia()
                + ", franjaHoraria = " + disponibilidadPista.getFranjaHoraria() + ", pagado = " + disponibilidadPista.getPagado() + ", idUsuario"
                + disponibilidadPista.getIdUsuario() + ", idPista = " + disponibilidadPista.getIdPista());

        if (lineas > 0) {
            modificado = true;
        }

        ManageDB.closeConnection(connection);
        return modificado;
    }
}
