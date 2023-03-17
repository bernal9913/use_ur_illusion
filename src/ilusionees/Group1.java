
package ilusionees;

import java.awt.Graphics;

public class Group1 extends javax.swing.JFrame {


    public Group1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();
                for (int i = 0; i < H; i += 5){
                    g.drawLine(0,i,W,i);
                }
            }};
            jPanel2 = new javax.swing.JPanel(){
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    int W = jPanel1.getWidth();
                    int H = jPanel1.getHeight();
                    for (int i = 0; i < W; i += 5){
                        g.drawLine(i,0,i,H);
                    }
                }};
                jPanel3 = new javax.swing.JPanel(){
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        int W = jPanel1.getWidth();
                        int H = jPanel1.getHeight();
                        for (int i = 0; i < H; i += 5){
                            g.drawLine(0,i,W,i);
                        }
                        for (int i = 0; i < W; i += 5){
                            g.drawLine(i,0,i,H);
                        }
                    }};
                    jPanel4 = new javax.swing.JPanel(){
                        protected void paintComponent(Graphics g) {
                            super.paintComponent(g);
                            int W = jPanel1.getWidth();
                            int H = jPanel1.getHeight();
                            int D = 0;
                            while(D<500){
                                g.drawLine(0,D,W,H);
                                D += 15;
                            }
                        }
                    };
                    jPanel5 = new javax.swing.JPanel(){
                        protected void paintComponent(Graphics g) {
                            super.paintComponent(g);
                            int W = jPanel1.getWidth();
                            int H = jPanel1.getHeight();
                            for (int i = 0; i < H; i += 5){
                                g.drawLine(0,i,W/2,H/2);
                                g.drawLine(W,i,W/2,H/2);
                            }
                        }};
                        jPanel6 = new javax.swing.JPanel(){
                            protected void paintComponent(Graphics g) {
                                super.paintComponent(g);
                                int W = jPanel1.getWidth();
                                int H = jPanel1.getHeight();
                                for (int i = 0; i < H; i += 5){
                                    g.drawLine(i,0,W/2,H/2);
                                    g.drawLine(i,H,W/2,H/2);
                                }
                            }};
                            jPanel7 = new javax.swing.JPanel(){
                                protected void paintComponent(Graphics g) {
                                    super.paintComponent(g);
                                    int W = jPanel1.getWidth();
                                    int H = jPanel1.getHeight();
                                    for (int i = 0; i < H; i += 15){
                                        for(int j = 0; j < W; j+=15){
                                            g.drawLine(W/2, H/2, i, j);
                                        }
                                    }
                                }};
                                jPanel8 = new javax.swing.JPanel(){
                                    protected void paintComponent(Graphics g) {
                                        super.paintComponent(g);
                                        int W = jPanel1.getWidth();
                                        int H = jPanel1.getHeight();
                                        for (int i = 0; i < H; i += 10){
                                            g.drawLine(0,i,i,0);
                                            g.drawLine(W,i,i,W);
                                        }
                                    }};

                                    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                                    setTitle("Grupo 1");

                                    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                                    jPanel1.setLayout(jPanel1Layout);
                                    jPanel1Layout.setHorizontalGroup(
                                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 151, Short.MAX_VALUE)
                                    );
                                    jPanel1Layout.setVerticalGroup(
                                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );

                                    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                                    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                                    jPanel2.setLayout(jPanel2Layout);
                                    jPanel2Layout.setHorizontalGroup(
                                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 151, Short.MAX_VALUE)
                                    );
                                    jPanel2Layout.setVerticalGroup(
                                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 149, Short.MAX_VALUE)
                                    );

                                    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

                                    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                                    jPanel3.setLayout(jPanel3Layout);
                                    jPanel3Layout.setHorizontalGroup(
                                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 151, Short.MAX_VALUE)
                                    );
                                    jPanel3Layout.setVerticalGroup(
                                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );

                                    jPanel4.setBackground(new java.awt.Color(255, 255, 255));

                                    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                                    jPanel4.setLayout(jPanel4Layout);
                                    jPanel4Layout.setHorizontalGroup(
                                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 151, Short.MAX_VALUE)
                                    );
                                    jPanel4Layout.setVerticalGroup(
                                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );

                                    jPanel5.setBackground(new java.awt.Color(255, 255, 255));

                                    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                                    jPanel5.setLayout(jPanel5Layout);
                                    jPanel5Layout.setHorizontalGroup(
                                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 151, Short.MAX_VALUE)
                                    );
                                    jPanel5Layout.setVerticalGroup(
                                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 149, Short.MAX_VALUE)
                                    );

                                    jPanel6.setBackground(new java.awt.Color(255, 255, 255));

                                    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                                    jPanel6.setLayout(jPanel6Layout);
                                    jPanel6Layout.setHorizontalGroup(
                                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );
                                    jPanel6Layout.setVerticalGroup(
                                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );

                                    jPanel7.setBackground(new java.awt.Color(255, 255, 255));

                                    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                                    jPanel7.setLayout(jPanel7Layout);
                                    jPanel7Layout.setHorizontalGroup(
                                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );
                                    jPanel7Layout.setVerticalGroup(
                                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );

                                    jPanel8.setBackground(new java.awt.Color(255, 255, 255));

                                    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                                    jPanel8.setLayout(jPanel8Layout);
                                    jPanel8Layout.setHorizontalGroup(
                                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );
                                    jPanel8Layout.setVerticalGroup(
                                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGap(0, 0, Short.MAX_VALUE)
                                    );

                                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                                    getContentPane().setLayout(layout);
                                    layout.setHorizontalGroup(
                                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    );
                                    layout.setVerticalGroup(
                                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    );

                                    pack();
                                }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Group1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Group1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Group1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Group1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Group1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
