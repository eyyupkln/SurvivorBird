package com.example.survivorbird;



import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;

import java.util.Random;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class SurvivorBird extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture bachground;
    private Texture tree;
    Texture bird ;
    Texture bee1;
    Texture bee2;
    Texture bee3;

    float birdx=0;
    float birdy=0;
    int gamestate=0 ;
    float velocity =0;
    float gravity = 1.1f;
    int numberofbees= 4;
    float [] enemyx = new float[4];
    float [] enemyoffset = new float[numberofbees];
    float [] enemyoffset2 = new float[numberofbees];
    float [] enemyoffset3 = new float[numberofbees];

    Random rnd= new Random();

    float distance = 0;
    float enemyvelocity = 7;

    Circle birdcircle ;
    Circle[] enemycircle;
    Circle[] enemycircle2;
    Circle[] enemycircle3;
    int score =0;
    int scoredenemy=0;

    BitmapFont font ;
    BitmapFont font2 ;

    private Music backgroundMusic;
    @Override
    public void create() {

        backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("workout-metal-sport-11962.mp3"));
        backgroundMusic.setLooping(true);


        batch = new SpriteBatch();
        bachground= new Texture("background.png");
        tree = new Texture("tree.png");
        bird= new Texture("bird.png");
        bee1= new Texture("bee.png");
        bee2= new Texture("bee.png");
        bee3= new Texture("bee.png");


        birdx= Gdx.graphics.getWidth()/ 4;
        birdy= Gdx.graphics.getHeight()/3 +  bird.getHeight()/3.5f;


        distance= Gdx.graphics.getWidth()/ 3;


        birdcircle= new Circle();
        enemycircle= new Circle[numberofbees];
        enemycircle2= new Circle[numberofbees];
        enemycircle3= new Circle[numberofbees];

        font = new BitmapFont();
       font.setColor(Color.WHITE);
        font.getData().scale(5);

        font2 = new BitmapFont();
        font2.setColor(Color.WHITE);
        font2.getData().scale(7);

        for (int i=0;i<numberofbees; i++ ){
            enemyoffset[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;
            enemyoffset2[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;
            enemyoffset3[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;

            enemyx[i] = Gdx.graphics.getWidth() - bee1.getWidth() /2 + i * distance;


            enemycircle[i] = new Circle();
            enemycircle2[i] = new Circle();
            enemycircle3[i] = new Circle();
        }
    }

    @Override
    public void render() {

        batch.begin();

        batch.draw(bachground,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.draw(tree,290,130,140,210);
        batch.draw(tree,890,130,140,210);
        batch.draw(tree,1490,130,140,210);
        batch.draw(tree,2090,130,140,210);

        if(gamestate==1){
            backgroundMusic.play();

            if(enemyx[scoredenemy] <Gdx.graphics.getWidth()/ 4){
                score ++;
                if(scoredenemy <3){
                    scoredenemy++;
                }else{
                    scoredenemy=0;
                }
            }



            if(Gdx.input.justTouched() ){
              velocity= -20;
            }

            for(int i =0; i<numberofbees ; i++){

                if(enemyx[i] <0) {
                    enemyx[i] = enemyx[i] + numberofbees *distance;
                    enemyoffset[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;
                    enemyoffset2[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;
                    enemyoffset3[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;
                }else{
                    enemyx[i] = enemyx[i] -enemyvelocity;
                }
                batch.draw(bee1,enemyx[i],Gdx.graphics.getHeight()/2 + enemyoffset[i],Gdx.graphics.getWidth() / 15,Gdx.graphics.getHeight() / 10);
                batch.draw(bee2,enemyx[i],Gdx.graphics.getHeight()/2 + enemyoffset2[i],Gdx.graphics.getWidth() / 15,Gdx.graphics.getHeight() / 10);
                batch.draw(bee3,enemyx[i],Gdx.graphics.getHeight()/2 + enemyoffset3[i],Gdx.graphics.getWidth() / 15,Gdx.graphics.getHeight() / 10);


                enemycircle[i] = new Circle(enemyx[i] + Gdx.graphics.getWidth() / 45,Gdx.graphics.getHeight() /2  + enemyoffset[i] + Gdx.graphics.getHeight() / 30 ,Gdx.graphics.getWidth() / 60);
                enemycircle2[i] = new Circle(enemyx[i] + Gdx.graphics.getWidth() / 45,Gdx.graphics.getHeight() /2  + enemyoffset2[i] + Gdx.graphics.getHeight() / 30 ,Gdx.graphics.getWidth() / 60);
                enemycircle3[i] = new Circle(enemyx[i] + Gdx.graphics.getWidth() / 45,Gdx.graphics.getHeight() /2  + enemyoffset3[i] + Gdx.graphics.getHeight() / 30 ,Gdx.graphics.getWidth() / 60);
            }

            if(birdy >0){
                velocity= velocity + gravity;
                birdy=birdy - velocity;
            }
            else{
                gamestate=2;
            }

        }else if(gamestate==0){
            if(Gdx.input.justTouched() ){
                gamestate=1;
            }
        } else if (gamestate==2) {

            font.draw(batch,"Game Over! Tap To Play Again!",550,Gdx.graphics.getHeight()/2 + 100);
            if (backgroundMusic != null) {
                backgroundMusic.stop();
            }
            if(Gdx.input.justTouched()){
                gamestate=1;
                birdy= Gdx.graphics.getHeight()/3 +  bird.getHeight()/3.5f;

                for (int i=0;i<numberofbees; i++ ){
                    enemyoffset[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;
                    enemyoffset2[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;
                    enemyoffset3[i] = (rnd.nextFloat() - 0.5f ) * (Gdx.graphics.getHeight()-200) ;

                    enemyx[i] = Gdx.graphics.getWidth() - bee1.getWidth() /2 + i * distance;


                    enemycircle[i] = new Circle();
                    enemycircle2[i] = new Circle();
                    enemycircle3[i] = new Circle();
                }
                velocity=0;
                score=0;
                scoredenemy=0;

            }

        }


        batch.draw(bird,birdx,birdy,Gdx.graphics.getWidth() / 15,Gdx.graphics.getHeight() / 10 );
        font.draw(batch,String.valueOf(score),100,200);
        batch.end();

        birdcircle.set(birdx +Gdx.graphics.getWidth() / 45 ,birdy +Gdx.graphics.getHeight() / 30, Gdx.graphics.getWidth() / 60 );


        for(int i = 0 ; i<numberofbees; i++){

            if (Intersector.overlaps(birdcircle,enemycircle[i]) || Intersector.overlaps(birdcircle,enemycircle2[i]) ||Intersector.overlaps(birdcircle,enemycircle3[i])){
                gamestate= 2;
            }
        }
    }

    @Override
    public void dispose() {

    }
}
