package ir.royapajoohesh.utils.Providers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by Dr TJ on February 2017.
 */
public final class NavigationProvider {
    public static void NavigateTo(Activity context, Class<?> newActivityClass, boolean closeCurrent, Bundle extras) {
        Intent intent = new Intent(context, newActivityClass);

        if(extras != null){
            intent.putExtras(extras);
        }

        context.startActivity(intent);

        if (closeCurrent) {
            context.finish();
        }
    }

    public static void NavigateTo(Activity context, Class<?> newActivityClass, boolean closeCurrent) {
        NavigateTo(context, newActivityClass, closeCurrent, null);
    }

    public static void OpenUrl(Activity context, String webAddress) {
        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webAddress)));
    }
}
