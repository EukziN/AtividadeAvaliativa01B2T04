package fag.objetos;

public class Filme {
    private String titulo;
    private double avaliacao;

   

    public Filme(String titulo, double avaliacao) {
        setTitulo(titulo);
        setAvaliacao(avaliacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        } else {
            this.titulo = "Título inválido";
        }
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        if (avaliacao >= 0 && avaliacao <= 5) {
            this.avaliacao = avaliacao;
        } else{
             System.out.println("Avaliação inválida. Valor ignorado.");
             this.avaliacao = 0;
        }
    }
 

    public void exibir() {
        System.out.println("Filme: " + titulo + " Avaliação do mesmo: " + avaliacao + " ⭐");
    }
}