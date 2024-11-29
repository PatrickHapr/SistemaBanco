package sisbanco;

import sisbanco.controllers.Controller;
import sisbanco.models.dao.ClienteDAO;
import sisbanco.models.dao.ClienteDAOImpl;
import sisbanco.models.dao.ContaDAO;
import sisbanco.models.dao.ContaDAOImpl;
import sisbanco.view.*;

public class StartApp {
    public static void main(String[] args) {
        try {
            ClienteDAO clienteDAO = new ClienteDAOImpl();
            ContaDAO contaDAO = new ContaDAOImpl();

            TelaPrincipal telaPrincipalView = new TelaPrincipal();
            CadastraCliente cadastraClienteView = new CadastraCliente();
            ClienteConta clienteContaView = new ClienteConta();
            SelecionarCpf selecionarCpfView = new SelecionarCpf();
            ManipularConta manipularConta = new ManipularConta();

            new Controller(telaPrincipalView, clienteDAO, contaDAO, cadastraClienteView, clienteContaView, selecionarCpfView, manipularConta);

            telaPrincipalView.initView();

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
