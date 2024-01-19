package reloj;

import java.awt.Color;

/**
 *
 * @author LUIS
 */

public class Vista extends javax.swing.JFrame {
    
    Reloj reloj = new Reloj();
    
    public Vista() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_horas = new javax.swing.JTextField();
        txt_minutos = new javax.swing.JTextField();
        bt_convertir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar_area = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cbo_AmPm = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        bt_regresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrarArea_2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("ANGULOS DEL RELOJ");

        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("INGRESE LAS HORAS:");

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("INGRESE LOS MINUTOS:");

        txt_horas.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        txt_horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horasActionPerformed(evt);
            }
        });

        txt_minutos.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N

        bt_convertir.setText("CONVERTIR");
        bt_convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_convertirActionPerformed(evt);
            }
        });

        mostrar_area.setColumns(20);
        mostrar_area.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        mostrar_area.setRows(5);
        jScrollPane1.setViewportView(mostrar_area);

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Formato 12:00 hrs (ejemplo: 5:12)");

        cbo_AmPm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        cbo_AmPm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_AmPmActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("SELECCIONE EL PERIODO DE LA HORA");

        bt_regresar.setText("Regresar");
        bt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_regresarActionPerformed(evt);
            }
        });

        mostrarArea_2.setBackground(new java.awt.Color(51, 51, 51));
        mostrarArea_2.setColumns(20);
        mostrarArea_2.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        mostrarArea_2.setForeground(new java.awt.Color(204, 204, 255));
        mostrarArea_2.setRows(5);
        mostrarArea_2.setText("Si se mide un ángulo\nen sentido contrario\nal sentido de giro de\nlas agujas del reloj,\nse considera positivo.\nSi se mide en el\nsentido de giro de las\nagujas del reloj,\nse considera negativo.");
        jScrollPane2.setViewportView(mostrarArea_2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_regresar)
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbo_AmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_horas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_convertir))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbo_AmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(bt_convertir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_regresar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horasActionPerformed
       
    }//GEN-LAST:event_txt_horasActionPerformed

    private void bt_convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_convertirActionPerformed
        try{
            reloj.setHora(Integer.parseInt(this.txt_horas.getText()));
            reloj.setMinuto(Integer.parseInt(this.txt_minutos.getText()));
        }catch(NumberFormatException e){
            reloj.setHora(-1);
            reloj.setMinuto(-1);
        }
        this.mostrar_area.setText(reloj.mostrarTexto());
    }//GEN-LAST:event_bt_convertirActionPerformed

    private void cbo_AmPmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_AmPmActionPerformed
            reloj.setTipo((String) cbo_AmPm.getSelectedItem());
    }//GEN-LAST:event_cbo_AmPmActionPerformed

    private void bt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_regresarActionPerformed
        this.setVisible(false);
            Menu menu = new Menu();
        menu.setVisible(true);    
    }//GEN-LAST:event_bt_regresarActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_convertir;
    private javax.swing.JButton bt_regresar;
    private javax.swing.JComboBox<String> cbo_AmPm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mostrarArea_2;
    private javax.swing.JTextArea mostrar_area;
    private javax.swing.JTextField txt_horas;
    private javax.swing.JTextField txt_minutos;
    // End of variables declaration//GEN-END:variables
}
