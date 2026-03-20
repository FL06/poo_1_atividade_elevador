public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    // Construtor
    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // térreo
        this.portaAberta = false;
    }

    // Abrir porta
    public void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta.");
    }

    // Fechar porta
    public void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechada.");
    }

    // Subir
    public void subir() {
        if (portaAberta) {
            System.out.println("Não é possível subir com a porta aberta.");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no último andar.");
        }
    }

    // Descer
    public void descer() {
        if (portaAberta) {
            System.out.println("Não é possível descer com a porta aberta.");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no térreo.");
        }
    }

    // Mostrar andar atual
    public void mostrarAndarAtual() {
        System.out.println("Andar atual: " + andarAtual);
    }

    // Verificar porta
    public void verificarPorta() {
        if (portaAberta) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        }
    }
}
