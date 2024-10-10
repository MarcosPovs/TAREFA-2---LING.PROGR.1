public class TestaFracao {
    public static void main(String[] args) {
        // Fórmula 1: "2/5 + 3/7"
        fracao f1 = new fracao(2, 5); // 2/5
        fracao f2 = new fracao(3, 7); // 3/7
        fracao resultado1 = f1.somar(f2);
        System.out.println("2/5 + 3/7 = " + resultado1); // Esperado: 29/35

        // Fórmula 2: "4/3 - 2/7"
        fracao f3 = new fracao(4, 3); // 4/3
        fracao f4 = new fracao(2, 7); // 2/7
        fracao resultado2 = f3.subtrair(f4);
        System.out.println("4/3 - 2/7 = " + resultado2); // Esperado: 22/21

        // Fórmula 3: "4/3 + 2/5 + 3/2"
        fracao f5 = new fracao(3, 2); // 3/2
        fracao resultado3 = f3.somar(f4).somar(f5);
        System.out.println("4/3 + 2/5 + 3/2 = " + resultado3); // Esperado: 107/30

        // Fórmula 4: "10/4 - 4/3"
        fracao f6 = new fracao(10, 4); // 10/4
        fracao resultado4 = f6.subtrair(f3);
        System.out.println("10/4 - 4/3 = " + resultado4); // Esperado: 11/6

        // Fórmula 5: "2 + 1/3 - 5/4"
        fracao f7 = new fracao(2, 1); // 2 (como fração 2/1)
        fracao f8 = new fracao(1, 3); // 1/3
        fracao f9 = new fracao(5, 4); // 5/4
        fracao resultado5 = f7.somar(f8).subtrair(f9);
        System.out.println("2 + 1/3 - 5/4 = " + resultado5); // Esperado: 13/12

        // Fórmula 6: "5/2 x (4/3 - 2/5)"
        fracao f10 = new fracao(5, 2); // 5/2
        fracao resultado6 = f10.multiplicar(f3.subtrair(f4));
        System.out.println("5/2 x (4/3 - 2/5) = " + resultado6); // Esperado: 110/42 ou simplificado: 55/21

        // Fórmula 7: "5 + 2/7"
        fracao f11 = new fracao(5, 1); // 5 (como fração 5/1)
        fracao resultado7 = f11.somar(f2);
        System.out.println("5 + 2/7 = " + resultado7); // Esperado: 37/7

        // Fórmula 8: "5/3 x 7/4"
        fracao f12 = new fracao(7, 4); // 7/4
        fracao f13 = new fracao(5, 3); // 5/3
        fracao resultado8 = f13.multiplicar(f12);
        System.out.println("5/3 x 7/4 = " + resultado8); // Esperado: 35/12
    }
}
