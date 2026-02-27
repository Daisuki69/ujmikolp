package X2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements W2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f6502a;

    public l(m mVar) {
        this.f6502a = mVar;
    }

    @Override // W2.c
    public final void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        m mVar = this.f6502a;
        synchronized (mVar) {
            mVar.f6507d = true;
        }
        this.f6502a.g(firebaseRemoteConfigException);
    }

    @Override // W2.c
    public final void onUpdate(W2.b bVar) {
    }
}
