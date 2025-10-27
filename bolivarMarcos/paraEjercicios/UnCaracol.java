public class UnCaracol {

    public static void main(String[] args) {
        
        final int PROFUNDIDAD_POZO=20;
        final String BORDE_SUPERIOR= "[__]              [__]";
        final String PARED_POZO="  []:. :. :. :. :.[] _ __ ";
        final String CARACOL="  []    _@)_/`    [] _ __ ";
        final String FONDO_POZO= "  [][][][][][][][][] ";
        int saliente;
        int subidaMañana=0;
        int bajadaNoche=0;
        boolean caracolAtrapado=true;
        int ProfundidadCaracol;
        int díaActual=0;


      
        saliente= (int) (Math.random()*(20-10+1)+10);
        System.out.println(saliente);
        ProfundidadCaracol= saliente;
        System.out.println(BORDE_SUPERIOR);
            for (int profundidad=0; profundidad<=PROFUNDIDAD_POZO; profundidad++ ){
                if (profundidad==ProfundidadCaracol){
                    System.out.println(CARACOL+profundidad);   
                }else {
                    System.out.println(PARED_POZO+profundidad);
                }
            }
            System.out.println(FONDO_POZO);
        while (caracolAtrapado){
            
            díaActual++;
            System.out.println("Día "+ díaActual);

            bajadaNoche= (int) (Math.random()*2);
                if (díaActual<10) {
                    subidaMañana= (int) (Math.random()*(4-1+1)+1);
                }else if (díaActual>=10){
                    subidaMañana= (int) (Math.random()*(3-1+1)+1);
                }else if (díaActual>=20){
                    subidaMañana= (int) (Math.random()*(2-1+1)+1);
                }
                if (díaActual==50){
                    caracolAtrapado=false;
                    System.out.println("El caracol ha muerto de inanición.");
                }
                

            ProfundidadCaracol= ProfundidadCaracol-subidaMañana;
            System.out.println(BORDE_SUPERIOR);
            for (int profundidad=0; profundidad<=PROFUNDIDAD_POZO; profundidad++ ){
                if (profundidad==ProfundidadCaracol){
                    System.out.println(CARACOL+profundidad);   
                }else {
                    System.out.println(PARED_POZO+profundidad);
                }
            }
            System.out.println(FONDO_POZO);

            if (ProfundidadCaracol>0) {

                System.out.println("Mañana: El caracol subió "+ subidaMañana + "metros");
                
            }else {
                System.out.println("El caracol logró salir del pozo!!");
                caracolAtrapado=false;
            }
            System.out.println("-----------------------");

            ProfundidadCaracol= ProfundidadCaracol+bajadaNoche;

            System.out.println(BORDE_SUPERIOR);
            for (int profundidad=0; profundidad<=PROFUNDIDAD_POZO; profundidad++ ){
                if (profundidad==ProfundidadCaracol){
                    System.out.println(CARACOL+profundidad);   
                }else {
                    System.out.println(PARED_POZO+profundidad);
                }
            }
            System.out.println(FONDO_POZO);
            if (ProfundidadCaracol>0) {

                System.out.println("Noche: El caracol bajó "+ bajadaNoche + " metros");
                
            }
            System.out.println("-----------------------");


    }  



    }
    
}
