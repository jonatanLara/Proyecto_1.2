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

    private int c001;
    private int ma01;
    private int in01;
    private int ma06;
    private int va01;
    private int ss06;
    private int ss01;
    private int ss07;
    private int ss03;
    private int va04;
    private int ma02;
    private int ss05;
    private int ss02;
    private int ss04;
    private int va03;
    private int ss09;
    private int ss21;
    private int ss11;
    private int ma03;
    private int va02;
    private int ss08;
    private int ss12;
    private int ss10;
    private int ad23;
    private int iv02;
    private int ss13;
    private int ss15;
    private int ss18;
    private int ss14;
    private int rh02;
    private int va05;
    private int ss20;
    private int ss17;
    private int cm01;
    private int co02;
    private int de51;
    private int ad13;
    private int ss19;
    private int ss16;
    private int iv03;
    private int rh03;
    private int ad22;
    private int iv01;
    private int ee01;

    public Repetidor1() {
    }

    private void Comprobar(String sTexto, String sTextoBuscado, int contador) {

        while (sTexto.indexOf(sTextoBuscado) > -1) {
            sTexto = sTexto.substring(sTexto.indexOf(
                    sTextoBuscado) + sTextoBuscado.length(), sTexto.length());
            contador++;
        }
            //System.out.println(contador);

    }

    /**
     * Resive un paremetro de tipo String Comprobar(String aux)
     * (String curs.equals(curs) 
     * set(getCalificacion++)
     * @return el numero de periodos diferentes en total
     */
    public void Comprobar(String aux) {
        if (aux.equals("CO01")) {
            setC001(getC001() + 1);
        }
        if (aux.equals("MA01")) {
            setMa01(getMa01() + 1);
        }
        if (aux.equals("IN01")) {
            setIn01(getIn01() + 1);
        }
        if (aux.equals("MA06")) {
            setMa06(getMa06() + 1);
        }
        if (aux.equals("VA01")) {
            setVa01(getVa01() + 1);
        }
        if (aux.equals("SS06")) {
            setSs06(getSs06() + 1);
        }
        if (aux.equals("SS01")) {
            setSs01(getSs01() + 1);
        }
        if (aux.equals("SS07")) {
            setSs07(getSs07() + 1);
        }
        if (aux.equals("SS03")) {
            setSs03(getSs03() + 1);
        }
        if (aux.equals("VA04")) {
            setVa04(getVa04() + 1);
        }/*-------------------*/

        if (aux.equals("MA02")) {
            setMa02(getMa02() + 1);
        }
        if (aux.equals("SS05")) {
            setSs05(getSs05() + 1);
        }
        if (aux.equals("SS02")) {
            setSs02(getSs02() + 1);
        }
        if (aux.equals("SS04")) {
            setSs04(getSs04() + 1);
        }
        if (aux.equals("VA03")) {
            setVa03(getVa03() + 1);
        }/*-------------------*/

        if (aux.equals("SS09")) {
            setSs09(getSs09() + 1);
        }
        if (aux.equals("SS21")) {
            setSs21(getSs21() + 1);
        }
        if (aux.equals("SS11")) {
            setSs11(getSs11() + 1);
        }
        if (aux.equals("MA03")) {
            setMa03(getMa03() + 1);
        }
        if (aux.equals("VA02")) {
            setVa02(getVa02() + 1);
        }/*-------------------*/

        if (aux.equals("SS08")) {
            setSs08(getSs08() + 1);
        }
        if (aux.equals("SS12")) {
            setSs12(getSs12() + 1);
        }
        if (aux.equals("SS10")) {
            setSs10(getSs10() + 1);
        }
        if (aux.equals("AD23")) {
            setAd23(getAd23() + 1);
        }
        if (aux.equals("IV02")) {
            setIv02(getIv02() + 1);
        }/*-------------------*/

        if (aux.equals("EE01")) {
            setEe01(getEe01() + 1);
        }/*-------------------*/

        if (aux.equals("SS13")) {
            setSs13(getSs13() + 1);
        }
        if (aux.equals("SS15")) {
            setSs15(getSs15() + 1);
        }
        if (aux.equals("SS18")) {
            setSs18(getSs18() + 1);
        }
        if (aux.equals("SS14")) {
            setSs14(getSs14() + 1);
        }
        if (aux.equals("RH02")) {
            setRh02(getRh02() + 1);
        }
        if (aux.equals("VA05")) {
            setVa05(getVa05() + 1);
        }/*-------------------*/

        if (aux.equals("SS20")) {
            setSs20(getSs20() + 1);
        }
        if (aux.equals("SS17")) {
            setSs17(getSs17() + 1);
        }
        if (aux.equals("CM01")) {
            setCm01(getCm01() + 1);
        }
        if (aux.equals("CO02")) {
            setCo02(getCo02() + 1);
        }
        if (aux.equals("DE51")) {
            setDe51(getDe51() + 1);
        }
        if (aux.equals("AD13")) {
            setAd13(getAd13() + 1);
        }/*-------------------*/

        if (aux.equals("SS19")) {
            setSs19(getSs19() + 1);
        }
        if (aux.equals("SS16")) {
            setSs16(getSs16() + 1);
        }
        if (aux.equals("IV03")) {
            setIv03(getIv03() + 1);
        }
        if (aux.equals("RH03")) {
            setRh03(getRh03() + 1);
        }
        if (aux.equals("AD22")) {
            setAd22(getAd22() + 1);
        }
        if (aux.equals("IV01")) {
            setIv01(getIv01() + 1);
        }/*-------------------*/

    }

    public String convertidor(int n) {
        String str = String.valueOf(n);
        return str;
    }

    /**
     * @return the c001
     */
    public int getC001() {
        return c001;
    }

    /**
     * @param c001 the c001 to set
     */
    public void setC001(int c001) {
        this.c001 = c001;
    }

    /**
     * @return the ma01
     */
    public int getMa01() {
        return ma01;
    }

    /**
     * @param ma01 the ma01 to set
     */
    public void setMa01(int ma01) {
        this.ma01 = ma01;
    }

    /**
     * @return the in01
     */
    public int getIn01() {
        return in01;
    }

    /**
     * @param in01 the in01 to set
     */
    public void setIn01(int in01) {
        this.in01 = in01;
    }

    /**
     * @return the ma06
     */
    public int getMa06() {
        return ma06;
    }

    /**
     * @param ma06 the ma06 to set
     */
    public void setMa06(int ma06) {
        this.ma06 = ma06;
    }

    /**
     * @return the va01
     */
    public int getVa01() {
        return va01;
    }

    /**
     * @param va01 the va01 to set
     */
    public void setVa01(int va01) {
        this.va01 = va01;
    }

    /**
     * @return the ss06
     */
    public int getSs06() {
        return ss06;
    }

    /**
     * @param ss06 the ss06 to set
     */
    public void setSs06(int ss06) {
        this.ss06 = ss06;
    }

    /**
     * @return the ss01
     */
    public int getSs01() {
        return ss01;
    }

    /**
     * @param ss01 the ss01 to set
     */
    public void setSs01(int ss01) {
        this.ss01 = ss01;
    }

    /**
     * @return the ss07
     */
    public int getSs07() {
        return ss07;
    }

    /**
     * @param ss07 the ss07 to set
     */
    public void setSs07(int ss07) {
        this.ss07 = ss07;
    }

    /**
     * @return the ss03
     */
    public int getSs03() {
        return ss03;
    }

    /**
     * @param ss03 the ss03 to set
     */
    public void setSs03(int ss03) {
        this.ss03 = ss03;
    }

    /**
     * @return the va04
     */
    public int getVa04() {
        return va04;
    }

    /**
     * @param va04 the va04 to set
     */
    public void setVa04(int va04) {
        this.va04 = va04;
    }

    /**
     * @return the ma02
     */
    public int getMa02() {
        return ma02;
    }

    /**
     * @param ma02 the ma02 to set
     */
    public void setMa02(int ma02) {
        this.ma02 = ma02;
    }

    /**
     * @return the ss05
     */
    public int getSs05() {
        return ss05;
    }

    /**
     * @param ss05 the ss05 to set
     */
    public void setSs05(int ss05) {
        this.ss05 = ss05;
    }

    /**
     * @return the ss02
     */
    public int getSs02() {
        return ss02;
    }

    /**
     * @param ss02 the ss02 to set
     */
    public void setSs02(int ss02) {
        this.ss02 = ss02;
    }

    /**
     * @return the ss04
     */
    public int getSs04() {
        return ss04;
    }

    /**
     * @param ss04 the ss04 to set
     */
    public void setSs04(int ss04) {
        this.ss04 = ss04;
    }

    /**
     * @return the va03
     */
    public int getVa03() {
        return va03;
    }

    /**
     * @param va03 the va03 to set
     */
    public void setVa03(int va03) {
        this.va03 = va03;
    }

    /**
     * @return the ss09
     */
    public int getSs09() {
        return ss09;
    }

    /**
     * @param ss09 the ss09 to set
     */
    public void setSs09(int ss09) {
        this.ss09 = ss09;
    }

    /**
     * @return the ss21
     */
    public int getSs21() {
        return ss21;
    }

    /**
     * @param ss21 the ss21 to set
     */
    public void setSs21(int ss21) {
        this.ss21 = ss21;
    }

    /**
     * @return the ss11
     */
    public int getSs11() {
        return ss11;
    }

    /**
     * @param ss11 the ss11 to set
     */
    public void setSs11(int ss11) {
        this.ss11 = ss11;
    }

    /**
     * @return the ma03
     */
    public int getMa03() {
        return ma03;
    }

    /**
     * @param ma03 the ma03 to set
     */
    public void setMa03(int ma03) {
        this.ma03 = ma03;
    }

    /**
     * @return the va02
     */
    public int getVa02() {
        return va02;
    }

    /**
     * @param va02 the va02 to set
     */
    public void setVa02(int va02) {
        this.va02 = va02;
    }

    /**
     * @return the ss08
     */
    public int getSs08() {
        return ss08;
    }

    /**
     * @param ss08 the ss08 to set
     */
    public void setSs08(int ss08) {
        this.ss08 = ss08;
    }

    /**
     * @return the ss12
     */
    public int getSs12() {
        return ss12;
    }

    /**
     * @param ss12 the ss12 to set
     */
    public void setSs12(int ss12) {
        this.ss12 = ss12;
    }

    /**
     * @return the ss10
     */
    public int getSs10() {
        return ss10;
    }

    /**
     * @param ss10 the ss10 to set
     */
    public void setSs10(int ss10) {
        this.ss10 = ss10;
    }

    /**
     * @return the ad23
     */
    public int getAd23() {
        return ad23;
    }

    /**
     * @param ad23 the ad23 to set
     */
    public void setAd23(int ad23) {
        this.ad23 = ad23;
    }

    /**
     * @return the iv02
     */
    public int getIv02() {
        return iv02;
    }

    /**
     * @param iv02 the iv02 to set
     */
    public void setIv02(int iv02) {
        this.iv02 = iv02;
    }

    /**
     * @return the ss13
     */
    public int getSs13() {
        return ss13;
    }

    /**
     * @param ss13 the ss13 to set
     */
    public void setSs13(int ss13) {
        this.ss13 = ss13;
    }

    /**
     * @return the ss15
     */
    public int getSs15() {
        return ss15;
    }

    /**
     * @param ss15 the ss15 to set
     */
    public void setSs15(int ss15) {
        this.ss15 = ss15;
    }

    /**
     * @return the ss18
     */
    public int getSs18() {
        return ss18;
    }

    /**
     * @param ss18 the ss18 to set
     */
    public void setSs18(int ss18) {
        this.ss18 = ss18;
    }

    /**
     * @return the ss14
     */
    public int getSs14() {
        return ss14;
    }

    /**
     * @param ss14 the ss14 to set
     */
    public void setSs14(int ss14) {
        this.ss14 = ss14;
    }

    /**
     * @return the rh02
     */
    public int getRh02() {
        return rh02;
    }

    /**
     * @param rh02 the rh02 to set
     */
    public void setRh02(int rh02) {
        this.rh02 = rh02;
    }

    /**
     * @return the va05
     */
    public int getVa05() {
        return va05;
    }

    /**
     * @param va05 the va05 to set
     */
    public void setVa05(int va05) {
        this.va05 = va05;
    }

    /**
     * @return the ss20
     */
    public int getSs20() {
        return ss20;
    }

    /**
     * @param ss20 the ss20 to set
     */
    public void setSs20(int ss20) {
        this.ss20 = ss20;
    }

    /**
     * @return the ss17
     */
    public int getSs17() {
        return ss17;
    }

    /**
     * @param ss17 the ss17 to set
     */
    public void setSs17(int ss17) {
        this.ss17 = ss17;
    }

    /**
     * @return the cm01
     */
    public int getCm01() {
        return cm01;
    }

    /**
     * @param cm01 the cm01 to set
     */
    public void setCm01(int cm01) {
        this.cm01 = cm01;
    }

    /**
     * @return the co02
     */
    public int getCo02() {
        return co02;
    }

    /**
     * @param co02 the co02 to set
     */
    public void setCo02(int co02) {
        this.co02 = co02;
    }

    /**
     * @return the de51
     */
    public int getDe51() {
        return de51;
    }

    /**
     * @param de51 the de51 to set
     */
    public void setDe51(int de51) {
        this.de51 = de51;
    }

    /**
     * @return the ad13
     */
    public int getAd13() {
        return ad13;
    }

    /**
     * @param ad13 the ad13 to set
     */
    public void setAd13(int ad13) {
        this.ad13 = ad13;
    }

    /**
     * @return the ss19
     */
    public int getSs19() {
        return ss19;
    }

    /**
     * @param ss19 the ss19 to set
     */
    public void setSs19(int ss19) {
        this.ss19 = ss19;
    }

    /**
     * @return the ss16
     */
    public int getSs16() {
        return ss16;
    }

    /**
     * @param ss16 the ss16 to set
     */
    public void setSs16(int ss16) {
        this.ss16 = ss16;
    }

    /**
     * @return the iv03
     */
    public int getIv03() {
        return iv03;
    }

    /**
     * @param iv03 the iv03 to set
     */
    public void setIv03(int iv03) {
        this.iv03 = iv03;
    }

    /**
     * @return the rh03
     */
    public int getRh03() {
        return rh03;
    }

    /**
     * @param rh03 the rh03 to set
     */
    public void setRh03(int rh03) {
        this.rh03 = rh03;
    }

    /**
     * @return the ad22
     */
    public int getAd22() {
        return ad22;
    }

    /**
     * @param ad22 the ad22 to set
     */
    public void setAd22(int ad22) {
        this.ad22 = ad22;
    }

    /**
     * @return the iv01
     */
    public int getIv01() {
        return iv01;
    }

    /**
     * @param iv01 the iv01 to set
     */
    public void setIv01(int iv01) {
        this.iv01 = iv01;
    }

    /**
     * @return the ee01
     */
    public int getEe01() {
        return ee01;
    }

    /**
     * @param ee01 the ee01 to set
     */
    public void setEe01(int ee01) {
        this.ee01 = ee01;
    }
}
