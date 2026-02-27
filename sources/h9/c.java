package H9;

import N5.C0491z;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1132s;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.domain.model.MissionV2Reward;
import com.paymaya.domain.model.MissionV2Validity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.j;
import w.C2361c;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f2147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView.Adapter f2148b;
    public final C2361c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MissionV2 f2149d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f2150g;
    public final TextView h;
    public final ProgressBar i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(C0491z c0491z, FragmentActivity context, b bVar) {
        super((ConstraintLayout) c0491z.f4303b);
        j.g(context, "context");
        this.f2147a = context;
        this.e = (TextView) c0491z.f4304d;
        this.f = (TextView) c0491z.f4305g;
        this.f2150g = (TextView) c0491z.h;
        this.h = (TextView) c0491z.f;
        ConstraintLayout inProgressItemContainerLayout = (ConstraintLayout) c0491z.c;
        j.f(inProgressItemContainerLayout, "inProgressItemContainerLayout");
        this.i = (ProgressBar) c0491z.e;
        this.c = new C2361c(this, 5);
        this.f2148b = (RecyclerView.Adapter) bVar;
        inProgressItemContainerLayout.setOnClickListener(new Ba.a(this, 12));
    }

    public final void D(MissionV2 missionV2) {
        int i;
        this.f2149d = missionV2;
        C2361c c2361c = this.c;
        c2361c.getClass();
        if (missionV2 != null) {
            String campaignName = missionV2.getTitle();
            c cVar = (c) c2361c.f20518b;
            j.g(campaignName, "campaignName");
            cVar.e.setText(campaignName);
            MissionV2Validity validity = missionV2.getValidity();
            FragmentActivity fragmentActivity = cVar.f2147a;
            TextView textView = cVar.f;
            if (validity != null) {
                textView.setVisibility(0);
                String upperCase = (validity.getValue() + Global.BLANK + validity.getUnit()).toUpperCase(Locale.ROOT);
                j.f(upperCase, "toUpperCase(...)");
                textView.setText(fragmentActivity.getString(R.string.maya_label_format_missions_validity_time_left, upperCase));
            } else {
                textView.setVisibility(8);
            }
            MissionV2Reward reward = missionV2.getReward();
            String title = reward != null ? reward.getTitle() : null;
            TextView textView2 = cVar.f2150g;
            if (title != null) {
                textView2.setVisibility(0);
                String missionRewardText = reward.getTitle();
                j.g(missionRewardText, "missionRewardText");
                textView2.setText(missionRewardText);
            } else {
                textView2.setVisibility(4);
            }
            List<MissionV2Action> actions = missionV2.getActions();
            List<MissionV2Action> list = actions;
            if (list == null || list.isEmpty()) {
                return;
            }
            List<MissionV2Action> list2 = actions;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (j.b(((MissionV2Action) it.next()).getInDetailsCompleted(), Boolean.TRUE) && (i = i + 1) < 0) {
                        C1132s.j();
                        throw null;
                    }
                }
            }
            int size = actions.size();
            AbstractC1228q.b(cVar.i, sj.b.a((((double) i) / ((double) size)) * 100.0d));
            cVar.h.setText(fragmentActivity.getResources().getQuantityString(R.plurals.maya_label_missions_format_mission_tasks_completed, size, Integer.valueOf(i), Integer.valueOf(size)));
        }
    }
}
