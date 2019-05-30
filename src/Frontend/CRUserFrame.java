package Frontend;

import BackEnd.LoginModel;
import BackEnd.Template.Audi;
import BackEnd.Template.AutoVasarlas;
import BackEnd.Template.BMW;
import BackEnd.Template.OtherCar;
import BackEnd.Decorator.Car;
import BackEnd.Decorator.BasicCar;
import BackEnd.Decorator.CarDecorator;
import BackEnd.Decorator.Warrantee;
import BackEnd.Decorator.Insurance;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class CRUserFrame extends javax.swing.JFrame {
  
    public CRUserFrame() {
        initComponents();
        FillComboBox();
        entityManager.getTransaction().begin();
    }
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CRUserFrame.class.getName());
    
    private String[] stringExtras = new String[]{"Warrantee","Insurance","Warrantee + Insurance"};
    
    private void FillComboBox(){
        for (int i = 0; i < stringExtras.length; i++) {
            CBExtra.addItem(stringExtras[i]);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("myschema?characterEncoding=utf8PU").createEntityManager();
        carsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cars c");
        carsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : carsQuery.getResultList();
        LBLWelcome = new javax.swing.JLabel();
        LBLBuyCar = new javax.swing.JLabel();
        BTNBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUserRent = new javax.swing.JTable();
        BTNBuy = new javax.swing.JButton();
        CBExtra = new javax.swing.JComboBox<>();
        LBLExtras = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        LBLCost = new javax.swing.JLabel();
        LBLSelect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBLWelcome.setText("Welcome, User!");

        LBLBuyCar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LBLBuyCar.setText("Buy Car");

        BTNBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNBack.setText("Go Back!");
        BTNBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNBackMouseClicked(evt);
            }
        });

        tblUserRent.setAutoCreateRowSorter(true);
        tblUserRent.setDoubleBuffered(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, carsList, tblUserRent);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${make}"));
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${year}"));
        columnBinding.setColumnName("Year");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tblUserRent);
        if (tblUserRent.getColumnModel().getColumnCount() > 0) {
            tblUserRent.getColumnModel().getColumn(0).setResizable(false);
            tblUserRent.getColumnModel().getColumn(1).setResizable(false);
            tblUserRent.getColumnModel().getColumn(2).setResizable(false);
            tblUserRent.getColumnModel().getColumn(3).setResizable(false);
            tblUserRent.getColumnModel().getColumn(4).setResizable(false);
        }

        BTNBuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNBuy.setLabel("Buy Selected");
        BTNBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNBuyMouseClicked(evt);
            }
        });

        LBLExtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLExtras.setText("Select Extras:");

        lblCost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCost.setText("Finall Cost:");

        LBLCost.setBackground(new java.awt.Color(255, 0, 0));
        LBLCost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        LBLSelect.setText("Please select a row!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addComponent(LBLBuyCar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(BTNBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(BTNBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBLExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(CBExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LBLCost, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTNBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LBLBuyCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBLWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBLSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(BTNBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBuyMouseClicked
        BuySelectedCar();
        CallDecorator();
    }//GEN-LAST:event_BTNBuyMouseClicked

    private void BTNBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBackMouseClicked
        LogOut();
    }//GEN-LAST:event_BTNBackMouseClicked
    
    private void Refresh() {
        try {  
            carsList.clear();
            carsList.addAll(carsQuery.getResultList());
        } catch (Exception e) {
            System.out.println("Hiba: "+ e);
        }
    }
   
    public void LogOut(){
        logger.info("Kijelentkezés...");
        this.setVisible(false);
    }
    
    public void BuySelectedCar(){
        logger.info("Autó megvásárlása folyamatban..");
        int selectedRow = tblUserRent.getSelectedRow();
                selectedRow = tblUserRent.convertRowIndexToModel(selectedRow);
                
                int MadeColumnID = 0;
                int CostColumnID = 3;
                
                String selectedMake = String.valueOf(tblUserRent.getModel().getValueAt(tblUserRent.getSelectedRow(), MadeColumnID));
                int Price = Integer.valueOf(String.valueOf(tblUserRent.getModel().getValueAt(tblUserRent.getSelectedRow(), CostColumnID)));
                LBLCost.setText(String.valueOf(tblUserRent.getModel().getValueAt(tblUserRent.getSelectedRow(), CostColumnID)));
                System.out.println(selectedMake);
                CallTemplateMethod(selectedMake);
                
                entityManager.remove(carsList.get(selectedRow));
                entityManager.getTransaction().commit();
                entityManager.getTransaction().begin();

                Refresh();  
                logger.info("Sikeres vétel.");
    }
    
    public void CallDecorator(){
         String selectedExtra = GetSelectedExtraValue();
         switch(selectedExtra){
             
             case("Warrantee"):
                 Car carWithWarrantee = new Warrantee(new BasicCar(this));
                 // Not so Elegant:
                 // carWithWarrantee.GetPrice();
                 // carWithWarrantee.GetExtras();
                 ShowCarExtras(carWithWarrantee);
                 break;
             case("Insurance"):
                 Car carWithInsurance = new Insurance(new BasicCar(this));
                 ShowCarExtras(carWithInsurance);
                 break;
             case("Warrantee + Insurance"):
                 Car carWithAllExtras = new Insurance(new Warrantee(new BasicCar(this)));
                 ShowCarExtras(carWithAllExtras);
                 break;
             default:
                 System.out.println("Invalid Extra Selected!");
         }
    }
    
    
    public String GetSelectedExtraValue(){
        return String.valueOf(CBExtra.getSelectedItem());
    }
    
    private void CallTemplateMethod(String selectedMake){
        switch(selectedMake){
            case "BMW":
                AutoVasarlas bmw = new BMW();
                bmw.VasarlasMenete();
                break;
            case "Audi":
                AutoVasarlas audi = new Audi();
                audi.VasarlasMenete();
                break;
            default:
                AutoVasarlas anothercar = new OtherCar();
                anothercar.VasarlasMenete();
                break;
        }
    }
    
    public String GetSelectedCarValue(){
        return this.LBLCost.getText();
    }
    
    public void ShowCarExtras(Car selectedCarExtras){
        System.out.println("----------------------");
        System.out.println("Az autó ára az extrá(k)-al együtt: "+ selectedCarExtras.GetPrice());
        System.out.println("Extrák: " +selectedCarExtras.GetExtras());
        LBLCost.setText(String.valueOf(selectedCarExtras.GetPrice()));
    }
    
    
//    public void SetPriceLabel(){
//            int MadeColumnID = 0;
//            int CostColumnID = 3;
//            int Price = Integer.valueOf(String.valueOf(tblUserRent.getModel().getValueAt(tblUserRent.getSelectedRow(), CostColumnID)));
//            LBLCost.setText(String.valueOf(tblUserRent.getModel().getValueAt(tblUserRent.getSelectedRow(), CostColumnID)));
//            tblUserRent.repaint();
//    }
    
    
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
            java.util.logging.Logger.getLogger(CRUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBack;
    private javax.swing.JButton BTNBuy;
    private javax.swing.JComboBox<String> CBExtra;
    private javax.swing.JLabel LBLBuyCar;
    private javax.swing.JLabel LBLCost;
    private javax.swing.JLabel LBLExtras;
    private javax.swing.JLabel LBLSelect;
    private javax.swing.JLabel LBLWelcome;
    private java.util.List<Frontend.Cars> carsList;
    private javax.persistence.Query carsQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCost;
    private javax.swing.JTable tblUserRent;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
