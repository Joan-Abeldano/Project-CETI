/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

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
        mainScreenPanel = new javax.swing.JPanel();
        addBorrowingButton = new javax.swing.JButton();
        viewCurrentBorrowingsButton = new javax.swing.JButton();
        viewHistoryButton = new javax.swing.JButton();
        viewInventoryButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        currentBorrowingsScreenPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentBorrowingsFullTable = new javax.swing.JTable();
        backButton1 = new javax.swing.JButton();
        historyScreenPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowingsHistoryTable = new javax.swing.JTable();
        backButton2 = new javax.swing.JButton();
        inventoryScreenPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        backButton3 = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        userMenu = new javax.swing.JMenu();
        viewUserItem = new javax.swing.JMenuItem();
        endSessionItem = new javax.swing.JMenuItem();
        borrowingsMenu = new javax.swing.JMenu();
        addBorrowingItem = new javax.swing.JMenuItem();
        inventoryMenu = new javax.swing.JMenu();
        viewInventoryItem = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();

        addBorrowingDialog.setTitle("Add Borrowing");
        addBorrowingDialog.setMinimumSize(new java.awt.Dimension(338, 300));
        addBorrowingDialog.setModal(true);
        addBorrowingDialog.setPreferredSize(new java.awt.Dimension(400, 300));
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        addBorrowingScreenPanel.add(addBorrowingConfirmButton, gridBagConstraints);

        dateLabel.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        addBorrowingScreenPanel.add(dateLabel, gridBagConstraints);

        nameLabel.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        addBorrowingScreenPanel.add(nameLabel, gridBagConstraints);

        groupLabel.setText("Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        addBorrowingScreenPanel.add(groupLabel, gridBagConstraints);

        itemLabel.setText("Item");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        addBorrowingScreenPanel.add(itemLabel, gridBagConstraints);

        addBorrowingDialog.getContentPane().add(addBorrowingScreenPanel, "card2");

        addBorrowingDialog.setLocationRelativeTo(null);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        mainScreenPanel.add(viewCurrentBorrowingsButton, gridBagConstraints);

        viewHistoryButton.setText("View History");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        mainScreenPanel.add(viewHistoryButton, gridBagConstraints);

        viewInventoryButton.setText("View Inventory");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        mainScreenPanel.add(viewInventoryButton, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        mainScreenPanel.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(mainScreenPanel, "card2");

        currentBorrowingsScreenPanel.setLayout(new java.awt.GridBagLayout());

        currentBorrowingsFullTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(currentBorrowingsFullTable);

        currentBorrowingsScreenPanel.add(jScrollPane2, new java.awt.GridBagConstraints());

        backButton1.setText("Back");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        currentBorrowingsScreenPanel.add(backButton1, gridBagConstraints);

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

        backButton2.setText("Back");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        historyScreenPanel.add(backButton2, gridBagConstraints);

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

        backButton3.setText("Back");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        inventoryScreenPanel.add(backButton3, gridBagConstraints);

        getContentPane().add(inventoryScreenPanel, "card5");

        userMenu.setText("User");

        viewUserItem.setText("View User");
        userMenu.add(viewUserItem);

        endSessionItem.setText("End Session");
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
        inventoryMenu.add(viewInventoryItem);

        mainMenuBar.add(inventoryMenu);

        aboutMenu.setText("About");
        mainMenuBar.add(aboutMenu);

        setJMenuBar(mainMenuBar);

        setSize(new java.awt.Dimension(810, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBorrowingItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBorrowingItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBorrowingItemActionPerformed

    private void addBorrowingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBorrowingButtonActionPerformed
        addBorrowingDialog.setVisible(true);
    }//GEN-LAST:event_addBorrowingButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton addBorrowingButton;
    private javax.swing.JButton addBorrowingConfirmButton;
    private javax.swing.JDialog addBorrowingDialog;
    private javax.swing.JMenuItem addBorrowingItem;
    private javax.swing.JPanel addBorrowingScreenPanel;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton backButton2;
    private javax.swing.JButton backButton3;
    private javax.swing.JTable borrowingsHistoryTable;
    private javax.swing.JMenu borrowingsMenu;
    private javax.swing.JTable currentBorrowingsFullTable;
    private javax.swing.JPanel currentBorrowingsScreenPanel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JMenuItem endSessionItem;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JPanel historyScreenPanel;
    private javax.swing.JMenu inventoryMenu;
    private javax.swing.JPanel inventoryScreenPanel;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JTextField itemInput;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JPanel mainScreenPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField personGroupInput;
    private javax.swing.JTextField personNameInput;
    private javax.swing.JTextField startDateInput;
    private javax.swing.JMenu userMenu;
    private javax.swing.JButton viewCurrentBorrowingsButton;
    private javax.swing.JButton viewHistoryButton;
    private javax.swing.JButton viewInventoryButton;
    private javax.swing.JMenuItem viewInventoryItem;
    private javax.swing.JMenuItem viewUserItem;
    // End of variables declaration//GEN-END:variables
}
