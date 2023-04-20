package Trabalho;

public interface Secretaria {
	
	void agendarAtendimento();
	
    void atenderFilaAlunos(Fila<Aluno> fila);
    
    void emitirRelatorio();
	
}
