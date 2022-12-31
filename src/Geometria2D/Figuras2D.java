package Geometria2D;

public abstract class Figuras2D {

        double x,y, z;
        double perimetro, area, diagonales;
        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }
        protected abstract void calcularperimetro();

        public double getPerimetro() {
            return perimetro;
        }

        public void setPerimetro(double perimetro) {
            this.perimetro = perimetro;
        }
        protected abstract void calculararea();

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }
        protected abstract void calculardiagonales();

        public double getDiagonales() {
            return diagonales;
        }

        public void setDiagonales(double diagonales) {
            this.diagonales = diagonales;
        }
}
