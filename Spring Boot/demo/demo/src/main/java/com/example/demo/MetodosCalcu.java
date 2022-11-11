package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetodosCalcu {


    @GetMapping("/hola")
    String ruta1(){
        return "Hola mundo";
    }

    @GetMapping("/SUMAR/{NUM1}/{NUM2}")
    float SUMA(@PathVariable float NUM1, @PathVariable float NUM2){
        return NUM1 + NUM2;
    }
    @GetMapping("/RESTAR/{NUM1}/{NUM2}")
    float RESTAR(@PathVariable float NUM1, @PathVariable float NUM2){
        return NUM1 - NUM2;
    }

    @GetMapping("/Multiplicar/{NUM1}/{NUM2}")
    float Multiplicar(@PathVariable float NUM1, @PathVariable float NUM2){
        return NUM1 * NUM2;
    }
    @GetMapping("/Dividir/{NUM1}/{NUM2}")
    Object Dividir(@PathVariable float NUM1, @PathVariable float NUM2){
        if (NUM2 != 0){
            return NUM1 / NUM2;
        }
        return "No se puede dividir por 0";
    }

    @GetMapping("/Cuadratica/{a}/{b}/{c}")
    static double[] FuncionCuadratica(@PathVariable double a, @PathVariable double b,@PathVariable double c){

        double b2 = b*b;
        double dentroraiz = b2 - (4*a*c);
        double raiz = (double) Math.sqrt(dentroraiz);

        double cuenta = (double )raiz;
        double veri =cuenta;
        if (veri % 2 ==0)
        {
            double primero = ((-b + raiz)/2*a);
            double segundo = ((-b - raiz)/2*a);

            double  result[] = {primero, segundo};


            return  result;
        }
        return null;

    }
}
