package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Multifuncional");
    }
}
