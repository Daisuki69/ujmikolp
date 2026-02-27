package Ca;

import N5.X0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import com.paymaya.domain.model.PushApprovalPresentationPendingRequest;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;
import org.joda.time.DateTimeZone;
import qk.i;
import w5.C2383a;
import zj.C2578C;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaPushApprovalListFragment f760a;

    public a(MayaPushApprovalListFragment mayaPushApprovalListFragment) {
        super(new C2383a());
        this.f760a = mayaPushApprovalListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Ga.a aVar = (Ga.a) viewHolder;
        j.g(aVar, numX49.tnTj78("bVBP"));
        Object obj = getCurrentList().get(i);
        j.f(obj, numX49.tnTj78("bVBb"));
        PushApprovalPendingRequest pushApprovalPendingRequest = (PushApprovalPendingRequest) obj;
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        p8.a aVar2 = aVar.c;
        aVar2.getClass();
        j.g(dateTimeZone, numX49.tnTj78("bVB2"));
        String strF0 = C2578C.f0(12, pushApprovalPendingRequest.getRrn());
        String strR = i.r(pushApprovalPendingRequest.getCreatedAt(), dateTimeZone);
        if (strR == null) {
            strR = numX49.tnTj78("bVBL");
        }
        PushApprovalPresentationPendingRequest pushApprovalPresentationPendingRequest = new PushApprovalPresentationPendingRequest(strF0, strR);
        X0 x02 = ((Ga.a) aVar2.f19074b).f1937a;
        x02.f4031d.setText(pushApprovalPresentationPendingRequest.getShortenedRrn());
        x02.c.setText(x02.f4030b.getResources().getString(R.string.maya_push_approval_list_sent_on_date, pushApprovalPresentationPendingRequest.getFormattedCreatedAt()));
        aVar.f1937a.f4030b.setOnClickListener(new Ad.a(7, aVar, pushApprovalPendingRequest));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.g(viewGroup, numX49.tnTj78("bVBr"));
        View viewE = AbstractC1414e.e(viewGroup, R.layout.maya_view_holder_push_approval_list_item, viewGroup, false);
        int i4 = R.id.text_view_approve_request_date_time;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_approve_request_date_time);
        if (textView != null) {
            i4 = R.id.text_view_approve_request_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_approve_request_title);
            if (textView2 != null) {
                return new Ga.a(new X0((LinearLayout) viewE, textView, textView2, 2), this.f760a);
            }
        }
        throw new NullPointerException(numX49.tnTj78("bVBZ").concat(viewE.getResources().getResourceName(i4)));
    }
}
