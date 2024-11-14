package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class Malha {
    private double x;
    private double y;
    private double tamanhoQuadrado;
    private int quantidadeLinhas;
    private int quantidadeColunas;

    public Malha(double x, double y, double tamanhoQuadrado, int quantidadeLinhas, int quantidadeColunas) {
        this.x = x;
        this.y = y;
        this.tamanhoQuadrado = tamanhoQuadrado;
        this.quantidadeLinhas = quantidadeLinhas;
        this.quantidadeColunas = quantidadeColunas;
    }

    public void desenhar(Draw draw) {
        for (int i = 0; i <= quantidadeLinhas; i++) {
            draw.line(this.x, this.y + (this.tamanhoQuadrado * i), (this.x+(this.tamanhoQuadrado * this.quantidadeLinhas)), this.y + (this.tamanhoQuadrado * i));
            draw.line(this.x + (this.tamanhoQuadrado * i), this.y, (this.x+(this.tamanhoQuadrado * i)), this.y + (this.tamanhoQuadrado* this.quantidadeColunas));
        }


    }
}
