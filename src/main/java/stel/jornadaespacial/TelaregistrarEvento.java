/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stel.jornadaespacial;
import javax.swing.DefaultListCellRenderer;
import java.awt.Component;
import javax.swing.JList;
/**
 *
 * @author user
 */
public class TelaregistrarEvento extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaregistrarEvento() {
        initComponents();
        jTextFieldEventName.setBackground(new java.awt.Color(0,0,0,1));
        jTextDInicio.setBackground(new java.awt.Color(0,0,0,1));
        jTextHInicio.setBackground(new java.awt.Color(0,0,0,1));
        jTextDT.setBackground(new java.awt.Color(0,0,0,1));
        jTextHT.setBackground(new java.awt.Color(0,0,0,1));
        jTextDInsc.setBackground(new java.awt.Color(0,0,0,1));
        jTextDTInsc.setBackground(new java.awt.Color(0,0,0,1));     
        jTextOrg.setBackground(new java.awt.Color(0,0,0,1));        
               
        jComboBox1.setBackground(new java.awt.Color(0,0,0,1));
        jComboBox1.setRenderer(new DefaultListCellRenderer() {
            @Override
    public Component getListCellRendererComponent(
        JList<?> list, Object value, int index,
        boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); 
        if (!isSelected) {
            setBackground(new java.awt.Color(90,90,90));
            setForeground(new java.awt.Color(255, 206, 0)); // Cor da fonte para itens não selecionados
        } else {
            setBackground(new java.awt.Color(90,90,90));
            setForeground(java.awt.Color.BLACK); // Cor da fonte para item selecionado
        } 
        return this;
    }
});
        jComboBox2.setBackground(new java.awt.Color(0,0,0,1));
        jComboBox2.setRenderer(new DefaultListCellRenderer() {
            @Override
    public Component getListCellRendererComponent(
        JList<?> list, Object value, int index,
        boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (!isSelected) {
            setBackground(new java.awt.Color(90,90,90));
            setForeground(new java.awt.Color(255, 206, 0)); // Cor da fonte para itens não selecionados
        } else {
            setBackground(new java.awt.Color(90,90,90));
            setForeground(java.awt.Color.BLACK); // Cor da fonte para item selecionado
        }
        return this;
    }
});
        
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        
        jSendImage.setBackground(new java.awt.Color(0,0,0,1));
      
        jTextDesc.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDesc = new javax.swing.JTextArea();
        jLabelRegisterEventImage = new javax.swing.JLabel();
        jLabelEventname = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelPassword3 = new javax.swing.JLabel();
        jDataInicio = new javax.swing.JLabel();
        jHoraInicio = new javax.swing.JLabel();
        jTextDInicio = new javax.swing.JTextField();
        jTextHInicio = new javax.swing.JTextField();
        jTextHT = new javax.swing.JTextField();
        jTextDT = new javax.swing.JTextField();
        jLabel_____5 = new javax.swing.JLabel();
        jLabel_____6 = new javax.swing.JLabel();
        jLabel_____3 = new javax.swing.JLabel();
        jLabel_____4 = new javax.swing.JLabel();
        jPanelExit = new javax.swing.JPanel();
        ExitButton = new javax.swing.JLabel();
        jLabel_____1 = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jIconSendImage = new javax.swing.JLabel();
        jSendImage = new javax.swing.JLabel();
        jLabelImagemCadastro = new javax.swing.JLabel();
        jTextFieldEventName = new javax.swing.JTextField();
        jDInsc = new javax.swing.JLabel();
        jTextDInsc = new javax.swing.JTextField();
        jTextDTInsc = new javax.swing.JTextField();
        jTextOrg = new javax.swing.JTextField();
        jLabel_____7 = new javax.swing.JLabel();
        jLabelPassword1 = new javax.swing.JLabel();
        jLabel_____8 = new javax.swing.JLabel();
        jHoraInicio2 = new javax.swing.JLabel();
        jLabel_____9 = new javax.swing.JLabel();
        jHoraInicio3 = new javax.swing.JLabel();
        jHoraInicio4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        FundoImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextDesc.setBackground(new java.awt.Color(0, 0, 0));
        jTextDesc.setColumns(20);
        jTextDesc.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextDesc.setForeground(new java.awt.Color(255, 206, 0));
        jTextDesc.setRows(5);
        jTextDesc.setAutoscrolls(false);
        jTextDesc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jScrollPane1.setViewportView(jTextDesc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 410, 250));

        jLabelRegisterEventImage.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRegisterEventImage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegisterEventImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegisterEventImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cadastar_evento.png"))); // NOI18N
        getContentPane().add(jLabelRegisterEventImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 950, -1));

        jLabelEventname.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEventname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEventname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Nome_evento.png"))); // NOI18N
        jLabelEventname.setMaximumSize(new java.awt.Dimension(188, 25));
        jLabelEventname.setMinimumSize(new java.awt.Dimension(188, 25));
        getContentPane().add(jLabelEventname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, 30));

        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/até.png"))); // NOI18N
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 50, 30));

        jLabelPassword3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/até.png"))); // NOI18N
        getContentPane().add(jLabelPassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 50, 30));

        jDataInicio.setForeground(new java.awt.Color(255, 255, 255));
        jDataInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDataInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Data_inicio.png"))); // NOI18N
        getContentPane().add(jDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 120, 30));

        jHoraInicio.setForeground(new java.awt.Color(255, 255, 255));
        jHoraInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHoraInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Hora_inicio.png"))); // NOI18N
        getContentPane().add(jHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 120, 30));

        jTextDInicio.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextDInicio.setForeground(new java.awt.Color(255, 206, 0));
        jTextDInicio.setToolTipText("");
        jTextDInicio.setBorder(null);
        jTextDInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 80, 30));

        jTextHInicio.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextHInicio.setForeground(new java.awt.Color(255, 206, 0));
        jTextHInicio.setBorder(null);
        jTextHInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextHInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 80, 30));

        jTextHT.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextHT.setForeground(new java.awt.Color(255, 206, 0));
        jTextHT.setBorder(null);
        jTextHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHTActionPerformed(evt);
            }
        });
        getContentPane().add(jTextHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 80, 30));

        jTextDT.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextDT.setForeground(new java.awt.Color(255, 206, 0));
        jTextDT.setToolTipText("");
        jTextDT.setBorder(null);
        jTextDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDTActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 80, 30));

        jLabel_____5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____5.setText("_______________________");
        getContentPane().add(jLabel_____5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 90, 30));

        jLabel_____6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____6.setText("_______________________");
        getContentPane().add(jLabel_____6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 90, 30));

        jLabel_____3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____3.setText("_______________________");
        getContentPane().add(jLabel_____3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 90, 30));

        jLabel_____4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____4.setText("_______________________");
        getContentPane().add(jLabel_____4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 90, 30));

        jPanelExit.setBackground(new java.awt.Color(0, 0, 0));
        jPanelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close.png"))); // NOI18N
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });
        jPanelExit.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        getContentPane().add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 40, 40));

        jLabel_____1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_____1.setText("____________________________________________________________________");
        getContentPane().add(jLabel_____1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 340, 30));

        jButtonEnviar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enviar_jornada.png"))); // NOI18N
        jButtonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, 40));

        jIconSendImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enviar_imagem.png"))); // NOI18N
        getContentPane().add(jIconSendImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 100, 110));

        jSendImage.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        jSendImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jSendImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 160, 150));

        jLabelImagemCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Descrição.png"))); // NOI18N
        jLabelImagemCadastro.setMaximumSize(new java.awt.Dimension(188, 25));
        jLabelImagemCadastro.setMinimumSize(new java.awt.Dimension(188, 25));
        getContentPane().add(jLabelImagemCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        jTextFieldEventName.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextFieldEventName.setForeground(new java.awt.Color(255, 206, 0));
        jTextFieldEventName.setBorder(null);
        jTextFieldEventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEventNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 340, 30));

        jDInsc.setForeground(new java.awt.Color(255, 255, 255));
        jDInsc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDInsc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Data_inscrição.png"))); // NOI18N
        getContentPane().add(jDInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 160, 30));

        jTextDInsc.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextDInsc.setForeground(new java.awt.Color(255, 206, 0));
        jTextDInsc.setToolTipText("");
        jTextDInsc.setBorder(null);
        jTextDInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDInscActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 80, 30));

        jTextDTInsc.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextDTInsc.setForeground(new java.awt.Color(255, 206, 0));
        jTextDTInsc.setToolTipText("");
        jTextDTInsc.setBorder(null);
        jTextDTInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDTInscActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDTInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 80, 30));

        jTextOrg.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextOrg.setForeground(new java.awt.Color(255, 206, 0));
        jTextOrg.setToolTipText("");
        jTextOrg.setBorder(null);
        jTextOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOrgActionPerformed(evt);
            }
        });
        getContentPane().add(jTextOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 360, 30));

        jLabel_____7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____7.setText("_______________________");
        getContentPane().add(jLabel_____7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 90, 30));

        jLabelPassword1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/até.png"))); // NOI18N
        getContentPane().add(jLabelPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 50, 30));

        jLabel_____8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____8.setText("_______________________");
        getContentPane().add(jLabel_____8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 90, 30));

        jHoraInicio2.setForeground(new java.awt.Color(255, 255, 255));
        jHoraInicio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHoraInicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Modalidade.png"))); // NOI18N
        getContentPane().add(jHoraInicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 130, 30));

        jLabel_____9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____9.setText("_________________________________________________________________________");
        getContentPane().add(jLabel_____9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 360, 30));

        jHoraInicio3.setForeground(new java.awt.Color(255, 255, 255));
        jHoraInicio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHoraInicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/organizado_por.png"))); // NOI18N
        getContentPane().add(jHoraInicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 30));

        jHoraInicio4.setForeground(new java.awt.Color(255, 255, 255));
        jHoraInicio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHoraInicio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Categoria.png"))); // NOI18N
        getContentPane().add(jHoraInicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 110, 30));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 206, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setToolTipText("");
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 160, 30));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 206, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 160, 30));

        FundoImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FundoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fundo Estrelado2.png"))); // NOI18N
        FundoImage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(FundoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 510));

        setSize(new java.awt.Dimension(950, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
       System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          for(double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            } catch(Exception e){
            
        }
    }    
    }//GEN-LAST:event_formWindowOpened

    private void jTextHInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHInicioActionPerformed

    private void jTextDInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDInicioActionPerformed

    private void jTextHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHTActionPerformed

    private void jTextDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDTActionPerformed

    private void jTextFieldEventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEventNameActionPerformed

    private void jTextDInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDInscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDInscActionPerformed

    private void jTextDTInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDTInscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDTInscActionPerformed

    private void jTextOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOrgActionPerformed

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
            java.util.logging.Logger.getLogger(TelaregistrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaregistrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaregistrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaregistrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaregistrarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel FundoImage;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jDInsc;
    private javax.swing.JLabel jDataInicio;
    private javax.swing.JLabel jHoraInicio;
    private javax.swing.JLabel jHoraInicio2;
    private javax.swing.JLabel jHoraInicio3;
    private javax.swing.JLabel jHoraInicio4;
    private javax.swing.JLabel jIconSendImage;
    private javax.swing.JLabel jLabelEventname;
    private javax.swing.JLabel jLabelImagemCadastro;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelPassword3;
    private javax.swing.JLabel jLabelRegisterEventImage;
    private javax.swing.JLabel jLabel_____1;
    private javax.swing.JLabel jLabel_____3;
    private javax.swing.JLabel jLabel_____4;
    private javax.swing.JLabel jLabel_____5;
    private javax.swing.JLabel jLabel_____6;
    private javax.swing.JLabel jLabel_____7;
    private javax.swing.JLabel jLabel_____8;
    private javax.swing.JLabel jLabel_____9;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSendImage;
    private javax.swing.JTextField jTextDInicio;
    private javax.swing.JTextField jTextDInsc;
    private javax.swing.JTextField jTextDT;
    private javax.swing.JTextField jTextDTInsc;
    private javax.swing.JTextArea jTextDesc;
    private javax.swing.JTextField jTextFieldEventName;
    private javax.swing.JTextField jTextHInicio;
    private javax.swing.JTextField jTextHT;
    private javax.swing.JTextField jTextOrg;
    // End of variables declaration//GEN-END:variables
}