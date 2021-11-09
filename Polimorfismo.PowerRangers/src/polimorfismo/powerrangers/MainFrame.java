package polimorfismo.powerrangers;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Random;

public class MainFrame extends javax.swing.JFrame {
    
    int random;
    
    Vector <String> cp;
    RangerNovo newb = new RangerNovo();

    
    public MainFrame() {
        initComponents();
        cp = new Vector<String>();
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonMorfar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButtonCriar = new javax.swing.JButton();
        jButtonAdmirar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonPilot = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonPapo = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButtonArma = new javax.swing.JButton();
        jButtonChute = new javax.swing.JButton();
        jButtonSoco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Crie o seu Ranger!");

        jLabel3.setText("Cor:");

        jButtonMorfar.setText("Morfar!");
        jButtonMorfar.setToolTipText("A melhor parte de ser um Ranger!");
        jButtonMorfar.setEnabled(false);
        jButtonMorfar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMorfarActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jTextField1.setToolTipText("Informe o nome do seu Ranger...");

        jLabel5.setText("Nome:");

        jTextField2.setToolTipText("Escolha uma cor qualquer para seu Ranger...");

        jButtonCriar.setText("Criar!");
        jButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarActionPerformed(evt);
            }
        });

        jButtonAdmirar.setText("Admirar a beleza");
        jButtonAdmirar.setEnabled(false);
        jButtonAdmirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmirarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonPilot.setText("Pilotar");
        jButtonPilot.setEnabled(false);
        jButtonPilot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPilotActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Zord:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ações");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Padrão:");

        jButtonPapo.setText("Bater papo");
        jButtonPapo.setToolTipText("Converse com um de seus aliados...");
        jButtonPapo.setEnabled(false);
        jButtonPapo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPapoActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar ao normal");
        jButtonVoltar.setToolTipText("Volte a como você era antes de morfar...");
        jButtonVoltar.setEnabled(false);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Batalha:");

        jButtonArma.setText("Arma");
        jButtonArma.setToolTipText("Dispare contra um inimigo...");
        jButtonArma.setEnabled(false);
        jButtonArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArmaActionPerformed(evt);
            }
        });

        jButtonChute.setText("Chute");
        jButtonChute.setEnabled(false);
        jButtonChute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChuteActionPerformed(evt);
            }
        });

        jButtonSoco.setText("Soco");
        jButtonSoco.setToolTipText("A forma mais básica de combate");
        jButtonSoco.setEnabled(false);
        jButtonSoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jButtonCriar)))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonPilot)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonMorfar)
                                    .addComponent(jButtonArma))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonChute)
                                    .addComponent(jButtonPapo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdmirar)
                            .addComponent(jButtonVoltar)
                            .addComponent(jButtonSoco))
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPilot)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonAdmirar)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButtonMorfar)
                            .addComponent(jButtonPapo)
                            .addComponent(jButtonVoltar))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jButtonArma)
                            .addComponent(jButtonChute)
                            .addComponent(jButtonSoco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCriar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMorfarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMorfarActionPerformed
        
        
        newb.setNome(jTextField1.getText());
        newb.setCor(jTextField2.getText());
        newb.morfar();
        cp.add("-");
        cp.add("-");
        cp.add("Rangers! Está na hora de morfar!!");
        jList1.setListData(cp);
        
        
        
        
        //ativa os botões de batalha
        jButtonPilot.setEnabled(true);
        jButtonVoltar.setEnabled(true);
        jButtonArma.setEnabled(true);
        jButtonChute.setEnabled(true);
        jButtonSoco.setEnabled(true);
        
        //desativa os botões passivos de Zord e bate papo
        jButtonLimpar.setEnabled(false);
        jButtonAdmirar.setEnabled(false);
        jButtonPapo.setEnabled(false);
        jButtonMorfar.setEnabled(false);
        
        
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(9) + 1;
        System.out.println("Número gerado: " + valor);
        cp.add("-");
        cp.add("-");
        jList1.setListData(cp);
        
        switch (valor){
            case 1:
                cp.add("Você morfa e vai à fronteira da cidade, vários seres desconhecidos começam a te atacar assim que te veem, aja rapidamente!");
                jList1.setListData(cp);
                break;
            case 2:
                cp.add("Você morfa e vai à fronteira da cidade, não há nenhum monstro à primeira vista, mas eles te emboscam quando ocê menos espera! Qual o plano agora?");
                jList1.setListData(cp);
                break;
            case 3:
                cp.add("Você morfa e vai à represa da cidade, existem monstros que planejam envenenar a água, você deve tomar uma decisão rapidamente!");
                jList1.setListData(cp);
                break;
            case 4:
                cp.add("Você morfa e vai ao centro da cidade, você encontra Mesogog comandando uma legião de monstros para atacar os civis e criar o caos, o que você fará?");
                jList1.setListData(cp);
                break;
            case 5:
                cp.add("Você morfa e vai ao centro da cidade, você encontra o famoso Lorde Zedd comandando uma legião de monstros, qual a sua decisão?");
                jList1.setListData(cp);
                break;
                
            case 6:
                cp.add("Você morfa e vai ao hospital da cidade, os monstros decidiram roubar as vacinas de COVID, você deve protegê-las, o que fará?");
                jList1.setListData(cp);
                break;
            case 7:
                cp.add("Você morfa e vai a uma estação de metrô próxima, um poderoso monstro foi avistado por perto, o que você fará?");
                jList1.setListData(cp);
                break;
            case 8:
                cp.add("Você morfa e sai da cidade, indo à zona rural e encontrando vários monstros atacando o gado de uma fazenda, você decide:");
                jList1.setListData(cp);
                break;
            case 9:
                cp.add("Você morfa e sai da cidade, existem vários monstros bloqueando as entradas principais, o que você fará?");
                jList1.setListData(cp);
                break;
        }
        
        
        
        
        
    }//GEN-LAST:event_jButtonMorfarActionPerformed

    private void jButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarActionPerformed
        
        //Ativa os outros botões.
        jButtonAdmirar.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonMorfar.setEnabled(true);
        jButtonPapo.setEnabled(true);
        jButtonCriar.setEnabled(false);
        
        
        newb.setNome(jTextField1.getText());
        newb.setCor(jTextField2.getText());
        cp.add("Seja bem-vindo ao grupo "+ newb.getNome() + "!!");
        cp.add("Você recebeu seu dispositivo Ranger, com ele é permitido morfar para o Ranger " + newb.getCor() + " para sair em missões");
        cp.add("Como um iniciante ao grupo, seu primeiro Megazord será o Galinhossauro");
        cp.add("Sua aventura como um Ranger começa agora, você pode batalhar, conversar com seus colegas,");
        cp.add("chamar seu Megazord, limpá-lo e até mesmo sentar e admirar sua beleza!");
        jList1.setListData(cp);
        
    }//GEN-LAST:event_jButtonCriarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(3) + 1;
        System.out.println("Número gerado: " + valor);
        cp.add("-");
        cp.add("-");
        jList1.setListData(cp);
        
        switch (valor){
            case 1:
                cp.add("O Galinhossauro nunca esteve tão brilhante!");
                jList1.setListData(cp);
                break;
            case 2:
                cp.add("A bela cor " + newb.getCor() + " da armadura de seu Zord reluz como um diamante polido.");
                jList1.setListData(cp);
                break;
            case 3:
                cp.add("Limpo, cheiroso e polido, pronto para o combate!");
                jList1.setListData(cp);
                break;
        }
        
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        
        //reverte todos os botões de morfar
        jButtonVoltar.setEnabled(false);
        jButtonArma.setEnabled(false);
        jButtonChute.setEnabled(false);
        jButtonSoco.setEnabled(false);
        
        //desativa os botões passivos de Zord e bate papo
        jButtonAdmirar.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonPilot.setEnabled(false);
        jButtonPapo.setEnabled(true);
        jButtonMorfar.setEnabled(true);
        
        
        //Texto para a list
        cp.add("-");
        cp.add("-");
        cp.add("Você recua da ação e reverte a transformação, com a certeza de que fez um bom trabalho. Não é?");
        jList1.setListData(cp);
        
        
        
        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonPapoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPapoActionPerformed
        
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(5) + 1;
        System.out.println("Número gerado: " + valor);
        cp.add("-");
        cp.add("-");
        jList1.setListData(cp);
        
        switch (valor){
            case 1:
                cp.add("Você encontra o Ranger Preto, que te oferece um copo de café, você bebe tudo e se sente acordado.");
                jList1.setListData(cp);
                break;
            case 2:
                cp.add("Você encontra o Ranger Vermelho, ele te dá uma lição bem longa sobre a história dos rangers, é bem entediante...");
                jList1.setListData(cp);
                break;
            case 3:
                cp.add("Você encontra o Ranger Azul, ele parece meio frio e aconversa não avança, você se sente intimidado...");
                jList1.setListData(cp);
                break;
            case 4:
                cp.add("Você encontra a Ranger Amarelo, sua energia é contagiante e te faz sentir bem animado!");
                jList1.setListData(cp);
                break;
            case 5:
                cp.add("Você encontra a Ranger Rosa, ela te leva em um tour pela base, você se sente cansado mas ansioso pela próxima missão.");
                jList1.setListData(cp);
                break;
        }
        
        
    }//GEN-LAST:event_jButtonPapoActionPerformed

    private void jButtonPilotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPilotActionPerformed
        
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(4) + 1;
        System.out.println("Número gerado: " + valor);
        cp.add("-");
        cp.add("-");
        jList1.setListData(cp);
        
        switch (valor){
            case 1:
                cp.add("Você entra no Galinhossauro, mas logo ao entrar seus oponentes fogem com medo, você decide voltar ao normal e informar seu sucesso aos outros.");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
            case 2:
                cp.add("Ao entrar no seu Megazord Galinhossauro, uma batalha épica acontece em seguida, seus inimigos são fortes mas você sai vitorioso, retornando à base logo em seguida");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
            case 3:
                cp.add("No controle de seu Megazord, o grande " + newb.getNome() + " aterroriza seus oponentes, que então batem em retirada, você retorna à base com o peito estufado de orgulho");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
            case 4:
                cp.add("Entrando no seu Megazord, você se sente seguro mas o oponente é poderoso e você é inexperiente, a batalha é perdida em questão de instantes, mas você se sente motivado a melhorar");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
        }
        
        
        
    }//GEN-LAST:event_jButtonPilotActionPerformed

    private void jButtonAdmirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmirarActionPerformed
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(2) + 1;
        System.out.println("Número gerado: " + valor);
        cp.add("-");
        cp.add("-");
        jList1.setListData(cp);
        
        switch (valor){
            case 1:
                cp.add("Realmente, o Galinhossauro pode parecer um nome ruim, mas é uma máquina bonita e destruidora,");
                jList1.setListData(cp);
                break;
            case 2:
                cp.add("Seu primeiro Zord pareceu um pouco patético, mas com o tempo perceberá que ele é um valioso aliado.");
                jList1.setListData(cp);
                break;
        }
    }//GEN-LAST:event_jButtonAdmirarActionPerformed

    private void jButtonArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArmaActionPerformed

        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(4) + 1;
        System.out.println("Número gerado: " + valor);
        cp.add("-");
        cp.add("-");
        jList1.setListData(cp);
        
        switch (valor){
            case 1:
                cp.add("Engatilhando sua arma e disparando nos inimigos com maestria, todos caem a seus pés, é uma vitória absoluta e fácil para " + newb.getNome());
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
            case 2:
                cp.add("Você dispara nos seus inimigos da forma mais rápida possível, mas eles parecem não sentir muito dano, o que fará agora?");
                jList1.setListData(cp);
                break;
            case 3:
                cp.add("Com arma em mãos você atira nos seus oponentes, eles ficam mais fracos mas ainda tem força para lutar, e agora?");
                jList1.setListData(cp);
                break;
            case 4:
                cp.add("Sua arma escorrega da sua mão, bate no chão e aciona o gatilho, disparando contra seu peito e te deixando inconsciente, os monstros te levam ao hospital só de dó.");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
        }     
                
                
    }//GEN-LAST:event_jButtonArmaActionPerformed

    private void jButtonChuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChuteActionPerformed
        
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(4) + 1;
        System.out.println("Número gerado: " + valor);
        cp.add("-");
        cp.add("-");
        jList1.setListData(cp);
        
        switch (valor){
            case 1:
                cp.add("Anos de kick-boxing te levaram ao ápice do combate com pernas, destruindo as forças inimigas e os fazendo recuar com medo, mais um dia de trabalho satisfatório.");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
            case 2:
                cp.add("Usando suas pernas e técnicas de luta, você imobiliza e derrota alguns, porém mais continuam a aparecer, o que fazer agora?");
                jList1.setListData(cp);
                break;
            case 3:
                cp.add("Com chutes fortes e velozes você consegue derrotar os inimigos mais fracos, mas os mais fortes estão se reunindo para o contra-ataque, qual seu próximo golpe?");
                jList1.setListData(cp);
                break;
            case 4:
                cp.add("Você se afasta e prepara uma voadora para derrotar o inimigo mais poderoso, porém ele é habilidoso e te nocauteia com um golpe, você acorda na sua base, os outros Rangers te resgataram.");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
        }  
        
        
    }//GEN-LAST:event_jButtonChuteActionPerformed

    private void jButtonSocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSocoActionPerformed
        
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(4) + 1;
        System.out.println("Número gerado: " + valor);
        cp.add("-");
        cp.add("-");
        jList1.setListData(cp);
        
        switch (valor){
            case 1:
                cp.add("Com punhos velozes e certeiros, você parece com um relâmpago de cor " + newb.getCor() + " que esmaga seus adversários, você retorna ao normal e volta para casa, orgulhoso.");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
            case 2:
                cp.add("Lutando mano a mano com seus oponentes, eles caem um após o outro mas não param de aparecer, talvez seja hora de outra estratégia?");
                jList1.setListData(cp);
                break;
            case 3:
                cp.add("Seus socos derrubam vários dos montros menores e mais fragéis, porém outros maiores estão se aproximando, o que fazer agora?");
                jList1.setListData(cp);
                break;
            case 4:
                cp.add("Ao tentar socar o monstro mais forte, ele segura seu braço e te arremessa ao chão, você percebe que os outros rangers chegam para te salvar antes que o grandalhão te finalize.");
                jList1.setListData(cp);
                jButtonVoltar.doClick();
                break;
        }  
        
        
    }//GEN-LAST:event_jButtonSocoActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmirar;
    private javax.swing.JButton jButtonArma;
    private javax.swing.JButton jButtonChute;
    private javax.swing.JButton jButtonCriar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMorfar;
    private javax.swing.JButton jButtonPapo;
    private javax.swing.JButton jButtonPilot;
    private javax.swing.JButton jButtonSoco;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
