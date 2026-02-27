package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CompositeMediaSource f8084b;

    public /* synthetic */ b(CompositeMediaSource compositeMediaSource, int i) {
        this.f8083a = i;
        this.f8084b = compositeMediaSource;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f8083a) {
            case 0:
                return ((ConcatenatingMediaSource) this.f8084b).handleMessage(message);
            default:
                return ((ConcatenatingMediaSource2) this.f8084b).handleMessage(message);
        }
    }
}
