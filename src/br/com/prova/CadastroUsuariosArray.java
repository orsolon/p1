package br.com.prova;

public class CadastroUsuariosArray implements CadastroUsuarios{

    private Usuario[] usuarios;
    private int qtdUsuarios = 0;

    public int getQtdUsuarios() {
        return qtdUsuarios;
    }

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

    public void remover(String nome) {
        for (int i=0; i< this.qtdUsuarios; i++){
            Usuario usuario = this.usuarios[i];
            if (usuario.getNome().equalsIgnoreCase(nome)){
                this.usuarios[i] = null;
                this.qtdUsuarios--;
            }
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
        for (Usuario user : this.usuarios) {
            System.out.println(user);

        }
    }

}
