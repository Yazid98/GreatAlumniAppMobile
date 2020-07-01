package com.nikitagordia.chatme.helper;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;

/*
 * Tout comme les activités, les services possèdent un cycle de vie ainsi qu'un contexte qui contient des informations spécifiques
 * sur l'application et qui constitue une interface de communication avec le restant du système. Ainsi, on peut dire que les services
 * sont des composants très proches des activités (et beaucoup moins des receivers, qui eux ne possèdent pas de contexte). Cette
 * configuration leur prodigue la même grande flexibilité que les activités. En revanche, à l'opposé des activités,
 * les services ne possèdent pas d'interface graphique : c'est pourquoi on les utilise pour effectuer des travaux d'arrière-plan.
 * Plus d'infos : https://openclassrooms.com/fr/courses/2023346-creez-des-applications-pour-android/2027704-les-services
 */

public class MainService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        getApplication().onTerminate();
        stopSelf();
    }
}
