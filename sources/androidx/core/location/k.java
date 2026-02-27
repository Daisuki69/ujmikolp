package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f7785b;
    public final /* synthetic */ String c;

    public /* synthetic */ k(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i) {
        this.f7784a = i;
        this.f7785b = locationListenerTransport;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7784a) {
            case 0:
                this.f7785b.lambda$onProviderEnabled$4(this.c);
                break;
            default:
                this.f7785b.lambda$onProviderDisabled$5(this.c);
                break;
        }
    }
}
