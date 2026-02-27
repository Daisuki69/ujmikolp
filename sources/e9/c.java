package E9;

import N5.C0466m;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaMissionsDetailsFragment f1333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1334b;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f1335d;

    public c(Context context, MayaMissionsDetailsFragment mayaMissionsDetailsFragment, boolean z4) {
        this.f1333a = mayaMissionsDetailsFragment;
        this.f1334b = z4;
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f1335d = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x018d, code lost:
    
        r15 = r15.getProgress();
        kotlin.jvm.internal.j.g(r15, "missionProgress");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0198, code lost:
    
        if (r15.getTarget() > 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019a, code lost:
    
        r0 = r15.getCounter();
        r14.E().setText(r14.E().getContext().getResources().getQuantityString(com.paymaya.R.plurals.maya_label_format_missions_task_item_steps_accomplished_count_target_empty, r0, java.lang.Integer.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c1, code lost:
    
        r3 = r15.getCounter();
        r5 = r15.getTarget();
        r14.E().setText(r14.E().getContext().getResources().getQuantityString(com.paymaya.R.plurals.maya_label_format_missions_task_item_steps_accomplished_count_target_non_empty, r5, java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f1, code lost:
    
        ((android.widget.ProgressBar) r4.i).setProgress(J5.a.a(java.lang.Double.valueOf(r15.getCounter()), java.lang.Double.valueOf(r15.getTarget())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x020e, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, int r15) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E9.c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        View viewInflate = this.f1335d.inflate(R.layout.maya_view_holder_mission_action_task_item, parent, false);
        int i4 = R.id.action_name_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.action_name_text_view);
        if (textView != null) {
            i4 = R.id.action_steps_accomplished_text_view;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.action_steps_accomplished_text_view);
            if (textView2 != null) {
                i4 = R.id.clickable_indicator_chevron_image_view;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.clickable_indicator_chevron_image_view);
                if (imageView != null) {
                    i4 = R.id.completed_status_indicator_image_view;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.completed_status_indicator_image_view);
                    if (imageView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i4 = R.id.incomplete_completion_progress_bar;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.incomplete_completion_progress_bar);
                        if (progressBar != null) {
                            i4 = R.id.incomplete_status_indicator_image_view;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.incomplete_status_indicator_image_view);
                            if (viewFindChildViewById != null) {
                                i4 = R.id.left_icon_space;
                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.left_icon_space)) != null) {
                                    return new H9.d(new C0466m((ViewGroup) constraintLayout, (View) textView, (View) textView2, (View) imageView, (View) imageView2, (View) constraintLayout, (View) progressBar, viewFindChildViewById, 20), this, this.f1334b);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
