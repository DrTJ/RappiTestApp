package ir.royapajoohesh.utils.Providers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * Created by Dr TJ on February 2017.
 */
public class NetworkStatusProvider {

    public static Boolean IsOnWifiNet(Context context) {
        boolean isWifi = false;

        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connManager.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected()) {
            isWifi = (netInfo.getType() == ConnectivityManager.TYPE_WIFI);
            Log.d("IsOnWifiNet", isWifi + "");
        }

        return isWifi;
    }

    public static Boolean InternetAccess(Context context) {
        boolean isConnected = false;

        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connManager.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected()) {
            isConnected = true;
        }

        Log.d("InternetAccess", isConnected + "");
        return isConnected;
    }
}