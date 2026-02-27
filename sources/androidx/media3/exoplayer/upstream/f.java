package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements NetworkTypeObserver.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8123b;

    public /* synthetic */ f(Object obj, int i) {
        this.f8122a = i;
        this.f8123b = obj;
    }

    @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
    public final void onNetworkTypeChanged(int i) throws Throwable {
        switch (this.f8122a) {
            case 0:
                ((DefaultBandwidthMeter) this.f8123b).onNetworkTypeChanged(i);
                break;
            default:
                ((ExperimentalBandwidthMeter) this.f8123b).onNetworkTypeChanged(i);
                break;
        }
    }
}
