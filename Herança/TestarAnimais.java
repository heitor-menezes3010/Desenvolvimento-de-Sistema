public class TestarAnimais {

    public static void main(String[] args) {

        // a) Objeto camelo do tipo Mamifero
        Mamifero camelo = new Mamifero(
            "Camelo",   // nome
            150,        // comprimento (cm)
            4,          // número de patas
            "Amarelo",  // cor
            "Terra",    // ambiente
            2.0f,       // velocidade média (m/s)
            "Mel"       // alimento (não especificado no slide 33, adicionado para completar)
        );

        // b) Objeto tubarao do tipo Peixe
        Peixe tubarao = new Peixe(
            "Tubarão",          // nome
            300,                // comprimento (cm)
            0,                  // número de patas
            "Cinzento",         // cor
            "Mar",              // ambiente
            1.5f,               // velocidade média (m/s)
            "Barbatanas e cauda" // característica
        );

        // c) Objeto ursocanada do tipo Mamifero
        Mamifero ursocanada = new Mamifero(
            "Urso-do-canadá", // nome
            180,              // comprimento (cm)
            4,                // número de patas
            "Vermelho",       // cor
            "Terra",          // ambiente
            0.5f,             // velocidade média (m/s)
            "Mel"             // alimento
        );

        // d) Chama os métodos para imprimir os dados de cada objeto
        System.out.println("=============================");
        camelo.dadosMamifero();

        System.out.println("=============================");
        tubarao.dadosPeixe();

        System.out.println("=============================");
        ursocanada.dadosMamifero();
        System.out.println("=============================");
    }
}
