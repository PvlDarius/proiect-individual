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
public class IssueBook extends javax.swing.JFrame {
    public IssueBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        bookDetailsPanel = new javax.swing.JPanel();
        backHome = new javax.swing.JButton();
        bookDetailsLabel = new javax.swing.JLabel();
        bookIdLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        bookAuthorLabel = new javax.swing.JLabel();
        numberOfPagesLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        yearOfReleaseLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        bookIdEmptyLabel = new javax.swing.JLabel();
        bookTitleEmptyLabel = new javax.swing.JLabel();
        bookAuthorEmptyLabel = new javax.swing.JLabel();
        numberOfPagesEmptyLabel = new javax.swing.JLabel();
        genreEmptyLabel = new javax.swing.JLabel();
        publisherEmptyLabel = new javax.swing.JLabel();
        yearOfReleaseEmptyLabel = new javax.swing.JLabel();
        quantityEmptyLabel = new javax.swing.JLabel();
        bookErrorLabel = new javax.swing.JLabel();
        readerDetailPanel = new javax.swing.JPanel();
        readerDetailsLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        registrationDateLabel = new javax.swing.JLabel();
        readerIdEmptyLabel = new javax.swing.JLabel();
        firstNameEmptyLabel = new javax.swing.JLabel();
        lastNameEmptyLabel = new javax.swing.JLabel();
        phoneNumberEmptyLabel = new javax.swing.JLabel();
        ageEmptyLabel = new javax.swing.JLabel();
        registrationDateEmptyLabel = new javax.swing.JLabel();
        readerErrorLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        issueBookLabel = new javax.swing.JLabel();
        issueBookIdLabel = new javax.swing.JLabel();
        issueReaderIdLabel = new javax.swing.JLabel();
        issueBookIdField = new javax.swing.JTextField();
        issueReaderIdField = new javax.swing.JTextField();
        issueDateLabel = new javax.swing.JLabel();
        issueDateChooser = new com.toedter.calendar.JDateChooser();
        dueDateLabel = new javax.swing.JLabel();
        dueDateChooser = new com.toedter.calendar.JDateChooser();
        issueBookButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(234, 253, 248));

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
        bookDetailsLabel.setText("Book Details");

        bookIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookIdLabel.setText("Book ID:");

        bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookTitleLabel.setText("Title:");

        bookAuthorLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookAuthorLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookAuthorLabel.setText("Author:");

        numberOfPagesLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        numberOfPagesLabel.setForeground(new java.awt.Color(0, 0, 0));
        numberOfPagesLabel.setText("Number of Pages:");

        genreLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        genreLabel.setForeground(new java.awt.Color(0, 0, 0));
        genreLabel.setText("Genre:");

        publisherLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        publisherLabel.setForeground(new java.awt.Color(0, 0, 0));
        publisherLabel.setText("Publisher:");

        yearOfReleaseLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        yearOfReleaseLabel.setForeground(new java.awt.Color(0, 0, 0));
        yearOfReleaseLabel.setText("Year of Release:");

        quantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        quantityLabel.setForeground(new java.awt.Color(0, 0, 0));
        quantityLabel.setText("Quantity:");

        bookIdEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookIdEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        bookTitleEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        bookTitleEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        bookAuthorEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        bookAuthorEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        numberOfPagesEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        numberOfPagesEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        genreEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        genreEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        publisherEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        publisherEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        yearOfReleaseEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        yearOfReleaseEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        quantityEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        quantityEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        bookErrorLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        bookErrorLabel.setForeground(new java.awt.Color(241, 211, 2));

        javax.swing.GroupLayout bookDetailsPanelLayout = new javax.swing.GroupLayout(bookDetailsPanel);
        bookDetailsPanel.setLayout(bookDetailsPanelLayout);
        bookDetailsPanelLayout.setHorizontalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(bookDetailsLabel)
                .addGap(77, 77, 77))
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backHome))
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookIdLabel)
                            .addComponent(numberOfPagesLabel)
                            .addComponent(yearOfReleaseLabel)
                            .addComponent(bookTitleLabel)
                            .addComponent(bookAuthorLabel)
                            .addComponent(genreLabel)
                            .addComponent(publisherLabel)
                            .addComponent(quantityLabel)
                            .addComponent(bookErrorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookIdEmptyLabel)
                            .addComponent(numberOfPagesEmptyLabel)
                            .addComponent(yearOfReleaseEmptyLabel)
                            .addComponent(quantityEmptyLabel)
                            .addComponent(bookTitleEmptyLabel)
                            .addComponent(bookAuthorEmptyLabel)
                            .addComponent(genreEmptyLabel)
                            .addComponent(publisherEmptyLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookDetailsPanelLayout.setVerticalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backHome)
                .addGap(36, 36, 36)
                .addComponent(bookDetailsLabel)
                .addGap(69, 69, 69)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addComponent(bookIdEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookTitleEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookAuthorEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(numberOfPagesEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(genreEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(publisherEmptyLabel))
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addComponent(bookIdLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookTitleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookAuthorLabel)
                        .addGap(18, 18, 18)
                        .addComponent(numberOfPagesLabel)
                        .addGap(18, 18, 18)
                        .addComponent(genreLabel)
                        .addGap(18, 18, 18)
                        .addComponent(publisherLabel)
                        .addGap(18, 18, 18)
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearOfReleaseLabel)
                            .addComponent(yearOfReleaseEmptyLabel))
                        .addGap(18, 18, 18)
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityLabel)
                            .addComponent(quantityEmptyLabel))))
                .addGap(40, 40, 40)
                .addComponent(bookErrorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        readerDetailPanel.setBackground(new java.awt.Color(255, 0, 51));

        readerDetailsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        readerDetailsLabel.setForeground(new java.awt.Color(234, 253, 248));
        readerDetailsLabel.setText("Reader Details");

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("Reader ID:");

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        firstNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setText("First Name:");

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        lastNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setText("Last Name:");

        phoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        phoneNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumberLabel.setText("Phone Number:");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        ageLabel.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel.setText("Age:");

        registrationDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        registrationDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        registrationDateLabel.setText("Registration Date:");

        readerIdEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        readerIdEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        firstNameEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        firstNameEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        lastNameEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        lastNameEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        phoneNumberEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        phoneNumberEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        ageEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); //
        ageEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        registrationDateEmptyLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        registrationDateEmptyLabel.setForeground(new java.awt.Color(0, 0, 0));

        readerErrorLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        readerErrorLabel.setForeground(new java.awt.Color(241, 211, 2));

        javax.swing.GroupLayout readerDetailPanelLayout = new javax.swing.GroupLayout(readerDetailPanel);
        readerDetailPanel.setLayout(readerDetailPanelLayout);
        readerDetailPanelLayout.setHorizontalGroup(
            readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, readerDetailPanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(readerDetailsLabel)
                .addGap(62, 62, 62))
            .addGroup(readerDetailPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(readerErrorLabel)
                    .addGroup(readerDetailPanelLayout.createSequentialGroup()
                        .addGroup(readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberLabel)
                            .addComponent(registrationDateLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(ageLabel)
                            .addComponent(idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberEmptyLabel)
                            .addComponent(registrationDateEmptyLabel)
                            .addComponent(firstNameEmptyLabel)
                            .addComponent(lastNameEmptyLabel)
                            .addComponent(ageEmptyLabel)
                            .addComponent(readerIdEmptyLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        readerDetailPanelLayout.setVerticalGroup(
            readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerDetailPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(readerDetailsLabel)
                .addGap(106, 106, 106)
                .addGroup(readerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(readerDetailPanelLayout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addGap(18, 18, 18)
                        .addComponent(firstNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumberLabel)
                        .addGap(18, 18, 18)
                        .addComponent(ageLabel)
                        .addGap(18, 18, 18)
                        .addComponent(registrationDateLabel))
                    .addGroup(readerDetailPanelLayout.createSequentialGroup()
                        .addComponent(readerIdEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(firstNameEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumberEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(ageEmptyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(registrationDateEmptyLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(readerErrorLabel)
                .addGap(75, 75, 75))
        );

        closeButton.setBackground(new java.awt.Color(255, 0, 51));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        issueBookLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        issueBookLabel.setForeground(new java.awt.Color(0, 0, 0));
        issueBookLabel.setText("Issue Book");

        issueBookIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        issueBookIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        issueBookIdLabel.setText("Book ID:");

        issueReaderIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        issueReaderIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        issueReaderIdLabel.setText("Reader ID:");

        issueBookIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                issueBookIdFieldFocusLost(evt);
            }
        });

        issueReaderIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                issueReaderIdFieldFocusLost(evt);
            }
        });
        issueReaderIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueReaderIdFieldActionPerformed(evt);
            }
        });

        issueDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        issueDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        issueDateLabel.setText("Issue Date:");

        dueDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        dueDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        dueDateLabel.setText("Due Date:");

        issueBookButton.setBackground(new java.awt.Color(255, 0, 51));
        issueBookButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        issueBookButton.setForeground(new java.awt.Color(234, 253, 248));
        issueBookButton.setText("Issue Book");
        issueBookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issueBookButtonMouseClicked(evt);
            }
        });
        issueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(bookDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(readerDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(issueReaderIdLabel)
                                    .addComponent(issueBookIdLabel)
                                    .addComponent(issueDateLabel)
                                    .addComponent(dueDateLabel)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(issueBookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(issueReaderIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(issueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(closeButton)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(issueBookButton)
                                    .addComponent(issueBookLabel))
                                .addGap(108, 108, 108))))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(readerDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addGap(35, 35, 35)
                .addComponent(issueBookLabel)
                .addGap(101, 101, 101)
                .addComponent(issueBookIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issueBookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(issueReaderIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issueReaderIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(issueDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(issueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dueDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(issueBookButton)
                .addContainerGap(71, Short.MAX_VALUE))
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

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }
    
    public void updateBookCount(){
        int bookId = Integer.parseInt(issueBookIdField.getText());
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("UPDATE carti SET cantitate = cantitate - 1 WHERE id_carte = ?"); 
            pst.setInt(1, bookId);
            int rowCount = pst.executeUpdate();
            if(rowCount > 0){
                JOptionPane.showMessageDialog(this, "Book count updated succesfully!");
                int initialCount = Integer.parseInt(quantityEmptyLabel.getText());
                quantityEmptyLabel.setText(Integer.toString(initialCount - 1));
            }
            else{
                JOptionPane.showMessageDialog(this, "Error: Book count was not updated!");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean bookAlreadyIssued(){
        boolean alreadyIssued = false;
        int bookId = Integer.parseInt(issueBookIdField.getText());
        int readerId = Integer.parseInt(issueReaderIdField.getText());
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM imprumuturi WHERE id_carte = ? AND id_cititor = ? AND status = 'Pending'");
            pst.setInt(1, bookId);            
            pst.setInt(2, readerId);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
                alreadyIssued = true;
            else
                alreadyIssued = false;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return alreadyIssued;
    }
    
    private void issueBookButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookButtonMouseClicked
        if(getBookDetails() != false && getReaderDetails() != false){
            if(quantityEmptyLabel.getText().equals("0")){
                JOptionPane.showMessageDialog(this, "This book is not available!");
            }
            else{
                if(bookAlreadyIssued() == false){
                    boolean isIssued = false;
                    int bookId = Integer.parseInt(issueBookIdField.getText());
                    String bookTitle = bookTitleEmptyLabel.getText();
                    int readerId = Integer.parseInt(issueReaderIdField.getText());
                    String readerFirstName = firstNameEmptyLabel.getText();        
                    String readerLastName = lastNameEmptyLabel.getText();
                    Date issueDate = issueDateChooser.getDate();        
                    Date dueDate = dueDateChooser.getDate();
                    java.sql.Date inputIssueDate = new java.sql.Date(issueDate.getTime());        
                    java.sql.Date inputDueDate = new java.sql.Date(dueDate.getTime());

                    try{
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
                        PreparedStatement pst = con.prepareStatement("INSERT INTO imprumuturi VALUES (default,?,?,?,?,?,?,?,?)"); 
                        pst.setInt(1, bookId);
                        pst.setString(2, bookTitle);
                        pst.setInt(3, readerId);
                        pst.setString(4, readerFirstName);            
                        pst.setString(5, readerLastName);
                        pst.setDate(6, inputIssueDate);
                        pst.setDate(7, inputDueDate);
                        pst.setString(8, "Pending");

                        int rowCount = pst.executeUpdate();
                        if(rowCount > 0)
                            isIssued = true;
                        else
                            isIssued = false;
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                    if(isIssued == true){
                        JOptionPane.showMessageDialog(this, "Book issued succesfully!");
                        updateBookCount();
                    }    
                    else{
                        JOptionPane.showMessageDialog(this, "Error: Book was not issued!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "This reader already has this book!");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid action!");
        }
    }

    private void issueBookIdFieldFocusLost(java.awt.event.FocusEvent evt) {
        if(!issueBookIdField.getText().equals(""))
            getBookDetails();
    }

    private void issueReaderIdFieldFocusLost(java.awt.event.FocusEvent evt) {
        if(!issueReaderIdField.getText().equals(""))
            getReaderDetails();
    }
    
    public boolean getBookDetails(){
        int bookId = Integer.parseInt(issueBookIdField.getText());
        boolean canIssue = false;
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM carti WHERE id_carte = ?");
            pst.setInt(1, bookId);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                bookIdEmptyLabel.setText(rs.getString("id_carte"));                
                bookTitleEmptyLabel.setText(rs.getString("titlu"));
                bookAuthorEmptyLabel.setText(rs.getString("autor"));
                numberOfPagesEmptyLabel.setText(rs.getString("nr_pagini"));                
                genreEmptyLabel.setText(rs.getString("gen"));
                publisherEmptyLabel.setText(rs.getString("editura"));
                yearOfReleaseEmptyLabel.setText(rs.getString("an_aparitie"));
                quantityEmptyLabel.setText(rs.getString("cantitate"));
                canIssue = true;
            }
            else{
                bookIdEmptyLabel.setText("");                
                bookTitleEmptyLabel.setText("");
                bookAuthorEmptyLabel.setText("");
                numberOfPagesEmptyLabel.setText("");                
                genreEmptyLabel.setText("");
                publisherEmptyLabel.setText("");
                yearOfReleaseEmptyLabel.setText("");
                quantityEmptyLabel.setText("");
                bookErrorLabel.setText("Error: Invalid book ID!");
                canIssue = false;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return canIssue;
    }
    
    public boolean getReaderDetails(){
        int readerId = Integer.parseInt(issueReaderIdField.getText());
        boolean canIssue = false;
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM cititori WHERE id_cititor = ?");
            pst.setInt(1, readerId);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                readerIdEmptyLabel.setText(rs.getString("id_cititor"));                
                firstNameEmptyLabel.setText(rs.getString("prenume"));
                lastNameEmptyLabel.setText(rs.getString("nume"));
                phoneNumberEmptyLabel.setText(rs.getString("telefon"));                
                ageEmptyLabel.setText(rs.getString("varsta"));
                registrationDateEmptyLabel.setText(rs.getString("data_inregistrarii"));
                canIssue = true;
            }
            else{
                readerIdEmptyLabel.setText("");                
                firstNameEmptyLabel.setText("");
                lastNameEmptyLabel.setText("");
                phoneNumberEmptyLabel.setText("");                
                ageEmptyLabel.setText("");
                registrationDateEmptyLabel.setText("");
                readerErrorLabel.setText("Error: Invalid reader ID!");
                canIssue = false;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return canIssue;
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel ageEmptyLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backHome;
    private javax.swing.JLabel bookAuthorEmptyLabel;
    private javax.swing.JLabel bookAuthorLabel;
    private javax.swing.JLabel bookDetailsLabel;
    private javax.swing.JPanel bookDetailsPanel;
    private javax.swing.JLabel bookErrorLabel;
    private javax.swing.JLabel bookIdEmptyLabel;
    private javax.swing.JLabel bookIdLabel;
    private javax.swing.JLabel bookTitleEmptyLabel;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JButton closeButton;
    private com.toedter.calendar.JDateChooser dueDateChooser;
    private javax.swing.JLabel dueDateLabel;
    private javax.swing.JLabel firstNameEmptyLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genreEmptyLabel;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton issueBookButton;
    private javax.swing.JTextField issueBookIdField;
    private javax.swing.JLabel issueBookIdLabel;
    private javax.swing.JLabel issueBookLabel;
    private com.toedter.calendar.JDateChooser issueDateChooser;
    private javax.swing.JLabel issueDateLabel;
    private javax.swing.JTextField issueReaderIdField;
    private javax.swing.JLabel issueReaderIdLabel;
    private javax.swing.JLabel lastNameEmptyLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel numberOfPagesEmptyLabel;
    private javax.swing.JLabel numberOfPagesLabel;
    private javax.swing.JLabel phoneNumberEmptyLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel publisherEmptyLabel;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JLabel quantityEmptyLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JPanel readerDetailPanel;
    private javax.swing.JLabel readerDetailsLabel;
    private javax.swing.JLabel readerErrorLabel;
    private javax.swing.JLabel readerIdEmptyLabel;
    private javax.swing.JLabel registrationDateEmptyLabel;
    private javax.swing.JLabel registrationDateLabel;
    private javax.swing.JLabel yearOfReleaseEmptyLabel;
    private javax.swing.JLabel yearOfReleaseLabel;
}
