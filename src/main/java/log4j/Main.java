package log4j;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.logging.log4j.message.Message;
import desafioPaises.Paises;

public class Main {
    public static void main(String[] args) {
        Clock baseClock = Clock.systemUTC();
        Paises nuevoPais = new Paises();

        System.out.println("El codigo inicia a las "+baseClock.instant());
        // Paises argentina = new Argentina(1, "Argentina", 100);
        // Paises bolivia = new Bolivia(2, "Bolivia", 101);
        // Paises brasil = new Brasil(3, "Brasil", 102);
        // Paises chile = new Chile(4, "Chile", 103);
        // Paises colombia = new Colombia(5, "Colombia", 104);
        // Paises ecuador = new Ecuador(6, "Ecuador", 105);
        // Paises paraguay = new Paraguay(7, "Paraguay", 106);
        // Paises peru = new Peru(8, "Peru", 107);
        // Paises venezuela = new Venezuela(9, "Venezuela", 108);
        // Paises uruguay = new Uruguay(10, "Uruguay", 109);
        
        ArrayList<Paises> paises = new ArrayList<Paises>();
        
        // paises.add(argentina);
        // paises.add(bolivia);
        // paises.add(brasil);
        // paises.add(chile);
        // paises.add(colombia);
        // paises.add(ecuador);
        // paises.add(paraguay);
        // paises.add(peru);
        // paises.add(venezuela);
        // paises.add(uruguay);
        Mensaje mensaje1 = new Mensaje();
        Mensaje mensaje2 = new Mensaje();
	    
	    
        
	    
        String lista[] = {"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Venezuela", "Uruguay"};
        boolean posible = true;
        
        Integer i = 0;
        for (String string : lista) {
            paises.add(new Pais(i, lista[i], 100+i));
            i++;
        }
        System.out.println(paises);
        System.out.println(paises.get(8));
        System.out.println(paises.size());
        
        
        List<Integer> codigoDePaises = paises.stream().map(pais -> pais.getCodigo()).collect(Collectors.toList());
        System.out.println("- "+ codigoDePaises);
        
        Paises paisCodigo = paises.stream().filter(pais -> pais.getCodigo() == 105).findFirst().orElse(null);
        List<Paises> paisesCodigo = paises.stream().filter(pais -> pais.getCodigo() > 105).collect(Collectors.toList());
        
        try {
        	mensaje1.logMessagesInformativo("Intentando generar los codigos");
        	Integer index = 0;
            for (String string : lista) {
                paises.add(new Pais(index, lista[index], 100+index));
                index++;
            }   
        }
        catch(ArithmeticException e) {
            mensaje2.logMessagesError("no se pudo generar los codigos");
        }
        
        System.out.println(paisCodigo);
        System.out.println(paisesCodigo);
        System.out.println("El codigo finaliza a las "+baseClock.instant());
    }
}
