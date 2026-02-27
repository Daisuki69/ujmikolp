package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 35)
public final class ProfilingRequest {
    private final android.os.CancellationSignal cancellationSignal;
    private final Bundle params;
    private final int profilingType;
    private final String tag;

    public ProfilingRequest(int i, Bundle params, String str, android.os.CancellationSignal cancellationSignal) {
        j.g(params, "params");
        this.profilingType = i;
        this.params = params;
        this.tag = str;
        this.cancellationSignal = cancellationSignal;
    }

    public final android.os.CancellationSignal getCancellationSignal() {
        return this.cancellationSignal;
    }

    public final Bundle getParams() {
        return this.params;
    }

    public final int getProfilingType() {
        return this.profilingType;
    }

    public final String getTag() {
        return this.tag;
    }
}
