package androidx.activity;

import android.view.View;
import androidx.core.viewtree.ViewTree;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        kotlin.jvm.internal.j.g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.report_drawn);
            FullyDrawnReporterOwner fullyDrawnReporterOwner = tag instanceof FullyDrawnReporterOwner ? (FullyDrawnReporterOwner) tag : null;
            if (fullyDrawnReporterOwner != null) {
                return fullyDrawnReporterOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        kotlin.jvm.internal.j.g(view, "<this>");
        kotlin.jvm.internal.j.g(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
