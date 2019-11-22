package edu.escuelaing.arep.Repositories.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

import edu.escuelaing.arep.Model.Employeer;
import edu.escuelaing.arep.Repositories.IEmployeerRepository;

public class EmployeerRepository implements IEmployeerRepository {

    private final Map<Integer, Employeer> employeers = new HashMap<>();

    @Override
    public List<Employeer> getEmployeerList() throws Exception {
        Set<Employeer> employeerSet = new HashSet<>(employeers.values());
        List<Employeer> employeersList = new ArrayList<Employeer>();
        for (Employeer e : employeerSet) {
            employeersList.add(e);
        }
        return employeersList;
    }

    @Override
    public void saveEmployeer(Employeer employeer) throws Exception {
        Integer empId = new Integer(employeer.getId());
        if (employeers.containsKey(empId)) {
            throw new Exception("Sorry this employeer already exists");
        } else {
            employeers.put(empId, employeer);
        }
    }

    @Override
    public Employeer getEmployeerByEmail(int id) throws Exception {
        Integer empId = new Integer(id);
        if (employeers.get(empId) == null) {
            throw new Exception("El empleado con documento de identidad " + empId.toString() + " no fue encontrado");
        } else {
            return employeers.get(empId);

        }
    }

    @Override
    public void deleteEmployeer(int id) throws Exception {
        Integer empId = new Integer(id);
        if (employeers.containsKey(empId)) {
            throw new Exception("Sorry this employeer does not exist");
        } else {
            employeers.remove(empId);
        }

    }

}