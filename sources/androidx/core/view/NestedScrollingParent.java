package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(View view, float f, float f3, boolean z4);

    boolean onNestedPreFling(View view, float f, float f3);

    void onNestedPreScroll(View view, int i, int i4, int[] iArr);

    void onNestedScroll(View view, int i, int i4, int i6, int i10);

    void onNestedScrollAccepted(View view, View view2, int i);

    boolean onStartNestedScroll(View view, View view2, int i);

    void onStopNestedScroll(View view);
}
