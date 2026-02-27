package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.j;
import yj.n;
import yj.q;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        j.g(view, "<this>");
        return (SavedStateRegistryOwner) q.k(q.o(n.e(ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1.INSTANCE, view), ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2.INSTANCE));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        j.g(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
