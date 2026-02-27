package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollingParent2 extends NestedScrollingParent {
    void onNestedPreScroll(View view, int i, int i4, int[] iArr, int i6);

    void onNestedScroll(View view, int i, int i4, int i6, int i10, int i11);

    void onNestedScrollAccepted(View view, View view2, int i, int i4);

    boolean onStartNestedScroll(View view, View view2, int i, int i4);

    void onStopNestedScroll(View view, int i);
}
