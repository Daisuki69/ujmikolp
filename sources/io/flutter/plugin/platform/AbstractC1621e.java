package io.flutter.plugin.platform;

import android.app.ActivityManager;
import android.database.CursorWindow;

/* JADX INFO: renamed from: io.flutter.plugin.platform.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1621e {
    public static /* synthetic */ ActivityManager.TaskDescription b(int i, String str) {
        return new ActivityManager.TaskDescription(str, 0, i);
    }

    public static /* synthetic */ CursorWindow c(long j, String str) {
        return new CursorWindow(str, j);
    }
}
