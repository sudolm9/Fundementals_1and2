import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;
import javax.swing.*;

public class Week7_SimplePaintApp extends JFrame {
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	myCustomCanvas panel = new myCustomCanvas();
	Color myColors = Color.BLACK;
	Graphics2D g2;
	private String toDraw = "RECT";
	private JPanel contentPane;
	
	boolean chk = false;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Week7_SimplePaintApp frame = new Week7_SimplePaintApp();
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
	public Week7_SimplePaintApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1182, 739);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JToggleButton tglbtn_1 = new JToggleButton("Line");
		tglbtn_1.setPreferredSize(new Dimension(50, 50));
		JToggleButton tglbtn_2 = new JToggleButton("Oval");
		JToggleButton tglbtn = new JToggleButton("Rect");
		JToggleButton eraserBtn = new JToggleButton("Eraser");
		JButton clearBtn = new JButton("clear");
		
		JToggleButton redBtn = new JToggleButton("Red");
		JToggleButton blueBtn = new JToggleButton("Blue");
		
		
		
		tglbtn_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tglbtn.setSelected(false);
				tglbtn_2.setSelected(false);
				eraserBtn.setSelected(false);
				toDraw = "LINE";
			}
		});
		tglbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tglbtn_1.setSelected(false);
				tglbtn_2.setSelected(false);
				eraserBtn.setSelected(false);
				toDraw = "RECT";
			}
		});
		tglbtn_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tglbtn_1.setSelected(false);
				tglbtn.setSelected(false);
				eraserBtn.setSelected(false);
				toDraw = "OVAL";
			}
		});
		redBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				blueBtn.setSelected(false);
				myColors = Color.RED;
			}
		});
		blueBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				redBtn.setSelected(false);
				myColors = Color.BLUE;
			}
		});
		clearBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				shapes.clear();
				panel.repaint();
			}
		});
		menuBar.add(tglbtn_1);
		menuBar.add(tglbtn_2);
		menuBar.add(tglbtn);
		menuBar.add(eraserBtn);
		menuBar.add(clearBtn);
		menuBar.add(new JSeparator());
		menuBar.add(redBtn);
		menuBar.add(blueBtn);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		panel.setBounds(0, 0, this.getWidth(), this.getHeight());
		int xx, yy;
		this.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				panel.setBounds(0, 0, ((JFrame) e.getSource()).getWidth(), ((JFrame) e.getSource()).getHeight());
			}
		});
		contentPane.add(panel);
	}

	private class myCustomCanvas extends JPanel {
		
		Point startDrag, endDrag;

		public myCustomCanvas() {
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startDrag = new Point(e.getX(), e.getY());
					endDrag = startDrag;
					repaint();
				}

				public void mouseReleased(MouseEvent e) {
					if (toDraw.equals("RECT")) {
						Shape r = makeRectangle(startDrag.x, startDrag.y, e.getX(), e.getY());
						shapes.add(r);
					} else if (toDraw.equals("LINE")) {
						Shape r = makeLine(startDrag.x, startDrag.y, e.getX(), e.getY());
						shapes.add(r);
					} else {
						Shape r = makeEllipse(startDrag.x, startDrag.y, e.getX(), e.getY());
						shapes.add(r);
					}

					startDrag = null;
					endDrag = null;
					repaint();
				}
			});
			this.addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					endDrag = new Point(e.getX(), e.getY());
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			int colorIndex = 0;
			g2.setStroke(new BasicStroke(5));
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.50f));
			for (Shape s : shapes) {
				g2.setPaint(Color.BLACK);
				g2.draw(s);
				g2.setPaint(myColors);
				g2.fill(s);
			}
			if (startDrag != null && endDrag != null) {
				g2.setPaint(Color.LIGHT_GRAY);
				if (toDraw.equals("RECT")) {
					Shape r = makeRectangle(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
					g2.draw(r);
				} else if (toDraw.equals("LINE")) {
					Shape r = makeLine(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
					g2.draw(r);
				} else {
					Shape r = makeEllipse(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
					g2.draw(r);
				}
			}
		}

		private Rectangle2D.Float makeRectangle(int x1, int y1, int x2, int y2) {
			return new Rectangle2D.Float(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
		}

		private Ellipse2D.Float makeEllipse(int x1, int y1, int x2, int y2) {
			return new Ellipse2D.Float(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
		}

		private Line2D.Float makeLine(int x1, int y1, int x2, int y2) {
			return new Line2D.Float(x1, y1, x2, y2);
		}
	}
}