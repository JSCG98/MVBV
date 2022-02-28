package services;

import daos.AdministradorDAO;
import domains.Administrador;
import java.sql.*;

public class AdministradorService {

    AdministradorDAO administradordao;

    public boolean addAdministrador(Administrador admin) throws ClassNotFoundException, SQLException {
        administradordao = new AdministradorDAO();
        return administradordao.addAdministradorBD(admin);
    }

    public static boolean addAdministradorStatic(Administrador admin) throws SQLException {
        return AdministradorDAO.addAdministradorBDStatic(admin);
    }

    public boolean removeAdministrador(Administrador admin) throws ClassNotFoundException, SQLException {
        administradordao = new AdministradorDAO();
        return administradordao.removeAdministradorBD(admin);
    }

    public static boolean removeAdministradorStatic(Administrador admin) throws SQLException {
        return AdministradorDAO.removeAdministradorBDStatic(admin);
    }

    public Administrador getAdministrador(int id) throws ClassNotFoundException, SQLException {
        administradordao = new AdministradorDAO();
        return administradordao.getAdminBD(id);
    }

    public static Administrador getAdministradorStatic(int id) throws SQLException {
        return AdministradorDAO.getAdminBDStatic(id);
    }

    public boolean modifyAdministrador(Administrador admin) throws ClassNotFoundException, SQLException {
        administradordao = new AdministradorDAO();
        return administradordao.modifyAdministradorBD(admin);
    }

    public static boolean modifyAdministradorStatic(Administrador admin) throws SQLException {
        return AdministradorDAO.modifyAdministradorBDStatic(admin);
    }
}
