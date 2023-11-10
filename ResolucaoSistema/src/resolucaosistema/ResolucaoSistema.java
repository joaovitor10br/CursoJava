package resolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoSistema {
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension dimensao = resolucao.getScreenSize();
        
        System.out.println("A resolução da tela é");
        System.out.println(dimensao.width + "x" + dimensao.height);
    }
}
