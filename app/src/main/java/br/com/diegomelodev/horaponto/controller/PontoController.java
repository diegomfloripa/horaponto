package br.com.diegomelodev.horaponto.controller;

import java.util.List;

import br.com.diegomelodev.horaponto.model.Ponto;
import br.com.diegomelodev.horaponto.util.DateUtil;

/**
 * Created by Diego on 12/07/2016.
 */
public class PontoController {

    private String textoOrdemPonto;

    public void save() {
        List<Ponto> pontos = findAllByDay(DateUtil.diaAtual());
        int ordem = pontos.size() +1;
        Ponto.save(new Ponto(ordem));
    }

    public List<Ponto> findAllByDay(Integer dia) {
        return Ponto.find(Ponto.class, "dia = ? and mes = ?", String.valueOf(dia), String.valueOf(DateUtil.mesAtual()));
    }

    public String getTextoOrdemPonto() {
        List<Ponto> pontos = findAllByDay(DateUtil.diaAtual());
        switch (pontos.size()){
            case 0:
                return "Início do dia";
            case 1:
                return "Fim da manhã";
            case 2:
                return "Início do tarde";
            case 3:
                return "Fim do dia";
            default:
                return "Já bateu " + pontos.size() + " pontos hoje nego. Vai pra casa vai...";
        }
    }
}
