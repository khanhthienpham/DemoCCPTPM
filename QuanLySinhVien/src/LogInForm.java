import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.MainMenuForm;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogInForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInForm frame = new LogInForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogInForm() {
		setTitle("Qu\u1EA3n L\u00FD Sinh Vi\u00EAn - HaUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblngNhp = new JLabel("Sinh Vi\u00EAn \u0110\u0103ng Nh\u1EADp");
		lblngNhp.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel = new JLabel("T\u00E0i kho\u1EA3n: ");
		
		JLabel lblMtKhu = new JLabel("M\u1EADt kh\u1EA9u: ");
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		
		JButton btnLogIn = new JButton("\u0110\u0103ng nh\u1EADp");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				if(username.contains("1111") && password.contains("mot")) {
					MainMenuForm info = new MainMenuForm();
					MainMenuForm.main(null);
				} else
				JOptionPane.showMessageDialog(null, "Thông tin tài khoản hoặc mật khẩu không chính xác !","Đăng nhập thất bại", JOptionPane.ERROR_MESSAGE, null);
			}
		});
		
		JButton btnExit = new JButton("Tho\u00E1t");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Exit", JOptionPane.YES_NO_OPTION, getDefaultCloseOperation(), null) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMtKhu)
								.addComponent(lblNewLabel))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtPassword)
								.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnLogIn)
							.addGap(18)
							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
					.addGap(63))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(104)
					.addComponent(lblngNhp, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(105, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblngNhp)
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMtKhu)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogIn)
						.addComponent(btnReset)
						.addComponent(btnExit))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
