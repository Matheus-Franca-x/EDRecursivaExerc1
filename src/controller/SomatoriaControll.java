package controller;

public class SomatoriaControll 
{
	public SomatoriaControll()
	{
		super();
	}
	
	
	public int soma(int valor) //Inicio da somatoria
	{		
		return valor <= 0 ? 0 : valor + soma(valor - 1);
		//caso o valor de entrada seja menor ou igual a zero, ele ira retornar o valor como zero no final
		//nesse caso, quando o valor no final for igual a 0, ele ira retornar tudo
		//exemplo: valor = 4, 4 + 3 + 2 + 1 + 0 = 10, esse sera o valor da somatoria no final.	
	}
	
	
	
}
