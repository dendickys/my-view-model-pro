package id.dendickys.myviewmodelpro;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    int result = 0;

    void calculate(String width, String height, String length) {
        result = Integer.parseInt(width) * Integer.parseInt(height) * Integer.parseInt(length);
    }
}
