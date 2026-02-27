package androidx.webkit.internal;

import androidx.webkit.OutcomeReceiverCompat;
import androidx.webkit.PrefetchException;
import androidx.webkit.PrefetchNetworkException;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class PrefetchOperationCallbackAdapter {
    public static InvocationHandler buildInvocationHandler(final OutcomeReceiverCompat<Void, PrefetchException> outcomeReceiverCompat) {
        return new jk.a(new PrefetchOperationCallbackBoundaryInterface() { // from class: androidx.webkit.internal.PrefetchOperationCallbackAdapter.1
            @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
            public void onFailure(int i, String str, int i4) {
                if (i == 1) {
                    outcomeReceiverCompat.onError(new PrefetchNetworkException(str, i4));
                } else {
                    outcomeReceiverCompat.onError(new PrefetchException(str));
                }
            }

            @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
            public void onSuccess() {
                outcomeReceiverCompat.onResult(null);
            }
        });
    }
}
