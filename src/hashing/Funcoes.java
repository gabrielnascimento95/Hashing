/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

/**
 *
 * @author 12265041670
 */
public class Funcoes {
    
    public int calculaHashDivisao(int num, int tam){
        int pos;
        if(ehPrimo(num)){
            pos = num%tam; 
        }else{
            int p=100;  
            while(p < 200){ // procura o numero primo mais proximo de tam no intervalo de 100-200
                if(ehPrimo(p)){
                    break;
                }else{
                    p++;
                }
            }
            pos = (num%p)%tam;
        }
        return pos;
    }
    
    private boolean ehPrimo(int x){
        int aux = (int) (x/2);
	for (int y=2; y < aux; y++){
            if (x % y == 0){
		return true;
            }
	}
        return false;
    }
    
    public int hashMultiplicaçao(int num, int tam){
        float a = (float) 0.61803399;
        int pos = (int)Math.floor(tam*(num*a - Math.floor(num*a)));
        return pos;
    }
    
    public int[] enlacamentoDeslocado(int cod[]){
        int pos = 0, a = 0, b = 3, c = 6; 
        int[] part1 = new int[3];
        int[] part2 = new int[3];
        int[] part3 = new int[3];
        for(int i = 0; i<2; i++){
            while(a<3){
                part1[a] = cod[a]; 
            }
            while(b<6){
                part2[b] = cod[b]; 
            }
            while(c<9){
                part3[c] = cod[c]; 
            }
        }
        return part1;
    }
    
}
