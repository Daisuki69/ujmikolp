package v1;

import A7.l;
import O1.D;
import android.content.Context;
import android.os.Parcelable;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.concurrent.atomic.AtomicReference;
import p3.s;

/* JADX INFO: renamed from: v1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2335b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20451b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20452a;

    static {
        new D(new l(16));
        new D(new l(17));
    }

    public C2335b(Context context, s sVar) {
        Parcelable.Creator<DefaultTrackSelector$Parameters> creator = DefaultTrackSelector$Parameters.CREATOR;
        this.f20452a = new AtomicReference(new C2334a(context).a());
    }

    public final DefaultTrackSelector$Parameters a() {
        return (DefaultTrackSelector$Parameters) this.f20452a.get();
    }

    public final void b(C2334a c2334a) {
        DefaultTrackSelector$Parameters defaultTrackSelector$ParametersA = c2334a.a();
        ((DefaultTrackSelector$Parameters) this.f20452a.getAndSet(defaultTrackSelector$ParametersA)).equals(defaultTrackSelector$ParametersA);
    }
}
