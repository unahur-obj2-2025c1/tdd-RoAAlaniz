package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Boolean abierta;
    private Integer clave;
    private Boolean bloqueada = false;
    private Integer intentosFallidos = 0;

    public CajaFuerte(){
        this.abierta = true;
    }

    public Boolean estaAbierta(){
        return abierta; //null
    }

    public void cerrar(Integer codigo){
        if (this.abierta){
            this.clave = clave;
            this.abierta = false;
        }
    }

    public void abrir(Integer codigo){
        if (this.clave.equals(clave) && !this.bloqueada){
            this.abierta = true;   
            this.intentosFallidos = 0;
        }   
        else{
            this.intentosFallidos++;
            if (this.intentosFallidos >= 3){
                this.bloqueada = true;
            }
        }
    }

    public Boolean estaBloqueada(){
        return this.bloqueada;
    }
}
