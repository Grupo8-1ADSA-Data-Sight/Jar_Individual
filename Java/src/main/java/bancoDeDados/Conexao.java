//package bancoDeDados;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//public class Conexao {
//    private JdbcTemplate conexaoDoBanco;
//
//    public Conexao(){
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/dataSight");
//        dataSource.setUsername("root");
//        dataSource.setPassword("Dois228@");
//
//        conexaoDoBanco = new JdbcTemplate(dataSource);
//    }
//
//    public JdbcTemplate getConexaoDoBanco(){
//        return conexaoDoBanco;
//    }
//}
