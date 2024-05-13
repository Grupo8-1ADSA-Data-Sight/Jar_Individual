package maquinas;

import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;

import java.util.ArrayList;
import java.util.List;

public class HD{
    DiscoGrupo discoGrupo = new DiscoGrupo();
    List<Volume> volume = discoGrupo.getVolumes();

    private String nome;
    private Long tamanho;
    private Integer fkMaquina;

    public HD() {
        this.nome = volume.get(0).getNome();
        this.tamanho = volume.get(0).getTotal();
        this.fkMaquina = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTamanho() {
        return tamanho;
    }

    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getFkMaquina() {
        return fkMaquina;
    }

    public void setFkMaquina(Integer fkMaquina) {
        this.fkMaquina = fkMaquina;
    }

    @Override
    public String toString() {
        return String.format(
                """
                                                                HD
               ----------------------------------------------------------------------------------------------------
                                       Nome             |      Tamanho       |       fkMaquina
                                %s          %.2f Gb                  %d
               ----------------------------------------------------------------------------------------------------
                """, nome, (tamanho / 1000000000.0), fkMaquina);
    }
}
