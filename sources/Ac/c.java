package Ac;

import A7.f;
import Gc.g;
import N5.C1;
import N5.F;
import We.A;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.J;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherDenomination;
import com.paymaya.domain.model.VoucherListItem;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersPageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaVouchersPageFragment f252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f253b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f254d;
    public final A e;
    public final com.paymaya.data.preference.a f;

    public c(Context context, MayaVouchersPageFragment mayaVouchersPageFragment, A a8, com.paymaya.data.preference.a aVar) {
        this.f252a = mayaVouchersPageFragment;
        Object systemService = context.getSystemService(numX49.tnTj78("buTP"));
        j.e(systemService, numX49.tnTj78("buTb"));
        this.f253b = (LayoutInflater) systemService;
        this.c = new ArrayList();
        this.f254d = false;
        this.e = a8;
        this.f = aVar;
    }

    public final void e(Voucher voucher) {
        String string;
        String strMExternalPartnerCode;
        MayaVouchersPageFragment mayaVouchersPageFragment = this.f252a;
        Object systemService = mayaVouchersPageFragment.requireActivity().getSystemService(numX49.tnTj78("buT2"));
        j.e(systemService, numX49.tnTj78("buTL"));
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (voucher == null || (strMExternalPartnerCode = voucher.mExternalPartnerCode()) == null) {
            string = null;
        } else {
            int length = strMExternalPartnerCode.length() - 1;
            int i = 0;
            boolean z4 = false;
            while (i <= length) {
                boolean z5 = j.i(strMExternalPartnerCode.charAt(!z4 ? i : length), 32) <= 0;
                if (z4) {
                    if (!z5) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z5) {
                    i++;
                } else {
                    z4 = true;
                }
            }
            string = strMExternalPartnerCode.subSequence(i, length + 1).toString();
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(numX49.tnTj78("buTr"), string));
        FragmentActivity activity = mayaVouchersPageFragment.getActivity();
        SpringView springView = mayaVouchersPageFragment.f14315q0;
        if (springView != null) {
            b0.e(activity, springView, null, R.string.maya_label_voucher_code_copied, R.drawable.maya_bg_snackbar_success_small_margin, R.style.JekoBoldSmallText_Snackbar_Success, 0, 0, 852);
        } else {
            j.n(numX49.tnTj78("buTZ"));
            throw null;
        }
    }

    public final void f(Voucher voucher) {
        MayaVouchersPageFragment mayaVouchersPageFragment = this.f252a;
        C1220i c1220iO1 = mayaVouchersPageFragment.o1();
        FragmentActivity activity = mayaVouchersPageFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaVouchersPageFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.VOUCHER);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put(numX49.tnTj78("buTk"), voucher != null ? voucher.mCampaignName() : null);
        c1220iO1.c(activity, c1219hD);
        g gVar = mayaVouchersPageFragment.f14311A0;
        if (gVar != null) {
            Bundle bundleD = androidx.media3.datasource.cache.c.d(numX49.tnTj78("buTB"), voucher != null ? voucher.mCode() : null);
            MayaVoucherDetailsFragment mayaVoucherDetailsFragment = new MayaVoucherDetailsFragment();
            mayaVoucherDetailsFragment.setArguments(bundleD);
            AbstractC1236z.h((MayaVouchersActivity) gVar, R.id.fragment_container_frame_layout_pma_activity_vouchers, mayaVoucherDetailsFragment);
        }
    }

    public final void g(boolean z4) {
        if (z4 && !this.f254d) {
            this.f254d = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !this.f254d) {
                return;
            }
            this.f254d = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size() + (this.f254d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (this.f254d && i == getItemCount() + (-1)) ? VoucherListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue() : ((VoucherListItem) this.c.get(i)).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        j.g(viewHolder, numX49.tnTj78("buTu"));
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            VoucherListItem voucherListItem = (VoucherListItem) arrayList.get(i);
            VoucherListItem.VIEW_TYPE viewType = voucherListItem.getViewType();
            int i4 = viewType == null ? -1 : a.f251a[viewType.ordinal()];
            String strTnTj78 = numX49.tnTj78("buTV");
            String strTnTj782 = numX49.tnTj78("buTS");
            String strTnTj783 = numX49.tnTj78("buTj");
            String strTnTj784 = numX49.tnTj78("buTd");
            if (i4 == 1) {
                Ic.b bVar = (Ic.b) viewHolder;
                Voucher voucher = (Voucher) voucherListItem;
                bVar.f2281d = voucher;
                f fVar = bVar.c;
                fVar.getClass();
                boolean zMHasReminder = voucher.mHasReminder();
                F f = ((Ic.b) fVar.f210b).f2279a;
                ((AppCompatCheckBox) f.h).setChecked(zMHasReminder);
                ((ImageView) f.f3616g).setActivated(zMHasReminder);
                ((TextView) f.j).setText(((TextView) f.e).getContext().getString(R.string.pma_label_format_voucher_validity, AbstractC1234x.j(AbstractC1234x.b(voucher.mEndDate()))));
                boolean zIsVoucherCalendarReminderEnabled = ((com.paymaya.data.preference.a) fVar.c).e().isVoucherCalendarReminderEnabled();
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) f.h;
                ImageView imageView = (ImageView) f.f3616g;
                if (zIsVoucherCalendarReminderEnabled) {
                    imageView.setVisibility(0);
                    appCompatCheckBox.setVisibility(8);
                } else {
                    imageView.setVisibility(4);
                    appCompatCheckBox.setVisibility(0);
                }
                VoucherDenomination voucherDenominationMDenomination = voucher.mDenomination();
                if (voucherDenominationMDenomination == null) {
                    fVar.n(voucher.mCampaignName(), strTnTj784);
                    return;
                }
                if (numX49.tnTj78("buTi").equalsIgnoreCase(voucherDenominationMDenomination.mType()) && voucherDenominationMDenomination.mValue() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    String strMCampaignName = voucher.mCampaignName();
                    j.f(strMCampaignName, strTnTj783);
                    ((TextView) f.e).setText(strMCampaignName);
                    ((TextView) f.c).setVisibility(8);
                    return;
                }
                String strMStringValue = voucherDenominationMDenomination.mStringValue();
                if (strMStringValue != null && !C2576A.H(strMStringValue)) {
                    fVar.n(voucher.mCampaignName(), strTnTj782 + J.f10420a.format(voucherDenominationMDenomination.mValue()));
                    return;
                }
                if (!strTnTj78.equalsIgnoreCase(voucherDenominationMDenomination.mType())) {
                    String strMCampaignName2 = voucher.mCampaignName();
                    j.f(strMCampaignName2, strTnTj783);
                    ((TextView) f.e).setText(strMCampaignName2);
                    ((TextView) f.c).setVisibility(8);
                    return;
                }
                fVar.n(voucher.mCampaignName(), strTnTj782 + J.f10420a.format(voucherDenominationMDenomination.mValue()));
                return;
            }
            if (i4 == 2) {
                Ic.d dVar = (Ic.d) viewHolder;
                Voucher voucher2 = (Voucher) voucherListItem;
                dVar.f2286d = voucher2;
                J5.c cVar = dVar.f2285b;
                cVar.getClass();
                String strMRedeemedDate = voucher2.mRedeemedDate();
                Ic.d dVar2 = (Ic.d) cVar.f2418b;
                C1 c12 = dVar2.f2284a;
                if (strMRedeemedDate == null || strMRedeemedDate.length() == 0) {
                    c12.j.setVisibility(8);
                } else {
                    c12.j.setText(dVar2.itemView.getContext().getString(R.string.maya_label_format_voucher_claimed_date, AbstractC1234x.j(AbstractC1234x.b(strMRedeemedDate))));
                    c12.j.setVisibility(0);
                }
                VoucherDenomination voucherDenominationMDenomination2 = voucher2.mDenomination();
                if (voucherDenominationMDenomination2 == null) {
                    cVar.h(voucher2.mCampaignName(), strTnTj784);
                    return;
                }
                String strMExternalPartnerCode = voucher2.mExternalPartnerCode();
                if (strMExternalPartnerCode != null && !C2576A.H(strMExternalPartnerCode)) {
                    String strMCampaignName3 = voucher2.mCampaignName();
                    String strMExternalPartnerCode2 = voucher2.mExternalPartnerCode();
                    c12.f3572d.setText(strMCampaignName3);
                    c12.f3575l.setText(strMExternalPartnerCode2);
                    c12.i.setVisibility(0);
                    c12.f3573g.setVisibility(8);
                    return;
                }
                String strMStringValue2 = voucherDenominationMDenomination2.mStringValue();
                if (strMStringValue2 != null && !C2576A.H(strMStringValue2)) {
                    cVar.h(voucher2.mCampaignName(), strTnTj782 + J.f10420a.format(voucherDenominationMDenomination2.mValue()));
                    return;
                }
                if (strTnTj78.equalsIgnoreCase(voucherDenominationMDenomination2.mType())) {
                    cVar.h(voucher2.mCampaignName(), strTnTj782 + J.f10420a.format(voucherDenominationMDenomination2.mValue()));
                    return;
                }
                String strMCampaignName4 = voucher2.mCampaignName();
                j.f(strMCampaignName4, strTnTj783);
                c12.f3572d.setText(strMCampaignName4);
                c12.f3573g.setVisibility(8);
                c12.i.setVisibility(8);
                return;
            }
            if (i4 != 3) {
                return;
            }
            Ic.f fVar2 = (Ic.f) viewHolder;
            Voucher voucher3 = (Voucher) voucherListItem;
            fVar2.f2291d = voucher3;
            V2.c cVar2 = fVar2.f2290b;
            cVar2.getClass();
            String strMEndDate = voucher3.mEndDate();
            C1 c13 = ((Ic.f) cVar2.f6042b).f2289a;
            if (strMEndDate == null || strMEndDate.length() == 0) {
                c13.f3575l.setVisibility(8);
            } else {
                String strJ = AbstractC1234x.j(AbstractC1234x.b(strMEndDate));
                TextView textView = c13.f3575l;
                textView.setText(textView.getContext().getString(R.string.maya_label_format_voucher_expired, strJ));
                c13.f3575l.setVisibility(0);
            }
            VoucherDenomination voucherDenominationMDenomination3 = voucher3.mDenomination();
            if (voucherDenominationMDenomination3 == null) {
                cVar2.d(voucher3.mCampaignName(), strTnTj784);
                return;
            }
            String strMExternalPartnerCode3 = voucher3.mExternalPartnerCode();
            if (strMExternalPartnerCode3 != null && !C2576A.H(strMExternalPartnerCode3)) {
                String strMCampaignName5 = voucher3.mCampaignName();
                j.f(strMCampaignName5, strTnTj783);
                String strMExternalPartnerCode4 = voucher3.mExternalPartnerCode();
                c13.f3572d.setText(strMCampaignName5);
                c13.j.setText(strMExternalPartnerCode4);
                c13.i.setVisibility(0);
                c13.f3573g.setVisibility(8);
                return;
            }
            String strMStringValue3 = voucherDenominationMDenomination3.mStringValue();
            if (strMStringValue3 != null && !C2576A.H(strMStringValue3)) {
                cVar2.d(voucher3.mCampaignName(), strTnTj782 + J.f10420a.format(voucherDenominationMDenomination3.mValue()));
                return;
            }
            if (strTnTj78.equalsIgnoreCase(voucherDenominationMDenomination3.mType())) {
                cVar2.d(voucher3.mCampaignName(), strTnTj782 + J.f10420a.format(voucherDenominationMDenomination3.mValue()));
                return;
            }
            String strMCampaignName6 = voucher3.mCampaignName();
            j.f(strMCampaignName6, strTnTj783);
            c13.f3572d.setText(strMCampaignName6);
            c13.f3573g.setVisibility(8);
            c13.i.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[PHI: r3
  0x00cb: PHI (r3v55 int) = (r3v54 int), (r3v56 int), (r3v57 int) binds: [B:19:0x008a, B:21:0x0097, B:23:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r33, int r34) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.c.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
