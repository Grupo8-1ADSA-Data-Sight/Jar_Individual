package maquinas;

import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.util.Conversor;

public class RAM extends Memoria{
    Memoria memoria = new Memoria();

    private Long totalRam;
    private Integer fkMaquina;


    public RAM() {
        totalRam = memoria.getTotal();
        this.fkMaquina = 1;
    }

    public Long getTotalRam() {
        return totalRam;
    }

    public void setTotalRam(Long total) {
        totalRam = total;
    }

    public Integer getFkMaquina(){
        return fkMaquina;
    }

    public void setFkMaquina(Integer fkMaquina){
        this.fkMaquina = fkMaquina;
    }

    @Override
    public String toString() {
        return "\ntotalRam: " + Conversor.formatarBytes(getTotalRam());

    }
}
