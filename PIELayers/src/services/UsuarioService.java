package services;

import daos.UsuarioDAO;
import domains.Usuario;
import java.sql.*;

public class UsuarioService {

    UsuarioDAO usuariodao;

    public boolean addUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
        usuariodao = new UsuarioDAO();
        return usuariodao.addUsuariorBD(usuario);
    }

    public static boolean addUsuarioStatic(Usuario usuario) throws SQLException {
        return UsuarioDAO.addUsuarioBDStatic(usuario);
    }

    public boolean removeUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
        usuariodao = new UsuarioDAO();
        return usuariodao.removeUsuariorBD(usuario);
    }

    public static boolean removeUsuarioStatic(Usuario usuario) throws SQLException {
        return UsuarioDAO.removeUsuarioBDStatic(usuario);
    }

    public Usuario getUsuario(int id) throws ClassNotFoundException, SQLException {
        usuariodao = new UsuarioDAO();
        return usuariodao.getUsuarioBD(id);
    }

    public static Usuario getUsuarioStatic(int id) throws SQLException {
        return UsuarioDAO.getUsuarioBDStatic(id);
    }

    public boolean modifyUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
        usuariodao = new UsuarioDAO();
        return usuariodao.modifyUsuarioBD(usuario);
    }

    public static boolean modifyUsuarioStatic(Usuario usuario) throws SQLException {
        return UsuarioDAO.modifyUsuarioBDStatic(usuario);
    }
}
