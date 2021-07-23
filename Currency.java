private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        Double tot; 
        Double amount = Double.parseDouble(txtamount.getText());
        
        if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString() == "Srilankan Rupees")
      
            tot = amount * 179.50;
            JOptionPane.showMessageDialog(this, "Your Amount will be " + tot.toString());
        }
       else  if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString() == "Indian Rupees")
        {
            tot = amount * 70.50;
            JOptionPane.showMessageDialog(this, "Your Amount will be " + tot.toString());
        }        
    }
