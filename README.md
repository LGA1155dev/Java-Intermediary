# 📚 Aprendendo Java Intermediario e documentando a experiência


## 📈 Progresso

* [x] Dia 1 concluído
* [x] Dia 2 concluído
* [x] Dia 3 concluído
* [x] Dia 4 concluído
* [x] Dia 5 concluído
* [x] Dia 6 concluído
* [x] Dia 7 concluído
* [x] Dia 8 concluído
* [x] Dia 9 concluído
* [x] Dia 10 concluído
* [x] Dia 11 concluído
* [x] Dia 12 concluído
* [x] Dia 13 concluído
* [x] Dia 14 concluído
* [x] Dia 15 concluído
* [x] Dia 16 concluído
* [x] Dia 17 concluído
* [x] Dia 18 concluído
* [x] Dia 19 concluído
* [x] Dia 20 concluído
* [x] Dia 21 concluído
* [x] Dia 22 concluído
* [x] Dia 23 concluído
* [x] Dia 24 concluído
* [x] Dia 25 concluído
* [x] Dia 26 concluído
* [x] Dia 27 concluído
* [x] Dia 28 concluído
* [x] Dia 29 concluído
* [X] Dia 30 concluído
* [x] Dia 31 concluído
* [x] Dia 32 concluído
* [X] Dia 33 concluído
* [X] Dia 34 concluído
* [X] Dia 35 concluído
* [X] Dia 36 concluído
* [X] Dia 37 concluído
* [X] Dia 38 concluído
* [X] Dia 39 concluído
* [X] Dia 40 concluído
* [X] Dia 41 concluído
* [X] Dia 42 concluído
* [X] Dia 43 concluído
* [X] Dia 44 concluído
* só falta mais 155 dias de estudo... pouco né?

* [X] Isso acima não é a quantidade real de dias de estudo em java, já que já estudo esta linguagem a mais de 5 meses. Essa contagem serve para demonstrar a contagem de dias que venho nesse arquivo markdown documentar os estudos.]

* Esse repositorio é a continuação do meu repositorio Java padrão como uma forma de organização por topicos.


## 📅 Dia 44


### Agora estou aprendendo sobre StringBuilder, StringBuffer e String Padrão e a diferença entre elas.

### A String padrão é bem comum para registrar variaveis por exemplo: String name = "Gabriel" mas em cenario profissional ela não é tão performatica

### Até porque ela é muito mais muito lenta... Imagina que você trabalha na amazon ou outra empresa e precisa estar constantemente atualizando e adicionando novas palavras a uma variavel para mostra-la de maneira dinamica para diversas pessoas imagine então este codigo:


```text id="n0s9ci"

package work.with.strings.utilitary.classes;

public class StringBuilder {

	public static void main(String[] args) {
		String start = System.currentTimeMillis();
		concatString(30_000)
		String finish = System.currentTimeMillis();
		
		System.out.println("Este é o tempo que demorou: " + (finish - start) + " ms")
	
	
		
		public void concatString(int size) {
	
		String text = ""
		
		for (i = 0; i <= size; i++) {
			text += i
		}	
	}
		
	}
	
}
```


### Nesse exemplo a variavel size começa tendo nenhum valor e a variavel i vai atribuindo valores a string, na primeira volta size que era "" agora vai ser "0", depois passa a ser "01", "012", "0123" e assim em diante.

### nesse exemplo uma string normal demorarias cerca de 9 segundo e isso em aplicação real custa muito. Pra isso foi criado o String Builder que praticamente zera esse tempo de demora.


### Então temos o String builder que tem uma sintaxe um pouco diferente:

public class StringBuilder {

	public static void main(String[] args) {
		String start = System.currentTimeMillis();
		concatString(30_000)
		String finish = System.currentTimeMillis();
		
		System.out.println("Este é o tempo que demorou: " + (finish - start) + " ms")
	
	
		
		public void concatString(int size) {
		
		StringBuilder sb = new StringBuilder(size)
	
		for (i = 0; i <= size; i++) {
			sb.append(i)
		}	
	}
		
	}
	
}
```


### Nesse caso o seu tempo de espera é 14 ms em média


### Já o StringBuffer ele é mais para uso em ambientes especificos que demandam uma alta adição em strings ou variaveis e pode perder feio para o StringBuilder em ambientes improprios ao uso dele.

### Ele tem a mesma sintaxe do string builder mas deve ser usado em ocasiões diferentes:


public class StringBuilder {

	public static void main(String[] args) {
		String start = System.currentTimeMillis();
		concatString(300_000)
		String finish = System.currentTimeMillis();
		
		System.out.println("Este é o tempo que demorou: " + (finish - start) + " ms")
	
	
		
		public void concatString(int size) {
		
		StringBuffer sb = new StringBuffer(size);
	
		for (i = 0; i <= size; i++) {
			sb.append(i);
		}	
	}
		
	}
	
}
``` 



### Mas no uso diario a recomendação é usar Strings normais porque adicionar mais complexidade a um programa é basicamente dobrar o número de problemas que você terá que resolver no futuro e dobrar a dor de cabeça também kkkkk












