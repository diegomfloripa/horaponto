package br.com.diegomelodev.horaponto.model;

import com.orm.SugarRecord;

import java.util.Date;

import br.com.diegomelodev.horaponto.util.DateUtil;

/**
 * Created by Diego on 12/07/2016.
 */
public class Ponto extends SugarRecord {
    private Date data;
    private Integer mes;
    private Integer dia;
    private Integer hora;
    private Integer minuto;
    private Integer ordem;

    public Ponto() {

    }

    public Ponto(Integer ordem) {
        this.data = new Date();
        this.mes = DateUtil.mesAtual();
        this.dia = DateUtil.diaAtual();
        this.hora = DateUtil.horaAtual();
        this.minuto = DateUtil.minutoAtual();
        this.ordem = ordem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }
}
