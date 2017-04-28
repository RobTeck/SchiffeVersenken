import java.util.Arrays;
import java.util.*;

    
    public class Schiffeversenken
{
    
    int [] [] meer = new int [10][10];
   
    public Schiffeversenken()
    {
     
    }

    public void spielStarten(){
        
        for (int i = 0; i<10; i++){
            
            for (int j = 0; j<10; j++){
                
                meer[i][j]= 1;
                
            }
            
        }
        
    }
  
    public void meerAnzeigen(){
       
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
       System.out.println("     A B C D E F G H I J \n");
       
        for (int i = 0; i<10; i++){
            
            if(i==9){
                
                System.out.print(i+1 + "   ");
                
                for (int j = 0; j<10; j++){
                    
                    System.out.print(meer[i][j]+ " ");
                    
                }
                
                System.out.print("\n");
                
            }
            
            else{
                
                System.out.print(i+1 +"    ");
                
                for (int j = 0; j<10; j++){
                 
                    System.out.print(meer[i][j]+ " ");
                    
                }
                
                System.out.print("\n");
            
            }
        }
        
        System.out.println("\n\n\n\n\n\n\n");
        
    }
        
    public void schiffPlatzieren(int k1 , int k2){
        
        meer [k1-1] [k2-1] = 2 ;
        meerAnzeigen();
    
    }
    
        public void schiffDa(int k1 , int k2){
            
            if (meer [k1-1] [k2-1] == 1 ){
        
                
                
            }
            
            if (meer [k1-1] [k2-1] == 2 ){
        
                 
                 
            }
            
             if (meer [k1-1] [k2-1] == 3 ){
        
                 
                 
            }
            
             if (meer [k1-1] [k2-1] == 4 ){
        
                 
                 
            }
                  
    }
        
}
      
