package a7;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: a7.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0639G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f7012a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7013b = new LinkedHashMap();
    public static final LinkedHashMap c = new LinkedHashMap();

    public static void a(View scrollContainer, MayaStaticToolTipView tooltipView) {
        RecyclerView.OnScrollListener onScrollListener;
        kotlin.jvm.internal.j.g(scrollContainer, "scrollContainer");
        kotlin.jvm.internal.j.g(tooltipView, "tooltipView");
        ViewTreeObserver viewTreeObserver = scrollContainer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) f7012a.remove(tooltipView);
            if (onScrollChangedListener != null) {
                viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            }
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) c.remove(tooltipView);
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        if (!(scrollContainer instanceof RecyclerView) || (onScrollListener = (RecyclerView.OnScrollListener) f7013b.remove(tooltipView)) == null) {
            return;
        }
        ((RecyclerView) scrollContainer).removeOnScrollListener(onScrollListener);
    }
}
