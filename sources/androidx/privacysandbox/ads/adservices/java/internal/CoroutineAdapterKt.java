package androidx.privacysandbox.ads.adservices.java.internal;

import Bj.K;
import Bj.u0;
import S1.y;
import androidx.camera.lifecycle.a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineAdapterKt {
    public static final <T> y asListenableFuture(K k8, Object obj) {
        j.g(k8, "<this>");
        y future = CallbackToFutureAdapter.getFuture(new a(15, k8, obj));
        j.f(future, "getFuture { completer ->…      }\n        tag\n    }");
        return future;
    }

    public static /* synthetic */ y asListenableFuture$default(K k8, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(k8, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object asListenableFuture$lambda$0(K this_asListenableFuture, Object obj, CallbackToFutureAdapter.Completer completer) {
        j.g(this_asListenableFuture, "$this_asListenableFuture");
        j.g(completer, "completer");
        ((u0) this_asListenableFuture).i(new CoroutineAdapterKt$asListenableFuture$1$1(completer, this_asListenableFuture));
        return obj;
    }
}
