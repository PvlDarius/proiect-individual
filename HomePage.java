package library;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Darius
 */
public class HomePage extends javax.swing.JFrame {
    public HomePage() {
        initComponents();
        setBookDetailsToTable();
        setReaderDetailsToTable();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        menuItem1 = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        menuItem3 = new javax.swing.JPanel();
        manageBooksLabel = new javax.swing.JLabel();
        menuItem4 = new javax.swing.JPanel();
        manageReadersLabel = new javax.swing.JLabel();
        menuItem5 = new javax.swing.JPanel();
        issueBooksLabel = new javax.swing.JLabel();
        menuItem6 = new javax.swing.JPanel();
        returnBookLabel = new javax.swing.JLabel();
        menuItem7 = new javax.swing.JPanel();
        viewRecordsLabel = new javax.swing.JLabel();
        menuItem9 = new javax.swing.JPanel();
        defaulterListLabel = new javax.swing.JLabel();
        menuItem10 = new javax.swing.JPanel();
        logOutLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        readersTable = new javax.swing.JTable();
        bookTableLabel = new javax.swing.JLabel();
        readersTableLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundPanel.setBackground(new java.awt.Color(234, 253, 248));

        topPanel.setBackground(new java.awt.Color(51, 102, 255));

        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        welcomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        welcomeLabel.setText("Welcome!");

        logoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        logoLabel.setForeground(new java.awt.Color(0, 0, 0));
        logoLabel.setText("Biblioteca A.L.");

        closeButton.setBackground(new java.awt.Color(255, 0, 51));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(closeButton)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(welcomeLabel)
                            .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(51, 51, 51));

        menuItem1.setBackground(new java.awt.Color(255, 0, 51));
        menuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem1MouseExited(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        homeLabel.setText("Home Page");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuItem1Layout = new javax.swing.GroupLayout(menuItem1);
        menuItem1.setLayout(menuItem1Layout);
        menuItem1Layout.setHorizontalGroup(
            menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeLabel)
                .addGap(107, 107, 107))
        );
        menuItem1Layout.setVerticalGroup(
            menuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuLabel.setFont(new java.awt.Font("Segoe UI", 1, 20));
        menuLabel.setForeground(new java.awt.Color(204, 204, 204));
        menuLabel.setText("Menu");

        menuItem3.setBackground(new java.awt.Color(102, 102, 102));
        menuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem3MouseExited(evt);
            }
        });

        manageBooksLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        manageBooksLabel.setText("Manage Books");
        manageBooksLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBooksLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageBooksLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageBooksLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuItem3Layout = new javax.swing.GroupLayout(menuItem3);
        menuItem3.setLayout(menuItem3Layout);
        menuItem3Layout.setHorizontalGroup(
            menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageBooksLabel)
                .addGap(99, 99, 99))
        );
        menuItem3Layout.setVerticalGroup(
            menuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuItem4.setBackground(new java.awt.Color(102, 102, 102));
        menuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem4MouseExited(evt);
            }
        });

        manageReadersLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        manageReadersLabel.setText("Manage Readers");
        manageReadersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageReadersLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageReadersLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageReadersLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuItem4Layout = new javax.swing.GroupLayout(menuItem4);
        menuItem4.setLayout(menuItem4Layout);
        menuItem4Layout.setHorizontalGroup(
            menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem4Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(manageReadersLabel)
                .addGap(90, 90, 90))
        );
        menuItem4Layout.setVerticalGroup(
            menuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageReadersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuItem5.setBackground(new java.awt.Color(102, 102, 102));
        menuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem5MouseExited(evt);
            }
        });

        issueBooksLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        issueBooksLabel.setText("Issue Book");
        issueBooksLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issueBooksLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issueBooksLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issueBooksLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuItem5Layout = new javax.swing.GroupLayout(menuItem5);
        menuItem5.setLayout(menuItem5Layout);
        menuItem5Layout.setHorizontalGroup(
            menuItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(issueBooksLabel)
                .addGap(114, 114, 114))
        );
        menuItem5Layout.setVerticalGroup(
            menuItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(issueBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuItem6.setBackground(new java.awt.Color(102, 102, 102));
        menuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem6MouseExited(evt);
            }
        });

        returnBookLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        returnBookLabel.setText("Return Book");
        returnBookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBookLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnBookLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnBookLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuItem6Layout = new javax.swing.GroupLayout(menuItem6);
        menuItem6.setLayout(menuItem6Layout);
        menuItem6Layout.setHorizontalGroup(
            menuItem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem6Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(returnBookLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuItem6Layout.setVerticalGroup(
            menuItem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuItem7.setBackground(new java.awt.Color(102, 102, 102));
        menuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem7MouseExited(evt);
            }
        });

        viewRecordsLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        viewRecordsLabel.setText("View Records");
        viewRecordsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRecordsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewRecordsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewRecordsLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuItem7Layout = new javax.swing.GroupLayout(menuItem7);
        menuItem7.setLayout(menuItem7Layout);
        menuItem7Layout.setHorizontalGroup(
            menuItem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewRecordsLabel)
                .addGap(102, 102, 102))
        );
        menuItem7Layout.setVerticalGroup(
            menuItem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewRecordsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuItem9.setBackground(new java.awt.Color(102, 102, 102));
        menuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem9MouseExited(evt);
            }
        });

        defaulterListLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        defaulterListLabel.setText("Defaulter List");
        defaulterListLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                defaulterListLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                defaulterListLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                defaulterListLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuItem9Layout = new javax.swing.GroupLayout(menuItem9);
        menuItem9.setLayout(menuItem9Layout);
        menuItem9Layout.setHorizontalGroup(
            menuItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(defaulterListLabel)
                .addGap(104, 104, 104))
        );
        menuItem9Layout.setVerticalGroup(
            menuItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(defaulterListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuItem10.setBackground(new java.awt.Color(51, 102, 255));
        menuItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem10MouseExited(evt);
            }
        });

        logOutLabel.setFont(new java.awt.Font("Segoe UI", 0, 16));
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuItem10Layout = new javax.swing.GroupLayout(menuItem10);
        menuItem10.setLayout(menuItem10Layout);
        menuItem10Layout.setHorizontalGroup(
            menuItem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItem10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutLabel)
                .addGap(116, 116, 116))
        );
        menuItem10Layout.setVerticalGroup(
            menuItem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItem10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuLabel)
                .addGap(125, 125, 125))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(menuItem10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
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
        jScrollPane2.setViewportView(readersTable);

        bookTableLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookTableLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookTableLabel.setText("Books");

        readersTableLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        readersTableLabel.setForeground(new java.awt.Color(0, 0, 0));
        readersTableLabel.setText("Readers");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(readersTableLabel)
                        .addGap(291, 291, 291))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(0, 59, Short.MAX_VALUE)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(bookTableLabel)
                                        .addGap(302, 302, 302))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64))))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(bookTableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(readersTableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }

    private void manageBooksLabelMouseClicked(java.awt.event.MouseEvent evt) {
        ManageBooks manageBooks = new ManageBooks();
        manageBooks.setVisible(true);
        this.dispose();
    }

    private void menuItem10MouseClicked(java.awt.event.MouseEvent evt) {
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }

    private void menuItem4MouseClicked(java.awt.event.MouseEvent evt) {
        ManageReaders manageReaders = new ManageReaders();
        manageReaders.setVisible(true);
        this.dispose();
    }

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void menuItem3MouseEntered(java.awt.event.MouseEvent evt) {
        menuItem3.setBackground(new Color(255,0,51));
    }

    private void menuItem3MouseExited(java.awt.event.MouseEvent evt) {
        menuItem3.setBackground(new Color(102,102,102));
    }

    private void menuItem3MouseClicked(java.awt.event.MouseEvent evt) {
        ManageBooks manageBooks = new ManageBooks();
        manageBooks.setVisible(true);
        this.dispose();
    }

    private void manageBooksLabelMouseEntered(java.awt.event.MouseEvent evt) {
        menuItem3.setBackground(new Color(255,0,51));
    }

    private void manageBooksLabelMouseExited(java.awt.event.MouseEvent evt) {
        menuItem3.setBackground(new Color(102,102,102));
    }

    private void menuItem1MouseClicked(java.awt.event.MouseEvent evt) {
        HomePage home = new HomePage();
        home.setVisible(true);
        this.dispose();
    }

    private void menuItem1MouseEntered(java.awt.event.MouseEvent evt) {
        menuItem1.setBackground(new Color(102,102,102));
    }

    private void menuItem1MouseExited(java.awt.event.MouseEvent evt) {
        menuItem1.setBackground(new Color(255,0,51));
    }

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {
        HomePage home = new HomePage();
        home.setVisible(true);
        dispose();
    }

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {
        menuItem1.setBackground(new Color(102,102,102));
    }

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {
        menuItem1.setBackground(new Color(255,0,51));
    }

    private void manageReadersLabelMouseClicked(java.awt.event.MouseEvent evt) {
        ManageReaders manageReaders = new ManageReaders();
        manageReaders.setVisible(true);
        this.dispose();
    }

    private void manageReadersLabelMouseEntered(java.awt.event.MouseEvent evt) {
        menuItem4.setBackground(new Color(255,0,51));
    }

    private void manageReadersLabelMouseExited(java.awt.event.MouseEvent evt) {
        menuItem4.setBackground(new Color(102,102,102));
    }

    private void menuItem4MouseEntered(java.awt.event.MouseEvent evt) {
        menuItem4.setBackground(new Color(255,0,51));
    }

    private void menuItem4MouseExited(java.awt.event.MouseEvent evt) {
        menuItem4.setBackground(new Color(102,102,102));
    }/

    private void menuItem5MouseClicked(java.awt.event.MouseEvent evt) {
        IssueBook issueBook = new IssueBook();
        issueBook.setVisible(true);
        this.dispose();
    }

    private void menuItem5MouseEntered(java.awt.event.MouseEvent evt) {
        menuItem5.setBackground(new Color(255,0,51));
    }

    private void menuItem5MouseExited(java.awt.event.MouseEvent evt) {
        menuItem5.setBackground(new Color(102,102,102));
    }

    private void issueBooksLabelMouseClicked(java.awt.event.MouseEvent evt) {
        IssueBook issueBook = new IssueBook();
        issueBook.setVisible(true);
        this.dispose();
    }

    private void issueBooksLabelMouseEntered(java.awt.event.MouseEvent evt) {
        menuItem5.setBackground(new Color(255,0,51));
    }

    private void issueBooksLabelMouseExited(java.awt.event.MouseEvent evt) {
        menuItem5.setBackground(new Color(102,102,102));
    }

    private void menuItem6MouseClicked(java.awt.event.MouseEvent evt) {
        ReturnBook returnBook = new ReturnBook();
        returnBook.setVisible(true);
        this.dispose();
    }

    private void menuItem6MouseEntered(java.awt.event.MouseEvent evt) {
        menuItem6.setBackground(new Color(255,0,51));
    }

    private void menuItem6MouseExited(java.awt.event.MouseEvent evt) {
        menuItem6.setBackground(new Color(102,102,102));
    }

    private void returnBookLabelMouseClicked(java.awt.event.MouseEvent evt) {
        ReturnBook returnBook = new ReturnBook();
        returnBook.setVisible(true);
        this.dispose();
    }

    private void returnBookLabelMouseEntered(java.awt.event.MouseEvent evt) {
        menuItem6.setBackground(new Color(255,0,51));
    }

    private void returnBookLabelMouseExited(java.awt.event.MouseEvent evt) {
        menuItem6.setBackground(new Color(102,102,102));
    }

    private void menuItem7MouseClicked(java.awt.event.MouseEvent evt) {
        ViewRecords viewRecords = new ViewRecords();
        viewRecords.setVisible(true);
        this.dispose();
    }

    private void menuItem7MouseEntered(java.awt.event.MouseEvent evt) {
        menuItem7.setBackground(new Color(255,0,51));
    }

    private void menuItem7MouseExited(java.awt.event.MouseEvent evt) {
        menuItem7.setBackground(new Color(102,102,102));
    }

    private void viewRecordsLabelMouseClicked(java.awt.event.MouseEvent evt) {
        ViewRecords viewRecords = new ViewRecords();
        viewRecords.setVisible(true);
        this.dispose();
    }

    private void viewRecordsLabelMouseEntered(java.awt.event.MouseEvent evt) {
        menuItem7.setBackground(new Color(255,0,51));
    }

    private void viewRecordsLabelMouseExited(java.awt.event.MouseEvent evt) {
        menuItem7.setBackground(new Color(102,102,102));
    }

    private void menuItem9MouseClicked(java.awt.event.MouseEvent evt) {
        DefaulterList defaulterList = new DefaulterList();
        defaulterList.setVisible(true);
        this.dispose();
    }

    private void menuItem9MouseEntered(java.awt.event.MouseEvent evt) {
        menuItem9.setBackground(new Color(255,0,51));
    }

    private void menuItem9MouseExited(java.awt.event.MouseEvent evt) {
        menuItem9.setBackground(new Color(102,102,102));
    }

    private void defaulterListLabelMouseClicked(java.awt.event.MouseEvent evt) {
        DefaulterList defaulterList = new DefaulterList();
        defaulterList.setVisible(true);
        this.dispose();
    }

    private void defaulterListLabelMouseEntered(java.awt.event.MouseEvent evt) {
        menuItem9.setBackground(new Color(255,0,51));
    }

    private void defaulterListLabelMouseExited(java.awt.event.MouseEvent evt) {
        menuItem9.setBackground(new Color(102,102,102));
    }

    private void menuItem10MouseEntered(java.awt.event.MouseEvent evt) {
        menuItem10.setBackground(new Color(0,64,255));
    }

    private void menuItem10MouseExited(java.awt.event.MouseEvent evt) {
        menuItem10.setBackground(new Color(51,102,255));
    }

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }

    private void logOutLabelMouseEntered(java.awt.event.MouseEvent evt) {
        menuItem10.setBackground(new Color(0,64,255));
    }

    private void logOutLabelMouseExited(java.awt.event.MouseEvent evt) {
        menuItem10.setBackground(new Color(51,102,255));
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
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JTable bookTable;
    private javax.swing.JLabel bookTableLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel defaulterListLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel issueBooksLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel manageBooksLabel;
    private javax.swing.JLabel manageReadersLabel;
    private javax.swing.JPanel menuItem1;
    private javax.swing.JPanel menuItem10;
    private javax.swing.JPanel menuItem3;
    private javax.swing.JPanel menuItem4;
    private javax.swing.JPanel menuItem5;
    private javax.swing.JPanel menuItem6;
    private javax.swing.JPanel menuItem7;
    private javax.swing.JPanel menuItem9;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTable readersTable;
    private javax.swing.JLabel readersTableLabel;
    private javax.swing.JLabel returnBookLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel viewRecordsLabel;
    private javax.swing.JLabel welcomeLabel;
}
