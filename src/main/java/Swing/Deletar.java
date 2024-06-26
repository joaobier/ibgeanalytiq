/*
 * Copyright (C) 2024 Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com> 
 * Copyright (C) 2024 Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * Copyright (C) 2024 João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * Copyright (C) 2024 Theo da Silva Sa <03silva.theo@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Swing;

import Model.City;
import Services.Delete;
import Services.Lista;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 */
public class Deletar extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    private int id;
    private Lista lista;
    private City cidade;
    private TelaPrincipal telaPrincipal;
    public Deletar(int id, TelaPrincipal telaPrincipal, Lista lista) {
        initComponents();
        this.cidade = lista.getCidades().get(id);
        idCitySelect.setText(cidade.getMunicipio());
        this.id = id;
        this.telaPrincipal = telaPrincipal;
        setTitle("Deletar");
        //Delete delete = new Delete();
        this.lista = lista;
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(Deletar.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttomYesDelCity = new javax.swing.JButton();
        buttonNoDelCity = new javax.swing.JButton();
        idCitySelect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Alert");

        jLabel3.setText("Deseja deletar a cidade selecionada?");

        buttomYesDelCity.setText("Sim");
        buttomYesDelCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomYesDelCityActionPerformed(evt);
            }
        });

        buttonNoDelCity.setText("Não");
        buttonNoDelCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNoDelCityActionPerformed(evt);
            }
        });

        idCitySelect.setText("City");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(idCitySelect)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttomYesDelCity)
                        .addGap(18, 18, 18)
                        .addComponent(buttonNoDelCity))
                    .addComponent(jLabel2))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(idCitySelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttomYesDelCity)
                    .addComponent(buttonNoDelCity))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttomYesDelCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomYesDelCityActionPerformed

        Delete delete = new Delete();
        
        idCitySelect.setText(cidade.getMunicipio());
        delete.DeleteById(id, lista);
        this.telaPrincipal.removeRow(id);
        dispose();
        
    }//GEN-LAST:event_buttomYesDelCityActionPerformed

    
    private void buttonNoDelCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNoDelCityActionPerformed
        dispose();
    }//GEN-LAST:event_buttonNoDelCityActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttomYesDelCity;
    private javax.swing.JButton buttonNoDelCity;
    private javax.swing.JLabel idCitySelect;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
