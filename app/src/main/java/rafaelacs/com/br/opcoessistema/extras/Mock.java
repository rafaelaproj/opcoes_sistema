package rafaelacs.com.br.opcoessistema.extras;

import java.util.ArrayList;
import java.util.List;

import rafaelacs.com.br.opcoessistema.domain.Opcao;

public class Mock {

    public static List<Opcao> gerarOpcoes(){
        List<Opcao> opcoes = new ArrayList<>();

        opcoes.add(new Opcao("Liberar root", false));
        opcoes.add(new Opcao("Liberar ligações por aplicativos", true));
        opcoes.add(new Opcao("Permitir compartilhamento via NFC", false));
        opcoes.add(new Opcao("Permitir compartilhamento via NFC", false));
        opcoes.add(new Opcao("Permitir trabalho como desenvolvedor", false));
        opcoes.add(new Opcao("Desativar Doze Mode", false));
        opcoes.add(new Opcao("Permitir compartilhamento com o Google Better Data", false));
        opcoes.add(new Opcao("Liberar aplicativos de marketing de dados", false));
        opcoes.add(new Opcao("Permitir internet P2P", false));
        opcoes.add(new Opcao("Permitir compartilhamento de stream", false));
        opcoes.add(new Opcao("Permitir trabalho como hoster", false));

        return opcoes;
    }

}
