package com.hokumus.estate.main.java.ui.user;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.hokumus.estate.main.java.dao.member.MemberDAO;
import com.hokumus.estate.main.java.model.Member;
import com.hokumus.estate.main.java.ui.common.MainFrame;
import com.hokumus.estate.main.java.util.Utils;

import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

public class UserLogin extends JFrame {
	private JLabel lblkadi;
	private JLabel lblifre;
	private JTextField txtUserName;
	private JPasswordField txtPasword;
	private JButton btnCancel;
	private JButton btnLogin;

	public UserLogin() {
		initialize();
		initConnections();
	}

	private void initConnections() {

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getTxtUserName().getText().equals(""))
				{
					JOptionPane.showMessageDialog(UserLogin.this, "Kullanýcý Adý Boþ Geçilemez");
					return;
				}
				else if(getTxtPasword().getText().equals("")){
					JOptionPane.showMessageDialog(UserLogin.this, "Þifre Boþ Geçilemez");
					return;				
				}
				MemberDAO dao = new MemberDAO();
				
				Member temp = new Member();
				temp.setUsername(getTxtUserName().getText());
				temp.setPasword(getTxtPasword().getText());
				List<Member> liste =dao.ara(temp);
				if(liste.size()>0) {
					
					Member m =liste.get(0);
					Utils.loginedUser = m;
					MainFrame mf = new MainFrame();
					mf.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(UserLogin.this, "Böyle Bir Kullanýcý Bulunamadý..!!!");
					return;
				}
			}
		});

		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	private void initialize() {
		setTitle(" Emlak Uygulamasý Giriþ Ekraný ");
		setBounds(100, 100, 447, 259);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getLblkadi());
		getContentPane().add(getLblifre());
		getContentPane().add(getTxtUserName());
		getContentPane().add(getTxtPasword());
		getContentPane().add(getBtnCancel());
		getContentPane().add(getBtnLogin());

	}

	private JLabel getLblkadi() {
		if (lblkadi == null) {
			lblkadi = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
			lblkadi.setBounds(75, 52, 88, 14);
		}
		return lblkadi;
	}

	private JLabel getLblifre() {
		if (lblifre == null) {
			lblifre = new JLabel("\u015Eifre");
			lblifre.setBounds(75, 83, 88, 14);
		}
		return lblifre;
	}

	private JTextField getTxtUserName() {
		if (txtUserName == null) {
			txtUserName = new JTextField();
			txtUserName.setBounds(196, 49, 154, 20);
			txtUserName.setColumns(10);
		}
		return txtUserName;
	}

	private JPasswordField getTxtPasword() {
		if (txtPasword == null) {
			txtPasword = new JPasswordField();
			txtPasword.setBounds(196, 80, 154, 20);
		}
		return txtPasword;
	}

	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("\u0130ptal");
			btnCancel.setBounds(75, 133, 89, 23);
		}
		return btnCancel;
	}

	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Giri\u015F");
			btnLogin.setBounds(261, 133, 89, 23);
		}
		return btnLogin;
	}
}
