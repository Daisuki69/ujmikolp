package a7;

import android.view.View;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: a7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0646g extends LinearSnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaCarousel f7018a;

    public C0646g(MayaCarousel mayaCarousel) {
        this.f7018a = mayaCarousel;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView) {
        kotlin.jvm.internal.j.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.j.g(targetView, "targetView");
        int i = 2;
        int[] iArr = new int[2];
        OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        MayaCarousel mayaCarousel = this.f7018a;
        if (mayaCarousel.f12030s0) {
            iArr[0] = ((targetView.getRight() + targetView.getLeft()) / 2) - ((orientationHelperCreateHorizontalHelper.getEndAfterPadding() + orientationHelperCreateHorizontalHelper.getStartAfterPadding()) / 2);
            return iArr;
        }
        int decoratedStart = orientationHelperCreateHorizontalHelper.getDecoratedStart(targetView);
        int startAfterPadding = orientationHelperCreateHorizontalHelper.getStartAfterPadding();
        int iOrdinal = mayaCarousel.getDividerMode().ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        iArr[0] = (decoratedStart - startAfterPadding) - (mayaCarousel.getDividerSizeInPx() * i);
        return iArr;
    }
}
