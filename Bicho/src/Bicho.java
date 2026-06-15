import java.util.Scanner;

class Bicho {
    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;
    int nivelCansado = 0;
    int idade = 0;
    boolean vivo = true;
    int xixi = 0;
    int sujera =0;

    // Construtor para inicializar o nome do bicho
    public Bicho(String nome) {
        this.nome = nome;
    }


    public void descansar(){
        nivelCansado -= 10;
        System.out.println(this.nome + " está descansado. O nível de cansaço diminuiu.");
    }
    public void alimentar() {
        nivelDeFome -= 10;
        xixi += 5;
        System.out.println(this.nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void iraobanheiro() {

        xixi -= 5;
        System.out.println(this.nome + " está aliviado");
    }


    public void tomarbanho() {
        sujera -= 7;
        System.out.println(this.nome + " está limpinho");
    }

    public void brincar() {
        sujera += 7;
        nivelFelicidade += 10;
        nivelCansado += 20;
        System.out.println(this.nome + " está brincando e se sentindo mais feliz, porém está mais cansado ");
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + this.nome + ":");
        System.out.println("Nível de fome: " + this.nivelDeFome);
        System.out.println("Nível de felicidade: " + this.nivelFelicidade);
        System.out.println("Nível de cansaço: " +this.nivelCansado);
        System.out.println("A idade de: " + this.nome + " é de: " + this.idade);
        System.out.println("Nível de vontade de ir no banheiro é: " + this.xixi);
        System.out.println("Seu animal está muito sujo, seu nível de sujeira é de: " + this.sujera);

    }

    public void passarTempo() {


        nivelDeFome += 5;
        idade += 1;
        nivelFelicidade += 3;
        nivelCansado +=10;

        System.out.println("Idade atual: " + idade);

        if (idade >= 50) {
            vivo = false;
            System.out.println("O bicho morreu aos " + idade + " anos de velhice.");
        }

        if (nivelFelicidade >= 0) {
            vivo = false;
            System.out.println("O bicho morreu de tristeza");
        }

        if (nivelCansado >= 100) {
            vivo = false;
            System.out.println("O bicho morreu de cansaço você é um péssimo dono");
        }

        if (nivelDeFome >= 100) {
            vivo = false;
            System.out.println("O bicho morreu deu fome, alguém prenda você");
        }
    }


}