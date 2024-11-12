/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joan
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        addBorrowingDialog = new javax.swing.JDialog();
        addBorrowingScreenPanel = new javax.swing.JPanel();
        startDateInput = new javax.swing.JTextField();
        personNameInput = new javax.swing.JTextField();
        personGroupInput = new javax.swing.JTextField();
        itemInput = new javax.swing.JTextField();
        addBorrowingConfirmButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        itemLabel = new javax.swing.JLabel();
        personLastNameInput = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        borrowingInfoDialog = new javax.swing.JDialog();
        borrowingInfoScreenPanel = new javax.swing.JPanel();
        itemInventoryInfoLabel = new javax.swing.JLabel();
        nameInfoLabel = new javax.swing.JLabel();
        lastNameInfoLabel = new javax.swing.JLabel();
        groupInfoLabel = new javax.swing.JLabel();
        startDateInfoLabel = new javax.swing.JLabel();
        endDateInfoLabel = new javax.swing.JLabel();
        borrowerInfoLabel = new javax.swing.JLabel();
        endBorrowingGoToButton = new javax.swing.JButton();
        endBorrowingDialog = new javax.swing.JDialog();
        endBorrowingScreenPanel = new javax.swing.JPanel();
        endBorrowingButton = new javax.swing.JButton();
        endDateInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mainScreenPanel = new javax.swing.JPanel();
        addBorrowingButton = new javax.swing.JButton();
        viewCurrentBorrowingsButton = new javax.swing.JButton();
        viewHistoryButton = new javax.swing.JButton();
        viewInventoryButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        currentBorrowingsScreenPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentBorrowingsFullTable = new javax.swing.JTable();
        backCurrentBorrowingsScreenButton = new javax.swing.JButton();
        historyScreenPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowingsHistoryTable = new javax.swing.JTable();
        backHistoryScreenButton = new javax.swing.JButton();
        inventoryScreenPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        backInventoryScreenButton = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        userMenu = new javax.swing.JMenu();
        addUserItem = new javax.swing.JMenuItem();
        endSessionItem = new javax.swing.JMenuItem();
        borrowingsMenu = new javax.swing.JMenu();
        addBorrowingItem = new javax.swing.JMenuItem();
        inventoryMenu = new javax.swing.JMenu();
        viewInventoryItem = new javax.swing.JMenuItem();
        importCsvItem = new javax.swing.JMenuItem();
        addItemItem = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        aboutUsItem = new javax.swing.JMenuItem();

        addBorrowingDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addBorrowingDialog.setTitle("Add Borrowing");
        addBorrowingDialog.setMinimumSize(new java.awt.Dimension(338, 300));
        addBorrowingDialog.setModal(true);
        addBorrowingDialog.setResizable(false);
        addBorrowingDialog.setSize(new java.awt.Dimension(400, 300));
        addBorrowingDialog.getContentPane().setLayout(new java.awt.CardLayout());

        addBorrowingScreenPanel.setLayout(new java.awt.GridBagLayout());

        startDateInput.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        addBorrowingScreenPanel.add(startDateInput, gridBagConstraints);

        personNameInput.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        addBorrowingScreenPanel.add(personNameInput, gridBagConstraints);

        personGroupInput.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        addBorrowingScreenPanel.add(personGroupInput, gridBagConstraints);

        itemInput.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        addBorrowingScreenPanel.add(itemInput, gridBagConstraints);

        addBorrowingConfirmButton.setText("Confirm");
        addBorrowingConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBorrowingConfirmButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        addBorrowingScreenPanel.add(addBorrowingConfirmButton, gridBagConstraints);

        dateLabel.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        addBorrowingScreenPanel.add(dateLabel, gridBagConstraints);

        nameLabel.setText("Name(s)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        addBorrowingScreenPanel.add(nameLabel, gridBagConstraints);

        groupLabel.setText("Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        addBorrowingScreenPanel.add(groupLabel, gridBagConstraints);

        itemLabel.setText("Item");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        addBorrowingScreenPanel.add(itemLabel, gridBagConstraints);

        personLastNameInput.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        addBorrowingScreenPanel.add(personLastNameInput, gridBagConstraints);

        lastNameLabel.setText("Last Name(s)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        addBorrowingScreenPanel.add(lastNameLabel, gridBagConstraints);

        addBorrowingDialog.getContentPane().add(addBorrowingScreenPanel, "card2");

        addBorrowingDialog.setLocationRelativeTo(null);

        borrowingInfoDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        borrowingInfoDialog.setTitle("Borrowing Information");
        borrowingInfoDialog.setModal(true);
        borrowingInfoDialog.setResizable(false);
        borrowingInfoDialog.setSize(new java.awt.Dimension(400, 300));
        borrowingInfoDialog.getContentPane().setLayout(new java.awt.CardLayout());

        borrowingInfoScreenPanel.setLayout(new java.awt.GridBagLayout());

        itemInventoryInfoLabel.setText("Item Inventory:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        borrowingInfoScreenPanel.add(itemInventoryInfoLabel, gridBagConstraints);

        nameInfoLabel.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        borrowingInfoScreenPanel.add(nameInfoLabel, gridBagConstraints);

        lastNameInfoLabel.setText("Last Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        borrowingInfoScreenPanel.add(lastNameInfoLabel, gridBagConstraints);

        groupInfoLabel.setText("Group:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        borrowingInfoScreenPanel.add(groupInfoLabel, gridBagConstraints);

        startDateInfoLabel.setText("Start Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        borrowingInfoScreenPanel.add(startDateInfoLabel, gridBagConstraints);

        endDateInfoLabel.setText("End Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        borrowingInfoScreenPanel.add(endDateInfoLabel, gridBagConstraints);

        borrowerInfoLabel.setText("Borrower:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        borrowingInfoScreenPanel.add(borrowerInfoLabel, gridBagConstraints);

        endBorrowingGoToButton.setText("End Borrowing");
        endBorrowingGoToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endBorrowingGoToButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        borrowingInfoScreenPanel.add(endBorrowingGoToButton, gridBagConstraints);

        borrowingInfoDialog.getContentPane().add(borrowingInfoScreenPanel, "card2");

        borrowingInfoDialog.setLocationRelativeTo(null);

        endBorrowingDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        endBorrowingDialog.setTitle("End Borrowing");
        endBorrowingDialog.setModal(true);
        endBorrowingDialog.setSize(new java.awt.Dimension(400, 300));

        endBorrowingScreenPanel.setLayout(new java.awt.GridBagLayout());

        endBorrowingButton.setText("End Borrowing");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        endBorrowingScreenPanel.add(endBorrowingButton, gridBagConstraints);

        endDateInput.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        endBorrowingScreenPanel.add(endDateInput, gridBagConstraints);

        jLabel1.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        endBorrowingScreenPanel.add(jLabel1, gridBagConstraints);

        endBorrowingDialog.getContentPane().add(endBorrowingScreenPanel, java.awt.BorderLayout.CENTER);

        endBorrowingDialog.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        mainScreenPanel.setLayout(new java.awt.GridBagLayout());

        addBorrowingButton.setText("Add Borrowing");
        addBorrowingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBorrowingButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        mainScreenPanel.add(addBorrowingButton, gridBagConstraints);

        viewCurrentBorrowingsButton.setText("View Current Borrowings");
        viewCurrentBorrowingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCurrentBorrowingsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        mainScreenPanel.add(viewCurrentBorrowingsButton, gridBagConstraints);

        viewHistoryButton.setText("View History");
        viewHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHistoryButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        mainScreenPanel.add(viewHistoryButton, gridBagConstraints);

        viewInventoryButton.setText("View Inventory");
        viewInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        mainScreenPanel.add(viewInventoryButton, gridBagConstraints);

        jLabel2.setText("Aqui va algo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 50, 0);
        mainScreenPanel.add(jLabel2, gridBagConstraints);

        getContentPane().add(mainScreenPanel, "card2");

        currentBorrowingsScreenPanel.setLayout(new java.awt.GridBagLayout());

        currentBorrowingsFullTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] {"Name","Last Name","Inventory","Category","Start Date"}));
        jScrollPane2.setViewportView(currentBorrowingsFullTable);

        currentBorrowingsScreenPanel.add(jScrollPane2, new java.awt.GridBagConstraints());

        backCurrentBorrowingsScreenButton.setText("Back");
        backCurrentBorrowingsScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCurrentBorrowingsScreenButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        currentBorrowingsScreenPanel.add(backCurrentBorrowingsScreenButton, gridBagConstraints);

        getContentPane().add(currentBorrowingsScreenPanel, "card3");

        historyScreenPanel.setLayout(new java.awt.GridBagLayout());

        borrowingsHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(borrowingsHistoryTable);

        historyScreenPanel.add(jScrollPane3, new java.awt.GridBagConstraints());

        backHistoryScreenButton.setText("Back");
        backHistoryScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backHistoryScreenButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        historyScreenPanel.add(backHistoryScreenButton, gridBagConstraints);

        getContentPane().add(historyScreenPanel, "card4");

        inventoryScreenPanel.setLayout(new java.awt.GridBagLayout());

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(inventoryTable);

        inventoryScreenPanel.add(jScrollPane4, new java.awt.GridBagConstraints());

        backInventoryScreenButton.setText("Back");
        backInventoryScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backInventoryScreenButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        inventoryScreenPanel.add(backInventoryScreenButton, gridBagConstraints);

        getContentPane().add(inventoryScreenPanel, "card5");

        userMenu.setText("User");

        addUserItem.setText("Add User");
        userMenu.add(addUserItem);

        endSessionItem.setText("End Session");
        endSessionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endSessionItemActionPerformed(evt);
            }
        });
        userMenu.add(endSessionItem);

        mainMenuBar.add(userMenu);

        borrowingsMenu.setText("Borrowings");

        addBorrowingItem.setText("Add Borrowing");
        addBorrowingItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBorrowingItemActionPerformed(evt);
            }
        });
        borrowingsMenu.add(addBorrowingItem);

        mainMenuBar.add(borrowingsMenu);

        inventoryMenu.setText("Inventory");

        viewInventoryItem.setText("View Inventory");
        viewInventoryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryItemActionPerformed(evt);
            }
        });
        inventoryMenu.add(viewInventoryItem);

        importCsvItem.setText("Import CSV");
        inventoryMenu.add(importCsvItem);

        addItemItem.setText("Add Item");
        inventoryMenu.add(addItemItem);

        mainMenuBar.add(inventoryMenu);

        aboutMenu.setText("About");

        aboutUsItem.setText("About Us");
        aboutUsItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsItemActionPerformed(evt);
            }
        });
        aboutMenu.add(aboutUsItem);

        mainMenuBar.add(aboutMenu);

        setJMenuBar(mainMenuBar);

        setSize(new java.awt.Dimension(810, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBorrowingItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBorrowingItemActionPerformed
        addBorrowingDialog.setVisible(true);
    }//GEN-LAST:event_addBorrowingItemActionPerformed

    private void addBorrowingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBorrowingButtonActionPerformed
        addBorrowingDialog.setVisible(true);
    }//GEN-LAST:event_addBorrowingButtonActionPerformed

    private void viewCurrentBorrowingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCurrentBorrowingsButtonActionPerformed
        currentBorrowingsScreenPanel.setVisible(true);
        mainScreenPanel.setVisible(false);
    }//GEN-LAST:event_viewCurrentBorrowingsButtonActionPerformed

    private void endBorrowingGoToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endBorrowingGoToButtonActionPerformed
        endBorrowingDialog.setVisible(true);
    }//GEN-LAST:event_endBorrowingGoToButtonActionPerformed

    private void viewInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryButtonActionPerformed
        inventoryScreenPanel.setVisible(true);
        mainScreenPanel.setVisible(false);
    }//GEN-LAST:event_viewInventoryButtonActionPerformed

    private void viewHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHistoryButtonActionPerformed
        historyScreenPanel.setVisible(true);
        mainScreenPanel.setVisible(false);
    }//GEN-LAST:event_viewHistoryButtonActionPerformed

    private void backCurrentBorrowingsScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCurrentBorrowingsScreenButtonActionPerformed
        currentBorrowingsScreenPanel.setVisible(false);
        mainScreenPanel.setVisible(true);
    }//GEN-LAST:event_backCurrentBorrowingsScreenButtonActionPerformed

    private void backHistoryScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backHistoryScreenButtonActionPerformed
        historyScreenPanel.setVisible(false);
        mainScreenPanel.setVisible(true);
    }//GEN-LAST:event_backHistoryScreenButtonActionPerformed

    private void backInventoryScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backInventoryScreenButtonActionPerformed
        inventoryScreenPanel.setVisible(false);
        mainScreenPanel.setVisible(true);
    }//GEN-LAST:event_backInventoryScreenButtonActionPerformed

    private void viewInventoryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryItemActionPerformed
        inventoryScreenPanel.setVisible(true);
        mainScreenPanel.setVisible(false);
    }//GEN-LAST:event_viewInventoryItemActionPerformed

    private void endSessionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endSessionItemActionPerformed
        //Need to put this in its own method...maybe
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_endSessionItemActionPerformed

    private void aboutUsItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsItemActionPerformed
        JOptionPane.showMessageDialog(null, "I'm Batman");
    }//GEN-LAST:event_aboutUsItemActionPerformed

    private void addBorrowingConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBorrowingConfirmButtonActionPerformed
        //This is a placeholder implementation
        if (!personNameInput.getText().equals("") && !startDateInput.getText().equals("") && !personLastNameInput.getText().equals("") && !personGroupInput.getText().equals("") && !itemInput.getText().equals("")){
            DefaultTableModel model = (DefaultTableModel) currentBorrowingsFullTable.getModel();
            model.addRow(new Object[]{
                personNameInput.getText(),
                personLastNameInput.getText(),
                itemInput.getText(),
                "PC",
                startDateInput.getText()
            });
            addBorrowingDialog.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Rellena todos los campos");
        }
    }//GEN-LAST:event_addBorrowingConfirmButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem aboutUsItem;
    private javax.swing.JButton addBorrowingButton;
    private javax.swing.JButton addBorrowingConfirmButton;
    private javax.swing.JDialog addBorrowingDialog;
    private javax.swing.JMenuItem addBorrowingItem;
    private javax.swing.JPanel addBorrowingScreenPanel;
    private javax.swing.JMenuItem addItemItem;
    private javax.swing.JMenuItem addUserItem;
    private javax.swing.JButton backCurrentBorrowingsScreenButton;
    private javax.swing.JButton backHistoryScreenButton;
    private javax.swing.JButton backInventoryScreenButton;
    private javax.swing.JLabel borrowerInfoLabel;
    private javax.swing.JDialog borrowingInfoDialog;
    private javax.swing.JPanel borrowingInfoScreenPanel;
    private javax.swing.JTable borrowingsHistoryTable;
    private javax.swing.JMenu borrowingsMenu;
    private javax.swing.JTable currentBorrowingsFullTable;
    private javax.swing.JPanel currentBorrowingsScreenPanel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton endBorrowingButton;
    private javax.swing.JDialog endBorrowingDialog;
    private javax.swing.JButton endBorrowingGoToButton;
    private javax.swing.JPanel endBorrowingScreenPanel;
    private javax.swing.JLabel endDateInfoLabel;
    private javax.swing.JTextField endDateInput;
    private javax.swing.JMenuItem endSessionItem;
    private javax.swing.JLabel groupInfoLabel;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JPanel historyScreenPanel;
    private javax.swing.JMenuItem importCsvItem;
    private javax.swing.JMenu inventoryMenu;
    private javax.swing.JPanel inventoryScreenPanel;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JTextField itemInput;
    private javax.swing.JLabel itemInventoryInfoLabel;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lastNameInfoLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JPanel mainScreenPanel;
    private javax.swing.JLabel nameInfoLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField personGroupInput;
    private javax.swing.JTextField personLastNameInput;
    private javax.swing.JTextField personNameInput;
    private javax.swing.JLabel startDateInfoLabel;
    private javax.swing.JTextField startDateInput;
    private javax.swing.JMenu userMenu;
    private javax.swing.JButton viewCurrentBorrowingsButton;
    private javax.swing.JButton viewHistoryButton;
    private javax.swing.JButton viewInventoryButton;
    private javax.swing.JMenuItem viewInventoryItem;
    // End of variables declaration//GEN-END:variables
}
