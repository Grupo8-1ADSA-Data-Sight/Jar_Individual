package maquinas;

import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import oshi.SystemInfo;

public class RedeGrupoLeitura {
    HorarioLeitura hl = new HorarioLeitura();
    SystemInfo si = new SystemInfo();
    RedeInterfaceGroup redeDados = new RedeInterfaceGroup(si);

    private Long taxaUpload;
    private Long taxaDownload;
    private String dataHoraLeitura;
    private Integer fkrede;

    public RedeGrupoLeitura() {
        this.taxaUpload = redeDados.getInterfaces().get(0).getBytesEnviados();
        this.taxaDownload = redeDados.getInterfaces().get(0).getBytesRecebidos();
        this.dataHoraLeitura = hl.leitura();
        this.fkrede = 1;
    }

    public Long getTaxaUpload() {
        return taxaUpload;
    }

    public void setTaxaUpload(Long taxaUpload) {
        this.taxaUpload = taxaUpload;
    }

    public Long getTaxaDownload() {
        return taxaDownload;
    }

    public void setTaxaDownload(Long taxaDownload) {
        this.taxaDownload = taxaDownload;
    }

    public String getDataHoraLeitura() {
        return dataHoraLeitura;
    }

    public void setDataHoraLeitura(String dataHoraLeitura) {
        this.dataHoraLeitura = dataHoraLeitura;
    }

    public Integer getFkrede() {
        return fkrede;
    }

    public void setFkrede(Integer fkrede) {
        this.fkrede = fkrede;
    }

    @Override
    public String toString() {
        return "RedeGrupoLeitura{" +
                "\ntaxaUpload=" + taxaUpload +
                ", \ntaxaDownload=" + taxaDownload +
                ", \ndataHoraLeitura='" + dataHoraLeitura + '\'' +
                ", \nfkrede=" + fkrede +
                '}';
    }
}
