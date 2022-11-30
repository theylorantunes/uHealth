
package Model;

import static View.Cadastro_GUI.txtEmail;
import static View.Cadastro_GUI.txtNome;
import static View.Cadastro_GUI.txtSenha;

import static View.Login_GUI.txtEmailVerif;
import static View.Login_GUI.txtSenhaVerif;
import View.PageInitial_GUI;
import static View.PageInitial_GUI.lblNomePI;
import javax.swing.JOptionPane;


public class Login_DAO {
    public static String cad_email;
    public static String cad_senha;
    public static String log_email;
    public static String log_senha;
    public static String cad_nome;
    
    public static void getLogin(){
    
        cad_nome = txtNome.getText();
        cad_email = txtEmail.getText();
        cad_senha = txtSenha.getText();     
        
        
       JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
       
    }
    
    public static void realLogin(){
               
        log_email = txtEmailVerif.getText(); 
        log_senha = txtSenhaVerif.getText(); 
        if(log_email.equals(cad_email) && log_senha.equals(cad_senha)){
            
            new PageInitial_GUI().setVisible(true);
         
        }else if(log_email.equals("") && log_senha.equals("")){
            JOptionPane.showMessageDialog(null,"Login e/ou senha incorretos.");
            new View.Login_GUI().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Login e/ou senha incorretos.");
            new View.Login_GUI().setVisible(true);
        }
    
    }
}
