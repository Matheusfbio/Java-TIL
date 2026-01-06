package exercicios;

class SalarioBruto{
    public static void main(String[] args) {
        int horasTrabalhadas = 160;
        double valorHora = 50.0;
        int metasBatidas = 3;
        int faltas = 1;

        calcularSalario( horasTrabalhadas, valorHora, metasBatidas, faltas);
    }

    public static double calcularSalario(
        int horasTrabalhadas, 
        double valorHora,
        int metasBatidas, 
        int faltas
    ) {
        double salarioBruto = horasTrabalhadas * valorHora;
        if ((metasBatidas >= 3 && salarioBruto < 2000 && faltas == 2) || metasBatidas >= 3) {

            if (metasBatidas >= 3) {
                salarioBruto += salarioBruto * 0.10;
            }
            System.out.println("Aprovado para bônus de produtividade!");
        } else {
            System.out.println("Não aprovado para bônus de produtividade.");
        }
        System.out.println(salarioBruto);
        return salarioBruto;
    }
}


// Respostada IA
// package exercicios;

// class SalarioBruto {

//     public static void main(String[] args) {

//         // Quantidade total de horas trabalhadas no mês
//         int horasTrabalhadas = 160;

//         // Valor recebido por cada hora de trabalho
//         double valorHora = 50.0;

//         // Quantidade de metas batidas no período
//         int metasBatidas = 3;

//         // Número de faltas do funcionário
//         int faltas = 1;

//         // Chamada do método responsável por calcular o salário final
//         // Aqui o main só orquestra, quem pensa é o método
//         calcularSalario(horasTrabalhadas, valorHora, metasBatidas, faltas);
//     }

//     /**
//      * Calcula o salário do funcionário e verifica se ele tem direito a bônus.
//      *
//      * Regras de negócio:
//      * - Salário base = horasTrabalhadas * valorHora
//      * - Se bater 3 ou mais metas, ganha 10% de bônus
//      * - O funcionário é aprovado se:
//      *      (salário > 7000 E faltas <= 2) OU metasBatidas >= 4
//      */
//     public static double calcularSalario(
//             int horasTrabalhadas,
//             double valorHora,
//             int metasBatidas,
//             int faltas
//     ) {

//         // Cálculo do salário bruto usando operador aritmético (*)
//         double salarioBruto = horasTrabalhadas * valorHora;

//         // Verificação das regras para aprovação do bônus
//         // Uso de operadores:
//         // - Relacionais: >, <=, >=
//         // - Lógicos: AND (&&) e OR (||)
//         if ((salarioBruto > 7000 && faltas <= 2) || metasBatidas >= 4) {

//             // Caso tenha batido 3 ou mais metas, aplica bônus de 10%
//             // Uso de operador de atribuição (+=)
//             if (metasBatidas >= 3) {
//                 salarioBruto += salarioBruto * 0.10;
//             }

//             System.out.println("Aprovado para bônus de produtividade!");
//         } else {
//             // Caso não atenda às regras de negócio
//             System.out.println("Não aprovado para bônus de produtividade.");
//         }

//         // Exibe o salário final após todas as regras aplicadas
//         System.out.println("Salário final: " + salarioBruto);

//         // Retorna o salário final calculado
//         return salarioBruto;
//     }
// }
