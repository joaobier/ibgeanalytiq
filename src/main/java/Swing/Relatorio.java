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

/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    Lista lista;
    City melhorPib;
    City piorPib;
    City melhorIdhEdu;
    City piorIdhEdu;
    City maiorPibTotal;
    City menorPibTotal;
    public Relatorio(Lista lista) {
        this.lista = lista;
        initComponents();
        
        //Inicializando as cidades
        melhorPib = MelhorPib();
        piorPib = PiorPib();
        melhorIdhEdu = melhorIdhEdu(lista);
        piorIdhEdu = piorIdhEdu();
        maiorPibTotal = MaiorPibCidade(lista);
        menorPibTotal = MenorPibCidade();
        
        
        //Mostrando no terminal só pra ver
        System.out.println("Melhor PibPc: " +melhorPib.toString());
        System.out.println("Pior PibPc: " +piorPib.toString());
        System.out.println("Melhor Educação: " +melhorIdhEdu.toString());
        System.out.println("Pior Educação: " +piorIdhEdu.toString());
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(Buscar.DISPOSE_ON_CLOSE);
        
        //Atribuindo aos campos
        
        //melhor pib
        CidadeMelhorPIB.setText(melhorPib.getMunicipio());
        IDHMelhorPib.setText(String.valueOf(melhorPib.getId()));
        IDHEduMelhorPib.setText(String.valueOf(melhorPib.getIdhEducacao()));
        PibMelhorPib.setText(String.valueOf(melhorPib.getPibPcTotal()));
        
        //pior pib
        CidadePiorPIB.setText(piorPib.getMunicipio());
        IDHPiorPib.setText(String.valueOf(piorPib.getIdh()));
        IDHEduPiorPib.setText(String.valueOf(piorPib.getIdhEducacao()));
        PibPiorPib.setText(String.valueOf(piorPib.getPibPcTotal()));
        
        //melhor idh
        CidadeMelhorIDH.setText(melhorIdhEdu.getMunicipio());
        IDHMelhorIDH.setText(String.valueOf(melhorIdhEdu.getIdh()));
        IDHEduMelhorIDH.setText(String.valueOf(melhorIdhEdu.getIdhEducacao()));
        PibMelhorIDH.setText(String.valueOf(melhorIdhEdu.getPibPcTotal()));
        
        //pior idh
        CidadePiorIDH.setText(piorIdhEdu.getMunicipio());
        IDHPiorIDH.setText(String.valueOf(piorIdhEdu.getIdh()));
        IDHEduPiorIDH.setText(String.valueOf(piorIdhEdu.getIdhEducacao()));
        PibPiorIDH.setText(String.valueOf(piorIdhEdu.getPibPcTotal()));
        
        //maior pib total
        CidadeMaiorPibTotal.setText(maiorPibTotal.getMunicipio());
        IDHMelhorPibTotal.setText(String.valueOf(maiorPibTotal.getIdh()));
        IDHEduMelhorPibTotal.setText(String.valueOf(maiorPibTotal.getIdhEducacao()));
        PibPcMelhorPibTotal.setText(String.valueOf(maiorPibTotal.getPibPcTotal()));
        
        //menor pib total
        CidadeMenorPibTotal.setText(menorPibTotal.getMunicipio());
        IDHMenorPibTotal.setText(String.valueOf(menorPibTotal.getIdh()));
        IDHEduMenorPibTotal.setText(String.valueOf(menorPibTotal.getIdhEducacao()));
        PibMenorPibPcTotal.setText(String.valueOf(menorPibTotal.getPibPcTotal()));    
    }

    private City MelhorPib(){
        
        City melhorPib = lista.getCidades().get(0);
        
        for(int i = 1; i < lista.getCidades().size();i++){
            
            if(lista.getCidades().get(i).getPibPcTotal() > melhorPib.getPibPcTotal()){
                melhorPib = lista.getCidades().get(i);
            }
            
        }
        return melhorPib;
        
    }
    
    private City PiorPib(){
        City piorPib = lista.getCidades().get(0);
        for(int i = 1; i < lista.getCidades().size();i++){
            
            if(piorPib.getPibPcTotal() > lista.getCidades().get(i).getPibPcTotal()){
                piorPib = lista.getCidades().get(i);
            }
            
        }
        return piorPib;
    }
    
    static City melhorIdhEdu(Lista lista){
        City melhorIdhEdu = lista.getCidades().get(0);
        for(int i = 1; i < lista.getCidades().size();i++){

            if(lista.getCidades().get(i).getIdhEducacao() > melhorIdhEdu.getIdhEducacao()){
                melhorIdhEdu = lista.getCidades().get(i);
            }

        }

        return melhorIdhEdu;
    }
    
    private City piorIdhEdu(){
        City piorIdhEdu = lista.getCidades().get(0);
        for(int i = 1; i < lista.getCidades().size();i++){
            
            if(piorIdhEdu.getIdhEducacao() > lista.getCidades().get(i).getIdhEducacao()){
                piorIdhEdu = lista.getCidades().get(i);
            }
            
        }
        return piorIdhEdu;
    }
    
    private City MaiorPibCidade(Lista lista){

        City maiorPib = lista.getCidades().get(0);

        for(int i = 1; i < lista.getCidades().size();i++){

            if(lista.getCidades().get(i).getPibTotal() > maiorPib.getPibTotal()){
                maiorPib = lista.getCidades().get(i);
            }

        }
        return maiorPib;

    }
    
    private City MenorPibCidade(){
        City menorPib = lista.getCidades().get(0);
        for(int i = 1; i < lista.getCidades().size();i++){
            
            if(menorPib.getPibTotal() > lista.getCidades().get(i).getPibTotal()){
                menorPib = lista.getCidades().get(i);
            }
            
        }
        return menorPib;
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
        CidadeMelhorPIB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IDHMelhorPib = new javax.swing.JTextField();
        IDHEduMelhorPib = new javax.swing.JTextField();
        PibMelhorPib = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        IDHPiorPib = new javax.swing.JTextField();
        IDHEduPiorPib = new javax.swing.JTextField();
        PibPiorPib = new javax.swing.JTextField();
        CidadePiorPIB = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        IDHMelhorIDH = new javax.swing.JTextField();
        IDHEduMelhorIDH = new javax.swing.JTextField();
        PibMelhorIDH = new javax.swing.JTextField();
        CidadeMelhorIDH = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        IDHPiorIDH = new javax.swing.JTextField();
        IDHEduPiorIDH = new javax.swing.JTextField();
        PibPiorIDH = new javax.swing.JTextField();
        CidadePiorIDH = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        FecharButton = new javax.swing.JButton();
        DetalhesMelhorPib = new javax.swing.JButton();
        DetalhesPiorPib = new javax.swing.JButton();
        DatelhesMelhorIdh = new javax.swing.JButton();
        DetalhesPìorIdh = new javax.swing.JButton();
        PibPcMelhorPibTotal = new javax.swing.JTextField();
        DetalhesMaiorPibTotal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CidadeMaiorPibTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IDHMelhorPibTotal = new javax.swing.JTextField();
        IDHEduMelhorPibTotal = new javax.swing.JTextField();
        PibMenorPibPcTotal = new javax.swing.JTextField();
        DetalhesMenorPibTotal = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        CidadeMenorPibTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        IDHMenorPibTotal = new javax.swing.JTextField();
        IDHEduMenorPibTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório");

        jLabel1.setText("Maior Pib Per Capta");

        CidadeMelhorPIB.setEditable(false);

        jLabel2.setText("Cidade");

        jLabel3.setText("IDH");

        jLabel4.setText("IDH Educacional");

        jLabel5.setText("Pib Per Capta");

        IDHMelhorPib.setEditable(false);

        IDHEduMelhorPib.setEditable(false);

        PibMelhorPib.setEditable(false);

        jLabel6.setText("Menor Pib Per Capta");

        jLabel11.setText("Maior IDH Educacional");

        jLabel16.setText("Menor IDH Educacional");

        IDHPiorPib.setEditable(false);

        IDHEduPiorPib.setEditable(false);

        PibPiorPib.setEditable(false);

        CidadePiorPIB.setEditable(false);

        jLabel21.setText("Cidade");

        jLabel22.setText("IDH");

        jLabel23.setText("IDH Educacional");

        jLabel24.setText("Pib Per Capta");

        IDHMelhorIDH.setEditable(false);

        IDHEduMelhorIDH.setEditable(false);

        PibMelhorIDH.setEditable(false);

        CidadeMelhorIDH.setEditable(false);

        jLabel25.setText("Cidade");

        jLabel26.setText("IDH");

        jLabel27.setText("IDH Educacional");

        jLabel28.setText("Pib Per Capta");

        IDHPiorIDH.setEditable(false);

        IDHEduPiorIDH.setEditable(false);

        PibPiorIDH.setEditable(false);

        CidadePiorIDH.setEditable(false);

        jLabel29.setText("Cidade");

        jLabel30.setText("IDH");

        jLabel31.setText("IDH Educacional");

        jLabel32.setText("Pib Per Capta");

        FecharButton.setText("Fechar");
        FecharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharButtonActionPerformed(evt);
            }
        });

        DetalhesMelhorPib.setText("Detalhes");
        DetalhesMelhorPib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesMelhorPibActionPerformed(evt);
            }
        });

        DetalhesPiorPib.setText("Detalhes");
        DetalhesPiorPib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesPiorPibActionPerformed(evt);
            }
        });

        DatelhesMelhorIdh.setText("Detalhes");
        DatelhesMelhorIdh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatelhesMelhorIdhActionPerformed(evt);
            }
        });

        DetalhesPìorIdh.setText("Detalhes");
        DetalhesPìorIdh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesPìorIdhActionPerformed(evt);
            }
        });

        PibPcMelhorPibTotal.setEditable(false);

        DetalhesMaiorPibTotal.setText("Detalhes");
        DetalhesMaiorPibTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesMaiorPibTotalActionPerformed(evt);
            }
        });

        jLabel7.setText("Maior Pib");

        CidadeMaiorPibTotal.setEditable(false);

        jLabel8.setText("Cidade");

        jLabel9.setText("IDH");

        jLabel10.setText("IDH Educacional");

        jLabel12.setText("Pib Per Capta");

        IDHMelhorPibTotal.setEditable(false);

        IDHEduMelhorPibTotal.setEditable(false);

        PibMenorPibPcTotal.setEditable(false);

        DetalhesMenorPibTotal.setText("Detalhes");
        DetalhesMenorPibTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesMenorPibTotalActionPerformed(evt);
            }
        });

        jLabel13.setText("Menor Pib");

        CidadeMenorPibTotal.setEditable(false);

        jLabel14.setText("Cidade");

        jLabel15.setText("IDH");

        jLabel17.setText("IDH Educacional");

        jLabel18.setText("Pib Per Capta");

        IDHMenorPibTotal.setEditable(false);

        IDHEduMenorPibTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CidadeMelhorPIB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDHMelhorPib, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(IDHEduMelhorPib, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PibMelhorPib, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DetalhesMelhorPib))
                            .addComponent(jLabel5)))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CidadePiorPIB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDHPiorPib, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(IDHEduPiorPib, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PibPiorPib, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DetalhesPiorPib))
                            .addComponent(jLabel24)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CidadeMaiorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IDHMelhorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(IDHEduMelhorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PibPcMelhorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DetalhesMaiorPibTotal))
                                .addComponent(jLabel12)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CidadeMelhorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDHMelhorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(IDHEduMelhorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PibMelhorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DatelhesMelhorIdh))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CidadePiorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDHPiorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(IDHEduPiorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PibPiorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DetalhesPìorIdh))))
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CidadeMenorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDHMenorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(IDHEduMenorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PibMenorPibPcTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DetalhesMenorPibTotal))
                            .addComponent(jLabel18))))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FecharButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PibMelhorPib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CidadeMelhorPIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHMelhorPib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHEduMelhorPib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DetalhesMelhorPib))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PibMelhorIDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CidadeMelhorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHMelhorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHEduMelhorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DatelhesMelhorIdh)))
                        .addGap(7, 7, 7)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PibPiorPib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CidadePiorPIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHPiorPib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHEduPiorPib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DetalhesPiorPib))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PibPiorIDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CidadePiorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHPiorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHEduPiorIDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DetalhesPìorIdh)))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PibPcMelhorPibTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CidadeMaiorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHMelhorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHEduMelhorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DetalhesMaiorPibTotal))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PibMenorPibPcTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CidadeMenorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHMenorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDHEduMenorPibTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DetalhesMenorPibTotal)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(FecharButton)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharButtonActionPerformed
        dispose();
    }//GEN-LAST:event_FecharButtonActionPerformed

    private void DetalhesMelhorPibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesMelhorPibActionPerformed
        Detalhes detalhes = new Detalhes(this.melhorPib);
        detalhes.setVisible(true);
    }//GEN-LAST:event_DetalhesMelhorPibActionPerformed

    private void DetalhesPiorPibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesPiorPibActionPerformed
        Detalhes detalhes = new Detalhes(this.piorPib);
        detalhes.setVisible(true);        
    }//GEN-LAST:event_DetalhesPiorPibActionPerformed

    private void DatelhesMelhorIdhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatelhesMelhorIdhActionPerformed
        Detalhes detalhes = new Detalhes(this.melhorIdhEdu);
        detalhes.setVisible(true);
    }//GEN-LAST:event_DatelhesMelhorIdhActionPerformed

    private void DetalhesPìorIdhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesPìorIdhActionPerformed
        Detalhes detalhes = new Detalhes(this.piorIdhEdu);
        detalhes.setVisible(true);
    }//GEN-LAST:event_DetalhesPìorIdhActionPerformed

    private void DetalhesMaiorPibTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesMaiorPibTotalActionPerformed
        Detalhes detalhes = new Detalhes(this.maiorPibTotal);
        detalhes.setVisible(true);
    }//GEN-LAST:event_DetalhesMaiorPibTotalActionPerformed

    private void DetalhesMenorPibTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesMenorPibTotalActionPerformed
        Detalhes detalhes = new Detalhes(this.menorPibTotal);
        detalhes.setVisible(true);
    }//GEN-LAST:event_DetalhesMenorPibTotalActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CidadeMaiorPibTotal;
    private javax.swing.JTextField CidadeMelhorIDH;
    private javax.swing.JTextField CidadeMelhorPIB;
    private javax.swing.JTextField CidadeMenorPibTotal;
    private javax.swing.JTextField CidadePiorIDH;
    private javax.swing.JTextField CidadePiorPIB;
    private javax.swing.JButton DatelhesMelhorIdh;
    private javax.swing.JButton DetalhesMaiorPibTotal;
    private javax.swing.JButton DetalhesMelhorPib;
    private javax.swing.JButton DetalhesMenorPibTotal;
    private javax.swing.JButton DetalhesPiorPib;
    private javax.swing.JButton DetalhesPìorIdh;
    private javax.swing.JButton FecharButton;
    private javax.swing.JTextField IDHEduMelhorIDH;
    private javax.swing.JTextField IDHEduMelhorPib;
    private javax.swing.JTextField IDHEduMelhorPibTotal;
    private javax.swing.JTextField IDHEduMenorPibTotal;
    private javax.swing.JTextField IDHEduPiorIDH;
    private javax.swing.JTextField IDHEduPiorPib;
    private javax.swing.JTextField IDHMelhorIDH;
    private javax.swing.JTextField IDHMelhorPib;
    private javax.swing.JTextField IDHMelhorPibTotal;
    private javax.swing.JTextField IDHMenorPibTotal;
    private javax.swing.JTextField IDHPiorIDH;
    private javax.swing.JTextField IDHPiorPib;
    private javax.swing.JTextField PibMelhorIDH;
    private javax.swing.JTextField PibMelhorPib;
    private javax.swing.JTextField PibMenorPibPcTotal;
    private javax.swing.JTextField PibPcMelhorPibTotal;
    private javax.swing.JTextField PibPiorIDH;
    private javax.swing.JTextField PibPiorPib;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
