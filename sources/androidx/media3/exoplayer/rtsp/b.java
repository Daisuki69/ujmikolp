package androidx.media3.exoplayer.rtsp;

import androidx.media3.exoplayer.rtsp.RtspMessageChannel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8063b;
    public final /* synthetic */ Serializable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8064d;

    public /* synthetic */ b(Object obj, Serializable serializable, Object obj2, int i) {
        this.f8062a = i;
        this.f8063b = obj;
        this.c = serializable;
        this.f8064d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8062a) {
            case 0:
                ((RtpDataLoadable) this.f8063b).lambda$load$0((String) this.c, (RtpDataChannel) this.f8064d);
                break;
            default:
                ((RtspMessageChannel.Sender) this.f8063b).lambda$send$0((byte[]) this.c, (List) this.f8064d);
                break;
        }
    }
}
