package me.xlucash.sorting;

import org.w3c.dom.ranges.RangeException;

import java.text.DecimalFormat;
import java.util.Random;

import static me.xlucash.sorting.FindNumber.findNumber;
import static me.xlucash.sorting.Functions.*;
import static me.xlucash.sorting.Sorting.*;

public class SortingApp extends javax.swing.JFrame {
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel avgLabel;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JLabel findLabel;
    private javax.swing.JLabel functionsLabel;
    private javax.swing.JButton btnSort1;
    private javax.swing.JButton btnSort2;
    private javax.swing.JButton btnSort3;
    private javax.swing.JLabel medianLabel;
    private javax.swing.JLabel dominantLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JLabel sort1Label;
    private javax.swing.JLabel sort2Label;
    private javax.swing.JLabel sort3Label;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAvg;
    private javax.swing.JTextField txtDominant;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMedian;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSort1;
    private javax.swing.JTextField txtSort2;
    private javax.swing.JTextField txtSort3;
    private javax.swing.JTextField txtUnsorted;
    private javax.swing.JTextField txtWanted;
    private javax.swing.JLabel unsortedLabel;
    private javax.swing.JLabel wantedLabel;

    public SortingApp() {
        super("Sorting");
        initComponents();
    }
    int[] numberArray;

    private void initComponents() {

        minLabel = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        txtMin = new javax.swing.JTextField();
        maxLabel = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        sortLabel = new javax.swing.JLabel();
        sort1Label = new javax.swing.JLabel();
        sort2Label = new javax.swing.JLabel();
        sort3Label = new javax.swing.JLabel();
        txtSort1 = new javax.swing.JTextField();
        txtSort2 = new javax.swing.JTextField();
        txtSort3 = new javax.swing.JTextField();
        btnSort1 = new javax.swing.JButton();
        btnSort2 = new javax.swing.JButton();
        btnSort3 = new javax.swing.JButton();
        unsortedLabel = new javax.swing.JLabel();
        txtUnsorted = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        findLabel = new javax.swing.JLabel();
        wantedLabel = new javax.swing.JLabel();
        positionLabel = new javax.swing.JLabel();
        txtWanted = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtAvg = new javax.swing.JTextField();
        medianLabel = new javax.swing.JLabel();
        txtMedian = new javax.swing.JTextField();
        dominantLabel = new javax.swing.JLabel();
        txtDominant = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        avgLabel = new javax.swing.JLabel();
        functionsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        minLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        minLabel.setText("Min:");
        minLabel.setToolTipText("");

        btnGenerate.setBackground(new java.awt.Color(204, 204, 204));
        btnGenerate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerate.setText("Generuj ciąg liczb");
        btnGenerate.addActionListener(evt -> btnGenerateActionPerformed(evt));

        maxLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maxLabel.setText("Max:");

        amountLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amountLabel.setText("Ilość");

        sortLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sortLabel.setText("Sortowanie");

        sort1Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sort1Label.setText("Ciąg posortowany Bąbelkowo");

        sort2Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sort2Label.setText("Ciąg posortowany Wstawianiem");

        sort3Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sort3Label.setText("Ciąg posortowany QuickSortem");

        txtSort1.setEditable(false);

        txtSort2.setEditable(false);

        txtSort3.setEditable(false);

        btnSort1.setBackground(new java.awt.Color(204, 204, 204));
        btnSort1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSort1.setText("Sortuj bąbelkowo");
        btnSort1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSort1ActionPerformed(evt);
            }
        });

        btnSort2.setBackground(new java.awt.Color(204, 204, 204));
        btnSort2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSort2.setText("Sortuj przez Wstawianie");
        btnSort2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSort2ActionPerformed(evt);
            }
        });

        btnSort3.setBackground(new java.awt.Color(204, 204, 204));
        btnSort3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSort3.setText("Sortuj przez QuickSort");
        btnSort3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSort3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sort1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sort2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sort3Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSort3, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(txtSort1)
                    .addComponent(txtSort2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSort2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSort1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSort3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sortLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sort1Label)
                            .addComponent(btnSort1))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSort1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sort2Label)
                        .addComponent(btnSort2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtSort2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSort3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sort3Label)
                            .addComponent(btnSort3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        unsortedLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        unsortedLabel.setText("Ciąg nieposortowany:");

        txtUnsorted.setEditable(false);

        findLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        findLabel.setText("Wyszukiwanie");

        wantedLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        wantedLabel.setText("Szukana liczba");

        positionLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        positionLabel.setText("Pozycja w ciągu");

        txtPosition.setEditable(false);

        btnFind.setBackground(new java.awt.Color(204, 204, 204));
        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(wantedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWanted, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(btnFind))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(findLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnFind))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(findLabel)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wantedLabel)
                            .addComponent(txtWanted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionLabel))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txtAvg.setEditable(false);

        medianLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medianLabel.setText("Mediana:");

        txtMedian.setEditable(false);

        dominantLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dominantLabel.setText("Dominanta:");

        txtDominant.setEditable(false);

        btnCalculate.setBackground(new java.awt.Color(204, 204, 204));
        btnCalculate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        avgLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        avgLabel.setText("Średnia:");

        functionsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        functionsLabel.setText("Funkcje statystyczne");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(functionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(avgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medianLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedian, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(dominantLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDominant, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCalculate)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(functionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAvg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medianLabel)
                    .addComponent(txtMedian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dominantLabel)
                    .addComponent(txtDominant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate)
                    .addComponent(avgLabel))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(unsortedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUnsorted, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minLabel)
                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxLabel)
                        .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amountLabel)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unsortedLabel)
                    .addComponent(txtUnsorted, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            txtPosition.setText("");
            int wanted = Integer.parseInt(txtWanted.getText());
            int[] copyForWantedNumber = numberArray.clone();
            bubbleSort(copyForWantedNumber);

            if(findNumber(wanted, copyForWantedNumber)==0)
            {
                txtPosition.setText("-");
            } else
            {
                txtPosition.setText(findNumber(wanted, copyForWantedNumber)+"");
            }

        } catch (Exception e)
        {
            System.out.println("Błąd: "+e.getMessage());
        }
    }

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            int min = Integer.parseInt(txtMin.getText());
            int max = Integer.parseInt(txtMax.getText());
            int amount = Integer.parseInt(txtAmount.getText());

            int[] drawnNumbers = GenerateNumbersArray(min, max, amount);
            numberArray = drawnNumbers;
            txtUnsorted.setText(numbersToTxt(numberArray));
        } catch (Exception e)
        {
            System.out.println("Błąd: "+e.getMessage());
        }
    }
    int[] GenerateNumbersArray(int min, int max, int amount)
    {
        int[] array = new int[amount];
        Random generator = new Random();

        for(int i = 0; i<array.length; i++)
        {
            array[i] = generator.nextInt(min, max);
        }

        return array;
    }
    String numbersToTxt(int[] array)
    {
        String arrayTxt = "";
        for(int number: array)
            arrayTxt += number+" ";

        return arrayTxt;
    }

    private void btnSort1ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            txtSort1.setText("");

            int[] copyForSort1 = numberArray.clone();
            bubbleSort(copyForSort1);
            txtSort1.setText(numbersToTxt(copyForSort1));
        } catch (Exception e)
        {
            System.out.println("Błąd: "+e.getMessage());
        }
    }

    private void btnSort2ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            txtSort2.setText("");

            int[] copyForSort2 = numberArray.clone();
            insertionSort(copyForSort2);
            txtSort2.setText(numbersToTxt(copyForSort2));
        } catch (Exception e)
        {
            System.out.println("Błąd: "+e.getMessage());
        }
    }

    private void btnSort3ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            txtSort3.setText("");

            int[] copyForSort3 = numberArray.clone();
            quickSort(copyForSort3);

            txtSort3.setText(numbersToTxt(copyForSort3));

        } catch (Exception e)
        {
            System.out.println("Błąd: "+e.getMessage());
        }
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {
        txtAvg.setText("");
        txtMedian.setText("");
        txtDominant.setText("");
        try
        {
            int[] copyNumberArray = numberArray.clone();
            bubbleSort(copyNumberArray);
            
            txtAvg.setText(df.format(avg(copyNumberArray)));
            txtMedian.setText(df.format(median(copyNumberArray)));
            txtDominant.setText(df.format(dominant(copyNumberArray)));
        } catch (Exception e)
        {
            System.out.println("Błąd: "+e.getMessage());
        }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new SortingApp().setVisible(true));
    }
}
