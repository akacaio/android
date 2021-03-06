MAIN ACTIVITY

package br.com.fiap.nac03.RM79900;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void infosFord(View view) {
        alterarFragment(new fordFragment());
    }

    public void infosBerlinetta(View view) {
        alterarFragment(new berlinettaFragment());
    }

    public void infosLamborghini(View view) {
        alterarFragment(new lamboFragment());
    }

    public void infoMercedes(View view) {
        alterarFragment(new mercedesFragment());
    }


    public void alterarFragment(Fragment fragment) {

        if (isActive == true) {
            getSupportFragmentManager().popBackStack();
            isActive = false;
        } else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.infosCarro, fragment)
                    .addToBackStack(null)
                    .commit();
            isActive = true;
        }
    }
}

FRAGMENT.JAVA


package br.com.fiap.nac03.RM79900;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class berlinettaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_berlinetta, container, false);
    }
}
