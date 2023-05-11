package Klassen.DAO;

import Klassen.Exception.GastNichtVorhandenException;
import Klassen.Exception.GastVorhandenException;
import Klassen.Exception.ListIsEmptyException;
import Klassen.Gast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GastDAO {
    private final Map<Integer, Gast> gastMap = new HashMap<>();
    private static GastDAO instance;
    private GastDAO() {

    }

    public static GastDAO getInstance() {
        if (instance == null) {
            instance = new GastDAO();
        }
        return instance;
    }


    public void insert(Gast gast) throws GastVorhandenException {
        if (validateValue(gast)) {
            throw new GastVorhandenException();
        }
        gastMap.put(gast.getGastNr(), gast);
    }

    public Gast findById(int gastNr) throws GastNichtVorhandenException {
        if (validateKey(gastNr)) {
            return gastMap.get(gastNr);
        }

        throw new GastNichtVorhandenException();
    }

    public List<Gast> findAll() throws ListIsEmptyException {
        if (validateList()) {
            return gastMap.values().stream().toList();
        }
        throw new ListIsEmptyException();
    }

    public void update(Gast gast) throws GastNichtVorhandenException {
        if (!validateValue(gast)) {
            throw new GastNichtVorhandenException();
        }
        gastMap.replace(gast.getGastNr(), gast);
    }

    public void delete(int gastNr) throws GastNichtVorhandenException {
        if (!validateKey(gastNr)) {
            throw new GastNichtVorhandenException();
        }
        gastMap.remove(gastNr);
    }

    private boolean validateValue(Gast gast) {
        return gastMap.containsKey(gast.getGastNr());
    }

    private boolean validateKey(int gastNr) {
        return gastMap.containsKey(gastNr);
    }

    private boolean validateList() {
        return !gastMap.values().stream().toList().isEmpty();
    }
}


