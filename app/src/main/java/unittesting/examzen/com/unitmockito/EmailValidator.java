package unittesting.examzen.com.unitmockito;

import android.text.Editable;
import android.text.TextWatcher;

import java.util.regex.Pattern;

/**
 * Created by Admin on 8/22/2016.
 */
public class EmailValidator implements TextWatcher {


    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$");

    public boolean isValid() {
        return mIsValid;
    }

    private boolean mIsValid = false;


    /**
     * Validates if the given input is a valid email address.
     *
     * @param email Pattern The {@link Pattern} used to validate the given email.
     * @param email The email to validate.
     * @return {@code true} if the input is a valid email. {@code false} otherwise.
     */
    public static boolean isValidEmail(CharSequence email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        mIsValid = isValidEmail(editable);
    }

}
