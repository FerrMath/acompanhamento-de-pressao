/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atividade4.views;

import atividade4.erros.ErrorManeger;
import atividade4.logica.Formulario;
import atividade4.logica.FormularioCSV;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ma_fe
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        addAcessibility();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        dataLbl = new javax.swing.JLabel();
        dataTF = new javax.swing.JFormattedTextField();
        horaLbl = new javax.swing.JLabel();
        pressDiasLbl = new javax.swing.JLabel();
        pressSistLbl = new javax.swing.JLabel();
        horaTF = new javax.swing.JFormattedTextField();
        presSistTF = new javax.swing.JTextField();
        presDiasTF = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        estressCB = new javax.swing.JCheckBox();
        registrarBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de pressão");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true), "Formulário de pressão", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        dataLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dataLbl.setLabelFor(dataTF);
        dataLbl.setText("Data:");

        dataTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dataTF.setToolTipText("Ex. data: 23/03/2023");
        dataTF.setNextFocusableComponent(horaTF);

        horaLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        horaLbl.setLabelFor(horaTF);
        horaLbl.setText("Hora:");

        pressDiasLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pressDiasLbl.setLabelFor(presDiasTF);
        pressDiasLbl.setText("Pressão diastólica:");

        pressSistLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pressSistLbl.setLabelFor(presSistTF);
        pressSistLbl.setText("Pressão sistólica:");

        horaTF.setToolTipText("Ex. hora: 18:53");
        horaTF.setNextFocusableComponent(presSistTF);

        presSistTF.setToolTipText("Ex: 125");
        presSistTF.setNextFocusableComponent(presDiasTF);

        presDiasTF.setToolTipText("Ex: 83");
        presDiasTF.setNextFocusableComponent(estressCB);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Situação de estresse?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        jLayeredPane3.setToolTipText("Marque se estava em situação de estresse");

        estressCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estressCB.setText("Sim, estava em situação de estresse.");
        estressCB.setNextFocusableComponent(clearBtn);

        jLayeredPane3.setLayer(estressCB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estressCB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estressCB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        estressCB.getAccessibleContext().setAccessibleName("Estava em estado de estresse?");
        estressCB.getAccessibleContext().setAccessibleDescription("Caixa de marcar em caso de sistuação de estresse");

        registrarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registrarBtn.setText("Registrar");
        registrarBtn.setToolTipText("Adicionar registro de pressão");
        registrarBtn.setNextFocusableComponent(clearBtn);
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearBtn.setText("Limpar formulario");
        clearBtn.setToolTipText("Limpar o formulário e começar novamente");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(dataLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(dataTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(horaLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pressDiasLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pressSistLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(horaTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(presSistTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(presDiasTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(registrarBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(clearBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(horaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(dataLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pressSistLbl)
                            .addComponent(pressDiasLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(presDiasTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(presSistTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horaTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane3)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pressSistLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presSistTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pressDiasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presDiasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        dataTF.getAccessibleContext().setAccessibleName("Campo formulario para data.");
        horaTF.getAccessibleContext().setAccessibleName("Campo formulario para hora.");
        presSistTF.getAccessibleContext().setAccessibleName("Campo formulario  para pressão sistólica.");
        presDiasTF.getAccessibleContext().setAccessibleName("Campo formulario  para pressão diastólica.");
        registrarBtn.getAccessibleContext().setAccessibleName("Botão de registro");
        clearBtn.getAccessibleContext().setAccessibleName("Botão de limpar formulário");

        jLayeredPane2.setBackground(new java.awt.Color(102, 102, 102));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true), "Histórico de registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        tabela.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23/09/2023", "23:14", "85", "123", "Não"}
            },
            new String [] {
                "Data", "Hora", "Pres. Sistó.", "Pres. Diast.", "Sit. Estresse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabela.setRowHeight(30);
        tabela.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jScrollPane1.setViewportView(tabela);
        tabela.getAccessibleContext().setAccessibleName("tabela de histórico");
        tabela.getAccessibleContext().setAccessibleDescription("Tabela com os registros anteriores de pressão");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelPrincipal.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelPrincipal.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2))
                .addGap(115, 115, 115))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2)
                .addGap(16, 16, 16))
        );

        jLayeredPane1.getAccessibleContext().setAccessibleName("Formulario de pressao");
        jLayeredPane1.getAccessibleContext().setAccessibleDescription("Formulario para registrar os dados de histórico de pressão");
        jLayeredPane2.getAccessibleContext().setAccessibleDescription("Tabela de registros feitos através do formulario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void addAcessibility(){
        registrarBtn.setMnemonic(KeyEvent.VK_ENTER);
        clearBtn.setMnemonic(KeyEvent.VK_C);
    }
    
    private void limparFormulario(){
        dataTF.setText("");
        horaTF.setText("");
        presDiasTF.setText("");
        presSistTF.setText("");
        estressCB.setSelected(false);
        
        dataTF.requestFocus();
    }
    

    private boolean registrarFormulario(){
        // Pega os dados dos campos de texto do formulario
        String data = dataTF.getText();
        String hora = horaTF.getText();
        String pressS = presSistTF.getText();
        String pressD = presDiasTF.getText();
        boolean estresse = estressCB.isSelected();
        
        // Verifica se os dados são aceitaveis
        if (ErrorManeger.temCampoVazio(data,hora,pressS,pressD)) return false;
        else if (ErrorManeger.temFormatoDeDataInvalido(data)) return false;
        else if (ErrorManeger.temFormatoDeHoraInvalido(hora)) return false;
        else if (ErrorManeger.temCampoIntInvalido(pressS, pressD)) return false;
        
        // Gera uma instacia de formulario e os dados são adicionados ao CSV
        Formulario f = new Formulario(data, hora, pressS, pressD, estresse);
        FormularioCSV.addFormulario(f);
        return true;
    }
    
    private void atualizarTabela(){
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        // Limpa a tabela atual
        for (int row=0; row < tabela.getRowCount(); row++){
            model.removeRow(row);
        }
        
        ArrayList<Formulario> formularios = FormularioCSV.readFormularios();
        
        // Coloca os dados atualizados na tabela com a ultima inclusão no topo
        for (Formulario f:formularios){
            model.insertRow(0, f.getDados());
        }
    }
    
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        limparFormulario();
    }//GEN-LAST:event_clearBtnActionPerformed
    
    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        // Tenta registrar o formulario
        if(!registrarFormulario()) return;
        JOptionPane.showMessageDialog(this, "Registro realizado com sucesso!");
        
        // Se tiver sucesso, limpa os campos de texto e atualiza a tabela
        limparFormulario();
        atualizarTabela();
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizarTabela();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane PainelPrincipal;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel dataLbl;
    private javax.swing.JFormattedTextField dataTF;
    private javax.swing.JCheckBox estressCB;
    private javax.swing.JLabel horaLbl;
    private javax.swing.JFormattedTextField horaTF;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField presDiasTF;
    private javax.swing.JTextField presSistTF;
    private javax.swing.JLabel pressDiasLbl;
    private javax.swing.JLabel pressSistLbl;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
