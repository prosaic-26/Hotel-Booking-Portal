
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIPAK
 */
public class location extends javax.swing.JFrame {
    public static String place=null;
    public static int tr=0;
    public static int days=0;
    public static String outd=null,ind=null;
    /**
     * Creates new form location
     */
    public location() {
        initComponents();
        int r=0,g=0,b=0;
        float[] hsb=new float[3];
        r=14;
        g=140;
        b=214;
        Color.RGBtoHSB(r, g, b, hsb);
        logout.setBackground(Color.red);
        book.setBackground(Color.getHSBColor(hsb[0],hsb[1],hsb[2]));
        
        back.setBackground(Color.getHSBColor(hsb[0],hsb[1],hsb[2]));
        r=40;
        g=40;
        b=40;
        Color.RGBtoHSB(r, g, b, hsb);
        this.getContentPane().setBackground(Color.getHSBColor(hsb[0],hsb[1],hsb[2]));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        location = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        inyy = new javax.swing.JComboBox();
        inmm = new javax.swing.JComboBox();
        indd = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        outyy = new javax.swing.JComboBox();
        outmm = new javax.swing.JComboBox();
        outdd = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        gguest = new javax.swing.JComboBox<>();
        groom = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 169, 255));
        jLabel1.setText("HOTEL BOOKING PORTAL");

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Location :");

        location.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        location.setForeground(new java.awt.Color(255, 255, 255));
        location.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahmedabad", "Bangalore", "Chennai", "Darjeeling", "Delhi", "Goa", "Haridwar", "Hyderabad", "Kanyakumari", "Kolkata", "Manali", "Mumbai", "Pune", "Shimla", "Srinagar", "Udaipur" }));

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check-in Date (yy/mm/dd) :");

        inyy.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        inyy.setForeground(new java.awt.Color(255, 255, 255));
        inyy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        inmm.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        inmm.setForeground(new java.awt.Color(255, 255, 255));
        inmm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        inmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmmActionPerformed(evt);
            }
        });

        indd.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        indd.setForeground(new java.awt.Color(255, 255, 255));
        indd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel4.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Check-out Date (yy/mm/dd) :");

        outyy.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        outyy.setForeground(new java.awt.Color(255, 255, 255));
        outyy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        outmm.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        outmm.setForeground(new java.awt.Color(255, 255, 255));
        outmm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        outmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outmmActionPerformed(evt);
            }
        });

        outdd.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        outdd.setForeground(new java.awt.Color(255, 255, 255));
        outdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel5.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number of Guests :");

        jLabel6.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number of Rooms :");

        jLabel7.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("* Number of guests in one room should not exceed 4.");

        book.setBackground(new java.awt.Color(0, 0, 255));
        book.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setText("Ready to Book");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("* Number of days of stay should not exceed 30.");

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Caviar Dreams", 1, 48)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("←");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1541829391162 (1).png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        gguest.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        gguest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));

        groom.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        groom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(indd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(outyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(outdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(groom, javax.swing.GroupLayout.Alignment.LEADING, 0, 89, Short.MAX_VALUE)
                                .addComponent(gguest, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gguest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(groom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmmActionPerformed
        // TODO add your handling code here:
        int gmm=Integer.parseInt((String)inmm.getSelectedItem());
        int gyy=Integer.parseInt((String)inyy.getSelectedItem());
        if(gmm==1 || gmm==3 || gmm==5 || gmm==7 || gmm==8 || gmm==10 || gmm==12)
        {
            String labels[] = { "01", "02", "03", "04", "05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31" };
            final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);
            indd.setModel(model);
        }
        else if(gmm==4 || gmm==6 || gmm==9 || gmm==11)
        {
            String labels[] = { "01", "02", "03", "04", "05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30" };
            final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);
            indd.setModel(model);
            
            //dd.setMaximumRowCount(30);
        }
        else if(gmm==2 && gyy%4==0)
        {
            String labels[] = { "01", "02", "03", "04", "05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29" };
            final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);
            indd.setModel(model);
            
            //dd.setMaximumRowCount(29);
        }
        else if(gmm==2 && gyy%4!=0)
        {
            String labels[] = { "01", "02", "03", "04", "05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28" };
            final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);
            indd.setModel(model);
            
            //dd.setMaximumRowCount(28);
        }
    }//GEN-LAST:event_inmmActionPerformed

    private void outmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outmmActionPerformed
        // TODO add your handling code here:
        int gmm=Integer.parseInt((String)outmm.getSelectedItem());
        int gyy=Integer.parseInt((String)outyy.getSelectedItem());
        if(gmm==1 || gmm==3 || gmm==5 || gmm==7 || gmm==8 || gmm==10 || gmm==12)
        {
            String labels[] = { "01", "02", "03", "04", "05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31" };
            final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);
            outdd.setModel(model);
        }
        else if(gmm==4 || gmm==6 || gmm==9 || gmm==11)
        {
            String labels[] = { "01", "02", "03", "04", "05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30" };
            final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);
            outdd.setModel(model);
            
            //dd.setMaximumRowCount(30);
        }
        else if(gmm==2 && gyy%4==0)
        {
            String labels[] = { "01", "02", "03", "04", "05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29" };
            final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);
            outdd.setModel(model);
            
            //dd.setMaximumRowCount(29);
        }
        else if(gmm==2 && gyy%4!=0)
        {
            String labels[] = { "01", "02", "03", "04", "05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28" };
            final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);
            outdd.setModel(model);
            
            //dd.setMaximumRowCount(28);
        }
    }//GEN-LAST:event_outmmActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = new Date();  
        String currentDate=formatter.format(date);
        int temp=0;
        
           int gg=Integer.parseInt((String)gguest.getSelectedItem());
           int gr=Integer.parseInt((String)groom.getSelectedItem());
           outd=(String)outyy.getSelectedItem()+"-"+(String)outmm.getSelectedItem()+"-"+(String)outdd.getSelectedItem();
           ind=(String)inyy.getSelectedItem()+"-"+(String)inmm.getSelectedItem()+"-"+(String)indd.getSelectedItem();
           try
           {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oop?zeroDateTimeBehavior=convertToNull","root","12345");
                Statement s=con.createStatement();
                ResultSet rs=null;
                rs=s.executeQuery("select datediff('"+ind+"','"+currentDate+"');");
                while(rs.next())
                {
                    temp=rs.getInt(1);
                }
                if(temp>=0)
                {
                    rs=s.executeQuery("select datediff('"+outd+"','"+ind+"');");
                    while(rs.next())
                    {
                        days=rs.getInt(1);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"You cant book hotel in the PAST !");
                }
                
                
           }
           catch(Exception e)
                   {
                       System.out.println(e);
                   }
           if((gg)<=(gr*4) && days>0 && days<=30 && temp>=0)
           {
               String x=(String)location.getSelectedItem();
               tr=gr;
               this.setVisible(false);
               place=x;
               this.setVisible(false);
               new bookl().setVisible(true);
               //JOptionPane.showMessageDialog(this,"Submission Successfull!");
           }
           else
           {
               if(temp<0)
               {
                   
               }
               else
               {
                   JOptionPane.showMessageDialog(this,"Please read the note carefully...");
               }
           }
        
        
    }//GEN-LAST:event_bookActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        menupage a =new menupage();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        login a =new login();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new location().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton book;
    private javax.swing.JComboBox<String> gguest;
    private javax.swing.JComboBox<String> groom;
    private javax.swing.JComboBox indd;
    private javax.swing.JComboBox inmm;
    private javax.swing.JComboBox inyy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox location;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox outdd;
    private javax.swing.JComboBox outmm;
    private javax.swing.JComboBox outyy;
    // End of variables declaration//GEN-END:variables
}
