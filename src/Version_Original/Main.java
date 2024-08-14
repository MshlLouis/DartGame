package Version_Original;

import javax.swing.JOptionPane;
import sum.kern.*;

public class Main
{
    static Bildschirm Bild;
    static Maus Maus;
    static Buntstift Stift;
    static Tastatur Tast;

    static int AnzahlSpieler = 0;
    static String [] Anzahlspieler = {"2","3","4"};
    static String [] Schwierigkeit = {"Einfach","Schwer"};
    static int Difficulty = 0;
    static String [] Modus = {"Einzelspieler","Mehrspieler"};
    static int modus = 0;
    static int punktzahl = 0;
    static int [] Punktzahl = new int [punktzahl];
    static String Punktzahll;
    static int score = 0;
    static int lasthit = 0;
    static int nochmal = 0;
    static int wdh = 200;
    static int e = 1;
    static int f = 20;
    static int i = 0;
    static int j = 0;
    static int k = 0;
    static int l = 1;
    static int treffpunkt = 1150;
    static int Scoreblau = 0;
    static int Blauwuerfe = 0;
    static int Rotwuerfe = 0;
    static int Scorerot = 0;
    static int Scoregruen = 0;
    static int Gruenwuerfe = 0;
    static int Schwarzwuerfe = 0;
    static int Scoreschwarz = 0;
    static int Bildzurueck = 0;
    static double koordy = 100;
    static double koordx = 150;
    static int Grad = 0;
    static boolean runter = true;
    static boolean Gameover = false;
    static boolean Spieler1 = true;
    static boolean Spieler2 = false;
    static boolean Spieler3 = false;
    static boolean Spieler4 = false;
    static int [] Farben = {1,2,3,4,5,6,7,8,9,10};

    public static void Pfeil()
    {
        if(modus==0)
        {
            Stift.setzeFarbe(Farben[(int)(Math.random()*9)]);
        }
        else if(modus==1 && Spieler1==true)
        {
            Stift.setzeFarbe(Farbe.BLAU);
        }
        else if(modus==1 && Spieler2==true)
        {
            Stift.setzeFarbe(Farbe.ROT);
        }
        else if(modus==1 && Spieler3==true)
        {
            Stift.setzeFarbe(Farbe.GRUEN);
        }
        else if(modus==1 && Spieler4==true)
        {
            Stift.setzeFarbe(Farbe.SCHWARZ);
        }
        Stift.hoch();
        Stift.bewegeBis(koordx, koordy);
        Stift.runter();
        Stift.bewegeUm(-50);
        for(int Feder = 0; Feder<3; Feder++)
        {
            if(modus==0)
            {
                Stift.setzeFarbe(Farben[(int)(Math.random()*9)]);
            }
            else if(modus==1 && Spieler1==true)
            {
                Stift.setzeFarbe(Farbe.BLAU);
            }
            else if(modus==1 && Spieler2==true)
            {
                Stift.setzeFarbe(Farbe.ROT);
            }
            else if(modus==1 && Spieler3==true)
            {
                Stift.setzeFarbe(Farbe.GRUEN);
            }
            else if(modus==1 && Spieler4==true)
            {
                Stift.setzeFarbe(Farbe.SCHWARZ);
            }
            Stift.runter();
            Stift.dreheUm(140);
            Stift.bewegeUm(20);
            Stift.bewegeUm(-20);
            Stift.dreheUm(80);
            Stift.bewegeUm(20);
            Stift.bewegeUm(-20);
            Stift.dreheUm(140);
            Stift.hoch();
            Stift.bewegeUm(10);
        }
        Stift.bewegeUm(20);
        Stift.runter();
        Stift.bewegeUm(60);
        Stift.dreheUm(150);
        Stift.bewegeUm(40);
        Stift.bewegeUm(-40);
        Stift.dreheUm(60);
        Stift.bewegeUm(40);
        Stift.bewegeUm(-40);
        Stift.dreheUm(150);
        Stift.hoch();
    }

    public static void radiere()
    {
        Stift.setzeFarbe(Farbe.WEISS);
        Stift.bewegeBis(koordx, koordy);
        Stift.runter();
        Stift.bewegeUm(-50);
        for(int Feder = 0; Feder<3; Feder++)
        {
            Stift.runter();
            Stift.dreheUm(140);
            Stift.bewegeUm(20);
            Stift.bewegeUm(-20);
            Stift.dreheUm(80);
            Stift.bewegeUm(20);
            Stift.bewegeUm(-20);
            Stift.dreheUm(140);
            Stift.hoch();
            Stift.bewegeUm(10);
        }
        Stift.bewegeUm(20);
        Stift.runter();
        Stift.bewegeUm(60);
        Stift.dreheUm(150);
        Stift.bewegeUm(40);
        Stift.bewegeUm(-40);
        Stift.dreheUm(60);
        Stift.bewegeUm(40);
        Stift.bewegeUm(-40);
        Stift.dreheUm(150);
        Stift.hoch();
    }

    public static void Scheibe()
    {
        Stift.setzeSchriftGroesse(20);
        Stift.dreheBis(0);
        Stift.setzeFarbe(Farbe.SCHWARZ);
        Stift.bewegeBis(1300, 100);
        Stift.runter();
        for(e=8; e>0; e--)
        {
            Stift.zeichneRechteck(50, 50);
            Stift.dreheUm(270);
            Stift.hoch();
            Stift.bewegeUm(33);
            Stift.dreheUm(90);
            Stift.bewegeUm(f);
            Stift.schreibeZahl(e);
            Stift.bewegeBis(1300, 100);
            Stift.dreheUm(270);
            Stift.bewegeUm(l*51);
            Stift.dreheUm(90);
            l++;
        }
        for(e=2; e<9; e++)
        {
            Stift.zeichneRechteck(50, 50);
            Stift.dreheUm(270);
            Stift.hoch();
            Stift.bewegeUm(33);
            Stift.dreheUm(90);
            Stift.bewegeUm(f);
            Stift.schreibeZahl(e);
            Stift.bewegeBis(1300, 100);
            Stift.dreheUm(270);
            Stift.bewegeUm(l*51);
            Stift.dreheUm(90);
            l++;
        }
        l=1;
    }

    public static void loescheScheibe()
    {
        Stift.dreheBis(0);
        Stift.setzeFarbe(Farbe.WEISS);
        Stift.bewegeBis(1300, 100);
        Stift.runter();
        Stift.setzeFuellMuster(1);
        Stift.zeichneRechteck(600, 800);
        Stift.setzeFuellMuster(0);
        Stift.hoch();
        Stift.bewegeBis(0, 0);
    }

    public static void schreibScore()
    {
        Stift.hoch();
        Stift.setzeFarbe(Farbe.WEISS);
        Stift.bewegeBis(1550, 400);
        Stift.setzeFuellMuster(1);
        Stift.zeichneRechteck(200, 200);
        Stift.bewegeBis(1390, 500);
        Stift.zeichneRechteck(200, 200);
        Stift.setzeFuellMuster(0);
        Scheibe();
        Stift.hoch();
        Stift.setzeSchriftGroesse(30);
        Stift.setzeFarbe(Farbe.SCHWARZ);
        Stift.bewegeBis(1390, 498);
        Stift.schreibeText("Score:");
        Stift.bewegeBis(1550, 500);
        Stift.schreibeZahl(score);
        Stift.bewegeBis(1390, 600);
        Stift.schreibeText("+" +lasthit);
        Stift.bewegeBis(0, 0);
    }

    public static void schreibMultiScore()
    {
        Stift.hoch();
        Stift.setzeFarbe(Farbe.WEISS);
        Stift.bewegeBis(1550, 400);
        Stift.setzeFuellMuster(1);
        Stift.zeichneRechteck(200, 200);
        Stift.bewegeBis(1390, 500);
        Stift.zeichneRechteck(200, 200);
        Stift.setzeFuellMuster(0);
        Scheibe();
        Stift.hoch();
        Stift.setzeSchriftGroesse(30);
        Stift.setzeFarbe(Farbe.BLAU);
        Stift.bewegeBis(1390, 298);
        Stift.schreibeText("Score Blau:");
        Stift.bewegeBis(1570, 300);
        Stift.schreibeZahl(Scoreblau);
        Stift.setzeFarbe(Farbe.ROT);
        Stift.bewegeBis(1390, 398);
        Stift.schreibeText("Score Rot:");
        Stift.bewegeBis(1570, 400);
        Stift.schreibeZahl(Scorerot);
        if(AnzahlSpieler>=1)
        {
            Stift.setzeFarbe(Farbe.GRUEN);
            Stift.bewegeBis(1390, 498);
            Stift.schreibeText("Score Gruen:");
            Stift.bewegeBis(1570, 500);
            Stift.schreibeZahl(Scoregruen);
        }
        if(AnzahlSpieler==2)
        {
            Stift.setzeFarbe(Farbe.SCHWARZ);
            Stift.bewegeBis(1390, 598);
            Stift.schreibeText("Score Schwarz:");
            Stift.bewegeBis(1630, 600);
            Stift.schreibeZahl(Scoreschwarz);
        }
        Stift.setzeFarbe(Farbe.SCHWARZ);
        Stift.bewegeBis(1545, 700);
        Stift.schreibeText("+" +lasthit);
        Stift.bewegeBis(0, 0);
    }

    public static void Getscore()
    {

        if(Stift.hPosition()>treffpunkt && Stift.vPosition()>100 && Stift.vPosition()<151 || Stift.hPosition()>treffpunkt && Stift.vPosition()>814 && Stift.vPosition()<865)
        {
            lasthit=8;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>151 && Stift.vPosition()<202 || Stift.hPosition()>treffpunkt && Stift.vPosition()>763 && Stift.vPosition()<814)
        {
            lasthit=7;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>202 && Stift.vPosition()<253 || Stift.hPosition()>treffpunkt && Stift.vPosition()>712 && Stift.vPosition()<763)
        {
            lasthit=6;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>253 && Stift.vPosition()<304 || Stift.hPosition()>treffpunkt && Stift.vPosition()>661 && Stift.vPosition()<712)
        {
            lasthit=5;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>304 && Stift.vPosition()<355 || Stift.hPosition()>treffpunkt && Stift.vPosition()>610 && Stift.vPosition()<661)
        {
            lasthit=4;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>355 && Stift.vPosition()<406 || Stift.hPosition()>treffpunkt && Stift.vPosition()>559 && Stift.vPosition()<610)
        {
            lasthit=3;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>406 && Stift.vPosition()<457 || Stift.hPosition()>treffpunkt && Stift.vPosition()>508 && Stift.vPosition()<559)
        {
            lasthit=2;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>457 && Stift.vPosition()<508)
        {
            lasthit=1;
        }
        else
        {
            Gameover=true;
        }

        score+=lasthit;
        loescheScheibe();
        schreibScore();
    }

    public static void Zielpunktzahl()
    {
        Stift.hoch();
        Stift.bewegeBis(1400, 800);
        Stift.setzeSchriftGroesse(30);
        Stift.schreibeText("Zielpunktzahl: " +punktzahl);
        Stift.setzeSchriftGroesse(1);
    }

    public static void main(String args[])
    {
        Bild = new Bildschirm();
        Maus = new Maus();
        Stift = new Buntstift();
        Tast = new Tastatur();

        modus = JOptionPane.showOptionDialog(null, "          Bitte den Modus waehlen", "Modus waehlen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Modus, Modus[0]);

        Difficulty = JOptionPane.showOptionDialog(null, "         Bitte die Schwierigkeit waehlen", "Schwierigkeit waehlen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Schwierigkeit, Schwierigkeit[0]);

        AnzahlSpieler = JOptionPane.showOptionDialog(null, "         Bitte die Anzahl der Spieler waehlen", "Spieleranzahl waehlen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Anzahlspieler, Anzahlspieler[0]);

        if(Difficulty==1)
        {
            wdh=1;
        }

        if(modus==1)
        {
            Punktzahll = JOptionPane.showInputDialog(null, "Bitte die Zielpunktzahl angeben");
            punktzahl = Integer.parseInt(Punktzahll);

            schreibMultiScore();
            Zielpunktzahl();

            JOptionPane.showMessageDialog(null, "Der blaue Spieler beginnt! Jeder Spieler hat 3 Wuerfe!\nAlle 3 Runden wird das Bild zurueckgesetzt fuer eine bessere Performance");

            while(Scoreblau<=punktzahl && Scorerot<=punktzahl && Scoregruen<=punktzahl && Scoreschwarz<=punktzahl)
            {
                if(Bildzurueck==3)
                {
                    Bild.loescheAlles();
                    schreibMultiScore();
                    Zielpunktzahl();
                    Bildzurueck=0;
                }
                Bildzurueck++;

                while(Blauwuerfe<3)
                {
                    Spieler1=true;
                    Spieler2=false;
                    Spieler3=false;
                    Spieler4=false;
                    Stift.hoch();
                    Stift.bewegeBis(koordy, koordx);
                    Stift.dreheBis(0);
                    Stift.runter();
                    koordx=150;
                    koordy=100;
                    Grad=0;

                    while(!Maus.doppelKlick())
                    {
                        if(koordy==100)
                        {
                            runter = true;
                        }
                        if(koordy==900)
                        {
                            runter = false;
                        }
                        if(runter == true)
                        {
                            for(int a = 0; a<wdh; a++)
                            {
                                Pfeil();
                            }
                            radiere();
                            koordy++;
                        }
                        if(runter == false)
                        {
                            for(int a = 0; a<wdh; a++)
                            {
                                Pfeil();
                            }
                            radiere();
                            koordy--;
                        }
                    }

                    runter = false;

                    while(!Maus.istGedrueckt())
                    {
                        if(Grad==70)
                        {
                            runter = true;
                        }
                        if(Grad==-70)
                        {
                            runter = false;
                        }
                        if(runter==false)
                        {
                            for(int a = 0; a<wdh*10; a++)
                            {
                                Pfeil();
                            }
                            radiere();
                            Stift.dreheUm(1);
                            Grad++;
                        }
                        if(runter==true)
                        {
                            for(int a = 0; a<wdh*10; a++)
                            {
                                Pfeil();
                            }
                            radiere();
                            Stift.dreheUm(-1);
                            Grad--;
                        }
                    }

                    Stift.dreheBis(Grad);

                    while(Stift.hPosition()<1247 && Stift.hPosition()>50 && Stift.vPosition()<950 && Stift.vPosition()>80)
                    {
                        koordx = Stift.hPosition();
                        koordy = Stift.vPosition();
                        for(int b = 0; b<30; b++)
                        {
                            Pfeil();
                        }
                        radiere();
                        Stift.bewegeUm(-59.9);
                    }
                    Pfeil();
                    Getscore();
                    loescheScheibe();
                    Scoreblau+=lasthit;
                    schreibMultiScore();
                    Zielpunktzahl();
                    lasthit=0;
                    Blauwuerfe++;
                }

                Blauwuerfe=0;
                Rotwuerfe=0;
                Gruenwuerfe=0;
                Schwarzwuerfe=0;
                JOptionPane.showMessageDialog(null, "Spieler Rot ist am Zug!");

                while(Rotwuerfe<3)
                {
                    Spieler1=false;
                    Spieler2=true;
                    Spieler3=false;
                    Spieler4=false;
                    Stift.hoch();
                    Stift.bewegeBis(koordy, koordx);
                    Stift.dreheBis(0);
                    Stift.runter();
                    koordx=150;
                    koordy=100;
                    Grad=0;

                    while(!Maus.doppelKlick())
                    {
                        if(koordy==100)
                        {
                            runter = true;
                        }
                        if(koordy==900)
                        {
                            runter = false;
                        }
                        if(runter == true)
                        {
                            for(int a = 0; a<wdh; a++)
                            {
                                Pfeil();
                            }
                            radiere();
                            koordy++;
                        }
                        if(runter == false)
                        {
                            for(int a = 0; a<wdh; a++)
                            {
                                Pfeil();
                            }
                            radiere();
                            koordy--;
                        }
                    }

                    runter = false;

                    while(!Maus.istGedrueckt())
                    {
                        if(Grad==70)
                        {
                            runter = true;
                        }
                        if(Grad==-70)
                        {
                            runter = false;
                        }
                        if(runter==false)
                        {
                            for(int a = 0; a<wdh*10; a++)
                            {
                                Pfeil();
                            }
                            radiere();
                            Stift.dreheUm(1);
                            Grad++;
                        }
                        if(runter==true)
                        {
                            for(int a = 0; a<wdh*10; a++)
                            {
                                Pfeil();
                            }
                            radiere();
                            Stift.dreheUm(-1);
                            Grad--;
                        }
                    }

                    Stift.dreheBis(Grad);

                    while(Stift.hPosition()<1247 && Stift.hPosition()>50 && Stift.vPosition()<950 && Stift.vPosition()>80)
                    {
                        koordx = Stift.hPosition();
                        koordy = Stift.vPosition();
                        for(int b = 0; b<30; b++)
                        {
                            Pfeil();
                        }
                        radiere();
                        Stift.bewegeUm(-59.9);
                    }
                    Pfeil();
                    Getscore();
                    loescheScheibe();
                    Scorerot+=lasthit;
                    schreibMultiScore();
                    Zielpunktzahl();
                    lasthit=0;
                    Rotwuerfe++;
                }

                if(AnzahlSpieler==1 || AnzahlSpieler==2)
                {

                    JOptionPane.showMessageDialog(null, "Spieler Gruen ist am Zug!");

                    while(Gruenwuerfe<3)
                    {
                        Spieler1=false;
                        Spieler2=false;
                        Spieler3=true;
                        Spieler4=false;
                        Stift.hoch();
                        Stift.bewegeBis(koordy, koordx);
                        Stift.dreheBis(0);
                        Stift.runter();
                        koordx=150;
                        koordy=100;
                        Grad=0;

                        while(!Maus.doppelKlick())
                        {
                            if(koordy==100)
                            {
                                runter = true;
                            }
                            if(koordy==900)
                            {
                                runter = false;
                            }
                            if(runter == true)
                            {
                                for(int a = 0; a<wdh; a++)
                                {
                                    Pfeil();
                                }
                                radiere();
                                koordy++;
                            }
                            if(runter == false)
                            {
                                for(int a = 0; a<wdh; a++)
                                {
                                    Pfeil();
                                }
                                radiere();
                                koordy--;
                            }
                        }

                        runter = false;

                        while(!Maus.istGedrueckt())
                        {
                            if(Grad==70)
                            {
                                runter = true;
                            }
                            if(Grad==-70)
                            {
                                runter = false;
                            }
                            if(runter==false)
                            {
                                for(int a = 0; a<wdh*10; a++)
                                {
                                    Pfeil();
                                }
                                radiere();
                                Stift.dreheUm(1);
                                Grad++;
                            }
                            if(runter==true)
                            {
                                for(int a = 0; a<wdh*10; a++)
                                {
                                    Pfeil();
                                }
                                radiere();
                                Stift.dreheUm(-1);
                                Grad--;
                            }
                        }

                        Stift.dreheBis(Grad);

                        while(Stift.hPosition()<1247 && Stift.hPosition()>50 && Stift.vPosition()<950 && Stift.vPosition()>80)
                        {
                            koordx = Stift.hPosition();
                            koordy = Stift.vPosition();
                            for(int b = 0; b<30; b++)
                            {
                                Pfeil();
                            }
                            radiere();
                            Stift.bewegeUm(-59.9);
                        }
                        Pfeil();
                        Getscore();
                        loescheScheibe();
                        Scoregruen+=lasthit;
                        schreibMultiScore();
                        Zielpunktzahl();
                        lasthit=0;
                        Gruenwuerfe++;
                    }

                    Rotwuerfe=0;
                    Gruenwuerfe=0;
                    Schwarzwuerfe=0;

                }

                if(AnzahlSpieler==2)
                {

                    JOptionPane.showMessageDialog(null, "Spieler Schwarz ist am Zug!");

                    while(Schwarzwuerfe<3)
                    {
                        Spieler1=false;
                        Spieler2=false;
                        Spieler3=false;
                        Spieler4=true;
                        Stift.hoch();
                        Stift.bewegeBis(koordy, koordx);
                        Stift.dreheBis(0);
                        Stift.runter();
                        koordx=150;
                        koordy=100;
                        Grad=0;

                        while(!Maus.doppelKlick())
                        {
                            if(koordy==100)
                            {
                                runter = true;
                            }
                            if(koordy==900)
                            {
                                runter = false;
                            }
                            if(runter == true)
                            {
                                for(int a = 0; a<wdh; a++)
                                {
                                    Pfeil();
                                }
                                radiere();
                                koordy++;
                            }
                            if(runter == false)
                            {
                                for(int a = 0; a<wdh; a++)
                                {
                                    Pfeil();
                                }
                                radiere();
                                koordy--;
                            }
                        }

                        runter = false;

                        while(!Maus.istGedrueckt())
                        {
                            if(Grad==70)
                            {
                                runter = true;
                            }
                            if(Grad==-70)
                            {
                                runter = false;
                            }
                            if(runter==false)
                            {
                                for(int a = 0; a<wdh*10; a++)
                                {
                                    Pfeil();
                                }
                                radiere();
                                Stift.dreheUm(1);
                                Grad++;
                            }
                            if(runter==true)
                            {
                                for(int a = 0; a<wdh*10; a++)
                                {
                                    Pfeil();
                                }
                                radiere();
                                Stift.dreheUm(-1);
                                Grad--;
                            }
                        }

                        Stift.dreheBis(Grad);

                        while(Stift.hPosition()<1247 && Stift.hPosition()>50 && Stift.vPosition()<950 && Stift.vPosition()>80)
                        {
                            koordx = Stift.hPosition();
                            koordy = Stift.vPosition();
                            for(int b = 0; b<30; b++)
                            {
                                Pfeil();
                            }
                            radiere();
                            Stift.bewegeUm(-59.9);
                        }
                        Pfeil();
                        Getscore();
                        loescheScheibe();
                        Scoreschwarz+=lasthit;
                        schreibMultiScore();
                        Zielpunktzahl();
                        lasthit=0;
                        Schwarzwuerfe++;
                    }

                    Rotwuerfe=0;
                    Gruenwuerfe=0;
                    Schwarzwuerfe=0;

                }

                if(Scoreblau>Scorerot && Scoreblau>Scoregruen && Scoreblau>Scoreschwarz && Scoreblau>=punktzahl)
                {
                    JOptionPane.showMessageDialog(null, "Spieler Blau hat diese Runde gewonnen!", "Spieler Blau gewinnt", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else if(Scorerot>Scoreblau && Scorerot>Scoregruen && Scorerot>Scoreschwarz && Scorerot>=punktzahl)
                {
                    JOptionPane.showMessageDialog(null, "Spieler Rot hat diese Runde gewonnen!", "Spieler Rot gewinnt", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else if(Scoregruen>Scoreblau && Scoregruen>Scorerot && Scoregruen>Scoreschwarz && Scoregruen>=punktzahl)
                {
                    JOptionPane.showMessageDialog(null, "Spieler Gruen hat diese Runde gewonnen!", "Spieler Gruen gewinnt", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else if(Scoreschwarz>Scoreblau && Scoreschwarz>Scorerot && Scoreschwarz>Scoregruen && Scoreschwarz>=punktzahl)
                {
                    JOptionPane.showMessageDialog(null, "Spieler Schwarz hat diese Runde gewonnen!", "Spieler Schwarz gewinnt", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else if(Scoreblau==Scorerot || Scoregruen==Scorerot || Scoreschwarz==Scorerot || Scoreblau==Scoregruen || Scoreblau==Scoreschwarz || Scoreschwarz==Scoregruen)
                {
                    if(Scoreblau>=punktzahl || Scorerot>=punktzahl || Scoregruen>=punktzahl || Scoreschwarz>=punktzahl)
                    {
                        JOptionPane.showMessageDialog(null, "Mehrere Spieler haben die selbe Punktzahl erreicht! Damit liegt ein Unentschieden vor", "Unentschieden", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }

                JOptionPane.showMessageDialog(null, "Spieler Blau ist am Zug!");
            }
        }

        if(modus==0)
        {

            schreibScore();

            while(Gameover==false)
            {
                Stift.hoch();
                Stift.bewegeBis(koordy, koordx);
                Stift.dreheBis(0);
                Stift.runter();
                koordx=150;
                koordy=100;
                Grad=0;

                while(!Maus.doppelKlick())
                {
                    if(koordy==100)
                    {
                        runter = true;
                    }
                    if(koordy==900)
                    {
                        runter = false;
                    }
                    if(runter == true)
                    {
                        for(int a = 0; a<wdh; a++)
                        {
                            Pfeil();
                        }
                        radiere();
                        koordy++;
                    }
                    if(runter == false)
                    {
                        for(int a = 0; a<wdh; a++)
                        {
                            Pfeil();
                        }
                        radiere();
                        koordy--;
                    }
                }

                runter = false;

                while(!Maus.istGedrueckt())
                {
                    if(Grad==70)
                    {
                        runter = true;
                    }
                    if(Grad==-70)
                    {
                        runter = false;
                    }
                    if(runter==false)
                    {
                        for(int a = 0; a<wdh*10; a++)
                        {
                            Pfeil();
                        }
                        radiere();
                        Stift.dreheUm(1);
                        Grad++;
                    }
                    if(runter==true)
                    {
                        for(int a = 0; a<wdh*10; a++)
                        {
                            Pfeil();
                        }
                        radiere();
                        Stift.dreheUm(-1);
                        Grad--;
                    }
                }

                Stift.dreheBis(Grad);

                while(Stift.hPosition()<1247 && Stift.hPosition()>50 && Stift.vPosition()<950 && Stift.vPosition()>80)
                {
                    koordx = Stift.hPosition();
                    koordy = Stift.vPosition();
                    for(int b = 0; b<30; b++)
                    {
                        Pfeil();
                    }
                    radiere();
                    Stift.bewegeUm(-59.9);
                }

                Pfeil();
                Getscore();

            }

            JOptionPane.showMessageDialog(null, "Game Over!!!\nDein Score betraegt {" +score +"}", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        }

        Stift.gibFrei();
        Maus.gibFrei();
        Bild.gibFrei();
    }
}