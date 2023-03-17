
package ilusionees;

import java.awt.Graphics;


public class Group2 extends javax.swing.JFrame {

    public Group2() {
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
                for (int i = 0; i < W/2; i += 5){
                    g.drawLine(i, H/2, W/2,(H/2) - i);
                    g.drawLine(i, H/2, W/2,(H/2) + i);
                    g.drawLine(W - i, H/2, W/2, (H/2) - i);
                    g.drawLine(W - i, H/2, W/2, (H/2) + i);
                }
            }};
            jPanel2 = new javax.swing.JPanel(){
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    int W = jPanel2.getWidth();
                    int H = jPanel2.getHeight();

                    int size = 20;
                    int rows = H / size;
                    int cols = W / size;

                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            int x = j * size + size / 2;
                            int y = i * size + size / 2;
                            g.drawLine(x, y - size / 2, x + size / 2, y);
                            g.drawLine(x + size / 2, y, x, y + size / 2);
                            g.drawLine(x, y + size / 2, x - size / 2, y);
                            g.drawLine(x - size / 2, y, x, y - size / 2);
                        }
                    }
                }
            };
            jPanel3 = new javax.swing.JPanel(){
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    int W = getWidth();
                    int H = getHeight();
                    int squareSize = W / 3; // Tamaño del cuadrado más pequeño
                    int lineWidth = 2; // Ancho de las líneas
                    for (int i = 0; i < 10; i++) { // Dibuja 3 cuadrados
                        int squareX = (W - (squareSize * (i + 1))) / 2;
                        int squareY = (H - (squareSize * (i + 1))) / 2;
                        g.drawRect(squareX, squareY, squareSize * (i + 1), squareSize * (i + 1));
                    }
                }
            };
            jPanel4 = new javax.swing.JPanel(){
                protected void paintComponent(Graphics g ) {
                    super.paintComponent(g);
                    int W = jPanel4.getWidth();
                    int H = jPanel4.getHeight();
                    for (int i = 0; i <= W; i += 10){
                        g.drawLine(0, H / 2, W / 2, i);
                        g.drawLine(W, H / 2, W / 2, i);
                    }
                }
            };
            jPanel5 = new javax.swing.JPanel(){
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    int W = jPanel1.getWidth();
                    int H = jPanel1.getHeight();
                    int lineSpacing = 5;
                    int lineWidth = 1;
                    int lineCount = W / lineSpacing;
                    int startX = 0;
                    int startY = H / 2;
                    boolean finished = false;

                    for (int i = 0; i < lineCount; i++) {
                        if (finished) {
                            g.drawLine(startX, startY, startX + lineSpacing, 0);
                        } else {
                            g.drawLine(startX, startY, startX + lineSpacing, H);
                        }
                        startX += lineSpacing;
                        finished = !finished;
                    }
                }};
                jPanel6 = new javax.swing.JPanel(){
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        int W = jPanel1.getWidth();
                        int H = jPanel1.getHeight();
                        int centerX = W/2;
                        int centerY = H/2;
                        int step = 20;
                        int spiderLegs = 8;
                        int spiderSize = 200;

                        for (int i = 0; i < spiderLegs; i++) {
                            int x1 = centerX + (int) (Math.sin(Math.toRadians(i * (360 / spiderLegs))) * (spiderSize / 2));
                            int y1 = centerY + (int) (Math.cos(Math.toRadians(i * (360 / spiderLegs))) * (spiderSize / 2));
                            g.drawLine(centerX, centerY, x1, y1);
                            for (int j = i + 1; j < spiderLegs; j++) {
                                int x2 = centerX + (int) (Math.sin(Math.toRadians(j * (360 / spiderLegs))) * (spiderSize / 2));
                                int y2 = centerY + (int) (Math.cos(Math.toRadians(j * (360 / spiderLegs))) * (spiderSize / 2));
                                g.drawLine(x1, y1, x2, y2);
                            }
                        }
                    }
                };
                jPanel7 = new javax.swing.JPanel(){
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        int W = jPanel2.getWidth();
                        int H = jPanel2.getHeight();
                        for (int i = 0; i <= W; i += 10) {
                            g.drawLine(i, H / 2, W / 2, i);
                            g.drawLine(i, H / 2, W / 2, H - i);
                        }
                    }
                };
                jPanel8 = new javax.swing.JPanel(){
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        int W = jPanel1.getWidth();
                        int H = jPanel1.getHeight();
                        int x = W / 2;
                        int y = H / 2;

                        for (int i = 1; i <= 10; i++) {
                            int diameter = i * (W / 10);
                            int xCoord = x - (diameter / 2);
                            int yCoord = y - (diameter / 2);
                            g.drawOval(xCoord, yCoord, diameter, diameter);
                        }
                    }};

                    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                    setTitle("Grupo 2");

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
            java.util.logging.Logger.getLogger(Group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Group2().setVisible(true);
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
