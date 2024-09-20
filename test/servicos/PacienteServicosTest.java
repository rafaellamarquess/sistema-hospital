/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package servicos;

import static org.junit.Assert.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import modelo.Paciente;
import org.junit.Before;
import org.junit.Test;

public class PacienteServicosTest {

    private PacienteServicos pacienteServicos;

    @Before
    public void setUp() {
        // Inicializa o serviço antes de cada teste
        pacienteServicos = new PacienteServicos();
    }

    // Teste para cadastro de paciente com informações válidas
    @Test
    public void testCadastrarPacienteValido() throws SQLException {
        Paciente pac = new Paciente(16, "João da Silva", "Rua A, 123", new Date(), "99999999", "123.456.789-00", "", "", 1);
        
        try {
            pacienteServicos.cadastrarPaciente(pac);
            // Verifica se o paciente foi cadastrado (aqui você deve adaptar conforme sua lógica de persistência)
        } catch (Exception e) {
            fail("Cadastro de paciente falhou: " + e.getMessage());
        }
    }

    // Teste para verificar campos obrigatórios não preenchidos
    @Test
    public void testCadastrarPacienteComCamposInvalidos() {
        Paciente pac = new Paciente(0, "", "", null, "", "", "", "", 0);
        
        try {
            pacienteServicos.cadastrarPaciente(pac);
            fail("Cadastro deveria ter falhado devido a campos obrigatórios não preenchidos.");
        } catch (Exception e) {
            // Sucesso esperado
        }
    }

    // Teste para buscar paciente por filtro (CPF)
    @Test
    public void testBuscarPacienteFiltro() throws SQLException {
        ArrayList<Paciente> pacientes = pacienteServicos.buscarPacienteFiltro("cpf");
        assertNotNull("A lista de pacientes não deve ser nula", pacientes);
        assertFalse("A lista de pacientes deve conter elementos", pacientes.isEmpty());
    }

    // Teste para buscar todos os pacientes
    @Test
    public void testBuscarTodosOsPacientes() throws SQLException {
        ArrayList<Paciente> pacientes = pacienteServicos.buscarPaciente();
        assertNotNull("A lista de pacientes não deve ser nula", pacientes);
        assertTrue("A lista de pacientes deve conter pelo menos um paciente", pacientes.size() > 0);
    }

    // Teste para garantir que o sistema preencha automaticamente os dados dos pacientes
    @Test
    public void testPreenchimentoAutomatico() throws SQLException {
        // Aqui você deve implementar a lógica para verificar se os dados são preenchidos automaticamente.
        // Por exemplo, simular a abertura da janela e verificar se os dados estão disponíveis.
    }

    // Teste para filtro de pacientes por nome
    @Test
    public void testFiltrarPacientePorNome() throws SQLException {
        ArrayList<Paciente> pacientes = pacienteServicos.buscarPacienteFiltro("João");
        assertTrue("Deveria ter encontrado pacientes com nome 'João'", pacientes.size() > 0);
    }

    // Teste para limpar filtro
    @Test
    public void testLimparFiltro() throws SQLException {
        // Você deve implementar a lógica de limpeza de filtro e verificar se todos os pacientes são retornados.
        ArrayList<Paciente> pacientes = pacienteServicos.buscarPaciente();
        assertTrue("Deveria retornar todos os pacientes após limpar o filtro", pacientes.size() > 0);
    }
}

