package lanchonete.atendimento.cozinha;

public class Cozinheiro {
        public void adicionarLancheNoBalcao(){
                System.out.println("adicionando Lanche  no balcão");
        }
        public void adicionarSucoNoBalcao(){
                System.out.println("adicionando Suco no balcão");
        }
        public void adicionarComboNoBalcao(){
                adicionarLancheNoBalcao();
                adicionarSucoNoBalcao();
        }
        private void prepararLanche(){
                System.out.println("preparando Lanche");
        }
        private void prepararSuco(){
                System.out.println("preparando Suco");
        }
        private void prepararCombo(){
                prepararLanche();
                prepararSuco();
        }
        private void selecionarIngredientesLanche(){
                System.out.println("selecionando ingredientes do Lanche");
        }
        private void selecionarFrutasSuco(){
                System.out.println("selecionando frutas do Suco");
        }
        private void lavarIngredientes(){
                System.out.println("lavar ingredientes");
        }
        private void baterSuco(){
                System.out.println("batendo Suco");
        }
        private void fritarIngrendientesLanche(){
                System.out.println("fritando ingredientes do Lanche");
        }
        //public void pedirParaTrocarGas(Atendente meuAmigo) {
        //        meuAmigo.trocarGas();
        //}
        private void pedirParaTrocarGas(Almoxarife meuAmigo) {
                meuAmigo.trocarGas();
        }
        private void pedirIngredientes(Almoxarife almoxarife) {
                almoxarife.pegarIngredientes();
        }

}   