package Klassen.DAO;

import Klassen.Exceptions.LagerhalleNichtVorhandenException;
import Klassen.Exceptions.LagerhalleVorhandenException;
import Klassen.Lagerhalle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LagerhalleDAO {
    private Map<String, Lagerhalle> lagerhalleMap = new HashMap<>();

    public void insert(Lagerhalle lagerhalle) throws LagerhalleVorhandenException {
        if (lagerhalleMap.containsKey(lagerhalle.getLagerhalleNr())){
            throw new LagerhalleVorhandenException(lagerhalle.getLagerhalleNr());
        }
        lagerhalleMap.put(lagerhalle.getLagerhalleNr(), lagerhalle);
    }

    public Lagerhalle findById(String lagerhalleNr) throws LagerhalleNichtVorhandenException {
        if (!lagerhalleMap.containsKey(lagerhalleNr)){
            throw new LagerhalleNichtVorhandenException(lagerhalleNr);
        }
        return lagerhalleMap.get(lagerhalleNr);
    }

    public List<Lagerhalle> findAll(){
        return lagerhalleMap.values().stream().toList();
    }

    public void update(Lagerhalle lagerhalle) throws LagerhalleNichtVorhandenException {
        if (!lagerhalleMap.containsValue(lagerhalle)){
            throw new LagerhalleNichtVorhandenException(lagerhalle.getLagerhalleNr());
        }
        lagerhalleMap.replace(lagerhalle.getLagerhalleNr(), lagerhalle);
    }

    public void delete(String lagerhalleNr) throws LagerhalleNichtVorhandenException {
        if (!lagerhalleMap.containsKey(lagerhalleNr)){
            throw new LagerhalleNichtVorhandenException(lagerhalleNr);
        }
        lagerhalleMap.remove(lagerhalleNr);
    }



}
