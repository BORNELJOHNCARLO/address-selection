package address_selection;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main_frame extends JFrame implements ActionListener{
	
	
		JComboBox <String>region = new JComboBox<String>();
		JComboBox <String>province = new JComboBox<String>();
		JComboBox <String>municipalities= new JComboBox<String>();
		JComboBox <String>brgy = new JComboBox<String>();
		
		JLabel b1 = new JLabel("SELECT REGION");
		JLabel b2 = new JLabel("SELECT PROVINCE");
		JLabel b3 = new JLabel("SELECT CITY/MUNICIPALITY");
		JLabel b4 = new JLabel("SELECT BARANGAY");



	main_frame(){
		
		this.setTitle("ADDRESS-SELECTION");
		this.setSize(350,450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.orange);
	
		
		region.setBounds(40, 50, 260, 40);
		region.setFocusable(false);
		
		province.setBounds(40, 130, 260, 40);
		province.setFocusable(false);
		
		municipalities.setBounds(40, 200, 260, 40);
		municipalities.setFocusable(false);
		
		brgy.setBounds(40, 270, 260, 40);
		brgy.setFocusable(false);
		
		region.addItem("==select region==");
		region.addItem("Region I");
		region.addItem("Region II");
		region.addItem("Region III");
	

	
		b1.setBounds(100, 10, 150, 50);
		b1.setFont(new Font("Arial Black",Font.BOLD, 15));
		
		b2.setBounds(80, 90, 500, 50);
		b2.setFont(new Font("Arial black",Font.BOLD,15));
		
		b3.setBounds(50, 160, 1200, 50);
		b3.setFont(new Font("Arial black",Font.BOLD,15));
		
		b4.setBounds(80, 240, 300, 40);
		b4.setFont(new Font("Arial black",Font.BOLD,15));
		

		this.add(region);
		this.add(province);
		this.add(municipalities);
		this.add(brgy);
		
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);

		this.setLayout(null);
		this.setVisible(true);
		
	region.addActionListener(new ActionListener () {
			
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(region.getSelectedItem().equals("SELECT REGION")){
		municipalities.removeAllItems();
		
	}else if(region.getSelectedItem().equals("Region I")) {
		province.removeAllItems();
		province.addItem("==Select region==");
		province.addItem("Ilocos Norte");
		province.addItem("Ilocos Sur");
		province.addItem("Pangasinan");

	}else if(region.getSelectedItem().equals("Region II")) {
		province.removeAllItems();
		province.addItem("==Select region==");
		province.addItem("Batanes");
		province.addItem("Cagayan");
		province.addItem("Isabela");
		province.addItem("Quirino");
		province.addItem("Nueva Vizcaya");
		
	}else if(region.getSelectedItem().equals("Region III")) {
		province.removeAllItems();
		province.addItem("==Select region==");
		province.addItem("Aurora");
		province.addItem("Bataan");
		province.addItem("Bulacan");
		province.addItem("Nueva Ecija");
		province.addItem("Pampanga");
	}
	}
		});
		
	province.addActionListener(new ActionListener() {
		
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("SELECT PROVINCE")) {
			municipalities.removeAllItems();
			
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte")) {
			municipalities.removeAllItems();
			String[] IlocosNorteCities = {"==SELECT MUNICIPALITY==","Adams","Bacarra","Badoc","Bangui","Banna","Batac","Burgos","Carasi","Currimao"
										,"Dingras","Dumalneg","Laoag","Marcos","Nueva Era","Pagudpud","Paoay","Pasuquin","Piddig","Pinili"
										,"San Nicolas","Sarrat","Solsona","Vintar"};
			for(int i=0;i<IlocosNorteCities.length;i++) {
			municipalities.addItem(IlocosNorteCities[i]);
				
			}
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur")) {
			municipalities.removeAllItems();
			String[] IlocosSurCities = {"==SELECT MUNICIPALITY==","Alilem","Banayoyo","Bantay","Burgos","Cabugao","Candon","Caoayan","Cervantes","Galimuyod","Gregorio del Pilar"
										,"Lidlidda","Magsingal","Nagbukel","Narvacan","Quirino","Salcedo","San Emilio","San Esteban","San Ildefonso","San Juan"
										,"San Vicente","Santa","Santa Catalina","Santa Cruz","Santa Lucia","Santa Maria","Santiago","Santo Domingo","Sigay","Sinait"
										,"Sugpon","Suyo","Tagudin","Vigan"};
			for(int i=0;i<IlocosSurCities.length;i++) {
			municipalities.addItem(IlocosSurCities[i]);
				
			}
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan")) {
			municipalities.removeAllItems();
			String[] PangasinanCities = {"==SELECT MUNICIPALITY==","Agno", "Aguilar","Alaminos", "Alcala", "Anda", "Asingan", "Balungao", "Bani", "Basista", "Bautista", "Bayambang", "Binalonan", "Binmaley", "Bolinao"
					, "Bugallon", "Burgos", "Calasiao", "Dasol", "Infanta", "Labrador", "Laoac", "Lingayen"};
			for(int i=0;i<PangasinanCities.length;i++) {
			municipalities.addItem(PangasinanCities[i]);
				
			}
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Batanes")) {
				municipalities.removeAllItems();
				String[] BatanesCities = {"==SELECT MUNICIPALITY==","Basco","Itbayat","Ivana","Mahatao","Sabtang","	Uyugan"};
				for(int i=0;i<BatanesCities.length;i++) {
				municipalities.addItem(BatanesCities[i]);
					
				}
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan")) {
				municipalities.removeAllItems();
				String[] CagayanCities = {"==SELECT MUNICIPALITY==","Abulug","Alcala","Allacapan","Amulung","Aparri","Baggao","Ballesteros","Buguey"};
				for(int i=0;i<CagayanCities.length;i++) {
				municipalities.addItem(CagayanCities[i]);
						
			}	
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela")) {
			municipalities.removeAllItems();
			String[] BatanesCities = {"==SELECT MUNICIPALITY==","Alicia","Angadanan","Aurora","Benito Soliven","Burgos","Cabagan","Cabatuan","Cauayan"};
			for(int i=0;i<BatanesCities.length;i++) {
			municipalities.addItem(BatanesCities[i]);
					
		}
			}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya")) {
				municipalities.removeAllItems();
				String[] NuevaVizcayaCities = {"==SELECT MUNICIPALITY==","Alfonso Castañeda","Ambaguio","Aritao","Bagabag","Bambang","Bayombong","Diadi","Dupax del Norte"};
				for(int i=0;i<NuevaVizcayaCities.length;i++) {
				municipalities.addItem(NuevaVizcayaCities[i]);
						
			}
			}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora")) {
					municipalities.removeAllItems();
					String[] AuroraCities = {"==SELECT MUNICIPALITY==","Baler","Casiguran","Dilasag","Dinalungan","Dingalan","Dipaculao","Maria Aurora","San Luis"};
					for(int i=0;i<AuroraCities.length;i++) {
					municipalities.addItem(AuroraCities[i]);
							
				}
					}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan")) {
						municipalities.removeAllItems();
						String[] BulacanCities ={"Angat", "Balagtas", "Baliuag", "Bocaue", "Bulakan", "Bustos", "Calumpit", "Doña Remedios Trinidad"};
						for(int i=0;i<BulacanCities.length;i++) {
						municipalities.addItem(BulacanCities[i]);
								
					}
						}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija")) {
							municipalities.removeAllItems();
							String[] NuevaEcijaCities = {"Aliaga", "Bongabon", "Cabanatuan", "Cabiao", "Carranglan", "Cuyapo", "Gabaldon", "Gapan"};
							for(int i=0;i<NuevaEcijaCities.length;i++) {
							municipalities.addItem(NuevaEcijaCities[i]);
									
						}
							}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga")) {
								municipalities.removeAllItems();
								String[] PampangaCities = {"Apalit", "Arayat", "Bacolor", "Candaba", "Floridablanca", "Guagua", "Lubao", "Mabalacat"};
								for(int i=0;i<PampangaCities.length;i++) {
								municipalities.addItem(PampangaCities[i]);
										
							}
								}
	}
		
	});
	municipalities.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub				
		

		if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Adams")) {
			brgy.removeAllItems();
				String[] adamsCity = {"==SELECT BRGY==","Adams"};
			for(int x=0; x<adamsCity.length;x++) {
			brgy.addItem(adamsCity[x]);
				}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Bacarra")) {
			brgy.removeAllItems();
				String[] bacarraCity = {"Bani","Buyon","Cabaruan","Cabulalaan","Cabusligan","Cadaratan","Calioet-Libong","Casilian","Corocor","Duripes","Ganagan","Libtong","Macupit"
										,"Nambaran","Natba","Paninaan","Pasiocan","Pasngal","Pipias","Pulangi","Pungto","San Agustin I","San Agustin II","San Andres I","San Andres II","San Gabriel I"
										,"San Gabriel II","San Pedro I","San Pedro","San Roque I","San Roque II","San Simon I","San Simon II","San Vicente","Sangil","Santa Filomena I","Santa Filomena II"
										,"Santa Rita","Santo Crito I","Santo Crito II","Tambidao","Teppang","Tuburan"};
			for(int b=0; b<bacarraCity.length;b++) {
			brgy.addItem(bacarraCity[b]);
					}	
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Badoc")) {
			brgy.removeAllItems();
				String[] BadocCity = {"Alay-Nangbabaan","Alogoog","Ar-arusip","Aring","Balbaldez","Bato","Camanga","Canaan","Caraitan","Gabut Norte","Gabut Sur","Garreta","La Virgen Milagrosa"
									,"Labut","Lacuben","Lubigan","Mabusag Norte","Mabusag Sur","Madupayas","Morong","Nagrebcan","Napu","Pagsanahan Norte","Pagsanahan Sur","Paltit","Parang"
									,"Pasuc","Santa Cruz Norte","Santa Cruz Sur","Saud","Turod"};
			for(int a=0; a<BadocCity.length;a++) {
			brgy.addItem(BadocCity[a]);
				}	
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Bangui")) {
			brgy.removeAllItems();
				String[] BanguiCity = {"Abaca","Bacsil","Banban","Baruyen","Dadaor","Lanao","Malasin","Manayon","Masiklil","Nagbalagan","Payac","San Lorenzo","Taguiporo"
									,"Utol"};
			for(int a=0; a<BanguiCity.length;a++) {
			brgy.addItem(BanguiCity[a]);
				}	
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Banna")) {
		brgy.removeAllItems();
		String[] BannaCity = {"Balioeg","Bangsar","Barbarangay","Binacag","Bomitog","Bugasi","Caetebanan","Caridquib","Catagtaguen","Crispina","Hilario","Imelda","Lorenzo"
							,"Macayepyep","Marcos","Nagpatayan","Sinamar","Tabtabagan","Valdez","Valeciano"};
			for(int a=0; a<BannaCity.length;a++) {
			brgy.addItem(BannaCity[a]);
		}	
					
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Batac")) {
			brgy.removeAllItems();
			String[] BatacCity = {"Ablan Poblacion","Acosta Poblacion","Aglipay","Baay","Baligat","Baoa East","Baoa West","Barani","Ben-agan","Bil-loca","Biningan","Bungon","Callaguip"
							,"Camandingan","Cangrunaan","Capacuan","Caunayan","Caunayan","Dariwdiw","Lacub","Mabaleng","Magnuang","Maipalig","Nagbacalan","Naguirangan","Palongpong"
							,"Palpalicong","Parangopong","Payao","Quiling Norte","Quiling Sur","Quiom","Rayuray","Ricarte Poblacion","San Julian","San Mateo","San Pedro","Suabit"
							,"Sumader","Tabug","Valdez Poblacion"};
			for(int a=0; a<BatacCity.length;a++) {
			brgy.addItem(BatacCity[a]);
		}	
	
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Burgos")) {
			brgy.removeAllItems();
			String[] BurgosCity = {"Ablan Sarat","Agaga","Bayog","Bobon","Buduan","Nagsurot","Paayas","Pagali","Poblacion","Saoit","Tanap"};
			for(int a=0; a<BurgosCity.length;a++) {
			brgy.addItem(BurgosCity[a]);}	
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Carasi")) {
			brgy.removeAllItems();
			String[] CarasiCity = {"Angset","Barbaqueso","Virbira" 	};
			for(int a=0; a<CarasiCity.length;a++) {
			brgy.addItem(CarasiCity[a]);}
			
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Currimao")) {
			brgy.removeAllItems();
			String[] CurrimaoCity = {"Anggapang Sur","Bimmanga","Cabuusan","Comcomloong","Gaang","Lang-ayan-Baramban","Lioes","Maglaoi Centro","Maglaoi Norte"
					,"Maglaoi Sur","Paguludan-Salindeg","Pangil","Pias Norte","Pias Sur","Poblacion I","Poblacion II","Salugan","San Simeon","Santa Cruz"
					,"Tapao-Tigue","Torre","Victoria",};
			for(int a=0; a<CurrimaoCity.length;a++) {
			brgy.addItem(CurrimaoCity[a]);}
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Dingras")) {
			brgy.removeAllItems();
			String[] DingrasCity = {"Albano","Bacsil","Bagut","Baresbes","Barong","Bungcag","Bungcag","Cali","Capasan","Dancel","Elizabeth"};
			for(int a=0; a<DingrasCity.length;a++) {
			brgy.addItem(DingrasCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Dumalneg")) {
			brgy.removeAllItems();
			String[] DumalnegCity = {"Cabaritan","Kalaw","Quibel","San Isidro"};
			for(int a=0; a<DumalnegCity.length;a++) {
			brgy.addItem(DumalnegCity[a]);}
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Laoag")) {
			brgy.removeAllItems();
			String[] LaoagCity = {"Barangay No. 1, San Lorenzo","Barangay No. 10, San Jose","Barangay No. 11, Santa Balbina	","Barangay No. 12, San Isidro"
							,"Barangay No. 13, Nuestra Señora de Visitacion","Barangay No. 14, Santo Tomas","Barangay No. 15, San Guillermo","Barangay No. 16, San Jacinto"
							,"Barangay No. 17, San Francisco","Barangay No. 18, San Quirino","Barangay No. 19, Santa Marcela","Barangay No. 2, Santa Joaquina","Barangay No. 20, San Miguel"
							,"Barangay No. 21, San Pedro","Barangay No. 22, San Andres","Barangay No. 23, San Matias","Barangay No. 24, Nuestra Señora de Consolacion","Barangay No. 25, Santa Cayetana"
							,"Barangay No. 26, San Marcelino","Barangay No. 27, Nuestra Señora de Soledad","Barangay No. 28, San Bernardo","Barangay No. 29, Santo Tomas","Barangay No. 3, Nuestra Señora del Rosario"
							,"Barangay No. 30-A, Suyo","Barangay No. 30-B, Santa Maria","Barangay No. 31, Talingaan","Barangay No. 32-A, La Paz East","Barangay No. 32-B, La Paz West"
							,"Barangay No. 32-C La Paz East","Barangay No. 33-A, La Paz Proper","Barangay No. 33-B, La Paz Proper","Barangay No. 34-A, Gabu Norte West","Barangay No. 34-B, Gabu Norte East"
							,"Barangay No. 35, Gabu Sur","Barangay No. 36, Araniw","Barangay No. 37, Calayab","Barangay No. 38-A, Mangato East","Barangay No. 38-B, Mangato East"
							,"Barangay No. 39, Santa Rosa","Barangay No. 4, San Guillermo","Barangay No. 40, Balatong","Barangay No. 41, Balacad","Barangay No. 42, Apaya"
							,"Barangay No. 43, Cavit","Barangay No. 44, Zamboanga","Barangay No. 45, Tangid","Barangay No. 46, Nalbo","Barangay No. 47, Bengcag"
							,"Barangay No. 48-A, Cabungaan North","Barangay No. 48-B, Cabungaan South","Barangay No. 49-A, Darayday","Barangay No. 49-B, Raraburan","Barangay No. 5, San Pedro"
							,"Barangay No. 50, Buttong","Barangay No. 51-A, Nangalisan East","Barangay No. 51-B, Nangalisan West","Barangay No. 52-A, San Mateo","Barangay No. 52-B, Lataag","Barangay No. 53, Rioeng","Barangay No. 54-A, Lagui-Sail"
							,"Barangay No. 54-B, Camangaan","Barangay No. 55-A, Barit-Pandan","Barangay No. 55-B, Salet-Bulangon","Barangay No. 55-C, Vira","Barangay No. 56-A, Bacsil North","Barangay No. 56-B, Bacsil South","Barangay No. 57, Pila"
							,"Barangay No. 58, Casili","Barangay No. 59-A, Dibua South","Barangay No. 59-A, Dibua Nouth","Barangay No. 6, San Agustin","Barangay No. 60-A, Caaoacan","Barangay No. 60-B, Madiladig","Barangay No. 61, Cataban"
							,"Barangay No. 62-A, Navotas North","Barangay No. 62-B, Navotas South","Barangay No. 7-A, Nuestra Señora de Natividad","Barangay No. 7-B, Nuestra Señora de Natividad","Barangay No. 8, San Vicente","Barangay No. 9, Santa Angela"};
			for(int a=0; a<LaoagCity.length;a++) {
			brgy.addItem(LaoagCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Marcos")) {
			brgy.removeAllItems();
			String[] MarcosCity = {"Cacafean","Daquioag","Elizabeth	","Escoda","Ferdinand","Fortuna","Imelda","Lydia","Mabuti","Pacifico","Santiago","Tabucbuc","Valdez"};
			for(int a=0; a<MarcosCity.length;a++) {
			brgy.addItem(MarcosCity[a]);}
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("NuevaEra")) {
			brgy.removeAllItems();
			String[] NuevaEraCity = {"Acnam","Barangobong","Barikir","Bugayong","Cabittauran","Caray","Garnaden","Naguillan","Poblacion","Santo Nino","Uguis"};
			for(int a=0; a<NuevaEraCity.length;a++) {
			brgy.addItem(NuevaEraCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Pagudpud")) {
			brgy.removeAllItems();
			String[] PagudpudCity = {"Aggasi","Baduang","Balaoi","Burayoc","Caparispisan","Caunayan","Dampig","Ligaya","Pancian","Pasaleng","Poblacion 1","Poblacion 2","Saguigui"
									,"Saud","Subec","Tarrag"};
			for(int a=0; a<PagudpudCity.length;a++) {
			brgy.addItem(PagudpudCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Paoay")) {
			brgy.removeAllItems();
			String[] PaoayCity = {"Bacsil","Cabagoan","Cabangaran","Callaguip","Cayubog","Dolores","Laoa","Masintoc","Monte","Mumulaan","Nagbacalan","Nalasin","Nanguyudan","Oaig-Upay-Abulao"
								,"Pambaran","Pannaratan","Paratong","Pasil","Salbang","San Agustin","San Blas","San Juan","San Pedro","San Roque","Sangladan Poblacion","Santa Rita","Sideg","Suba"
								,"Sungadan","Surgui","Veronica"};
			for(int a=0; a<PaoayCity.length;a++) {
			brgy.addItem(PaoayCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Pasuquin")) {
			brgy.removeAllItems();
			String[] PasuquinCity ={"Batuli","Binsang","Carusikis","Carusipan","Dadaeman","Darupidip","Davila","Dilavo","Estancia","Naglicuan","Nalvo","Ngabangab","Pangil","Poblacion 1","Poblacion 2"
									,"Poblacion 3","Poblacion 4","Pragata","Puyupuyan","Salpad","San Juan","Santa Catalina","Santa Matilde","Sapat","Sulbec","Sulongan","Surong","Susugaen","Tabungao","Tadao"};
			for(int a=0; a<PasuquinCity.length;a++) {
			brgy.addItem(PasuquinCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Piddig")) {
			brgy.removeAllItems();
			String[] PiddigCity = {"Ab-abut","Abucay","Anao","Arua-ay","Bimmanga","Boyboy","Cabaroan","Calambeg","Callusa","Dupitac","Estancia","Gayamat","Lagandit","Libnaoan","Loing"
					 				,"Maab-abaca","Mangitayag","Maruaya","San Antonio","Santa Maria","Sucsuquen","Tangaoan","Tonoton"};
			for(int a=0; a<PiddigCity.length;a++) {
			brgy.addItem(PiddigCity[a]);}
				
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Pinili")) {
			brgy.removeAllItems();
			String[] PiniliCity = {"Aglipay","Apatut-Lubong","Badio","Barbar","Buanga","Bulbulala","Bungro","Cabaroan","Capangdanan","Dalayap","Darat","Gulpeng","Liliputen","Lumbaan-Bicbica"
									,"Nagtrigoan","Pagdilao","Pugaoan","Puritac","Puzol","Sacritan","Salanap","Santo Tomas","Tartarabang","Upon","Valbuena"};
			for(int a=0; a<PiniliCity.length;a++) {
			brgy.addItem(PiniliCity[a]);}
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("SanNicolas")) {
			brgy.removeAllItems();
			String[] SanNicolasCity = {"San Agustin","San Baltazar","San Bartolome","San Cayetano","San Eugenio","San Fernando","San Francisco","San Gregorio","San Guillermo","San Ildefonso","San Jose"
										,"San Juan Bautista","San Lorenzo","San Lucas","San Marcos","San Miguel","San Pablo","San Paulo","San Pedro","San Rufino","San Silvestre","Santa Asuncion"
										,"Santa Cecilia","Santa Monica"};
			for(int a=0; a<SanNicolasCity.length;a++) {
			brgy.addItem(SanNicolasCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Sarrat")) {
			brgy.removeAllItems();
			String[] SarratCity = {"San Agustin","San Andres","San Antonio","San Bernabe","San Cristobal","San Felipe","San Francisco","San Isidro","San Joaquin","San Jose","San Juan","San Leandro","San Lorenzo"
									,"San Manuel","San Marcos","San Nicolas","San Pedro","San Roque","San Pedro","San Roque","San Roque","San Vicente","Santa Barbara","Santa Magdalena","Santa Rosa","Santo Santiago","Santo Tomas"};
			for(int a=0; a<SarratCity.length;a++) {
			brgy.addItem(SarratCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Solsona")) {
			brgy.removeAllItems();
			String[] SolsonaCity = {"Aguitap","Bagbag","Bagbago","Barcelona","Bubuos","Capurictan","Catangraran","Darasdas","Juan","Laureta","Lipay"
									,"Maananteng","Manalpac","Mariquet","Nagpatpatan","Nalasin","Puttao","San Juan","San Julian","Santa Ana","Santiago","Talugtog"};
			for(int a=0; a<SolsonaCity.length;a++) {
			brgy.addItem(SolsonaCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Norte") && municipalities.getSelectedItem().equals("Vintar")) {
			brgy.removeAllItems();
			String[] VintarCity = {"Abkir","Alejo Malasig","Alsem","Bago","Bulbulala","Cabangaran","Cabayo","Cabisocolan","Canaam","Columbia","Dagupan","Dipilat","Esperanza","Ester","Isic Isic"
									,"Lubnac","Mabanbanag","Malampa","Manarang","Margaay","Namoroc","Parparoroc","Parut","Pedro F. Alviar","Salsalamagui","San Jose","San Nicolas" ,"San Pedro","San Ramon"
									,"San Roque","Santa Maria","Tamdagan","Visaya"};
			for(int a=0; a<VintarCity.length;a++) {
			brgy.addItem(VintarCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Alilem")) {
			brgy.removeAllItems();
			String[] AlilemCity = {"==SELECT BRGY==","Alilem Daya","Amilongan","Anaao","Apang","Apaya","Batbato","Apaya","Daddaay","Dalawa","Kiat"};
			for(int a=0; a<AlilemCity.length;a++) {
			brgy.addItem(AlilemCity[a]);}
			
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Banayoyo")) {
			brgy.removeAllItems();
			String[] BanayoyoCity = {"==SELECT BRGY==","Bagbagotot","Banbanaal","Bisangol","Cadanglaan","Casilagan Norte","Casilagan Sur","Elefante","Guardia","Lintic","Lopez"
									,"Montero","Naguimba","Pila","Poblacion"};
			for(int a=0; a<BanayoyoCity.length;a++) {
			brgy.addItem(BanayoyoCity[a]);}
			
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Bantay")) {
			brgy.removeAllItems();
			String[] BantayCity = {"==SELECT BRGY==","Aggay","An-annam","Balaleng","Banaoang","Barangay 1","Barangay 2","Barangay 3","Barangay 4","Barangay 5","Barangay 6","Bulag","Buquig","Cabalanggan"
					,"Cabaroan","Cabusligan","Capangdanan","Guimod","Lingsat","Malingeb","Mira","Naguiddayan","Ora","Paing","Puspus","Quimmarayan","Sagneb","Sagpat","San Isidro","San Julian","San Mariano","Sinabaan"
					,"Taguiporo","Taleb","Tay-ac"};
			for(int a=0; a<BantayCity.length;a++) {
			brgy.addItem(BantayCity[a]);}
			
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Burgos")) {
			brgy.removeAllItems();
			String[] BurgosCity= {"Ambugat", "Balugang", "Bangbangar", "Bessang", "Cabcaburao", "Cadacad", "Callitong", "Dayanki", "Lesseb", "Lubing", "Lucaban", "Luna", "Macaoayan", "Mambug"
					, "Manaboc", "Mapanit", "Poblacion Sur (Masingit)", "Nagpanaoan", "Dirdirig (Dirdirig-Padayao)", "Paduros", "Patac", "Poblacion Norte (Bato)", "Sabangan Pinggan", "Subadi Norte", "Subadi Sur", "Taliao"};
			for(int a=0; a<BurgosCity.length;a++) {
			brgy.addItem(BurgosCity[a]);}
			
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Cabugao")) {
			brgy.removeAllItems();
			String[] CabugaoCity = {"Alinaay", "Aragan", "Arnap", "Baclig (Poblacion)", "Bato", "Bonifacio (Poblacion)", "Bungro", "Cacadiran", "Caellayan", "Carusipan", "Catucdaan"
					, "Cuancabal", "Cuantacla", "Daclapan", "Dardarat", "Lipit", "Maradodon", "Margaay", "Nagsantaan", "Nagsincaoan", "Namruangan", "Pila", "Pug-os", "Quezon (Poblacion)"
					, "Reppaac", "Rizal (Poblacion)", "Sabang", "Sagayaden", "Salapasap", "Salomague", "Sisim", "Turod", "Turod-Patac"};

			for(int a=0; a<CabugaoCity.length;a++) {
			brgy.addItem(CabugaoCity[a]);}
			
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Candon")) {
			brgy.removeAllItems();
			String[] CandonCity = {"Allangigan 1st", "Allangigan 2nd", "Amguid", "Ayudante", "Bagani Campo", "Bagani Gabor", "Bagani Tocgo", "Bagani Ubbog", "Bagar", "Balingaoan"
					, "Bugnay", "Calaoa-an", "Calongbuyan", "Caterman", "Cubcubbuot", "Darapidap", "Langlangca 1st", "Langlangca 2nd", "Oaig Daya", "Palacapac", "Paras", "Parioc 1st"
					, "Parioc 2nd", "Patpata 1st", "Patpata 2nd", "Paypayad", "Salvador 1st", "Salvador 2nd", "San Agustin", "San Andres", "San Antonio (Poblacion)", "San Isidro (Poblacion)"
					, "San Jose (Poblacion)", "San Juan (Poblacion)", "San Nicolas", "San Pedro", "Santo Tomas", "Tablac", "Talogtog", "Tamurong 1st", "Tamurong 2nd", "Villarica"};
			for(int a=0; a<CandonCity.length;a++) {
			brgy.addItem(CandonCity[a]);}
			
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Caoayan")) {
			brgy.removeAllItems();
			String[] CaoayanCity = {"Anonang Mayor", "Anonang Menor", "Baggoc", "Callaguip", "Caparacadan", "Fuerte", "Manangat", "Naguilian", "Nansuagao", "Pandan", "Pantay-Quitiquit"
							, "Don Dimas Querubin (Poblacion)", "Puro", "Pantay-Tamurong", "Villamar", "Don Alejandro Quirolgico (Poblacion)", "Don Lorenzo Querubin (Poblacion)"};
			for(int a=0; a<CaoayanCity.length;a++) {
			brgy.addItem(CaoayanCity[a]);}
			
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Cervantes")) {
			brgy.removeAllItems();
			String[] CervantesCity= {"Aluling", "Comillas North", "Comillas South", "Concepcion", "Dinwede East", "Dinwede West", "Libang", "Pilipil", "Remedios", "Rosario", "San Juan", "San Luis", "Malaya"};
			for(int a=0; a<CervantesCity.length;a++) {
			brgy.addItem(CervantesCity[a]);}
			
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Galimuyod")) {
			brgy.removeAllItems();
			String[] GalimuyodCity = {"Abaya", "Baracbac", "Bidbiday", "Bitong", "Borobor", "Calimugtong", "Calongbuyan", "Calumbaya", "Daldagan", "Kilang", "Legaspi"
					, "Mabayag", "Matanubong", "Mckinley", "Nagsingcaoan", "Oaig-Daya", "Pagangpang", "Patac", "Poblacion", "Rubio", "Sabangan-Bato", "Sacaang", "San Vicente", "Sapang"};
			for(int a=0; a<GalimuyodCity.length;a++) {
			brgy.addItem(GalimuyodCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Gregorio del Pilar")) {
			brgy.removeAllItems();
			String[] GregorioDelpilarCity = {"Alfonso (Tangaoan)", "Bussot", "Concepcion", "Dapdappig (Mabatano)", "Matue-Butarag", "Poblacion Norte", "Poblacion Sur"};
			for(int a=0; a<GregorioDelpilarCity.length;a++) {
			brgy.addItem(GregorioDelpilarCity[a]);}
			
		
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Lidlidda")) {
			brgy.removeAllItems();
			String[] LidliddaCity = {"Banucal", "Bequi-Walin", "Bugui", "Calungbuyan", "Carcarabasa", "Labut", "Poblacion Norte (Namatting)", "Poblacion Sur (Surong)"
					, "San Vicente (Kamatliwan)", "Suysuyan", "Tay-ac"};
			for(int a=0; a<LidliddaCity.length;a++) {
			brgy.addItem(LidliddaCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Magsingal")) {
			brgy.removeAllItems();
			String[] MagsingalCity = {"Alangan", "Bacar", "Barbarit", "Bungro", "Cabaroan", "Cadanglaan", "Caraisan", "Dacutan", "Labut", "Maas-asin", "Macatcatud", "Namalpalan"
					, "Manzante", "Maratudo", "Miramar", "Napo", "Pagsanaan Norte", "Pagsanaan Sur", "Panay Norte", "Panay Sur", "Patong", "Puro (Puro Pinget)", "San Basilio (Poblacion)"
					, "San Clemente (Poblacion)", "San Julian (Poblacion)", "San Lucas (Poblacion)", "San Ramon (Poblacion)", "San Vicente (Poblacion)", "Santa Monica", "Sarsaracat"};

			for(int a=0; a<MagsingalCity.length;a++) {
			brgy.addItem(MagsingalCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Nagbukel")) {
			brgy.removeAllItems();
			String[] NagbukelCity = {"Balaweg", "Bandril", "Bantugo", "Cadacad", "Casilagan", "Cosocos", "Lapting", "Mapisi", "Mission", "Poblacion East", "Poblacion West", "Taleb"};
			for(int a=0; a<NagbukelCity.length;a++) {
			brgy.addItem(NagbukelCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Narvacan")) {
			brgy.removeAllItems();
			String[] NarvacanCity = {"Abuor", "Ambulogan", "Aquib", "Banglayan", "Bantay Abot", "Bulanos", "Cadacad", "Cagayungan", "Camarao", "Casilagan", "Codoog", "Dasay", "Dinalaoan"
					, "Estancia", "Lanipao", "Lungog", "Margaay", "Marozo", "Nanguneg", "Orence", "Pantoc", "Paratong", "Parparia", "Quinarayan", "Rivadavia", "San Antonio", "San Jose"
					, "San Pablo", "San Pedro", "Santa Lucia", "Sarmingan", "Sucoc", "Sulvec", "Turod"};

			for(int a=0; a<NarvacanCity.length;a++) {
			brgy.addItem(NarvacanCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Quirino")) {
			brgy.removeAllItems();
			String[] QuirinoCity = {"Banoen", "Cayus", "Lamag (formerly Tubtuba)", "Legleg (Poblacion)", "Malideg", "Namitpit", "Patiacan", "Patungcaleo (formerly Lamag)", "Suagayan"};
			for(int a=0; a<QuirinoCity.length;a++) {
			brgy.addItem(QuirinoCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Salcedo")) {
			brgy.removeAllItems();
			String[] SalcedoCity = {"Atabay", "Calangcuasan", "Balidbid", "Baluarte", "Baybayading", 
                    "Boguibog", "Bulala-Leguey", "Kaliwakiw", "Culiong", "Dinaratan", 
                    "Kinmarin", "Lucbuban", "Madarang", "Maligcong", "Pias", 
                    "Poblacion Norte", "Poblacion Sur", "San Gaspar", "San Tiburcio", 
                    "Sorioan", "Ubbog"};
			for(int a=0; a<SalcedoCity.length;a++) {
			brgy.addItem(SalcedoCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("San Emilio")) {
			brgy.removeAllItems();
			String[] SanEmilioCity = {"Cabaroan (Poblacion)", "Kalumsing", "Lancuas", "Matibuey", "Paltoc", "San Miliano", "Sibsibbu", "Tiagan"};
			for(int a=0; a<SanEmilioCity.length;a++) {
			brgy.addItem(SanEmilioCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("San Esteban")) {
			brgy.removeAllItems();
			String[]SanEstebanCity = {"Ansad", "Apatot", "Bateria", "Cabaroan", "Cappa-Cappa", "Poblacion", "San Nicolas", "San Pablo", "San Rafael", "Villa Quirino"};
			for(int a=0; a<SanEstebanCity.length;a++) {
			brgy.addItem(SanEstebanCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("San Ildefonso")) {
			brgy.removeAllItems();
			String[] SanIldefonsoCity = {"Arnap", "Bahet", "Belen", "Bungro", "Busiing Sur", "Busiing Norte", "Dongalo", 
                    "Gongogong", "Iboy", "Kinamantirisan", "Otol-Patac", "Poblacion East", 
                    "Poblacion West", "Sagneb", "Sagsagat"};
			for(int a=0; a<SanIldefonsoCity.length;a++) {
			brgy.addItem(SanIldefonsoCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("San Juan")) {
			brgy.removeAllItems();
			String[] SanJuanCity ={"Asilang", "Bacsil", "Baliw", "Bannuar (Poblacion)", "Barbar", "Cabanglotan", "Cacandongan", "Camanggaan", "Camindoroan", "Caronoan"
					, "Darao", "Dardarat", "Guimod Norte", "Guimod Sur", "Immayos Norte", "Immayos Sur", "Labnig", "Lapting", "Lira (Poblacion)", "Malamin", "Muraya", "Nagsabaran", "Nagsupotan"
					, "Pandayan (Poblacion)", "Refaro", "Resurreccion (Poblacion)", "Sabangan", "San Isidro", "Saoang", "Solotsolot", "Sunggiam", "Surngit"};
			for(int a=0; a<SanJuanCity.length;a++) {
			brgy.addItem(SanJuanCity[a]);}
		
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("San Vicente")) {
			brgy.removeAllItems();
			String[] SanVicenteCity = {"Bantaoay", "Bayubay Norte", "Bayubay Sur", "Lubong", "Poblacion", "Pudoc", "San Sebastian"};

			for(int a=0; a<SanVicenteCity.length;a++) {
			brgy.addItem(SanVicenteCity[a]);}
			
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Santa")) {
			brgy.removeAllItems();
			String[] SantaCity = {"Ampandula", "Banaoang", "Basug", "Bucalag", "Cabangaran", "Calungboyan", "Casiber", "Dammay", "Labut Norte", "Labut Sur", "Mabilbila Norte", "Mabilbila Sur"
					, "Magsaysay District (Poblacion)", "Manueva", "Marcos (Poblacion)", "Nagpanaoan", "Namalangan", "Oribi", "Pasungol", "Quezon (Poblacion)", "Quirino (Poblacion)", "Rancho"
					, "Rizal", "Sacuyya Norte", "Sacuyya Sur", "Tabucolan"};

			for(int a=0; a<SantaCity.length;a++) {
			brgy.addItem(SantaCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Santa Catalina")) {
			brgy.removeAllItems();
			String[] SantaCatalinaCity = {"Cabaroan", "Cabittaogan", "Cabuloan", "Pangada", "Paratong", "Poblacion", "Sinabaan", "Subec", "Tamorong"};
			for(int a=0; a<SantaCatalinaCity.length;a++) {
			brgy.addItem(SantaCatalinaCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Santa Cruz")) {
			brgy.removeAllItems();
			String[] SantacruzCity = {"Amarao", "Babayoan", "Bacsayan", "Banay", "Bayugao Este", "Bayugao Oeste", "Besalan", "Bugbuga", "Calaoaan", "Camanggaan", "Candalican", "Capariaan"
					, "Casilagan", "Coscosnong", "Daligan", "Dili", "Gabor Norte", "Gabor Sur", "Lalong", "Lantag", "Las-ud", "Mambog", "Mantanas", "Nagtengnga", "Padaoil", "Paratong", "Pattiqui", "Pidpid"
					, "Pilar", "Pinipin", "Poblacion Este", "Poblacion Norte", "Poblacion Weste", "Poblacion Sur", "Quinfermin", "Quinsoriano", "Sagat", "San Antonio", "San Jose", "San Pedro", "Saoat", "Sevilla"
					, "Sidaoen", "Suyo", "Tampugo", "Turod", "Villa Garcia", "Villa Hermosa", "Villa Laurencia"};
			for(int a=0; a<SantacruzCity.length;a++) {
			brgy.addItem(SantacruzCity[a]);}
			
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Santa Lucia")) {
			brgy.removeAllItems();
			String[] SantaLuciaCity= {
				    "Alincaoeg",
				    "Angkileng",
				    "Arangin",
				    "Ayusan (Poblacion)",
				    "Banbanaba",
				    "Bani",
				    "Bao-as",
				    "Barangobong (Poblacion)",
				    "Buliclic",
				    "Burgos (Poblacion)",
				    "Cabaritan",
				    "Catayagan",
				    "Conconig East",
				    "Conconig West",
				    "Damacuag",
				    "Lubong",
				    "Luba",
				    "Nagrebcan",
				    "Nagtablaan",
				    "Namatican",
				    "Nangalisan",
				    "Palali Norte",
				    "Palali Sur",
				    "Paoc Norte",
				    "Paoc Sur",
				    "Paratong",
				    "Pila East",
				    "Pila West",
				    "Quinabalayangan",
				    "Ronda",
				    "Sabuanan",
				    "San Juan",
				    "San Pedro",
				    "Sapang",
				    "Suagayan",
				    "Vical"
				};
			for(int a=0; a<SantaLuciaCity.length;a++) {
			brgy.addItem(SantaLuciaCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Santa Maria")) {
			brgy.removeAllItems();
			String[] SantamariaCity = {"Ag-agrao", "Ampuagan", "Baballasioan", "Baliw Daya (San Gelacio)", 
                    "Baliw Laud (Simbuok)", "Bia-o", "Butir", "Cabaroan", "Danuman East", 
                    "Danuman West", "Dunglayan", "Gusing", "Langaoan", "Laslasong Norte", 
                    "Laslasong Sur", "Laslasong West", "Lesseb", "Lingsat", "Lubong", 
                    "Maynganay Norte", "Maynganay Sur (San Ignacio)", "Nagsayaoan", "Nagtupacan", 
                    "Nalvo", "Pacang", "Penned", "Poblacion Norte (San Gregorio)", 
                    "Poblacion Sur (San Francisco)", "Silag", "Sumagui", "Suso", "Tangaoan", "Tinaan"};

			for(int a=0; a<SantamariaCity.length;a++) {
			brgy.addItem(SantamariaCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Santiago	")) {
			brgy.removeAllItems();
			String[] SantiagoCity = {"Al-aludig", "Ambucao", "San Jose (Baraoas)", "Baybayabas", "Bigbiga", "Bulbulala", "Busel-busel", "Butol", "Caburao", "Dan-ar", "Gabao"
					, "Guinabang", "Imus", "Lang-ayan", "Mambug", "Nalasin", "Olo-olo Norte", "Olo-olo Sur", "Poblacion Norte", "Poblacion Sur", "Sabangan", "Salincub", "San Roque", "Ubbog"};

			for(int a=0; a<SantiagoCity.length;a++) {
			brgy.addItem(SantiagoCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Santo Domingo")) {
			brgy.removeAllItems();
			String[] SantoDomingoCity = {"Binalayangan", "Binongan", "Borobor", "Cabaritan", "Cabigbigaan", "Calautit", "Calay-ab", "Camestizoan", "Casili", "Flora", "Lagatit", "Laoingen"
					, "Lussoc", "Nalasin", "Nagbettedan", "Naglaoa-an", "Nambaran", "Nanerman", "Napo", "Padu Chico", "Padu Grande", "Paguraper", "Panay", "Pangpangdan", "Parada", "Paras"
					, "Poblacion", "Puerta Real", "Pussuac", "Quimmarayan", "San Pablo", "Santa Cruz", "Santo Tomas", "Sived", "Vacunero", "Suksukit"};
			for(int a=0; a<SantoDomingoCity.length;a++) {
			brgy.addItem(SantoDomingoCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Sigay")) {
			brgy.removeAllItems();
			String[] SigayCity = {"Abaccan", "Mabileg", "Matallucod", "Poblacion (Madayaw)", "San Elias", "San Ramon", "Santo Rosario"};

			for(int a=0; a<SigayCity.length;a++) {
			brgy.addItem(SigayCity[a]);}
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Sinait")) {
				brgy.removeAllItems();
				String[] SinaitCity = {"Aguing", "Ballaigui (Poblacion)", "Baliw", "Baracbac", "Barikir", "Battog", "Binacud", 
	                      "Cabangtalan", "Cabarambanan", "Cabulalaan", "Cadanglaan", "Calingayan", "Curtin", 
	                      "Dadalaquiten Norte", "Dadalaquiten Sur", "Duyayyat", "Jordan", "Calanutian", 
	                      "Katipunan", "Macabiag (Poblacion)", "Magsaysay", "Marnay", "Masadag", "Nagcullooban", 
	                      "Nagbalioartian", "Nagongburan", "Namnama (Poblacion)", "Pacis", "Paratong", 
	                      "Dean Leopoldo Yabes (Pug-os)", "Purag", "Quibit-quibit", "Quimmallogong", 
	                      "Rang-ay (Poblacion)", "Ricudo", "Sabangan (Marcos)", "Sallacapo", "Santa Cruz", 
	                      "Sapriana", "Tapao", "Teppeng", "Tubigay", "Ubbog", "Zapat"};

			for(int a=0; a<SinaitCity.length;a++) {
			brgy.addItem(SinaitCity[a]);}
				

		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Sugpon")) {
			brgy.removeAllItems();
			String[] VintarCity = {"==SELECT BRGY==","Balbalayang","Banga","Caoayan","Danac","Licungan","Pangotan"};
			for(int a=0; a<VintarCity.length;a++) {
			brgy.addItem(VintarCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Suyo")) {
			brgy.removeAllItems();
			String[] VintarCity = {"==SELECT BRGY==","Baringcucurong","Cabugao","Man-atong","Patoc-ao","Poblacion","Suyo Proper","Urzadan","Uso"};
			for(int a=0; a<VintarCity.length;a++) {
			brgy.addItem(VintarCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Tagudin")) {
			brgy.removeAllItems();
			String[] TagudinCity = {"Ag-aguman", "Ambalayat", "Baracbac", "Bario-an", "Baritao", "Becques", "Bimmanga", "Bio", "Bitalag", "Borono", "Bucao East", "Bucao West"
					, "Cabaroan", "Cabugbugan", "Cabulanglangan", "Dacutan", "Dardarat", "Del Pilar", "Farola", "Gabur", "Garitan", "Jardin", "Lacong", "Lantag", "Las-ud"
					, "Libtong", "Lubnac", "Magsaysay", "Malacañang", "Pacac", "Pallogan", "Pula", "Pudoc East", "Pudoc West", "Quirino", "Ranget", "Rizal", "Salvacion"
					, "San Miguel", "Sawat", "Tallaoen", "Tampugo", "Tarangotong"};
			for(int a=0; a<TagudinCity.length;a++) {
			brgy.addItem(TagudinCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Ilocos Sur") && municipalities.getSelectedItem().equals("Vigan")) {
			brgy.removeAllItems();
			String[] ViganCity = {"Ayusan Norte", "Ayusan Sur", "Barangay I (Poblacion)", "Barangay II (Poblacion)", "Barangay III (Poblacion)", "Barangay IV (Poblacion)"
					, "Barangay V (Poblacion)", "Barangay VI (Poblacion)", "Barangay VII (Poblacion)", "Barangay VIII (Poblacion)", "Barangay IX (Poblacion)", "Barraca"
					, "Beddeng Daya", "Beddeng Laud", "Bongtolan", "Bulala", "Cabalangegan", "Cabaroan Daya", "Cabaroan Laud", "Camangaan", "Capangpangan", "Mindoro", "Nagsangalan"
					, "Pantay Daya", "Pantay Fatima", "Pantay Laud", "Paoa", "Paratong", "Pong-ol", "Purok-a-bassit", "Purok-a-dackel", "Raois", "Rugsuanan", "Salindeg", "San Jose"
					, "San Julian Norte", "San Julian Sur", "San Pedro", "Tamag"};
			for(int a=0; a<ViganCity.length;a++) {
			brgy.addItem(ViganCity[a]);}
			
		
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Agno")) {
			brgy.removeAllItems();
			String [] AgnoCity = {"Allabon", "Aloleng", "Bangan Oda", "Baruan", "Boboy", "Cayungnan", "Dangley", 
                    "Gayusan", "Macaboboni", "Magsaysay", "Namatucan", "Patar", "Poblacion East", 
                    "Poblacion West", "San Juan", "Tupa", "Viga"};
			for(int a=0; a<AgnoCity.length;a++) {
			brgy.addItem(AgnoCity[a]);}
		
	
	
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Aguilar")) {
			brgy.removeAllItems();
			String[] AguilarCity = {"Bayaoas", "Baybay", "Bocacliw", "Bocboc East", "Bocboc West", "Buer", "Calsib", "Niñoy", "Poblacion", "Pogomboa", "Pogonsili", "San Jose"
					, "Tampac", "Laoag", "Manlocboc", "Panacol"};
			for(int a=0; a<AguilarCity.length;a++) {
				brgy.addItem(AguilarCity[a]);}
		
	
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Alaminos")) {
			brgy.removeAllItems();
			String[] AlaminosCity = {"Alos", "Amandiego", "Amangbangan", "Balangobong", "Balayang", "Bisocol", "Bolaney", "Baleyadaan", "Bued", "Cabatuan", "Cayucay", "Dulacac"
					, "Inerangan", "Landoc", "Linmansangan", "Lucap", "Maawi", "Macatiw", "Magsaysay", "Mona", "Palamis", "Pandan", "Pangapisan", "Poblacion", "Pocal-Pocal", "Pogo"
					, "Polo", "Quibuar", "Sabangan", "San Antonio", "San Jose", "San Roque", "San Vicente", "Santa Maria", "Tanaytay", "Tangcarang", "Tawintawin", "Telbang", "Victoria"};
			for(int a=0; a<AlaminosCity .length;a++) {
				brgy.addItem(AlaminosCity [a]);}
		
	
	
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Alcala")) {
			brgy.removeAllItems();
			String[]AlcalaCity = {"Anulid", "Atainan", "Bersamin", "Canarvacanan", "Caranglaan", 
                    "Curareng", "Gualsic", "Kisikis", "Laoac", "Macayo", 
                    "Pindangan Centro", "Pindangan East", "Pindangan West", 
                    "Poblacion East", "Poblacion West", "San Juan", "San Nicolas", 
                    "San Pedro Apartado", "San Pedro Ili", "San Vicente", "Vacante"};
			for(int a=0; a<AlcalaCity .length;a++) {
			brgy.addItem(AlcalaCity [a]);}
	

		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Anda")) {
			brgy.removeAllItems();
			String[] AndaCity = {"Awile", "Awag", "Batiarao", "Cabungan", "Carot", "Dolaoan", "Imbo", "Macaleeng", "Macando-candong", "Mal-ong", "Namagbagan"
					, "Poblacion", "Roxas", "Sablig", "San Jose", "Siapar", "Tondol", "Tori-tori"};
			for(int a=0; a<AndaCity .length;a++) {
				brgy.addItem(AndaCity [a]);}	
		}

		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Asingan")) {
			brgy.removeAllItems();
			String[] AsinganCity =  {"Ariston East", "Ariston West", "Bantog", "Baro", "Bobonan", "Cabalitian", "Calepaan", "Carosucan Norte", "Carosucan Sur", "Coldit"
					, "Domanpot", "Dupac", "Macalong", "Palaris", "Poblacion East", "Poblacion West", "San Vicente Este", "San Vicente Weste", "Sanchez", "Sobol", "Toboy"};
			for(int a=0; a<AsinganCity .length;a++) {
				brgy.addItem(AsinganCity [a]);}	
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Balungao")) {
			brgy.removeAllItems();
			String[] BalungaoCity = {"Angayan Norte", "Angayan Sur", "Capulaan", "Esmeralda", "Kita-kita", "Mabini", "Mauban", "Poblacion", "Pugaro", "Rajal", "San Andres"
					, "San Aurelio 1st", "San Aurelio 2nd", "San Aurelio 3rd", "San Joaquin", "San Julian", "San Leon", "San Marcelino", "San Miguel", "San Raymundo"};
			for(int a=0; a<BalungaoCity.length;a++) {
			brgy.addItem(BalungaoCity [a]);}	
		
		}
		else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Bani")) {
			brgy.removeAllItems();
			String[] BaniCity =  {"Ambabaay", "Aporao", "Arwas", "Ballag", "Banog Norte", "Banog Sur", "Calabeng", "Centro Toma", "Colayo", "Dacap Norte", "Dacap Sur"
					, "Garrita", "Luac", "Macabit", "Masidem", "Poblacion", "Quinaoayanan", "Ranao", "Ranom Iloco", "San Jose", "San Miguel", "San Simon", "San Vicente"
					, "Tiep", "Tipor", "Tugui Grande", "Tugui Norte"};

			for(int a=0; a<BaniCity.length;a++) {
			brgy.addItem(BaniCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Basista")) {
			brgy.removeAllItems();
			String[] BasistaCity ={"Anambongan", "Bayoyong", "Cabeldatan", "Dumpay", "Malimpec East", "Mapolopolo", "Nalneran", "Navatat", "Obong", "Osmena, Sr.", "Palma", "Patacbo", "Poblacion"};
			for(int a=0; a<BasistaCity.length;a++) {
			brgy.addItem(BasistaCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Bautista")) {
			brgy.removeAllItems();
			String[] BautistaCity = {"Artacho", "Baluyot", "Cabuaan", "Cacandongan", "Diaz", "Nandacan", 
                    "Nibaliw Norte", "Nibaliw Sur", "Palisoc", "Poblacion East", "Poblacion West", 
                    "Pogo", "Poponto", "Primicias", "Ketegan", "Sinabaan", "Vacante", "Villanueva"};

			for(int a=0; a<BautistaCity.length;a++) {
			brgy.addItem(BautistaCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Bayambang")) {
			brgy.removeAllItems();
			String[] BayambangCity = {"Alinggan", "Amanperez", "Amancosiling Norte", "Amancosiling Sur", "Ambayat I", "Ambayat II", "Apalen", "Asin", "Ataynan", "Bacnono"
					, "Balaybuaya", "Banaban", "Bani", "Batangcaoa", "Beleng", "Bical Norte", "Bical Sur", "Bongato East", "Bongato West", "Buayaen", "Buenlag 1st", "Buenlag 2nd"
					, "Cadre Site", "Carungay", "Caturay", "Darawey (Tangal)", "Duera", "Dusoc", "Hermoza", "Idong", "Inanlorenza", "Inirangan", "Iton", "Langiran", "Ligue"
					, "M. H. del Pilar", "Macayocayo", "Magsaysay", "Maigpa", "Malimpec", "Malioer", "Managos", "Manambong Norte", "Manambong Parte", "Manambong Sur", "Mangayao"
					, "Nalsian Norte", "Nalsian Sur", "Pangdel", "Pantol", "Paragos", "Poblacion Sur", "Pugo", "Reynado", "San Gabriel 1st", "San Gabriel 2nd", "San Vicente"
					, "Sancagulis", "Sanlibo", "Sapang", "Tamaro", "Tambac", "Tampog", "Tanolong", "Tatarac", "Telbang", "Tococ East", "Tococ West", "Warding", "Wawa"
					, "Zone I (Poblacion)", "Zone II (Poblacion)", "Zone III (Poblacion)", "Zone IV (Poblacion)", "Zone V (Poblacion)", "Zone VI (Poblacion)", "Zone VII (Poblacion)"};
			for(int a=0; a<BayambangCity.length;a++) {
			brgy.addItem(BayambangCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Binalonan")) {
			brgy.removeAllItems();
			String[] BinalonanCity = {"Balangobong", "Bued", "Bugayong", "Camangaan", "Canarvacanan", "Capas", "Cili", "Dumayat", "Linmansangan", "Mangcasuy", "Moreno"
					, "Pasileng Norte", "Pasileng Sur", "Poblacion", "San Felipe Central", "San Felipe Sur", "San Pablo", "Sta. Catalina", "Sta. Maria Norte", "Santiago"
					, "Sto. Niño", "Sumabnit", "Tabuyoc", "Vacante"};
			for(int a=0; a<BinalonanCity.length;a++) {
			brgy.addItem(BinalonanCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Binmaley")) {
			brgy.removeAllItems();
			String[] BinmaleyCity ={"Amancoro", "Balagan", "Balogo", "Basing", "Baybay Lopez", "Baybay Polong", "Biec", "Buenlag", "Calit", "Caloocan Dupo", "Caloocan Norte"
					, "Caloocan Sur", "Camaley", "Canaoalan", "Dulag", "Gayaman", "Linoc", "Lomboy", "Nagpalangan", "Malindong", "Manat", "Naguilayan", "Pallas", "Papagueyan"
					, "Parayao", "Poblacion", "Pototan", "Sabangan", "Salapingao", "San Isidro Norte", "San Isidro Sur", "Santa Rosa", "Tombor"};
			for(int a=0; a<BinmaleyCity.length;a++) {
			brgy.addItem(BinmaleyCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Bolinao")) {
			brgy.removeAllItems();
			String[] BolinaoCity ={"Arnedo", "Balingasay", "Binabalian", "Cabuyao", "Catuday", "Catungi", "Concordia (Poblacion)", "Culang", "Dewey", "Estanza"
					, "Germinal (Poblacion)", "Goyoden", "Ilog-Malino", "Lambes", "Liwa-liwa", "Lucero", "Luciente 1.0 (J.Celeste)", "Luciente 2.0", "Luna", "Patar"
					, "Pilar", "Salud", "Samang Norte", "Samang Sur", "Sampaloc", "San Roque", "Tara", "Tupa", "Victory", "Zaragoza"};
			for(int a=0; a<BolinaoCity.length;a++) {
			brgy.addItem(BolinaoCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Bugallon")) {
			brgy.removeAllItems();
			String[] BugallonCity ={"Angarian", "Asinan", "Bañaga", "Bacabac", "Bolaoen", "Buenlag", "Cabayaoasan", "Cayanga", "Gueset", "Hacienda", "Laguit Centro"
					, "Laguit Padilla", "Magtaking", "Pangascasan", "Pantal", "Poblacion", "Polong", "Portic", "Salasa", "Salomague Norte", "Salomague Sur", "Samat"
					, "San Francisco", "Umanday"};
			for(int a=0; a<BugallonCity.length;a++) {
			brgy.addItem(BugallonCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Burgos")) {
			brgy.removeAllItems();
			String[] BurgosCity = {"Anapao (Bur Anapac)", "Cacayasen", "Concordia", "Ilio-ilio (Iliw-iliw)", "Papallasen", 
                    "Poblacion", "Pogoruac", "Don Matias", "San Miguel", "San Pascual", "San Vicente", 
                    "Sapa Grande", "Sapa Pequeña", "Tambacan"};
			for(int a=0; a<BurgosCity.length;a++) {
			brgy.addItem(BurgosCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Calasiao")) {
			brgy.removeAllItems();
			String[] CalasiaoCity ={"Ambonao", "Ambuetel", "Banaoang", "Bued", "Buenlag†", "Cabilocaan", "Dinalaoan", "Doyong", "Gabon", "Lasip", "Longos", "Lumbang"
					, "Macabito", "Malabago", "Mancup", "Nagsaing", "Nalsian", "Poblacion East", "Poblacion West^", "Quesban", "San Miguel", "San Vicente", "Songkoy"
					, "Talibaew"};
			for(int a=0; a<CalasiaoCity.length;a++) {
			brgy.addItem(CalasiaoCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Dagupan")) {
			brgy.removeAllItems();
			String[] DagupanCity = {"Bacayao Norte", "Bacayao Sur", "Barangay I (T. Bugallon)", "Barangay II (Nueva)", "Barangay IV (Zamora)", "Bolosan", "Bonuan Binloc"
					, "Bonuan Boquig", "Bonuan Gueset", "Calmay", "Carael", "Caranglaan", "Herrero St.", "Lasip Chico", "Lasip Grande", "Lomboy", "Lucao Dist.", "Malued"
					, "Mamalingling", "Mangin", "Mayombo Dist.", "Pantal", "Poblacion Oeste", "Pogo Chico", "Pogo Grande", "Pugaro Suit", "Salapingao", "Salisay", "Tambac"
					, "Tapuac", "Tebeng"};
			for(int a=0; a<DagupanCity.length;a++) {
			brgy.addItem(DagupanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Dasol")) {
			brgy.removeAllItems();
			String[] DasolCity = {"Alilao", "Amalbalan", "Bobonot", "Eguia", "Gais-Guipe", 
                    "Hermosa", "Macalang", "Magsaysay", "Malacapas", "Malimpin", 
                    "Osmeña", "Petal", "Poblacion", "San Vicente", "Tambac", 
                    "Tambobong", "Uli", "Viga"};
			for(int a=0; a<DasolCity.length;a++) {
			brgy.addItem(DasolCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Infanta")) {
			brgy.removeAllItems();
			String[] InfantaCity ={"Bamban", "Batang", "Bayambang", "Cato", "Doliman", "Patima", "Maya", "Nangalisan", "Nayom", "Pita", "Poblacion", "Potol", "Babuyan"};
			for(int a=0; a<InfantaCity.length;a++) {
			brgy.addItem(InfantaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Labrador")) {
			brgy.removeAllItems();
			String[] LabradorCity = {"Bolo (*Kadampat, *Quiray)", "Bongalon", "Dulig", "Laois", "Magsaysay", "Poblacion", "San Gonzalo", "San Jose", "Tobuan"};
			for(int a=0; a<LabradorCity.length;a++) {
			brgy.addItem(LabradorCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Laoac")) {
			brgy.removeAllItems();
			String[] LaoacCity = {"Anis", "Balligi", "Banuar", "Botigue", "Caaringayan", "Domingo Alarcio (Cabilaoan East)", "Cabilaoan", "Cabulalaan", "Calaoagan"
					, "Calmay", "Casampagaan", "Casanestebanan", "Casantiagoan", "Inmanduyan", "Poblacion (Laoac)", "Lebueg", "Maraboc", "Nanbagatan", "Panaga"
					, "Talogtog", "Turko", "Yatyat"};
			for(int a=0; a<LaoacCity.length;a++) {
			brgy.addItem(LaoacCity [a]);}	
			
		
		}else if(region.getSelectedItem().equals("Region I")&& province.getSelectedItem().equals("Pangasinan") && municipalities.getSelectedItem().equals("Lingayen")) {
			brgy.removeAllItems();
			String[] LingayenCity = {"Aliwekwek", "Baay", "Balangobong", "Balococ", "Bantayan", "Basing", "Capandanan", "Domalandan Center", "Domalandan East", "Domalandan West"
					, "Dorongan", "Dulag", "Estanza", "Lasip", "Libsong East", "Libsong West", "Malawa", "Malimpuec", "Maniboc", "Matalava", "Naguelguel", "Namolan"
					, "Pangapisan North", "Pangapisan Sur", "Poblacion", "Quibaol", "Rosario", "Sabangan", "Talogtog", "Tonton", "Tumbar", "Wawa"};
			for(int a=0; a<LingayenCity.length;a++) {
			brgy.addItem(LingayenCity [a]);}	
			
		
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Batanes") && municipalities.getSelectedItem().equals("Basco")) {
			brgy.removeAllItems();
			String[] BascoCity = {"Chanarian","Ihubok I","Ihubok II","Kayhuvokan","San Antonio","San Joaquin",};
			for(int a=0; a<BascoCity.length;a++) {
			brgy.addItem(BascoCity [a]);}	
			
		
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Batanes") && municipalities.getSelectedItem().equals("Itbayat")) {
			brgy.removeAllItems();
			String[] ItbayatCity = {"Raele","San Rafael","Santa Lucia","Santa Maria	","Santa Rosa"};
			for(int a=0; a<ItbayatCity.length;a++) {
			brgy.addItem(ItbayatCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Batanes") && municipalities.getSelectedItem().equals("Ivana")) {
			brgy.removeAllItems();
			String[] IvanaCity = {"Radiwan","Salagao","San Vicente","Tuhel"};
			for(int a=0; a<IvanaCity.length;a++) {
			brgy.addItem(IvanaCity [a]);}	
		
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Batanes") && municipalities.getSelectedItem().equals("Sabtang")) {
			brgy.removeAllItems();
			String[] SabtangCity = {"Chavayan","Malakdang","Nakanmuan","Savidug","Sinakan","Sumnanga"};
			for(int a=0; a<SabtangCity.length;a++) {
			brgy.addItem(SabtangCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Batanes") && municipalities.getSelectedItem().equals("Uyugan")) {
			brgy.removeAllItems();
			String[] UyuganCity = {"Imnajbu","Itbud","Kayuganan","Kayvaluganan"};
			for(int a=0; a<UyuganCity.length;a++) {
			brgy.addItem(UyuganCity [a]);}	
			
		
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan") && municipalities.getSelectedItem().equals("Abulug")) {
			brgy.removeAllItems();
			String[] UyuganCity = {"Alinunu","Bagu","Banguian","Calog Norte","Dana-Ili","Calog Sur","Canayun","Centro"};
			for(int a=0; a<UyuganCity.length;a++) {
			brgy.addItem(UyuganCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan") && municipalities.getSelectedItem().equals("Alcala")) {
			brgy.removeAllItems();
			String[] AlcalaCity = {"Abbeg","Afusing Bato","Afusing Daga","Agani","Baculod","Baybayog","Cabuluan","Calantac"};
			for(int a=0; a<AlcalaCity.length;a++) {
			brgy.addItem(AlcalaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan") && municipalities.getSelectedItem().equals("Allacapan")) {
			brgy.removeAllItems();
			String[] AllacapanCity = {"Bessang", "Binubungan", "Bulo", "Burot", "Capagaran (Brigida)", "Capalutan", "Capanickian Norte", "Capanickian Sur"};	
			for(int a=0; a<AllacapanCity.length;a++) {
			brgy.addItem(AllacapanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan") && municipalities.getSelectedItem().equals("Amulung")) {
			brgy.removeAllItems();
			String[] AmulungCity = {"Abolo", "Agguirit", "Alitungtung", "Annabuculan", "Annafatan", "Anquiray", "Babayuan", "Baccuit"};
			for(int a=0; a<AmulungCity.length;a++) {
			brgy.addItem(AmulungCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan") && municipalities.getSelectedItem().equals("Aparri")) {
			brgy.removeAllItems();
			String[] AparriCity = {"Backiling - W", "Bangag - W", "Binalan - W", "Bisagu - W", "Bukig - W", "Bulala Norte - W", "Bulala Sur - W", "Caagaman - W"};

			for(int a=0; a<AparriCity.length;a++) {
			brgy.addItem(AparriCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan") && municipalities.getSelectedItem().equals("Baggao")) {
			brgy.removeAllItems();
			String[] BaggaoCity = {"Adaoag", "Agaman (Norte)", "Agaman (Sur)", "Agaman (Proper)", "Alba", "Annayatan", "Asassi", "Asinga-Via"};
			for(int a=0; a<BaggaoCity.length;a++) {
			brgy.addItem(BaggaoCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan") && municipalities.getSelectedItem().equals("Ballesteros")) {
			brgy.removeAllItems();
			String[] BallesterosCity = {"Ammubuan", "Baran", "Cabaritan East", "Cabaritan West", "Cabayu", "Cabuluan East", "Cabuluan West", "Centro East (Poblacion)"};

			for(int a=0; a<BallesterosCity.length;a++) {
			brgy.addItem(BallesterosCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Cagayan") && municipalities.getSelectedItem().equals("Buguey")) {
			brgy.removeAllItems();
			String[] BugueyCity = {"Ballang", "Balza", "Cabaritan", "Calamegatan", "Centro (Poblacion)", "Centro West", "Dalaya", "Fula"};

			for(int a=0; a<BugueyCity.length;a++) {
			brgy.addItem(BugueyCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela") && municipalities.getSelectedItem().equals("Alicia")) {
			brgy.removeAllItems();
			String[] AliciaCity =  {"Amistad", "Antonino (Poblacion)", "Apanay", "Aurora", "Bagnos", "Bagong Sikat", "Bantug-Petines", "Bonifacio"};
			for(int a=0; a<AliciaCity.length;a++) {
			brgy.addItem(AliciaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela") && municipalities.getSelectedItem().equals("Angadanan")) {
			brgy.removeAllItems();
			String[] AngadananCity = {"Allangigan", "Aniog", "Baniket", "Bannawag", "Bantug", "Barangcuag", "Baui", "Bonifacio"};
			for(int a=0; a<AngadananCity.length;a++) {
			brgy.addItem(AngadananCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela") && municipalities.getSelectedItem().equals("Aurora")) {
			brgy.removeAllItems();
			String[] AuroraCity = {"Apiat", "Bagnos", "Bagong Tanza", "Ballesteros", "Bannagao", "Bannawag", "Bolinao", "Santo Niño (Caipilan)"};
			for(int a=0; a<AuroraCity.length;a++) {
			brgy.addItem(AuroraCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela") && municipalities.getSelectedItem().equals("Benito Soliven")) {
			brgy.removeAllItems();
			String[] BenitoSolivenCity = {"Andabuen", "Ara", "Binogtungan", "Capuseran (Capurocan)", "Dagupan", "Danipa", "District II (Poblacion)", "Gomez"};
			for(int a=0; a<BenitoSolivenCity.length;a++) {
			brgy.addItem(BenitoSolivenCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela") && municipalities.getSelectedItem().equals("Burgos")) {
			brgy.removeAllItems();
			String[] BurgosCity = {"Bacnor East", "Bacnor West", "Caliguian (Poblacion)", "Catabban", "Cullalabo del Norte", "Cullalabo del Sur", "Dalig", "Malasin"};
			for(int a=0; a<BurgosCity.length;a++) {
			brgy.addItem(BurgosCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela") && municipalities.getSelectedItem().equals("Cabagan")) {
			brgy.removeAllItems();
			String[] CabaganCity = {"Aggub", "Anao", "Angancasilian", "Balasig", "Cansan", "Casibarag Norte", "Casibarag Sur", "Catabayungan"};
			for(int a=0; a<CabaganCity.length;a++) {
			brgy.addItem(CabaganCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela") && municipalities.getSelectedItem().equals("Cabatuan")) {
			brgy.removeAllItems();
			String[] CabatuanCity = {"Centro (Poblacion)", "Del Pilar", "Magdalena", "Sampaloc", "San Andres", "Saranay", "Calaocan", "Canan"};
			for(int a=0; a<CabatuanCity.length;a++) {
			brgy.addItem(CabatuanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Isabela") && municipalities.getSelectedItem().equals("Cauayan")) {
			brgy.removeAllItems();
			String[] CauayanCity ={"Alicaocao", "Amobocan", "Andarayan", "Bacolod", "Baringin Norte", "Baringin Sur", "Buena Suerte", "Bugallon"};
			for(int a=0; a<CauayanCity.length;a++) {
			brgy.addItem(CauayanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya") && municipalities.getSelectedItem().equals("Alfonso Castañeda")) {
			brgy.removeAllItems();
			String[] AlfonsoCastañedaCity ={"Abuyo", "Galintuja", "Cawayan", "Lipuga", "Lublub (Poblacion)", "Pelaway"};
			for(int a=0; a<AlfonsoCastañedaCity.length;a++) {
			brgy.addItem(AlfonsoCastañedaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya") && municipalities.getSelectedItem().equals("Ambaguio")) {
			brgy.removeAllItems();
			String[] AmbaguioCity ={"Ammoweg","Camandag","Labang","Napo","Poblacion","Salingsingan","Tiblac","Dulli"};
			for(int a=0; a<AmbaguioCity.length;a++) {
			brgy.addItem(AmbaguioCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya") && municipalities.getSelectedItem().equals("Aritao")) {
			brgy.removeAllItems();
			String[] AritaoCity= {"Banganan", "Beti", "Bone North", "Bone South", "Calitlitan", "Comon", "Cutar", "Darapidap"};
			for(int a=0; a<AritaoCity.length;a++) {
			brgy.addItem(AritaoCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya") && municipalities.getSelectedItem().equals("Bagabag")) {
			brgy.removeAllItems();
			String[] BagabagCity ={"Baretbet", "Careb", "Lantap", "Murong", "Nangalisan", "Paniki (Paniqui)", "Pogonsino"};
			for(int a=0; a<BagabagCity.length;a++) {
			brgy.addItem(BagabagCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya") && municipalities.getSelectedItem().equals("Bambang")) {
			brgy.removeAllItems();
			String[] BambangCity = {"Abinganan", "Aliaga", "Almaguer North", "Almaguer South", "Banggot (Urban)", "Barat", "Buag (Urban)"};
			for(int a=0; a<BambangCity.length;a++) {
			brgy.addItem(BambangCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya") && municipalities.getSelectedItem().equals("Bayombong")) {
			brgy.removeAllItems();
			String[] BayombongCity = {"Bonfal East", "Bonfal Proper", "Bonfal West", "Buenavista (Vista Hills)", "Busilac", "Casat", "La Torre North", "Magapuy"};
			for(int a=0; a<BayombongCity.length;a++) {
			brgy.addItem(BayombongCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya") && municipalities.getSelectedItem().equals("Diadi")) {
			brgy.removeAllItems();
			String[] DiadiCity={"Ampakleng", "Arwas", "Balete", "Bugnay", "Butao", "Decabacan", "Duruarog", "Escoting"};
			for(int a=0; a<DiadiCity.length;a++) {
			brgy.addItem(DiadiCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region II")&& province.getSelectedItem().equals("Nueva Vizcaya") && municipalities.getSelectedItem().equals("Dupax del Norte")) {
			brgy.removeAllItems();
			String[] DupaxelNorteCity= {"Belance", "Binuangan", "Bitnong", "Bulala", "Inaban", "Ineangan", "Lamo", "Mabasa"};
			for(int a=0; a<DupaxelNorteCity.length;a++) {
			brgy.addItem(DupaxelNorteCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora") && municipalities.getSelectedItem().equals("Baler")) {
			brgy.removeAllItems();
			String[] BalerCity= {"Barangay 1 (Poblacion)", "Barangay 2 (Poblacion)", "Barangay 3 (Poblacion)", "Barangay 4 (Poblacion)", "Barangay  (Poblacion)"
					, "Buhangin", "Calabuanan", "Obligacion"};
			for(int a=0; a<BalerCity.length;a++) {
			brgy.addItem(BalerCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora") && municipalities.getSelectedItem().equals("Casiguran")) {
			brgy.removeAllItems();
			String[] CasiguranCity= {"Barangay I (Poblacion)", "Barangay II (Poblacion)", "Barangay III (Poblacion)", "Barangay IV (Poblacion)", "Barangay V (Poblacion)"
					, "Barangay VI (Poblacion)", "Barangay VII (Poblacion)", "Barangay VIII (Poblacion)"};
			for(int a=0; a<CasiguranCity.length;a++) {
			brgy.addItem(CasiguranCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora") && municipalities.getSelectedItem().equals("Dilasag")) {
			brgy.removeAllItems();
			String[] DilasagCity={"Diagyan", "Dicabasan", "Dilaguidi", "Dimaseset", "Diniog", "Esperanza", "Lawang", "Maligaya (Poblacion)"};
			for(int a=0; a<DilasagCity.length;a++) {
			brgy.addItem(DilasagCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora") && municipalities.getSelectedItem().equals("Dinalungan")) {
			brgy.removeAllItems();
			String[] DinalunganCity={"Abuleg", "Zone I (Poblacion)", "Zone II (Poblacion)", "Nipoo (Bulo)", "Dibaraybay", "Ditawini", "Mapalad", "Paleg", "Simbahan"};
			for(int a=0; a<DinalunganCity.length;a++) {
			brgy.addItem(DinalunganCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora") && municipalities.getSelectedItem().equals("Dingalan")) {
			brgy.removeAllItems();
			String[] DingalanCity=  {"Abuleg", "Zone I (Poblacion)", "Zone II (Poblacion)", "Nipoo (Bulo)", "Dibaraybay", "Ditawini", "Mapalad", "Paleg", "Simbahan"};
			for(int a=0; a<DingalanCity.length;a++) {
			brgy.addItem(DingalanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora") && municipalities.getSelectedItem().equals("Dipaculao")) {
			brgy.removeAllItems();
			String[] DipaculaoCity=  {"Bayabas", "Borlongan", "Buenavista", "Calaocan", "Diamanen", "Dianed", "Diarabasin", "Dibutunan"};
			for(int a=0; a<DipaculaoCity.length;a++) {
			brgy.addItem(DipaculaoCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora") && municipalities.getSelectedItem().equals("Maria Aurora")) {
			brgy.removeAllItems();
			String[] MariaAuroraCity={"Alcala", "Bagtu", "Bangco", "Bannawag", "Barangay I (Poblacion)", "Barangay II (Poblacion)", "Barangay III (Poblacion)", "Barangay IV (Poblacion)"};
			for(int a=0; a<MariaAuroraCity.length;a++) {
			brgy.addItem(MariaAuroraCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Aurora") && municipalities.getSelectedItem().equals("San Luis")) {
			brgy.removeAllItems();
			String[] SanLuisCity= {"Bacong", "Barangay I (Poblacion)", "Barangay II (Poblacion)", "Barangay III (Poblacion)", "Barangay IV (Poblacion)", "Dibalo", "Dibayabay", "Dibut"};
			for(int a=0; a<SanLuisCity.length;a++) {
			brgy.addItem(SanLuisCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bataan") && municipalities.getSelectedItem().equals("Abucay")) {
			brgy.removeAllItems();
			String[] AbucayCity= {"Bangkal", "Calaylayan (Poblacion)", "Capitangan", "Gabon", "Laon (Poblacion)", "Mabatang", "Omboy", "Salian"};
			for(int a=0; a<AbucayCity.length;a++) {
			brgy.addItem(AbucayCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bataan") && municipalities.getSelectedItem().equals("Bagac")) {
			brgy.removeAllItems();
			String[] BagacCity=  {"Atilano L. Ricardo", "Bagumbayan (Poblacion)", "Banawang", "Binuangan", "Binukawan", "Ibaba", "Ibis", "Pag-asa (Wawa-Sibacan)"};
			for(int a=0; a<BagacCity.length;a++) {
			brgy.addItem(BagacCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bataan") && municipalities.getSelectedItem().equals("Balanga")) {
			brgy.removeAllItems();
			String[] BalangaCity=  {"Bagumbayan", "Cabog-Cabog", "Munting Batangas (Cadre)", "Cataning", "Central", "Cupang Proper", "Cupang West", "Dangcol (Bernabe)"};
			for(int a=0; a<BalangaCity.length;a++) {
			brgy.addItem(BalangaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bataan") && municipalities.getSelectedItem().equals("Dinalupihan")) {
			brgy.removeAllItems();
			String[] DinalupihanCity= {"Aquino", "Bangal", "Bayan-bayanan", "Bonifacio (Poblacion)", "Burgos (Poblacion)", "Colo", "Daang Bago", "Dalao"};
			for(int a=0; a<DinalupihanCity.length;a++) {
			brgy.addItem(DinalupihanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bataan") && municipalities.getSelectedItem().equals("Hermosa")) {
			brgy.removeAllItems();
			String[] HermosaCity= {"A. Rivera (Poblacion)", "Almacen", "Bacong", "Balsic", "Bamban", "Burgos-Soliman (Poblacion)", "Cataning (Poblacion)", "Culis"};	
			for(int a=0; a<HermosaCity.length;a++) {
			brgy.addItem(HermosaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bataan") && municipalities.getSelectedItem().equals("Limay")) {
			brgy.removeAllItems();
			String[] LimayCity=  {"Alangan", "Duale", "Kitang I", "Kitang 2 & Luz", "Lamao", "Landing", "Poblacion", "Reformista"};
			for(int a=0; a<LimayCity.length;a++) {
			brgy.addItem(LimayCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bataan") && municipalities.getSelectedItem().equals("Mariveles")) {
			brgy.removeAllItems();
			String[] MarivelesCity= {"Alas-Asin", "Alion", "Balon-Anito", "Baseco Country (Nassco)", "Batangas II", "Biaan", "Cabcaben", "Camaya"};
			for(int a=0; a<MarivelesCity.length;a++) {
			brgy.addItem(MarivelesCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bataan") && municipalities.getSelectedItem().equals("Morong")) {
			brgy.removeAllItems();
			String[] MorongCity = {"Binaritan", "Mabayo", "Nagbalayong", "Poblacion", "Sabang"};	
			for(int a=0; a<MorongCity.length;a++) {
			brgy.addItem(MorongCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan") && municipalities.getSelectedItem().equals("Angat")) {
			brgy.removeAllItems();
			String[] AngatCity ={"Banaban", "Baybay", "Binagbag", "Donacion", "Encanto", "Laog", "Marungko", "Niugan"};
			for(int a=0; a<AngatCity.length;a++) {
			brgy.addItem(AngatCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan") && municipalities.getSelectedItem().equals("Balagtas")) {
			brgy.removeAllItems();
			String[] BalagtasCity = {"Borol 1st", "Borol 2nd", "Dalig", "Longos", "Panginay", "Pulong Gubat", "San Juan", "Santol", "Wawa"};
			for(int a=0; a<BalagtasCity.length;a++) {
			brgy.addItem(BalagtasCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan") && municipalities.getSelectedItem().equals("Baliuag")) {
			brgy.removeAllItems();
			String[] BaliuagCity= {"Bagong Nayon", "Barangca", "Calantipay", "Catulinan", "Concepcion", "Hinukay", "Makinabang", "Matangtubig"};
			for(int a=0; a<BaliuagCity.length;a++) {
			brgy.addItem(BaliuagCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan") && municipalities.getSelectedItem().equals("Bocaue")) {
			brgy.removeAllItems();
			String[] BocaueCity = {"Antipona", "Bagumbayan", "Bambang", "Batia", "Biñang 1st", "Biñang 2nd", "Bolacan", "Bundukan"};
			for(int a=0; a<BocaueCity.length;a++) {
			brgy.addItem(BocaueCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan") && municipalities.getSelectedItem().equals("Bulakan")) {
			brgy.removeAllItems();
			String[] BulakanCity = {"Bagumbayan", "Balubad", "Bambang", "Matungao", "Maysantol", "Perez", "Pitpitan", "San Francisco"};
			for(int a=0; a<BulakanCity.length;a++) {
			brgy.addItem(BulakanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan") && municipalities.getSelectedItem().equals("Bustos")) {
			brgy.removeAllItems();
			String[] BustosCity  = {"Bonga Mayor", "Bonga Menor", "Buisan", "Camachilihan", "Cambaog", "Catacte", "Liciada", "Malamig"};
			for(int a=0; a<BustosCity.length;a++) {
			brgy.addItem(BustosCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan") && municipalities.getSelectedItem().equals("Calumpit")) {
			brgy.removeAllItems();
			String[] CalumpitCity = {"Balite", "Balungao", "Buguion", "Bulusan", "Calizon", "Calumpang", "Caniogan", "Corazon"};
			for(int a=0; a<CalumpitCity.length;a++) {
			brgy.addItem(CalumpitCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Bulacan") && municipalities.getSelectedItem().equals("Doña Remedios Trinidad")) {
			brgy.removeAllItems();
			String[] DoñaRemediosTrinidadCity = {"Bagumbayan", "Balubad", "Bambang", "Matungao", "Maysantol", "Perez", "Pitpitan", "San Francisco"};
			for(int a=0; a<DoñaRemediosTrinidadCity.length;a++) {
			brgy.addItem(DoñaRemediosTrinidadCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija") && municipalities.getSelectedItem().equals("Aliaga")) {
			brgy.removeAllItems();
			String[] AliagaCity = {"Betes", "Bibiclat", "Bucot", "La Purisima", "Macabucod", "Magsaysay", "Pantoc", "Poblacion Centro"};

			for(int a=0; a<AliagaCity.length;a++) {
			brgy.addItem(AliagaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija") && municipalities.getSelectedItem().equals("Bongabon")) {
			brgy.removeAllItems();
			String[] BongabonCity = {"Antipolo", "Ariendo", "Bantug", "Calaanan", "Commercial", "Cruz", "Curva", "Digmala"};
			for(int a=0; a<BongabonCity.length;a++) {
			brgy.addItem(BongabonCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija") && municipalities.getSelectedItem().equals("Cabanatuan")) {
			brgy.removeAllItems();
			String[] CabanatuanCity ={"Aduas Centro", "Aduas Norte", "Aduas Sur", "Bagong Buhay", "Bagong Sikat", "Bakero 1.03%", "Bakod Bayan", "Balite"};
			
			for(int a=0; a<CabanatuanCity.length;a++) {
			brgy.addItem(CabanatuanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija") && municipalities.getSelectedItem().equals("Cabiao")) {
			brgy.removeAllItems();
			String[] CabiaoCity = {"Bagong Buhay", "Bagong Sikat", "Bagong Silang", "Concepcion", "Entablado", "Maligaya", "Natividad North", "Natividad South"};

			for(int a=0; a<CabiaoCity.length;a++) {
			brgy.addItem(CabiaoCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija") && municipalities.getSelectedItem().equals("Carranglan")) {
			brgy.removeAllItems();
			String[] CarranglanCity = {"Bantug", "Bunga", "Burgos", "Capintalan", "D. L. Maglanoc Poblacion", "F. C. Otic Poblacion", "G. S. Rosario Poblacion", "General Luna"};

			for(int a=0; a<CarranglanCity.length;a++) {
			brgy.addItem(CarranglanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija") && municipalities.getSelectedItem().equals("Cuyapo")) {
			brgy.removeAllItems();
			String[] CuyapoCity  = {"Baloy", "Bambanaba", "Bantug", "Bentigan", "Bibiclat", "Bonifacio", "Bued", "Bulala"};

			for(int a=0; a<CuyapoCity.length;a++) {
			brgy.addItem(CuyapoCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija") && municipalities.getSelectedItem().equals("Gabaldon")) {
			brgy.removeAllItems();
			String[] GabaldonCity= {"Bagong Sikat", "Bagting", "Bantug", "Bitulok", "Bugnan", "Calabasa", "Camachile", "Cuyapa"};


			for(int a=0; a<GabaldonCity.length;a++) {
			brgy.addItem(GabaldonCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Nueva Ecija") && municipalities.getSelectedItem().equals("Gapan")) {
			brgy.removeAllItems();
			String[] GapanCity = {"Balante", "Bayanihan", "Bulak", "Bungo", "Kapalangan", "Mabunga", "Maburak", "Mahipon"};

			for(int a=0; a<GapanCity.length;a++) {
			brgy.addItem(GapanCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga") && municipalities.getSelectedItem().equals("Apalit")) {
			brgy.removeAllItems();
			String[] ApalitCity = {"Balucuc", "Calantipe", "Cansinala", "Capalangan", "Colgante", "Paligui", "Sampaloc", "San Juan"};

			for(int a=0; a<ApalitCity.length;a++) {
			brgy.addItem(ApalitCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga") && municipalities.getSelectedItem().equals("Arayat")) {
			brgy.removeAllItems();
			String[] ArayatCity  = {"Arenas", "Baliti", "Batasan", "Buensuceso", "Candating", "Cupang", "Gatiawin", "Guemasan"};
			
			for(int a=0; a<ArayatCity.length;a++) {
			brgy.addItem(ArayatCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga") && municipalities.getSelectedItem().equals("Bacolor")) {
			brgy.removeAllItems();
			String[]BacolorCity = {"Balas", "Cabalantian", "Cabambangan", "Cabetican", "Calibutbut", "Concepcion", "Dolores", "Duat"};

			for(int a=0; a<BacolorCity.length;a++) {
			brgy.addItem(BacolorCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga") && municipalities.getSelectedItem().equals("Candaba")) {
			brgy.removeAllItems();
			String[] CandabaCity = {"Bahay Pare", "Bambang", "Barangca", "Barit", "Buas", "Cuayang Bugtong", "Dalayap", "Dulong Ilog"};

			for(int a=0; a<CandabaCity.length;a++) {
			brgy.addItem(CandabaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga") && municipalities.getSelectedItem().equals("Floridablanca")) {
			brgy.removeAllItems();
			String[] FloridablancaCity  = {"Anon", "Apalit", "Basa Air Base", "Benedicto", "Bodega", "Cabangcalan", "Calantas", "Carmencita"};

			for(int a=0; a<FloridablancaCity.length;a++) {
			brgy.addItem(FloridablancaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga") && municipalities.getSelectedItem().equals("Guagua")) {
			brgy.removeAllItems();
			String[] GuaguaCity = {"Ascomo", "Bancal", "Jose Abad Santos", "Lambac", "Magsaysay", "Maquiapo", "Natividad", "Plaza Burgos"};

			for(int a=0; a<GuaguaCity.length;a++) {
			brgy.addItem(GuaguaCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga") && municipalities.getSelectedItem().equals("Lubao")) {
			brgy.removeAllItems();
			String[] LubaoCity = {"Balantacan", "Bancal Pugad", "Bancal Sinubli", "Baruya", "Calangain", "Concepcion", "De La Paz", "Del Carmen"};

			for(int a=0; a<LubaoCity.length;a++) {
			brgy.addItem(LubaoCity [a]);}	
			
		}else if(region.getSelectedItem().equals("Region III")&& province.getSelectedItem().equals("Pampanga") && municipalities.getSelectedItem().equals("Mabalacat")) {
			brgy.removeAllItems();
			String[] MabalacatCity  = {"Atlu-Bola", "Bical", "Bundagul", "Cacutud", "Calumpang", "Camachiles", "Dapdap", "Dau"};

			for(int a=0; a<MabalacatCity.length;a++) {
			brgy.addItem(MabalacatCity [a]);}	
			
		}
		
	}
	});
	
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}