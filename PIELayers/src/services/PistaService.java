package services;

import daos.PistaDAO;
import domains.Pista;
import java.sql.SQLException;

public class PistaService {
    PistaDAO pistadao;

    public boolean addPista(Pista pista) throws ClassNotFoundException, SQLException {
        pistadao = new PistaDAO();
        return pistadao.addPistaBD(pista);
    }

    public static boolean addPistaStatic(Pista pista) throws SQLException {
        return PistaDAO.addPistaBDStatic(pista);
    }

    public boolean removePista(Pista pista) throws ClassNotFoundException, SQLException {
        pistadao = new PistaDAO();
        return pistadao.removePistarBD(pista);
    }

    public static boolean removePistaStatic(Pista pista) throws SQLException {
        return PistaDAO.removePistaBDStatic(pista);
    }

    public Pista getPista(int id) throws ClassNotFoundException, SQLException {
        pistadao = new PistaDAO();
        return pistadao.getPistaBD(id);
    }

    public static Pista getPistaStatic(int id) throws SQLException {
        return PistaDAO.getPistaBDStatic(id);
    }

    public boolean modifyPista(Pista pista) throws ClassNotFoundException, SQLException {
        pistadao = new PistaDAO();
        return pistadao.modifyPistaBD(pista);
    }

    public static boolean modifyPistaStatic(Pista pista) throws SQLException {
        return PistaDAO.modifyPistaBDStatic(pista);
    }
}
