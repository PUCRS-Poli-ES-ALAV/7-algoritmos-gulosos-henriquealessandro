public class ProblemaTroco{
    public static void main(String[] args){
    int[] moedas = {100,25,10,5,1};
    int[] resultado = guloso(moedas, 545);
    
    System.out.println(
    "1 Real: " +resultado[0]
    +"\n25 Centavos: " +resultado[1]
    +"\n10 Centavos: " +resultado[2]
    +"\n5 Centavos: " +resultado[3]
    +"\n1 Centavo: " +resultado[4]
    );
    
    }
    
    public static int[] guloso(int[] moedas, int valorTroco){
    
    int[] moedasUsadas = {0,0,0,0,0};
    
    while (valorTroco>0) {
    for (int i = 0; i < moedas.length; i++) {
    if(valorTroco-moedas[i]>=0){
    valorTroco = valorTroco - moedas[i];
    moedasUsadas[i]++;
    break;
    }
    }
    }
    
    return moedasUsadas;
    }
    
    }