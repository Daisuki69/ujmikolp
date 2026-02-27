package androidx.window.layout;

import Dj.r;
import androidx.core.util.Consumer;
import androidx.window.layout.WindowInfoTrackerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f8221b;

    public /* synthetic */ b(r rVar, int i) {
        this.f8220a = i;
        this.f8221b = rVar;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f8220a) {
            case 0:
                WindowInfoTrackerImpl.AnonymousClass1.invokeSuspend$lambda$0(this.f8221b, (WindowLayoutInfo) obj);
                break;
            default:
                WindowInfoTrackerImpl.AnonymousClass2.invokeSuspend$lambda$0(this.f8221b, (WindowLayoutInfo) obj);
                break;
        }
    }
}
