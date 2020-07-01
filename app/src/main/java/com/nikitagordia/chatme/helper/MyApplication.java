package com.nikitagordia.chatme.helper;

import android.app.Application;

import com.nikitagordia.chatme.R;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;
/**
 * La classe d'application est une classe de base dans une application Android, qui comprend différents composants tels que
 * l'activité, le service, les récepteurs de diffusion et les fournisseurs de contenu. Ces composants communiquent entre eux
 * à l'aide d'intentions, de rappels et d'autres méthodes.
 * Souvent, les composants dépendent d'autres composants, par exemple: le lancement d'une activité sur un clic de bouton.
 *
 * Plus d'info: https://examples.javacodegeeks.com/android/core/android-application-class-example/
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
