package O9;

import L6.ViewOnClickListenerC0318d;
import L9.C0327e;
import N5.D0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewMayaCreditSummaryFragment f4770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4771b = new ArrayList();

    public c(NewMayaCreditSummaryFragment newMayaCreditSummaryFragment) {
        this.f4770a = newMayaCreditSummaryFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4771b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        S9.c holder = (S9.c) viewHolder;
        j.g(holder, "holder");
        CreditAgreement creditAgreement = (CreditAgreement) this.f4771b.get(i);
        j.g(creditAgreement, "creditAgreement");
        C0327e c0327e = holder.c;
        c0327e.getClass();
        R9.a aVar = (R9.a) c0327e.c.get();
        String title = creditAgreement.getTitle();
        if (title == null) {
            title = creditAgreement.getHeading();
        }
        S9.c cVar = (S9.c) aVar;
        cVar.getClass();
        j.g(title, "title");
        cVar.f5693b.setText(title);
        holder.f5693b.setOnClickListener(new ViewOnClickListenerC0318d(holder, i, creditAgreement, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.maya_view_holder_summary_agreement_item, parent, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.agreement_text_view);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.agreement_text_view)));
        }
        D0 d02 = new D0(linearLayout, textView, 1);
        int i4 = S9.c.f5691d;
        NewMayaCreditSummaryFragment listener = this.f4770a;
        j.g(listener, "listener");
        return new S9.c(d02, listener);
    }
}
