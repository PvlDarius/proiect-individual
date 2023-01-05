package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Darius
 */
public class ManageReaders extends javax.swing.JFrame {
    DefaultTableModel model;

    public ManageReaders() {
        initComponents();
        setReaderDetailsToTable();
    }

    public void setReaderDetailsToTable(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_cititor 'ID', prenume 'First Name', nume 'Last Name', telefon 'Phone', varsta 'Age', "
                    + "data_inregistrarii 'Reg. Date' FROM cititori");
            readersTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public boolean addReader(){
        boolean isAdded = false;
        java.util.Date registrationDate = registrationDateChooser.getDate();
        java.sql.Date inputRegistrationDate = new java.sql.Date(registrationDate.getTime());
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("INSERT INTO cititori VALUES (?,?,?,?,?,?)");
            pst.setInt(1, Integer.parseInt(idField.getText()));
            pst.setString(2, firstNameField.getText());
            pst.setString(3, lastNameField.getText());
            pst.setString(4, phoneField.getText());
            pst.setInt(5, Integer.parseInt(ageField.getText()));
            pst.setDate(6, inputRegistrationDate);

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
        idLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        registrationDateLabel = new javax.swing.JLabel();
        addReaderButton = new javax.swing.JButton();
        updateReaderButton = new javax.swing.JButton();
        deleteReaderButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        registrationDateChooser = new com.toedter.calendar.JDateChooser();
        tablePanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        manageReadersLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        readersTable = new javax.swing.JTable();

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

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("Reader's ID");

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        firstNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setText("Reader's First Name");

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        lastNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setText("Reader's Last Name");

        phoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        phoneNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumberLabel.setText("Reader's Phone Number");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        ageLabel.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel.setText("Reader's Age");

        registrationDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        registrationDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        registrationDateLabel.setText("Registration Date");

        addReaderButton.setBackground(new java.awt.Color(255, 0, 51));
        addReaderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        addReaderButton.setText("Add Reader");
        addReaderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReaderButtonMouseClicked(evt);
            }
        });

        updateReaderButton.setBackground(new java.awt.Color(255, 0, 51));
        updateReaderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        updateReaderButton.setText("Update Reader");
        updateReaderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateReaderButtonMouseClicked(evt);
            }
        });

        deleteReaderButton.setBackground(new java.awt.Color(255, 0, 51));
        deleteReaderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        deleteReaderButton.setText("Delete Reader");
        deleteReaderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteReaderButtonMouseClicked(evt);
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
                                    .addComponent(phoneNumberLabel)
                                    .addComponent(registrationDateLabel)
                                    .addComponent(firstNameLabel)
                                    .addComponent(lastNameLabel)
                                    .addComponent(ageLabel)
                                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(addReaderButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                        .addComponent(deleteReaderButton))))))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(updateReaderButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backHome)
                .addGap(65, 65, 65)
                .addComponent(idLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addReaderButton)
                    .addComponent(deleteReaderButton))
                .addGap(18, 18, 18)
                .addComponent(updateReaderButton)
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

        manageReadersLabel.setBackground(new java.awt.Color(255, 0, 51));
        manageReadersLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        manageReadersLabel.setForeground(new java.awt.Color(255, 0, 51));
        manageReadersLabel.setText("Manage Readers");

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                        .addComponent(manageReadersLabel)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addContainerGap())))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageReadersLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        readersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone", "Age", "Reg. Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        readersTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        readersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(readersTable);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

    private void readersTableMouseClicked(java.awt.event.MouseEvent evt) {
        int rowNumber = readersTable.getSelectedRow();
        TableModel model = readersTable.getModel();
        idField.setText(model.getValueAt(rowNumber, 0).toString());
        firstNameField.setText(model.getValueAt(rowNumber, 1).toString());
        lastNameField.setText(model.getValueAt(rowNumber, 2).toString());
        phoneField.setText(model.getValueAt(rowNumber, 3).toString());
        ageField.setText(model.getValueAt(rowNumber, 4).toString());
        registrationDateChooser.setDate((java.sql.Date)model.getValueAt(rowNumber, 5));
    }

    private void addReaderButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if(addReader() == true){
            JOptionPane.showMessageDialog(this, "Reader Added Successfully!");
            setReaderDetailsToTable();
        }
        else
        JOptionPane.showMessageDialog(this, "Reader was not added!");   
    }

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void updateReaderButtonMouseClicked(java.awt.event.MouseEvent evt) {
        java.util.Date registrationDate = registrationDateChooser.getDate();
        java.sql.Date inputRegistrationDate = new java.sql.Date(registrationDate.getTime());
        if(idField.getText().isEmpty() || firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || phoneField.getText().isEmpty() || ageField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Reader information was not selected!");
        }
        else{
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
                String updateQuery = "UPDATE cititori SET prenume = '"+ firstNameField.getText() + "',  nume = '"+ lastNameField.getText() + "', "
                        + "telefon = '"+ phoneField.getText() + "', varsta = '" + ageField.getText() + "', data_inregistrarii = '" 
                        + inputRegistrationDate + "' WHERE id_cititor = " + idField.getText() + ";";
                Statement add = con.createStatement();
                add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Reader updated successfully!");
            } catch(Exception e){
                e.printStackTrace();
            }
            setReaderDetailsToTable();
        }
    }

    private void deleteReaderButtonMouseClicked(java.awt.event.MouseEvent evt) {
        if(idField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select a Reader to delete!");
        }
        else{
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
                String idToDelete = idField.getText();
                String query = "DELETE FROM cititori WHERE id_cititor = " + idToDelete;
                Statement add = con.createStatement();
                add.executeUpdate(query);
                setReaderDetailsToTable();
                JOptionPane.showMessageDialog(this, "Reader deleted successfully!");
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
            java.util.logging.Logger.getLogger(ManageReaders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReaders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReaders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReaders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReaders().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton addReaderButton;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backHome;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteReaderButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel manageReadersLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTable readersTable;
    private com.toedter.calendar.JDateChooser registrationDateChooser;
    private javax.swing.JLabel registrationDateLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateReaderButton;
}
