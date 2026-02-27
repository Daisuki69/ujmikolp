package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.k;
import android.support.customtabs.l;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {
    private k mBinder = new k() { // from class: androidx.browser.customtabs.PostMessageService.1
        {
            attachInterface(this, l.f7258F);
        }

        @Override // android.support.customtabs.l
        public void onMessageChannelReady(@NonNull android.support.customtabs.c cVar, @Nullable Bundle bundle) throws RemoteException {
            cVar.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.l
        public void onPostMessage(@NonNull android.support.customtabs.c cVar, @NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            cVar.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
