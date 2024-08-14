package Version_2;

import javax.swing.JOptionPane;
import java.util.*;
import sum.kern.*;

public class MainFile {
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
    static int score = 0;
    static int lasthit = 0;
    static int gameSpeed = 10;
    static int e = 1;
    static int f = 20;
    static int l = 1;
    static int federZahl = 3;
    static int treffpunkt = 1150;
    static int Bildzurueck = 0;
    static double koordy = 100;
    static double koordx = 150;
    static int Grad = 0;
    static boolean runter = true;
    static boolean Gameover = false;
    static boolean [] SpielerBoolean = {true, false, false, false};
    static int [] Farben = {1,2,3,4,5,6,7,8,9,10};
    static String [] spielerFarben = {"Blau", "Rot", "Gr\u00FCn","Schwarz"};
    static int [] spielerFarbenInt = {1, 10, 5, 0};
    static int [] scoreBoardColorCoords = {1570, 1570, 1570, 1630};
    static int [] farbWuerfe = {0, 0, 0, 0};           //blau, rot, gruen, schwarz
    static int [] farbScores = {0, 0, 0, 0};           //blau, rot, gruen, schwarz

    public static void Pfeil() {
        setzeFarbeSpieler();

        Stift.hoch();
        Stift.bewegeBis(koordx, koordy);
        Stift.runter();
        Stift.bewegeUm(-50);

        for(int i = 0; i<federZahl; i++) {
            setzeFarbeSpieler();
            maleFedern();
        }
        maleSpitze();
    }

    private static void maleSpitze() {
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

    private static void maleFedern() {
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

    private static void setzeFarbeSpieler() {
        if(modus==0) {
            Stift.setzeFarbe(Farben[(int)(Math.random()*9)]);
        }
        else if(modus==1 && SpielerBoolean[0]) {
            Stift.setzeFarbe(Farbe.BLAU);
        }
        else if(modus==1 && SpielerBoolean[1]) {
            Stift.setzeFarbe(Farbe.ROT);
        }
        else if(modus==1 && SpielerBoolean[2]) {
            Stift.setzeFarbe(Farbe.GRUEN);
        }
        else if(modus==1 && SpielerBoolean[3]) {
            Stift.setzeFarbe(Farbe.SCHWARZ);
        }
    }

    public static void radiere() {
        Stift.setzeFarbe(Farbe.WEISS);
        Stift.bewegeBis(koordx, koordy);
        Stift.runter();
        Stift.bewegeUm(-50);
        for(int i = 0; i<federZahl; i++) {
            maleFedern();
        }
        maleSpitze();
    }

    public static void Scheibe() {
        Stift.setzeSchriftGroesse(20);
        Stift.dreheBis(0);
        Stift.setzeFarbe(Farbe.SCHWARZ);
        Stift.bewegeBis(1300, 100);
        Stift.runter();
        for(e=8; e>0; e--) {
            zeichneScoreSquare();
        }
        for(e=2; e<9; e++) {
            zeichneScoreSquare();
        }
        l=1;
    }

    private static void zeichneScoreSquare() {
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

    public static void loescheScheibe() {
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

    public static void schreibScore() {
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

    public static void schreibMultiScore() {
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

        for(int i = 0; i<AnzahlSpieler+2; i++) {
            Stift.setzeFarbe(spielerFarbenInt[i]);
            Stift.bewegeBis(1390, 298 +(i*100));
            Stift.schreibeText("Score " +spielerFarben[i] +":");
            Stift.bewegeBis(scoreBoardColorCoords[i], 300 +(i*100));
            Stift.schreibeZahl(farbScores[i]);
        }

        Stift.setzeFarbe(Farbe.SCHWARZ);
        Stift.bewegeBis(1545, 700);
        Stift.schreibeText("+" +lasthit);
        Stift.bewegeBis(0, 0);
    }

    public static void Getscore() {
        if(Stift.hPosition()>treffpunkt && Stift.vPosition()>100 && Stift.vPosition()<151 || Stift.hPosition()>treffpunkt && Stift.vPosition()>814 && Stift.vPosition()<865) {
            lasthit=8;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>151 && Stift.vPosition()<202 || Stift.hPosition()>treffpunkt && Stift.vPosition()>763 && Stift.vPosition()<814) {
            lasthit=7;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>202 && Stift.vPosition()<253 || Stift.hPosition()>treffpunkt && Stift.vPosition()>712 && Stift.vPosition()<763) {
            lasthit=6;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>253 && Stift.vPosition()<304 || Stift.hPosition()>treffpunkt && Stift.vPosition()>661 && Stift.vPosition()<712) {
            lasthit=5;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>304 && Stift.vPosition()<355 || Stift.hPosition()>treffpunkt && Stift.vPosition()>610 && Stift.vPosition()<661) {
            lasthit=4;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>355 && Stift.vPosition()<406 || Stift.hPosition()>treffpunkt && Stift.vPosition()>559 && Stift.vPosition()<610) {
            lasthit=3;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>406 && Stift.vPosition()<457 || Stift.hPosition()>treffpunkt && Stift.vPosition()>508 && Stift.vPosition()<559) {
            lasthit=2;
        }
        else if(Stift.hPosition()>treffpunkt && Stift.vPosition()>457 && Stift.vPosition()<508) {
            lasthit=1;
        }
        else {
            Gameover=true;
        }

        score+=lasthit;
        loescheScheibe();
        schreibScore();
    }

    public static void Zielpunktzahl() {
        Stift.hoch();
        Stift.bewegeBis(1400, 800);
        Stift.setzeSchriftGroesse(30);
        Stift.schreibeText("Zielpunktzahl: " +punktzahl);
        Stift.setzeSchriftGroesse(1);
    }

    private static void oneMultiplayerThrow(int farbe) throws InterruptedException {
        while(farbWuerfe[farbe] < 3) {
            SpielerBoolean[0] = false;
            SpielerBoolean[1] = false;
            SpielerBoolean[2] = false;
            SpielerBoolean[3] = false;

            SpielerBoolean[farbe] = true;

            oneThrow(farbe);

            loescheScheibe();
            farbScores[farbe]+=lasthit;
            schreibMultiScore();
            Zielpunktzahl();
            lasthit=0;
            farbWuerfe[farbe]++;
        }

        farbWuerfe[0] = 0;
        farbWuerfe[1] = 0;
        farbWuerfe[2] = 0;
        farbWuerfe[3] = 0;
    }

    private static void oneThrow(int farbe) throws InterruptedException {
        Stift.hoch();
        Stift.bewegeBis(koordy, koordx);
        Stift.dreheBis(0);
        Stift.runter();
        koordx=150;
        koordy=100;
        Grad=0;

        while(!Maus.doppelKlick()) {
            if(koordy<=100) {
                runter = true;
            }
            if(koordy>=900) {
                runter = false;
            }
            if(runter) {
                Pfeil();
                Thread.sleep(gameSpeed);
                radiere();
                koordy += 5+(Difficulty*30);
            }
            if(!runter) {
                Pfeil();
                Thread.sleep(gameSpeed);
                radiere();
                koordy -= 5+(Difficulty*30);
            }
        }

        runter = false;

        while(!Maus.istGedrueckt()) {
            int winkel = 1+(Difficulty*10);
            if(Grad>=70) {
                runter = true;
            }
            if(Grad<=-70) {
                runter = false;
            }
            if(!runter) {
                Pfeil();
                Thread.sleep(gameSpeed);
                radiere();
                Stift.dreheUm(winkel);
                Grad += winkel;
            }
            if(runter) {
                Pfeil();
                Thread.sleep(gameSpeed);
                radiere();
                Stift.dreheUm(-winkel);
                Grad -= winkel;
            }
        }
        moveArrow();
    }

    private static void moveArrow() throws InterruptedException {
        Stift.dreheBis(Grad);

        while(Stift.hPosition()<1247 && Stift.hPosition()>50 && Stift.vPosition()<950 && Stift.vPosition()>80) {
            koordx = Stift.hPosition();
            koordy = Stift.vPosition();

            Pfeil();
            Thread.sleep(gameSpeed -(Difficulty* 8L));
            radiere();
            Stift.bewegeUm(-49.9);
        }
        Pfeil();
        Getscore();
    }

    private static void checkForWinner() {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i<farbScores.length; i++) {
            if(farbScores[i] > max) {
                max = farbScores[i];
                maxIndex = i;
            }
        }
        if(max >= punktzahl) {
            ArrayList<Integer> liste = new ArrayList<>();
            for (int i : farbScores) {
                liste.add(i);
            }
            liste.sort(Collections.reverseOrder());

            if(Objects.equals(liste.get(0), liste.get(1))) {
                JOptionPane.showMessageDialog(null, "Mehrere Spieler haben die selbe Punktzahl erreicht! Damit liegt ein Unentschieden vor", "Unentschieden", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            else {
                JOptionPane.showMessageDialog(null, "Spieler " +spielerFarben[maxIndex] +" hat diese Runde gewonnen!", "Spieler " +spielerFarben[maxIndex] +" gewinnt", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Bild = new Bildschirm();
        Maus = new Maus();
        Stift = new Buntstift();
        Tast = new Tastatur();

        Bild.setTitle("Dartspiel");
        modus = JOptionPane.showOptionDialog(null, "Bitte den Modus waehlen", "Modus waehlen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Modus, Modus[0]);
        Difficulty = JOptionPane.showOptionDialog(null, "Bitte die Schwierigkeit waehlen", "Schwierigkeit waehlen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Schwierigkeit, Schwierigkeit[0]);

        if(modus==0) {
            schreibScore();
            while(!Gameover) {
                oneThrow(0);
                lasthit=0;
            }
            JOptionPane.showMessageDialog(null, "Game Over!!!\nDein Score betr\u00E4gt " +score, "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        if(modus==1) {
            AnzahlSpieler = JOptionPane.showOptionDialog(null, "Bitte die Anzahl der Spieler waehlen", "Spieleranzahl waehlen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Anzahlspieler, Anzahlspieler[0]);

            while (punktzahl == 0) {
                try {
                    punktzahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte die Zielpunktzahl angeben"));

                    if(punktzahl > 1000 || punktzahl < 0) {
                        JOptionPane.showMessageDialog(null, "Input has to be between 1 and 1000", "Error", JOptionPane.WARNING_MESSAGE);
                        punktzahl = 0;
                    }
                }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Input is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            schreibMultiScore();
            Zielpunktzahl();

            JOptionPane.showMessageDialog(null, "Der blaue Spieler beginnt! Jeder Spieler hat 3 W\u00FCrfe!\nAlle 3 Runden wird das Bild zur\u00FCckgesetzt f\u00FCr eine bessere Performance");

            while(farbScores[0]<=punktzahl && farbScores[1]<=punktzahl && farbScores[2] <=punktzahl && farbScores[3]<=punktzahl) {
                if(Bildzurueck == 3) {
                    Bild.loescheAlles();
                    schreibMultiScore();
                    Zielpunktzahl();
                    Bildzurueck = 0;
                }
                Bildzurueck++;

                for(int i = 0; i<AnzahlSpieler+2; i++) {
                    JOptionPane.showMessageDialog(null, "Spieler " +spielerFarben[i] +" ist am Zug!");
                    oneMultiplayerThrow(i);
                }
                checkForWinner();
            }
        }
        Stift.gibFrei();
        Maus.gibFrei();
        Bild.gibFrei();
    }
}