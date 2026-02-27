package jb;

import N5.Y0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.ReKycNudgeInfoContent;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import mb.C1860a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17736b;

    public a(Context context, ArrayList arrayList) {
        this.f17735a = context;
        this.f17736b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f17736b.size();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1860a holder = (C1860a) viewHolder;
        j.g(holder, "holder");
        ReKycNudgeInfoContent content = (ReKycNudgeInfoContent) this.f17736b.get(i);
        j.g(content, "content");
        String label = content.getLabel();
        if (label != null) {
            int iHashCode = label.hashCode();
            Context context = holder.f18393a;
            Y0 y0 = holder.f18394b;
            switch (iHashCode) {
                case -1711325159:
                    if (label.equals("Wallet")) {
                        y0.c.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.maya_ic_services_wallet));
                        y0.f4039d.setText("Wallet");
                    }
                    break;
                case -757365607:
                    if (label.equals("Savings")) {
                        y0.c.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.maya_ic_services_savings));
                        y0.f4039d.setText("Savings");
                        break;
                    }
                    break;
                case 2026542873:
                    if (label.equals("Credit")) {
                        y0.c.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.maya_ic_services_credit));
                        y0.f4039d.setText("Credit");
                        break;
                    }
                    break;
                case 2027150561:
                    if (label.equals("Crypto")) {
                        y0.c.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.maya_ic_services_crypto));
                        y0.f4039d.setText("Crypto");
                        break;
                    }
                    break;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewE = AbstractC1414e.e(parent, R.layout.maya_view_holder_re_kyc_nudge_info, parent, false);
        int i4 = R.id.image_view_info_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE, R.id.image_view_info_icon);
        if (imageView != null) {
            i4 = R.id.text_view_info_label;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_info_label);
            if (textView != null) {
                return new C1860a(this.f17735a, new Y0((ConstraintLayout) viewE, imageView, textView, 4));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
    }
}
