package s5;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends LinearSnapHelper {
    public static OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        kotlin.jvm.internal.j.f(orientationHelperCreateHorizontalHelper, "createHorizontalHelper(...)");
        return orientationHelperCreateHorizontalHelper;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView) {
        kotlin.jvm.internal.j.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.j.g(targetView, "targetView");
        if (!layoutManager.canScrollHorizontally()) {
            return super.calculateDistanceToFinalSnap(layoutManager, targetView);
        }
        ArrayList arrayList = new ArrayList();
        OrientationHelper orientationHelperA = a(layoutManager);
        arrayList.add(Integer.valueOf(orientationHelperA.getDecoratedStart(targetView) - orientationHelperA.getStartAfterPadding()));
        arrayList.add(0);
        return C1110A.U(arrayList);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.findSnapView(layoutManager);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (!linearLayoutManager.canScrollHorizontally()) {
            return super.findSnapView(layoutManager);
        }
        OrientationHelper orientationHelperA = a(layoutManager);
        kotlin.jvm.internal.j.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        boolean z4 = linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
        if (iFindFirstVisibleItemPosition == -1 || z4) {
            return null;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (orientationHelperA.getDecoratedEnd(viewFindViewByPosition) >= orientationHelperA.getDecoratedMeasurement(viewFindViewByPosition) / 2 && orientationHelperA.getDecoratedEnd(viewFindViewByPosition) > 0) {
            return viewFindViewByPosition;
        }
        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        return linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition + 1);
    }
}
