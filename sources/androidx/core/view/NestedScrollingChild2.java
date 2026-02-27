package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollingChild2 extends NestedScrollingChild {
    boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2, int i6);

    boolean dispatchNestedScroll(int i, int i4, int i6, int i10, int[] iArr, int i11);

    boolean hasNestedScrollingParent(int i);

    boolean startNestedScroll(int i, int i4);

    void stopNestedScroll(int i);
}
