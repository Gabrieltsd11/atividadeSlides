import javax.swing.JOptionPane;

public class atividadeSlides
{
    public static void main (String args[])
    {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String anos = JOptionPane.showInputDialog("Digite o sua idade");
        Int idade = Integer.parseInt(anos);

        if (idade >= 18)
        {
            String message = JOptionPane.showInputMessageDialog(nome + "Você pode tirar a CNH")
        }
        else 
        {
            String message = JOptionPane.showInputMessageDialog(nome + "Você ainda tem" + idade "anos")

        }
    }
}