// Classe que representa um objeto Carro
public class Carro {

    // Propriedades (atributos) do carro
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0; // Inicialmente o carro está parado
    }

    // Método para acelerar o carro
    public void acelerar(double incremento) {
        this.velocidadeAtual += incremento;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // Método para frear o carro
    public void frear(double decremento) {
        this.velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0; // Velocidade não pode ser negativa
        }
        System.out.println("O carro freou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // Método para obter a marca do carro
    public String getMarca() {
        return marca;
    }

    // Método para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Método para obter o ano de fabricação do carro
    public int getAno() {
        return ano;
    }

    // Método para obter a velocidade atual do carro
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}