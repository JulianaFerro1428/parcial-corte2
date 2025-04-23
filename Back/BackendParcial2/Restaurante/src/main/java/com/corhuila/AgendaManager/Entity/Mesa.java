package com.corhuila.AgendaManager.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mesa")
public class Mesa extends ABaseEntity{

    @Column(name = "code", nullable = false , length = 20)
    private String code;

    @Column(name = "mesaDispo", nullable = false , length = 20, unique = true)
    private String mesaDispo;
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMesaDisponible() {
        return mesaDispo;
    }

    public void setMesaDisponible(String mesaDisponible) {
        this.mesaDispo = mesaDisponible;
    }
}
