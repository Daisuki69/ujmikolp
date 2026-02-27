package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7276a;

    public b(d dVar) {
        this.f7276a = dVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        android.support.v4.media.session.c cVar;
        d dVar = this.f7276a;
        c cVar2 = dVar.mConnectionCallbackInternal;
        if (cVar2 != null) {
            e eVar = (e) cVar2;
            MediaBrowser mediaBrowser = eVar.f7278b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                    IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                    if (binder != null) {
                        Y.e eVar2 = new Y.e(9);
                        eVar2.f6708b = new Messenger(binder);
                        eVar2.c = eVar.c;
                        eVar.f = eVar2;
                        a aVar = eVar.f7279d;
                        Messenger messenger = new Messenger(aVar);
                        eVar.f7280g = messenger;
                        aVar.getClass();
                        aVar.f7275b = new WeakReference(messenger);
                        try {
                            Y.e eVar3 = eVar.f;
                            Context context = eVar.f7277a;
                            Messenger messenger2 = eVar.f7280g;
                            eVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                            bundle.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
                            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, (Bundle) eVar3.c);
                            eVar3.y(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER);
                    int i = android.support.v4.media.session.b.f7302a;
                    if (binder2 == null) {
                        cVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.media.session.c)) {
                            android.support.v4.media.session.a aVar2 = new android.support.v4.media.session.a();
                            aVar2.f7301a = binder2;
                            cVar = aVar2;
                        } else {
                            cVar = (android.support.v4.media.session.c) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (cVar != null) {
                        eVar.h = MediaSessionCompat$Token.a(mediaBrowser.getSessionToken(), cVar);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        dVar.onConnected();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        d dVar = this.f7276a;
        c cVar = dVar.mConnectionCallbackInternal;
        if (cVar != null) {
            cVar.getClass();
        }
        dVar.onConnectionFailed();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        d dVar = this.f7276a;
        c cVar = dVar.mConnectionCallbackInternal;
        if (cVar != null) {
            e eVar = (e) cVar;
            eVar.f = null;
            eVar.f7280g = null;
            eVar.h = null;
            a aVar = eVar.f7279d;
            aVar.getClass();
            aVar.f7275b = new WeakReference(null);
        }
        dVar.onConnectionSuspended();
    }
}
