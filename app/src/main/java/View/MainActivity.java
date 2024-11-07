package View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.teste04.R;

import model.Pessoa;

public class MainActivity extends AppCompatActivity {


    Pessoa pessoa;
    EditText PrimeiroNome, SobreNome, CursoDesejado, TelefoneContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Joao");
        pessoa.setSobrenome("Gomes");
        pessoa.setCursoDesejado("Desenvolvimento de Sistema");
        pessoa.setTelefoneContato("12 3456789");

        PrimeiroNome = findViewById(R.id.editPrimeiroNome);
        SobreNome = findViewById(R.id.editSobreNome);
        CursoDesejado = findViewById(R.id.editCursoDesejado);
        TelefoneContato = findViewById(R.id.TelefoneContato);

        PrimeiroNome.setText(pessoa.getPrimeiroNome());
        SobreNome.setText(pessoa.getSobrenome());
        CursoDesejado.setText(pessoa.getCursoDesejado());
        TelefoneContato.setText(pessoa.getTelefoneContato());

        Button LIMPAR = findViewById(R.id.LIMPAR);
        LIMPAR.setOnClickListener(view -> LimparResultado());

        Button SALVAR = findViewById(R.id.SALVAR);
        SALVAR.setOnClickListener(view -> SalvarResultado());

        Button FINALIZAR = findViewById(R.id.FINALIZAR);
        FINALIZAR.setOnClickListener(view -> finish());


    }
    private void LimparResultado(){
        PrimeiroNome.setText("");
        SobreNome.setText("");
        CursoDesejado.setText("");
        TelefoneContato.setText("");
    }
    private void SalvarResultado(){
        PrimeiroNome.setText(pessoa.getPrimeiroNome());
        SobreNome.setText(pessoa.getSobrenome());
        CursoDesejado.setText(pessoa.getCursoDesejado());
        TelefoneContato.setText(pessoa.getTelefoneContato());
    }




}