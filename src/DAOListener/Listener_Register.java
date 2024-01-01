/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOListener;

import Model.ObjectRegister;
import java.util.List;


public interface Listener_Register {
    public void tambah(ObjectRegister b);
    public List<ObjectRegister> getALL();
    public List<ObjectRegister> getusername(String username);
    public void delete(String username);
}
