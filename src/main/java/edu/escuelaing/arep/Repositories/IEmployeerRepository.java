package edu.escuelaing.arep.Repositories;

import java.util.List;
import java.util.Set;

import edu.escuelaing.arep.Model.Employeer;

public interface IEmployeerRepository {

    List<Employeer> getEmployeerList() throws Exception;

    void saveEmployeer(Employeer employeer) throws Exception;

    Employeer getEmployeerByEmail(int id) throws Exception;

    void deleteEmployeer(int id) throws Exception;

}