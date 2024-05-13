package maquinas;

import com.github.britooo.looca.api.group.processador.Processador;

import javax.swing.*;

public class CPU extends Processador{
    Processador processador = new Processador();
    private String idCPUMaquina;
    private String fabricante;
    private String nome;
    private String identificador;
    private Long frequenciaGhz;
    private Integer nucleosFisicos;
    private Integer nucleosLogicos;
    private Integer fkMaquina;

    public CPU() {
        this.idCPUMaquina = processador.getId();
        this.fabricante = processador.getFabricante();
        this.nome = processador.getNome();
        this.identificador = processador.getIdentificador();
        this.frequenciaGhz = processador.getFrequencia();
        this.nucleosFisicos = processador.getNumeroCpusFisicas();
        this.nucleosLogicos = processador.getNumeroCpusLogicas();
        this.fkMaquina = 1;
    }

    public String getIdCPUMaquina() {
        return idCPUMaquina;
    }

    public void setIdCPUMaquina(String idCPUMaquina) {
        this.idCPUMaquina = idCPUMaquina;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Long getFrequenciaGhz() {
        return frequenciaGhz;
    }

    public void setFrequencia(Long frequenciaGhz) {
        this.frequenciaGhz = frequenciaGhz;
    }

    public Integer getNucleosFisicos() {
        return nucleosFisicos;
    }

    public void setNucleosFisicos(Integer nucleosFisicos) {
        this.nucleosFisicos = nucleosFisicos;
    }

    public Integer getNucleosLogicos() {
        return nucleosLogicos;
    }

    public void setNucleosLogicos(Integer nucleosLogicos) {
        this.nucleosLogicos = nucleosLogicos;
    }

    public Integer getFkMaquina() {
        return fkMaquina;
    }

    public void setFkMaquina(Integer fkMaquina) {
        this.fkMaquina = fkMaquina;
    }

    @Override
    public String toString() {
        return String.format("""
                                                CPU
                --------------------------------------------------------------------                                 
                idCpuMaquina = %s
                fabricante = %s
                nome = %s
                identificador = %s
                frequenciaGhz = %d
                nucleosFisicos = %d
                nucleosLogicos = %d
                fkMaquina = %d                        
                --------------------------------------------------------------------
                """, idCPUMaquina, fabricante, nome, identificador, frequenciaGhz, nucleosFisicos, nucleosLogicos, fkMaquina);
    }
}
