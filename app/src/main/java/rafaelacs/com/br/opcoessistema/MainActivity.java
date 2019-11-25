package rafaelacs.com.br.opcoessistema;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ListView;

import java.util.List;

import rafaelacs.com.br.opcoessistema.domain.Opcao;
import rafaelacs.com.br.opcoessistema.extras.Mock;

public class MainActivity extends AppCompatActivity {

    private List<Opcao> opcoes;
    private OpcoesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcoes = Mock.gerarOpcoes();
        adapter = new OpcoesAdapter(this, opcoes);

        ListView lvOpcoes = (ListView) findViewById(R.id.lv_opcoes);
        lvOpcoes.setAdapter(adapter);
    }

    @Override
    protected void onResume(){
        super.onResume();

        new Thread(){
                @Override
                public void run(){
                    super.run();

                    //Aguarde 2 segundos
                    SystemClock.sleep(5000);

                    //Atualize o primeiro item da lista de opçoes
                    Opcao op = opcoes.get(0);
                    op.setStatus(!op.isStatus());

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            adapter.notifyDataSetChanged();
                        }
                    });
                }
        }.start();
    }
}
