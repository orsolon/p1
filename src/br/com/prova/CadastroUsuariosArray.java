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
            if (this.qtdUsuarios == this.usuarios.length){
                this.expandir();
            }
            this.usuarios[qtdUsuarios++] = usuario;

        }

    }

    private void expandir(){
        Usuario[] expande = new Usuario[this.usuarios.length * 2];
        for (int i=0; i< this.qtdUsuarios; i++){
            expande[i] = this.usuarios[i];
        }
        this.usuarios = expande;
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
        if (TipoDeUsuario.valueOf(usuario) =="ADMIN") {
            for (Usuario user : this.usuarios) {
                System.out.println(user);
            }
                System.out.println("Usuario não permitido");

            }

        }

    }

/*
Crie um subtipo de Usuario chamado Admin. Deve haver exatamente uma instância desse tipo em todo o cadastro (nem mais nem menos - isso deve ser controlado pelos métodos adicionar e remover). Adicione um método listarTodos na interface CadastroUsuarios que recebe como parâmetro um objeto Usuario. Se for o Admin, então liste todos os elementos do cadastro em ordem alfabética de nome. Caso contrário, exiba uma mensagem de erro "Funcionalidade não permitida".
 */