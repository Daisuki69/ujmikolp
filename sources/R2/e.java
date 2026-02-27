package R2;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runtime f5443a = Runtime.getRuntime();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f5444b;
    public final ActivityManager.MemoryInfo c;

    static {
        M2.a.d();
    }

    public e(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f5444b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
