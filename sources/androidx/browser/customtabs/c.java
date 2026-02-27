package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f7355b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f7356d;

    public /* synthetic */ c(EngagementSignalsCallback engagementSignalsCallback, int i, Bundle bundle, int i4) {
        this.f7354a = i4;
        this.f7355b = engagementSignalsCallback;
        this.c = i;
        this.f7356d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7354a) {
            case 0:
                this.f7355b.onGreatestScrollPercentageIncreased(this.c, this.f7356d);
                break;
            default:
                this.f7355b.onGreatestScrollPercentageIncreased(this.c, this.f7356d);
                break;
        }
    }
}
