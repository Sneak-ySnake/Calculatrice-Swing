import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.xml.bind.Marshaller.Listener;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Fenetre2 extends JFrame {

	double valeur1;
	double valeur2;
	double valeurTotale;
	String signe;
	
	public Fenetre2() {
		super("TO-82");
		Bouton boutons = new Bouton();
		Ecran ecrans = new Ecran();
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(350, 600);
		setLayout(new GridLayout(0, 1));

		JPanel panelHaut = new JPanel();
		panelHaut.setLayout(new FlowLayout());
		panelHaut.setBackground(Color.DARK_GRAY);

		JPanel panelBas = new JPanel();
		panelBas.setLayout(new GridLayout(6, 2));
		panelBas.setBackground(Color.DARK_GRAY);

		add(panelHaut);
		add(panelBas);
		
		panelHaut.add(ecrans.ecranResultat);
		panelHaut.add(ecrans.ecran);
	
		panelBas.add(boutons.boutonLog);
		panelBas.add(boutons.boutonExp);
		panelBas.add(boutons.boutontest2);
		panelBas.add(boutons.boutontest3);
		
		panelBas.add(boutons.bouton1);
		panelBas.add(boutons.bouton2);
		panelBas.add(boutons.bouton3);
		panelBas.add(boutons.boutonPlus);
		panelBas.add(boutons.bouton4);
		panelBas.add(boutons.bouton5);
		panelBas.add(boutons.bouton6);
		panelBas.add(boutons.boutonMoins);
		panelBas.add(boutons.bouton7);
		panelBas.add(boutons.bouton8);
		panelBas.add(boutons.bouton9);
		panelBas.add(boutons.boutonDiv);
		panelBas.add(boutons.bouton0);
		panelBas.add(boutons.boutonVide);
		panelBas.add(boutons.boutonCarre);
		panelBas.add(boutons.boutonX);
		panelBas.add(boutons.boutonEgale);
		panelBas.add(boutons.boutonVirg);
		panelBas.add(boutons.boutonRacine);
		panelBas.add(boutons.boutonC);

		
		
		
		boutons.bouton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("1");

			}
		});
		boutons.bouton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("2");
			}
		});
		boutons.bouton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("3");
			}
		});
		boutons.bouton4.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("4");
				
			}
		});
		boutons.bouton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("5");
			}
		});
		boutons.bouton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("6");
			}
		});
		boutons.bouton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("7");
			}
		});
		boutons.bouton8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("8");
			}
		});
		boutons.bouton9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("9");
			}
		});
		boutons.bouton0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecranResultat.setText("");
				ecrans.ecran.append("0");
			}
		});
		boutons.boutonMoins.addActionListener(new ActionListener() {

			@Override
		
			public void actionPerformed(ActionEvent e) {
				
				if (ecrans.ecran.getText().equals("")) {
					ecrans.ecran.append("-");
				}
				else {
				valeur1 = Double.parseDouble(ecrans.ecran.getText());
				signe = "-";
				ecrans.ecran.setText("");
				}
				
			}
		});
		boutons.boutonPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				valeur1 = Double.parseDouble(ecrans.ecran.getText());
				signe = "+";
				ecrans.ecran.setText("");
				
				
				
			}
		});
		boutons.boutonC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ecrans.ecranResultat.setText("");
				ecrans.ecran.setText("");
				valeur1 = 0;
				valeur2 = 0;
				valeurTotale = 0;

			}
		});
		boutons.boutonVirg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ecrans.ecran.append(".");

			}
		});
		boutons.boutonX.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				
				valeur1 = Double.parseDouble(ecrans.ecran.getText());
				signe = "x";
				ecrans.ecran.setText("");
				
				
			}
		});
		boutons.boutonDiv.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				
				valeur1 = Double.parseDouble(ecrans.ecran.getText());
				signe = "/";
				ecrans.ecran.setText("");
				
			}
		});
		boutons.boutonRacine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				valeur1 = Double.parseDouble(ecrans.ecran.getText());
				signe = "r";
				ecrans.ecran.setText("");
				
				
			}
		});
		boutons.boutonCarre.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				
				valeur1 = Double.parseDouble(ecrans.ecran.getText());
				signe = "²";
				ecrans.ecran.setText("");
				
			}
		});
		boutons.boutonLog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valeur1 = Double.parseDouble(ecrans.ecran.getText());
				signe = "log";
				ecrans.ecran.setText("log("+valeur1+")");
				
			}
		});
		boutons.boutonExp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valeur1 = Double.parseDouble(ecrans.ecran.getText());
				signe = "exp";
				ecrans.ecran.setText("exp("+valeur1+")");
				
			}
		});
		boutons.boutonVide.addActionListener(new ActionListener() {
			boolean visible = false;
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!visible) {
					boutons.boutonLog.setVisible(true);
					boutons.boutonExp.setVisible(true);
					boutons.boutontest2.setVisible(true);
					boutons.boutontest3.setVisible(true);
					visible = true;
				}
				else {
					boutons.boutonLog.setVisible(false);
					boutons.boutonExp.setVisible(false);
					boutons.boutontest2.setVisible(false);
					boutons.boutontest3.setVisible(false);
					visible = false;
				}
				
				
			}
		});
		boutons.boutonEgale.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				
				if (signe.equals("+")) {
					valeur2 = Double.parseDouble(ecrans.ecran.getText());
					valeurTotale = valeur1 + valeur2;
				}
				else if (signe.equals("-")) {
					valeur2 = Double.parseDouble(ecrans.ecran.getText());
					valeurTotale = valeur1 - valeur2;
				}
				else if (signe.equals("x")) {
					valeur2 = Double.parseDouble(ecrans.ecran.getText());
					valeurTotale = valeur1 * valeur2;
				}
				else if (signe.equals("/")) {
					valeur2 = Double.parseDouble(ecrans.ecran.getText());
					valeurTotale = valeur1 / valeur2;
				}
				else if (signe.equals("r")) {
					valeurTotale = Math.sqrt(valeur1);
				}
				else if (signe.equals("²")) {
					valeurTotale = Math.pow(valeur1, 2);
				}
				else if (signe.equals("log")) {
					valeurTotale = Math.log(valeur1);
				}
				else if (signe.equals("exp")) {
					valeurTotale = Math.exp(valeur1);
				}
				ecrans.ecranResultat.setText(valeurTotale+"");
				ecrans.ecran.setText(valeurTotale+"");
				signe = "";
				} catch (NumberFormatException ex) {
					ecrans.ecranResultat.setText("Erreur");
				}
			}
		});
		
		
		setVisible(true);
	}
}
