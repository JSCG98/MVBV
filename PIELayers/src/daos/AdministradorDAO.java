package daos;

import domains.Administrador;
import java.sql.*;

public class AdministradorDAO {

    public boolean addAdministradorBD(Administrador admin) throws ClassNotFoundException, SQLException {
        boolean aniadido = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("INSERT INTO administradores (usuario, contrasenia) "
                + "VALUES (" + admin.getUsuario() + "," + admin.getContrasenia() + ")");

        if (lineas > 0) {
            aniadido = true;
        }

        ManageDB.closeConnection(connection);
        return aniadido;
    }

    public static boolean addAdministradorBDStatic(Administrador admin) throws SQLException {
        boolean aniadido = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("INSERT INTO administradores (usuario, contrasenia) "
                + "VALUES (" + admin.getUsuario() + "," + admin.getContrasenia() + ")");

        if (lineas > 0) {
            aniadido = true;
        }

        ManageDB.closeConnection(connection);
        return aniadido;
    }

    public boolean removeAdministradorBD(Administrador admin) throws ClassNotFoundException, SQLException {
        boolean eliminado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("DELETE FROM administradores WHERE id = " + admin.getId());

        if (lineas > 0) {
            eliminado = true;
        }

        ManageDB.closeConnection(connection);
        return eliminado;
    }

    public static boolean removeAdministradorBDStatic(Administrador admin) throws SQLException {
        boolean eliminado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("DELETE FROM administradores WHERE id = " + admin.getId());

        if (lineas > 0) {
            eliminado = true;
        }

        ManageDB.closeConnection(connection);
        return eliminado;
    }

    public Administrador getAdminBD(int id) throws SQLException {
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM administradores WHERE id = " + id);
        rs.next();
        Administrador admin = new Administrador(rs.getInt(1), rs.getString(2), rs.getString(3));
        ManageDB.closeConnection(connection);
        return admin;
    }

    public static Administrador getAdminBDStatic(int id) throws SQLException {
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM administradores WHERE id = " + id);
        rs.next();
        Administrador admin = new Administrador(rs.getInt(1), rs.getString(2), rs.getString(3));
        ManageDB.closeConnection(connection);
        return admin;
    }

    public boolean modifyAdministradorBD(Administrador admin) throws SQLException {
        boolean modificado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("UPDATE administradores SET usuario = " + admin.getUsuario()
                + ", contrasenia = " + admin.getContrasenia());

        if (lineas > 0) {
            modificado = true;
        }

        ManageDB.closeConnection(connection);
        return modificado;
    }

    public static boolean modifyAdministradorBDStatic(Administrador admin) throws SQLException {
        boolean modificado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("UPDATE administradores SET usuario = " + admin.getUsuario()
                + ", contrasenia = " + admin.getContrasenia());

        if (lineas > 0) {
            modificado = true;
        }

        ManageDB.closeConnection(connection);
        return modificado;
    }
}
