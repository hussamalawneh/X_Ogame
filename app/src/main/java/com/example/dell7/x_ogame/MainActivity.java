package com.example.dell7.x_ogame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button butt[]=new Button[9];
    TextView text;
    int player=1;
    int num_click=0;
    int flag=0;


    public void click(View v){
        num_click++;
     Button b=(Button)findViewById(v.getId());
     text=(TextView)findViewById(R.id.textView);
     if(player==1)
     {
         b.setText("X");
         text.setText("Secound Player(O)");
         player=2;//convert to secound player
     }
     else
     {
         b.setText("O");
         player=1;
         text.setText("First Player(X)");
     }

     check_game(player);
     b.setEnabled(false);


    }
    private void check_game(int p){
        String win;
        if(p==1)
         win="Secound Player";
        else
         win="First Player";
        TextView decide=(TextView)findViewById(R.id.textView2);
        butt[0]=(Button)findViewById(R.id.button1);
        butt[1]=(Button)findViewById(R.id.button2);
        butt[2]=(Button)findViewById(R.id.button3);
        butt[3]=(Button)findViewById(R.id.button4);
        butt[4]=(Button)findViewById(R.id.button5);
        butt[5]=(Button)findViewById(R.id.button6);
        butt[6]=(Button)findViewById(R.id.button7);
        butt[7]=(Button)findViewById(R.id.button8);
        butt[8]=(Button)findViewById(R.id.button9);


        if(butt[0].getText()!= "" && butt[0].getText()==butt[1].getText() && butt[1].getText()==butt[2].getText()){
            decide.setText(win+" Winner ");
            flag=1;
        }else
        if(butt[3].getText()!= "" && butt[3].getText()==butt[4].getText() && butt[4].getText()==butt[5].getText()){
            decide.setText(win+" Winner ");
            flag=1;
        }else
        if(butt[6].getText()!= "" && butt[6].getText()==butt[7].getText() && butt[7].getText()==butt[8].getText()){
            decide.setText(win+" Winner ");
            flag=1;
        }else
        if(butt[0].getText()!= "" && butt[0].getText()==butt[3].getText() && butt[3].getText()==butt[6].getText()){
            decide.setText(win+" Winner ");
            flag=1;
        }else
        if(butt[1].getText()!= "" && butt[1].getText()==butt[4].getText() && butt[4].getText()==butt[7].getText()){
            decide.setText(win+" Winner ");
            flag=1;
        }else
        if(butt[2].getText()!= "" && butt[2].getText()==butt[5].getText() && butt[5].getText()==butt[8].getText()){
            decide.setText(win+" Winner ");
            flag=1;
        }else
        if(butt[0].getText()!="" && butt[0].getText()==butt[4].getText() && butt[4].getText()==butt[8].getText()){
            decide.setText(win+" Winner ");
            flag=1;
        }else
        if(butt[2].getText()!="" && butt[2].getText()==butt[4].getText() && butt[4].getText()==butt[6].getText()){
            decide.setText(win+" Winner ");
            flag=1;
        }

       if(flag==1)
        {

            for(int i=0;i<butt.length;i++)
                butt[i].setEnabled(false);

            text.setText(" ");
        }
        if(num_click>8)
            if( flag==0){
                text.setText(" ");
                decide.setText("There is no Winner ");
                        }


    }

    }
