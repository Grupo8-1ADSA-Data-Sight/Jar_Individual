package maquinas;

import com.github.britooo.looca.api.group.memoria.Memoria;

public class RAMLeitura extends Memoria{
    HorarioLeitura hl = new HorarioLeitura();
    Memoria memoria = new Memoria();


    private Long emUso;
    private Long disponivel;
    private String dataHoraLeitura;
    private Integer fkRAM;

    public RAMLeitura() {
        this.emUso = memoria.getEmUso();
        this.disponivel = memoria.getDisponivel();
        this.dataHoraLeitura = hl.leitura();
        this.fkRAM = 1;
    }

    public Long getEmUso() {
        return emUso;
    }

    public void setEmUso(Long emUso) {
        this.emUso = emUso;
    }

    public Long getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Long disponivel) {
        this.disponivel = disponivel;
    }

    public String getDataHoraLeitura() {
        return dataHoraLeitura;
    }

    public void setDataHoraLeitura(String dataHoraLeitura) {
        this.dataHoraLeitura = dataHoraLeitura;
    }

    public Integer getFkRAM() {
        return fkRAM;
    }

    public void setFkRAM(Integer fkRAM) {
        this.fkRAM = fkRAM;
    }

    @Override
    public String toString() {
        return String.format("""
                                                           Leitura da RAM
               ----------------------------------------------------------------------------------------------------
                        Uso      |       Disponivel      |       Horário da leitura      |       fkRAM
                      %.2f Gb              %.2f Gb                    %s                     %d
               ----------------------------------------------------------------------------------------------------
                """, (emUso / 1000000000.0), (disponivel / 1000000000.0), dataHoraLeitura, fkRAM);
    }
}
