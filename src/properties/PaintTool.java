 package properties;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PaintTool extends javax.swing.JPanel implements ActionListener {

         @Override
         public void actionPerformed(ActionEvent arg0) {
                  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

        

         public static enum DrawMode {
                  LINE, RECT, OVAL, PENCIL, ERASER, CURVE,BUCKET,SEL
         }
         private DrawMode drawMode = DrawMode.PENCIL;

         /**
          * Creates new form PaintTool
          */
         public PaintTool() {
                  initComponents();
 

         }

         public Image getImageIcon(String path) {
                  Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(path));
                  return image;
         }

         public DrawMode getDrawMode() {
                  return drawMode;
         }

         public void setDrawMode(DrawMode newDrawMode) {
                  DrawMode oldDrawMode = this.drawMode;
                  this.drawMode = newDrawMode;
                  this.firePropertyChange("tool change", oldDrawMode, newDrawMode);
         }

         /**
          * This method is called from within the constructor to initialize the form. WARNING: Do
          * NOT modify this code. The content of this method is always regenerated by the Form
          * Editor.
          */
         @SuppressWarnings("unchecked")
         // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
         private void initComponents() {

                  buttonGroup1 = new javax.swing.ButtonGroup();
                  bPencil = new javax.swing.JToggleButton();
                  bBucket = new javax.swing.JToggleButton();
                  bLine = new javax.swing.JToggleButton();
                  bRect = new javax.swing.JToggleButton();
                  bOval = new javax.swing.JToggleButton();
                  bEraser = new javax.swing.JToggleButton();

                  setBackground(new java.awt.Color(153, 153, 153));

                  bPencil.setBackground(new java.awt.Color(255, 255, 255));
                  buttonGroup1.add(bPencil);
                  bPencil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pen.png"))); // NOI18N
                  bPencil.setSelected(true);
                  bPencil.setPreferredSize(new java.awt.Dimension(40, 40));
                  bPencil.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bPencilActionPerformed(evt);
                           }
                  });

                  bBucket.setBackground(new java.awt.Color(255, 255, 255));
                  buttonGroup1.add(bBucket);
                  bBucket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bucket.png"))); // NOI18N
                  bBucket.setPreferredSize(new java.awt.Dimension(40, 40));
                  bBucket.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bBucketActionPerformed(evt);
                           }
                  });

                  bLine.setBackground(new java.awt.Color(255, 255, 255));
                  buttonGroup1.add(bLine);
                  bLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/line.png"))); // NOI18N
                  bLine.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bLineActionPerformed(evt);
                           }
                  });

                  bRect.setBackground(new java.awt.Color(255, 255, 255));
                  buttonGroup1.add(bRect);
                  bRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rect.png"))); // NOI18N
                  bRect.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bRectActionPerformed(evt);
                           }
                  });

                  bOval.setBackground(new java.awt.Color(255, 255, 255));
                  buttonGroup1.add(bOval);
                  bOval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oval.png"))); // NOI18N
                  bOval.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bOvalActionPerformed(evt);
                           }
                  });

                  bEraser.setBackground(new java.awt.Color(255, 255, 255));
                  buttonGroup1.add(bEraser);
                  bEraser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eraser.png"))); // NOI18N
                  bEraser.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bEraserActionPerformed(evt);
                           }
                  });

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                  this.setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                             .addComponent(bEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                             .addComponent(bPencil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(layout.createSequentialGroup()
                                                      .addComponent(bBucket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                      .addComponent(bLine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(layout.createSequentialGroup()
                                                      .addComponent(bRect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                      .addComponent(bOval, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(bPencil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(bBucket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(bLine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(layout.createSequentialGroup()
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                      .addComponent(bOval, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addGap(0, 0, Short.MAX_VALUE))
                                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                               .addComponent(bEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                               .addComponent(bRect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addContainerGap())))
                  );
         }// </editor-fold>//GEN-END:initComponents

    private void bOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOvalActionPerformed
             setDrawMode(DrawMode.OVAL);
    }//GEN-LAST:event_bOvalActionPerformed

    private void bPencilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPencilActionPerformed
             setDrawMode(DrawMode.PENCIL);
    }//GEN-LAST:event_bPencilActionPerformed

    private void bLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLineActionPerformed
             setDrawMode(DrawMode.LINE);
    }//GEN-LAST:event_bLineActionPerformed

    private void bRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRectActionPerformed
             setDrawMode(DrawMode.RECT);
    }//GEN-LAST:event_bRectActionPerformed

    private void bBucketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBucketActionPerformed
             setDrawMode(DrawMode.BUCKET);
    }//GEN-LAST:event_bBucketActionPerformed

    private void bEraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEraserActionPerformed
             setDrawMode(DrawMode.ERASER);
    }//GEN-LAST:event_bEraserActionPerformed


         // Variables declaration - do not modify//GEN-BEGIN:variables
         private javax.swing.JToggleButton bBucket;
         private javax.swing.JToggleButton bEraser;
         private javax.swing.JToggleButton bLine;
         private javax.swing.JToggleButton bOval;
         private javax.swing.JToggleButton bPencil;
         private javax.swing.JToggleButton bRect;
         private javax.swing.ButtonGroup buttonGroup1;
         // End of variables declaration//GEN-END:variables
}
