/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectologicadifusa;

/**
 *
 * @author RzSad
 */
public class Regla {

    private boolean tipoColor = false;
    private boolean tipoBlanca = false;
    private boolean tipoDeportiva = false;
    private boolean tipoToallas = false;
    private boolean tipoSabanas = false;
    
    
    private boolean pSucia = false;
    private boolean sucia = false;
    private boolean mSucia = false;
    private boolean eSucia = false;
    
    
    private boolean pequena = false;
    private boolean mediana = false;
    private boolean grande = false;
    private boolean masiva = false;
    
    
    private boolean fria = false;
    private boolean templada = false;
    private boolean calida = false;
    
    private boolean lMuyCorto = false;
    private boolean lCorto = false;
    private boolean lMedio = false;
    private boolean lLargo = false;
    private boolean lMuyLargo = false;
    
    
    private boolean eMuyCorto = false;
    private boolean eCorto = false;
    private boolean eMedio = false;
    private boolean eLargo = false;
    private boolean eMuyLargo = false;
    
    private boolean muyLento = false;
    private boolean bajo = false;
    private boolean medio = false;
    private boolean rapido = false;
    private boolean muyRapido = false;

    public Regla() {
    }
    public Regla(boolean tipoColor, boolean tipoBlanca,boolean tipoDeportiva,boolean tipoToallas, boolean tipoSabanas, 
            boolean pSucia, boolean sucia, boolean mSucia, boolean eSucia, boolean pequena,
            boolean mediana, boolean grande, boolean masiva, boolean fria, boolean templada, boolean calida, boolean lMuyCorto, boolean lCorto, 
            boolean lMedio, boolean lLargo, boolean lMuyLargo, boolean eMuyCorto, boolean eCorto, boolean eMedio, boolean eLargo, boolean eMuyLargo, 
            boolean muyLento, boolean bajo, boolean medio, boolean rapido, boolean muyRapido){
        this.tipoColor = tipoColor;
        this.tipoBlanca = tipoBlanca;
        this.tipoDeportiva = tipoDeportiva;
        this.tipoToallas = tipoToallas;
        this.tipoSabanas = tipoSabanas;
        this.pSucia = pSucia;
        this.sucia = sucia;
        this.mSucia = mSucia;
        this.eSucia = eSucia;
        this.pequena = pequena;
        this.mediana = mediana;
        this.grande = grande;
        this.masiva = masiva;
        this.fria = fria;
        this.templada = templada;
        this.calida = calida;
        this.lMuyCorto = lMuyCorto;
        this.lCorto = lCorto;
        this.lMedio = lMedio;
        this.lLargo = lLargo;
        this.lMuyLargo = lMuyLargo;
        this.eMuyCorto = eMuyCorto;
        this.eCorto = eCorto;
        this.eMedio = eMedio;
        this.eLargo = eLargo;
        this.eMuyLargo = eMuyLargo;
        this.muyLento = muyLento;
        this.bajo = bajo;
        this.medio = medio;
        this.rapido = rapido;
        this.muyRapido = muyRapido;
    }

    public boolean isTipoColor() {
        return tipoColor;
    }

    public void setTipoColor(boolean tipoColor) {
        this.tipoColor = tipoColor;
    }

    public boolean isTipoBlanca() {
        return tipoBlanca;
    }

    public void setTipoBlanca(boolean tipoBlanca) {
        this.tipoBlanca = tipoBlanca;
    }

    public boolean isTipoDeportiva() {
        return tipoDeportiva;
    }

    public void setTipoDeportiva(boolean tipoDeportiva) {
        this.tipoDeportiva = tipoDeportiva;
    }

    public boolean isTipoToallas() {
        return tipoToallas;
    }

    public void setTipoToallas(boolean tipoToallas) {
        this.tipoToallas = tipoToallas;
    }

    public boolean isTipoSabanas() {
        return tipoSabanas;
    }

    public void setTipoSabanas(boolean tipoSabanas) {
        this.tipoSabanas = tipoSabanas;
    }

    public boolean ispSucia() {
        return pSucia;
    }

    public void setpSucia(boolean pSucia) {
        this.pSucia = pSucia;
    }

    public boolean isSucia() {
        return sucia;
    }

    public void setSucia(boolean sucia) {
        this.sucia = sucia;
    }

    public boolean ismSucia() {
        return mSucia;
    }

    public void setmSucia(boolean mSucia) {
        this.mSucia = mSucia;
    }

    public boolean iseSucia() {
        return eSucia;
    }

    public void seteSucia(boolean eSucia) {
        this.eSucia = eSucia;
    }

    public boolean isPequena() {
        return pequena;
    }

    public void setPequena(boolean pequena) {
        this.pequena = pequena;
    }

    public boolean isMediana() {
        return mediana;
    }

    public void setMediana(boolean mediana) {
        this.mediana = mediana;
    }

    public boolean isGrande() {
        return grande;
    }

    public void setGrande(boolean grande) {
        this.grande = grande;
    }

    public boolean isMasiva() {
        return masiva;
    }

    public void setMasiva(boolean masiva) {
        this.masiva = masiva;
    }

    public boolean isFria() {
        return fria;
    }

    public void setFria(boolean fria) {
        this.fria = fria;
    }

    public boolean isTemplada() {
        return templada;
    }

    public void setTemplada(boolean templada) {
        this.templada = templada;
    }

    public boolean isCalida() {
        return calida;
    }

    public void setCalida(boolean calida) {
        this.calida = calida;
    }

    public boolean islMuyCorto() {
        return lMuyCorto;
    }

    public void setlMuyCorto(boolean lMuyCorto) {
        this.lMuyCorto = lMuyCorto;
    }

    public boolean islCorto() {
        return lCorto;
    }

    public void setlCorto(boolean lCorto) {
        this.lCorto = lCorto;
    }

    public boolean islMedio() {
        return lMedio;
    }

    public void setlMedio(boolean lMedio) {
        this.lMedio = lMedio;
    }

    public boolean islLargo() {
        return lLargo;
    }

    public void setlLargo(boolean lLargo) {
        this.lLargo = lLargo;
    }

    public boolean islMuyLargo() {
        return lMuyLargo;
    }

    public void setlMuyLargo(boolean lMuyLargo) {
        this.lMuyLargo = lMuyLargo;
    }

    public boolean iseMuyCorto() {
        return eMuyCorto;
    }

    public void seteMuyCorto(boolean eMuyCorto) {
        this.eMuyCorto = eMuyCorto;
    }

    public boolean iseCorto() {
        return eCorto;
    }

    public void seteCorto(boolean eCorto) {
        this.eCorto = eCorto;
    }

    public boolean iseMedio() {
        return eMedio;
    }

    public void seteMedio(boolean eMedio) {
        this.eMedio = eMedio;
    }

    public boolean iseLargo() {
        return eLargo;
    }

    public void seteLargo(boolean eLargo) {
        this.eLargo = eLargo;
    }

    public boolean iseMuyLargo() {
        return eMuyLargo;
    }

    public void seteMuyLargo(boolean eMuyLargo) {
        this.eMuyLargo = eMuyLargo;
    }

    public boolean isMuyLento() {
        return muyLento;
    }

    public void setMuyLento(boolean muyLento) {
        this.muyLento = muyLento;
    }

    public boolean isBajo() {
        return bajo;
    }

    public void setBajo(boolean bajo) {
        this.bajo = bajo;
    }

    public boolean isMedio() {
        return medio;
    }

    public void setMedio(boolean medio) {
        this.medio = medio;
    }

    public boolean isRapido() {
        return rapido;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    public boolean isMuyRapido() {
        return muyRapido;
    }

    public void setMuyRapido(boolean muyRapido) {
        this.muyRapido = muyRapido;
    }
    

}
