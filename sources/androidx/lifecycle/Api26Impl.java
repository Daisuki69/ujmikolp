package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class Api26Impl {
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(Duration timeout) {
        j.g(timeout, "timeout");
        return timeout.toMillis();
    }
}
