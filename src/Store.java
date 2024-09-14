public class Store 
{
    public static void main(String[] args) {
        int cantidad_productos= 3;
        int precio_1 = 15;
        int precio_2 = 10;
        int precio_3 = 5;
        int cantidad_1= 2;
        int cantidad_2= 3;
        int cantidad_3= 4;
        int DESEMPEÑO_DE_VENTA_PROMEDIO= 50;

        int[] precios= {precio_1+precio_2+precio_3};
        int[] cantidades= {cantidad_1+cantidad_2+cantidad_3};

        int totalSales= 0;

        for (int i = 0; i < cantidad_productos; i++) {
            totalSales += precios[i] * cantidades[i];
        }
        if (totalSales > DESEMPEÑO_DE_VENTA_PROMEDIO) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
 }
