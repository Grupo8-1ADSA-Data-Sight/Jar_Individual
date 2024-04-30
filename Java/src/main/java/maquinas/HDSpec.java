package maquinas;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;

import java.util.ArrayList;
import java.util.List;

public class HDSpec {
    Looca looca = new Looca();
    DiscoGrupo discoGrupo = new DiscoGrupo();
    Volume volume = discoGrupo.getVolumes().get(0);

    private String nome;
    private Long total;
    private Long disponivel;
    private  String tipo;

    public HDSpec() {
        this.nome = volume.getNome();
        this.total = volume.getTotal();
        this.disponivel = volume.getDisponivel();
        this.tipo = volume.getTipo();
    }

//    public String retornarDisco(){
//        List<Volume> volumes = discoGrupo.getVolumes();
//        String test = "";
//        for (Volume volume1 : volumes) {
//            test += volume1;
//        }
//        return test;
//    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Long disponivel) {
        this.disponivel = disponivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "\nnome='" + nome + '\'' +
                "\ntotal=" + total +
                "\ndisponivel=" + disponivel +
                "\ntipo='" + tipo + '\'';
    }
}
