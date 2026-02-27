package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f7281b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7282a;

    public g(Context context, ComponentName componentName, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7282a = new f(context, componentName, dVar);
        } else {
            this.f7282a = new e(context, componentName, dVar);
        }
    }
}
