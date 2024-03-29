package drsolutions.pontointeligente.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import drsolutions.pontointeligente.api.entities.Lancamento;

/**
 * Interface para a implementação do serviço LancamentoServiceImpl.
 * 
 * @author Diego M. Rodrigues
 *
 */
public interface LancamentoService {

	/**
	 * Retorna uma lista com todos os lançamentos de um determinado funcionário.
	 * 
	 * @param funcionarioId
	 * @return List<Lancamento>
	 */
	List<Lancamento> buscarPorFuncionarioId(Long funcionarioId);

	/**
	 * Retorna uma lista paginada de lançamentos de um determinado funcionário.
	 * 
	 * @param funcionarioId
	 * @param pageRequest
	 * @return Page<Lancamento>
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);

	/**
	 * Retorna um lançamento por Id
	 * 
	 * @param id
	 * @return Optional<Lancamento>
	 */
	Optional<Lancamento> buscarPorId(Long id);

	/**
	 * Persiste um lançamento na base de dados
	 * 
	 * @param lancamento
	 * @return Lancamento
	 */
	Lancamento persistir(Lancamento lancamento);

	/**
	 * Remove um lançamento da base de dados
	 * 
	 * @param id
	 */
	void remover(Long id);
}
