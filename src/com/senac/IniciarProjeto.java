package com.senac;

public class IniciarProjeto {

    public static void main(String[] args) {

        double salarioJuniorHora = 25.00;
        double salarioPlenoHora = 45.00;
        double salarioSeniorHora = 60.00;
        int quantidadeHorasTrabalhadasNoDia = 6;
        int quantidadeDeDiasTralhadosNoMes = 30;

        double salarioJuniorMes = salarioJuniorHora * quantidadeHorasTrabalhadasNoDia * quantidadeDeDiasTralhadosNoMes;
        double salarioPlenoMes = salarioPlenoHora * quantidadeHorasTrabalhadasNoDia * quantidadeDeDiasTralhadosNoMes;
        double salarioSeniorMes = salarioSeniorHora * quantidadeHorasTrabalhadasNoDia * quantidadeDeDiasTralhadosNoMes;

        System.out.println(salarioJuniorMes);
        System.out.println(salarioPlenoMes);
        System.out.println(salarioSeniorMes);

        System.out.println();

    }


}
