package br.com.questao2prova;

public class Pix {
    private boolean comprovanteTransacaoPix;

    public Pix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }
    public boolean imprimirCupomFiscal(){
        return comprovanteTransacaoPix ;
    }
}
