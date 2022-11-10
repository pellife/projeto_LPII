public class vagao{
    private char nomeVagao; //variável para guardar a identidade de cada vagão (letra)
    private String tipoCarga; //variável para guardar o tipo de carga
    private String nomeCarga; //variável para guardar o nome da carga
    private double qntdCarga; //variável para quardar a quantidade, em quilogramas, da carga
    private int via;

     public vagao(char nomeVagao, String tipoCarga, String nomeCarga, double qntdCarga, int via){ //construtor para inicialização das variáveis
        this.nomeVagao = nomeVagao;
        this.tipoCarga = tipoCarga;
        this.nomeCarga = nomeCarga;
        this.qntdCarga = qntdCarga;
        this.via = via;
     }

     public char getNomeVagao(){
         return nomeVagao;
     }

     public void setNomeVagao(char nomeVagao){
         this.nomeVagao = nomeVagao;
     }

     public String getTipoCarga(){
         return tipoCarga;
     }

     public void setTipoCarga(String tipoCarga){
         this.tipoCarga = tipoCarga;
     }

     public String getNomeCarga(){
         return nomeCarga;
     }

     public void setNomeCarga(String nomeCarga){
         this.nomeCarga = nomeCarga;
     }

     public double getQntdCarga(){
         return qntdCarga;
     }

     public void setQntdCarga(double qntdCarga){
         this.qntdCarga = qntdCarga;
     }

     public int getVia(){
        return via;
     }

     public void setVia(int via){
        this.via = via;
     }
}
