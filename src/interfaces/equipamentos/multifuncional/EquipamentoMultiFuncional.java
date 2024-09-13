package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via multifuncional");

    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via multifuncional");

    }
}
