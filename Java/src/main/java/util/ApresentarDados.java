//package util;
//
//import bancoDeDados.Conexao;
//import maquinas.*;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//public class ApresentarDados {
//    Usuario usuario = new Usuario();
//    Conexao conexao = new Conexao();
//    JdbcTemplate con = conexao.getConexaoDoBanco();
//    CPU cpu = new CPU();
//    CPULeitura cpuSpec = new CPULeitura();
//    HDLeitura hdSpec = new HDLeitura();
//    RAM ram = new RAM();
//
//    public void pegarDadosTabela() {
////        List<CPU> cpulist = con.query("SELECT * FROM Cpu", new BeanPropertyRowMapper<>(CPU.class));
////        List<CPUSpec> cpuSpecList = con.query("SELECT * FROM CpuSpec", new BeanPropertyRowMapper<>(CPUSpec.class));
////        List<HDSpec> hdSpecList = con.query("SELECT * FROM HDSpec", new BeanPropertyRowMapper<>(HDSpec.class));
////        List<RAM> ramList = con.query("SELECT * FROM RAM", new BeanPropertyRowMapper<>(RAM.class));
//
////        System.out.println(cpulist);
////        System.out.println();
////        System.out.println(cpuSpecList);
////        System.out.println();
////        System.out.println(hdSpecList);
////        System.out.println();
////        System.out.println(ramList);
//
//    }
//}
