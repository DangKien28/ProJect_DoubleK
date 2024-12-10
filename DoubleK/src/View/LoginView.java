package ProjectFE;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public LoginView() {
        setTitle("Đăng Nhập");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");

        txtUsername = new JTextField();
        txtPassword = new JPasswordField();

        JButton btnLogin = new JButton("Đăng Nhập");
        JButton btnExit = new JButton("Thoát");


        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnExit);

        add(panel);


        btnLogin.addActionListener(_ -> handleLogin());


        btnExit.addActionListener(_ -> System.exit(0));
    }

    private void handleLogin() {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());


        if ("admin".equals(username) && "123456".equals(password)) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
            this.dispose(); // Đóng cửa sổ đăng nhập

            SwingUtilities.invokeLater(() -> new TransactionView().setVisible(true)); // Mở giao diện chính
        } else {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginView().setVisible(true));
    }
}
