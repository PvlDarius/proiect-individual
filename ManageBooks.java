package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Darius
 */
public class ManageBooks extends javax.swing.JFrame {
    DefaultTableModel model;
    public ManageBooks() {
        initComponents();
        setBookDetailsToTable();
    }

    public void setBookDetailsToTable(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_carte 'ID', titlu 'Title', autor 'Author', nr_pagini 'Pages', gen 'Genre', "
                    + "editura 'Publisher', an_aparitie 'Release Year', cantitate 'Quantity' FROM carti");
            bookTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public boolean addBook(){
        boolean isAdded = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("INSERT INTO carti VALUES (?,?,?,?,?,?,?,?)");
            pst.setInt(1, Integer.parseInt(idField.getText()));
            pst.setString(2, titleField.getText());
            pst.setString(3, authorField.getText());
            pst.setInt(4, Integer.parseInt(pagesField.getText()));
            pst.setString(5, genreList.getSelectedItem().toString());
            pst.setString(6, publisherField.getText());
            pst.setInt(7, Integer.parseInt(yearOfReleaseField.getText()));
            pst.setInt(8, Integer.parseInt(quantityField.getText()));

            int rowCount = pst.executeUpdate();
            if(rowCount > 0)
                isAdded = true;
            else
                isAdded = false;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAdded;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        backHome = new javax.swing.JButton();
        bookIdLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        bookTitleLabel = new javax.swing.JLabel();
        bookAuthorLabel = new javax.swing.JLabel();
        authorField = new javax.swing.JTextField();
        numberOfPagesLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        publisherField = new javax.swing.JTextField();
        yearOfReleaseLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        addBookButton = new javax.swing.JButton();
        updateBookButton = new javax.swing.JButton();
        deleteBookButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        pagesField = new javax.swing.JTextField();
        yearOfReleaseField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        genreList = new javax.swing.JComboBox<>();
        tablePanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        manageBooksLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        formPanel.setBackground(new java.awt.Color(51, 102, 255));

        backHome.setBackground(new java.awt.Color(255, 0, 51));
        backHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backHome.setText("Back Home");
        backHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHomeMouseClicked(evt);
            }
        });

        bookIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookIdLabel.setText("Book ID");

        bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookTitleLabel.setText("Book Title");

        bookAuthorLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookAuthorLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookAuthorLabel.setText("Book Author");

        numberOfPagesLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        numberOfPagesLabel.setForeground(new java.awt.Color(0, 0, 0));
        numberOfPagesLabel.setText("Number of Pages");

        genreLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        genreLabel.setForeground(new java.awt.Color(0, 0, 0));
        genreLabel.setText("Genre");

        publisherLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        publisherLabel.setForeground(new java.awt.Color(0, 0, 0));
        publisherLabel.setText("Publisher");

        yearOfReleaseLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        yearOfReleaseLabel.setForeground(new java.awt.Color(0, 0, 0));
        yearOfReleaseLabel.setText("Year of Release");

        quantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        quantityLabel.setForeground(new java.awt.Color(0, 0, 0));
        quantityLabel.setText("Quantity");

        addBookButton.setBackground(new java.awt.Color(255, 0, 51));
        addBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        addBookButton.setText("Add Book");
        addBookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookButtonMouseClicked(evt);
            }
        });

        updateBookButton.setBackground(new java.awt.Color(255, 0, 51));
        updateBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        updateBookButton.setText("Update Book");
        updateBookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBookButtonMouseClicked(evt);
            }
        });

        deleteBookButton.setBackground(new java.awt.Color(255, 0, 51));
        deleteBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        deleteBookButton.setText("Delete Book");
        deleteBookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBookButtonMouseClicked(evt);
            }
        });

        genreList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Children", "Dictionary", "Educational", "Poems", "Thriller" }));
        genreList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backHome)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addComponent(addBookButton)
                                        .addGap(26, 26, 26)
                                        .addComponent(updateBookButton)
                                        .addGap(27, 27, 27)
                                        .addComponent(deleteBookButton))
                                    .addComponent(numberOfPagesLabel)
                                    .addComponent(yearOfReleaseLabel)
                                    .addComponent(quantityLabel)
                                    .addComponent(bookIdLabel)
                                    .addComponent(bookTitleLabel)
                                    .addComponent(bookAuthorLabel)
                                    .addComponent(genreLabel)
                                    .addComponent(publisherLabel)))))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(publisherField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearOfReleaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagesField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genreList, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backHome)
                .addGap(18, 18, 18)
                .addComponent(bookIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookAuthorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberOfPagesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genreList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(publisherLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(publisherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearOfReleaseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearOfReleaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookButton)
                    .addComponent(updateBookButton)
                    .addComponent(deleteBookButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tablePanel.setBackground(new java.awt.Color(234, 253, 248));

        closeButton.setBackground(new java.awt.Color(255, 0, 51));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        manageBooksLabel.setBackground(new java.awt.Color(255, 0, 51));
        manageBooksLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        manageBooksLabel.setForeground(new java.awt.Color(255, 0, 51));
        manageBooksLabel.setText("Manage Books");

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                        .addComponent(manageBooksLabel)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addContainerGap())))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBooksLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Pages", "Genre", "Publisher", "Year", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void backHomeMouseClicked(java.awt.event.MouseEvent evt) {
        HomePage home = new HomePage();
        home.setVisible(true);
        dispose();
    }

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {
        int rowNumber = bookTable.getSelectedRow();
        TableModel model = bookTable.getModel();
        idField.setText(model.getValueAt(rowNumber, 0).toString());
        titleField.setText(model.getValueAt(rowNumber, 1).toString());
        authorField.setText(model.getValueAt(rowNumber, 2).toString());
        pagesField.setText(model.getValueAt(rowNumber, 3).toString());
        genreList.setSelectedItem(model.getValueAt(rowNumber, 4).toString());
        publisherField.setText(model.getValueAt(rowNumber, 5).toString());
        yearOfReleaseField.setText(model.getValueAt(rowNumber, 6).toString());
        quantityField.setText(model.getValueAt(rowNumber, 7).toString());
    }

    private void addBookButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if(addBook() == true){
            JOptionPane.showMessageDialog(this, "Book Added Successfully!");
            setBookDetailsToTable();
        }
        else
        JOptionPane.showMessageDialog(this, "Book was not added!");   
    }

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void updateBookButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if(idField.getText().isEmpty() || titleField.getText().isEmpty() || authorField.getText().isEmpty() || pagesField.getText().isEmpty() || publisherField.getText().isEmpty() || yearOfReleaseField.getText().isEmpty() || quantityField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Book information was not selected!");
        }
        else{
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
                String updateQuery = "UPDATE carti SET titlu = '"+ titleField.getText() + "',  autor = '"+ authorField.getText() + "', "
                        + "nr_pagini = '"+ pagesField.getText() + "', gen = '" + genreList.getSelectedItem().toString() + "', "
                        + "editura = '" + publisherField.getText() + "', an_aparitie = '" + yearOfReleaseField.getText() + "', cantitate = '"+ quantityField.getText() + "' "
                        + "WHERE id_carte = " + idField.getText() + ";";
                Statement add = con.createStatement();
                add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Book updated successfully!");
            } catch(Exception e){
                e.printStackTrace();
            }
            setBookDetailsToTable();
        }
    }

    private void deleteBookButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if(idField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select a book to delete!");
        }
        else{
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
                String idToDelete = idField.getText();
                String query = "DELETE FROM carti WHERE id_carte = " + idToDelete;
                Statement add = con.createStatement();
                add.executeUpdate(query);
                setBookDetailsToTable();
                JOptionPane.showMessageDialog(this, "Book deleted successfully!");
            } catch(Exception e){
                e.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooks().setVisible(true);
            }
        });
    }

    private javax.swing.JButton addBookButton;
    private javax.swing.JTextField authorField;
    private javax.swing.JButton backHome;
    private javax.swing.JLabel bookAuthorLabel;
    private javax.swing.JLabel bookIdLabel;
    private javax.swing.JTable bookTable;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteBookButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JComboBox<String> genreList;
    private javax.swing.JTextField idField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel manageBooksLabel;
    private javax.swing.JLabel numberOfPagesLabel;
    private javax.swing.JTextField pagesField;
    private javax.swing.JTextField publisherField;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTextField titleField;
    private javax.swing.JButton updateBookButton;
    private javax.swing.JTextField yearOfReleaseField;
    private javax.swing.JLabel yearOfReleaseLabel;
}
