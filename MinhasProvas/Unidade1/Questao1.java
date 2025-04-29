// Controle de reservas de passagens aereas
public interface Questao1 {
    //MÉTODOS PRINCIPAIS
    boolean inserir(PassagemAerea passagem);                // Cria uma passagem completa
    PassagemAerea verificar();                              // Retorna a primeira passagem da Lista
    boolean atualizar(int posicao, PassagemAerea passagem); // Atualiza uma passagem completa a partir da sua posição
    PassagemAerea remover(int posicao);                     // Remove uma passagemc completa a partir da posição

    //MÉTODOS SECUNDÁRIOS
    boolean estaCheia();    //Verifica se a lista está cheia
    boolean estaVazia();    //Verifica se a lista está vazia
    String imprimir();      //Imprime a lista

    //MÉTODOS UTILITÁRIOS
    //Nome de Passageiro
    void ordernarPorNome();                                 //Ordena as passagens por nome
    boolean alterarNome(int posicao, String novoNome);      //Altera o nome do cliente pela posicao da passagem
    PassagemAerea excluirPorNome(String nomePassageiro);    //Exclui uma passagem pelo nome do cliente
    PassagemAerea buscarPorNome(String nomePassageiro);     //Busca uma passagem pelo nome do cliente

    //Data e horário do voo
    void ordernarPorData();                                             //Ordena as passagens por data
    boolean alterarDataHora(int posicao, Data dataIda, Data dataVolta); //Altera as datas de uma passagem

    //Classe da passagem
    void ordernarPorClasse();                               //Ordena todas as passagens pela classe
    boolean alterarClasse(int posicao, String novaClasse);  //Alterar a classe pela posição

    //Origem e Destino
    PassagemAerea buscarPorDestino(String destino);                         //Busca as passagens pelo destino
    PassagemAerea buscarPorOrigem(String origem);                           //Busca as passagens pela origem
    PassagemAerea buscarPorOrigemEDestino(String origem, String destino);   //Busca as passagens pela origem e destino
    boolean alterarDestino(int posicao, String novoDestino);                //Altera um destino pela posição da passagem
    boolean alterarOrigem(int posicao, String novaOrigem);                  //Altera a origem pela posição da passagem
}