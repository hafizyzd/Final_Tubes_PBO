/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOListener;

import Model.Admin;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface Listener_Admin {
    
    public List<Admin> getALL();
    
    public List<Admin> getCariUsername(String username, String password);
}
