package androidx.work;

import S1.y;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public interface ForegroundUpdater {
    @NonNull
    y setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo);
}
