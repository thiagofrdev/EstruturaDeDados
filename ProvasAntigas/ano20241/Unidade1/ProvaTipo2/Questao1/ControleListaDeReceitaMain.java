public class ControleListaDeReceitaMain {
    public static void main(String[] args) {
        ListaDeReceita boloSimples = new ListaDeReceita(
                "Bolo Simples",
                "2 xícaras de farinha de trigo, 1 xícara de açúcar, 3 ovos, 1/2 xícara de óleo, 1 xícara de leite, 1 colher de sopa de fermento em pó",
                "Bater os ovos com o açúcar e o óleo. Adicionar a farinha e o leite aos poucos, alternando. Por último, adicionar o fermento e misturar delicadamente. Assar em forno pré-aquecido a 180°C por cerca de 40 minutos.",
                "bolo"
        );

        ListaDeReceita brigadeiro = new ListaDeReceita(
                "Brigadeiro",
                "1 lata de leite condensado, 1 colher de sopa de manteiga, 3 colheres de sopa de chocolate em pó, granulado para enrolar",
                "Misturar o leite condensado, a manteiga e o chocolate em pó em uma panela. Levar ao fogo baixo, mexendo sempre, até desgrudar do fundo da panela. Esperar esfriar e enrolar em bolinhas, passando no granulado.",
                "doce"
        );

        ListaDeReceita limonada = new ListaDeReceita(
                "Limonada",
                "6 limões, água, açúcar a gosto, gelo",
                "Espremer os limões. Misturar o suco com água e açúcar a gosto. Adicionar gelo e servir.",
                "bebida"
        );

        ListaDeReceita macarraoAlhoOleo = new ListaDeReceita(
                "Macarrão com Alho e Oleo",
                "500g de macarrão, 5 dentes de alho picados, 1/2 xícara de azeite, pimenta calabresa a gosto, salsinha picada, queijo parmesão ralado",
                "Cozinhar o macarrão conforme as instruções da embalagem. Em uma frigideira, dourar o alho no azeite com a pimenta calabresa. Escorrer o macarrão e jogar na frigideira, misturando bem. Finalizar com salsinha e queijo parmesão.",
                "salgado"
        );

        ControleListaDeReceita listaDeReceita = new ControleListaDeReceita();

        listaDeReceita.verificar();
        listaDeReceita.inserir(macarraoAlhoOleo);
        listaDeReceita.inserir(boloSimples);
        System.out.println(listaDeReceita.imprimir());
        listaDeReceita.inserir(brigadeiro);
        System.out.println(listaDeReceita.verificar().getNomeReceita());
    }
}