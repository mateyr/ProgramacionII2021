/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Pojo.Vehicle;
import java.io.IOException;
import java.util.Collection;


/**
 *
 * @author yasser.membreno
 */
public interface VehicleDao extends Dao<Vehicle>{
    Vehicle findById(int id) throws IOException;
    Collection<Vehicle> findByStatus(String status) throws IOException;
}
