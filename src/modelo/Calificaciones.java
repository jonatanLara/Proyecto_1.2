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
public class Calificaciones {

    
    private String c001,ma01,in01,ma06,va01,ss06,ss01,ss07,ss03,va04,ma02,ss05,ss02,ss04,va03,ss09,ss21,ss11,ma03,va02,ss08,ss12,ss10,ad23,iv02,ss13
            ,ss15,ss18,ss14,rh02,va05,ss20,ss17,cm01,co02,de51,ad13,ss19,ss16,iv03,rh03,ad22,iv01,ee01;
    
    public Calificaciones() {
    }
    
    public void Comprobar(String aux ,String cal){
        if (aux.equals("CO01")) {
            setC001(cal);
        }
        if (aux.equals("MA01")) {
            setMa01(cal);
        }
        if (aux.equals("IN01")) {
            setIn01(cal);
        }
        if (aux.equals("MA06")) {
            setMa06(cal);
        }
        if (aux.equals("VA01")) {
            setVa01(cal);
        }
        if (aux.equals("SS06")) {
            setSs06(cal);
        }
        if (aux.equals("SS01")) {
            setSs01(cal);
        }
        if (aux.equals("SS07")) {
            setSs07(cal);
        }
        if (aux.equals("SS03")) {
            setSs03(cal);
        }
        if (aux.equals("VA04")) {
            setVa04(cal);
        }/*-------------------*/
        if (aux.equals("MA02")) {
           setMa02(cal);
        }
        if (aux.equals("SS05")) {
            setSs05(cal);
        }
        if (aux.equals("SS02")) {
            setSs02(cal);
        }
        if (aux.equals("SS04")) {
            setSs04(cal);
        }
        if (aux.equals("VA03")) {
            setVa03(cal);
        }/*-------------------*/
        if (aux.equals("SS09")) {
            setSs09(cal);
        }
        if (aux.equals("SS21")) {
            setSs21(cal);
        }
        if (aux.equals("SS11")) {
            setSs11(cal);
        }
        if (aux.equals("MA03")) {
            setMa03(cal);
        }
        if (aux.equals("VA02")) {
            setVa02(cal);
        }/*-------------------*/
        if (aux.equals("SS08")) {
            setSs08(cal);
        }
        if (aux.equals("SS12")) {
            setSs12(cal);
        }
        if (aux.equals("SS10")) {
            setSs10(cal);
        }
        if (aux.equals("AD23")) {
            setAd23(cal);
        }
        if (aux.equals("IV02")) {
            setIv02(cal);
        }/*-------------------*/
        if (aux.equals("EE01")) {
            setEe01(cal);
        }/*-------------------*/
         if (aux.equals("SS13")) {
            setSs13(cal);
        }
        if (aux.equals("SS15")) {
            setSs15(cal);
        }
        if (aux.equals("SS18")) {
           setSs18(cal); 
        }
        if (aux.equals("SS14")) {
            setSs14(cal);
        }
        if (aux.equals("RH02")) {
            setRh02(cal);
        }
        if (aux.equals("VA05")) {
            setVa05(cal);
        }/*-------------------*/
         if (aux.equals("SS20")) {
            setSs20(cal);
        }
        if (aux.equals("SS17")) {
            setSs17(cal);
        }
        if (aux.equals("CM01")) {
            setCm01(cal);
        }
        if (aux.equals("CO02")) {
            setCo02(cal);
        }
        if (aux.equals("DE51")) {
            setDe51(cal);
        }
        if (aux.equals("AD13")) {
            setAd13(cal);
        }/*-------------------*/
         if (aux.equals("SS19")) {
            setSs19(cal);
        }
        if (aux.equals("SS16")) {
            setSs16(cal);
        }
        if (aux.equals("IV03")) {
            setIv03(cal);      
        }
        if (aux.equals("RH03")) {
            setRh03(cal);
        }
        if (aux.equals("AD22")) {
            setAd22(cal);
        }
        if (aux.equals("IV01")) {
            setIv01(cal);
        }/*-------------------*/
        
    }

    public String getC001() {
        return c001;
    }

    public void setC001(String c001) {
        this.c001 = c001;
    }

    public String getMa01() {
        return ma01;
    }

    public void setMa01(String ma01) {
        this.ma01 = ma01;
    }

    public String getIn01() {
        return in01;
    }

    public void setIn01(String in01) {
        this.in01 = in01;
    }

    public String getMa06() {
        return ma06;
    }

    public void setMa06(String ma06) {
        this.ma06 = ma06;
    }

    public String getVa01() {
        return va01;
    }

    public void setVa01(String va01) {
        this.va01 = va01;
    }

    public String getSs06() {
        return ss06;
    }

    public void setSs06(String ss06) {
        this.ss06 = ss06;
    }

    public String getSs01() {
        return ss01;
    }

    public void setSs01(String ss01) {
        this.ss01 = ss01;
    }

    public String getSs07() {
        return ss07;
    }

    public void setSs07(String ss07) {
        this.ss07 = ss07;
    }

    public String getSs03() {
        return ss03;
    }

    public void setSs03(String ss03) {
        this.ss03 = ss03;
    }

    public String getVa04() {
        return va04;
    }

    public void setVa04(String va04) {
        this.va04 = va04;
    }

    public String getMa02() {
        return ma02;
    }

    public void setMa02(String ma02) {
        this.ma02 = ma02;
    }

    public String getSs05() {
        return ss05;
    }

    public void setSs05(String ss05) {
        this.ss05 = ss05;
    }

    public String getSs02() {
        return ss02;
    }

    public void setSs02(String ss02) {
        this.ss02 = ss02;
    }

    public String getSs04() {
        return ss04;
    }

    public void setSs04(String ss04) {
        this.ss04 = ss04;
    }

    public String getVa03() {
        return va03;
    }

    public void setVa03(String va03) {
        this.va03 = va03;
    }

    public String getSs09() {
        return ss09;
    }

    public void setSs09(String ss09) {
        this.ss09 = ss09;
    }

    public String getSs21() {
        return ss21;
    }

    public void setSs21(String ss21) {
        this.ss21 = ss21;
    }

    public String getSs11() {
        return ss11;
    }

    public void setSs11(String ss11) {
        this.ss11 = ss11;
    }

    public String getMa03() {
        return ma03;
    }

    public void setMa03(String ma03) {
        this.ma03 = ma03;
    }

    public String getVa02() {
        return va02;
    }

    public void setVa02(String va02) {
        this.va02 = va02;
    }

    public String getSs08() {
        return ss08;
    }

    public void setSs08(String ss08) {
        this.ss08 = ss08;
    }

    public String getSs12() {
        return ss12;
    }

    public void setSs12(String ss12) {
        this.ss12 = ss12;
    }

    public String getSs10() {
        return ss10;
    }

    public void setSs10(String ss10) {
        this.ss10 = ss10;
    }

    public String getAd23() {
        return ad23;
    }

    public void setAd23(String ad23) {
        this.ad23 = ad23;
    }

    public String getIv02() {
        return iv02;
    }

    public void setIv02(String iv02) {
        this.iv02 = iv02;
    }

    public String getSs13() {
        return ss13;
    }

    public void setSs13(String ss13) {
        this.ss13 = ss13;
    }

    public String getSs15() {
        return ss15;
    }

    public void setSs15(String ss15) {
        this.ss15 = ss15;
    }

    public String getSs18() {
        return ss18;
    }

    public void setSs18(String ss18) {
        this.ss18 = ss18;
    }

    public String getSs14() {
        return ss14;
    }

    public void setSs14(String ss14) {
        this.ss14 = ss14;
    }

    public String getRh02() {
        return rh02;
    }

    public void setRh02(String rh02) {
        this.rh02 = rh02;
    }

    public String getVa05() {
        return va05;
    }

    public void setVa05(String va05) {
        this.va05 = va05;
    }

    public String getSs20() {
        return ss20;
    }

    public void setSs20(String ss20) {
        this.ss20 = ss20;
    }

    public String getSs17() {
        return ss17;
    }

    public void setSs17(String ss17) {
        this.ss17 = ss17;
    }

    public String getCm01() {
        return cm01;
    }

    public void setCm01(String cm01) {
        this.cm01 = cm01;
    }

    public String getCo02() {
        return co02;
    }

    public void setCo02(String co02) {
        this.co02 = co02;
    }

    public String getDe51() {
        return de51;
    }

    public void setDe51(String de51) {
        this.de51 = de51;
    }

    public String getAd13() {
        return ad13;
    }

    public void setAd13(String ad13) {
        this.ad13 = ad13;
    }

    public String getSs19() {
        return ss19;
    }

    public void setSs19(String ss19) {
        this.ss19 = ss19;
    }

    public String getSs16() {
        return ss16;
    }

    public void setSs16(String ss16) {
        this.ss16 = ss16;
    }

    public String getIv03() {
        return iv03;
    }

    public void setIv03(String iv03) {
        this.iv03 = iv03;
    }

    public String getRh03() {
        return rh03;
    }

    public void setRh03(String rh03) {
        this.rh03 = rh03;
    }

    public String getAd22() {
        return ad22;
    }

    public void setAd22(String ad22) {
        this.ad22 = ad22;
    }

    public String getIv01() {
        return iv01;
    }

    public void setIv01(String iv01) {
        this.iv01 = iv01;
    }

    public String getEe01() {
        return ee01;
    }

    public void setEe01(String ee01) {
        this.ee01 = ee01;
    }
    
}
