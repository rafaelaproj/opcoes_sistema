package rafaelacs.com.br.opcoessistema;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import rafaelacs.com.br.opcoessistema.domain.Opcao;

public class OpcaoViewHolder {

    private TextView tvNome;
    private CheckBox cbStatus;

    public void setViews(View view){
        tvNome = (TextView) view.findViewById(R.id.tv_nome);
        cbStatus = (CheckBox) view.findViewById(R.id.cb_status);
    }

    public void setDados(Opcao opcao){
        tvNome.setText(opcao.getNome());

        cbStatus.setChecked(opcao.isStatus());
    }

}
