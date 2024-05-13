package bancoDeDados;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import maquinas.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class InserirDadosNaTabela {
    Conexao conexao = new Conexao();
    Looca looca = new Looca();
    JdbcTemplate con = conexao.getConexaoDoBanco();

    // Objetos das maquinas
    CPU cpu = new CPU();
    CPULeitura cpuLeitura = new CPULeitura();
    HD hd = new HD();
    HDLeitura hdLeitura = new HDLeitura();
    RAM ram = new RAM();
    RAMLeitura ramLeitura = new RAMLeitura();
    SistemaLeitura sistemaLeitura = new SistemaLeitura();

    DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();

    //Obtendo lista de discos a partir do getter
    List<Disco> discos = grupoDeDiscos.getDiscos();

    public void inserindoDadosNaTabela(){
        //Inserindo no banco de dados da CPU, puxando os dados pela API - looca
        con.update("INSERT INTO CPU (idCPUMaquina ,fabricante, nome, identificador, frequenciaGHz, nucleosFisicos, nucleosLogicos, fkMaquina) values (?, ?, ?, ?, ?, ?, ?, ?)", cpu.getIdCPUMaquina(), cpu.getFabricante(), cpu.getNome(), cpu.getIdentificador(), cpu.getFrequenciaGhz(), cpu.getNucleosFisicos(), cpu.getNucleosLogicos(), cpu.getFkMaquina());

        //Inserindo no banco de dados da CPULeitura, puxando os dados pela API - looca

        con.update("INSERT INTO CPULeitura (uso, tempoAtividade, dataHoraLeitura, fkCPU) values (?, ?, ?, ?)", cpuLeitura.getUso(), cpuLeitura.getTempoAtividade(), cpuLeitura.getDataHoraLeitura(), cpuLeitura.getFkCPU());

        //Inserindo no banco de dados da HD, puxando os dados pela API - looca
        con.update("INSERT INTO HD (nome, tamanho, fkMaquina) values (?, ? , ?)", hd.getNome(), hd.getTamanho(), hd.getFkMaquina());

        //Inserindo no banco de dados da HDLeitura, puxando os dados pela API - looca
        con.update("INSERT INTO HDLeitura (uso, disponivel, dataHoraLeitura, fkHD) values (?, ?, ?, ?)", hdLeitura.getUso(), hdLeitura.getDisponivel(), hdLeitura.getDataHoraLeitura(), hdLeitura.getFkHD());

        //Inserindo no banco de dados da RAM, puxando os dados pela API - looca
        con.update("INSERT INTO RAM (armazenamentoTotal, fkMaquina) values (?, ?)", ram.getTotalRam(), ram.getFkMaquina());

        //Inserindo no banco de dados da RAMLeitura, puxando os dados pela API - looca
        con.update("INSERT INTO RAMLeitura (emUso, disponivel, dataHoraLeitura, fkRam) values (?, ?, ?, ?)", ramLeitura.getEmUso(), ramLeitura.getDisponivel(), ramLeitura.getDataHoraLeitura(), ram.getFkMaquina());

        //Inserindo no banco de dados da SistemaLeitura, puxando os dados pela API - looca
        con.update("INSERT INTO SistemaLeitura (sistemaOperacional, fabricante, arquitetura, permissao, fkMaquina) values (?, ?, ?, ?, ?)", sistemaLeitura.getSistemaOperacional(), sistemaLeitura.getFabricante(), sistemaLeitura.getArquitetura(), sistemaLeitura.getPermissao(), sistemaLeitura.getFkMaquina());
    }
}
