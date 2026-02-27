package M6;

import G6.w;
import N5.C0466m;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.domain.model.MaintenanceDate;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import java.util.HashMap;
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBankPullV2Fragment f3093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ItemSlideLayoutView f3094b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f3095d;
    public final ImageView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3096g;
    public final ImageView h;
    public final V2.c i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3097k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0466m c0466m, MayaBankPullV2Fragment listener) {
        super((ItemSlideLayoutView) c0466m.c);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f3093a = listener;
        ItemSlideLayoutView viewContainer = (ItemSlideLayoutView) c0466m.h;
        kotlin.jvm.internal.j.f(viewContainer, "viewContainer");
        this.f3094b = viewContainer;
        this.c = (ConstraintLayout) c0466m.i;
        this.f3095d = (ConstraintLayout) c0466m.f4150b;
        this.e = (ImageView) c0466m.f4151d;
        this.f = (TextView) c0466m.f4152g;
        this.f3096g = (TextView) c0466m.f;
        this.h = (ImageView) c0466m.e;
        this.i = new V2.c(this, 24);
        this.j = true;
    }

    public static final void E(c cVar, BankPullPaymentOption paymentOption) {
        L6.i iVar;
        MayaBankPullV2Fragment mayaBankPullV2Fragment = cVar.f3093a;
        boolean z4 = cVar.j;
        String str = cVar.f3097k;
        mayaBankPullV2Fragment.getClass();
        kotlin.jvm.internal.j.g(paymentOption, "paymentOption");
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.n(17);
        c1219h.t(EnumC1217f.LINKED_ACCOUNT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("bank", paymentOption.getId());
        LinkedPaymentOption paymentOption2 = paymentOption.getPaymentOption();
        map.put("account_number", paymentOption2 != null ? paymentOption2.getLastFourDigits() : null);
        map.put("bank_status", str);
        c1219h.i();
        mayaBankPullV2Fragment.A1(c1219h);
        if (!z4 || (iVar = mayaBankPullV2Fragment.f11647v0) == null) {
            return;
        }
        AbstractC1236z.i((MayaCashInActivity) iVar, R.id.frame_layout_container, C2011b.j(paymentOption), R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    public static final void F(c cVar, final BankPullPaymentOption paymentOption) {
        final MayaBankPullV2Fragment mayaBankPullV2Fragment = cVar.f3093a;
        final int absoluteAdapterPosition = cVar.getAbsoluteAdapterPosition();
        final String str = cVar.f3097k;
        mayaBankPullV2Fragment.getClass();
        kotlin.jvm.internal.j.g(paymentOption, "paymentOption");
        LinkedPaymentOption paymentOption2 = paymentOption.getPaymentOption();
        final String lastFourDigits = paymentOption2 != null ? paymentOption2.getLastFourDigits() : null;
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.r(EnumC1216e.UNLINK);
        c1219h.n(17);
        c1219h.t(EnumC1217f.REMOVE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("bank", paymentOption.getId());
        map.put("account_number", lastFourDigits);
        map.put("bank_status", str);
        c1219h.i();
        mayaBankPullV2Fragment.z1(c1219h);
        L6.i iVar = mayaBankPullV2Fragment.f11647v0;
        if (iVar != null) {
            String bankName = paymentOption.getName();
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: L6.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MayaBankPullV2Fragment mayaBankPullV2Fragment2 = mayaBankPullV2Fragment;
                    BankPullPaymentOption bankPullPaymentOption = paymentOption;
                    String str2 = lastFourDigits;
                    String str3 = str;
                    int i = absoluteAdapterPosition;
                    Callback.onClick_enter(view);
                    try {
                        MayaBankPullV2Fragment.Q1(mayaBankPullV2Fragment2, bankPullPaymentOption, str2, str3, i);
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            };
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) iVar;
            kotlin.jvm.internal.j.g(bankName, "bankName");
            MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231241, mayaCashInActivity.getString(R.string.maya_label_bank_pull_unlink_account_title_v2), mayaCashInActivity.getString(R.string.maya_format_bank_pull_unlink_account_description_v2, lastFourDigits, bankName), mayaCashInActivity.getString(R.string.maya_label_unlink), mayaCashInActivity.getString(R.string.pma_label_cancel), false, null, onClickListener, false, 352);
            mayaErrorDialogFragmentZ.f11850c0 = mayaBankPullV2Fragment;
            mayaErrorDialogFragmentZ.show(mayaCashInActivity.getSupportFragmentManager(), "error_dialog");
        }
    }

    public final void D(final BankPullPaymentOption bankPullListItem) {
        ImageUrl imageUrlMAndroidImageUrl;
        final int i = 0;
        final int i4 = 1;
        kotlin.jvm.internal.j.g(bankPullListItem, "bankPullListItem");
        V2.c cVar = this.i;
        cVar.getClass();
        ImageUrlUnfiltered iconUrl = bankPullListItem.getIconUrl();
        MaintenanceDate maintenanceDate = bankPullListItem.getMaintenanceDate();
        c cVar2 = (c) cVar.f6042b;
        String strO = null;
        ImageView imageView = cVar2.h;
        ImageView imageView2 = cVar2.e;
        TextView textView = cVar2.f;
        TextView textView2 = cVar2.f3096g;
        if (maintenanceDate == null || maintenanceDate.isAvailable()) {
            imageView2.setAlpha(1.0f);
            imageView.setVisibility(0);
            TextViewCompat.setTextAppearance(textView, R.style.JekoSemiBoldTextBody_Primary);
            TextViewCompat.setTextAppearance(textView2, R.style.CerebriBookSmallText_Quaternary);
            LinkedPaymentOption paymentOption = bankPullListItem.getPaymentOption();
            textView2.setText(cVar2.itemView.getContext().getString(R.string.maya_format_bank_pull_last_four_digits_v2, paymentOption != null ? paymentOption.getLastFourDigits() : null));
            cVar2.f3097k = AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
            cVar2.j = true;
        } else {
            imageView2.setAlpha(0.4f);
            imageView.setVisibility(8);
            TextViewCompat.setTextAppearance(textView, R.style.JekoSemiBoldTextBody_Quaternary);
            TextViewCompat.setTextAppearance(textView2, R.style.CerebriBookSmallText_Tertiary);
            textView2.setText(maintenanceDate.mMessage());
            cVar2.f3097k = "maintenance";
            cVar2.j = false;
        }
        if (iconUrl != null && (imageUrlMAndroidImageUrl = iconUrl.mAndroidImageUrl()) != null) {
            strO = C.O(imageUrlMAndroidImageUrl);
        }
        int dimensionPixelSize = cVar2.itemView.getResources().getDimensionPixelSize(R.dimen.maya_cash_in_bank_pull_v2_logo_size);
        C.c0(strO, R.drawable.maya_ic_bank_placeholder, cVar2.e, dimensionPixelSize, dimensionPixelSize, cVar2.itemView.getResources().getDimensionPixelSize(R.dimen.pma_stroke_width_normal));
        textView2.setVisibility(0);
        String name = bankPullListItem.getName();
        kotlin.jvm.internal.j.g(name, "name");
        textView.setText(name);
        this.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: M6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f3092b;

            {
                this.f3092b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        c cVar3 = this.f3092b;
                        BankPullPaymentOption bankPullPaymentOption = bankPullListItem;
                        Callback.onClick_enter(view);
                        try {
                            c.E(cVar3, bankPullPaymentOption);
                            return;
                        } finally {
                        }
                    default:
                        c cVar4 = this.f3092b;
                        BankPullPaymentOption bankPullPaymentOption2 = bankPullListItem;
                        Callback.onClick_enter(view);
                        try {
                            c.F(cVar4, bankPullPaymentOption2);
                            return;
                        } finally {
                        }
                }
            }
        });
        this.itemView.setClickable(true);
        this.itemView.setEnabled(true);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: M6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f3092b;

            {
                this.f3092b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        c cVar3 = this.f3092b;
                        BankPullPaymentOption bankPullPaymentOption = bankPullListItem;
                        Callback.onClick_enter(view);
                        try {
                            c.E(cVar3, bankPullPaymentOption);
                            return;
                        } finally {
                        }
                    default:
                        c cVar4 = this.f3092b;
                        BankPullPaymentOption bankPullPaymentOption2 = bankPullListItem;
                        Callback.onClick_enter(view);
                        try {
                            c.F(cVar4, bankPullPaymentOption2);
                            return;
                        } finally {
                        }
                }
            }
        });
        this.f3094b.setItemSlideLayoutListener(new w(this, 18));
    }
}
