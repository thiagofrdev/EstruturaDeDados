public class Questao3 {
    /*
    OBS: Para testes nos exemplos, considerei um array de 6 posições. int[] array = new int[6];

    A) ERRADA. A fórumla para atribuir um novo valor a Ins está incorreta, pois o "+ 1" adicionado após a 
    operação dentro dos parênteses irá gerar um overflow de memória, a aprtir do momento em que, considerando
    que, em um array de 6 posições e o Ins estivesse apontando para o índice 5, a operação dentro do parênteses
    iria resultar em "5", e ao adiconar 1, o Ins passaria a valer 6 (indice que não existe e estoura a capacidade
    do array)
    Cálculo: Ins = (Ins % N) + 1 -> Ins = (5 % 6) + 1 -> Ins = 5 + 1 -> Ins = 6 (Overflow)
    
    B) CORRETA. A fórmula para o novo valor de Prim resulta corretamente em sua nova posição, mesmo dos extremos.
    Cálculo: Prim = ((Prim + 1) % N) -> Prim = ((5 + 1) % 6) -> Prim = (6 % 6) -> Prim = 0 (Volta ao índice de início)

    C) ERRADA. Pela lógica das Listas Estáticas Circulares, os ponteiros de inicio e fim podem apontar para o 
    mesmo índice, já que, por se tratar de algo circular, o fim pode se encontrar com o inicio (dar a volta).
    Neste caso, para determinar se uma Lista Estática Circular está cheia ou vazia, é necessário a instanciação de 
    uma variável que armazene a quantidade de elementos

    D) ERRADA. Há ao menos um caso que ocorre um erro nessa afirmação. Caso Prim aponde para 0 e Ins aponde para 5, 
    apesar de resultar em 0 (mesmo falor de Prim), não significa que a Lista está vazia, pois, pela lógica utilizada,
    o Ins indica uma posição vazia, onde um elemento AINDA será adicionado.
    */
}
