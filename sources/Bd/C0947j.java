package bd;

import android.view.View;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.ui.common.view.widget.Carousel;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: bd.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0947j extends LinearSnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Carousel f8643a;

    public C0947j(Carousel carousel) {
        this.f8643a = carousel;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView) {
        kotlin.jvm.internal.j.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.j.g(targetView, "targetView");
        int i = 2;
        int[] iArr = new int[2];
        OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        int decoratedStart = orientationHelperCreateHorizontalHelper.getDecoratedStart(targetView);
        int startAfterPadding = orientationHelperCreateHorizontalHelper.getStartAfterPadding();
        Carousel carousel = this.f8643a;
        int iOrdinal = carousel.getDividerMode().ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        iArr[0] = (decoratedStart - startAfterPadding) - (carousel.getDividerSizeInPx() * i);
        return iArr;
    }
}
