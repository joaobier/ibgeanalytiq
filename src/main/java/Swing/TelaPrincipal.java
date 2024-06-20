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
import Services.Lista;
import Swing.Filters.LetterFilter;
import Swing.Filters.NumberOnlyFilter;
import Swing.Filters.NumberFilter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    Lista lista;
    public TelaPrincipal() {
        lista = new Lista();
        System.out.println("eu sou a lista instanciada na tela principal");
        //lista.sizeList();
        initComponents();
   
        preencherTabela();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(TelaPrincipal.EXIT_ON_CLOSE);
        
        //Setando os filtros
        ((AbstractDocument) TextFieldBuscar.getDocument()).setDocumentFilter(new NumberOnlyFilter());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        TextFieldBuscar = new javax.swing.JTextField();
        BuscarButton = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
        EditarButton = new javax.swing.JButton();
        DeletarButton = new javax.swing.JButton();
        RelatorioButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IBGE AnalytiQ");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código IBGE", "Municípios", "Microrregião", "Estado", "Região Geográfica", "Área Km²", "População", "Domicílios", "PIB Total (R$ mil)", "IDH", "Renda Média", "Renda Nominal", "PEA Dia", "IDH Educação", "IDH Longevidade", "Densidade Demográfica", "Classificação IDH", "PIB perCapta", "Última Alteração", "Classificação Edu", "Classificação Longe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        TextFieldBuscar.setToolTipText("");

        BuscarButton.setBackground(new java.awt.Color(255, 79, 0));
        BuscarButton.setForeground(new java.awt.Color(255, 255, 255));
        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        CreateButton.setBackground(new java.awt.Color(0, 102, 0));
        CreateButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateButton.setText("Adicionar");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        EditarButton.setBackground(new java.awt.Color(63, 75, 152));
        EditarButton.setForeground(new java.awt.Color(255, 255, 255));
        EditarButton.setText("Editar");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });

        DeletarButton.setBackground(new java.awt.Color(118, 0, 0));
        DeletarButton.setForeground(new java.awt.Color(255, 255, 255));
        DeletarButton.setText("Deletar");
        DeletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarButtonActionPerformed(evt);
            }
        });

        RelatorioButton.setBackground(new java.awt.Color(0, 102, 102));
        RelatorioButton.setForeground(new java.awt.Color(255, 255, 255));
        RelatorioButton.setText("Relatório");
        RelatorioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar pelo Código IBGE");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IBGE_AnalytiQ_Logo2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(245, 245, 245)
                .addComponent(RelatorioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeletarButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarButton)
                            .addComponent(CreateButton)
                            .addComponent(EditarButton)
                            .addComponent(DeletarButton)
                            .addComponent(RelatorioButton))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        Criar telaCriar = new Criar(this.lista, this);
        telaCriar.setVisible(true);
        
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        System.out.println("Tamanho da lista quando aperto botão editar");
        //lista.sizeList();
        int linhaSelecionada = Table.getSelectedRow();
        if(linhaSelecionada != -1){
            Editar telaEditar = new Editar(linhaSelecionada, this.lista,this);
            telaEditar.setVisible(true);
        }
        System.out.println("Tamanho da lista após o processamento do botão editar");
        //lista.sizeList();

        
    }//GEN-LAST:event_EditarButtonActionPerformed

    private void DeletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarButtonActionPerformed
        System.out.println("Tamanho da lista quando aperto botão deletar");
        //lista.sizeList();
        int linhaSelecionada = Table.getSelectedRow();
        if(linhaSelecionada != -1){
            Deletar telaDeletar = new Deletar(linhaSelecionada, this, this.lista);
            telaDeletar.setVisible(true);
        }
        System.out.println("Tamanho da lista após o processamento do botão deletar");
        //lista.sizeList();
        /*
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int linhaSelecionada = Table.getSelectedRow();
        if(linhaSelecionada != -1){
            Deletar telaDeletar = new Deletar(linhaSelecionada, this);
            telaDeletar.setVisible(true);
        }
        model.removeRow(Table.getSelectedRow());
        */
    }//GEN-LAST:event_DeletarButtonActionPerformed

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        System.out.println("Tamanho da lista quando aperto botão buscar");
        //lista.sizeList();
        String IdBusca = TextFieldBuscar.getText();
        Buscar telaBuscar = new Buscar(Integer.parseInt(IdBusca),this.lista);
        telaBuscar.setVisible(true);
        System.out.println("Tamanho da lista após o processamento do botão buscar");
        //lista.sizeList();
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void RelatorioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioButtonActionPerformed
        
        Relatorio relatorio = new Relatorio(this.lista);
        relatorio.setVisible(true);
        
    }//GEN-LAST:event_RelatorioButtonActionPerformed

    public void removeRow(int row){
        //lista.sizeList();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int linhaSelecionada = row;
        if(linhaSelecionada != -1){
            model.removeRow(Table.getSelectedRow());
            
            //Deletar telaDeletar = new Deletar(linhaSelecionada, this);
            //telaDeletar.setVisible(true);
        }
        
    }
    
    public void adicionarRow(City cidade){
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Object rowData[] = new Object[21];

            rowData[0] = cidade.getId();
            rowData[1] = cidade.getMunicipio();
            rowData[2] = cidade.getMicroregiao();
            rowData[3] = cidade.getEstado();
            rowData[4] = cidade.getRegiaoGeografica();
            rowData[5] = cidade.getArea();
            rowData[6] = cidade.getPopulacao();
            rowData[7] = cidade.getDomicilios();
            rowData[8] = cidade.getPibTotal();
            rowData[9] = cidade.getIdh();
            rowData[10] = cidade.getRendaMedia();
            rowData[11] = cidade.getRendaNominal();
            rowData[12] = cidade.getPea();
            rowData[13] = cidade.getIdhEducacao();
            rowData[14] = cidade.getIdhLongevidade();
            rowData[15] = cidade.getDensidadeDemografica();
            rowData[16] = cidade.getClassficacaoIDH();
            rowData[17] = cidade.getPibPcTotal();
            rowData[18] = cidade.getUltimaAtualizacao();
            rowData[19] = cidade.getClassificacaoIDHEdu();
            rowData[20] = cidade.getClassificacaoIDHLongevidade();
            model.addRow(rowData);

    }
    
    private void preencherTabela(){
        
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        
        //ArrayList<City> cidades = lista.getCidades();
        
        Object rowData[] = new Object[21];
         
        for(int i = 0; i < lista.getCidades().size(); i++){
            
            rowData[0] = lista.getCidades().get(i).getId();
            rowData[1] = lista.getCidades().get(i).getMunicipio();
            rowData[2] = lista.getCidades().get(i).getMicroregiao();
            rowData[3] = lista.getCidades().get(i).getEstado();
            rowData[4] = lista.getCidades().get(i).getRegiaoGeografica();
            rowData[5] = lista.getCidades().get(i).getArea();
            rowData[6] = lista.getCidades().get(i).getPopulacao();
            rowData[7] = lista.getCidades().get(i).getDomicilios();
            rowData[8] = lista.getCidades().get(i).getPibTotal();
            rowData[9] = lista.getCidades().get(i).getIdh();
            rowData[10] = lista.getCidades().get(i).getRendaMedia();
            rowData[11] = lista.getCidades().get(i).getRendaNominal();
            rowData[12] = lista.getCidades().get(i).getPea();
            rowData[13] = lista.getCidades().get(i).getIdhEducacao();
            rowData[14] = lista.getCidades().get(i).getIdhLongevidade();
            rowData[15] = lista.getCidades().get(i).getDensidadeDemografica();
            rowData[16] = lista.getCidades().get(i).getClassficacaoIDH();
            rowData[17] = lista.getCidades().get(i).getPibPcTotal();
            rowData[18] = lista.getCidades().get(i).getUltimaAtualizacao();
            rowData[19] = lista.getCidades().get(i).getClassificacaoIDHEdu();
            rowData[20] = lista.getCidades().get(i).getClassificacaoIDHLongevidade();
            model.addRow(rowData);
        }
        
        /*
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(Table.getModel());
        Table.setRowSorter(sorter);
        */ //está bugando por enquanto
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeletarButton;
    private javax.swing.JButton EditarButton;
    private javax.swing.JButton RelatorioButton;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextFieldBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
