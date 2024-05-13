package maquinas;

import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;

public class HDLeitura extends DiscoGrupo{
    HorarioLeitura hl = new HorarioLeitura();
    DiscoGrupo discoGrupo = new DiscoGrupo();
    Volume volume = discoGrupo.getVolumes().get(0);
    private Double uso;
    private Double disponivel;
    private String dataHoraLeitura;
    private Integer fkHD;

    public HDLeitura() {
//        Double porcentagemUso = (uso * 100.0 / (volume.getTotal() / 1000000000.0));
        this.uso = (volume.getTotal() - volume.getDisponivel())/ 1000000000.0;
        this.disponivel = volume.getDisponivel() / 1000000000.0;
        this.dataHoraLeitura = hl.leitura();
        this.fkHD = 1;
    }

    public Double getUso() {
        return uso;
    }

    public void setUso(Double uso) {
        this.uso = uso;
    }

    public Double getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Double disponivel) {
        this.disponivel = disponivel;
    }

    public String getDataHoraLeitura() {
        return dataHoraLeitura;
    }

    public void setDataHoraLeitura(String dataHoraLeitura) {
        this.dataHoraLeitura = dataHoraLeitura;
    }

    public Integer getFkHD() {
        return fkHD;
    }

    public void setFkHD(Integer fkHD) {
        this.fkHD = fkHD;
    }

    @Override
    public String toString() {
        return String.format("""
                                                          Leitura da HD
               ----------------------------------------------------------------------------------------------------
                        Uso      |       Disponivel      |       Horário da leitura      |       fkHd
                      %.2f Gb           %.2f Gb                     %s                   %d 
               ----------------------------------------------------------------------------------------------------
                """, uso, disponivel, dataHoraLeitura, fkHD);
    }
}
