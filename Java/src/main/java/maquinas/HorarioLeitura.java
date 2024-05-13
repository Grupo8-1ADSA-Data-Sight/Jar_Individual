package maquinas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HorarioLeitura {

    LocalTime horarioLeitura = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    public String leitura(){
        return horarioLeitura.format(formatter);
    }
}
