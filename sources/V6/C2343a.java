package v6;

import N5.k1;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Bank;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import i8.C1593a;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import qf.d;
import t6.h;
import u6.InterfaceC2303a;
import v.AbstractC2329d;

/* JADX INFO: renamed from: v6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2343a extends RecyclerView.ViewHolder implements InterfaceC2303a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20477g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f20478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f20479b;
    public final AppCompatImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bank f20480d;
    public final MayaBankTransferListFragment e;
    public final C1593a f;

    public C2343a(k1 k1Var, MayaBankTransferListFragment mayaBankTransferListFragment) {
        super((ConstraintLayout) k1Var.e);
        this.f20478a = (AppCompatTextView) k1Var.f;
        this.f20479b = (AppCompatTextView) k1Var.f4139d;
        this.c = (AppCompatImageView) k1Var.c;
        ConstraintLayout containerViewMayaBankName = (ConstraintLayout) k1Var.f4138b;
        j.f(containerViewMayaBankName, "containerViewMayaBankName");
        this.e = mayaBankTransferListFragment;
        C1593a c1593a = new C1593a(5);
        this.f = c1593a;
        c1593a.h(this);
        containerViewMayaBankName.setOnClickListener(new d(this, 5));
    }

    public static final void D(C2343a c2343a) {
        Bank bank = c2343a.f20480d;
        if (bank != null) {
            C1593a c1593a = c2343a.f;
            c1593a.getClass();
            if (j.b(bank.mIsMaintenance(), Boolean.TRUE)) {
                return;
            }
            C2343a c2343a2 = (C2343a) ((InterfaceC2303a) c1593a.c.get());
            c2343a2.getClass();
            MayaBankTransferListFragment mayaBankTransferListFragment = c2343a2.e;
            mayaBankTransferListFragment.getClass();
            if (mayaBankTransferListFragment.t1().e().isAppEventV2BankTransferEnabled()) {
                C1220i c1220iO1 = mayaBankTransferListFragment.o1();
                C1219h c1219hE = C1219h.e(mayaBankTransferListFragment.f11577l0);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map = c1219hE.j;
                map.put("source_page", "Dashboard");
                map.put("button", "Bank Name");
                map.put("bank_code", bank.mBankIC());
                map.put("destination_page", "Bank Transfer Form Screen");
                c1220iO1.b(c1219hE);
            } else {
                C1219h c1219hH = AbstractC2329d.h(17);
                c1219hH.t(EnumC1217f.BANK);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("bank", bank.mBankName());
                mayaBankTransferListFragment.A1(c1219hH);
            }
            h hVar = mayaBankTransferListFragment.f11574i0;
            if (hVar != null) {
                MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) hVar;
                MayaBankTransferFormFragment mayaBankTransferFormFragment = new MayaBankTransferFormFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("bank", bank);
                mayaBankTransferFormFragment.setArguments(bundle);
                AbstractC1236z.i(mayaBankTransferActivity, R.id.frame_layout_container, mayaBankTransferFormFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
            }
        }
    }
}
