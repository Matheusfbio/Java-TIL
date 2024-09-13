package interfaces.equipamentos;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class loja {
    public static void main(String[] args) {
        EquipamentoMultiFuncional fullprint = new EquipamentoMultiFuncional();
        Impressora impressora = fullprint;
        Digitalizadora digitalizadora = fullprint;
        Copiadora copiadora = fullprint;
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
