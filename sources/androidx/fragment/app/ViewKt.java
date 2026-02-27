package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ViewKt {
    public static final <F extends Fragment> F findFragment(View view) {
        kotlin.jvm.internal.j.g(view, "<this>");
        F f = (F) FragmentManager.findFragment(view);
        kotlin.jvm.internal.j.f(f, "findFragment(this)");
        return f;
    }
}
