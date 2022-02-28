package services;

import daos.DisponibilidadPistasDAO;
import domains.DisponibilidadPistas;
import java.sql.SQLException;

public class DisponibilidadPistasService {

    DisponibilidadPistasDAO disponibilidadPistasdao;

    public boolean adddisponibilidadPistas(DisponibilidadPistas disponibilidadPistas) throws ClassNotFoundException, SQLException {
        disponibilidadPistasdao = new DisponibilidadPistasDAO();
        return disponibilidadPistasdao.addDisponibilidadPistasBD(disponibilidadPistas);
    }

    public static boolean adddisponibilidadPistasStatic(DisponibilidadPistas disponibilidadPistas) throws SQLException {
        return DisponibilidadPistasDAO.addDisponibilidadPistasBDStatic(disponibilidadPistas);
    }

    public boolean removedisponibilidadPistas(DisponibilidadPistas disponibilidadPistas) throws ClassNotFoundException, SQLException {
        disponibilidadPistasdao = new DisponibilidadPistasDAO();
        return disponibilidadPistasdao.removeDisponibilidadPistasrBD(disponibilidadPistas);
    }

    public static boolean removedisponibilidadPistasStatic(DisponibilidadPistas disponibilidadPistas) throws SQLException {
        return DisponibilidadPistasDAO.removeDisponibilidadPistasBDStatic(disponibilidadPistas);
    }

    public DisponibilidadPistas getdisponibilidadPistas(int id) throws ClassNotFoundException, SQLException {
        disponibilidadPistasdao = new DisponibilidadPistasDAO();
        return disponibilidadPistasdao.getDisponibilidadPistasBD(id);
    }

    public static DisponibilidadPistas getdisponibilidadPistasStatic(int id) throws SQLException {
        return DisponibilidadPistasDAO.getDisponibilidadPistasBDStatic(id);
    }

    public boolean modifydisponibilidadPistas(DisponibilidadPistas disponibilidadPistas) throws ClassNotFoundException, SQLException {
        disponibilidadPistasdao = new DisponibilidadPistasDAO();
        return disponibilidadPistasdao.modifyDisponibilidadPistasBD(disponibilidadPistas);
    }

    public static boolean modifydisponibilidadPistasStatic(DisponibilidadPistas disponibilidadPistas) throws SQLException {
        return DisponibilidadPistasDAO.modifyDisponibilidadPistasBDStatic(disponibilidadPistas);
    }
}
