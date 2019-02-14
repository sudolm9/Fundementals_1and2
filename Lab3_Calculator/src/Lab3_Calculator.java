import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.*;



public class Lab3_Calculator {
	public static void main(String[] args) {
		JFrame jfrm = new JFrame("Text Calc");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setLayout(null);
		JTextField txtfld = new JTextField("");
		txtfld.setBounds(10, 10, 200, 50);
		final JLabel jlbl = new JLabel();
		jlbl.setBounds(10, 80, 200, 50);
		txtfld.addKeyListener(new KeyAdapter() {

			public void keyReleased(KeyEvent e) {
				int num1, num2, answer = 0;
				super.keyReleased(e);
				String str1 = txtfld.getText();
				if (e.getKeyChar() == '=') {

					String numEqStr = str1.split("=")[0];
					if (numEqStr.contains("+")) {
						num1 = Integer.parseInt(numEqStr.split("\\+")[0]);
						num2= Integer.parseInt(numEqStr.split("\\+")[1]);
						answer = num1 + num2;
					}else if (numEqStr.contains("-")) {
							num1 = Integer.parseInt(numEqStr.split("\\-")[0]);
							num2 = Integer.parseInt(numEqStr.split("\\-")[1]);
							answer = num1 - num2;
					} else if (numEqStr.contains("/")) {
						num1 = Integer.parseInt(numEqStr.split("\\/")[0]);
						num2 = Integer.parseInt(numEqStr.split("\\/")[1]);
						answer = num1 / num2;
					} else if (numEqStr.contains("*")) {
						num1 = Integer.parseInt(numEqStr.split("\\*")[0]);
						num2 = Integer.parseInt(numEqStr.split("\\*")[1]);
						answer = num1 * num2;

					}
					jlbl.setText(str1 + answer);

				}

			}

		});
		jfrm.getContentPane().add(txtfld);
		jfrm.getContentPane().add(jlbl);
		jfrm.setSize(325, 200);
		jfrm.setVisible(true);
	}
}
