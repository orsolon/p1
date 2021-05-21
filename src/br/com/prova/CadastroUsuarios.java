package br.com.prova;


public interface CadastroUsuarios {

    public void adicionar(Usuario usuario);
    public void buscar(String login);
    void renomear(String login);
    public void listarTodos(Usuario usuario);

}
