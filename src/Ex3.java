import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args){
        int n, cont = 0;
        String num = "";
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com a quantidade de valores que deseja inserir (1-10)"));
        }while (n < 1 || n > 10);

        int[] x = new int[n];

        for(int i = 0; i < x.length; i++){
            x[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com o " + (i+1) + "Â° valor"));

            if(x[i] % 2 == 0){
                cont++;
                num = num + " " + Integer.toString(x[i]);
            }
        }

        JOptionPane.showMessageDialog(null, "de " + n + " valores " + cont + " foram par\n" + num);
    }
}
