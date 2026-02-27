package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f8166b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8167d;

    public /* synthetic */ a(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj, int i4) {
        this.f8165a = i4;
        this.f8166b = diagnosticsCallback;
        this.c = i;
        this.f8167d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8165a) {
            case 0:
                this.f8166b.onResultReceived(this.c, this.f8167d);
                break;
            default:
                this.f8166b.onDiagnosticReceived(this.c, this.f8167d);
                break;
        }
    }
}
