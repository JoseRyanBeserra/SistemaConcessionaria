package system;

import entities.Veiculo;
import exceptions.PlacaNaoExisteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SistemaConcessionariaDeRyan implements SistemaConcessionaria {
    private Map<String, Veiculo> mapDeVeiculos;

    public SistemaConcessionariaDeRyan(Map<String, Veiculo> mapDeVeiculos){
        this.mapDeVeiculos = mapDeVeiculos;
    }
    public SistemaConcessionariaDeRyan(){
        Map<String, Veiculo> novoMap = new HashMap<>();
        this.mapDeVeiculos = novoMap;
    }
    public void CadastraVeiculo(Veiculo veiculo){
        this.mapDeVeiculos.put(veiculo.getPlaca(), veiculo);
    }
    public void removeVeiculo(String placa) throws PlacaNaoExisteException{
        if(this.mapDeVeiculos.containsKey(placa)){
            this.mapDeVeiculos.remove(placa);
        }else{
            throw new PlacaNaoExisteException("Placa não cadastrada no Sistema");
        }
    }

    public Veiculo pesquisaVeiculoPelaPlaca(String placa) throws PlacaNaoExisteException{
        if(this.mapDeVeiculos.containsKey(placa)){
            return this.mapDeVeiculos.get(placa);
        }else{
            throw new PlacaNaoExisteException("Placa não cadastrada");
        }
    }

    public ArrayList<Veiculo> veiculosQueCustamEntre(double min, double max){
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        for(Veiculo veiculo:this.mapDeVeiculos.values()){
            if((veiculo.getValor() >= min) & (veiculo.getValor() <= max)){
                veiculos.add(veiculo);
            }
        }
        return veiculos;
    }
}
