/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pollweb.data.dao;

import pollweb.data.util.DAO;
import pollweb.data.util.DataLayer;

/**
 *
 * @author venecia2
 */
public class UserDAO_MySQL extends DAO implements UserDAO{
    
    public UserDAO_MySQL(DataLayer d) {
        super(d);
    }
    
}