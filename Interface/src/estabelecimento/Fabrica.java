package estabelecimento;

import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifuncional();

        impressora.imprimir();
    }
}
