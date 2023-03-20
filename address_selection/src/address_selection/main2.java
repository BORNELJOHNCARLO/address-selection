
	package address_selection;

	import java.awt.Color;
	import java.awt.Font;
	import java.awt.Image;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;

	public class main2 extends JFrame implements ActionListener{

		JButton btnNew = new JButton();
		JButton btnCompute = new JButton();
		
		JTextField CompanyName = new JTextField();
		JTextField CompanyAddress= new JTextField();
		JTextField EmployeeDetails = new JTextField();
		JTextField Earnings = new JTextField();
		JTextField Contribution = new JTextField();
		JTextField txtID = new JTextField();
		JTextField txtName = new JTextField();
		JTextField txtDesignation = new JTextField();
		
		JTextField txtSSS = new JTextField();
		JTextField txtPhilHealth = new JTextField();
		JTextField txtPagIbig = new JTextField();
		JTextField txtTAX = new JTextField();
		JTextField txtTotalDeduction = new JTextField();
		
		JTextField txtRate = new JTextField();
		JTextField txtNumberOfDays = new JTextField();
		JTextField txtRegularOT = new JTextField();
		JTextField txtSpecialHoliday = new JTextField();
		JTextField txtLegalHoliday = new JTextField();
		

		JTextField txtNumberOfDays1 = new JTextField();
		
		JTextField txtRegularOT1 = new JTextField();
		JTextField txtSpecialHoliday1 = new JTextField();
		JTextField txtLegalHoliday1 = new JTextField();
		
		JTextField txtGrossPay = new JTextField();
		JTextField txtNetPay = new JTextField();
		
		JLabel EmployeeID = new JLabel();
		JLabel EmployeeName = new JLabel();
		
		JLabel Rate = new JLabel();
		JLabel NumberOfDays = new JLabel();
		JLabel RegularOT = new JLabel();
		JLabel SpecialHoliday = new JLabel();
		JLabel LegalHoliday = new JLabel();
		
		JLabel SSS = new JLabel();
		JLabel PhilHealth = new JLabel();
		JLabel PagIbig = new JLabel();
		JLabel TAX = new JLabel();
		
		JLabel GrossPay = new JLabel();
		JLabel NetPay = new JLabel();
		JLabel TotalDeduction = new JLabel();
		
		
		JLabel Designation = new JLabel();
		main2(){
		//company name and address	
			CompanyName.setBounds(270, 30, 400, 40);
			CompanyName.setText("               Company Name" );
			CompanyName.setEditable(true);
			CompanyName.setFont(new Font("Arial Black" , Font.BOLD, 22));
			
			
			CompanyAddress.setBounds(300, 80, 350, 40);
			CompanyAddress.setText("              Company Address" );
			CompanyAddress.setEditable(false);
			CompanyAddress.setFont(new Font("Arial Black" , Font.BOLD, 18));
			
			//employee details, earnings and contribution
			EmployeeDetails.setBounds(120, 140, 150, 30);
			EmployeeDetails.setText("  Employee Details");
			EmployeeDetails.setEditable(false);
			EmployeeDetails.setFont(new Font("Calibri" , Font.BOLD, 16));
			
			
			Earnings.setBounds(420, 140, 100, 30);
			Earnings.setText("     Earnings");
			Earnings.setEditable(false);
			Earnings.setFont(new Font("Calibri" , Font.BOLD, 16));
			
			Contribution.setBounds(680, 140, 170, 30);
			Contribution.setText("  Employee Contribution");
			Contribution.setEditable(false);
			Contribution.setFont(new Font("Calibri" , Font.BOLD,16));
			
			//txtbox for id, name, and designation
					txtID.setBounds(120,195,150,25);
					txtName.setBounds(120,225,150,25);
					txtDesignation.setBounds(120,255,150,25);
					//txt box for rate, No. of Days, Regular OT, Specail Holiday and Legal OT
					txtRate.setBounds(360,195,70,25);
					txtNumberOfDays.setBounds(400,225,70,25);
					txtRegularOT.setBounds(400,255,70,25);
					txtSpecialHoliday.setBounds(400,285,70,25);
					txtLegalHoliday.setBounds(400,315,70,25);
					
					txtNumberOfDays1.setBounds(475,225,70,25);
					txtNumberOfDays1.setEditable(false);
					txtRegularOT1.setBounds(475,255,70,25);
					txtRegularOT1.setEditable(false);
					txtSpecialHoliday1.setBounds(475,285,70,25);
					txtSpecialHoliday1.setEditable(false);
					txtLegalHoliday1.setBounds(475,315,70,25);
					txtLegalHoliday1.setEditable(false);
					
					//textbox for SSS, Phil_Health, Pag-Ibig and TAX
					txtSSS.setBounds(680,190,70,25);
					txtPhilHealth.setBounds(680,220,70,25);
					txtPagIbig.setBounds(680,250,70,25);
					txtTAX.setBounds(680,280,70,25);
					
					
					//textbox for GrossPay, NetPay and Total Deduction
					txtGrossPay.setBounds(385,385,80,25);
					txtNetPay.setBounds(630,385,80,25);
					txtTotalDeduction.setBounds(690,325,80,25);

			
			//Label for ID,Name and Designation
			EmployeeID.setBounds(20,190,100,30);
			EmployeeID.setText("Employee ID: ");
			
			EmployeeName.setBounds(20,220,100,30);
			EmployeeName.setText("Employee name: ");
			
			Designation.setBounds(20,250,100,30);
			Designation.setText("Designation: ");
			
					//label for rate,No. of Days, Regular OT, Specail Holiday and Legal OT
					Rate.setBounds(320,190,100,30);
					Rate.setText("Rate: ");
					
					NumberOfDays.setBounds(320,220,100,30);
					NumberOfDays.setText("No. of Days: ");
					
					RegularOT.setBounds(320,250,100,30);
					RegularOT.setText("Regular OT: ");
					
					SpecialHoliday.setBounds(280,280,120,30);
					SpecialHoliday.setText("Special Holiday(hrs):");
					
					LegalHoliday.setBounds(279,310,120,30);
					LegalHoliday.setText("Regular Holiday(hrs):");
					
			//label for SSS, Phil_Health, Pag-Ibig and TAX
				SSS.setBounds(600,190,100,30);
				SSS.setText("SSS: ");
				
				PhilHealth.setBounds(600,220,100,30);
				PhilHealth.setText("Phil Health: ");
				
				PagIbig.setBounds(600,250,100,30);
				PagIbig.setText("Pag Ibig: ");
				
				TAX.setBounds(600,280,100,30);
				TAX.setText("TAX: ");
				
				// label for GrossPay and NextPay
				GrossPay.setBounds(320,380,70,30);
				GrossPay.setText("GrossPay: ");
				
				NetPay.setBounds(580,380,70,30);
				NetPay.setText("NetPay: ");
				
				TotalDeduction.setBounds(590,320,100,30);
				TotalDeduction.setText("Total Deduction: ");
			
			//Button for New and Compute
			btnNew.setBounds(250, 500, 100, 50);
			btnNew.setText("New");
			btnNew.setBackground(Color.GREEN);
			btnNew.setFont(new Font("Arial Black", Font.BOLD,12));
			btnNew.addActionListener(this);
			btnNew.setFocusable(false);
			
			
			btnCompute.setBounds(550,500,100,50);
			btnCompute.setText("Compute");
			btnCompute.addActionListener(this);
			btnCompute.setFocusable(false);
			btnCompute.setBackground(Color.LIGHT_GRAY);
			btnCompute.setFont(new Font("Arial Black", Font.BOLD,12));
			//btnCompute.setForeground(Color.BLACK);
			
			
			
			
			
			this.setSize(1000, 700);
			this.setContentPane(new JLabel(new ImageIcon(new ImageIcon("earth.jpg").getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH))));
			this.setVisible(true);
			this.setResizable(false);
			this.setDefaultCloseOperation(main2.EXIT_ON_CLOSE);
			
			//this.getContentPane().setBackground(Color.gray);
			
			this.setLayout(null);
			
			this.add(CompanyName); 
			this.add(CompanyAddress);
			
			this.add(EmployeeDetails);
			this.add(Earnings);
			this.add(Contribution);
			
			this.add(EmployeeID);
			this.add(EmployeeName);
			this.add(Designation);
			
			this.add(SSS);
			this.add(PhilHealth);
			this.add(PagIbig);
			this.add(TAX);
			
			this.add(GrossPay);
			this.add(NetPay);
			this.add(TotalDeduction);
			
			this.add(txtID);
			this.add(txtName);
			this.add(txtDesignation);
			
			this.add(txtRate);
			this.add(txtNumberOfDays);
			this.add(txtRegularOT);
			this.add(txtSpecialHoliday);
			this.add(txtLegalHoliday);
			
			
			this.add(txtNumberOfDays1);
			this.add(txtRegularOT1);
			this.add(txtSpecialHoliday1);
			this.add(txtLegalHoliday1);
			
			this.add(txtSSS);
			this.add(txtPhilHealth);
			this.add(txtPagIbig);
			this.add(txtTAX);
			
			this.add(txtGrossPay);
			this.add(txtNetPay);
			this.add(txtTotalDeduction);
			
			this.add(Rate);
			this.add(NumberOfDays);
			this.add(RegularOT);
			this.add(SpecialHoliday);
			this.add(LegalHoliday);
			
			this.add(btnNew);
			this.add(btnCompute);
			
			
			
		

		
					
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()== btnCompute) {
			
				double txtdays, txtregot,  txtspec, txtleg,rate;
				double sss, phil, pagibig,tax,netpay,grosspay,deduc;
				double txtdays1, txtregot1, txtspec1, txtleg1;
				
				txtdays1 = Double.parseDouble(txtNumberOfDays.getText());
				txtregot1 = Double.parseDouble(txtRegularOT.getText());
				txtspec1 = Double.parseDouble(txtSpecialHoliday.getText());
				txtleg1 = Double.parseDouble(txtLegalHoliday.getText());
				rate = Double.parseDouble(txtRate.getText());
				
				
				txtdays = rate * txtdays1;
				txtregot = txtregot1 * (rate * .15);
				txtspec = ((txtspec1 / 8) * 1.5) * rate;
				txtleg = ((txtleg1 / 8)* 2 )* rate;
				
				grosspay = txtdays + txtregot + txtspec + txtleg1;
				
				sss = grosspay * .05;
				pagibig = grosspay * .02;
				phil = grosspay * .04;
				tax = grosspay * .08;
				deduc = sss + phil + pagibig + tax;
				netpay = grosspay - deduc;
			
				txtNumberOfDays1.setText(String.valueOf(String.format("%.2f", txtdays)));
				txtRegularOT1.setText(String.valueOf(String.format("%.2f", txtregot)));
				txtSpecialHoliday1.setText(String.valueOf(String.format("%.2f", txtspec)));
				txtLegalHoliday1.setText(String.valueOf(String.format("%.2f", txtleg)));
				txtGrossPay.setText(String.valueOf(String.format("%.2f", grosspay)));
				txtSSS.setText(String.valueOf(String.format("%.2f", sss)));
				txtPagIbig.setText(String.valueOf(String.format("%.2f", pagibig)));
				txtPhilHealth.setText(String.valueOf(String.format("%.2f", phil)));
				txtTAX.setText(String.valueOf(String.format("%.2f", tax)));
				txtTotalDeduction.setText(String.valueOf(String.format("%.2f", deduc)));
				txtNetPay.setText(String.valueOf(String.format("%.2f", netpay)));
			}
			else if (e.getSource()== btnNew) {	
				txtID.setText("");
				txtName.setText("");
				txtDesignation.setText("");
				txtRate.setText("");
				txtNumberOfDays.setText("");
				txtNumberOfDays1.setText("");
				txtRegularOT1.setText("");
				txtRegularOT.setText("");
				txtSpecialHoliday.setText("");
				txtSpecialHoliday1.setText("");
				txtLegalHoliday.setText("");
				txtLegalHoliday1.setText("");
				txtGrossPay.setText("");
				txtSSS.setText("");
				txtPagIbig.setText("");
				txtPhilHealth.setText("");
				txtTAX.setText("");
				txtTotalDeduction.setText("");
				txtNetPay.setText("");
				
		}
		

	}

}
