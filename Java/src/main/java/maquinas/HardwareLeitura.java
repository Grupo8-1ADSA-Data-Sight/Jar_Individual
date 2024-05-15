package maquinas;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.util.Conversor;

public class HardwareLeitura extends Looca {
    @Override
    public String toString() {
        return String.format("""
                                                                CPU
               ----------------------------------------------------------------------------------------------------                                 
               idCpuMaquina = %s
               Fabricante = %s
               Nome = %s
               Identificador = %s
               FrequenciaGhz = %d
               Nucleos Fisicos = %d
               Nucleos Logicos = %d
               fkMaquina = 1                        
               ----------------------------------------------------------------------------------------------------
                """,
                super.getProcessador().getId(),
                super.getProcessador().getFabricante(),
                super.getProcessador().getNome(),
                super.getProcessador().getIdentificador(),
                super.getProcessador().getFrequencia(),
                super.getProcessador().getNumeroCpusFisicas(),
                super.getProcessador().getNumeroCpusLogicas()
        );
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder();
//        return String.format(
//                """
//                                                          Leitura da CPU
//               ----------------------------------------------------------------------------------------------------
//                     Uso       |       Tempo de atividade       |       Horário da leitura       |       fkCPU
//                     %.2f                %s                     %s                      %d
//               ----------------------------------------------------------------------------------------------------
//                """, super.getSistema().get,sb.append(Conversor.formatarSegundosDecorridos(sistema.getTempoDeAtividade())), dataHoraLeitura, fkCPU);
//    }
//

}
