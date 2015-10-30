package dam2.act_3_di_jose_igualada_calero;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridLayout GL = (GridLayout) findViewById(R.id.grLayout);
        GL.setColumnCount(2);
        GL.setRowCount(20);

        for (int x = 0, y = 0, z = 0; x < 29; x++, y++) {
            if (y == 3) {
                y = 0;
                z++;
            }

            EditText btnFoto = new EditText(getApplicationContext());
            btnFoto.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);

            btnFoto.setText("Foto " + x);

            btnFoto.setWidth(190);
            btnFoto.setHeight(190);

            GridLayout.LayoutParams ajustes= new GridLayout.LayoutParams();
            ajustes.setMargins(10, 10, 10, 10);

            btnFoto.setLayoutParams(ajustes);

            btnFoto.setBackgroundColor(Color.YELLOW);
            btnFoto.setTextColor(Color.BLACK);
            GL.addView(btnFoto);
        }

    }
}
