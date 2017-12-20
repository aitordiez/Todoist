public class Test
{
    /**
     * Metodo principal
     */
    public static void main(String[] args) 
    {
       
    }
    
    
    public void test2() 
    {
        System.out.println("### Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
        System.out.println("\n### Mostramos el numero de tareas pendientes (debería ser 0)...");
        todoist.mostrarNumeroTareasPendientes();
        System.out.println("\n### Añadimos 3 tareas...");
        todoist.addTarea("pan");
        todoist.addTarea("Sacar la basura");
        todoist.addTarea("Dormir la siesta");
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareas();
         System.out.println("\n### Eliminamos la  tarea...");
        todoist.eliminaPrimeraTareaCoincidente("basura");
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareas();
        
    }
    
    public void test3()
    {
        System.out.println("### Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
                
        System.out.println("\n### Añadimos 4 tareas...");
        todoist.addTarea("Limpiar la cocina");
        todoist.addTarea("Sacar la basura");
        todoist.addTarea("Dormir la siesta");    
        todoist.addTarea("Ordenar la basura"); 
        
        System.out.println("\n### Mostramos todas las tareas...");
        todoist.mostrarTareasNumeradas();     
        
        System.out.println("\n### Elimina la primera con 'basura'...");
        todoist.eliminaTodasTareasCoincidentes("basura");
        
        System.out.println("\n### Mostramos todas las tareas (deberian salir 2 tareas...");
        todoist.mostrarTareas();            
    }
    
    
} 
