package br.com.targettrust.traccadastros.service;

import br.com.targettrust.traccadastros.entidades.Veiculo;
import br.com.targettrust.traccadastros.repositorio.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Optional<Veiculo> findAvailabilityByModelo(Long locacaoId, Long reservaId, String modelo, LocalDate dataInicial, LocalDate dataFinal) {
        return veiculoRepository.findAvailabilityByModelo(locacaoId, reservaId, modelo, dataInicial, dataFinal);
    }
}
