package Controller;
import Enums.Roles;
import Model.User;

public class UsersServices {

    //User -> Tipo de dato q almacena el array
    //personas -> nombre del array q almacena objetos de tipo usuario
    User[] personas = new User[50];
    /**
     * Metodo para agregar un objeto de tipo User en el array pre inicializado
     * se recorre el array hasta que encuentra una ubicacion que no este ocupado (!=null)
     * y asigna el objeto creado previamente. Una vez lleno el array, devuelve false si:
     * el arreglo esta lleno, o la condicion no se cumple
     * @param persona Recibe un objeto persona ya creado
     * @return Devuelve true una vez asignado persona al array. False si no hay condicion.
     */
        public boolean agregarUsuario(User persona){
            if(persona.getRol().equals(Roles.ADMINISTRADOR)){
                for (int i = 0; i < personas.length; i++) {
                    if (personas[i] == null){
                        personas[i] = persona;
                        return true;
                    }
                }
            }
            return false;
        }








}
