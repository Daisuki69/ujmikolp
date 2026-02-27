package androidx.lifecycle;

import Bj.D0;
import Bj.E;
import Bj.H;
import Bj.U;
import Gj.m;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelKt {
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    public static final E getViewModelScope(ViewModel viewModel) {
        E e = (E) viewModel.getTag(JOB_KEY);
        if (e != null) {
            return e;
        }
        D0 d0E = H.e(1);
        Ij.e eVar = U.f603a;
        return (E) viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(kotlin.coroutines.e.d(d0E, m.f2024a.c)));
    }
}
