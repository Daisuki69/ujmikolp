package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewKt {
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        j.g(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
