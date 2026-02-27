package androidx.fragment.app;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentKt {
    public static final void clearFragmentResult(Fragment fragment, String requestKey) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResult(requestKey);
    }

    public static final void clearFragmentResultListener(Fragment fragment, String requestKey) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResultListener(requestKey);
    }

    public static final void setFragmentResult(Fragment fragment, String requestKey, Bundle result) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(requestKey, "requestKey");
        kotlin.jvm.internal.j.g(result, "result");
        fragment.getParentFragmentManager().setFragmentResult(requestKey, result);
    }

    public static final void setFragmentResultListener(Fragment fragment, String requestKey, final Function2<? super String, ? super Bundle, Unit> listener) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(requestKey, "requestKey");
        kotlin.jvm.internal.j.g(listener, "listener");
        fragment.getParentFragmentManager().setFragmentResultListener(requestKey, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.h
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                FragmentKt.setFragmentResultListener$lambda$0(listener, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFragmentResultListener$lambda$0(Function2 tmp0, String p02, Bundle p1) {
        kotlin.jvm.internal.j.g(tmp0, "$tmp0");
        kotlin.jvm.internal.j.g(p02, "p0");
        kotlin.jvm.internal.j.g(p1, "p1");
        tmp0.invoke(p02, p1);
    }
}
