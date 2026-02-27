package androidx.work.impl.utils;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(26)
public final class DurationApi26Impl {
    public static final long toMillisCompat(Duration duration) {
        j.g(duration, "<this>");
        return duration.toMillis();
    }
}
