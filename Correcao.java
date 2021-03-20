public class Correcao {

 
    double CalcFormulaN6162(double T70){


        return 18*0.0248 * T70;
    }  


    
    double CalcFormulaN63(double T70){


        return 5*0.0248 * T70;
    }  

  
  

    double CalcFormulaM (double D52, double T70){

       if(D52==1 || D52 == 6){
           return CalcFormulaN6162(T70);

       } else

         if(D52==2){
                 
             
        return   CalcFormulaN63(T70);

         }else 

         return 0;
       


    }
     
   


}