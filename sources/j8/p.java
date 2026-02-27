package J8;

import G5.u;
import N5.Z0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.KycUpgradeStepImage;
import java.util.ArrayList;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f2483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2484b = new ArrayList();

    public p(u uVar) {
        this.f2483a = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2484b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o holder = (o) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        KycUpgradeStepImage item = (KycUpgradeStepImage) this.f2484b.get(i);
        kotlin.jvm.internal.j.g(item, "item");
        Z0 z02 = holder.f2481a;
        z02.e.setText(String.valueOf(i + 1));
        String instruction = item.getInstruction();
        if (instruction != null && instruction.length() != 0) {
            HtmlTextView htmlTextView = z02.f4045d;
            htmlTextView.setEnableClickableTextListener(true);
            htmlTextView.setOnLinkClickListener(holder.f2482b);
            htmlTextView.setTextHTML(item.getInstruction());
        }
        AbstractC1955a.w(z02.c, item.getUrl(), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        View viewInflate = x3.d.p(parent).inflate(R.layout.maya_item_upgrade_step, parent, false);
        int i4 = R.id.image_view_step;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_step);
        if (imageView != null) {
            i4 = R.id.text_view_step_instruction;
            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_step_instruction);
            if (htmlTextView != null) {
                i4 = R.id.text_view_step_number;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_step_number);
                if (textView != null) {
                    return new o(new Z0((ConstraintLayout) viewInflate, imageView, htmlTextView, textView, 0), this.f2483a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
