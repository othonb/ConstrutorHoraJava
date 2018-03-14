package horateste1;

public class HoraTeste1 {
    
    public static void imprimeHora (Hora hora) {
        
        System.out.println (
                "A hora universal atual é: " + 
                        hora.toUniversalString()
        );
        
        System.out.println (
                "A hora atual padrão é: " + 
                        hora.toString()
        );
        
    }

    public static void main(String[] args) {
        
        Hora hora = new Hora (12, 35, 43);
        
        imprimeHora(hora);
        
        hora.setHora (12, 35, 43);
        
        imprimeHora(hora);
        
        hora.setHora (25, 65, 67);
        
        imprimeHora(hora);
        
        
    }
    
}
