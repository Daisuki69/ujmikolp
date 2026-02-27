package androidx.profileinstaller;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f8171b;

    public /* synthetic */ c(Context context, int i) {
        this.f8170a = i;
        this.f8171b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8170a) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(this.f8171b);
                break;
            default:
                ProfileInstaller.writeProfile(this.f8171b);
                break;
        }
    }
}
