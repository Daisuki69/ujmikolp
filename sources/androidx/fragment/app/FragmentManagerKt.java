package androidx.fragment.app;

import androidx.annotation.MainThread;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentManagerKt {
    public static final void commit(FragmentManager fragmentManager, boolean z4, Function1<? super FragmentTransaction, Unit> body) {
        kotlin.jvm.internal.j.g(fragmentManager, "<this>");
        kotlin.jvm.internal.j.g(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z4) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z4, Function1 body, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.j.g(fragmentManager, "<this>");
        kotlin.jvm.internal.j.g(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z4) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @MainThread
    public static final void commitNow(FragmentManager fragmentManager, boolean z4, Function1<? super FragmentTransaction, Unit> body) {
        kotlin.jvm.internal.j.g(fragmentManager, "<this>");
        kotlin.jvm.internal.j.g(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z4) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z4, Function1 body, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.j.g(fragmentManager, "<this>");
        kotlin.jvm.internal.j.g(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z4) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static final void transaction(FragmentManager fragmentManager, boolean z4, boolean z5, Function1<? super FragmentTransaction, Unit> body) {
        kotlin.jvm.internal.j.g(fragmentManager, "<this>");
        kotlin.jvm.internal.j.g(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z4) {
            if (z5) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z5) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z4, boolean z5, Function1 body, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = false;
        }
        if ((i & 2) != 0) {
            z5 = false;
        }
        kotlin.jvm.internal.j.g(fragmentManager, "<this>");
        kotlin.jvm.internal.j.g(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.j.f(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z4) {
            if (z5) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z5) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }
}
