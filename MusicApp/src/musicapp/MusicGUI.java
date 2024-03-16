package musicapp;

/**
 * 14/03/2023
 * @author Morris Ouedraogo
 */
public class MusicGUI extends javax.swing.JFrame {
    MusicInt stackInterface;
    
    public MusicGUI() {
        stackInterface = new MyStack();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        quitBtn = new javax.swing.JButton();
        eS = new java.awt.Label();
        eG = new java.awt.Label();
        pS = new java.awt.Label();
        songtf = new java.awt.TextField();
        Genretf = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        likedTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        rbTA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        popTA = new javax.swing.JTextArea();
        addMusic = new javax.swing.JButton();
        lS = new javax.swing.JLabel();
        rB = new javax.swing.JLabel();
        totalBtn = new javax.swing.JButton();
        removeAllsongs = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        moveBtn = new javax.swing.JButton();
        disBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        back.setBackground(new java.awt.Color(153, 255, 255));
        back.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        heading.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        heading.setText("Manage your Music");

        quitBtn.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        quitBtn.setText("Quit");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });

        eS.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        eS.setText("Enter Song");

        eG.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        eG.setText("Enter Genre");

        pS.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        pS.setText("Pop Songs");

        songtf.setBackground(new java.awt.Color(255, 255, 255));
        songtf.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        Genretf.setBackground(new java.awt.Color(255, 255, 255));
        Genretf.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        likedTA.setColumns(20);
        likedTA.setRows(5);
        jScrollPane1.setViewportView(likedTA);

        rbTA.setColumns(20);
        rbTA.setRows(5);
        jScrollPane2.setViewportView(rbTA);

        popTA.setColumns(20);
        popTA.setRows(5);
        jScrollPane3.setViewportView(popTA);

        addMusic.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        addMusic.setText("Add songs");
        addMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMusicActionPerformed(evt);
            }
        });

        lS.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        lS.setText("Liked Songs");

        rB.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        rB.setText("RNB Songs");

        totalBtn.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        totalBtn.setText("Total Songs");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        removeAllsongs.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        removeAllsongs.setText("Remove Songs");
        removeAllsongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllsongsActionPerformed(evt);
            }
        });

        removeBtn.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        removeBtn.setText("Remove Recent");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        moveBtn.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        moveBtn.setLabel("Move");
        moveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBtnActionPerformed(evt);
            }
        });

        disBtn.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        disBtn.setText("Display");
        disBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disBtnActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quitBtn)
                .addGap(50, 50, 50))
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lS)
                    .addComponent(songtf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBtn)
                    .addComponent(removeAllsongs)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(Genretf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeBtn)
                                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                                            .addComponent(moveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(73, 73, 73))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rB, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(disBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
                            .addGroup(backLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(backLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(eG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(eG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(songtf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Genretf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(backLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(addMusic)))
                        .addGap(29, 29, 29)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rB)
                            .addComponent(lS)))
                    .addGroup(backLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeBtn)
                            .addComponent(disBtn))
                        .addGap(332, 332, 332))
                    .addGroup(backLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalBtn)
                        .addGap(42, 42, 42)
                        .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeAllsongs)
                            .addComponent(moveBtn)
                            .addComponent(searchBtn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        eS.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
          System.exit(0);
    }//GEN-LAST:event_quitBtnActionPerformed

    private void addMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMusicActionPerformed
        //Declare variable
        String Song;
        String Genre;
        
        //Retrieve variables from textfield
        Song = songtf.getText();
        Genre = Genretf.getText();

        // If any of the fields are Empty prompt Else push item to our stack
        if (Song.isEmpty() || Genre.isEmpty()) {
            likedTA.append("Enter all fields required\n");
        } else {
            stackInterface.push(Song);
            stackInterface.push(Genre);
            likedTA.append(" You added " + Song + " on your App\n");
        }
        
    }//GEN-LAST:event_addMusicActionPerformed

    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
        
        // Total size of our stack
        int iStackSize = stackInterface.size();       
        likedTA.append("There is " +iStackSize+ " Song in your playlist\n");
       
        
    }//GEN-LAST:event_totalBtnActionPerformed

    private void removeAllsongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllsongsActionPerformed
        //If Stack is empty prompt msg or display in each TextArea 
        if (stackInterface.isEmpty()) {
            likedTA.append("There are no songs to be removed!\n");
        } else {
            stackInterface.emptyStack();
            likedTA.append("Your liked tracks were removed!\n");
            rbTA.append("All RnB tracks were removed!\n");
            popTA.append("All Pop tracks were removed!\n");
        
    }        
    }//GEN-LAST:event_removeAllsongsActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
         
        if (stackInterface.isEmpty()) {
            likedTA.append("There are no songs in the playlist\n");
        } else {
            String sRemove = (String) stackInterface.pop();
            likedTA.append("The song " + sRemove + " was removed from the playlist\n");
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void moveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBtnActionPerformed

        if (!stackInterface.isEmpty()) {
            
            String Genre = (String) stackInterface.dequeue();
            String music; 

        if (Genre.equalsIgnoreCase("pop")) {
            if (!stackInterface.isEmpty()) {
                music = (String) stackInterface.pop();
                popTA.append( " "+ music+ " has been added to pop playlist\n");
            } else {
                likedTA.append("There are no pop songs!\n");
            }
        } else if (Genre.equalsIgnoreCase("rnb")) {
            if (!stackInterface.isEmpty()) {
                music = (String) stackInterface.pop();
                rbTA.append("The song " + music + " has been added to RnB playlist\n");
            } else {
                likedTA.append("No rnb songs to be moved Search Again!\n");
            }
        }
      } else {
        likedTA.append("No songs to be moved!\n");
     }
    }//GEN-LAST:event_moveBtnActionPerformed

    private void disBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MusicGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField Genretf;
    private javax.swing.JButton addMusic;
    private javax.swing.JPanel back;
    private javax.swing.JButton disBtn;
    private java.awt.Label eG;
    private java.awt.Label eS;
    private javax.swing.JLabel heading;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lS;
    private javax.swing.JTextArea likedTA;
    private javax.swing.JButton moveBtn;
    private java.awt.Label pS;
    private javax.swing.JTextArea popTA;
    private javax.swing.JButton quitBtn;
    private javax.swing.JLabel rB;
    private javax.swing.JTextArea rbTA;
    private javax.swing.JButton removeAllsongs;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton searchBtn;
    private java.awt.TextField songtf;
    private javax.swing.JButton totalBtn;
    // End of variables declaration//GEN-END:variables
}
