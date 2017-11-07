package castro.examen_b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InicioActivity extends AppCompatActivity implements View.OnClickListener {

    Button btInicio;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btInicio = (Button) findViewById(R.id.bt_inicio);
        btInicio.setOnClickListener(this);
        nombre = (EditText) findViewById(R.id.editNombre);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_inicio:
                System.out.println(" msg A jugar");
                String dato = nombre.getText().toString();
                Intent siguiente = new Intent(InicioActivity.this, MainActivity.class);
                siguiente.putExtra("Nombre",dato);
                startActivity(siguiente);
                break;
        }
    }
}
