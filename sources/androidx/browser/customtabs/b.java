package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f7352b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f7353d;

    public /* synthetic */ b(EngagementSignalsCallback engagementSignalsCallback, boolean z4, Bundle bundle, int i) {
        this.f7351a = i;
        this.f7352b = engagementSignalsCallback;
        this.c = z4;
        this.f7353d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7351a) {
            case 0:
                this.f7352b.onSessionEnded(this.c, this.f7353d);
                break;
            case 1:
                this.f7352b.onVerticalScrollEvent(this.c, this.f7353d);
                break;
            case 2:
                this.f7352b.onVerticalScrollEvent(this.c, this.f7353d);
                break;
            default:
                this.f7352b.onSessionEnded(this.c, this.f7353d);
                break;
        }
    }
}
