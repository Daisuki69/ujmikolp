package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f7274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f7275b;

    public a(e eVar) {
        this.f7274a = new WeakReference(eVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f7275b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f7274a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        android.support.v4.media.session.h.a(data);
        e eVar = (e) weakReference2.get();
        Messenger messenger = (Messenger) this.f7275b.get();
        try {
            int i = message.what;
            if (i == 1) {
                android.support.v4.media.session.h.a(data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                eVar.getClass();
                return;
            }
            if (i == 2) {
                eVar.getClass();
                return;
            }
            if (i != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            android.support.v4.media.session.h.a(data.getBundle(MediaBrowserProtocol.DATA_OPTIONS));
            android.support.v4.media.session.h.a(data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS));
            String string = data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
            data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST);
            if (eVar.f7280g != messenger) {
                return;
            }
            if (eVar.e.get(string) != null) {
                throw new ClassCastException();
            }
            if (g.f7281b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                eVar.getClass();
            }
        }
    }
}
