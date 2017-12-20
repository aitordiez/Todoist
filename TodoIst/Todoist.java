import java.util.ArrayList;


/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer.
 */
class Todoist 
{
    
    // Almacena nuestras tareas
    private ArrayList<String> tareas; 

    /**
     * Constructor de la clase Todoist. Crea un gestor con las 3 tareas vacías.
     */
    public Todoist()
    {
        tareas = new ArrayList<String>();
    }
    
    
    /**
     * Inserta una nueva tarea
     */
    public void addTarea(String nombreTarea)
    {
        tareas.add(nombreTarea);
    }
    
    
    /**
     * Muestra por pantalla todas las tareas existentes
     */
    
    public void mostrarTareas()
    {
        System.out.println("Tareas existentes:");
        System.out.println(tareas);
    }
    
    
    /**
     * Devuelve el numero de tareas pendientes
     */     
    public int getNumeroDeTareasPendientes()
    {
      return tareas.size(); 
    }
    
    
    /**
     * Imprime por pantalla el numero de tareas pendientes
     */
    public void mostrarNumeroTareasPendientes()
    {
        System.out.println(tareas.size());
    }
    
    
    /** 
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). Devuelve true si la tarea existe y se elimina,
     * false en caso contrario
     */
    public boolean eliminarTarea(int posicionTarea) 
    {
        boolean valorADevolver = false;
        if(esValidoElIndice(posicionTarea)){
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }
        return valorADevolver;
    }
    
    
    /**
     * Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */
    public boolean esValidoElIndice(int indice) 
    {
        return (indice >= 0 && indice < tareas.size());
    }
    
    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer, false
     * en otro caso
     */    
    public boolean hayTareasPendientes(){
        return (getNumeroDeTareasPendientes() > 0);
    }
    
    /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea.
     */
    public void mostrarTareasNumeradas()
    {
        int numeroPosicion = 1;
        for (String tarea : tareas){
            if (tarea.substring(0,1).equals("$")){
                System.out.println(numeroPosicion + ". [x]"+ tarea.substring(1, tarea.length()));                
            }
            else {
                System.out.println(numeroPosicion + ". [ ] " + tarea);                 
            }

            numeroPosicion = numeroPosicion + 1;
        }
            }

        
    
    /**
     * Muestra solo las tareas en posiciones impares sin numero delante ni nada,
     * solo la tarea
     */
    public void mostrarTareasEnPosicionImpar()
    { 
        int impar =1; 
        for (String tarea : tareas){
            if(impar %2 !=0) 
            System.out.println(tarea);
            
        }
        impar = impar +1;
    }
    
    /**
     * Muestra por pantalla todas las tareas que contienen el texto indicado
     * como parámetro, una en cada linea. Si no hay ninguna que contenga el texto
     * buscado, no muestra nada.Este método es insensible a mayúsculas o minúsculas
     */
   
     public void mostrarCoincidentes(String textoABuscar)
    {
        boolean hayCoincidencia = false;
        for (String tarea : tareas){
            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase())){
                System.out.println(tarea);
                hayCoincidencia=true;
            }
            if(hayCoincidencia == false){
                System.out.println("No existe tareas");
            }
        }
    }
    
    /**
     * Muestra por pantalla todas las tareas que contienen el texto indicado
     * como parámetro, una en cada linea, y ademas muestra un mensaje al final indicando
     * el numero de coincidencias encontradas. Si no hay ninguna que contenga el texto
     * buscado informa de la situacion. Este metodo es insensible a mayusculas o minusculas
     */
    public void mostrarCoincidencias(String textoABuscar)
    {
        boolean hayCoincidencia = false;
        int contador=0;
        for (String tarea : tareas){
            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase())){
                System.out.println(tarea);
                hayCoincidencia=true;
                contador++;
            }
            

        }
        if(hayCoincidencia == false){
                System.out.println("No existe tareas");
        }
        else{
            System.out.println("Hay" + contador + "tareas coincidentes");
        }
   }
   
   /**
    * Muestra por pantalla la primera tarea que contenga el texto indicado como
    * parámetro.En caso de que no haya ninguna coincidencia no muestra nada
    */
    public void mostrarPrimerCoincidente(String textoABuscar)
    {
        int contador=0;
        for (String tarea : tareas){
            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase())){
                contador++;
                if(contador==1){
                    System.out.println(tarea);
                }
            }
            
        }
    }
    
    
    /**
     * Muestra por pantalla todas las tareas existentes, una por línea
     * usando el while
     */
    public void mostrarTarea2()
    {
        int posicionTareaActual=0;
        while (posicionTareaActual < tareas.size()) {
            System.out.println(tareas.get(posicionTareaActual));
            posicionTareaActual++;
        }
    }
    
    /**
     * Muestra las tareas numeradas usando un bucle while
     */
    public void mostrarTareasNumeradas2()
    {
        int posicionTareaActual=0;
        while (posicionTareaActual < tareas.size()) {
            System.out.println(posicionTareaActual + 1 + "." +tareas.get(posicionTareaActual));
            posicionTareaActual++;
    
        }
    }
    
    /**
     * Muestra por pantalla las primeras n tareas (siendo n un parámetro). En
     * caso de que no haya suficientes tareas muestra solo las que haya
     */
    public void mostrarNPrimeras(int numeroAMostrar)
    {
        int posicionTareaActual=0;
        while (posicionTareaActual < numeroAMostrar && posicionTareaActual < tareas.size())
        {
            System.out.println(tareas.get(posicionTareaActual));
            posicionTareaActual++;
        }
    }
    
    /**
     * Devuelve true si hay al menos una tarea que contengan el texto indicado
     * como parámetro y false en caso contrario. El metodo se debe ejecutar de la
     * forma mas rapida posible
     */
    public boolean hayTareaCoincidente(String textoABuscar){
            boolean textoDevuelto;
            textoDevuelto = false;
            int posicionTareaActual=0;
            while(posicionTareaActual<tareas.size()&& textoDevuelto==false){
                if(textoABuscar.equals(tareas.get(posicionTareaActual))){
                    textoDevuelto=true;
                }
                posicionTareaActual++;
            }
            return textoDevuelto;
    }
    
    
    
    
    /**
     * Devuelve true si hay al menos una tarea que contenga el texto indicado
     * como parámetro y false en caso contrario. El metodo se debe ejecutar de la
     * forma mas rapida posible
     */
    public boolean hayTareaCoincidenteEficiente(String textoABuscar)
    {
        boolean hayTareaCoincidente = false;
        String tarea = "";
        int contador = 0;
        
        while(contador < tareas.size() && hayTareaCoincidente == false) {
            tarea = tareas.get(contador);
            if (tarea.contains(textoABuscar)) {
                hayTareaCoincidente = true;
            }
            contador += 1;
        }
        
        return hayTareaCoincidente;
    }   
    
    
    /**
     * Elimina la primera tarea que contiene el texto indicado por parámetro
     */
    public void eliminaPrimeraTareaCoincidente(String textoABuscar)
    {
        boolean hayCoincidencia = false;
        String tareaActual = "";
        int i = 0;
        while (!hayCoincidencia && i < tareas.size()){
            tareaActual = tareas.get(i);
            if(tareas.get(i).toLowerCase().contains(textoABuscar.toLowerCase())){
                tareas.remove(tareaActual);
                hayCoincidencia = true;
            }
            i++;
        }
    }
    
    /**
     * Elimina todas las tareas que contienen el texto a buscar
     */
    public void eliminaTodasTareasCoincidentes(String textoABuscar) 
    {
        String tareaActual = "";
        int i = 0;
        while ( i < tareas.size()){
            tareaActual = tareas.get(i);
            if(tareas.get(i).toLowerCase().contains(textoABuscar.toLowerCase())){
                tareas.remove(tareaActual);
                i--;
            }
            i++;
        }
        
    }
    
    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        String tarea=tareas.get(indiceTarea);
        tarea = "$" + tarea;
        tareas.set(indiceTarea, tarea);
    }
    
    }
    
    











