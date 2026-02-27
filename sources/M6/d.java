package M6;

import N5.k1;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.MaintenanceDate;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import java.util.HashMap;
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBankPullV2Fragment f3098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3099b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3100d;
    public final ImageView e;
    public final A5.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3101g;
    public boolean h;
    public String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k1 k1Var, MayaBankPullV2Fragment listener) {
        super((ConstraintLayout) k1Var.e);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f3098a = listener;
        this.f3099b = (ImageView) k1Var.f4138b;
        this.c = (TextView) k1Var.f;
        this.f3100d = (TextView) k1Var.f4139d;
        this.e = (ImageView) k1Var.c;
        this.f = new A5.l(this, 21);
        this.h = true;
    }

    public static final void F(d dVar, BankPullPaymentOption paymentOption) {
        L6.i iVar;
        MayaBankPullV2Fragment mayaBankPullV2Fragment = dVar.f3098a;
        boolean z4 = dVar.h;
        String str = dVar.i;
        mayaBankPullV2Fragment.getClass();
        kotlin.jvm.internal.j.g(paymentOption, "paymentOption");
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.n(17);
        c1219h.t(EnumC1217f.BANK);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("bank", paymentOption.getId());
        map.put("bank_status", str);
        c1219h.i();
        mayaBankPullV2Fragment.A1(c1219h);
        if (!z4 || (iVar = mayaBankPullV2Fragment.f11647v0) == null) {
            return;
        }
        AbstractC1236z.i((MayaCashInActivity) iVar, R.id.frame_layout_container, C2011b.j(paymentOption), R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    public final void D() {
        this.f3099b.setAlpha(0.4f);
        this.e.setVisibility(8);
        TextViewCompat.setTextAppearance(this.c, R.style.JekoSemiBoldTextBody_Quaternary);
        TextViewCompat.setTextAppearance(this.f3100d, R.style.CerebriBookSmallText_Tertiary);
        this.itemView.setClickable(false);
    }

    public final void E(BankPullPaymentOption bankPullListItem, boolean z4) {
        ImageUrl imageUrlMAndroidImageUrl;
        kotlin.jvm.internal.j.g(bankPullListItem, "bankPullListItem");
        this.f3101g = z4;
        A5.l lVar = this.f;
        lVar.getClass();
        ImageUrlUnfiltered iconUrl = bankPullListItem.getIconUrl();
        MaintenanceDate maintenanceDate = bankPullListItem.getMaintenanceDate();
        d dVar = (d) lVar.f175b;
        boolean z5 = dVar.f3101g;
        TextView textView = dVar.c;
        TextView textView2 = dVar.f3100d;
        if (maintenanceDate != null && !maintenanceDate.isAvailable()) {
            dVar.D();
            textView2.setVisibility(0);
            textView2.setText(maintenanceDate.mMessage());
            dVar.i = "maintenance";
            dVar.h = false;
        } else if (z5) {
            dVar.D();
            textView2.setVisibility(0);
            textView2.setText(dVar.itemView.getContext().getString(R.string.maya_label_bank_pull_maximum_accounts_message));
            dVar.i = "max_limit";
            dVar.h = false;
        } else {
            dVar.f3099b.setAlpha(1.0f);
            dVar.e.setVisibility(0);
            TextViewCompat.setTextAppearance(textView, R.style.JekoSemiBoldTextBody_Primary);
            TextViewCompat.setTextAppearance(textView2, R.style.CerebriBookSmallText_Quaternary);
            dVar.itemView.setClickable(true);
            textView2.setVisibility(8);
            dVar.i = AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
            dVar.h = true;
        }
        String strO = (iconUrl == null || (imageUrlMAndroidImageUrl = iconUrl.mAndroidImageUrl()) == null) ? null : C.O(imageUrlMAndroidImageUrl);
        int dimensionPixelSize = dVar.itemView.getResources().getDimensionPixelSize(R.dimen.maya_cash_in_bank_pull_v2_logo_size);
        C.c0(strO, R.drawable.maya_ic_bank_placeholder, dVar.f3099b, dimensionPixelSize, dimensionPixelSize, dVar.itemView.getResources().getDimensionPixelSize(R.dimen.pma_stroke_width_normal));
        String name = bankPullListItem.getName();
        kotlin.jvm.internal.j.g(name, "name");
        textView.setText(name);
        this.itemView.setOnClickListener(new Ad.a(14, this, bankPullListItem));
        this.itemView.setEnabled(true);
    }
}
