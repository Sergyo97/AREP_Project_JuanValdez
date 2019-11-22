package edu.escuelaing.arep.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.escuelaing.arep.Model.Employeer;
import edu.escuelaing.arep.Repositories.IEmployeerRepository;
import edu.escuelaing.arep.Services.IEmployeerService;

public class EmployeerService implements IEmployeerService {

    @Autowired
    IEmployeerRepository employeerRepository;

    @Override
    public void deleteEmployeer(int id) throws Exception {
        employeerRepository.deleteEmployeer(id);

    }

    @Override
    public Employeer getEmployeerById(int id) throws Exception {
        return employeerRepository.getEmployeerByEmail(id);
    }

    @Override
    public List<Employeer> getEmployeerList() throws Exception {
        return employeerRepository.getEmployeerList();
    }

    @Override
    public void saveEmployeer(Employeer employeer) throws Exception {
        employeerRepository.saveEmployeer(employeer);
    }

}