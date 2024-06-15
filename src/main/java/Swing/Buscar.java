/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

import Model.City;
import Services.Create;
import Services.Lista;
import Services.Update;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Edicao
     */
    int indexDaCidadeBuscada;
    Lista lista;
    
    public Buscar(int index, Lista lista) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(Buscar.DISPOSE_ON_CLOSE);
        
        this.indexDaCidadeBuscada = index;
        
        //inicializa a lista aqui já
        //lista = new Lista();
        
        //atualiza a lista pra garantir que ela tá igual
        //lista.atualizarLista();
        
        
        //ArrayList<City> cidades = lista.getCidades();
        
        City cidadeBuscar = null;
        
        for (int i = 0; i < lista.getCidades().size(); i++) {
            City item = lista.getCidades().get(i);
            if(item.getId().equals(String.valueOf(index))) {
                cidadeBuscar = item;
            }
        }
       
        System.out.println(cidadeBuscar.toString());
        
        //Preenchendo os textfield
        idField.setText(cidadeBuscar.getId());
        municipioField.setText(cidadeBuscar.getMunicipio());
        estadoField.setText(cidadeBuscar.getEstado());
        microRegiaoField.setText(cidadeBuscar.getMicroregiao());
        regiaoGeograficaField.setText(cidadeBuscar.getRegiaoGeografica());
        areaField.setText(String.valueOf(cidadeBuscar.getArea()));
        populacaoField.setText(String.valueOf(cidadeBuscar.getPopulacao()));
        domiciliosField.setText(String.valueOf(cidadeBuscar.getDomicilios()));
        pibTotalField.setText(String.valueOf(cidadeBuscar.getPibTotal()));        
        idhField.setText(String.valueOf(cidadeBuscar.getIdh()));        
        rendaMediaField.setText(String.valueOf(cidadeBuscar.getRendaMedia()));        
        rendaNominalField.setText(String.valueOf(cidadeBuscar.getRendaNominal()));
        peaField.setText(String.valueOf(cidadeBuscar.getPea()));        
        idhEduca.setText(String.valueOf(cidadeBuscar.getIdhEducacao()));
        idhLonge.setText(String.valueOf(cidadeBuscar.getIdhLongevidade()));
        
    }
        
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        municipioField = new javax.swing.JTextField();
        estadoField = new javax.swing.JTextField();
        regiaoGeograficaField = new javax.swing.JTextField();
        areaField = new javax.swing.JTextField();
        populacaoField = new javax.swing.JTextField();
        domiciliosField = new javax.swing.JTextField();
        pibTotalField = new javax.swing.JTextField();
        idhField = new javax.swing.JTextField();
        rendaMediaField = new javax.swing.JTextField();
        rendaNominalField = new javax.swing.JTextField();
        peaField = new javax.swing.JTextField();
        idhEduca = new javax.swing.JTextField();
        idhLonge = new javax.swing.JTextField();
        FecharButton = new javax.swing.JButton();
        microRegiaoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar");

        idField.setEditable(false);

        municipioField.setEditable(false);

        estadoField.setEditable(false);

        regiaoGeograficaField.setEditable(false);

        areaField.setEditable(false);

        populacaoField.setEditable(false);

        domiciliosField.setEditable(false);

        pibTotalField.setEditable(false);

        idhField.setEditable(false);

        rendaMediaField.setEditable(false);

        rendaNominalField.setEditable(false);

        peaField.setEditable(false);

        idhEduca.setEditable(false);

        idhLonge.setEditable(false);

        FecharButton.setText("Voltar");
        FecharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharButtonActionPerformed(evt);
            }
        });

        microRegiaoField.setEditable(false);

        jLabel1.setText("Código IBGE");

        jLabel2.setText("Município");

        jLabel3.setText("Microregião");

        jLabel4.setText("Estado");

        jLabel5.setText("Regiao Geográfica");

        jLabel6.setText("Área Km²");

        jLabel7.setText("População");

        jLabel8.setText("Domicílios");

        jLabel9.setText("PIB Total (R$ mil)");

        jLabel10.setText("IDH");

        jLabel11.setText("Renda Média");

        jLabel12.setText("Renda Nominal");

        jLabel13.setText("PEA Dia");

        jLabel14.setText("IDH Educação");

        jLabel15.setText("IDH Longevidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FecharButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(regiaoGeograficaField)
                            .addComponent(estadoField)
                            .addComponent(microRegiaoField)
                            .addComponent(municipioField)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(areaField)
                            .addComponent(populacaoField)
                            .addComponent(domiciliosField)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(idhField)
                            .addComponent(pibTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(idhEduca, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(peaField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(rendaNominalField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(rendaMediaField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(idhLonge, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rendaMediaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel14))
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pibTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idhEduca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel15))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idhField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idhLonge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(populacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rendaNominalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(148, 148, 148))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel7)
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel13))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(domiciliosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(peaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(municipioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(microRegiaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(estadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regiaoGeograficaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(FecharButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharButtonActionPerformed
        
        //Update update = new Update();
        
        /*        
        String id = idField.getText();
        String municipio = municipioField.getText();
        String estado = estadoField.getText();
        String microRegiao = microRegiaoField.getText();
        String regiaoGeografica = regiaoGeograficaField.getText();
        double area = Double.parseDouble(areaField.getText());
        double populacao = Double.parseDouble(populacaoField.getText());
        double domicilios = Double.parseDouble(domiciliosField.getText());
        double pibTotal = Double.parseDouble(pibTotalField.getText());
        double idh = Double.parseDouble(idhField.getText());
        double rendaMedia = Double.parseDouble(rendaMediaField.getText());
        double rendaNominal = Double.parseDouble(rendaNominalField.getText());
        double pea = Double.parseDouble(peaField.getText());
        double idhEducacao = Double.parseDouble(idhEduca.getText());
        double idhLongevidade = Double.parseDouble(idhLonge.getText());
        //double densidadeDemografica = Double.parseDouble(Field.getText());
        //double pibTotal = Double.parseDouble(Field.getText());
        //String classificacaoIDH;
        //String pibPcTotal;
        
        
        City cidade = new City(
                id,
                municipio,
                microRegiao,
                estado,
                regiaoGeografica,
                area,
                populacao,
                domicilios,
                pibTotal,
                idh,
                rendaMedia,
                rendaNominal,
                pea,
                idhEducacao,
                idhLongevidade
        );
        String idUpdate = String.valueOf(indexDaCidadeBuscada);
        update.UpdateById(idUpdate ,this.lista, cidade);
        */
        dispose();
        
        //update.UpdateById(i, lista, cidadeEditar);
    }//GEN-LAST:event_FecharButtonActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FecharButton;
    private javax.swing.JTextField areaField;
    private javax.swing.JTextField domiciliosField;
    private javax.swing.JTextField estadoField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idhEduca;
    private javax.swing.JTextField idhField;
    private javax.swing.JTextField idhLonge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField microRegiaoField;
    private javax.swing.JTextField municipioField;
    private javax.swing.JTextField peaField;
    private javax.swing.JTextField pibTotalField;
    private javax.swing.JTextField populacaoField;
    private javax.swing.JTextField regiaoGeograficaField;
    private javax.swing.JTextField rendaMediaField;
    private javax.swing.JTextField rendaNominalField;
    // End of variables declaration//GEN-END:variables
}
