/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jonatan Lara
 */
public class Repetidor1 {

    
    private int c001,ma01,in01,ma06,va01,ss06,ss01,ss07,ss03,va04,ma02,ss05,ss02,ss04,va03,ss09,ss21,ss11,ma03,va02,ss08,ss12,ss10,ad23,iv02,ss13
            ,ss15,ss18,ss14,rh02,va05,ss20,ss17,cm01,co02,de51,ad13,ss19,ss16,iv03,rh03,ad22,iv01,ee01;
    public Repetidor1() {
    }
    private void Comprobar(String sTexto,String sTextoBuscado,int contador){
            
            while (sTexto.indexOf(sTextoBuscado) > -1) {
              sTexto = sTexto.substring(sTexto.indexOf(
              sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
              contador++; 
             }
            //System.out.println(contador);
            
        }
    public void Comprobar(String aux){
        if (aux.equals("CO01")) {
            c001++;
        }
        if (aux.equals("MA01")) {
            ma01++;
        }
        if (aux.equals("IN01")) {
            in01++;
        }
        if (aux.equals("MA06")) {
            ma06++;
        }
        if (aux.equals("VA01")) {
            va01++;
        }
        if (aux.equals("SS06")) {
            ss06++;
        }
        if (aux.equals("SS01")) {
            ss01++;
        }
        if (aux.equals("SS07")) {
            ss07++;
        }
        if (aux.equals("SS03")) {
            ss03++;
        }
        if (aux.equals("VA04")) {
            va04++;
        }/*-------------------*/
        if (aux.equals("MA02")) {
            ma02++;
        }
        if (aux.equals("SS05")) {
            ss05++;
        }
        if (aux.equals("SS02")) {
            ss02++;
        }
        if (aux.equals("SS04")) {
            ss04++;
        }
        if (aux.equals("VA03")) {
            va03++;
        }/*-------------------*/
        if (aux.equals("SS09")) {
            ss09++;
        }
        if (aux.equals("SS21")) {
            ss21++;
        }
        if (aux.equals("SS11")) {
            ss11++;
        }
        if (aux.equals("MA03")) {
            ma03++;
        }
        if (aux.equals("VA02")) {
            va02++;
        }/*-------------------*/
        if (aux.equals("SS08")) {
            ss08++;
        }
        if (aux.equals("SS12")) {
            ss12++;
        }
        if (aux.equals("SS10")) {
            ss10++;
        }
        if (aux.equals("AD23")) {
            ad23++;
        }
        if (aux.equals("IV02")) {
            iv02++;
        }/*-------------------*/
        if (aux.equals("EE01")) {
            ee01++;
        }/*-------------------*/
         if (aux.equals("SS13")) {
            ss13++;
        }
        if (aux.equals("SS15")) {
            ss15++;
        }
        if (aux.equals("SS18")) {
            ss18++;
        }
        if (aux.equals("SS14")) {
            ss14++;
        }
        if (aux.equals("RH02")) {
            rh02++;
        }
        if (aux.equals("VA05")) {
            va05++;
        }/*-------------------*/
         if (aux.equals("SS20")) {
            ss20++;
        }
        if (aux.equals("SS17")) {
            ss17++;
        }
        if (aux.equals("CM01")) {
            cm01++;
        }
        if (aux.equals("CO02")) {
            co02++;
        }
        if (aux.equals("DE51")) {
            de51++;
        }
        if (aux.equals("AD13")) {
            ad13++;
        }/*-------------------*/
         if (aux.equals("SS19")) {
            ss19++;
        }
        if (aux.equals("SS16")) {
            ss16++;
        }
        if (aux.equals("IV03")) {
            iv03++;
        }
        if (aux.equals("RH03")) {
            rh03++;
        }
        if (aux.equals("AD22")) {
            ad22++;
        }
        if (aux.equals("IV01")) {
            iv01++;
        }/*-------------------*/
        
    }
    public int getC001() {
        
        return c001;
    }

    public int getEe01() {
        return ee01;
    }

    public void setEe01(int ee01) {
        this.ee01 = ee01;
    }
    
    public void setC001(int c001) {
        this.c001 = c001;
    }

    public int getMa01() {
        return ma01;
    }

    public void setMa01(int ma01) {
        this.ma01 = ma01;
    }

    public int getIn01() {
        return in01;
    }

    public void setIn01(int in01) {
        this.in01 = in01;
    }

    public int getMa06() {
        return ma06;
    }

    public void setMa06(int ma06) {
        this.ma06 = ma06;
    }

    public int getVa01() {
        return va01;
    }

    public void setVa01(int va01) {
        this.va01 = va01;
    }

    public int getSs06() {
        return ss06;
    }

    public void setSs06(int ss06) {
        this.ss06 = ss06;
    }

    public int getSs01() {
        return ss01;
    }

    public void setSs01(int ss01) {
        this.ss01 = ss01;
    }

    public int getSs07() {
        return ss07;
    }

    public void setSs07(int ss07) {
        this.ss07 = ss07;
    }

    public int getSs03() {
        return ss03;
    }

    public void setSs03(int ss03) {
        this.ss03 = ss03;
    }

    public int getVa04() {
        return va04;
    }

    public void setVa04(int va04) {
        this.va04 = va04;
    }

    public int getMa02() {
        return ma02;
    }

    public void setMa02(int ma02) {
        this.ma02 = ma02;
    }

    public int getSs05() {
        return ss05;
    }

    public void setSs05(int ss05) {
        this.ss05 = ss05;
    }

    public int getSs02() {
        return ss02;
    }

    public void setSs02(int ss02) {
        this.ss02 = ss02;
    }

    public int getSs04() {
        return ss04;
    }

    public void setSs04(int ss04) {
        this.ss04 = ss04;
    }

    public int getVa03() {
        return va03;
    }

    public void setVa03(int va03) {
        this.va03 = va03;
    }

    public int getSs09() {
        return ss09;
    }

    public void setSs09(int ss09) {
        this.ss09 = ss09;
    }

    public int getSs21() {
        return ss21;
    }

    public void setSs21(int ss21) {
        this.ss21 = ss21;
    }

    public int getSs11() {
        return ss11;
    }

    public void setSs1(int ss11) {
        this.ss11 = ss11;
    }

    public int getMa03() {
        return ma03;
    }

    public void setMa03va02(int ma03) {
        this.ma03 = ma03;
    }
    public int getVa02() {
        return va02;
    }

    public void setVa02(int va02) {
        this.va02 = va02;
    }

    public int getSs08() {
        return ss08;
    }

    public void setSs08(int ss08) {
        this.ss08 = ss08;
    }

    public int getSs12() {
        return ss12;
    }

    public void setSs12(int ss12) {
        this.ss12 = ss12;
    }

    public int getSs10() {
        return ss10;
    }

    public void setSs10(int ss10) {
        this.ss10 = ss10;
    }

    public int getAd23() {
        return ad23;
    }

    public void setAd23(int ad23) {
        this.ad23 = ad23;
    }

    public int getIv02() {
        return iv02;
    }

    public void setIv02(int iv02) {
        this.iv02 = iv02;
    }

    public int getSs13() {
        return ss13;
    }

    public void setSs13(int ss13) {
        this.ss13 = ss13;
    }

    public int getSs15() {
        return ss15;
    }

    public void setSs15(int ss15) {
        this.ss15 = ss15;
    }

    public int getSs18() {
        return ss18;
    }

    public void setSs18(int ss18) {
        this.ss18 = ss18;
    }

    public int getSs14() {
        return ss14;
    }

    public void setSs14(int ss14) {
        this.ss14 = ss14;
    }

    public int getRh02() {
        return rh02;
    }

    public void setRh02(int rh02) {
        this.rh02 = rh02;
    }

    public int getVa05() {
        return va05;
    }

    public void setVa05(int va05) {
        this.va05 = va05;
    }

    public int getSs20() {
        return ss20;
    }

    public void setSs20(int ss20) {
        this.ss20 = ss20;
    }

    public int getSs17() {
        return ss17;
    }

    public void setSs17(int ss17) {
        this.ss17 = ss17;
    }

    public int getCm01() {
        return cm01;
    }

    public void setCm01(int cm01) {
        this.cm01 = cm01;
    }

    public int getCo02() {
        return co02;
    }

    public void setCo02(int co02) {
        this.co02 = co02;
    }

    

    public int getDe51() {
        return de51;
    }

    public void setDe51(int de51) {
        this.de51 = de51;
    }

    public int getAd13() {
        return ad13;
    }

    public void setAd13(int ad13) {
        this.ad13 = ad13;
    }

    public int getSs19() {
        return ss19;
    }

    public void setSs19(int ss19) {
        this.ss19 = ss19;
    }

    public int getSs16() {
        return ss16;
    }

    public void setSs16(int ss16) {
        this.ss16 = ss16;
    }

    public int getIv03() {
        return iv03;
    }

    public void setIv03(int iv03) {
        this.iv03 = iv03;
    }

    public int getRh03() {
        return rh03;
    }

    public void setRh03(int rh03) {
        this.rh03 = rh03;
    }

    public int getAd22() {
        return ad22;
    }

    public void setAd22(int ad22) {
        this.ad22 = ad22;
    }

    public int getIv01() {
        return iv01;
    }

    public void setIv01(int iv01) {
        this.iv01 = iv01;
    }
    public String convertidor(int n){
        String str = String.valueOf(n);
        return str;
    }
}
