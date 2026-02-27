package androidx.activity;

import Ej.InterfaceC0231i;
import Ej.W;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Object objCollect = W.f(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new InterfaceC0231i() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            public final Object emit(Rect rect, InterfaceC1526a<? super Unit> interfaceC1526a2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return Unit.f18162a;
            }

            @Override // Ej.InterfaceC0231i
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC1526a interfaceC1526a2) {
                return emit((Rect) obj, (InterfaceC1526a<? super Unit>) interfaceC1526a2);
            }
        }, interfaceC1526a);
        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
