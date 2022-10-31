package Iphone;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorWeb;
import Funcionalidades.ReprodutorMusica;

import java.util.ArrayList;

public class Iphone {

    public static void main(String[] args) {


        ArrayList<ReprodutorMusica> reprodutores;
        AparelhoTelefonico telefone;
        ArrayList<NavegadorWeb> navegadores;

        ReprodutorMusica novoReprodutor = new ReprodutorMusica () ;
        novoReprodutor.selecionarMusica();
        novoReprodutor.tocarMusica();
        novoReprodutor.pausarMusica();

        NavegadorWeb novoNavegador = new NavegadorWeb();
        novoNavegador.exibirPagina();
        novoNavegador.adicionarAba();
        novoNavegador.atualizarPagina();

        AparelhoTelefonico novoCell = new AparelhoTelefonico();
        novoCell.atender();
        novoCell.ligar();
        novoCell.iniciarCorreioVoz();



    }
}
