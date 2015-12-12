/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import collection.tree.Operation;
import controller.Controller;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 * @author garciparedes
 */
public class View extends javax.swing.JFrame {

    public static final String INPREFIX  = "        " + "IN: ";
    public static final String OUTPREFIX = "     " + "OUT: ";
    private static final String SPACE = " ";
    
    private static final int ENTER_KEY = 10;
    private static final int UP_KEY = 38;
    private static final int DOWN_KEY = 40;

    public static final String MODINVERSE = ".modInverse( )";
    public static final String MODPOW = ".modPow( , )";
    public static final String ISMODPRIME = ".ismodPrime( )";
    public static final String NEXTPROBABLEPRIME = ".nextProbablePrime()";


    private Controller controller;

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        this.controller = new Controller(this);
        jTextAreaResult.setLineWrap(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButtonPow = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonSubtract = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonOpenBracket = new javax.swing.JButton();
        jButtonCloseBracket = new javax.swing.JButton();
        jButtonEqual = new javax.swing.JButton();
        jButtonModPow = new javax.swing.JButton();
        jButtonIsModPrime = new javax.swing.JButton();
        jButtonNextProbablePrime = new javax.swing.JButton();
        jButtonModInverse = new javax.swing.JButton();
        jTextFieldExpression = new javax.swing.JTextField();
        jButtonExecute = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.awt.GridBagLayout jLayeredPane1Layout = new java.awt.GridBagLayout();
        jLayeredPane1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jLayeredPane1Layout.rowHeights = new int[] {0, 5, 0};
        jLayeredPane1.setLayout(jLayeredPane1Layout);

        jButtonPow.setText("^");
        jButtonPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPowActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonPow, gridBagConstraints);

        jButtonMultiply.setText("X");
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonMultiply, gridBagConstraints);

        jButtonAdd.setText("+");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonAdd, gridBagConstraints);

        jButtonMod.setText("%");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonMod, gridBagConstraints);

        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonDivide, gridBagConstraints);

        jButtonSubtract.setText("-");
        jButtonSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtractActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonSubtract, gridBagConstraints);

        jButtonReset.setText("C");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonReset, gridBagConstraints);

        jButtonOpenBracket.setText("(");
        jButtonOpenBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenBracketActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonOpenBracket, gridBagConstraints);

        jButtonCloseBracket.setText(")");
        jButtonCloseBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseBracketActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonCloseBracket, gridBagConstraints);

        jButtonEqual.setText("=");
        jButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jLayeredPane1.add(jButtonEqual, gridBagConstraints);

        jButtonModPow.setText("modPow()");
        jButtonModPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModPowActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        jLayeredPane1.add(jButtonModPow, gridBagConstraints);

        jButtonIsModPrime.setText("ismodPrime()");
        jButtonIsModPrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIsModPrimeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.4;
        jLayeredPane1.add(jButtonIsModPrime, gridBagConstraints);

        jButtonNextProbablePrime.setText("nextProbablePrime()");
        jButtonNextProbablePrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextProbablePrimeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jLayeredPane1.add(jButtonNextProbablePrime, gridBagConstraints);

        jButtonModInverse.setText("modInverse()");
        jButtonModInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModInverseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jLayeredPane1.add(jButtonModInverse, gridBagConstraints);

        jTextFieldExpression.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldExpressionKeyPressed(evt);
            }
        });

        jButtonExecute.setText("Execute");
        jButtonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecuteActionPerformed(evt);
            }
        });

        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelError.setText("   ");

        jTextAreaResult.setEditable(false);
        jTextAreaResult.setColumns(20);
        jTextAreaResult.setRows(5);
        jTextAreaResult.setFocusable(false);
        jScrollPane1.setViewportView(jTextAreaResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldExpression)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldExpression, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExecute))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonExecute, jTextFieldExpression});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * setJTextFieldInputText() function.
     * <p/>
     * Set new {@code text} at input text field.
     *
     * @param text  notation text
     */
    public void setJTextFieldInputText(String text) {
        jTextFieldExpression.setText(text);
    }
    

    /**
     * appendJTextAreaRestult() function.
     * <p/>
     * Append new evaluation in a new line at the text area of results.
     *
     * @param input - user expression input
     * @param result - result of user expression
     */
    public void appendJTextAreaResult(String input, String result) {
        appendJTextAreaResult(INPREFIX  + input, Color.CYAN);
        appendJTextAreaResult(OUTPREFIX  + result + "\n", Color.WHITE);
    }


    /*
     * appendJTextAreaResult() function.
     * 
     * Append text at text area of results, formated by Color c.
     */
    private void appendJTextAreaResult(String text, Color c) {
        SimpleAttributeSet aset = new SimpleAttributeSet();
        StyleConstants.setForeground(aset, c);
        
        
        int len = jTextAreaResult.getText().length();
        jTextAreaResult.setCaretPosition(len); // place caret at the end (with no selection)
        jTextAreaResult.replaceSelection(text + "\n"); // there is no 
        
        int p0 = jTextAreaResult.getText().length() - text.length()+4;
        int p1 = jTextAreaResult.getText().length() -  text.length() +  text.lastIndexOf(':');
        try {                
            jTextAreaResult.getHighlighter()
                    .addHighlight(p0, p1, new DefaultHighlightPainter(c));
        } catch (BadLocationException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * appendJTextInputExpression() function.
     * <p/>
     * Append new {@code text} at the end of the input text field.
     *
     * @param text result input text
     */
    public void appendJTextInputExpression(String text) {
        jTextFieldExpression.setText(getJTextFieldInputText() + text);
    }

    /**
     * getJTextFieldInputText() function.
     *
     * @return Input text field content
     */
    public String getJTextFieldInputText() {
        return jTextFieldExpression.getText();
    }

    /**
     * showError() function.
     * <p/>
     * View show {
     *
     * {@code error} at error's text field.
     *
     * @param error throwed exception
     */
    public void showError(String error) {
        // TODO: Mostrar error en la vista
        jLabelError.setText(error);
    }

    /**
     * clearErrors() function.
     * <p/>
     * View clear errors text fields.
     */
    public void clearErrors() {
        // TODO: Limpiar errores de la vista
        jLabelError.setText("");
    }

    /*
     * Input text field content
     */
    private String getJTextAreaExpressionText() {
        return jTextAreaResult.getText();
    }

    /*
     * Clear text input field
     */
    private void clearJTextInputExpression() {
        setJTextFieldInputText("");
    }

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        appendJTextInputExpression(Operation.ADD.toString());
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualActionPerformed
        appendJTextInputExpression(Operation.RESULT.toString());
    }//GEN-LAST:event_jButtonEqualActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        clearJTextInputExpression();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplyActionPerformed
        appendJTextInputExpression(Operation.MULTIPLY.toString());
    }//GEN-LAST:event_jButtonMultiplyActionPerformed

    private void jButtonSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtractActionPerformed
        appendJTextInputExpression(Operation.SUBTRACT.toString());
    }//GEN-LAST:event_jButtonSubtractActionPerformed

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
        appendJTextInputExpression(Operation.DIVIDE.toString());
    }//GEN-LAST:event_jButtonDivideActionPerformed

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        appendJTextInputExpression(Operation.MODULE.toString());
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPowActionPerformed
        appendJTextInputExpression(Operation.POW.toString());
    }//GEN-LAST:event_jButtonPowActionPerformed

    private void jButtonOpenBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenBracketActionPerformed
        appendJTextInputExpression(Operation.LBRACKET.toString() + Operation.RBRACKET.toString());
    }//GEN-LAST:event_jButtonOpenBracketActionPerformed

    private void jButtonCloseBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseBracketActionPerformed
        appendJTextInputExpression(Operation.RBRACKET.toString());
    }//GEN-LAST:event_jButtonCloseBracketActionPerformed

    private void jButtonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecuteActionPerformed
        controller.evaluate();
    }//GEN-LAST:event_jButtonExecuteActionPerformed

    private void jTextFieldExpressionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldExpressionKeyPressed
        switch(evt.getKeyCode()){
            case ENTER_KEY:
                controller.evaluate();
                break;
            case UP_KEY:
                controller.nextCache();
                break;    
            case DOWN_KEY:
                controller.previousCache();
                break;
        }
    }//GEN-LAST:event_jTextFieldExpressionKeyPressed

    private void jButtonModInverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModInverseActionPerformed
        appendJTextInputExpression(Operation.MODINVERSE.toString());
    }//GEN-LAST:event_jButtonModInverseActionPerformed

    private void jButtonIsModPrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIsModPrimeActionPerformed
        appendJTextInputExpression(Operation.ISPROBABLEPRIME.toString());
    }//GEN-LAST:event_jButtonIsModPrimeActionPerformed

    private void jButtonModPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModPowActionPerformed
        appendJTextInputExpression(Operation.MODPOW.toString());
    }//GEN-LAST:event_jButtonModPowActionPerformed

    private void jButtonNextProbablePrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextProbablePrimeActionPerformed
        appendJTextInputExpression(Operation.NEXTPROBABLEPRIME.toString());
    }//GEN-LAST:event_jButtonNextProbablePrimeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCloseBracket;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonEqual;
    private javax.swing.JButton jButtonExecute;
    private javax.swing.JButton jButtonIsModPrime;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonModInverse;
    private javax.swing.JButton jButtonModPow;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonNextProbablePrime;
    private javax.swing.JButton jButtonOpenBracket;
    private javax.swing.JButton jButtonPow;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSubtract;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldExpression;
    // End of variables declaration//GEN-END:variables

}
