package cl.individual.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import cl.individual.ejercicio12.databinding.ActivityCartaBinding;

public class CartaActivity extends AppCompatActivity {
private ActivityCartaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCartaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initList();
    }

    private void initList() {
        ArrayList menu = new ArrayList<>();
        menu.add("Salmón a la plancha con arroz y espárragos");
        menu.add("Pollo teriyaki con sésamo");
        menu.add("Solomillo de cordero al horno");
        menu.add("Corvina asada con puré de papas");
        menu.add("Brocheta de calabacín y pollo al limón");
        menu.add("Ternera guisada con setas");
        menu.add("Merluza con remolacha");
        menu.add("Tacos de carne a la cerveza");
        menu.add("Pasta de salmón a la mostaza");
        menu.add("Hamburguesa vegana de alubia roja y quinoa");
        menu.add("Lasaña de lenguado");
        menu.add("Pierna de cordero al horno");
        menu.add("Curry verde de pollo");
        menu.add("Albóndigas veganas con salsa de tomate");
        menu.add("Alubias con calamar a la plancha");
        menu.add("Sepia con mayonesa de wasabi");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menu);

        binding.listViewMenu.setAdapter(adapter);
    }
}