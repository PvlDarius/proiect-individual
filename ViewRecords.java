package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Darius
 */
public class ViewRecords extends javax.swing.JFrame {
    public ViewRecords() {
        initComponents();
        setRecordDetailsToTable();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        backHome = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        recordsLabel = new javax.swing.JLabel();
        dateOneLabel = new javax.swing.JLabel();
        dateOneChooser = new com.toedter.calendar.JDateChooser();
        dateTwoChooser = new com.toedter.calendar.JDateChooser();
        dateTwoLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        statusList = new javax.swing.JComboBox<>();
        statusLabel = new javax.swing.JLabel();
        allButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        recordsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(234, 253, 248));

        headPanel.setBackground(new java.awt.Color(51, 102, 255));

        backHome.setBackground(new java.awt.Color(255, 0, 51));
        backHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        backHome.setText("Back Home");
        backHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHomeMouseClicked(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(255, 0, 51));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        recordsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        recordsLabel.setForeground(new java.awt.Color(234, 253, 248));
        recordsLabel.setText("View All Records");

        dateOneLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        dateOneLabel.setForeground(new java.awt.Color(0, 0, 0));
        dateOneLabel.setText("Between:");

        dateTwoLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        dateTwoLabel.setForeground(new java.awt.Color(0, 0, 0));
        dateTwoLabel.setText("And:");

        searchButton.setBackground(new java.awt.Color(255, 0, 51));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        searchButton.setForeground(new java.awt.Color(234, 253, 248));
        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        statusList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Pending", "Returned" }));

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        statusLabel.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel.setText("Status:");

        allButton.setBackground(new java.awt.Color(255, 0, 51));
        allButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        allButton.setForeground(new java.awt.Color(234, 253, 248));
        allButton.setText("All");
        allButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allButtonMouseClicked(evt);
            }
        });
        allButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backHome)
                .addGap(288, 288, 288)
                .addComponent(recordsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(dateOneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateOneChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateTwoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateTwoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addGap(18, 18, 18)
                .addComponent(allButton)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backHome)
                            .addComponent(closeButton)))
                    .addGroup(headPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(recordsLabel)))
                .addGap(18, 18, 18)
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel)))
                    .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton)
                        .addComponent(allButton))
                    .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateTwoLabel)
                        .addComponent(dateOneLabel)
                        .addComponent(dateOneChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateTwoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        recordsTable.setForeground(new java.awt.Color(0, 0, 0));
        recordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "issue_id", "book_id", "title", "reader_id", "first_name", "last_name", "issue_date", "due_date", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        recordsTable.setToolTipText("");
        recordsTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        recordsTable.setSelectionForeground(new java.awt.Color(234, 253, 248));
        recordsTable.setSurrendersFocusOnKeystroke(true);
        recordsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(recordsTable);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    public void setRecordDetailsToTable(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_imprumut 'Record ID', id_carte 'Book ID', titlu 'Title', id_cititor 'Reader ID', prenume 'First Name', nume 'Last Name', "
                    + "data_imprumut 'Issue Date', data_expirare 'Due Date', status 'Status' FROM imprumuturi");
            recordsTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    private void backHomeMouseClicked(java.awt.event.MouseEvent evt) {
        HomePage home = new HomePage();
        home.setVisible(true);
        dispose();
    }

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    public void clearTable(){
        DefaultTableModel model=(DefaultTableModel) recordsTable.getModel();
        model.setRowCount(0);
    }
    
    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model=(DefaultTableModel) recordsTable.getModel();
        Date dateOne = dateOneChooser.getDate();        
        Date dateTwo = dateTwoChooser.getDate();
        if(dateOne != null && dateTwo != null){
            java.sql.Date inputdateOne = new java.sql.Date(dateOne.getTime());
            java.sql.Date inputdateTwo = new java.sql.Date(dateTwo.getTime());
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
                PreparedStatement pst;
                switch (statusList.getSelectedItem().toString()) {
                    case "Any":
                        pst = con.prepareStatement("SELECT * FROM imprumuturi WHERE data_imprumut BETWEEN ? AND ?");
                        break;
                    case "Pending":
                        pst = con.prepareStatement("SELECT * FROM imprumuturi WHERE (data_imprumut BETWEEN ? AND ?) AND status = 'Pending'");
                        break;
                    case "Returned":
                        pst = con.prepareStatement("SELECT * FROM imprumuturi WHERE (data_imprumut BETWEEN ? AND ?) AND status = 'Returned'");
                        break;
                    default:
                        throw new AssertionError();
                }
                pst.setDate(1, inputdateOne);            
                pst.setDate(2, inputdateTwo);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    clearTable();
                    while(rs.next()){
                        String issueId = rs.getString("id_imprumut");                    
                        String bookId = rs.getString("id_carte");
                        String bookTitle = rs.getString("titlu");
                        String readerId = rs.getString("id_cititor");
                        String firstName = rs.getString("prenume");
                        String lastName = rs.getString("nume");
                        String iDate = rs.getString("data_imprumut");
                        String dDate = rs.getString("data_expirare");                    
                        String status = rs.getString("status");
                        Object[] obj = {issueId, bookId, bookTitle, readerId, firstName, lastName, iDate, dDate, status};
                        model=(DefaultTableModel) recordsTable.getModel();
                        model.addRow(obj);
                    }
                }    
                else
                    JOptionPane.showMessageDialog(this, "No records found!");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select the dates!");
        }
    }

    private void allButtonMouseClicked(java.awt.event.MouseEvent evt) {
        try{
            DefaultTableModel model=(DefaultTableModel) recordsTable.getModel();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM imprumuturi");
            ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    clearTable();
                    while(rs.next()){
                        String issueId = rs.getString("id_imprumut");                    
                        String bookId = rs.getString("id_carte");
                        String bookTitle = rs.getString("titlu");
                        String readerId = rs.getString("id_cititor");
                        String firstName = rs.getString("prenume");
                        String lastName = rs.getString("nume");
                        String iDate = rs.getString("data_imprumut");
                        String dDate = rs.getString("data_expirare");                    
                        String status = rs.getString("status");
                        Object[] obj = {issueId, bookId, bookTitle, readerId, firstName, lastName, iDate, dDate, status};
                        model=(DefaultTableModel) recordsTable.getModel();
                        model.addRow(obj);
                    }
                }    
                else
                    JOptionPane.showMessageDialog(this, "No records found!");
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
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRecords().setVisible(true);
            }
        });
    }

    private javax.swing.JButton allButton;
    private javax.swing.JButton backHome;
    private javax.swing.JButton closeButton;
    private com.toedter.calendar.JDateChooser dateOneChooser;
    private javax.swing.JLabel dateOneLabel;
    private com.toedter.calendar.JDateChooser dateTwoChooser;
    private javax.swing.JLabel dateTwoLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel recordsLabel;
    private javax.swing.JTable recordsTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JComboBox<String> statusList;
}
