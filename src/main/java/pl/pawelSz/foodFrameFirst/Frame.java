package pl.pawelSz.foodFrameFirst;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import pl.pawelSz.foodEntities.Foods;
import pl.pawelSz.foodEntities.JsonIO;

/**
 *
 * @author Paweł Szymaszek
 * @version 1.0
 * @since 13.08.2017
 *
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogEdit = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelScName = new javax.swing.JLabel();
        jLabel1Tag = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldScName = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        myListModelEdit=new DefaultListModel<>();
        jListTagEdit = new JList (myListModelEdit); ;
        jLabelWarnings = new javax.swing.JLabel();
        jDialogTag = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButtonAddTags = new javax.swing.JButton();
        jButtonCancelTags = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myListModel=new DefaultListModel<>();
        jListTags = new JList (myListModel);
        jButtonDeleteTag = new javax.swing.JButton();
        jLabelTagWarn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myListModelFoods = new DefaultListModel<>();
        jListMain = new JList (myListModelFoods);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelScNameF = new javax.swing.JLabel();
        jLabelNameF = new javax.swing.JLabel();
        jLabelIDF = new javax.swing.JLabel();
        jButtonEditF = new javax.swing.JButton();
        jButtonDeleteF = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemNew = new javax.swing.JMenuItem();
        jMenuItemClose = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemEdit = new javax.swing.JMenuItem();
        jMenuItemTagEdit = new javax.swing.JMenuItem();
        jMenuItemDelete = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenu();
        jMenuItemHelp = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jDialogEdit.setAlwaysOnTop(true);
        jDialogEdit.setResizable(false);
        jDialogEdit.setSize(new java.awt.Dimension(384, 420));

        jLabelID.setText("Id");

        jLabelName.setText("Name");

        jLabelScName.setText("Scientific Name");

        jLabel1Tag.setText("Tags");

        jButtonOk.setText("Add New");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Save");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        JsonIO jj = new JsonIO();
        for(String t: jj.readTags()){
            myListModelEdit.addElement(t.toString());
        }
        jScrollPane3.setViewportView(jListTagEdit);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelID)
                    .addComponent(jLabelName)
                    .addComponent(jLabelScName)
                    .addComponent(jLabel1Tag)
                    .addComponent(jLabelWarnings))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancel))
                    .addComponent(jTextFieldScName)
                    .addComponent(jTextFieldName)
                    .addComponent(jTextFieldId)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelScName)
                    .addComponent(jTextFieldScName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1Tag)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOk)
                            .addComponent(jButtonCancel)
                            .addComponent(jLabelWarnings))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogEditLayout = new javax.swing.GroupLayout(jDialogEdit.getContentPane());
        jDialogEdit.getContentPane().setLayout(jDialogEditLayout);
        jDialogEditLayout.setHorizontalGroup(
            jDialogEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogEditLayout.setVerticalGroup(
            jDialogEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialogTag.setResizable(false);
        jDialogTag.setSize(new java.awt.Dimension(240, 300));

        jTextField1.setToolTipText("enter new tag");

        jButtonAddTags.setText("Add");
        jButtonAddTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTagsActionPerformed(evt);
            }
        });
        jButtonAddTags.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButtonAddTagsKeyReleased(evt);
            }
        });

        jButtonCancelTags.setText("OK");
        jButtonCancelTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelTagsActionPerformed(evt);
            }
        });

        jListTags.setModel(jListTags.getModel());
        JsonIO js = new JsonIO();
        for(String t: js.readTags()){
            myListModel.addElement(t.toString());
        }
        jScrollPane2.setViewportView(jListTags);

        jButtonDeleteTag.setText("Delete");
        jButtonDeleteTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelTagWarn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonAddTags)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeleteTag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jButtonCancelTags, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTagWarn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddTags)
                    .addComponent(jButtonDeleteTag)
                    .addComponent(jButtonCancelTags))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jDialogTagLayout = new javax.swing.GroupLayout(jDialogTag.getContentPane());
        jDialogTag.getContentPane().setLayout(jDialogTagLayout);
        jDialogTagLayout.setHorizontalGroup(
            jDialogTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogTagLayout.setVerticalGroup(
            jDialogTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jListMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        map = new HashMap<>();
        for(Foods t: jj.readFoods()){
            myListModelFoods.addElement(t.getName());

            map.put(t.getName(),t.getScientificName());
        }
        jListMain.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                try{
                    String tempId = String.valueOf(myListModelFoods.indexOf(jListMain.getSelectedValue()));
                    String tempName = jListMain.getSelectedValue().toString();
                    String tempScN = map.get(jListMain.getSelectedValue());
                    if(tempId.equals(null)||tempName.equals(null)||tempScN.equals(null)){
                        jLabelIDF.setText("");
                        jLabelNameF.setText("");
                        jLabelScNameF.setText("");
                    }else{
                        jLabelIDF.setText(tempId);
                        jLabelNameF.setText(tempName);
                        jLabelScNameF.setText(tempScN);
                    }
                }catch(NullPointerException exc){

                }
            }

        });
        jScrollPane1.setViewportView(jListMain);

        jLabel1.setText("Id");

        jLabel2.setText("Name");

        jLabel3.setText("Scientific Name");

        jButtonEditF.setText("Edit");
        jButtonEditF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditFActionPerformed(evt);
            }
        });

        jButtonDeleteF.setText("Delete");
        jButtonDeleteF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jButtonEditF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDeleteF)
                    .addComponent(jLabelIDF)
                    .addComponent(jLabelNameF)
                    .addComponent(jLabelScNameF))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelIDF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelNameF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelScNameF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditF)
                            .addComponent(jButtonDeleteF))
                        .addGap(62, 62, 62))))
        );

        jMenuFile.setText("File");

        jMenuItemNew.setText("New");
        jMenuItemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemNew);

        jMenuItemClose.setText("Exit");
        jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCloseActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemClose);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");

        jMenuItemEdit.setText("Edit");
        jMenuItemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemEdit);

        jMenuItemTagEdit.setText("Edit Tags");
        jMenuItemTagEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTagEditActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemTagEdit);

        jMenuItemDelete.setText("Delete");
        jMenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemDelete);

        jMenuBar1.add(jMenuEdit);

        jMenuAbout.setText("Help");

        jMenuItemHelp.setText("Help");
        jMenuItemHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHelpActionPerformed(evt);
            }
        });
        jMenuAbout.add(jMenuItemHelp);

        jMenuItem7.setText("About");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuAbout.add(jMenuItem7);

        jMenuBar1.add(jMenuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*
  Closing app by menu action  
     */
    private void jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCloseActionPerformed
        if (JOptionPane.showConfirmDialog(this,
                "Are you sure to close this window?", "Really Closing?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemCloseActionPerformed
    /*
    Opens New Dialog to edit selected food. 
     */
    private void jButtonEditFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditFActionPerformed

        jDialogEdit.setLocationRelativeTo(this);
        jDialogEdit.setVisible(true);
        jTextFieldId.setText(jLabelIDF.getText());
        jTextFieldName.setText(jLabelNameF.getText());
        jTextFieldScName.setText(jLabelScNameF.getText());
    }//GEN-LAST:event_jButtonEditFActionPerformed
    /*
    Adds new tag to jList and writes it to JSON file
     */
    private void jButtonAddTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTagsActionPerformed
        String input = jTextField1.getText();
        JsonIO js = new JsonIO();

        try {
            if (jTextField1.getText().isEmpty()) {
                jLabelTagWarn.setText("Add Tag Value!");
            } else {
                myListModel.addElement(input);
                js.writeTag(jTextField1.getText());
            }
        } catch (Exception e) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButtonAddTagsActionPerformed
    /*
    Closes Tag window
     */
    private void jButtonCancelTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelTagsActionPerformed
        jDialogTag.dispose();
    }//GEN-LAST:event_jButtonCancelTagsActionPerformed
    /*
    Close something
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jDialogEdit.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed
    /*
    Adding values to JSON file and to main food jList
     */
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        String tempName = jTextFieldName.getText(),
                tempScn = jTextFieldScName.getText(),
                temp;
        JsonIO js = new JsonIO();
        try {
            if (jTextFieldId.getText().isEmpty() || jTextFieldName.getText().isEmpty() || jTextFieldScName.getText().isEmpty()) {
                jLabelWarnings.setText("Add a Value!");
            } else {

                ArrayList<String> tagArr = new ArrayList<>();
                tagArr.clear();
                for (int i = 0; i < myListModel.size(); i++) {
                    if (jListTagEdit.isSelectedIndex(i)) {
                        tagArr.add(myListModel.get(i));
                    }
                }
                String[] arrrr = new String[tagArr.size()];
                arrrr = tagArr.toArray(arrrr);

                js.writeFood(Integer.valueOf(jTextFieldId.getText()),
                        jTextFieldName.getText(), jTextFieldScName.getText(), arrrr);
                temp = jTextFieldName.getText();
                for (Foods t : js.readFoods()) {
                    if (temp.equals(t.getName())) {
                        myListModelFoods.addElement(t.getName());
                    }
                    map.put(t.getName(), t.getScientificName());

                }
                jDialogEdit.dispose();
            }
        } catch (NumberFormatException e) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButtonOkActionPerformed
    /*
    Opens window to edit food
     */
    private void jMenuItemTagEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTagEditActionPerformed
        jDialogTag.setLocationRelativeTo(this);
        jDialogTag.setVisible(true);

    }//GEN-LAST:event_jMenuItemTagEditActionPerformed
    /*
    Opens window to edit food, from menu
     */
    private void jMenuItemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditActionPerformed
        jDialogEdit.setLocationRelativeTo(this);
        jDialogEdit.setVisible(true);

    }//GEN-LAST:event_jMenuItemEditActionPerformed
    /*
    Opens window to add new food to JSON file and jList
     */
    private void jMenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewActionPerformed
        jDialogEdit.setLocationRelativeTo(this);
        jDialogEdit.setVisible(true);
        jTextFieldId.setText(String.valueOf(myListModelFoods.getSize()));
        jTextFieldName.setText("");
        jTextFieldScName.setText("");

    }//GEN-LAST:event_jMenuItemNewActionPerformed
    /*
    Show Information about author
     */
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JOptionPane.showMessageDialog(this, "Created by: \n Paweł Szymaszek", "About Author", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /*
    Action after hitting X 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this,
                "Are you sure to close this window?", "Really Closing?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    /*
    Delete selected value from food jList
     */
    private void jButtonDeleteFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteFActionPerformed
        if (jListMain.isSelectionEmpty()) {
            jLabelNameF.setText("<-----");
            jLabelScNameF.setText("select item from list!");
        } else {
            myListModelFoods.removeElementAt(jListMain.getSelectedIndex());
            JsonIO js = new JsonIO();
            try {
                js.refreshFood();

                for (int i = 0; i < (myListModelFoods.size()); i++) {
                    jListMain.setSelectedIndex(i);
                    String tempName = jListMain.getSelectedValue();
                    String tempId = jLabelIDF.getText();
                    String tempScName = jLabelScNameF.getText();
                    js.writeFood(Integer.valueOf(tempId), tempName, tempScName, new String[]{jListTags.getSelectedValue()});
                }

            } catch (NumberFormatException e) {
                Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);

            }
        }
    }//GEN-LAST:event_jButtonDeleteFActionPerformed
    /*
    Delete selected value from jList, action from menu
     */
    private void jMenuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteActionPerformed
        if (jListMain.isSelectionEmpty()) {
            jLabelNameF.setText("<-----");
            jLabelScNameF.setText("select item from list!");
        } else {
            myListModelFoods.removeElementAt(jListMain.getSelectedIndex());
            JsonIO js = new JsonIO();
            try {
                js.refreshFood();

                for (int i = 0; i < (myListModelFoods.size()); i++) {
                    jListMain.setSelectedIndex(i);
                    String tempName = jListMain.getSelectedValue();
                    String tempId = jLabelIDF.getText();
                    String tempScName = jLabelScNameF.getText();
                    js.writeFood(Integer.valueOf(tempId), tempName, tempScName, new String[]{jListTags.getSelectedValue()});
                }

            } catch (NumberFormatException e) {
                Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_jMenuItemDeleteActionPerformed
    /*
    Information message - help window
     */
    private void jMenuItemHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHelpActionPerformed
        JOptionPane.showMessageDialog(this, "\n" +
"\n" +
"Aplikacja umożliwia zarządzanie posiłkami.\n" +
"\n" +
"Po wyborze konkretnego dania z listy ukazuje się nam jego Imię, scName oraz ID\n" +
"\n" +
"Edytowanie Dania - przycisk Edit w oknie głównym/ lub opcja edit w menu edit głównego okna\n" +
"Usuwanie Dania - przycisk Delete w oknie głównym/lub opcja Delete w menu głównego okna\n" +
"Tworzenie nowego dania - opcja New w menu File głównego okna\n" +
"Edycja Tagów - opcja Tag Edit w menu Edit głównego okna\n" +
"\n" +
"\n" +
"\n" +
"Wyjście z programu - opcja Exit w menu File głównego okna/krzyżyk", "Quick Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemHelpActionPerformed
    /*
    Remove selected tag from list and JSON file
     */
    private void jButtonDeleteTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteTagActionPerformed
        if (jListTags.isSelectionEmpty()) {
            jLabelTagWarn.setText("Select item from List!");
        } else {
            myListModel.removeElementAt(jListTags.getSelectedIndex());

            JsonIO js = new JsonIO();
            js.refreshTag();
            try {
                for (int i = 0; i < (myListModel.size()); i++) {
                    js.writeTag(myListModel.get(i));
                }

            } catch (Exception e) {
                Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_jButtonDeleteTagActionPerformed

    private void jButtonAddTagsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAddTagsKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
      String input = jTextField1.getText();
        JsonIO js = new JsonIO();

        try {
            if (jTextField1.getText().isEmpty()) {
                jLabelTagWarn.setText("Add Tag Value!");
            } else {
                myListModel.addElement(input);
                js.writeTag(jTextField1.getText());
            }
        } catch (Exception e) {
            Logger.getLogger(JsonIO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            jTextField1.setText("");
        }
   }
    }//GEN-LAST:event_jButtonAddTagsKeyReleased

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddTags;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCancelTags;
    private javax.swing.JButton jButtonDeleteF;
    private javax.swing.JButton jButtonDeleteTag;
    private javax.swing.JButton jButtonEditF;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JDialog jDialogEdit;
    private javax.swing.JDialog jDialogTag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Tag;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIDF;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameF;
    private javax.swing.JLabel jLabelScName;
    private javax.swing.JLabel jLabelScNameF;
    private javax.swing.JLabel jLabelTagWarn;
    private javax.swing.JLabel jLabelWarnings;
    private javax.swing.JList<String> jListMain;
    private javax.swing.JList<String> jListTagEdit;
    private javax.swing.JList<String> jListTags;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItemClose;
    private javax.swing.JMenuItem jMenuItemDelete;
    private javax.swing.JMenuItem jMenuItemEdit;
    private javax.swing.JMenuItem jMenuItemHelp;
    private javax.swing.JMenuItem jMenuItemNew;
    private javax.swing.JMenuItem jMenuItemTagEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldScName;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel<String> myListModel;
    private DefaultListModel<String> myListModelEdit;
    private DefaultListModel<String> myListModelFoods;
    private Map<String, String> map;
}
