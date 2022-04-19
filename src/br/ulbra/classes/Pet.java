
package br.ulbra.classes;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Leon
 */
public class Pet {
    private int id;
    private String nome;
    private String raca;
    private int anoNasc;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Pet(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    public int getAnoAtual(){
         Calendar ano = Calendar.getInstance();
        int anoAtual = ano.get(Calendar.YEAR);
        return anoAtual;
    }

    @Override
    public String toString() {
       
  return id+"    -     "+nome+"    -     "+raca+"    -    "+sexo +" - " 
          +anoNasc+" - "+(getAnoAtual()-anoNasc);
    }
}
