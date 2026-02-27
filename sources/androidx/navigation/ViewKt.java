package androidx.navigation;

import android.view.View;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewKt {
    public static final NavController findNavController(View view) {
        j.g(view, "<this>");
        return Navigation.findNavController(view);
    }
}
