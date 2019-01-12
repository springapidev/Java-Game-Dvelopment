/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Fx1 extends Application {

    @Override
    public void start(Stage theStage) {
        theStage.setTitle( "Canvas Example" );
         
    Group root = new Group();
    Scene theScene = new Scene( root );
    theStage.setScene( theScene );
         
    Canvas canvas = new Canvas( 400, 200 );
    root.getChildren().add( canvas );
         
    GraphicsContext gc = canvas.getGraphicsContext2D();
         
    gc.setFill( Color.RED );
    gc.setStroke( Color.BLACK );
    gc.setLineWidth(2);
    Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
    gc.setFont( theFont );
    gc.fillText( "Hello, World!", 60, 50 );
    gc.strokeText( "Hello, World!", 60, 50 );
     
    Image earth = new Image( "/lady.jpg" );
    gc.drawImage( earth, 180, 100 );
         
    theStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
