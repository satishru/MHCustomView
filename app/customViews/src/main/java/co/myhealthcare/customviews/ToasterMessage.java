package co.myhealthcare.customviews;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by satish on 16,September,2022
 * MyHealthCare, Bengaluru
 */
public class ToasterMessage {

    public static void showToast(Context c, String message){
        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
    }
}
