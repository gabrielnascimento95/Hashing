/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.util.ArrayList;

/**
 *
 * @author 12265041670
 */
public class TratamentoColisao {
    
    public void enderecamentoAberto(ArrayList tabela, int val){
       int pos = val%tabela.size();
       int i=0;
       if(tabela.get(pos) == null){
           tabela.add(pos, val);
       }else{
           while(tabela.get(pos+i) != null && tabela.size() < pos+i){
               i++;
           }
           tabela.add(pos+i, val);
       }
    }
    
    public void re_hashing(ArrayList tabela, int val){
       int pos = val%tabela.size();
       int i=2, pos2;
       if(tabela.get(pos) == null){
           tabela.add(pos, val);
       }else{
           pos2 = 1+(val%(tabela.size()-3)); 
           while(tabela.get(pos+pos2*i) != null && tabela.size() < pos+pos2*i){
                i++;
           }
           tabela.add(pos+pos2*i, val);
       }
    }
    
    public void encadeamentoSeparado(ArrayList tabela, ArrayList lista, int val){
        
        
    }
    
    public void encadeamentoCoalescidoComPorao(ArrayList tabela, int val, int posicaoIncial){
        int pos = posicaoIncial;
        if((int)tabela.get(pos+1) == -2){
            
        }
        
    }
}
