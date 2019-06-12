package Frontend;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Query;
import Frontend.LoginView;
import javax.swing.JOptionPane;

public class CarRegistryFrame extends javax.swing.JFrame {

    public CarRegistryFrame() {
        initComponents();
        ReadFunction();
        
    }
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CarRegistryFrame.class.getName());
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("myschema?characterEncoding=utf8PU").createEntityManager();
        carsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cars c");
        carsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(carsQuery.getResultList());
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFMAKE = new javax.swing.JTextField();
        TFMODELL = new javax.swing.JTextField();
        TFEngine = new javax.swing.JTextField();
        TFPrice = new javax.swing.JTextField();
        TFYEAR = new javax.swing.JTextField();
        BTNAdd = new javax.swing.JButton();
        BTNRecord = new javax.swing.JButton();
        BTNDelete = new javax.swing.JButton();
        CBox = new javax.swing.JCheckBox();
        BTNBack = new javax.swing.JButton();
        BTNClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblData.setAutoCreateRowSorter(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, carsList, tblData);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${make}"));
        columnBinding.setColumnName("Make");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${modell}"));
        columnBinding.setColumnName("Modell");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${engine}"));
        columnBinding.setColumnName("Engine");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${price}"));
        columnBinding.setColumnName("Price");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${available}"));
        columnBinding.setColumnName("Available");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${year}"));
        columnBinding.setColumnName("Year");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);

        jScrollPane1.setViewportView(tblData);

        jLabel1.setText("Make:");

        jLabel2.setText("Modell:");

        jLabel3.setText("Engine:");

        jLabel4.setText("Price");

        jLabel5.setText("Available:");

        jLabel6.setText("Year:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblData, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.make}"), TFMAKE, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblData, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.modell}"), TFMODELL, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblData, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.engine}"), TFEngine, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TFEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEngineActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblData, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.price}"), TFPrice, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblData, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.year}"), TFYEAR, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        BTNAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNAdd.setText("CREATE");
        BTNAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAddActionPerformed(evt);
            }
        });

        BTNRecord.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNRecord.setText("UPDATE");
        BTNRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRecordActionPerformed(evt);
            }
        });

        BTNDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNDelete.setText("DELETE");
        BTNDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDeleteActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblData, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.available}"), CBox, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        BTNBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNBack.setText("BACK");
        BTNBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNBackMouseClicked(evt);
            }
        });

        BTNClean.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNClean.setText("CLEAN");
        BTNClean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNCleanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TFMAKE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFEngine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFMODELL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                        .addComponent(TFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(TFYEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(CBox)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTNAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(BTNDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BTNRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNBack)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BTNClean)
                                .addGap(0, 6, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFMAKE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNAdd)
                    .addComponent(BTNBack))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(TFMODELL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNRecord)
                        .addComponent(BTNClean, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(TFEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFYEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEngineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEngineActionPerformed

    private void BTNAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAddActionPerformed
        CreateFunction();
    }//GEN-LAST:event_BTNAddActionPerformed

    private void BTNRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRecordActionPerformed
        UpdateFunction();
    }//GEN-LAST:event_BTNRecordActionPerformed

    private void BTNDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDeleteActionPerformed
        DeleteFunction();
    }//GEN-LAST:event_BTNDeleteActionPerformed

    private void BTNBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBackMouseClicked
        LogOut();
        
    }//GEN-LAST:event_BTNBackMouseClicked

    private void BTNCleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCleanMouseClicked
        CleanTextFields();
    }//GEN-LAST:event_BTNCleanMouseClicked

    // USE CTRL + SHIFT + C for fast commenting- uncommenting
//    public List<Object[]> getQueryList(){
//        return this.carsQuery.getResultList();
//    }
//    public void setQuery(Query query){
//        this.carsQuery = query;
//    }
//    
//    public List<Cars> getCarList(){
//        return this.carsList;
//    }
//    
//    public void setCarList(List<Cars> cars){
//        this.carsList = cars;
//    }
//    
//    public Query getQuery(){
//        return carsQuery;
//    }
    
    /**
     * Refreshing the shown data (in the JTable) from the mysql database.
     */
    private void SyncData() {
        try {
             logger.info("Refreshing Data...");
            carsList.clear();
            carsList.addAll(carsQuery.getResultList());
        } catch (Exception e) {
            System.out.println("Hiba: "+ e);
        }
    }
    
    // CRUD:
    
    /**
     * Megvalositja a hozzaadas muveletet.
     */
    private void CreateFunction(){
        try{
            Cars c = new Cars();
            c.setMake(TFMAKE.getText());
            c.setModell(TFMODELL.getText());
            c.setEngine(TFEngine.getText());
            c.setPrice(Integer.valueOf(TFPrice.getText()));           
            c.setAvailable(rootPaneCheckingEnabled);
            c.setYear(Integer.valueOf(TFYEAR.getText()));

            entityManager.persist(c);
            carsList.add(c);
            int row = carsList.size()-1;
            tblData.setRowSelectionInterval(row, row);
            logger.info("Sikeres Hozzáadási művelet.");
            
        }catch(Exception e){
            // TODO: log: rekord letrehpozasa sikerlteen
            System.out.println(e);
        }
    }
    
    private void ReadFunction(){
        logger.info("Adatok beolvasása az adatbázisból..");
        entityManager.getTransaction().begin();
    }
    
    private void UpdateFunction(){
        try {
                logger.info("Szinkronizálás az adatbázissal..");
                entityManager.getTransaction().commit();
                entityManager.getTransaction().begin();
                //RefreshData;
                SyncData();
                 logger.info("Sikeres szinkronizálás!");
        } catch (Exception e) {
            System.out.println("Hiba:"+ e);
        }
    }
    private void DeleteFunction(){
        try {
                logger.info("A kijelölt adatok törlésre kerültek.");
                int selectedRow = tblData.getSelectedRow();
                selectedRow = tblData.convertRowIndexToModel(selectedRow);
                entityManager.remove(carsList.get(selectedRow));
                entityManager.getTransaction().commit();
                entityManager.getTransaction().begin();
                //Operations.SyncData(carsList,carsQuery);
                SyncData();
                
        } catch (Exception e) {
            System.out.println("Hiba:"+ e);
        }
    }
    
//    public void TheresEmptyLabels(Cars c){
//        if(TFEngine.getText().isEmpty()||
//        TFMAKE.getText().isEmpty() || 
//        TFMODELL.getText().isEmpty() ||
//        TFPrice.getText().isEmpty() ||
//        TFYEAR.getText().isEmpty()){
//        JOptionPane.showMessageDialog(null, "You need to fill all the input labels!");
//        //return true;
//        }
//        else{
//             //return false;
//        }
//        }
    
    private void CleanTextFields(){
        TFEngine.setText("");
        TFMAKE.setText("");
        TFMODELL.setText("");
        TFPrice.setText("");
        TFYEAR.setText(""); 
    }
    
    private void LogOut(){
        logger.info("Kijelentkezés...");
        this.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(CarRegistryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarRegistryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarRegistryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarRegistryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarRegistryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAdd;
    private javax.swing.JButton BTNBack;
    private javax.swing.JButton BTNClean;
    private javax.swing.JButton BTNDelete;
    private javax.swing.JButton BTNRecord;
    private javax.swing.JCheckBox CBox;
    private javax.swing.JTextField TFEngine;
    private javax.swing.JTextField TFMAKE;
    private javax.swing.JTextField TFMODELL;
    private javax.swing.JTextField TFPrice;
    private javax.swing.JTextField TFYEAR;
    private java.util.List<Frontend.Cars> carsList;
    private javax.persistence.Query carsQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    
    
}
