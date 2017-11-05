package castro.examen_b;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15,card16,card17,card18,card19,card20,card21,card22,card23,card24;
    Button btInicio, btAgain;
    TextView txPares;
    Random rd = new Random();
    int[] presionados,c1, c2;
    int pares, openCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txPares = (TextView) findViewById(R.id.total_pares);

        btAgain = (Button) findViewById(R.id.bt_again);
        btAgain.setOnClickListener(this);

        card1 = (ImageView) findViewById(R.id.btn1);
        card1.setOnClickListener(this);

        card2 = (ImageView) findViewById(R.id.btn2);
        card2.setOnClickListener(this);

        card3 = (ImageView) findViewById(R.id.btn3);
        card3.setOnClickListener(this);

        card4 = (ImageView) findViewById(R.id.btn4);
        card4.setOnClickListener(this);

        card5 = (ImageView) findViewById(R.id.btn5);
        card5.setOnClickListener(this);

        card6 = (ImageView) findViewById(R.id.btn6);
        card6.setOnClickListener(this);

        card7 = (ImageView) findViewById(R.id.btn7);
        card7.setOnClickListener(this);

        card8 = (ImageView) findViewById(R.id.btn8);
        card8.setOnClickListener(this);

        card9 = (ImageView) findViewById(R.id.btn9);
        card9.setOnClickListener(this);

        card10 = (ImageView) findViewById(R.id.btn10);
        card10.setOnClickListener(this);

        card11 = (ImageView) findViewById(R.id.btn11);
        card11.setOnClickListener(this);

        card12 = (ImageView) findViewById(R.id.btn12);
        card12.setOnClickListener(this);

        card13 = (ImageView) findViewById(R.id.btn13);
        card13.setOnClickListener(this);

        card14 = (ImageView) findViewById(R.id.btn14);
        card14.setOnClickListener(this);

        card15 = (ImageView) findViewById(R.id.btn15);
        card15.setOnClickListener(this);

        card16 = (ImageView) findViewById(R.id.btn16);
        card16.setOnClickListener(this);

        card17 = (ImageView) findViewById(R.id.btn17);
        card17.setOnClickListener(this);

        card18 = (ImageView) findViewById(R.id.btn18);
        card18.setOnClickListener(this);

        card19 = (ImageView) findViewById(R.id.btn19);
        card19.setOnClickListener(this);

        card20 = (ImageView) findViewById(R.id.btn20);
        card20.setOnClickListener(this);

        card21 = (ImageView) findViewById(R.id.btn21);
        card21.setOnClickListener(this);

        card22 = (ImageView) findViewById(R.id.btn22);
        card22.setOnClickListener(this);

        card23 = (ImageView) findViewById(R.id.btn23);
        card23.setOnClickListener(this);

        card24 = (ImageView) findViewById(R.id.btn24);
        card24.setOnClickListener(this);
        reset();
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn1:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[0] == 1){ //esta volteada o abierta

                        System.out.println(" msg volteo carta 1 en dafult");
                        card1.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[0] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;

                    }else if(presionados[0] == 3 || presionados[0] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 1");
                        card1.setImageResource(R.drawable.img1);
                        presionados[0] = 1; //se abre carta
                        setAuxCard(1,0);    //card img#, id_btn[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" msg openCard1:"+openCard +" presionados:"+presionados[0]);
                break;
            case R.id.btn2:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[1] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 2 en dafult");
                        card2.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[1] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[1] == 3 || presionados[1] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 2");
                        card2.setImageResource(R.drawable.img1);
                        presionados[1] = 1; //se abre carta
                        setAuxCard(1,1);    //card img#, id_btn[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" msg openCard2:"+openCard +" presionados:"+presionados[1]);
                break;
            case R.id.btn3:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[2] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 3 en default");
                        card3.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[2] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[2] == 3 || presionados[2] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 3");
                        card3.setImageResource(R.drawable.img2);
                        presionados[2] = 1; //se abre carta
                        setAuxCard(2,2); //card img#, id_btn[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" msg openCard3:"+openCard +" presionados:"+presionados[2]);
                break;
            case R.id.btn4:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[3] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 4 en default");
                        card4.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[3] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[3] == 3 || presionados[3] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 4");
                        card4.setImageResource(R.drawable.img2);
                        presionados[3] = 1; //se abre carta
                        setAuxCard(2,3); //card img#, id_btn[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard4:"+openCard +" presionados:"+presionados[3]);
                break;
            case R.id.btn5:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[4] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 5 en default");
                        card5.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[4] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[4] == 3 || presionados[4] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 5");
                        card5.setImageResource(R.drawable.img4);
                        presionados[4] = 1; //se abre carta
                        setAuxCard(4,4); //card img#, id_btn[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard5:"+openCard +" presionados:"+presionados[4]);
                break;
            case R.id.btn6:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[5] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 6 en default");
                        card6.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[5] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[5] == 3 || presionados[5] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 6");
                        card6.setImageResource(R.drawable.img5);
                        presionados[5] = 1; //se abre carta
                        setAuxCard(5,5); //card img#, id_btn[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard6:"+openCard +" presionados:"+presionados[5]);
                break;
            case R.id.btn7:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[6] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 7 en default");
                        card7.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[6] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[6] == 3 || presionados[6] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 7");
                        card7.setImageResource(R.drawable.img6);
                        presionados[6] = 1; //se abre carta
                        setAuxCard(6,6); //card img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard7:"+openCard +" presionados:"+presionados[6]);
                break;
            case R.id.btn8:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[7] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 8 en default");
                        card8.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[7] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[7] == 3 || presionados[7] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 8");
                        card8.setImageResource(R.drawable.img7);
                        presionados[7] = 1; //se abre carta
                        setAuxCard(7,7); //card img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard8:"+openCard +" presionados:"+presionados[7]);
                break;
            case R.id.btn9:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[8] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 9 en default");
                        card9.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[8] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[8] == 3 || presionados[8] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 9");
                        card9.setImageResource(R.drawable.img8);
                        presionados[8] = 1; //se abre carta
                        setAuxCard(8,8); //card img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard9:"+openCard +" presionados:"+presionados[8]);
                break;
            case R.id.btn10:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[9] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 10 en default");
                        card10.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[9] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[9] == 3 || presionados[9] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 10");
                        card10.setImageResource(R.drawable.img3);
                        presionados[9] = 1; //se abre carta
                        setAuxCard(3,9); //card img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard10:"+openCard +" presionados:"+presionados[9]);
                break;
            case R.id.btn11:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[10] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 11 en default");
                        card11.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[10] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[10] == 3 || presionados[10] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 11");
                        card11.setImageResource(R.drawable.img9);
                        presionados[10] = 1; //se abre carta
                        setAuxCard(9,10); //card img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard11:"+openCard +" presionados:"+presionados[10]);
                break;
            case R.id.btn12:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[11] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 12 en default");
                        card12.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[11] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[11] == 3 || presionados[11] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 12");
                        card12.setImageResource(R.drawable.img10);
                        presionados[11] = 1; //se abre carta
                        setAuxCard(10,11); //card img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard12:"+openCard +" presionados:"+presionados[11]);
                break;
            case R.id.btn13:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[12] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 13 en default");
                        card13.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[12] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[12] == 3 || presionados[12] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 13");
                        card13.setImageResource(R.drawable.img11);
                        presionados[12] = 1; //se abre carta
                        setAuxCard(11,12);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard13:"+openCard +" presionados:"+presionados[12]);
                break;
            case R.id.btn14:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[13] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 14 en default");
                        card14.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[13] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[13] == 3 || presionados[13] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 14");
                        card14.setImageResource(R.drawable.img12);
                        presionados[13] = 1; //se abre carta
                        setAuxCard(12,13);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard14:"+openCard +" presionados:"+presionados[13]);
                break;
            case R.id.btn15:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[14] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 15 en default");
                        card15.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[14] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[14] == 3 || presionados[14] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 15");
                        card15.setImageResource(R.drawable.img3);
                        presionados[14] = 1; //se abre carta
                        setAuxCard(3,14);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard15:"+openCard +" presionados:"+presionados[14]);
                break;
            case R.id.btn16:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[15] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 16 en default");
                        card16.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[15] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[15] == 3 || presionados[15] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 16");
                        card16.setImageResource(R.drawable.img4);
                        presionados[15] = 1; //se abre carta
                        setAuxCard(4,15);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard16:"+openCard +" presionados:"+presionados[15]);
                break;
            case R.id.btn17:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[16] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 17 en default");
                        card17.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[16] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[16] == 3 || presionados[16] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 17");
                        card17.setImageResource(R.drawable.img5);
                        presionados[16] = 1; //se abre carta
                        setAuxCard(5,16);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard17:"+openCard +" presionados:"+presionados[16]);
                break;
            case R.id.btn18:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[17] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 18 en default");
                        card18.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[17] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[17] == 3 || presionados[17] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 18");
                        card18.setImageResource(R.drawable.img6);
                        presionados[17] = 1; //se abre carta
                        setAuxCard(6,17);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard18:"+openCard +" presionados:"+presionados[17]);
                break;
            case R.id.btn19:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[18] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 19 en default");
                        card19.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[18] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[18] == 3 || presionados[18] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 19");
                        card19.setImageResource(R.drawable.img7);
                        presionados[18] = 1; //se abre carta
                        setAuxCard(7,18);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard19:"+openCard +" presionados:"+presionados[18]);
                break;
            case R.id.btn20:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[19] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 20 en default");
                        card20.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[19] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[19] == 3 || presionados[19] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 20");
                        card20.setImageResource(R.drawable.img8);
                        presionados[19] = 1; //se abre carta
                        setAuxCard(8,19);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard20:"+openCard +" presionados:"+presionados[19]);
                break;
            case R.id.btn21:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[20] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 21 en default");
                        card21.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[20] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[20] == 3 || presionados[20] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 21");
                        card21.setImageResource(R.drawable.img9);
                        presionados[20] = 1; //se abre carta
                        setAuxCard(9,20);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard21:"+openCard +" presionados:"+presionados[20]);
                break;
            case R.id.btn22:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[21] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 22 en default");
                        card22.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[21] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[21] == 3 || presionados[21] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 22");
                        card22.setImageResource(R.drawable.img10);
                        presionados[21] = 1; //se abre carta
                        setAuxCard(10,21);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard22:"+openCard +" presionados:"+presionados[21]);
                break;
            case R.id.btn23:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[22] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 23 en default");
                        card23.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[22] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[22] == 3 || presionados[22] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 23");
                        card23.setImageResource(R.drawable.img11);
                        presionados[22] = 1; //se abre carta
                        setAuxCard(11,22);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard23:"+openCard +" presionados:"+presionados[22]);
                break;
            case R.id.btn24:
                if(!flip()){    //podemos voltear carta, hay 1 o 0 cartas abiertas
                    if(presionados[23] == 1){ //esta volteada o abierta
                        System.out.println(" msg volteo carta 24 en default");
                        card24.setImageResource(R.drawable.imgdefault);  //poner carta en default
                        presionados[23] = 0; //se cierra carta
                        if(openCard == 0) openCard = 0;
                        else openCard --;
                    }else if(presionados[23] == 3 || presionados[23] == 0){ //se puede voltear carta, esta cerrada
                        System.out.println(" msg volteo carta 24");
                        card24.setImageResource(R.drawable.img12);
                        presionados[23] = 1; //se abre carta
                        setAuxCard(12,23);  //img#, presionados[#]
                        openCard ++;
                        if(flip()){ //si ya hay 2 cartas volteadas
                            if(isPar()){    //checamos si son pares las cartas abiertas
                                Toast t = Toast.makeText(getApplicationContext(),"Encontraste un par!",Toast.LENGTH_LONG);
                                t.show();
                            }
                        }
                    }
                }
                System.out.println(" openCard24:"+openCard +" presionados:"+presionados[23]);
                break;
            case R.id.bt_again:
                reset();
        }
    }

    public void setAuxCard(int card, int id_btn){
        if(c1[0] == 0){
            c1[0] = card;
            c1[1] = id_btn;
        }
        else{
            c2[0] = card;
            c2[1] = id_btn;
        }
        System.out.println(" msg setaux c1[0] "+c1[0] + " c2[0] "+c2[0]);
    }

    public boolean isPar(){
        System.out.println(" msg ispar c1[0] "+c1[0] + " c2[0] "+c2[0]);
        openCard = 0;
        if(c1[0] == c2[0]){
            pares ++;
            c1[0] = 0;
            c2[0] = 0;
            presionados[c1[1]] = 2;
            presionados[c2[1]] = 2;
            if(pares == 12){
                Toast t = Toast.makeText(getApplicationContext(),"¡Felicidades!",Toast.LENGTH_LONG);
                t.show();
            }
            txPares.setText(String.valueOf(pares));
            return true;
        }
        else {
            Toast t = Toast.makeText(getApplicationContext(),"Sigue intentando",Toast.LENGTH_LONG);
            t.show();
            Runnable r = new Runnable() {
                @Override
                public void run(){
                    voltear(c1[1]+1);
                    voltear(c2[1]+1);

                }
            };
            Handler h = new Handler();
            h.postDelayed(r, 1500);
            presionados[c1[1]] = 0;
            presionados[c2[1]] = 0;
            c1[0] = 0;
            c2[0] = 0;
        }
        return false;
    }

    public void voltear(int id){
        switch (id){
            case 1:
                card1.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 2:
                card2.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 3:
                card3.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 4:
                card4.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 5:
                card5.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 6:
                card6.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 7:
                card7.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 8:
                card8.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 9:
                card9.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 10:
                card10.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 11:
                card11.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 12:
                card12.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 13:
                card13.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 14:
                card14.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 15:
                card15.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 16:
                card16.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 17:
                card17.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 18:
                card18.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 19:
                card19.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 20:
                card20.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 21:
                card21.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 22:
                card22.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 23:
                card23.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
            case 24:
                card24.setImageResource(R.drawable.imgdefault);  //poner carta en default
                break;
        }
    }

    public boolean flip(){
        if(openCard == 2) return true;
        return false;
    }

    public void randomImages(){
        int cant=12;
        int i=0;
        int rang=10;
        int vec[]= new int [cant];

        vec[i]=(int) (Math.random()*rang);
        for(i=1; i<cant; i++){
            vec[i]=(int)(Math.random()*rang);
            for(int j=1; j<i; j++){
                if(vec[i]==vec[j]){
                    i--;
                }
            }
        }
        System.out.println("        msg Numeros Random \n");
        for(int a=0;a<cant;a++){
            System.out.print(vec[a]+" / ");
        }
    }

    public void reset(){
        presionados = new int[24];
        pares = 0;
        openCard = 0;
        c1 = new int[2];
        c2 = new int[2];
        c1[0] = 0;
        c2[0] = 0;

        for (int a=0;a<24;a++){
            int b = a;
            presionados[a] = 3;
        }

        //randomImages();
        txPares.setText("0");

        card1.setImageResource(R.drawable.imgdefault);
        card2.setImageResource(R.drawable.imgdefault);
        card3.setImageResource(R.drawable.imgdefault);
        card4.setImageResource(R.drawable.imgdefault);
        card5.setImageResource(R.drawable.imgdefault);
        card6.setImageResource(R.drawable.imgdefault);
        card7.setImageResource(R.drawable.imgdefault);
        card8.setImageResource(R.drawable.imgdefault);
        card9.setImageResource(R.drawable.imgdefault);
        card10.setImageResource(R.drawable.imgdefault);
        card11.setImageResource(R.drawable.imgdefault);
        card12.setImageResource(R.drawable.imgdefault);
        card13.setImageResource(R.drawable.imgdefault);
        card14.setImageResource(R.drawable.imgdefault);
        card15.setImageResource(R.drawable.imgdefault);
        card16.setImageResource(R.drawable.imgdefault);
        card17.setImageResource(R.drawable.imgdefault);
        card18.setImageResource(R.drawable.imgdefault);
        card19.setImageResource(R.drawable.imgdefault);
        card20.setImageResource(R.drawable.imgdefault);
        card21.setImageResource(R.drawable.imgdefault);
        card22.setImageResource(R.drawable.imgdefault);
        card23.setImageResource(R.drawable.imgdefault);
        card24.setImageResource(R.drawable.imgdefault);
    }
}
