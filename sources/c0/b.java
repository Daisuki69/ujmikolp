package C0;

import android.app.NotificationChannel;
import android.app.usage.StorageStatsManager;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof StorageStatsManager;
    }

    public static /* synthetic */ NotificationChannel g(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ NotificationChannel h(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* bridge */ /* synthetic */ StorageStatsManager i(Object obj) {
        return (StorageStatsManager) obj;
    }

    public static /* synthetic */ OutputConfiguration j(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }
}
