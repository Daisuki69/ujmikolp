package G5;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {
    public static final void a(NestedScrollView nestedScrollView, View targetView, Function2 function2) {
        kotlin.jvm.internal.j.g(nestedScrollView, "<this>");
        kotlin.jvm.internal.j.g(targetView, "targetView");
        nestedScrollView.setOnScrollChangeListener(new A7.r(4, targetView, function2));
    }
}
