import org.example.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTeste {

    //Exemplo teste positivo (dados válidos)
    @Test
    public void testePessoaIdadeMaior18(){
        Pessoa pessoa = new Pessoa("Chris", 33);
        assertTrue(pessoa.verificaIdade());
    }

    //Exemplo teste positivo (dados inválidos )
    @Test
    public void testePessoaIdadeMenor18(){
        Pessoa pessoa = new Pessoa("Chris", 10);
        assertFalse(pessoa.verificaIdade());
    }

    //exp de nome nulo - teste com dados validos
    @Test (expected = NullPointerException.class)
    public void testeNomeNaoNull(){
        Pessoa pessoa = new Pessoa(null, 33);
    }

    //teste com idade fora da realidade
   @Test (expected = IllegalArgumentException.class)
       public void testeIdadeInvalida (){
        Pessoa pessoa = new Pessoa("Chris", 120);
   }

   //teste de criacao de pessoa valida
    @Test
    public void testeCriacaoPessoaValida (){
        Pessoa pessoa = new Pessoa("Chris", 33);
        assertEquals("Chris" , pessoa.getNome());
        assertEquals(33 , pessoa.getIdade());
    }

}
