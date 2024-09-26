package system;

import entities.Veiculo;
import exceptions.PlacaNaoExisteException;

import java.util.ArrayList;

public interface SistemaConcessionaria {
    public void CadastraVeiculo(Veiculo veiculo);
    public void removeVeiculo(String placa) throws PlacaNaoExisteException;
    public ArrayList<Veiculo> veiculosQueCustamEntre(double min, double max);
}