package Logica;

public class Coordenadas {
private static final int num_angulos=3;
private static final int norma=144;//del vector
private final double[] angulo=new double[num_angulos];
private int[] angulo_grad=new int[num_angulos];//respecto vector y el plano xy
private double rotar;
double[] suma_cos= new double[num_angulos];
double[] suma_sen= new double[num_angulos];
private int mov_x;
private final int base=3;//altura

    public void Precalcular(){
        Ajustar_Angulos();
        Grad_a_Rad();
        Sumas();
    }
    private void Ajustar_Angulos(){
        for(int i=1; i<num_angulos;i++){
            angulo_grad[i]=angulo_grad[i]-90-(int)(Math.round(Math.toDegrees(Math.acos(Math.sin(Math.toRadians(angulo_grad[i-1]))))));
        }
    }
    private void Grad_a_Rad(){
      for(int i=0;i<num_angulos;i++){
          angulo[i]=Math.toRadians(angulo_grad[i]);
      } 
      rotar=Math.toRadians(rotar);
    }
    private void Sumas(){ 
        suma_cos[0]=Math.cos(angulo[0]);
        for(int i=1; i<(num_angulos);i++){
            suma_cos[i]=suma_cos[i-1]+Math.cos(angulo[i]);
        }
        suma_sen[0]=Math.sin(angulo[0]);
        for(int i=1; i<(num_angulos);i++){
            suma_sen[i]=suma_sen[i-1]+Math.sin(angulo[i]);     
        }
    }
    public int[] Calcular(int vector){//voy en sentido anti horario y midiendo respecto a +x
        double[] operar= {norma*Math.cos(rotar),norma*Math.sin(rotar),norma};
        int[] coordenadas=new int[3];
        for(int i=0; i<2;i++){
            coordenadas[i]=(int)(Math.round(operar[i]*suma_cos[vector]));
        }
        coordenadas[0]=coordenadas[0]+mov_x;
        coordenadas[2]=(int)(Math.round(operar[2]*suma_sen[vector]))+base;
        return coordenadas;//posicion final
    }
        public int[] Pasar_a_2d(int[] coordenada){
        int[] posicion_2d={coordenada[0],coordenada[2]};
        return posicion_2d;
    }
    public void setJoints(int[] joints){
        this.angulo_grad=joints;
    }
    public double[] getJoints(){//en Rad
        return angulo;
    }
    public void setRota(int rota) {
        this.rotar= rota; 
    }
    public double getRota(){
        return rotar;
    }
    public void setMov_Ho(int Mov_Ho) {
        this.mov_x= Mov_Ho; 
    }
}
