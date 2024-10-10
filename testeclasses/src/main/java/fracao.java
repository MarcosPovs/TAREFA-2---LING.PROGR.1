public class fracao {
    private int numerador;
    private int denominador;

    // Construtor
    public fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar(); // Simplificar a fração na criação
    }

    // Métodos para obter o numerador e denominador
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    // Soma de duas frações
    public fracao somar(fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new fracao(novoNumerador, novoDenominador);
    }

    // Subtração de duas frações
    public fracao subtrair(fracao outra) {
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new fracao(novoNumerador, novoDenominador);
    }

    // Multiplicação de duas frações
    public fracao multiplicar(fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new fracao(novoNumerador, novoDenominador);
    }

    // Divisão de duas frações
    public fracao dividir(fracao outra) {
        if (outra.numerador == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new fracao(novoNumerador, novoDenominador);
    }

    // Método para simplificar a fração
    private void simplificar() {
        int mdc = calcularMDC(numerador, denominador);
        numerador /= mdc;
        denominador /= mdc;

        // Se o denominador for negativo, mover o sinal para o numerador
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    // Metodo para calcular o Máximo Divisor Comum (MDC) usando o algoritmo de Euclides
    private int calcularMDC(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return calcularMDC(b, a % b);
    }

    // Exibir a fração no formato simplificado
    @Override
    public String toString() {
        if (denominador == 1) {
            return String.valueOf(numerador); // Se o denominador for 1, exibir apenas o numerador
        }
        return numerador + "/" + denominador;
    }
}
