package com.corhuila.AgendaManager.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente extends ABaseEntity{

    @Column(name = "code", nullable = true , length = 20)
    private String code;

    @Column(name = "nombre", nullable = false , length = 20, unique = true)
    private String nombre;

    @Column(name = "numero", nullable = false , length = 50)
    private String numero;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmai() {
        return email;
    }

    public void setEmai(String emai) {
        this.email = emai;
    }
    


    
}
