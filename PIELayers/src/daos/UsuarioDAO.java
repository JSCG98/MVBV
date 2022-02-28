package daos;

import domains.Usuario;
import java.sql.*;

public class UsuarioDAO {

    public boolean addUsuariorBD(Usuario usuario) throws ClassNotFoundException, SQLException {
        boolean aniadido = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("INSERT INTO usuarios (nombre, apellidos, dni, telefono, direccion, email, edad, de_baja) "
                + "VALUES (" + usuario.getNombre() + "," + usuario.getApellidos() + ","
                + usuario.getDni() + ", " + usuario.getTelefono() + ", " + usuario.getDireccion() + ", " + usuario.getEmail()
                + ", " + usuario.getEdad() + ", " + usuario.getDe_baja() + ")");

        if (lineas > 0) {
            aniadido = true;
        }

        ManageDB.closeConnection(connection);
        return aniadido;
    }

    public static boolean addUsuarioBDStatic(Usuario usuario) throws SQLException {
        boolean aniadido = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("INSERT INTO usuarios (nombre, apellidos, dni, telefono, direccion, email, edad, de_baja) "
                + "VALUES (" + usuario.getNombre() + "," + usuario.getApellidos() + ","
                + usuario.getDni() + ", " + usuario.getTelefono() + ", " + usuario.getDireccion() + ", " + usuario.getEmail()
                + ", " + usuario.getEdad() + ", " + usuario.getDe_baja() + ")");

        if (lineas > 0) {
            aniadido = true;
        }

        ManageDB.closeConnection(connection);
        return aniadido;
    }

    public boolean removeUsuariorBD(Usuario usuario) throws ClassNotFoundException, SQLException {
        boolean eliminado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("DELETE FROM usuarios WHERE id = " + usuario.getId());

        if (lineas > 0) {
            eliminado = true;
        }

        ManageDB.closeConnection(connection);
        return eliminado;
    }

    public static boolean removeUsuarioBDStatic(Usuario usuario) throws SQLException {
        boolean eliminado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("DELETE FROM usuarios WHERE id = " + usuario.getId());

        if (lineas > 0) {
            eliminado = true;
        }

        ManageDB.closeConnection(connection);
        return eliminado;
    }

    public Usuario getUsuarioBD(int id) throws SQLException {
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM usuarios WHERE id = " + id);
        rs.next();
        Usuario usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
        ManageDB.closeConnection(connection);
        return usuario;
    }

    public static Usuario getUsuarioBDStatic(int id) throws SQLException {
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM usuarios WHERE id = " + id);
        rs.next();
        Usuario usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
        ManageDB.closeConnection(connection);
        return usuario;
    }

    public boolean modifyUsuarioBD(Usuario usuario) throws SQLException {
        boolean modificado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("UPDATE usuarios SET nombre = " + usuario.getNombre()
                + ", apellidos = " + usuario.getApellidos() + ", dni = " + usuario.getDni() + ", telefono"
                + usuario.getTelefono() + ", direccion = " + usuario.getDireccion()
                + ", email = " + usuario.getEmail() + ", edad = " + usuario.getEdad()
                + ", de_baja = " + usuario.getDe_baja() + " WHERE id = " + usuario.getId());

        if (lineas > 0) {
            modificado = true;
        }

        ManageDB.closeConnection(connection);
        return modificado;
    }

    public static boolean modifyUsuarioBDStatic(Usuario usuario) throws SQLException {
        boolean modificado = false;
        Connection connection = ManageDB.connectToDB();
        Statement st = connection.createStatement();
        int lineas = st.executeUpdate("UPDATE usuarios SET nombre = " + usuario.getNombre()
                + ", apellidos = " + usuario.getApellidos() + ", dni = " + usuario.getDni() + ", telefono"
                + usuario.getTelefono() + ", direccion = " + usuario.getDireccion()
                + ", email = " + usuario.getEmail() + ", edad = " + usuario.getEdad()
                + ", de_baja = " + usuario.getDe_baja() + " WHERE id = " + usuario.getId());

        if (lineas > 0) {
            modificado = true;
        }

        ManageDB.closeConnection(connection);
        return modificado;
    }
}
