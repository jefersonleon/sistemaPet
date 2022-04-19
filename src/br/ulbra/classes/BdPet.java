package br.ulbra.classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 * @author Leon
 */
public class BdPet {

    public ArrayList<Pet> listaPet = new ArrayList<Pet>();
    public void salvar(Pet p) {
        
        listaPet.add(p);
        JOptionPane.showMessageDialog(null,
                "Seu Pet foi salvo com sucesso!");
    }
    public String listar() {
        String resposta = "Não há animais cadastrados";
        if (!listaPet.isEmpty()) {
            resposta = "Lista Geral de Animais\n"
                    + "  ID       NOME       RAÇA       ANO NASC.      IDADE\n";
            for (int i = 0; i < listaPet.size(); i++) {
                resposta += listaPet.get(i).toString() + "\n";
            }
        }
        return resposta;
    }
    public int encontrarPet(Pet p){
     int aux = -1;
     for(int i=0;i<listaPet.size();i++){
       if(listaPet.get(i).getNome().equals(p.getNome())){
         aux=i;
     }
     }
     return aux;
    }
    public Pet getPet(int indice){
        return listaPet.get(indice);
    }
    public void removerPet(int indice){
        if(indice < listaPet.size()){
            listaPet.remove(indice);
            JOptionPane.showMessageDialog(null, 
          "Seu pet foi excluído com sucesso! ");
        }else{
           JOptionPane.showMessageDialog(null, 
          "Não foi possível excluir o Pet"); 
        }
    }
    public void alterarPet(int indice,Pet p){
        if(indice < listaPet.size()){
            listaPet.set(indice, p);
            JOptionPane.showMessageDialog(null, 
         "Seu pet foi modificado com sucesso! ");
        }else{
           JOptionPane.showMessageDialog(null, 
          "Não foi possível modificar o Pet"); 
        }
    }
}

