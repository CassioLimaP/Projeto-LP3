/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

/**
 *
 * @author cassio
 */
public class Usuario {
    private String nome, cpf, email;
    
    //realizar cadastro ou login
    //realizar continuar como visitante
    public Boolean cadastro(String email){
        /*
        verifica se email ja esta cadastrado
        caso sim: reporta mensagem com erro
        caso nao: chama classe Cadastro e seu metodo novoCadastro(email)
        */
        return true;
    }
    public Boolean login(String email, String senha){
        /*
        verificar se usuario consta no banco de dados.
        verificar senha correta 
        se estiver: recuperar estado do usuario, da valor true a Cadastro
        se nao: mensagem de erro no login ou senha
        */
        return true ;
    }
    public void deslogar(){
        //desloga o usuario 
    }
}
