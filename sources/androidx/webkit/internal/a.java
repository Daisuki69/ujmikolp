package androidx.webkit.internal;

import android.app.job.JobInfo;
import android.net.Uri;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.webkit.ServiceWorkerWebSettings;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ JobInfo.TriggerContentUri h(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* bridge */ /* synthetic */ HealthStats j(Object obj) {
        return (HealthStats) obj;
    }

    public static /* bridge */ /* synthetic */ SystemHealthManager k(Object obj) {
        return (SystemHealthManager) obj;
    }

    public static /* bridge */ /* synthetic */ ServiceWorkerWebSettings n(Object obj) {
        return (ServiceWorkerWebSettings) obj;
    }

    public static /* synthetic */ void q() {
    }
}
