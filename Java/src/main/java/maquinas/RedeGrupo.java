package maquinas;

import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import com.github.britooo.looca.api.group.rede.RedeParametros;
import oshi.SystemInfo;

public class RedeGrupo{

    SystemInfo si = new SystemInfo();
    RedeInterfaceGroup redeDados = new RedeInterfaceGroup(si);
    RedeParametros redeParametros = new RedeParametros(si);

    private String hostName;
    private String modelo;
    private String ipv4;
    private Integer fkMaquina;

    public RedeGrupo() {
        this.hostName = redeParametros.getHostName();
        this.modelo = modelo;
        this.fkMaquina = 1;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    public Integer getFkMaquina() {
        return fkMaquina;
    }

    public void setFkMaquina(Integer fkMaquina) {
        this.fkMaquina = fkMaquina;
    }

    @Override
    public String toString() {
        return "RedeGrupo{" +
                "\nhostName='" + hostName + '\'' +
                ", \nmodelo='" + modelo + '\'' +
                ", \nipv4='" + ipv4 + '\'' +
                ", \nfkMaquina='" + fkMaquina + '\'' +
                "} " ;
    }
}
