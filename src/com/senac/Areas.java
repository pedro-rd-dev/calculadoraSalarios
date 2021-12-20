package com.senac;

public class Areas {
    public static void main(String[] args) {

        double baseQuadrado = -4;
        double baseTriangulo = 5;
        double alturaTriangulo = 10;

        double areaQuadrado;
        double areaTriangulo;

        if(baseQuadrado > 0){
            areaQuadrado  = baseQuadrado*baseQuadrado;
        }else {
            System.out.println("valor inválido");
        }

        if(baseTriangulo >=0 && alturaTriangulo >=0){
            areaTriangulo = baseTriangulo*alturaTriangulo/2;

        }

        System.out.println();

    }

}
