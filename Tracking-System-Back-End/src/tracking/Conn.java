package tracking;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;


public class Conn 
{
    Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Boolean check;
    Boolean finish = false;
    String url = "jdbc:mysql://localhost:3306/tkdb";
    String username = "root";
    String password = "";
    
    
    
    public void start_conn(String sql){
        try {
            con=(Connection) DriverManager.getConnection(url,username,password);
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            check = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database Connection issue "+System.lineSeparator() +e);
            java.util.logging.Logger.getLogger(Conn.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            check = false;
        }
    } //method for dabase connection select quaries
    
    public void start_conn2(String sql){
    
        try{
            con=(Connection) DriverManager.getConnection(url,username,password);
            st=con.createStatement();
            st.executeUpdate(sql);
            check = true;
        }
        catch(Exception e){
            check = false;
            JOptionPane.showMessageDialog(null,"Database Connection issue "+System.lineSeparator() +e);
            java.util.logging.Logger.getLogger(Conn.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//method for dabase connection update quaries
    
    public void end_conn(){
        try {
                rs.close(); 
                pst.close();
                con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database Connection Closing issue "+System.lineSeparator() +e);
            java.util.logging.Logger.getLogger(Conn.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    } //close select quaries database connection/s
    
    public void end_conn2(){
        try {
                st.close();
                con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database Connection Closing issue "+System.lineSeparator() +e);
            java.util.logging.Logger.getLogger(Conn.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    } //close update quaries database connection/s
    
    public void message(String message){
        if (check==true) {
            JOptionPane.showMessageDialog(null, message);
        }else{
            
        }
    }
    
    public void table_size(javax.swing.JTable tbname){
        final TableColumnModel columnModel = tbname.getColumnModel();
        for (int column = 0; column < tbname.getColumnCount(); column++) {
            int width = 50; // Min width
                for (int row = 0; row < tbname.getRowCount(); row++) {
                    TableCellRenderer renderer = tbname.getCellRenderer(row, column);
                    Component comp = tbname.prepareRenderer(renderer, row, column);
                    width = Math.max(comp.getPreferredSize().width+20 , width);
                }

            columnModel.getColumn(column).setPreferredWidth(width);;
        }
        tbname.setAutoResizeMode(tbname.AUTO_RESIZE_OFF);
        
    } //auto set table colum widths    
    
    public void gen_table(String sql,javax.swing.JTable tbname){
        try{
        start_conn(sql);
        tbname.setModel(DbUtils.resultSetToTableModel(rs));
        end_conn();
        table_size(tbname);
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
         java.util.logging.Logger.getLogger(Conn.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//genarate tables
    
    public void gen_combo(String sql,javax.swing.JComboBox combo,String item){
        try {
            finish=false;
            start_conn(sql);
            combo.removeAllItems();   
            while (rs.next()) {            
                combo.addItem(rs.getString(item));
            }
            end_conn();
            finish = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            java.util.logging.Logger.getLogger(Conn.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//add data to combo boxes
    
    public void gen_combo(String sql,javax.swing.JComboBox combo,String item1,String item2){
        try {
            finish=false;
            start_conn(sql);
            combo.removeAllItems();
            while (rs.next()) {            
                combo.addItem(rs.getString(item1));
                combo.addItem(rs.getString(item2));
            }
            end_conn();
            finish = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            java.util.logging.Logger.getLogger(Conn.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//add data to combo boxes
    
    public void limit(int a ,javax.swing.JTextField name){
        name.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) { 
        if (name.getText().length() >= a ) 
            e.consume(); 
    }  
});} //set charater limit for fileds
    
    public void numonly(Object objSource){
         ((Component)objSource).addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e ){
                String filterStr = "0123456789";
                char c=(char)e.getKeyChar();
                if(filterStr.indexOf(c)<0){
                    e.consume();
                    }

                }
                @Override
                public void keyReleased(KeyEvent e ){}
                @Override
                public void keyPressed(KeyEvent e ){}

             
     });
     
     } //limit text input to numbers
    
    public boolean all_filled(javax.swing.JPanel panel){
        boolean all_filled = false;
                for (Component c : panel.getComponents()) {
                    if (c instanceof JTextField) {
                        //((JTextField)c).setText("");
                        if (((JTextField) c).getText().equals("")) {
                            all_filled = false;
                            
                        } else {
                            all_filled = true;  
                        }
                    }
                }
    return all_filled;
    
    }
    
    public void adminaction(String AdUname,String Action,String notes){
        String date =new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        String time =new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        start_conn2("INSERT INTO `admin_action`(`AdUName`, `Date`, `Time`, `AdAction`, `notes`) VALUES ('"+AdUname+"','"+date+"','"+time+"','"+Action+"','"+notes+"')");
        end_conn2();
    }
}