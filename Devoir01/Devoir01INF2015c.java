package json01;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;

public class Devoir01INF2015c {
    
     public static void main(String[] args) {
         
         int nsemaine = 0; int codemp = 0; int codpro = 0;
         int temp01 = 0; int tempTele01 = 0; int temp02 = 0;
         int tempTele02 = 0; int tempjour = 0; int tempTelejour = 0;
         int tempsemaine = 0; int tempTelesemaine = 0;
              
     try {
 
	JsonFactory jfactory = new JsonFactory();
 
	/*** read from file ***/
	JsonParser jParser = jfactory.createJsonParser(new File("c:\\ls\\employe02.json"));
 
	// loop until token equal to "}"
	      while (jParser.nextToken() != JsonToken.START_ARRAY) {
 
		String fieldnumero_employe = jParser.getCurrentName();
		if ("numero_employe".equals(fieldnumero_employe)) {
                  System.out.println("************** Devoir01-INF2015 ***************");  
		  jParser.nextToken();
                  codemp = jParser.getIntValue();
		  System.out.println(" Numero d'employe : " + codemp ); // display mkyong
 
		}
 
		if ("numero_semaine".equals(fieldnumero_employe)) {
                    
		  jParser.nextToken();
                  nsemaine = jParser.getIntValue();
		  System.out.println(" Numero de semaine : " + nsemaine ); // display 29
 
		}
 
                if ("annee".equals(fieldnumero_employe)) {
 
		  jParser.nextToken();
		  System.out.println(" Annee : " + jParser.getIntValue()); // display 29
		}
                 
              }       
		System.out.println("************** lundi ***************");
	        
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
 
                    String fieldcode_de_projet = jParser.getCurrentName();
                    if ("code_de_projet".equals(fieldcode_de_projet)) {
 
                    jParser.nextToken();
                    codpro = jParser.getIntValue();
                        System.out.println(" Code de project : " + codpro);
 
                    }
                    
                    
                    if ( ( codemp < 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele01 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele01); 
                        
                         tempTelejour = tempTelejour + tempTele01;
                        }
                    } 
                    
                    if ( ( codemp < 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp01 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp01 ); 
   
                         tempjour =tempjour + temp01;
                        }
                    } 
                    
                     if ( ( codemp >= 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele02 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele02 ); 
 
                         tempTelejour = tempTelejour + tempTele02;  
                        }
                    } 
                     
                     
                     if ( ( codemp >= 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp02 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp02 ); 
                         
                         tempjour =tempjour + temp02;
                        }
                      } 
                                      
                    }
                
                System.out.println("temps de travail par jour :" + tempjour + " minutes ");
                System.out.println("temps de teletravail par jour :" + tempTelejour + " minutes " );
                
                if ( ( codemp >= 1000 ) && ( tempjour < 360 ) )
                    System.out.println("Employe normal qui a travaillé moins de 6h par jour");
                
                if ( ( codemp < 1000 ) && ( tempjour < 300 ) )
                    System.out.println("Employe de l'administration qui a travaillé moins de 5h par jour");
                
                tempsemaine = tempsemaine + tempjour;
                tempTelesemaine = tempTelesemaine + tempTelejour;
                
                codpro = 0;temp01 = 0;tempTele01 = 0;temp02 = 0;tempTele02 = 0;tempjour = 0;tempTelejour = 0;
                
                System.out.println("************** lundi ***************");    
               
                System.out.println("************** mardi ****************");
	        
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
 
                    String fieldcode_de_projet = jParser.getCurrentName();
                    if ("code_de_projet".equals(fieldcode_de_projet)) {
 
                    jParser.nextToken();
                    codpro = jParser.getIntValue();
                        System.out.println(" Code de project : " + codpro);
 
                    }
                    
                    
                    if ( ( codemp < 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele01 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele01); 
                        
                         tempTelejour = tempTelejour + tempTele01;
                        }
                    } 
                    
                    if ( ( codemp < 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp01 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp01 ); 
   
                         tempjour =tempjour + temp01;
                        }
                    } 
                    
                     if ( ( codemp >= 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele02 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele02 ); 
 
                         tempTelejour = tempTelejour + tempTele02;  
                        }
                    } 
                     
                     
                     if ( ( codemp >= 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp02 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp02 ); 
                         
                         tempjour =tempjour + temp02;
                        }
                      } 
                                      
                    }
                
                System.out.println("temps de travail par jour :" + tempjour + " minutes ");
                System.out.println("temps de teletravail par jour :" + tempTelejour + " minutes " );
                
                if ( ( codemp >= 1000 ) && ( tempjour < 360 ) )
                    System.out.println("Employe normal qui a travaillé moins de 6h par jour");
                
                if ( ( codemp < 1000 ) && ( tempjour < 300 ) )
                    System.out.println("Employe de l'administration qui a travaillé moins de 5h par jour");
                
                tempsemaine = tempsemaine + tempjour;
                tempTelesemaine = tempTelesemaine + tempTelejour;
                
                codpro = 0;temp01 = 0;tempTele01 = 0;temp02 = 0;tempTele02 = 0;tempjour = 0;tempTelejour = 0;
                
                System.out.println("************** mardi ***************");
               
                
                System.out.println("************** mercredi ****************");
	        
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
 
                    String fieldcode_de_projet = jParser.getCurrentName();
                    if ("code_de_projet".equals(fieldcode_de_projet)) {
 
                    jParser.nextToken();
                    codpro = jParser.getIntValue();
                        System.out.println(" Code de project : " + codpro);
 
                    }
                    
                    
                    if ( ( codemp < 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele01 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele01); 
                        
                         tempTelejour = tempTelejour + tempTele01;
                        }
                    } 
                    
                    if ( ( codemp < 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp01 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp01 ); 
   
                         tempjour =tempjour + temp01;
                        }
                    } 
                    
                     if ( ( codemp >= 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele02 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele02 ); 
 
                         tempTelejour = tempTelejour + tempTele02;  
                        }
                    } 
                     
                     
                     if ( ( codemp >= 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp02 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp02 ); 
                         
                         tempjour =tempjour + temp02;
                        }
                      } 
                                      
                    }
                
                System.out.println("temps de travail par jour :" + tempjour + " minutes ");
                System.out.println("temps de teletravail par jour :" + tempTelejour + " minutes " );
                
                if ( ( codemp >= 1000 ) && ( tempjour < 360 ) )
                    System.out.println("Employe normal qui a travaillé moins de 6h par jour");
                
                if ( ( codemp < 1000 ) && ( tempjour < 300 ) )
                    System.out.println("Employe de l'administration qui a travaillé moins de 5h par jour");
                
                tempsemaine = tempsemaine + tempjour;
                tempTelesemaine = tempTelesemaine + tempTelejour;
                
                codpro = 0;temp01 = 0;tempTele01 = 0;temp02 = 0;tempTele02 = 0;tempjour = 0;tempTelejour = 0;
                
                System.out.println("************** mercredi ***************");
                
                System.out.println("************** jeudi ****************");
	        
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
 
                    String fieldcode_de_projet = jParser.getCurrentName();
                    if ("code_de_projet".equals(fieldcode_de_projet)) {
 
                    jParser.nextToken();
                    codpro = jParser.getIntValue();
                        System.out.println(" Code de project : " + codpro);
 
                    }
                    
                    
                    if ( ( codemp < 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele01 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele01); 
                        
                         tempTelejour = tempTelejour + tempTele01;
                        }
                    } 
                    
                    if ( ( codemp < 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp01 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp01 ); 
   
                         tempjour =tempjour + temp01;
                        }
                    } 
                    
                     if ( ( codemp >= 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele02 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele02 ); 
 
                         tempTelejour = tempTelejour + tempTele02;  
                        }
                    } 
                     
                     
                     if ( ( codemp >= 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp02 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp02 ); 
                         
                         tempjour =tempjour + temp02;
                        }
                      } 
                                      
                    }
                
                System.out.println("temps de travail par jour :" + tempjour + " minutes ");
                System.out.println("temps de teletravail par jour :" + tempTelejour + " minutes " );
                
                if ( ( codemp >= 1000 ) && ( tempjour < 360 ) )
                    System.out.println("Employe normal qui a travaillé moins de 6h par jour");
                
                if ( ( codemp < 1000 ) && ( tempjour < 300 ) )
                    System.out.println("Employe de l'administration qui a travaillé moins de 5h par jour");
                
                tempsemaine = tempsemaine + tempjour;
                tempTelesemaine = tempTelesemaine + tempTelejour;
                
                codpro = 0;temp01 = 0;tempTele01 = 0;temp02 = 0;tempTele02 = 0;tempjour = 0;tempTelejour = 0;
                
                System.out.println("************** jeudi ***************");
                           
                System.out.println("************** vendredi ****************");
	        
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
 
                    String fieldcode_de_projet = jParser.getCurrentName();
                    if ("code_de_projet".equals(fieldcode_de_projet)) {
 
                    jParser.nextToken();
                    codpro = jParser.getIntValue();
                        System.out.println(" Code de project : " + codpro);
 
                    }
                    
                    
                    if ( ( codemp < 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele01 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele01); 
                        
                         tempTelejour = tempTelejour + tempTele01;
                        }
                    } 
                    
                    if ( ( codemp < 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp01 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp01 ); 
   
                         tempjour =tempjour + temp01;
                        }
                    } 
                    
                     if ( ( codemp >= 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele02 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele02 ); 
 
                         tempTelejour = tempTelejour + tempTele02;  
                        }
                    } 
                     
                     
                     if ( ( codemp >= 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp02 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp02 ); 
                         
                         tempjour =tempjour + temp02;
                        }
                      } 
                                      
                    }
                
                System.out.println("temps de travail par jour :" + tempjour + " minutes ");
                System.out.println("temps de teletravail par jour :" + tempTelejour + " minutes " );
                
                if ( ( codemp >= 1000 ) && ( tempjour < 360 ) )
                    System.out.println("Employe normal qui a travaillé moins de 6h par jour");
                
                if ( ( codemp < 1000 ) && ( tempjour < 300 ) )
                    System.out.println("Employe de l'administration qui a travaillé moins de 5h par jour");
                
                tempsemaine = tempsemaine + tempjour;
                tempTelesemaine = tempTelesemaine + tempTelejour;
                
                codpro = 0;temp01 = 0;tempTele01 = 0;temp02 = 0;tempTele02 = 0;tempjour = 0;tempTelejour = 0;
                
                System.out.println("************** vendredi ***************");
               
                System.out.println("************** samedi ****************");
	        
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
 
                    String fieldcode_de_projet = jParser.getCurrentName();
                    if ("code_de_projet".equals(fieldcode_de_projet)) {
 
                    jParser.nextToken();
                    codpro = jParser.getIntValue();
                        System.out.println(" Code de project : " + codpro);
 
                    }
                    
                    
                    if ( ( codemp < 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele01 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele01); 
                        
                         tempTelejour = tempTelejour + tempTele01;
                        }
                    } 
                    
                    if ( ( codemp < 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp01 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp01 ); 
   
                         tempjour =tempjour + temp01;
                        }
                    } 
                    
                     if ( ( codemp >= 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele02 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele02 ); 
 
                         tempTelejour = tempTelejour + tempTele02;  
                        }
                    } 
                     
                     
                     if ( ( codemp >= 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp02 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp02 ); 
                         
                         tempjour =tempjour + temp02;
                        }
                      } 
                                      
                    }
                
                System.out.println("temps de travail par jour :" + tempjour + " minutes ");
                System.out.println("temps de teletravail par jour :" + tempTelejour + " minutes " );
                
                if ( ( codemp >= 1000 ) && ( tempjour > 0 ) )
                    System.out.println("Employe normal qui a travaillé un samedi");
                
                if ( ( codemp < 1000 ) && ( tempjour > 0 ) )
                    System.out.println("Employe de l'administration qui a travaillé un samedi");
                
                tempsemaine = tempsemaine + tempjour;
                tempTelesemaine = tempTelesemaine + tempTelejour;
                
                codpro = 0;temp01 = 0;tempTele01 = 0;temp02 = 0;tempTele02 = 0;tempjour = 0;tempTelejour = 0;
                
                System.out.println("************** samedi ***************");
               
               System.out.println("************** dimanche ****************");
	        
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
 
                    String fieldcode_de_projet = jParser.getCurrentName();
                    if ("code_de_projet".equals(fieldcode_de_projet)) {
 
                    jParser.nextToken();
                    codpro = jParser.getIntValue();
                        System.out.println(" Code de project : " + codpro);
 
                    }
                    
                    
                    if ( ( codemp < 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele01 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele01); 
                        
                         tempTelejour = tempTelejour + tempTele01;
                        }
                    } 
                    
                    if ( ( codemp < 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp01 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp01 ); 
   
                         tempjour =tempjour + temp01;
                        }
                    } 
                    
                     if ( ( codemp >= 1000 )&& ( codpro > 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         tempTele02 = jParser.getIntValue();
                         System.out.println(" minutes de tele :" + tempTele02 ); 
 
                         tempTelejour = tempTelejour + tempTele02;  
                        }
                    } 
                     
                     
                     if ( ( codemp >= 1000 )&& ( codpro <= 900 ) ){
                    
                        if ("minutes".equals(fieldcode_de_projet)) {
 
                         jParser.nextToken();
                         temp02 = jParser.getIntValue();
                         System.out.println(" minutes :" + temp02 ); 
                         
                         tempjour =tempjour + temp02;
                        }
                      } 
                                      
                    }
                
                System.out.println("temps de travail par jour :" + tempjour + " minutes ");
                System.out.println("temps de teletravail par jour :" + tempTelejour + " minutes " );
                
                if ( ( codemp >= 1000 ) && ( tempjour > 0 ) )
                    System.out.println("Employe normal qui a travaillé un dimanche");
                
                if ( ( codemp < 1000 ) && ( tempjour > 0 ) )
                    System.out.println("Employe de l'administration qui a travaillé un dimanche");
                
                tempsemaine = tempsemaine + tempjour;
                tempTelesemaine = tempTelesemaine + tempTelejour;
                
                codpro = 0;temp01 = 0;tempTele01 = 0;temp02 = 0;tempTele02 = 0;tempjour = 0;tempTelejour = 0;
                
                System.out.println("************** dimanche ***************");
                
                System.out.println("************** semaine "+nsemaine+ "***************");
                
                if ( ( codemp >= 1000 ) && ( tempsemaine < 2400 ) )
                    System.out.println("Employe normal qui a travaillé moins de 40h par semaine");
                
                if ( ( codemp >= 1000 ) && ( tempsemaine > 2700 ) )
                    System.out.println("Employe normal qui a travaillé plus de 45h par semaine");
                
                if ( ( codemp < 1000 ) && ( tempsemaine < 2100 ) )
                    System.out.println("Employe de l'administration qui a travaillé moins de 35h par semaine");
                
                if ( ( codemp < 1000 ) && ( tempsemaine > 2700 ) )
                    System.out.println("Employe de l'administration qui a travaillé plus de 45h par semaine");
                
                if ( ( codemp < 1000 ) && ( tempTelesemaine > 600 ) )
                    System.out.println("Employe de l'administration qui a travaillé plus de 10h de teletravail par semaine");
     
                System.out.println("************** semaine "+nsemaine+ "***************");              
                
	  jParser.close();
                         
     } catch (JsonGenerationException e) {
 
	  e.printStackTrace();
 
     } catch (JsonMappingException e) {
 
	  e.printStackTrace();
 
     } catch (IOException e) {
 
	  e.printStackTrace(); 
     }

  }
    
}
