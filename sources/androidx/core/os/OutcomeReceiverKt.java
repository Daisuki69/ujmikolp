package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import gj.InterfaceC1526a;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(InterfaceC1526a<? super R> interfaceC1526a) {
        return Je.a.e(new ContinuationOutcomeReceiver(interfaceC1526a));
    }
}
