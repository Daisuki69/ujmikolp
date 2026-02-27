package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class Api21Impl {
    public static final Api21Impl INSTANCE = new Api21Impl();

    private Api21Impl() {
    }

    public final File getNoBackupFilesDir(Context context) {
        j.g(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        j.f(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
