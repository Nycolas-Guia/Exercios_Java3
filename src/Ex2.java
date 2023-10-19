import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args){
        int n;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com a quantidade de valores que deseja inserir (1 - 10)"));
        }while (n < 1 || n > 10);
        double[] x = new double[n];
        String num = "";
        double media, soma = 0;

        for(int i = 0; i < x.length; i++){
            x[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com o " + (i+1) + "Â° valor"));
            num = num + "  " + Double.toString(x[i]);
            soma = soma + x[i];
        }
        media = soma / n;

        JOptionPane.showMessageDialog(null, "os valores foram: " + num + "\na soma foi: " + soma + String.format("\ne a media foi: %.2f", media));
    }
}
    }
}
