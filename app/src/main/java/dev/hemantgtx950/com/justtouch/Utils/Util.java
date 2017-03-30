package dev.hemantgtx950.com.justtouch.Utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by hemba on 3/11/2017.
 */

public class Util {
    public static void toastS(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();

    }
}