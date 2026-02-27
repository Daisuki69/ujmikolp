package v6;

import J1.e;
import N5.m1;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Bank;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.store.C1269l;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import i8.C1593a;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import n6.InterfaceC1932c;
import o6.n;
import qf.d;
import t6.h;
import u6.InterfaceC2304b;
import v.AbstractC2329d;

/* JADX INFO: renamed from: v6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2344b extends RecyclerView.ViewHolder implements InterfaceC2304b {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f20481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f20482b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f20483d;
    public final TextView e;
    public Favorite f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MayaBankTransferListFragment f20484g;
    public final C1593a h;

    public C2344b(m1 m1Var, MayaBankTransferListFragment mayaBankTransferListFragment) {
        super(m1Var.f4156b);
        this.f20481a = m1Var.e;
        this.f20482b = m1Var.f4158g;
        this.c = m1Var.f;
        this.f20483d = m1Var.f4157d;
        ConstraintLayout constraintLayoutContainer = m1Var.c;
        j.f(constraintLayoutContainer, "constraintLayoutContainer");
        this.e = m1Var.h;
        this.f20484g = mayaBankTransferListFragment;
        C1593a c1593a = new C1593a(6);
        this.h = c1593a;
        c1593a.h(this);
        constraintLayoutContainer.setOnClickListener(new d(this, 6));
    }

    public static final void D(C2344b c2344b) {
        C2344b c2344b2;
        Favorite favorite;
        Favorite favorite2 = c2344b.f;
        if (favorite2 != null) {
            C1593a c1593a = c2344b.h;
            c1593a.getClass();
            if (!j.b(favorite2.mIsMaintenance(), Boolean.FALSE) || (favorite = (c2344b2 = (C2344b) ((InterfaceC2304b) c1593a.c.get())).f) == null) {
                return;
            }
            MayaBankTransferListFragment mayaBankTransferListFragment = c2344b2.f20484g;
            mayaBankTransferListFragment.getClass();
            if (mayaBankTransferListFragment.t1().e().isAppEventV2BankTransferEnabled()) {
                String str = "BANK_TRANSFER_BANK_LIST_" + EnumC1212a.BUTTON + Global.UNDERSCORE + AbstractC1173g.G(18);
                InterfaceC1932c interfaceC1932cG1 = mayaBankTransferListFragment.G1();
                String strMMeta = favorite.mContentPreview().mMeta();
                C1269l c1269l = ((n) interfaceC1932cG1).f18806d;
                c1269l.getClass();
                e eVar = new e(1);
                eVar.f2381b = strMMeta;
                Bank bankC = c1269l.f11457b.c(eVar);
                String strMBankIC = bankC != null ? bankC.mBankIC() : null;
                C1220i c1220iO1 = mayaBankTransferListFragment.o1();
                C1219h c1219hE = C1219h.e(str);
                HashMap map = c1219hE.j;
                map.put("source_page", "Dashboard");
                map.put("button", "Favorite Bank");
                map.put("bank_code", strMBankIC);
                map.put("destination_page", "Bank Transfer Form Screen");
                c1220iO1.b(c1219hE);
            } else {
                C1219h c1219hH = AbstractC2329d.h(17);
                c1219hH.t(EnumC1217f.FAVORITE);
                mayaBankTransferListFragment.A1(c1219hH);
            }
            h hVar = mayaBankTransferListFragment.f11574i0;
            if (hVar != null) {
                ((MayaBankTransferActivity) hVar).b2(favorite);
            }
        }
    }
}
