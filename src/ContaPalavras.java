import java.util.HashMap;
import java.util.Map;


public class ContaPalavras {
	
	private String frase;
	private String palavras[];
	private Map contagem;
	
	public int quantidade(String a){
		return (Integer)contagem.get(a);
	}

	public String getFrase(){
		return frase;
	}

	public void setFrase(String frase){
		this.frase = frase;
		palavras = frase.split(" ");
		contagem = new HashMap();
		for (int i=0;i<palavras.length;i++){
			if(! contagem.containsKey(palavras[i])){
				contagem.put(palavras[i], 1);
		
			}else{
				
				int qtdAtual=(Integer)contagem.get(palavras[i]);
				contagem.put(palavras[i],qtdAtual+1 );
				
			}
		}
	}

	public int quantidade (){
		return 0;
	}

}
