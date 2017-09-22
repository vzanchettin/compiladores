import java.util.Stack;

public class VirtualMachine
{
    private static int linha = 0;
    
    // Metodo para indicar erro e a linha de sua ocorrencia
    private static void erro(String s)
    {
        System.err.println("erro na linha " + linha + ": " + s);
        System.exit(1);
    }
    
    public static void main(String[] args)
    {
        // Verifica argumentos
        if (args.length != 1)
        {
            erro("especifique o nome do arquivo de entrada");
        }
        
        Stack<Double> pilha = new Stack<Double>(); // pilha de valores reais, inicialmente vazia
        String s;
        double a, b;
        
        // Abre arquivo especificado e executa cada linha lida do mesmo
        ArquivoLeitura entrada = new ArquivoLeitura(args[0]);
        while ((s = entrada.lerLinha()) != null)
        {
            linha++;
            if (s.compareTo("ADIC") == 0) // operador de adicao
            {
                if (pilha.size() >= 2)
                {
                    b = pilha.pop();
                    a = pilha.pop();
                    pilha.push(a + b);
                }
                else
                {
                    erro("operacao de adicao precisa de dois operandos");
                }
            }
            else if (s.compareTo("SUBT") == 0) // operador de subtracao
            {
                if (pilha.size() >= 2)
                {
                    b = pilha.pop();
                    a = pilha.pop();
                    pilha.push(a - b);
                }
                else
                {
                    erro("operacao de subtracao precisa de dois operandos");
                }
            }
            else if (s.compareTo("MULT") == 0) // operador de multiplicacao
            {
                if (pilha.size() >= 2)
                {
                    b = pilha.pop();
                    a = pilha.pop();
                    pilha.push(a * b);
                }
                else
                {
                    erro("operacao de multiplicacao precisa de dois operandos");
                }
            }
            else if (s.compareTo("DIVI") == 0) // operador de divisao
            {
                if (pilha.size() >= 2)
                {
                    b = pilha.pop();
                    if (b == 0.0)
                    {
                        erro("nao e possivel fazer divisao por zero");
                    }
                    a = pilha.pop();
                    pilha.push(a / b);
                }
                else
                {
                    erro("operacao de divisao precisa de dois operandos");
                }
            }
            else
            {
                try
                {
                    a = Double.parseDouble(s);
                    pilha.push(a);
                }
                catch (NumberFormatException e)
                {
                    erro("formato invalido para valor numerico");
                }
            }
        }
        entrada.fechar();
        
        // Verifica resultado da expressao
        if (pilha.size() == 1)
        {
            a = pilha.pop();
            System.out.println("resultado: " + a);
        }
        else
        {
            erro("pilha resultante deve ter apenas um valor numerico");
        }
    }
}
