package horateste1;

public class Hora {
    
    private int hora; // hora do dia 00 - 23
    private int minuto; // minuto de uma hora 00 - 59
    private int segundo; // segundo de uma hora 00 - 59
    
    // O método construtor está sobrecarregado
    // Construtor sem parâmetros
    /*
    public Hora () {
        
        hora = minuto = segundo = 0;
        
    }
    */
    // Construtor com um parâmetro
    public Hora (int hora) {
        
        this.hora = hora;
        
        minuto = segundo = 0;
        
    }
    
    // Construtor com dois parâmetros
    public Hora (int hora, int minuto) {
        
        this.hora = hora;
        
        this.minuto = minuto;
        
        segundo = 0;
        
    }
    
    // Construtor com três parâmetros
    public Hora (int hora, int minuto, int segundo) {
        
        this.hora = hora;
        
        this.minuto = minuto;
        
        this.segundo = segundo;
    }
    
    // Esse método é uma espécie de setter para atribuir
    // Os valores de uma hora no formato h:m:s
    public void setHora (int h, int m, int s) {
        
        hora = h >= 0 && h < 24 ? h : 0;
        
        minuto = m >= 0 && m < 60 ? m : 0;
        
        segundo = s >= 0 && s < 60 ? s : 0;
        
    }
    
    // Imprime a hora em um formato universal (sem AM ou PM)
    public String toUniversalString () {
        
        return String.format (
                "%02d:%02d:%02d", 
                hora, 
                minuto, 
                segundo
        );
        
    }
    
    // Imprime a hora no formato AM ou PM
    // @Override porque o método toString() já existe na classe pai
    //      e está sendo sobrescrito
    
    @Override
    public String toString () {
        
        return String.format (
                "%02d:%02d:%02d %s", 
                hora == 0 || hora == 12 ? 12 : hora % 12,
                minuto,
                segundo,
                hora < 12 ? "AM" : "PM"
        );
    }
    
}
