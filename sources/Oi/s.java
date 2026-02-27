package Oi;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b(CmcdData.Factory.STREAMING_FORMAT_SS)
    private boolean f4893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("e")
    private boolean f4894b;

    @InterfaceC1498b(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)
    private boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC1498b(CmcdConfiguration.KEY_STREAM_TYPE)
    private boolean f4895d;

    @InterfaceC1498b("t")
    private boolean e;

    public final void a(boolean z4) {
        this.c = z4;
    }

    public final void b(boolean z4) {
        this.f4894b = z4;
    }

    public final void c(boolean z4) {
        this.f4893a = z4;
    }

    public final void d(boolean z4) {
        this.f4895d = z4;
    }

    public final void e(boolean z4) {
        this.e = z4;
    }
}
