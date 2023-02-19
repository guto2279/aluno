package cursojava.execultavel;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;
public class classeTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Wesley Daniel");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("151217800");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		
		
		
		
		
		
		
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(secretario.salario());
		
	}

}
