package br.com.prova;

public class CadastroUsuariosArray implements CadastroUsuarios{

    private Usuario[] usuarios;
    private int qtdUsuarios = 0;

    public CadastroUsuariosArray() {
        this.usuarios = new Usuario[10];
    }

    @Override
    public void adicionar(Usuario usuario) {
        if(this.qtdUsuarios < this.usuarios.length) {
            this.usuarios[this.qtdUsuarios] = usuario;
            this.qtdUsuarios++;
        } else {
            System.err.println("Não tem mais espaço");
        }
    }

    public void remover(int indice) {
        if (indice >=0 && indice < this.qtdUsuarios){
            this.usuarios[indice] = null;
            this.qtdUsuarios--;
        }
    }

    @Override
    public void buscar(String login) {

    }

    @Override
    public void renomear(String login) {

    }

    @Override
    public void listarTodos(Usuario usuario) {
        for (Usuario u : this.usuarios) {
            System.out.println(u);

    }


}
