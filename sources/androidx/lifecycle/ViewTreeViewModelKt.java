package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeViewModelKt {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        j.g(view, "view");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
