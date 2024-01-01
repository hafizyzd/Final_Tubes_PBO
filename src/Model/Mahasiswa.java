package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Akun{
    private Integer nim;
    private String notif;
    private Integer nilai_pbo;
    private Integer nilai_bd;
    private Integer nilai_jre;

    public Integer getNilai_pbo() {
        return nilai_pbo;
    }

    public void setNilai_pbo(Integer nilai_pbo) {
        this.nilai_pbo = nilai_pbo;
    }

    public Integer getNilai_bd() {
        return nilai_bd;
    }

    public void setNilai_bd(Integer nilai_bd) {
        this.nilai_bd = nilai_bd;
    }

    public Integer getNilai_jre() {
        return nilai_jre;
    }

    public void setNilai_jre(Integer nilai_jre) {
        this.nilai_jre = nilai_jre;
    }
    
    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNotif() {
        return notif;
    }

    public void setNotif(String notif) {
        this.notif = notif;
    }
    
    
}
