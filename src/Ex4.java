import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args){
        int n, cont =  0;
        double maior = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com a quantidade de valores que deseja inserir (1-10)"));
        }while (n < 1 || n > 10);
        double[] x = new double[n];
        for(int i = 0; i < x.length; i++){
            x[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com o " + (i+1) + "° valor"));
            if(x[i] > maior || i == 0){
                maior = x[i];
                cont = i;
            }
        }
        JOptionPane.showMessageDialog(null, "o maior valor foi " + maior + "\nna posição " + cont);
    }
}