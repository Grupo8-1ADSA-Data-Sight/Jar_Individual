package maquinas;

import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.util.Conversor;

public class CPULeitura extends Processador {
    HorarioLeitura hl = new HorarioLeitura();
    Processador processador = new Processador();
    Sistema sistema = new Sistema();


    private Double uso;
    private Long tempoAtividade;
    private String dataHoraLeitura;
    private Integer fkCPU;

    public CPULeitura() {
        this.uso = processador.getUso();
        this.tempoAtividade = sistema.getTempoDeAtividade();
        this.dataHoraLeitura = hl.leitura();
        this.fkCPU = 1;
    }

    @Override
    public Double getUso() {
        return uso;
    }

    public void setUso(Double uso) {
        this.uso = uso;
    }

    public Long getTempoAtividade() {
        return tempoAtividade;
    }

    public void setTempoAtividade(Long tempoAtividade) {
        this.tempoAtividade = tempoAtividade;
    }

    public String getDataHoraLeitura() {
        return dataHoraLeitura;
    }

    public void setDataHoraLeitura(String dataHoraLeitura) {
        this.dataHoraLeitura = dataHoraLeitura;
    }

    public Integer getFkCPU() {
        return fkCPU;
    }

    public void setFkCPU(Integer fkCPU) {
        this.fkCPU = fkCPU;
    }
    final StringBuilder sb = new StringBuilder();
    @Override
    public String toString() {
        return String.format(
                """
                                                          Leitura da CPU
               ----------------------------------------------------------------------------------------------------
                     Uso       |       Tempo de atividade       |       Horário da leitura       |       fkCPU
                     %.2f               %s                     %s                      %d
               ----------------------------------------------------------------------------------------------------
                """, uso,sb.append(Conversor.formatarSegundosDecorridos(sistema.getTempoDeAtividade())), dataHoraLeitura, fkCPU);
    }
}
