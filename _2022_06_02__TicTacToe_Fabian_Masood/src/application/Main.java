package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Main extends Application {

	private Scene game;
	private Scene leaderBoard;
	private Image imO = new Image("/Images/O.png");
	private Image imX = new Image("/Images/x.png");
	boolean spieler = true;
	byte fd1 = 0;
	byte fd2 = 0;
	byte fd3 = 0;
	byte fd4 = 0;
	byte fd5 = 0;
	byte fd6 = 0;
	byte fd7 = 0;
	byte fd8 = 0;
	byte fd9 = 0;
	boolean gewonnen = false;
	boolean spieler1 = false;
	boolean spieler2 = false;
	Label spielZug = new Label();
	
	Connection conn;

	@Override
	public void start(Stage primaryStage) throws SQLException {
		game = buildFirstScene(primaryStage);
		leaderBoard = buildsecondScene(primaryStage);
		primaryStage.setTitle("TicTacToe");
		primaryStage.setScene(game);
		primaryStage.show();

		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/TicTacToe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "root");


	}

	private Scene buildFirstScene(Stage primaryStage) throws SQLException {
		StackPane root = new StackPane();
		primaryStage.setTitle("TicTacToe");
		Button b1 = new Button();
		b1.setMinSize(175, 175);
		Button b2 = new Button();
		b2.setMinSize(175, 175);
		Button b3 = new Button();
		b3.setMinSize(175, 175);
		Button b4 = new Button();
		b4.setMinSize(175, 175);
		Button b5 = new Button();
		b5.setMinSize(175, 175);
		Button b6 = new Button();
		b6.setMinSize(175, 175);
		Button b7 = new Button();
		b7.setMinSize(175, 175);
		Button b8 = new Button();
		b8.setMinSize(175, 175);
		Button b9 = new Button();
		b9.setMinSize(175, 175);

		Button reset = new Button("Reset");
		reset.setMinSize(175, 87.5);
		Button lb = new Button("Leaderboard");
		lb.setMinSize(175, 87.5);
		VBox v = new VBox(lb, reset);

		GridPane gp = new GridPane();
		gp.add(b1, 0, 0);
		gp.add(b2, 1, 0);
		gp.add(b3, 2, 0);
		gp.add(spielZug, 3, 0);
		gp.add(b4, 0, 1);
		gp.add(b5, 1, 1);
		gp.add(b6, 2, 1);
		gp.add(b7, 0, 2);
		gp.add(b8, 1, 2);
		gp.add(b9, 2, 2);
		gp.add(v, 3, 2);

		if (spieler = true) {
			spielZug.setText("Spieler 1");
		}

		lb.setOnAction((ActionEvent e) -> {
			primaryStage.setTitle("Leaderboard");
			primaryStage.setScene(leaderBoard);
		});

		if (gewonnen == false) {
			b1.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd1 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b1.setGraphic(ivO);
					spieler = false;
					fd1 = 1;
					spiel();
				} else if (spieler == false && fd1 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b1.setGraphic(ivX);
					spieler = true;
					fd1 = 2;
					spiel();
				}
			});
			b2.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd2 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b2.setGraphic(ivO);
					spieler = false;
					fd2 = 1;
					spiel();
				} else if (spieler == false && fd2 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b2.setGraphic(ivX);
					spieler = true;
					fd2 = 2;
					spiel();
				}
			});
			b3.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd3 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b3.setGraphic(ivO);
					spieler = false;
					fd3 = 1;
					spiel();
				} else if (spieler == false && fd3 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b3.setGraphic(ivX);
					spieler = true;
					fd3 = 2;
					spiel();
				}
			});
			b4.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd4 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b4.setGraphic(ivO);
					spieler = false;
					fd4 = 1;
					spiel();
				} else if (spieler == false && fd4 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b4.setGraphic(ivX);
					spieler = true;
					fd4 = 2;
					spiel();
				}
			});
			b5.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd5 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b5.setGraphic(ivO);
					spieler = false;
					fd5 = 1;
					spiel();
				} else if (spieler == false && fd5 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b5.setGraphic(ivX);
					spieler = true;
					fd5 = 2;
					spiel();
				}
			});
			b6.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd6 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b6.setGraphic(ivO);
					spieler = false;
					fd6 = 1;
					spiel();
				} else if (spieler == false && fd6 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b6.setGraphic(ivX);
					spieler = true;
					fd6 = 2;
					spiel();
				}
			});
			b7.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd7 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b7.setGraphic(ivO);
					spieler = false;
					fd7 = 1;
					spiel();
				} else if (spieler == false && fd7 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b7.setGraphic(ivX);
					spieler = true;
					fd7 = 2;
					spiel();
				}
			});
			b8.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd8 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b8.setGraphic(ivO);
					spieler = false;
					fd8 = 1;
					spiel();
				} else if (spieler == false && fd8 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b8.setGraphic(ivX);
					spieler = true;
					fd8 = 2;
					spiel();
				}
			});
			b9.setOnAction((ActionEvent e) -> {
				if (spieler == true && fd9 == 0) {
					spielZug.setText("Spieler 2");
					ImageView ivO = new ImageView(imO);
					b9.setGraphic(ivO);
					spieler = false;
					fd9 = 1;
					spiel();
				} else if (spieler == false && fd9 == 0) {
					spielZug.setText("Spieler 1");
					ImageView ivX = new ImageView(imX);
					b9.setGraphic(ivX);
					spieler = true;
					fd9 = 2;
					spiel();
				}
			});

		} 
		else {
			if (spieler1 == true) {
//				PreparedStatement stmt = conn.prepareStatement("UPDATE leaderboard SET gewonneneRunden = gewonneneRunden + 1 where id = 1");
//				stmt.executeUpdate();
//				stmt.close();
				Statement stm = conn.createStatement();
				String sql = "UPDATE leaderboard set gewonneneRunden = gewonneneRunden + 1 where id = 1";
				stm.executeUpdate(sql);
				stm.close();
			} else if (spieler2 == true) {
//				PreparedStatement stmt = conn.prepareStatement("UPDATE leaderboard SET gewonneneRunden = gewonneneRunden + 1 where id = 2");
//				stmt.executeUpdate();
//				stmt.close();
				Statement stm2 = conn.createStatement();
				String sql = "UPDATE leaderboard set gewonneneRunden = gewonneneRunden + 1 where id = 2";
				stm2.executeUpdate(sql);
				stm2.close();
			}
		}

		reset.setOnAction((ActionEvent e) -> {
			b1.setGraphic(null);
			b2.setGraphic(null);
			b3.setGraphic(null);
			b4.setGraphic(null);
			b5.setGraphic(null);
			b6.setGraphic(null);
			b7.setGraphic(null);
			b8.setGraphic(null);
			b9.setGraphic(null);
			fd1 = 0;
			fd2 = 0;
			fd3 = 0;
			fd4 = 0;
			fd5 = 0;
			fd6 = 0;
			fd7 = 0;
			fd8 = 0;
			fd9 = 0;
			spieler = true;
			spielZug.setText("Spieler 1");
			spieler1 = false;
			spieler2 = false;
		});

		root.getChildren().add(gp);
		return new Scene(root, 800, 525);
	}

	private Scene buildsecondScene(Stage primaryStage) {
		StackPane root = new StackPane();

		TextArea ta = new TextArea();
		ta.setEditable(false);
		ta.setMinSize(350, 475);
		ta.setLayoutX(0);
		ta.setLayoutY(0);

		Button b = new Button("Back to Game");
		b.setMinSize(175, 50);

		VBox vb = new VBox(ta, b);

		b.setOnAction((ActionEvent e) -> {
			primaryStage.setTitle("TicTacToe");
			primaryStage.setScene(game);
		});
		root.getChildren().add(vb);
		return new Scene(root, 800, 525);
	}

	public static void main(String[] args) {
		launch(args);
	}

	void spiel() {
		if ((fd1 == 1 && fd2 == 1 && fd3 == 1) || (fd4 == 1 && fd5 == 1 && fd6 == 1)
				|| (fd7 == 1 && fd8 == 1 && fd9 == 1) || (fd1 == 1 && fd4 == 1 && fd7 == 1)
				|| (fd2 == 1 && fd5 == 1 && fd8 == 1) || (fd3 == 1 && fd6 == 1 && fd9 == 1)
				|| (fd1 == 1 && fd5 == 1 && fd9 == 1) || (fd3 == 1 && fd5 == 1 && fd7 == 1)) {
			spielZug.setText("SPIELER 1 HAT GEWONNEN");
			gewonnen = true;
			spieler1 = true;
		} else if (fd1 == 2 && fd2 == 2 && fd3 == 2 || fd4 == 2 && fd5 == 2 && fd6 == 2
				|| fd7 == 2 && fd8 == 2 && fd9 == 2 || fd1 == 2 && fd4 == 2 && fd7 == 2
				|| fd2 == 2 && fd5 == 2 && fd8 == 2 || fd3 == 2 && fd6 == 2 && fd9 == 2
				|| fd1 == 2 && fd5 == 2 && fd9 == 2 || fd3 == 2 && fd5 == 2 && fd7 == 2) {
			spielZug.setText("SPIELER 2 HAT GEWONNEN");
			gewonnen = true;
			spieler2 = true;
		} else if ((fd1 == 2 || fd1 == 1) && (fd2 == 2 || fd2 == 1) && (fd3 == 2 || fd3 == 1) && (fd4 == 2 || fd4 == 1)
				&& (fd5 == 2 || fd5 == 1) && (fd6 == 2 || fd6 == 1) && (fd7 == 2 || fd7 == 1) && (fd8 == 2 || fd8 == 1)
				&& (fd9 == 2 || fd9 == 1)) {
			spielZug.setText("UNENTSCHIEDEN");
			gewonnen = true;
		}
	}
}


//package application;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.stage.Stage;
//import javafx.stage.StageBuilder;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//
//public class Main extends Application {
//
//	Connection conn;
//
//	Button feld1 = new Button();
//	Button feld2 = new Button();
//	Button feld3 = new Button();
//	Button feld4 = new Button();
//	Button feld5 = new Button();
//	Button feld6 = new Button();
//	Button feld7 = new Button();
//	Button feld8 = new Button();
//	Button feld9 = new Button();
//
//	Button clr = new Button("CLR");
//	Button history = new Button("HISTORY");
//
//	Label spielZug = new Label();
//	Label text = new Label();
//	
//
//	String imgNameO = "graphic/O.png";
//	Image imO = new Image(imgNameO);
//	String imgNameX = "graphic/x.png";
//	Image imX = new Image(imgNameX);
//
//	boolean spieler = true;
//	byte fd1 = 0;
//	byte fd2 = 0;
//	byte fd3 = 0;
//	byte fd4 = 0;
//	byte fd5 = 0;
//	byte fd6 = 0;
//	byte fd7 = 0;
//	byte fd8 = 0;
//	byte fd9 = 0;
//	boolean gewonnen = false;
//	boolean spieler1 = false;
//	boolean spieler2 = false;
//
//	BorderPane root = new BorderPane();
//
//	@Override
//	public void start(Stage primaryStage) throws SQLException {
//		conn = DriverManager.getConnection(
//				"jdbc:mysql://localhost/tictactoe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
//				"root", "root");
//		try {
//			spielZug.setMinSize(200, 40);
//			root.setTop(spielZug);
//			text.setMinSize(600,0);
//			root.setBottom(text);
//
//			GridPane feld = new GridPane();
//			feld1.setPrefSize(175, 175);
//			feld.add(feld1, 0, 0);
//			feld2.setPrefSize(175, 175);
//			feld.add(feld2, 0, 1);
//			feld3.setPrefSize(175, 175);
//			feld.add(feld3, 0, 2);
//			feld4.setPrefSize(175, 175);
//			feld.add(feld4, 1, 0);
//			feld5.setPrefSize(175, 175);
//			feld.add(feld5, 1, 1);
//			feld6.setPrefSize(175, 175);
//			feld.add(feld6, 1, 2);
//			feld7.setPrefSize(175, 175);
//			feld.add(feld7, 2, 0);
//			feld8.setPrefSize(175, 175);
//			feld.add(feld8, 2, 1);
//			feld9.setPrefSize(175, 175);
//			feld.add(feld9, 2, 2);
//
//			root.setCenter(feld);
//
//			VBox hb = new VBox();
//			clr.setMinSize(70, 50);
//			history.setMinSize(70,50);
//			hb.getChildren().addAll(clr,history);
//			
//			root.setRight(hb);
//
//			if (spieler == true) {
//				spielZug.setText("Spieler 1");
//			}
//
//			clr.setOnAction((ActionEvent e) -> {
//				feldCLR();
//			});
//
//			if (gewonnen == false) {
//				feld1.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd1 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld1.setGraphic(ivO);
//						spieler = false;
//						fd1 = 1;
//						spiel();
//					} else if (spieler == false && fd1 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld1.setGraphic(ivX);
//						spieler = true;
//						fd1 = 2;
//						spiel();
//					}
//				});
//				feld2.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd2 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld2.setGraphic(ivO);
//						spieler = false;
//						fd2 = 1;
//						spiel();
//					} else if (spieler == false && fd2 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld2.setGraphic(ivX);
//						spieler = true;
//						fd2 = 2;
//						spiel();
//					}
//				});
//				feld3.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd3 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld3.setGraphic(ivO);
//						spieler = false;
//						fd3 = 1;
//						spiel();
//					} else if (spieler == false && fd3 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld3.setGraphic(ivX);
//						spieler = true;
//						fd3 = 2;
//						spiel();
//					}
//				});
//				feld4.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd4 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld4.setGraphic(ivO);
//						spieler = false;
//						fd4 = 1;
//						spiel();
//					} else if (spieler == false && fd4 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld4.setGraphic(ivX);
//						spieler = true;
//						fd4 = 2;
//						spiel();
//					}
//				});
//				feld5.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd5 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld5.setGraphic(ivO);
//						spieler = false;
//						fd5 = 1;
//						spiel();
//					} else if (spieler == false && fd5 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld5.setGraphic(ivX);
//						spieler = true;
//						fd5 = 2;
//						spiel();
//					}
//				});
//				feld6.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd6 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld6.setGraphic(ivO);
//						spieler = false;
//						fd6 = 1;
//						spiel();
//					} else if (spieler == false && fd6 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld6.setGraphic(ivX);
//						spieler = true;
//						fd6 = 2;
//						spiel();
//					}
//				});
//				feld7.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd7 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld7.setGraphic(ivO);
//						spieler = false;
//						fd7 = 1;
//						spiel();
//					} else if (spieler == false && fd7 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld7.setGraphic(ivX);
//						spieler = true;
//						fd7 = 2;
//						spiel();
//					}
//				});
//				feld8.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd8 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld8.setGraphic(ivO);
//						spieler = false;
//						fd8 = 1;
//						spiel();
//					} else if (spieler == false && fd8 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld8.setGraphic(ivX);
//						spieler = true;
//						fd8 = 2;
//						spiel();
//					}
//				});
//				feld9.setOnAction((ActionEvent e) -> {
//					if (spieler == true && fd9 == 0) {
//						spielZug.setText("Spieler 2");
//						ImageView ivO = new ImageView(imO);
//						feld9.setGraphic(ivO);
//						spieler = false;
//						fd9 = 1;
//						spiel();
//					} else if (spieler == false && fd9 == 0) {
//						spielZug.setText("Spieler 1");
//						ImageView ivX = new ImageView(imX);
//						feld9.setGraphic(ivX);
//						spieler = true;
//						fd9 = 2;
//						spiel();
//					}
//				});
//			} else {
//				if(spieler1 == true)
//				{
//					PreparedStatement stmt = conn.prepareStatement("UPDATE history SET gewonneneRunden = gewonneneRunden + 1 where id = 1");
//					stmt.executeUpdate();
//					stmt.close();
//				}
//				else if(spieler2 == true)
//				{
//					PreparedStatement stmt = conn.prepareStatement("UPDATE history SET gewonneneRunden = gewonneneRunden + 1 where id = 2");
//					stmt.executeUpdate();
//					stmt.close();
//				}
//			}
//			
//
//			Scene scene = new Scene(root, 600, 620);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//			
////				Scene scene2 = new Scene(root, 300, 400);
////				scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
////				primaryStage.setScene(scene2);
////				primaryStage.show();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//
//	void spiel() {
//		if ((fd1 == 1 && fd2 == 1 && fd3 == 1) || (fd4 == 1 && fd5 == 1 && fd6 == 1)
//				|| (fd7 == 1 && fd8 == 1 && fd9 == 1) || (fd1 == 1 && fd4 == 1 && fd7 == 1)
//				|| (fd2 == 1 && fd5 == 1 && fd8 == 1) || (fd3 == 1 && fd6 == 1 && fd9 == 1)
//				|| (fd1 == 1 && fd5 == 1 && fd9 == 1) || (fd3 == 1 && fd5 == 1 && fd7 == 1)) {
//			spielZug.setText("SPIELER 1 HAT GEWONNEN");
//			gewonnen = true;
//			spieler1 = true;
//		} else if (fd1 == 2 && fd2 == 2 && fd3 == 2 || fd4 == 2 && fd5 == 2 && fd6 == 2
//				|| fd7 == 2 && fd8 == 2 && fd9 == 2 || fd1 == 2 && fd4 == 2 && fd7 == 2
//				|| fd2 == 2 && fd5 == 2 && fd8 == 2 || fd3 == 2 && fd6 == 2 && fd9 == 2
//				|| fd1 == 2 && fd5 == 2 && fd9 == 2 || fd3 == 2 && fd5 == 2 && fd7 == 2) {
//			spielZug.setText("SPIELER 2 HAT GEWONNEN");
//			gewonnen = true;
//			spieler2 = true;
//		} else if ((fd1 == 2 || fd1 == 1) && (fd2 == 2 || fd2 == 1) && (fd3 == 2 || fd3 == 1) && (fd4 == 2 || fd4 == 1)
//				&& (fd5 == 2 || fd5 == 1) && (fd6 == 2 || fd6 == 1) && (fd7 == 2 || fd7 == 1) && (fd8 == 2 || fd8 == 1)
//				&& (fd9 == 2 || fd9 == 1)) {
//			spielZug.setText("UNENTSCHIEDEN");
//			gewonnen = true;
//		}
//	}
//
//	void feldCLR() {
//		feld1.setGraphic(null);
//		fd1 = 0;
//		feld2.setGraphic(null);
//		fd2 = 0;
//		feld3.setGraphic(null);
//		fd3 = 0;
//		feld4.setGraphic(null);
//		fd4 = 0;
//		feld5.setGraphic(null);
//		fd5 = 0;
//		feld6.setGraphic(null);
//		fd6 = 0;
//		feld7.setGraphic(null);
//		fd7 = 0;
//		feld8.setGraphic(null);
//		fd8 = 0;
//		feld9.setGraphic(null);
//		fd9 = 0;
//		spieler = true;
//		spielZug.setText("Spieler 1");
//		spieler1 = false;
//		spieler2 = false;
//	}
//	
////	public String ausgabe() throws SQLException
////	{
////		Statement stmt = conn.createStatement();
////		ResultSet rs = stmt.executeQuery("SELECT name, gewonneneRunden FROM history");
////		String a = "";
////		while (rs.next()) {
////			String name = rs.getString("name");
////			String rundengewonnen = rs.getString("gewonneneRunden");
////			a = name + " : " + rundengewonnen;
////		}
////		rs.close();
////		stmt.close();
////		return a;
////	}
//
//}
