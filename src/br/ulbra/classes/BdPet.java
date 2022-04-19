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
                    + "ID     NOME     RAÇA     ANO NASC.    IDADE\n";
            for (int i = 0; i < listaPet.size(); i++) {
                resposta += listaPet.get(i).toString() + "\n";
            }
        }
        return resposta;
    }
}
