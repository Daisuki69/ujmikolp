package androidx.appcompat.app;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7338b;

    public /* synthetic */ a(Context context, int i) {
        this.f7337a = i;
        this.f7338b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7337a) {
            case 0:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(this.f7338b);
                break;
            default:
                AppCompatDelegate.syncRequestedAndStoredLocales(this.f7338b);
                break;
        }
    }
}
