/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetdesession;

/**
 *
 * @author fabriceabbey
 */
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;


/**
 *
 * @author fabriceabbey
 */
public class essai {
    
      public static void main(String[] args) throws Exception {
        //Liste des variables
        int minutesTeleTravail = 0;
        int minutesBureau = 0;
        int codeProjet = 0;
        int minutes = 0;
        int numeroEmploye = 0;
        int numeroSemaine = 0;
        int annee = 0;
        String jour;
        JSONArray tempsDeTravail;
        JSONObject tempsTravailProjet;
        JSONObject root;
        
        // Listes des constantes
        final int minutesMinBureauAdmin = 2100;
        final int minutesMinBureauNorm = 2400;
        
        String jsonTxt = FileReader.loadFileIntoString("fichier/test.json");

        root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        
        numeroEmploye = Integer.parseInt(root.getString("numero_employe"));     
        numeroSemaine = Integer.parseInt( root.getString("numero_semaine"));                 
        annee = Integer.parseInt(root.getString("annee"));     
        jour = root.getString("lundi");
           
             tempsDeTravail = (JSONArray) JSONSerializer.toJSON(jour);
             
             for(int j = 0; j < tempsDeTravail.size(); j++) {
                 tempsTravailProjet = tempsDeTravail.getJSONObject(j);
                 codeProjet = Integer.parseInt(tempsTravailProjet.getString("code_de_projet"));
                 minutes = Integer.parseInt(tempsTravailProjet.getString("minutes"));
                 
                  if (codeProjet > 900){                    
                      minutesTeleTravail = minutesTeleTravail + minutes;
                  }else{
                      minutesBureau = minutesBureau + minutes;
                  }
             }
            
             jour = root.getString("mardi");
            
             tempsDeTravail = (JSONArray) JSONSerializer.toJSON(jour);
             
             
             for(int j = 0; j < tempsDeTravail.size(); j++) {
                  tempsTravailProjet = tempsDeTravail.getJSONObject(j);
                  codeProjet = Integer.parseInt(tempsTravailProjet.getString("code_de_projet"));
                  minutes = Integer.parseInt(tempsTravailProjet.getString("minutes"));
                 
                  if (codeProjet > 900){                    
                      minutesTeleTravail = minutesTeleTravail + minutes;
                  }else{
                      minutesBureau = minutesBureau + minutes;
                  }
             }
            
             
             jour = root.getString("mercredi");
            
             tempsDeTravail = (JSONArray) JSONSerializer.toJSON(jour);
             
             
             for(int j = 0; j < tempsDeTravail.size(); j++) {
                  tempsTravailProjet = tempsDeTravail.getJSONObject(j);
                  codeProjet = Integer.parseInt(tempsTravailProjet.getString("code_de_projet"));
                  minutes = Integer.parseInt(tempsTravailProjet.getString("minutes"));
                 
                  if (codeProjet > 900){                    
                      minutesTeleTravail = minutesTeleTravail + minutes;
                  }else{
                      minutesBureau = minutesBureau + minutes;
                  }
             }
             
             
             jour = root.getString("jeudi");
             
             tempsDeTravail = (JSONArray) JSONSerializer.toJSON(jour);
             
             
             for(int j = 0; j < tempsDeTravail.size(); j++) {
                  tempsTravailProjet = tempsDeTravail.getJSONObject(j);
                  codeProjet = Integer.parseInt(tempsTravailProjet.getString("code_de_projet"));
                  minutes = Integer.parseInt(tempsTravailProjet.getString("minutes"));
                 
                  if (codeProjet > 900){                    
                      minutesTeleTravail = minutesTeleTravail + minutes;
                  }else{
                      minutesBureau = minutesBureau + minutes;
                  }
             }
             
             
             jour = root.getString("vendredi");
             
             tempsDeTravail = (JSONArray) JSONSerializer.toJSON(jour);
             
             
             for(int j = 0; j < tempsDeTravail.size(); j++) {
                  tempsTravailProjet = tempsDeTravail.getJSONObject(j);
                  codeProjet = Integer.parseInt(tempsTravailProjet.getString("code_de_projet"));
                  minutes = Integer.parseInt(tempsTravailProjet.getString("minutes"));
                 
                  if (codeProjet > 900){                    
                      minutesTeleTravail = minutesTeleTravail + minutes;
                  }else{
                      minutesBureau = minutesBureau + minutes;
                  }
             }
            
             
             jour = root.getString("samedi");
           
             tempsDeTravail = (JSONArray) JSONSerializer.toJSON(jour);
             
             
             for(int j = 0; j < tempsDeTravail.size(); j++) {
                  tempsTravailProjet = tempsDeTravail.getJSONObject(j);
                  codeProjet = Integer.parseInt(tempsTravailProjet.getString("code_de_projet"));
                  minutes = Integer.parseInt(tempsTravailProjet.getString("minutes"));
                 
                  if (codeProjet > 900){                    
                      minutesTeleTravail = minutesTeleTravail + minutes;
                  }else{
                      minutesBureau = minutesBureau + minutes;
                  }
             }
             
             
             jour = root.getString("dimanche");
             tempsDeTravail = (JSONArray) JSONSerializer.toJSON(jour);

             
             for(int j = 0; j < tempsDeTravail.size(); j++) {
                  tempsTravailProjet = tempsDeTravail.getJSONObject(j);
                  codeProjet = Integer.parseInt(tempsTravailProjet.getString("code_de_projet"));
                  minutes = Integer.parseInt(tempsTravailProjet.getString("minutes"));
                 
                  if (codeProjet > 900){                    
                      minutesTeleTravail = minutesTeleTravail + minutes;
                  }else{
                      minutesBureau = minutesBureau + minutes;
                  }
             }
             //System.out.println(minutesTeleTravail);
             //System.out.println(minutesBureau);
             
             if(numeroEmploye < 1000 && minutesBureau < (40 * 60)){
                 
             }
        }      
         
    
}

