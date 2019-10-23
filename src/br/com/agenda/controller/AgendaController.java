package br.com.agenda.controller;

import br.com.agenda.dao.AgendaDAO;
import br.com.agenda.model.Agenda;
import java.sql.SQLException;
import java.util.List;

public class AgendaController {
    private Agenda agenda;
    private List<Agenda> lista;
    private AgendaDAO dao;
    
    
    public AgendaController() {
        dao = new AgendaDAO();
        novo();
    }
    
    public void listarAgenda() throws SQLException {
        lista = dao.listarAgenda();
    }
    
    public List<Agenda> getLista(){
        return lista;
    }
    
    public void buscarAgendaPorId(long id) throws SQLException {
        agenda = dao.buscaAgendaPorId(id);
    }
    
    public boolean deletarAgendaPorId(long id) throws SQLException{
        return dao.deletaAgendaPorId(id);
    }
    
    public boolean atualizarAgendaPorId(Agenda agenda) throws SQLException{
        return dao.atualizaAgendaPorId(agenda);
    }
    
    public Agenda getAgenda() {
        return agenda;
    }
    
    public void setAgenda() {
        this.agenda = agenda;
    }
    
    public void novo() {
        agenda = new Agenda();
    }
    
    public boolean salvarAgenda() {
        return dao.salvarAgenda(agenda);
    }
    
    public void sair() throws SQLException {
        dao.closeConnections();
    }
}
