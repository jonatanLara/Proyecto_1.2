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

    
     private String c001;
     private String ma01;
     private String in01;
     private String ma06;
     private String va01;
     private String ss06;
     private String ss01;
     private String ss07;
     private String ss03;
     private String va04;
     private String ma02;
     private String ss05;
     private String ss02;
     private String ss04;
     private String va03;
     private String ss09;
     private String ss21;
     private String ss11;
     private String ma03;
     private String va02;
     private String ss08;
     private String ss12;
     private String ss10;
     private String ad23;
     private String iv02;
     private String ss13;
     private String ss15;
     private String ss18;
     private String ss14;
     private String rh02;
     private String va05;
     private String ss20;
     private String ss17;
     private String cm01;
     private String co02;
     private String de51;
     private String ad13;
     private String ss19;
     private String ss16;
     private String iv03;
     private String rh03;
     private String ad22;
     private String iv01;
     private String ee01;
    
    public Calificaciones() {
    }
    /**
     *  Resive dos paremetro de tipo String (curs calificacion)
     *  (String curs.equals(curs)
     *      set(calificacion)
     *  @return el numero de periodos diferentes en total
     */
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
            System.out.println("-EE01- "+cal);
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

    /**
     * @return the c001
     */
    public String getC001() {
        return c001;
    }

    /**
     * @param c001 the c001 to set
     */
    public void setC001(String c001) {
        this.c001 = c001;
    }

    /**
     * @return the ma01
     */
    public String getMa01() {
        return ma01;
    }

    /**
     * @param ma01 the ma01 to set
     */
    public void setMa01(String ma01) {
        this.ma01 = ma01;
    }

    /**
     * @return the in01
     */
    public String getIn01() {
        return in01;
    }

    /**
     * @param in01 the in01 to set
     */
    public void setIn01(String in01) {
        this.in01 = in01;
    }

    /**
     * @return the ma06
     */
    public String getMa06() {
        return ma06;
    }

    /**
     * @param ma06 the ma06 to set
     */
    public void setMa06(String ma06) {
        this.ma06 = ma06;
    }

    /**
     * @return the va01
     */
    public String getVa01() {
        return va01;
    }

    /**
     * @param va01 the va01 to set
     */
    public void setVa01(String va01) {
        this.va01 = va01;
    }

    /**
     * @return the ss06
     */
    public String getSs06() {
        return ss06;
    }

    /**
     * @param ss06 the ss06 to set
     */
    public void setSs06(String ss06) {
        this.ss06 = ss06;
    }

    /**
     * @return the ss01
     */
    public String getSs01() {
        return ss01;
    }

    /**
     * @param ss01 the ss01 to set
     */
    public void setSs01(String ss01) {
        this.ss01 = ss01;
    }

    /**
     * @return the ss07
     */
    public String getSs07() {
        return ss07;
    }

    /**
     * @param ss07 the ss07 to set
     */
    public void setSs07(String ss07) {
        this.ss07 = ss07;
    }

    /**
     * @return the ss03
     */
    public String getSs03() {
        return ss03;
    }

    /**
     * @param ss03 the ss03 to set
     */
    public void setSs03(String ss03) {
        this.ss03 = ss03;
    }

    /**
     * @return the va04
     */
    public String getVa04() {
        return va04;
    }

    /**
     * @param va04 the va04 to set
     */
    public void setVa04(String va04) {
        this.va04 = va04;
    }

    /**
     * @return the ma02
     */
    public String getMa02() {
        return ma02;
    }

    /**
     * @param ma02 the ma02 to set
     */
    public void setMa02(String ma02) {
        this.ma02 = ma02;
    }

    /**
     * @return the ss05
     */
    public String getSs05() {
        return ss05;
    }

    /**
     * @param ss05 the ss05 to set
     */
    public void setSs05(String ss05) {
        this.ss05 = ss05;
    }

    /**
     * @return the ss02
     */
    public String getSs02() {
        return ss02;
    }

    /**
     * @param ss02 the ss02 to set
     */
    public void setSs02(String ss02) {
        this.ss02 = ss02;
    }

    /**
     * @return the ss04
     */
    public String getSs04() {
        return ss04;
    }

    /**
     * @param ss04 the ss04 to set
     */
    public void setSs04(String ss04) {
        this.ss04 = ss04;
    }

    /**
     * @return the va03
     */
    public String getVa03() {
        return va03;
    }

    /**
     * @param va03 the va03 to set
     */
    public void setVa03(String va03) {
        this.va03 = va03;
    }

    /**
     * @return the ss09
     */
    public String getSs09() {
        return ss09;
    }

    /**
     * @param ss09 the ss09 to set
     */
    public void setSs09(String ss09) {
        this.ss09 = ss09;
    }

    /**
     * @return the ss21
     */
    public String getSs21() {
        return ss21;
    }

    /**
     * @param ss21 the ss21 to set
     */
    public void setSs21(String ss21) {
        this.ss21 = ss21;
    }

    /**
     * @return the ss11
     */
    public String getSs11() {
        return ss11;
    }

    /**
     * @param ss11 the ss11 to set
     */
    public void setSs11(String ss11) {
        this.ss11 = ss11;
    }

    /**
     * @return the ma03
     */
    public String getMa03() {
        return ma03;
    }

    /**
     * @param ma03 the ma03 to set
     */
    public void setMa03(String ma03) {
        this.ma03 = ma03;
    }

    /**
     * @return the va02
     */
    public String getVa02() {
        return va02;
    }

    /**
     * @param va02 the va02 to set
     */
    public void setVa02(String va02) {
        this.va02 = va02;
    }

    /**
     * @return the ss08
     */
    public String getSs08() {
        return ss08;
    }

    /**
     * @param ss08 the ss08 to set
     */
    public void setSs08(String ss08) {
        this.ss08 = ss08;
    }

    /**
     * @return the ss12
     */
    public String getSs12() {
        return ss12;
    }

    /**
     * @param ss12 the ss12 to set
     */
    public void setSs12(String ss12) {
        this.ss12 = ss12;
    }

    /**
     * @return the ss10
     */
    public String getSs10() {
        return ss10;
    }

    /**
     * @param ss10 the ss10 to set
     */
    public void setSs10(String ss10) {
        this.ss10 = ss10;
    }

    /**
     * @return the ad23
     */
    public String getAd23() {
        return ad23;
    }

    /**
     * @param ad23 the ad23 to set
     */
    public void setAd23(String ad23) {
        this.ad23 = ad23;
    }

    /**
     * @return the iv02
     */
    public String getIv02() {
        return iv02;
    }

    /**
     * @param iv02 the iv02 to set
     */
    public void setIv02(String iv02) {
        this.iv02 = iv02;
    }

    /**
     * @return the ss13
     */
    public String getSs13() {
        return ss13;
    }

    /**
     * @param ss13 the ss13 to set
     */
    public void setSs13(String ss13) {
        this.ss13 = ss13;
    }

    /**
     * @return the ss15
     */
    public String getSs15() {
        return ss15;
    }

    /**
     * @param ss15 the ss15 to set
     */
    public void setSs15(String ss15) {
        this.ss15 = ss15;
    }

    /**
     * @return the ss18
     */
    public String getSs18() {
        return ss18;
    }

    /**
     * @param ss18 the ss18 to set
     */
    public void setSs18(String ss18) {
        this.ss18 = ss18;
    }

    /**
     * @return the ss14
     */
    public String getSs14() {
        return ss14;
    }

    /**
     * @param ss14 the ss14 to set
     */
    public void setSs14(String ss14) {
        this.ss14 = ss14;
    }

    /**
     * @return the rh02
     */
    public String getRh02() {
        return rh02;
    }

    /**
     * @param rh02 the rh02 to set
     */
    public void setRh02(String rh02) {
        this.rh02 = rh02;
    }

    /**
     * @return the va05
     */
    public String getVa05() {
        return va05;
    }

    /**
     * @param va05 the va05 to set
     */
    public void setVa05(String va05) {
        this.va05 = va05;
    }

    /**
     * @return the ss20
     */
    public String getSs20() {
        return ss20;
    }

    /**
     * @param ss20 the ss20 to set
     */
    public void setSs20(String ss20) {
        this.ss20 = ss20;
    }

    /**
     * @return the ss17
     */
    public String getSs17() {
        return ss17;
    }

    /**
     * @param ss17 the ss17 to set
     */
    public void setSs17(String ss17) {
        this.ss17 = ss17;
    }

    /**
     * @return the cm01
     */
    public String getCm01() {
        return cm01;
    }

    /**
     * @param cm01 the cm01 to set
     */
    public void setCm01(String cm01) {
        this.cm01 = cm01;
    }

    /**
     * @return the co02
     */
    public String getCo02() {
        return co02;
    }

    /**
     * @param co02 the co02 to set
     */
    public void setCo02(String co02) {
        this.co02 = co02;
    }

    /**
     * @return the de51
     */
    public String getDe51() {
        return de51;
    }

    /**
     * @param de51 the de51 to set
     */
    public void setDe51(String de51) {
        this.de51 = de51;
    }

    /**
     * @return the ad13
     */
    public String getAd13() {
        return ad13;
    }

    /**
     * @param ad13 the ad13 to set
     */
    public void setAd13(String ad13) {
        this.ad13 = ad13;
    }

    /**
     * @return the ss19
     */
    public String getSs19() {
        return ss19;
    }

    /**
     * @param ss19 the ss19 to set
     */
    public void setSs19(String ss19) {
        this.ss19 = ss19;
    }

    /**
     * @return the ss16
     */
    public String getSs16() {
        return ss16;
    }

    /**
     * @param ss16 the ss16 to set
     */
    public void setSs16(String ss16) {
        this.ss16 = ss16;
    }

    /**
     * @return the iv03
     */
    public String getIv03() {
        return iv03;
    }

    /**
     * @param iv03 the iv03 to set
     */
    public void setIv03(String iv03) {
        this.iv03 = iv03;
    }

    /**
     * @return the rh03
     */
    public String getRh03() {
        return rh03;
    }

    /**
     * @param rh03 the rh03 to set
     */
    public void setRh03(String rh03) {
        this.rh03 = rh03;
    }

    /**
     * @return the ad22
     */
    public String getAd22() {
        return ad22;
    }

    /**
     * @param ad22 the ad22 to set
     */
    public void setAd22(String ad22) {
        this.ad22 = ad22;
    }

    /**
     * @return the iv01
     */
    public String getIv01() {
        return iv01;
    }

    /**
     * @param iv01 the iv01 to set
     */
    public void setIv01(String iv01) {
        this.iv01 = iv01;
    }

    /**
     * @return the ee01
     */
    public String getEe01() {
        return ee01;
    }

    /**
     * @param ee01 the ee01 to set
     */
    public void setEe01(String ee01) {
        this.ee01 = ee01;
    }

    
    
}
