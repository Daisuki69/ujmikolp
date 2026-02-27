package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f7283a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        c cVar;
        e eVar = (e) this.f7283a.get();
        if (eVar == null || bundle == null) {
            return;
        }
        synchronized (eVar.f7305b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = eVar.e;
            IBinder binder = BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER");
            int i4 = b.f7302a;
            if (binder == null) {
                cVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) {
                    a aVar = new a();
                    aVar.f7301a = binder;
                    cVar = aVar;
                } else {
                    cVar = (c) iInterfaceQueryLocalInterface;
                }
            }
            mediaSessionCompat$Token.c(cVar);
            eVar.e.d(ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
            eVar.a();
        }
    }
}
