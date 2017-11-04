package castro.examen_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15,card16,card17,card18,card19,card20,card21,card22,card23,card24;
    Random rd = new Random();
    int[] presionados;
    String[][] imagenes;
    String c1, c2;
    List lista = Collections.synchronizedList(new ArrayList());
    Deque<String> stack = new ArrayDeque<String>();
    int touchs, puntos, pares, openCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenes = new String[3][24];
        presionados = new int[24];
        puntos = 0;
        pares = 0;
        openCard = 0;
        c1 = "";
        c2 = "";

        for (int a=0;a<24;a++){
            int b = a;
            presionados[a] = 0;
            if(a == 13) b = a - 12;
            lista.add(a,"img" + (b + 1));
        }

        card1 = (ImageView) findViewById(R.id.btn1);
        //card1.setImageResource(R.drawable.imgdefault);
        card1.setOnClickListener(this);

        card2 = (ImageView) findViewById(R.id.btn2);
        //card2.setImageResource(R.drawable.imgdefault);
        card2.setOnClickListener(this);

        card3 = (ImageView) findViewById(R.id.btn3);
        //card3.setImageResource(R.drawable.imgdefault);
        card3.setOnClickListener(this);

        card4 = (ImageView) findViewById(R.id.btn4);
        //card4.setImageResource(R.drawable.imgdefault);
        card4.setOnClickListener(this);

        card5 = (ImageView) findViewById(R.id.btn5);
        card5.setImageResource(R.drawable.imgdefault);
        card5.setOnClickListener(this);

        card6 = (ImageView) findViewById(R.id.btn6);
        card6.setImageResource(R.drawable.imgdefault);
        card6.setOnClickListener(this);

        card7 = (ImageView) findViewById(R.id.btn7);
        card7.setImageResource(R.drawable.imgdefault);
        card7.setOnClickListener(this);

        card8 = (ImageView) findViewById(R.id.btn8);
        card8.setImageResource(R.drawable.imgdefault);
        card8.setOnClickListener(this);

        card9 = (ImageView) findViewById(R.id.btn9);
        card9.setImageResource(R.drawable.imgdefault);
        card9.setOnClickListener(this);

        card10 = (ImageView) findViewById(R.id.btn10);
        card10.setImageResource(R.drawable.imgdefault);
        card10.setOnClickListener(this);

        card11 = (ImageView) findViewById(R.id.btn11);
        card11.setImageResource(R.drawable.imgdefault);
        card11.setOnClickListener(this);

        card12 = (ImageView) findViewById(R.id.btn12);
        card12.setImageResource(R.drawable.imgdefault);
        card12.setOnClickListener(this);

        card13 = (ImageView) findViewById(R.id.btn13);
        card13.setImageResource(R.drawable.imgdefault);
        card13.setOnClickListener(this);

        card14 = (ImageView) findViewById(R.id.btn14);
        card14.setImageResource(R.drawable.imgdefault);
        card14.setOnClickListener(this);

        card15 = (ImageView) findViewById(R.id.btn15);
        card15.setImageResource(R.drawable.imgdefault);
        card15.setOnClickListener(this);

        card16 = (ImageView) findViewById(R.id.btn16);
        card16.setImageResource(R.drawable.imgdefault);
        card16.setOnClickListener(this);

        card17 = (ImageView) findViewById(R.id.btn17);
        card17.setImageResource(R.drawable.imgdefault);
        card17.setOnClickListener(this);

        card18 = (ImageView) findViewById(R.id.btn18);
        card18.setImageResource(R.drawable.imgdefault);
        card18.setOnClickListener(this);

        card19 = (ImageView) findViewById(R.id.btn19);
        card19.setImageResource(R.drawable.imgdefault);
        card19.setOnClickListener(this);

        card20 = (ImageView) findViewById(R.id.btn20);
        card20.setImageResource(R.drawable.imgdefault);
        card20.setOnClickListener(this);

        card21 = (ImageView) findViewById(R.id.btn21);
        card21.setImageResource(R.drawable.imgdefault);
        card21.setOnClickListener(this);

        card22 = (ImageView) findViewById(R.id.btn22);
        card22.setImageResource(R.drawable.imgdefault);
        card22.setOnClickListener(this);

        card23 = (ImageView) findViewById(R.id.btn23);
        card23.setImageResource(R.drawable.imgdefault);
        card23.setOnClickListener(this);

        card24 = (ImageView) findViewById(R.id.btn24);
        card24.setImageResource(R.drawable.imgdefault);
        card24.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn1:
                if(presionados[0] != 1){
                    card1.setImageResource(R.drawable.imgdefault);
                    presionados[0] = 1;
                    if(openCard <= 0) openCard = 0;
                    else openCard --;
                } else if(flip()){
                    card1.setImageResource(R.drawable.img1);
                    presionados[0] = 0;
                    openCard ++;
                }
                System.out.println(" openCard1:"+openCard);
                break;
            case R.id.btn2:
                if(presionados[1] != 1){
                    card2.setImageResource(R.drawable.imgdefault);
                    presionados[1] = 1;
                    if(openCard <= 0) openCard = 0;
                    else openCard --;
                }else if(flip()){
                    card2.setImageResource(R.drawable.img2);
                    presionados[1] = 0;
                    openCard ++;
                }
                System.out.println(" openCard2:"+openCard);
                break;
            case R.id.btn3:
                if(presionados[2] != 1){
                    card3.setImageResource(R.drawable.imgdefault);
                    presionados[2] = 1;
                    if(openCard <= 0) openCard = 0;
                    else openCard --;
                } else if(flip()){
                    card3.setImageResource(R.drawable.img3);
                    presionados[2] = 0;
                    openCard ++;
                }
                System.out.println(" openCard3:"+openCard);
                break;
            case R.id.btn4:
                if (presionados[3] != 1) {
                    card4.setImageResource(R.drawable.imgdefault);
                    presionados[3] = 1;
                    if(openCard <= 0) openCard = 0;
                    else openCard --;
                } else if(flip()) {
                    card4.setImageResource(R.drawable.img4);
                    presionados[3] = 0;
                    openCard ++;
                }
                System.out.println(" openCard4:"+openCard);
                break;
            case R.id.btn5:
                if(flip()){
                    if(presionados[4] != 1){
                        card5.setImageResource(R.drawable.imgdefault);
                        presionados[4] = 1;
                        if(openCard<0) openCard = 0;
                        else openCard --;
                    }
                    else if(touchs < 2){
                        card5.setImageResource(R.drawable.img5);
                        presionados[4] = 0;
                        openCard ++;
                    }
                }
                break;
            case R.id.btn6:
                if(presionados[5] != 1){
                    card6.setImageResource(R.drawable.imgdefault);
                    presionados[5] = 1;
                }
                else if(touchs < 2){
                    card6.setImageResource(R.drawable.img6);
                    presionados[5] = 0;
                }
                break;
            case R.id.btn7:
                if(presionados[6] != 1){
                    card7.setImageResource(R.drawable.imgdefault);
                    presionados[6] = 1;
                }
                else if(touchs < 2){
                    card7.setImageResource(R.drawable.img7);
                    presionados[6] = 0;
                }
                break;
            case R.id.btn8:
                if(presionados[7] != 1){
                    card8.setImageResource(R.drawable.imgdefault);
                    presionados[7] = 1;
                }
                else if(touchs < 2){
                    card8.setImageResource(R.drawable.img8);
                    presionados[7] = 0;
                }
                break;
            case R.id.btn9:
                if(presionados[8] != 1){
                    card9.setImageResource(R.drawable.imgdefault);
                    presionados[8] = 1;
                }
                else if(touchs < 2){
                    card9.setImageResource(R.drawable.img1);
                    presionados[8] = 0;
                }
                break;
            case R.id.btn10:
                if(presionados[9] != 1){
                    card10.setImageResource(R.drawable.imgdefault);
                    presionados[9] = 1;
                }
                else if(touchs < 2){
                    card10.setImageResource(R.drawable.img2);
                    presionados[9] = 0;
                }
                break;
            case R.id.btn11:
                if(presionados[10] != 1){
                    card11.setImageResource(R.drawable.imgdefault);
                    presionados[10] = 1;
                }
                else if(touchs < 2){
                    card11.setImageResource(R.drawable.img3);
                    presionados[10] = 0;
                }
                break;
            case R.id.btn12:
                if(presionados[11] != 1){
                    card12.setImageResource(R.drawable.imgdefault);
                    presionados[11] = 1;
                }
                else if(touchs < 2){
                    card12.setImageResource(R.drawable.img4);
                    presionados[11] = 0;
                }
                break;
            case R.id.btn13:
                if(presionados[12] != 1){
                    card13.setImageResource(R.drawable.imgdefault);
                    presionados[12] = 1;
                }
                else if(touchs < 2){
                    card13.setImageResource(R.drawable.img5);
                    presionados[12] = 0;
                }
                break;
            case R.id.btn14:
                if(presionados[13] != 1){
                    card14.setImageResource(R.drawable.imgdefault);
                    presionados[13] = 1;
                }
                else if(touchs < 2){
                    card14.setImageResource(R.drawable.img6);
                    presionados[13] = 0;
                }
                break;
            case R.id.btn15:
                if(presionados[14] != 1){
                    card15.setImageResource(R.drawable.imgdefault);
                    presionados[14] = 1;
                }
                else if(touchs < 2){
                    card15.setImageResource(R.drawable.img7);
                    presionados[14] = 0;
                }
                break;
            case R.id.btn16:
                if(presionados[15] != 1){
                    card16.setImageResource(R.drawable.imgdefault);
                    presionados[15] = 1;
                }
                else if(touchs < 2){
                    card16.setImageResource(R.drawable.img8);
                    presionados[15] = 0;
                }
                break;
            case R.id.btn17:
                if(presionados[16] != 1){
                    card17.setImageResource(R.drawable.imgdefault);
                    presionados[16] = 1;
                }
                else if(touchs < 2){
                    card17.setImageResource(R.drawable.img9);
                    presionados[15] = 0;
                }
                break;
            case R.id.btn18:
                if(presionados[17] != 1){
                    card18.setImageResource(R.drawable.imgdefault);
                    presionados[17] = 1;
                }
                else if(touchs < 2){
                    card18.setImageResource(R.drawable.img10);
                    presionados[17] = 0;
                }
                break;
            case R.id.btn19:
                if(presionados[18] != 1){
                    card19.setImageResource(R.drawable.imgdefault);
                    presionados[18] = 1;
                }
                else if(touchs < 2){
                    card19.setImageResource(R.drawable.img10);
                    presionados[18] = 0;
                }
                break;
            case R.id.btn20:
                if(presionados[19] != 1){
                    card20.setImageResource(R.drawable.imgdefault);
                    presionados[19] = 1;
                }
                else if(touchs < 2){
                    card20.setImageResource(R.drawable.img9);
                    presionados[19] = 0;
                }
                break;
            case R.id.btn21:
                if(presionados[20] != 1){
                    card21.setImageResource(R.drawable.imgdefault);
                    presionados[20] = 1;
                }
                else if(touchs < 2){
                    card21.setImageResource(R.drawable.img11);
                    presionados[20] = 0;
                }
                break;
            case R.id.btn22:
                if(presionados[21] != 1){
                    card22.setImageResource(R.drawable.imgdefault);
                    presionados[21] = 1;
                }
                else if(touchs < 2){
                    card22.setImageResource(R.drawable.img11);
                    presionados[21] = 0;
                }
                break;
            case R.id.btn23:
                if(presionados[22] != 1){
                    card23.setImageResource(R.drawable.imgdefault);
                    presionados[22] = 1;
                }
                else if(touchs < 2){
                    card23.setImageResource(R.drawable.img12);
                    presionados[22] = 0;
                }
                break;
            case R.id.btn24:
                if(presionados[23] != 1){
                    card24.setImageResource(R.drawable.imgdefault);
                    presionados[23] = 1;
                }
                else if(touchs < 2){
                    card24.setImageResource(R.drawable.img12);
                    presionados[23] = 0;
                }
                break;
        }
    }

    public boolean isPar(){
        return true;
    }

    public boolean flip(){
        if(openCard == 2) return false;
        return true;
    }

    public void randomImages(){
        if(!lista.isEmpty()){
            int size = lista.size();
            for (int a=0; a<24; a++){
                int n = rd.nextInt(size - 0) + size;
                imagenes[0][a] = lista.get(n).toString();
                lista.remove(n);
            }
        }

    }

}
