/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import Classes.Campeonatos;
import Classes.Colocacao;
import Classes.Jogadores;
import Controle.Velhadao;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class JogodaVelha extends javax.swing.JFrame {
    
DefaultComboBoxModel modelo= new DefaultComboBoxModel();
DefaultComboBoxModel modelo2= new DefaultComboBoxModel();
DefaultComboBoxModel modelo3= new DefaultComboBoxModel();
        
        boolean jr1=true;
        boolean jr2=false;

        int vit1=0;
        int vit2=0;
        int emp=0;
    /**
     * Creates new form PáginaInicial
     */
    public JogodaVelha() {
        initComponents();
        jog1.setModel((ComboBoxModel<Jogadores>) modelo);
        jog2.setModel((ComboBoxModel<Jogadores>) modelo2);
        camp.setModel((ComboBoxModel<Campeonatos>)modelo3);
        carregajogadores();
        carregajogadores2();
        carregarcampeonatos();
       
    }

    
    public void carregajogadores()
    {
        Velhadao dao= new Velhadao();
        
        ArrayList<Jogadores> lista=dao.buscar();
        
        modelo.removeAllElements();
        
        modelo.addElement(null);
        for(Jogadores obj: lista)
        {
            modelo.addElement(obj);
        }
        
    }
    
    public void carregarcampeonatos()
    {
        Velhadao dao= new Velhadao();

        modelo3.removeAllElements();
        modelo3.addElement(null);
        for(Campeonatos ob: dao.buscar2())
        {
            modelo3.addElement(ob);
        }
    }
    
    public void carregajogadores2()
    {
        Velhadao dao2= new Velhadao();
        ArrayList<Jogadores> lista2=dao2.buscar();
        modelo2.removeAllElements();
        modelo2.addElement(null);
        for(Jogadores obj2: lista2)
        {
            modelo2.addElement(obj2);
        }
    }
    
    
    
    public void jogadorganhador(String jr, Jogadores obj)
    {
        Velhadao dao=new Velhadao();
        if(q1.getText().equals(jr) && q2.getText().equals(jr) && q3.getText().equals(jr))
        {
            if(q1.getText().equals("X"))
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit1++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit1.setText(""+vit1);
                dao.editar2(obj);
                limparcampos();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit2++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit2.setText(""+vit2);
                dao.editar2(obj);
                limparcampos();
                
            }
            
        }
        if(q4.getText().equals(jr) && q5.getText().equals(jr) && q6.getText().equals(jr))
        {
            if(q4.getText().equals("X"))
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit1++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit1.setText(""+vit1);
                dao.editar2(obj);
                limparcampos();
               
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit2++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit2.setText(""+vit2);
                dao.editar2(obj);
                limparcampos();
               
            }
            
        }
        
        if(q7.getText().equals(jr) && q8.getText().equals(jr) && q9.getText().equals(jr))
        {
            if(q7.getText().equals("X"))
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit1++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit1.setText(""+vit1);
                dao.editar2(obj);
                limparcampos();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit2++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit2.setText(""+vit2);
                dao.editar2(obj);
                limparcampos();
               
            }
            
        }
        
        if(q1.getText().equals(jr) && q4.getText().equals(jr) && q7.getText().equals(jr))
        {
            if(q1.getText().equals("X"))
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit1++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit1.setText(""+vit1);
                dao.editar2(obj);
                limparcampos();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit2++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit2.setText(""+vit2);
                dao.editar2(obj);
                limparcampos();
                
            }
            
        }
        if(q2.getText().equals(jr) && q5.getText().equals(jr) && q8.getText().equals(jr))
        {
            if(q2.getText().equals("X"))
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit1++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit1.setText(""+vit1);
                dao.editar2(obj);
                limparcampos();
               
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit2++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit2.setText(""+vit2);
                dao.editar2(obj);
                limparcampos();
                
            }
            
        }
        if(q3.getText().equals(jr) && q6.getText().equals(jr) && q9.getText().equals(jr))
        {
            if(q3.getText().equals("X"))
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit1++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit1.setText(""+vit1);
                dao.editar2(obj);
                limparcampos();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit2++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit2.setText(""+vit2);
                dao.editar2(obj);
                limparcampos();
                
            }
            
        }
        
        if(q1.getText().equals(jr) && q5.getText().equals(jr) && q9.getText().equals(jr))
        {
            if(q1.getText().equals("X"))
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit1++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit1.setText(""+vit1);
                dao.editar2(obj);
                limparcampos();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit2++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit2.setText(""+vit2);
                dao.editar2(obj);
                limparcampos();
               
            }
            
        }
        
        if(q3.getText().equals(jr) && q5.getText().equals(jr) && q7.getText().equals(jr))
        {
            if(q3.getText().equals("X"))
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit1++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit1.setText(""+vit1);
                dao.editar2(obj);
                limparcampos();
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Parabéns  "+obj.getNome()+ " você venceu!!");
                vit2++;
                obj.setVitoria(obj.getVitoria()+1);
                txtvit2.setText(""+vit2);
                dao.editar2(obj);
                limparcampos();
                
            }
            
        }
        
                if(!q1.getText().equals("") &&
                        !q2.getText().equals("") &&
                        !q3.getText().equals("") &&
                        !q4.getText().equals("") &&
                        !q5.getText().equals("") &&
                        !q6.getText().equals("") &&
                        !q7.getText().equals("") &&
                        !q8.getText().equals("") &&
                        !q9.getText().equals(""))
                {
                    Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
                    Jogadores jgr2=(Jogadores)jog2.getSelectedItem();

                    JOptionPane.showMessageDialog(null,"Houve empate dos dois!!");
                    emp++;


                    jgr1.setEmpate(jgr1.getEmpate()+1);
                    jgr2.setEmpate(jgr2.getEmpate()+1);
                    txtemp.setText(""+emp);
                    dao.editar3(jgr1,jgr2);

                    limparcampos();
                   

                }
        
        
    }
    
    
   public void limparcampos()
   {
       q1.setText("");
       q2.setText("");
       q3.setText("");
       q4.setText("");
       q5.setText("");
       q6.setText("");
       q7.setText("");
       q8.setText("");
       q9.setText("");
      
         
       
   }
   
   public void limpargeral()
   {
       q1.setText("");
       q2.setText("");
       q3.setText("");
       q4.setText("");
       q5.setText("");
       q6.setText("");
       q7.setText("");
       q8.setText("");
       q9.setText("");
       carregajogadores();
       carregajogadores2();
       txtvit1.setText("");
       txtvit2.setText("");
       txtemp.setText("");
       vit1=0;
       vit2=0;
       emp=0;
       //simb1.setSelectedIndex(0); // No parâmetro index você passa o índice da opção que você quer
                                   // que seja selecionado, assim reseta a caixa de combinação.
       //simb2.setSelectedIndex(0);
       //j1.clearSelection();// reseta os radios buttons
       //j2.clearSelection();
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        q8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtvit2 = new javax.swing.JTextField();
        q9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        q4 = new javax.swing.JButton();
        txtemp = new javax.swing.JTextField();
        q5 = new javax.swing.JButton();
        btnovo = new javax.swing.JButton();
        q1 = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        q2 = new javax.swing.JButton();
        q3 = new javax.swing.JButton();
        q6 = new javax.swing.JButton();
        q7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtvit1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jog2 = new javax.swing.JComboBox<>();
        jog1 = new javax.swing.JComboBox<>();
        fim = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        novo = new javax.swing.JButton();
        camp = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);

        q8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q8ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Número de Vitórias:");

        txtvit2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        q9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q9ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Empates:");

        q4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4ActionPerformed(evt);
            }
        });

        txtemp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        q5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q5ActionPerformed(evt);
            }
        });

        btnovo.setText("Nova Partida");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });

        btnsair.setText("Sair do Jogo");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        q2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q6ActionPerformed(evt);
            }
        });

        q7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        q7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Jogo da Velha");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Jogador 1:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Símbolo: X");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Número de Vitórias:");

        txtvit1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Jogador 2:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Símbolo: O");

        jog2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jog1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        fim.setText("Finalizar Partida");
        fim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fimActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Lista de Campeonatos para Competição");

        novo.setText("Novo Campeonato");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        camp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camp, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtemp, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jog2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtvit2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnsair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jog1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtvit1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {q1, q2, q3, q4, q5, q6, q7, q8, q9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(camp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtvit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(btnovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fim)
                        .addGap(11, 11, 11)
                        .addComponent(novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsair)))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {q1, q2, q3, q4, q5, q6, q7, q8, q9});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        if(verificacampos() && !verificapontos() || !verificanomes())
               {
                  this.dispose(); 
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "É preciso Finalizar partida antes de sair!");
               }
        
    }//GEN-LAST:event_btnsairActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            {    
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {

                    if(q2.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q2.setText("X");
                                a=q2.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q2.setText("O");
                                a=q2.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }


                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
    }//GEN-LAST:event_q2ActionPerformed

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            { 

        
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {

                    if(q1.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q1.setText("X");
                                a=q1.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q1.setText("O");
                                a=q1.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }


                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
            
            
    }//GEN-LAST:event_q1ActionPerformed

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
        String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        
        
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            {
        
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {

                    if(q3.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q3.setText("X");
                                a=q3.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q3.setText("O");
                                a=q3.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }




                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
    }//GEN-LAST:event_q3ActionPerformed

    private void q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4ActionPerformed
        String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            { 
        
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {

                    if(q4.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q4.setText("X");
                                a=q4.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q4.setText("O");
                                a=q4.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }




                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
    }//GEN-LAST:event_q4ActionPerformed

    private void q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q5ActionPerformed
        String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            { 
        
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {

                    if(q5.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q5.setText("X");
                                a=q5.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q5.setText("O");
                                a=q5.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }


                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
    }//GEN-LAST:event_q5ActionPerformed

    private void q6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q6ActionPerformed
        String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            { 
        
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {

                    if(q6.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q6.setText("X");
                                a=q6.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q6.setText("O");
                                a=q6.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }



                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
                
             
    }//GEN-LAST:event_q6ActionPerformed

    private void q7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q7ActionPerformed
        String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            { 
        
        
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {

                    if(q7.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q7.setText("X");
                                a=q7.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q7.setText("O");
                                a=q7.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }



                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
    }//GEN-LAST:event_q7ActionPerformed

    private void q8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q8ActionPerformed
        String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            { 
        
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {

                    if(q8.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q8.setText("X");
                                a=q8.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q8.setText("O");
                                a=q8.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }




                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
    }//GEN-LAST:event_q8ActionPerformed

    private void q9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q9ActionPerformed
       String a;
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        
        
        if(camp.getSelectedItem()!=null)
        {  
            if(jog1.getSelectedItem()!=null && jog2.getSelectedItem()!=null)
            { 
        
                if(jgr1.getNome().equals(jgr2.getNome()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Esses nomes de jogadores são iguais, "
                            + "por favor selecione um nome de jogador diferente");
                }
                else
                {
                    if(q9.getText().equals(""))
                    {

                        if(jr1==true)
                        {
                                q9.setText("X");
                                a=q9.getText();
                                jogadorganhador(a,jgr1);
                                jr1=false;
                                jr2=true;


                        }
                        else
                        {

                                q9.setText("O");
                                a=q9.getText();
                                jogadorganhador(a,jgr2);
                                jr1=true;
                                jr2=false;


                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Esse campo já está marcado, por favor"
                                + " selecione outro campo vazio!!");
                    }




                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Algum nome dos jogadores não foi selecionado, está em branco"
                        + ", por favor seleciona um nome de um jogador para poder começar jogar! ");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "É preciso escolher um campeonato para poder jogar!");
        }
    }//GEN-LAST:event_q9ActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
               if(verificacampos() && !verificapontos())
               {
                  limpargeral(); 
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "É preciso Finalizar partida antes de uma nova!");
               }
                
    }//GEN-LAST:event_btnovoActionPerformed

    private void fimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fimActionPerformed
                
        if(verificapontos() && verificacampos() && verificanomes())
        {
                Colocacao col=new Colocacao();
                Velhadao dao=new Velhadao();
                String vit11=txtvit1.getText().trim();
                String vit22=txtvit2.getText().trim();
                int vit1;
                int vit2;
                if(vit11.isEmpty())
                { 
                  vit11=""+0;
                }
                if(vit22.isEmpty())
                { 
                  vit22=""+0;
                }
                vit1=Integer.parseInt(vit11);
                vit2=Integer.parseInt(vit22);

                Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
                Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
                Campeonatos cam=(Campeonatos)camp.getSelectedItem();

                if(vit1 > vit2)
                {
                    col.setJogador(jgr1);
                    col.setCampeonato(cam);
                    dao.adicionar(col);
                    limpargeral();
                }
                else if(vit1 < vit2)
                {
                    col.setJogador(jgr2);
                    col.setCampeonato(cam);
                    dao.adicionar(col);
                    limpargeral();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Os 2 jogadores teve empate de pontos de vitórias,"
                            + " e não pode ser finalizada a partida até que um jogador tenha mais vitória"
                            + " do que o outro para entrar na Colocação do Campeonato!!");
                }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Não é possivel finalizar partida sem antes de jogarem até o fim!");
        }
        
    }//GEN-LAST:event_fimActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
            
            if(verificacampos() && !verificapontos())
               {
                    q1.setText("");
                    q2.setText("");
                    q3.setText("");
                    q4.setText("");
                    q5.setText("");
                    q6.setText("");
                    q7.setText("");
                    q8.setText("");
                    q9.setText("");
                    carregajogadores();
                    carregajogadores2();
                    carregarcampeonatos();
                    txtvit1.setText("");
                    txtvit2.setText("");
                    txtemp.setText("");
                    vit1=0;
                    vit2=0;
                    emp=0; 
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "É preciso Finalizar partida antes de um novo campeonato!");
               }
         
    }//GEN-LAST:event_novoActionPerformed
    public boolean verificanomes()
    {
        Jogadores jgr1=(Jogadores)jog1.getSelectedItem();
        Jogadores jgr2=(Jogadores)jog2.getSelectedItem();
        Campeonatos cam=(Campeonatos)camp.getSelectedItem();
        
        if(cam!=null && jgr1!=null && jgr2!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean verificacampos()
    {
        if(q1.getText().equals("") && q2.getText().equals("") && q3.getText().equals("") 
                && q4.getText().equals("") && q5.getText().equals("")
                && q6.getText().equals("") && q7.getText().equals("") 
                && q8.getText().equals("") && q9.getText().equals(""))
        {
        
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean verificapontos()
    {
        String vit11=txtvit1.getText().trim();
        String vit22=txtvit2.getText().trim();
        String emp11=txtemp.getText().trim();
        int vit1;
        int vit2;
        int emp1;
        if(vit11.isEmpty())
        { 
          vit11=""+0;
        }
        if(vit22.isEmpty())
        { 
          vit22=""+0;
        }
        if(emp11.isEmpty())
        { 
          emp11=""+0;
        }
        vit1=Integer.parseInt(vit11);
        vit2=Integer.parseInt(vit22);
        emp1=Integer.parseInt(emp11);
        
        if(vit1>0 || vit2>0 || emp1>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogodaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogodaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogodaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogodaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogodaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btnsair;
    private javax.swing.JComboBox<Campeonatos> camp;
    private javax.swing.JButton fim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<Jogadores> jog1;
    private javax.swing.JComboBox<Jogadores> jog2;
    private javax.swing.JButton novo;
    private javax.swing.JButton q1;
    private javax.swing.JButton q2;
    private javax.swing.JButton q3;
    private javax.swing.JButton q4;
    private javax.swing.JButton q5;
    private javax.swing.JButton q6;
    private javax.swing.JButton q7;
    private javax.swing.JButton q8;
    private javax.swing.JButton q9;
    private javax.swing.JTextField txtemp;
    private javax.swing.JTextField txtvit1;
    private javax.swing.JTextField txtvit2;
    // End of variables declaration//GEN-END:variables

   
}
