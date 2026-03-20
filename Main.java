public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(10);

        elevador.abrirPorta();
        elevador.subir(); // erro esperado
        elevador.fecharPorta();

        elevador.subir();
        elevador.subir();

        elevador.mostrarAndarAtual();

        elevador.descer();
        elevador.verificarPorta();
    }
}
