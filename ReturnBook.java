package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Darius
 */
public class ReturnBook extends javax.swing.JFrame {
    public ReturnBook() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bookDetailsPanel = new javax.swing.JPanel();
        backHome = new javax.swing.JButton();
        bookDetailsLabel = new javax.swing.JLabel();
        issueIdLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        issueDateLabel = new javax.swing.JLabel();
        dueDateLabel = new javax.swing.JLabel();
        issueIdEmptyLabel = new javax.swing.JLabel();
        bookTitleEmptyLabel = new javax.swing.JLabel();
        firstNameEmptyLabel = new javax.swing.JLabel();
        lastNameEmptyLabel = new javax.swing.JLabel();
        issueDateEmptyLabel = new javax.swing.JLabel();
        dueDateEmptyLabel = new javax.swing.JLabel();
        issueErrorLabel = new javax.swing.JLabel();
        readerDetailPanel = new javax.swing.JPanel();
        findIssueButton = new javax.swing.JButton();
        returnReaderIdField = new javax.swing.JTextField();
        issueReaderIdLabel = new javax.swing.JLabel();
        returnBookIdField = new javax.swing.JTextField();
        issueBookIdLabel = new javax.swing.JLabel();
        returnBookLabel = new javax.swing.JLabel();
        returnBookButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 253, 248));

        bookDetailsPanel.setBackground(new java.awt.Color(51, 102, 255));

        backHome.setBackground(new java.awt.Color(255, 0, 51));
        backHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        backHome.setText("Back Home");
        backHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHomeMouseClicked(evt);
            }
        });

        bookDetailsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        bookDetailsLabel.setForeground(new java.awt.Color(234, 253, 248));
        bookDetailsLabel.setText("Issue Details");

        issueIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        issueIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        issueIdLabel.setText("Issue ID:");

        bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookTitleLabel.setText("Title:");

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        firstNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setText("Reader's First Name:");

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        lastNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setText("Reader's Last Name:");

        issueDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        issueDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        issueDateLabel.setText("Issue Date:");

        dueDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        dueDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        dueDateLabel.setText("Due Date:");

        issueIdEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        issueIdEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        bookTitleEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookTitleEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        firstNameEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        firstNameEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        lastNameEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        lastNameEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        issueDateEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        issueDateEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        dueDateEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        dueDateEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        issueErrorLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        issueErrorLabel.setForeground(new java.awt.Color(241, 211, 2));

        javax.swing.GroupLayout bookDetailsPanelLayout = new javax.swing.GroupLayout(bookDetailsPanel);
        bookDetailsPanel.setLayout(bookDetailsPanelLayout);
        bookDetailsPanelLayout.setHorizontalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(bookDetailsLabel)
                .addGap(77, 77, 77))
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backHome))
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(issueIdLabel)
                                    .addComponent(lastNameLabel)
                                    .addComponent(bookTitleLabel)
                                    .addComponent(firstNameLabel)
                                    .addComponent(issueDateLabel)
                                    .addComponent(dueDateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookDetailsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(issueErrorLabel)
                                .addGap(104, 104, 104)))
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(issueIdEmptyLabel)
                            .addComponent(bookTitleEmptyLabel)
                            .addComponent(firstNameEmptyLabel)
                            .addComponent(lastNameEmptyLabel)
                            .addComponent(issueDateEmptyLabel)
                            .addComponent(dueDateEmptyLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookDetailsPanelLayout.setVerticalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addComponent(issueIdEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookTitleEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(firstNameEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(issueDateEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(dueDateEmptyLabel))
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addComponent(backHome)
                        .addGap(36, 36, 36)
                        .addComponent(bookDetailsLabel)
                        .addGap(69, 69, 69)
                        .addComponent(issueIdLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookTitleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(firstNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(issueDateLabel)
                        .addGap(18, 18, 18)
                        .addComponent(dueDateLabel)))
                .addGap(37, 37, 37)
                .addComponent(issueErrorLabel)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        readerDetailPanel.setBackground(new java.awt.Color(255, 0, 51));

        findIssueButton.setBackground(new java.awt.Color(51, 102, 255));
        findIssueButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        findIssueButton.setForeground(new java.awt.Color(234, 253, 248));
        findIssueButton.setText("Find Issue");
        findIssueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findIssueButtonMouseClicked(evt);
            }
        });
        findIssueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findIssueButtonActionPerformed(evt);
            }
        });

        returnReaderIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                returnReaderIdFieldFocusLost(evt);
            }
        });
        returnReaderIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnReaderIdFieldActionPerformed(evt);
            }
        });

        issueReaderIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        issueReaderIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        issueReaderIdLabel.setText("Reader ID:");

        returnBookIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                returnBookIdFieldFocusLost(evt);
            }
        });

        issueBookIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        issueBookIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        issueBookIdLabel.setText("Book ID:");

        returnBookLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        returnBookLabel.setForeground(new java.awt.Color(234, 253, 248));
        returnBookLabel.setText("Return Book");

        returnBookButton.setBackground(new java.awt.Color(51, 102, 255));
        returnBookButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        returnBookButton.setForeground(new java.awt.Color(234, 253, 248));
        returnBookButton.setText("Return Book");
        returnBookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBookButtonMouseClicked(evt);
            }
        });
        returnBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout readerDetailPanelLayout = new javax.swing.GroupLayout(readerDetailPanel);
        readerDetailPanel.setLayout(readerDetailPanelLayout);
        readerDetailPanelLayout.setHorizontalGroup(
            readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerDetailPanelLayout.createSequentialGroup()
                .addGroup(readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(readerDetailPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(issueBookIdLabel)
                            .addComponent(issueReaderIdLabel)
                            .addGroup(readerDetailPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(returnBookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returnReaderIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(readerDetailPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(returnBookLabel))))
                    .addGroup(readerDetailPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(findIssueButton))
                    .addGroup(readerDetailPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(returnBookButton)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        readerDetailPanelLayout.setVerticalGroup(
            readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerDetailPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(returnBookLabel)
                .addGap(79, 79, 79)
                .addComponent(issueBookIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnBookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(issueReaderIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnReaderIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(findIssueButton)
                .addGap(18, 18, 18)
                .addComponent(returnBookButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closeButton.setBackground(new java.awt.Color(255, 0, 51));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bookDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readerDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(readerDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    }

    private void backHomeMouseClicked(java.awt.event.MouseEvent evt) {
        HomePage home = new HomePage();
        home.setVisible(true);
        dispose();
    }

    private void findIssueButtonMouseClicked(java.awt.event.MouseEvent evt) {
        boolean success = false;
        int bookId = Integer.parseInt(returnBookIdField.getText());
        int readerId = Integer.parseInt(returnReaderIdField.getText());
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM imprumuturi WHERE id_carte = ? AND id_cititor = ? AND status = ?");
            pst.setInt(1, bookId);
            pst.setInt(2, readerId);
            pst.setString(3, "Pending");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                success = true;
                issueIdEmptyLabel.setText(rs.getString("id_imprumut"));
                bookTitleEmptyLabel.setText(rs.getString("titlu"));
                firstNameEmptyLabel.setText(rs.getString("prenume"));                
                lastNameEmptyLabel.setText(rs.getString("nume"));
                issueDateEmptyLabel.setText(rs.getString("data_imprumut"));                
                dueDateEmptyLabel.setText(rs.getString("data_expirare"));
                issueErrorLabel.setText("");
            }
            else{
                success = false;
                issueIdEmptyLabel.setText("");
                bookTitleEmptyLabel.setText("");
                firstNameEmptyLabel.setText("");                
                lastNameEmptyLabel.setText("");
                issueDateEmptyLabel.setText("");                
                dueDateEmptyLabel.setText("");
                issueErrorLabel.setText("No record found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }
    
    public void updateBookCount(){
        int bookId = Integer.parseInt(returnBookIdField.getText());
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("UPDATE carti SET cantitate = cantitate + 1 WHERE id_carte = ?"); 
            pst.setInt(1, bookId);
            int rowCount = pst.executeUpdate();
            if(rowCount > 0){
                JOptionPane.showMessageDialog(this, "Book count updated succesfully!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Error: Book count was not updated!");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void returnBookButtonMouseClicked(java.awt.event.MouseEvent evt) {
        boolean isReturned = false;
        int bookId = Integer.parseInt(returnBookIdField.getText());
        int readerId = Integer.parseInt(returnReaderIdField.getText());
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("UPDATE imprumuturi SET status = ? WHERE id_carte = ? AND id_cititor = ? AND status = ?");
            pst.setString(1, "Returned");
            pst.setInt(2, bookId);            
            pst.setInt(3, readerId);
            pst.setString(4, "Pending");
            int rowCount = pst.executeUpdate();
            if(rowCount > 0){
                JOptionPane.showMessageDialog(this, "Book returned successfully!");
                updateBookCount();
            }
            else
                JOptionPane.showMessageDialog(this, "Error: Book was not returned!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    private javax.swing.JButton backHome;
    private javax.swing.JLabel bookDetailsLabel;
    private javax.swing.JPanel bookDetailsPanel;
    private javax.swing.JLabel bookTitleEmptyLabel;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel dueDateEmptyLabel;
    private javax.swing.JLabel dueDateLabel;
    private javax.swing.JButton findIssueButton;
    private javax.swing.JLabel firstNameEmptyLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel issueBookIdLabel;
    private javax.swing.JLabel issueDateEmptyLabel;
    private javax.swing.JLabel issueDateLabel;
    private javax.swing.JLabel issueErrorLabel;
    private javax.swing.JLabel issueIdEmptyLabel;
    private javax.swing.JLabel issueIdLabel;
    private javax.swing.JLabel issueReaderIdLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameEmptyLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel readerDetailPanel;
    private javax.swing.JButton returnBookButton;
    private javax.swing.JTextField returnBookIdField;
    private javax.swing.JLabel returnBookLabel;
    private javax.swing.JTextField returnReaderIdField;
}
