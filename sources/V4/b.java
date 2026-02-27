package V4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f6057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Looper looper, boolean z4) {
        super(looper);
        this.f6057b = cVar;
        this.f6056a = z4;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f6057b.h.success(Boolean.valueOf(this.f6056a));
    }
}
