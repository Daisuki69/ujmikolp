package H9;

import N5.C0466m;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import kotlin.jvm.internal.j;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0466m f2151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E9.c f2152b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J5.a f2153d;
    public MissionV2Action e;

    public d(C0466m c0466m, E9.c cVar, boolean z4) {
        super((ConstraintLayout) c0466m.f4150b);
        this.f2151a = c0466m;
        this.f2152b = cVar;
        this.c = z4;
        this.f2153d = new J5.a(this, 6);
        ConstraintLayout containerConstraintLayout = (ConstraintLayout) c0466m.h;
        j.f(containerConstraintLayout, "containerConstraintLayout");
        containerConstraintLayout.setOnClickListener(new Ba.a(this, 13));
    }

    public static final void D(d dVar) {
        J5.a aVar = dVar.f2153d;
        MissionV2Action missionV2Action = dVar.e;
        aVar.getClass();
        if (missionV2Action == null || !z.o(missionV2Action.getAction(), "ENTER_CODE", true)) {
            return;
        }
        d dVar2 = (d) aVar.f2414b;
        if (dVar2.c) {
            MayaMissionsDetailsFragment mayaMissionsDetailsFragment = dVar2.f2152b.f1333a;
            mayaMissionsDetailsFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.ENTER_CODE);
            mayaMissionsDetailsFragment.o1(c1219h);
            G9.c cVar = mayaMissionsDetailsFragment.f12985n0;
            if (cVar != null) {
                MissionV2 missionV2 = mayaMissionsDetailsFragment.f12984l0;
                MayaMissionsActivity mayaMissionsActivity = (MayaMissionsActivity) cVar;
                mayaMissionsActivity.f12956p = missionV2;
                mayaMissionsActivity.f12957q = missionV2Action;
                mayaMissionsActivity.Y1(missionV2, missionV2Action);
            }
        }
    }

    public final TextView E() {
        TextView actionStepsAccomplishedTextView = (TextView) this.f2151a.e;
        j.f(actionStepsAccomplishedTextView, "actionStepsAccomplishedTextView");
        return actionStepsAccomplishedTextView;
    }
}
