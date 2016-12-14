package com.domain;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Vitsi extends AbstractPersistable<Long> {
    private String otsikko;
    private String sisalto;
    private Kayttaja kayttaja;

    public String getOtsikko() {
        return otsikko;
    }

    public String getSisalto() {
        return sisalto;
    }

    public Kayttaja getKayttaja() {
        return kayttaja;
    }

    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    public void setSisalto(String sisalto) {
        this.sisalto = sisalto;
    }

    public void setKayttaja(Kayttaja kayttaja) {
        this.kayttaja = kayttaja;
    }
    
    
    
}
