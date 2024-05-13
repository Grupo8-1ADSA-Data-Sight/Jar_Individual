package maquinas;

import com.github.britooo.looca.api.group.sistema.Sistema;

public class SistemaLeitura {

    Sistema sistema = new Sistema();

    private String sistemaOperacional;
    private String fabricante;
    private Integer arquitetura;
//    private String inicializacao;
    private Boolean permissao;
    private Integer fkMaquina;

    public SistemaLeitura() {
        this.sistemaOperacional = sistema.getSistemaOperacional();
        this.fabricante = sistema.getFabricante();
        this.arquitetura = sistema.getArquitetura();
        this.permissao = sistema.getPermissao();
        this.fkMaquina = 1;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setfabricante(String fabricante) {
        fabricante = fabricante;
    }

    public Integer getArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(Integer arquitetura) {
        this.arquitetura = arquitetura;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public Boolean getPermissao() {
        return permissao;
    }

    public void setPermissao(Boolean permissao) {
        this.permissao = permissao;
    }

    public Integer getFkMaquina() {
        return fkMaquina;
    }

    public void setFkMaquina(Integer fkMaquina) {
        this.fkMaquina = fkMaquina;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        return String.format("""
                                                                Sistema
               ----------------------------------------------------------------------------------------------------                                 
               Sistema Operacional = %s
               Fabricante = %s
               Arquitetura = x%s
               Permissões = %s
               fkMaquina = %d                   
               ----------------------------------------------------------------------------------------------------
                """, sistemaOperacional, fabricante, arquitetura, sb.append(("Executando como ")).append((this.getPermissao() ? "root" : "usuário padrão")), fkMaquina);
    }
}
