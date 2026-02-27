package Dc;

import Ah.p;
import D8.C0214w;
import Kh.T;
import android.content.ContentValues;
import android.os.Bundle;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.data.database.repository.I;
import com.paymaya.data.database.repository.J;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherRedeemTransaction;
import com.paymaya.domain.store.c1;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersReceiptFragment;
import d4.AbstractC1331a;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0214w f1115b;

    public /* synthetic */ a(C0214w c0214w, int i) {
        this.f1114a = i;
        this.f1115b = c0214w;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        int i = 0;
        switch (this.f1114a) {
            case 0:
                VoucherRedeemTransaction voucherRedeemTransaction = (VoucherRedeemTransaction) obj;
                C0214w c0214w = this.f1115b;
                Voucher voucher = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get())).f14297L0;
                ((MayaBaseFragment) ((Fc.b) c0214w.c.get())).w1();
                s sVar = (Fc.b) c0214w.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.EXECUTE);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("attribution", ((MayaBaseFragment) ((Fc.b) c0214w.c.get())).n1().f10371a);
                c1219hH.j.put("campaign_name", voucher != null ? voucher.mCampaignName() : null);
                ((MayaBaseFragment) sVar).A1(c1219hH);
                if (((com.paymaya.data.preference.a) c0214w.e).e().isMayaV2TransactionReceiptVouchersEnabled()) {
                    Gc.d dVar = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get())).f14298M0;
                    if (dVar != null) {
                        MayaVouchersReceiptFragment mayaVouchersReceiptFragment = new MayaVouchersReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("voucher_redeem", voucherRedeemTransaction);
                        bundle.putParcelable("voucher", voucher);
                        mayaVouchersReceiptFragment.setArguments(bundle);
                        AbstractC1236z.h((MayaVouchersActivity) dVar, R.id.fragment_container_frame_layout_pma_activity_vouchers, mayaVouchersReceiptFragment);
                    }
                } else {
                    MayaVoucherDetailsFragment mayaVoucherDetailsFragment = (MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get());
                    FragmentActivity activity = mayaVoucherDetailsFragment.getActivity();
                    CoordinatorLayout coordinatorLayout = mayaVoucherDetailsFragment.f14293G0;
                    if (coordinatorLayout == null) {
                        j.n("mCoordinatorLayoutContainer");
                        throw null;
                    }
                    b0.e(activity, coordinatorLayout, null, R.string.maya_label_voucher_successfully_claimed, R.drawable.maya_bg_snackbar_success_small_margin, R.style.JekoBoldSmallText_Snackbar_Success, 0, mayaVoucherDetailsFragment.f10339S, 340);
                }
                c0214w.u(voucher != null ? voucher.mEndDate() : null, "REDEEMED");
                c0214w.t(voucher != null ? voucher.mExternalPartnerCode() : null, "REDEEMED");
                if (voucher != null) {
                    J j = ((c1) c0214w.f).c;
                    j.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("status", "REDEEMED");
                    j.f11302a.e("voucher", contentValues, "assignment_id = ?", new String[]{String.valueOf(voucher.mAssignmentId())});
                    c1 c1Var = (c1) c0214w.f;
                    int iMAssignmentId = voucher.mAssignmentId();
                    I i4 = c1Var.f11432d;
                    i4.getClass();
                    i4.f11301a.b("voucher_reminder", "id = ?", new String[]{String.valueOf(iMAssignmentId)});
                    return;
                }
                return;
            default:
                VoucherRedeemTransaction voucherRedeemTransaction2 = (VoucherRedeemTransaction) obj;
                j.g(voucherRedeemTransaction2, "voucherRedeemTransaction");
                C0214w c0214w2 = this.f1115b;
                p<VoucherRedeemTransaction> pVarExecuteRedeemVoucher = ((c1) c0214w2.f).f11431b.executeRedeemVoucher(voucherRedeemTransaction2.mRedeemVoucherId());
                new T(5, new Lh.d(new Lh.d(new Lh.d(AbstractC1331a.l(pVarExecuteRedeemVoucher, pVarExecuteRedeemVoucher, zh.b.a()), new a(c0214w2, i), 2), new b(c0214w2, 0), 0), new c(c0214w2, 0), 1), new A7.c(c0214w2, 16)).e();
                return;
        }
    }
}
