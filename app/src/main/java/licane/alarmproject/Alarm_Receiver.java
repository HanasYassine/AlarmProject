package licane.alarmproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;



public class Alarm_Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("We are in the receiver.","Yay!");

        //fetch extra string from the intent
        String get_your_string = intent.getExtras().getString("extra");

        Log.e("what is the key?", get_your_string);

        //fetch extra long rom th intent for spinner
        Integer get_your_whale_choice = intent.getExtras().getInt("whale_choice");

        Log.e("The whale choice is ", get_your_whale_choice.toString());

        // create an intent to the ringtone service
        Intent service_intent = new Intent(context, RingtonePlayingService.class);

        // pass the extra string from Receiver to the Ringtone Playing Service
        service_intent.putExtra("extra", get_your_string);
        // pass the extra integer from the Receiver to the Ringtone Playing Service
        service_intent.putExtra("whale_choice", get_your_whale_choice);

        // start the ringtone service
        context.startService(service_intent);

    }
}
