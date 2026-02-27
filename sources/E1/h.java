package E1;

import android.os.Bundle;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends g {
    @Override // E1.g, F1.i
    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        int i = bundle.getInt(EventKeys.ERROR.CODE, -2);
        TaskCompletionSource taskCompletionSource = this.c;
        if (i != 0) {
            taskCompletionSource.trySetException(new InstallException(bundle.getInt(EventKeys.ERROR.CODE, -2)));
        } else {
            taskCompletionSource.trySetResult(null);
        }
    }
}
