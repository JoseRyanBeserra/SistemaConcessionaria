package gui;

import system.SistemaConcessionaria;
import system.SistemaConcessionariaDeRyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ConcessionariaGUI extends JFrame {

    JLabel linha1, linha2;
    ImageIcon ManoelGomes = new ImageIcon("./imgs/ManoelGomes.jpg");
    JMenuBar barraDeMenu = new JMenuBar();
    SistemaConcessionaria sistemaConcessionaria = new SistemaConcessionariaDeRyan();

    public ConcessionariaGUI(){
        setTitle("Sistema Concessionária");
        setSize(960,540);
        setLocation(0, 0);
        //localização da janela na tela
        setResizable(false);
        //janela não redimensionável
        getContentPane().setBackground(Color.lightGray);
        linha1 = new JLabel("Concessionária", JLabel.CENTER);
        linha1.setForeground(Color.BLACK);
        linha1.setFont(new Font("Arial", Font.BOLD, 24));
        linha2 = new JLabel(ManoelGomes, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3,1));
        add(linha1);
        add(linha2);
        add(new JLabel());

        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem menuCadastrarVeiculo = new JMenuItem("Cadastrar Veiculo");
        menuCadastrar.add(menuCadastrarVeiculo);

        JMenu menuRemover = new JMenu("Remover");
        JMenuItem menuRemoverVeiculo = new JMenuItem("Remover Veiculo");
        menuRemover.add(menuRemoverVeiculo);

        JMenu menuPesquisarPelaPlaca = new JMenu("Pesquisar");
        JMenuItem menuPesquisarVeiculoPelaPlaca = new JMenuItem("Pesquisar veiculo pela placa");
        menuPesquisarPelaPlaca.add(menuPesquisarVeiculoPelaPlaca);

        JMenu menuPesquisarPeloValor = new JMenu("Pesquisar pelo valor");
        JMenuItem menuPesquisarVeiculoPeloValor = new JMenuItem("Pesquisar veiculo pelo valor");
        menuPesquisarPeloValor.add(menuPesquisarVeiculoPeloValor);

        barraDeMenu.add(menuCadastrar);
        barraDeMenu.add(menuRemover);
        barraDeMenu.add(menuPesquisarVeiculoPelaPlaca);
        barraDeMenu.add(menuPesquisarVeiculoPeloValor);

        setJMenuBar(barraDeMenu);
    }

    public static void main(String [] args){
        JFrame janela = new ConcessionariaGUI();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
