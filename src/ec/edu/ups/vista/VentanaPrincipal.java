/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.IconUIResource;
/**
 *
 * @author patrick
 */
public class VentanaPrincipal extends javax.swing.JFrame {

      private int[][] m;
    private JButton[][] mBotones;
    Icon iconoEquis;
    Icon iconoCirculo;
    int f1;
    int f2;
    int f3;
    int c1;
    int c2;
    int c3;
    int d1;
    int d2;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
         m = new int[3][3];
        mBotones = new JButton[3][3];
        mBotones[0][0] = btn00;
        mBotones[0][1] = btn01;
        mBotones[0][2] = btn02;
        mBotones[1][0] = btn10;
        mBotones[1][1] = btn11;
        mBotones[1][2] = btn12;
        mBotones[2][0] = btn20;
        mBotones[2][1] = btn21;
        mBotones[2][2] = btn22;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ImageIcon imagenEquis = new ImageIcon(getClass().getResource("/ec/edu/ups/vista/x.png"));
        ImageIcon imagenCirculo = new ImageIcon(getClass().getResource("/ec/edu/ups/vista/O.jpg"));
        iconoEquis = new ImageIcon(imagenEquis.getImage().getScaledInstance(btn00.getWidth(), btn00.getHeight(), Image.SCALE_DEFAULT));
        iconoCirculo = new ImageIcon(imagenCirculo.getImage().getScaledInstance(btn00.getWidth(), btn00.getHeight(), Image.SCALE_DEFAULT));
    }
 private void verificarGanador(){
        
        if(f1 == 3 || f2 == 3 || f3 == 3 || c1 == 3 || c2 == 3 || c3 == 3 || d1 == 3 || d2 == 3){
            deshabilitarBotones();
            JOptionPane.showMessageDialog(null, "¡Gano X!");
        }
        if(f1 == 30 || f2 == 30 || f3 == 30 || c1 == 30 || c2 == 30 || c3 == 30 || d1 == 30 || d2 == 30){
            deshabilitarBotones();
            JOptionPane.showMessageDialog(null, "¡Gano O!");
        }
        
    }
    
    /**
     * calcular
     * metodo usado para verificar si hay un ganador y por la maquina para que ejecute una accion coherente.
     */
    private void calcular(){
        
        f1 = m[0][0] + m[0][1] + m[0][2];
        f2 = m[1][0] + m[1][1] + m[1][2];
        f3 = m[2][0] + m[2][1] + m[2][2];
        c1 = m[0][0] + m[1][0] + m[2][0];
        c2 = m[0][1] + m[1][1] + m[2][1];
        c3 = m[0][2] + m[1][2] + m[2][2];
        d1 = m[0][0] + m[1][1] + m[2][2];
        d2 = m[0][2] + m[1][1] + m[2][0];
        
    }
    
    /**
     * turnoMaquina
     * pasos que sigue la maquina para jugar medianamente bien al juego.
     */
    private void turnoMaquina(){
        
        calcular();
        
        if(f1 == 20){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[0][i].isEnabled()){
                    mBotones[0][i].setIcon(iconoCirculo);
                    m[0][i] = 10;
                    mBotones[0][i].setEnabled(false);
                }
            }
        }else if(f2 == 20){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[1][i].isEnabled()){
                    mBotones[1][i].setIcon(iconoCirculo);
                    m[1][i] = 10;
                    mBotones[1][i].setEnabled(false);
                }
            }
        }else if(f3 == 20){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[2][i].isEnabled()){
                    mBotones[2][i].setIcon(iconoCirculo);
                    m[2][i] = 10;
                    mBotones[2][i].setEnabled(false);
                }
            }
        }else if(c1 == 20){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][0].isEnabled()){
                    mBotones[i][0].setIcon(iconoCirculo);
                    m[i][0] = 10;
                    mBotones[i][0].setEnabled(false);
                }
            }
        }else if(c2 == 20){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][1].isEnabled()){
                    mBotones[i][1].setIcon(iconoCirculo);
                    m[i][1] = 10;
                    mBotones[i][1].setEnabled(false);
                }
            }
        }else if(c3 == 20){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][2].isEnabled()){
                    mBotones[i][2].setIcon(iconoCirculo);
                    m[i][2] = 10;
                    mBotones[i][2].setEnabled(false);
                }
            }
        }else if(d1 == 20){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][i].isEnabled()){
                    mBotones[i][i].setIcon(iconoCirculo);
                    m[i][i] = 10;
                    mBotones[i][i].setEnabled(false);
                }
            }
        }else if(d2 == 20){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][2-i].isEnabled()){
                    mBotones[i][2-i].setIcon(iconoCirculo);
                    m[i][2-i] = 10;
                    mBotones[i][2-i].setEnabled(false);
                }
            }
        }else if(f1 == 2 || f1 == 3){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[0][i].isEnabled()){
                    mBotones[0][i].setIcon(iconoCirculo);
                    m[0][i] = 10;
                    mBotones[0][i].setEnabled(false);
                }
            }
        }else if(f2 == 2 || f2 == 3){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[1][i].isEnabled()){
                    mBotones[1][i].setIcon(iconoCirculo);
                    m[1][i] = 10;
                    mBotones[1][i].setEnabled(false);
                }
            }
        }else if(f3 == 2 || f3 == 3){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[2][i].isEnabled()){
                    mBotones[2][i].setIcon(iconoCirculo);
                    m[2][i] = 10;
                    mBotones[2][i].setEnabled(false);
                }
            }
        }else if(c1 == 2 || c1 == 3){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][0].isEnabled()){
                    mBotones[i][0].setIcon(iconoCirculo);
                    m[i][0] = 10;
                    mBotones[i][0].setEnabled(false);
                }
            }
        }else if(c2 == 2 || c2 == 3){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][1].isEnabled()){
                    mBotones[i][1].setIcon(iconoCirculo);
                    m[i][1] = 10;
                    mBotones[i][1].setEnabled(false);
                }
            }
        }else if(c3 == 2 || c3 == 3){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][2].isEnabled()){
                    mBotones[i][2].setIcon(iconoCirculo);
                    m[i][2] = 10;
                    mBotones[i][2].setEnabled(false);
                }
            }
        }else if(d1 == 2 || d1 == 3){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][i].isEnabled()){
                    mBotones[i][i].setIcon(iconoCirculo);
                    m[i][i] = 10;
                    mBotones[i][i].setEnabled(false);
                }
            }
        }else if(d2 == 2 || d2 == 3){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][2-i].isEnabled()){
                    mBotones[i][2-i].setIcon(iconoCirculo);
                    m[i][2-i] = 10;
                    mBotones[i][2-i].setEnabled(false);
                }
            }
        }else if(f1 == 10){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[0][i].isEnabled()){
                    mBotones[0][i].setIcon(iconoCirculo);
                    m[0][i] = 10;
                    mBotones[0][i].setEnabled(false);
                    break;
                }
            }
        }else if(f2 == 10){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[1][i].isEnabled()){
                    mBotones[1][i].setIcon(iconoCirculo);
                    m[1][i] = 10;
                    mBotones[1][i].setEnabled(false);
                    break;
                }
            }
        }else if(f3 == 10){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[2][i].isEnabled()){
                    mBotones[2][i].setIcon(iconoCirculo);
                    m[2][i] = 10;
                    mBotones[2][i].setEnabled(false);
                    break;
                }
            }
        }else if(c1 == 10){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][0].isEnabled()){
                    mBotones[i][0].setIcon(iconoCirculo);
                    m[i][0] = 10;
                    mBotones[i][0].setEnabled(false);
                    break;
                }
            }
        }else if(c2 == 10){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][1].isEnabled()){
                    mBotones[i][1].setIcon(iconoCirculo);
                    m[i][1] = 10;
                    mBotones[i][1].setEnabled(false);
                    break;
                }
            }
        }else if(c3 == 10){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][2].isEnabled()){
                    mBotones[i][2].setIcon(iconoCirculo);
                    m[i][2] = 10;
                    mBotones[i][2].setEnabled(false);
                    break;
                }
            }
        }else if(d1 == 10){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][i].isEnabled()){
                    mBotones[i][i].setIcon(iconoCirculo);
                    m[i][i] = 10;
                    mBotones[i][i].setEnabled(false);
                    break;
                }
            }
        }else if(d2 == 10){
            for(int i = 0; i < mBotones.length; i++){
                if(mBotones[i][2-i].isEnabled()){
                    mBotones[i][2-i].setIcon(iconoCirculo);
                    m[i][2-i] = 10;
                    mBotones[i][2-i].setEnabled(false);
                    break;
                }
            }
        }else{
            boolean bandera = false;
            for(int i = 0; i < mBotones.length; i++){
                for(int j = 0; j < mBotones.length; j++){
                    if(mBotones[i][j].isEnabled()){
                        bandera = true;
                        break;
                    }
                }
            }
            if(bandera){
                int x = (int)(Math.random()*3);
                int y = (int)(Math.random()*3);
                while(mBotones[x][y].isEnabled() == false){
                    x = (int)(Math.random()*3);
                    y = (int)(Math.random()*3);
                }
                mBotones[x][y].setIcon(iconoCirculo);
                m[x][y] = 10;
                mBotones[x][y].setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "¡Empate!");
            }
            
        }
        calcular();
        verificarGanador();
    }
    
    /**
     * deshabilitarBotones
     * Desabilita los botones una vez que hay un ganador
     */
    private void deshabilitarBotones(){
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn12 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        btn12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn22.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btn00.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn00.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn01.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn02.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        btn12.setIcon(iconoEquis);
        m[1][2] = 1;
        btn12.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        btn22.setIcon(iconoEquis);
        m[2][2] = 1;
        btn22.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn22ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:

        btn00.setEnabled(true);
        btn01.setEnabled(true);
        btn02.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
        btn00.setIcon(null);
        btn01.setIcon(null);
        btn02.setIcon(null);
        btn10.setIcon(null);
        btn11.setIcon(null);
        btn12.setIcon(null);
        btn20.setIcon(null);
        btn21.setIcon(null);
        btn22.setIcon(null);
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                m[i][j] = 0;
            }
        }
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        btn00.setIcon(iconoEquis);
        m[0][0] = 1;
        btn00.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        btn10.setIcon(iconoEquis);
        m[1][0] = 1;
        btn10.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        btn20.setIcon(iconoEquis);
        m[2][0] = 1;
        btn20.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        btn01.setIcon(iconoEquis);
        m[0][1] = 1;
        btn01.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        btn11.setIcon(iconoEquis);
        m[1][1] = 1;
        btn11.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        btn21.setIcon(iconoEquis);
        m[2][1] = 1;
        btn21.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // TODO add your handling code here:
        btn02.setIcon(iconoEquis);
        m[0][2] = 1;
        btn02.setEnabled(false);
        turnoMaquina();
    }//GEN-LAST:event_btn02ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
