Desafio 1: Soma de Números Pares
Escreva um programa que calcule a soma de todos os números pares de 1 a 100 usando um loop for. Se o número for ímpar, utilize a palavra-chave continue para pular para a próxima iteração.

resposta

````
public static void main(String[] args) {

int numbersPar = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                continue;
            }
            numbersPar += i;
        }

        System.out.println(numbersPar);
    }

````
Desafio 2: Cálculo de Média e Aprovação
Escreva um programa que receba as notas de três provas de um aluno e calcule sua média. O programa deve então determinar se o aluno foi aprovado, reprovado ou se está de recuperação com base nas seguintes condições:

Média maior ou igual a 7: Aprovado
Média entre 5 e 6.9: Recuperação
Média menor que 5: Reprovado
Exemplo de saída:

java
Copiar código
Digite a nota da primeira prova: 6
Digite a nota da segunda prova: 7
Digite a nota da terceira prova: 8
Média: 7.0
Resultado: Aprovado
Agora, você tem dois desafios que envolvem estruturas condicionais para verificar as condições de aprovação e calcular impostos.

Desafio 3: Cálculo de Imposto de Renda
Escreva um programa que calcule o imposto de renda baseado no salário informado pelo usuário, de acordo com as faixas de imposto definidas abaixo:

Salário até R$1.903,98: isento
De R$1.903,99 até R$2.826,65: 7.5% de imposto
De R$2.826,66 até R$3.751,05: 15% de imposto
De R$3.751,06 até R$4.664,68: 22.5% de imposto
Acima de R$4.664,68: 27.5% de imposto
O programa deve exibir o valor do imposto a ser pago.

Exemplo de saída:

java
Copiar código
Digite o salário: 3200.00
Imposto a pagar: R$ 480.00