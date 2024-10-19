package application;

public class Poema {
    private String titulo;
    private String poema;
	private String autor;
	public Poema(String titulo, String poema, String autor){
        this.titulo = titulo;
        this.poema = poema;
        this.autor = autor;
	}
    public Poema (String poema) {
        this.poema = poema;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getPoema() {
        return this.poema;
    }
	public String getAutor(){
		return this.autor;
	}
    public String declamar() {
        return getPoema();
    }
}
