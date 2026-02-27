package B5;

import android.app.Application;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements W4.f, W4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.paymaya.data.preference.a f356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f357b;
    public final S5.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f358d;
    public boolean e;

    public d(Application application, com.paymaya.data.preference.a mPreference, l mSessionController, S5.c mFlagConfigurationService) {
        kotlin.jvm.internal.j.g(application, "application");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mSessionController, "mSessionController");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f356a = mPreference;
        this.f357b = mSessionController;
        this.c = mFlagConfigurationService;
        application.registerActivityLifecycleCallbacks(new b(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.d.a(java.lang.Object):void");
    }
}
