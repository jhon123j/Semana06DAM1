package pe.edu.idat.appfomsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import pe.edu.idat.appfomsandroid.databinding.ActivityListaBinding;

public class ListaActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityListaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<String> listaPersonas = (ArrayList<String>)
                getIntent().getSerializableExtra("listapersonas");
        ArrayAdapter arrayAdapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item,
                listaPersonas
        );
        binding.lvpersonas.setAdapter(arrayAdapter);
        binding.btnregresarregistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(),
                RegistroActivity.class));
    }
}