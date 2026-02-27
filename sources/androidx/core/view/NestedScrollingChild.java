package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f, float f3, boolean z4);

    boolean dispatchNestedPreFling(float f, float f3);

    boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i, int i4, int i6, int i10, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z4);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
