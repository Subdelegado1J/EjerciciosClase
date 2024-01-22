public class cilindro extends circulo{

    public double altura;
    public double area;

    public cilindro (double radio, double altura) {
        super(radio);

        if (altura < 0){
            this.altura = 0;
        } else {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getVolume(){
        return this.altura * this.area;
    }

    public double getArea(){
        return area;
    }
}