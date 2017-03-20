package ir.royapajoohesh.utils.Providers;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.rappi.rappitest.R;

/**
 * Created by Dr TJ on February 2017.
 */
public class DialogsProvider {

    public static void DisplayAlert(Context context, int titleResourceId, int messageResourceId) {
        DisplayAlert(context, titleResourceId, messageResourceId, R.string.ok_button_text);
    }

    public static void DisplayAlert(Context context, int titleResourceId, int messageResourceId, int buttonTextResourceId) {
        DisplayAlert(context, context.getString(titleResourceId), context.getString(messageResourceId), context.getString(buttonTextResourceId));
    }

    public static void DisplayAlert(Context context, String title, String message) {
        DisplayAlert(context, title, message, context.getString(R.string.ok_button_text));
    }

    public static void DisplayAlert(Context context, String title, String message, String buttonText) {
        AlertDialog.Builder alert = new AlertDialog.Builder(context);

        alert.setPositiveButton(buttonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alert.setTitle(title);
        alert.setMessage(message);
        alert.show();
    }
}
