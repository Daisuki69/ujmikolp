package D7;

import A7.A;
import A7.w;
import A7.x;
import Ah.p;
import F7.s;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.X0;
import com.paymaya.domain.store.Y0;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import java.util.ArrayList;
import k2.v0;
import kotlin.jvm.internal.j;
import z7.InterfaceC2555b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaWalletFragment f986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f987b = new ArrayList();
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f988d;

    public a(Context context, MayaWalletFragment mayaWalletFragment) {
        this.f986a = mayaWalletFragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.c = (LayoutInflater) systemService;
        this.f988d = true;
    }

    public final void e(UserActivity userActivity) {
        int i = 2;
        ArrayList arrayList = this.f987b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof UserActivity) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.indexOf(userActivity) + 1 > 0) {
            MayaWalletFragment mayaWalletFragment = this.f986a;
            mayaWalletFragment.getClass();
            v0.F(mayaWalletFragment, "transaction_receipt", null, 30);
            InterfaceC2555b interfaceC2555bP1 = mayaWalletFragment.P1();
            String strMId = userActivity.mId();
            A a8 = (A) interfaceC2555bP1;
            ((MayaBaseFragment) ((s) a8.c.get())).E1();
            Y0 y0 = a8.e;
            p<UserActivity> activityDetails = y0.f11408b.getActivityDetails(strMId);
            X0 x02 = new X0(y0, 1);
            activityDetails.getClass();
            a8.e(new Lh.d(new Lh.d(new Lh.h(new Lh.d(activityDetails, x02, 2), zh.b.a(), 0), new w(a8, i), 2), new x(a8, 2), 0).e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f987b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Dated dated = (Dated) this.f987b.get(i);
        if (dated instanceof UserActivity) {
            return !j.b(((UserActivity) dated).mType(), "System Alert") ? 1 : 0;
        }
        throw new PayMayaRuntimeException(We.s.f(i, "Cant determine view type at position "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        int itemViewType = getItemViewType(i);
        ArrayList arrayList = this.f987b;
        if (itemViewType == 0) {
            Object obj = arrayList.get(i);
            j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.UserActivity");
            UserActivity userActivity = (UserActivity) obj;
            I7.j jVar = (I7.j) holder;
            boolean z4 = jVar.f2251b;
            ConstraintLayout constraintLayout = jVar.c;
            constraintLayout.setClickable(z4);
            jVar.j.f(userActivity, true);
            constraintLayout.setOnClickListener(new Ad.a(11, jVar, userActivity));
            return;
        }
        if (itemViewType != 1) {
            throw new PayMayaRuntimeException(We.s.f(getItemViewType(i), "Invalid view type "));
        }
        Object obj2 = arrayList.get(i);
        j.e(obj2, "null cannot be cast to non-null type com.paymaya.domain.model.UserActivity");
        UserActivity userActivity2 = (UserActivity) obj2;
        I7.h hVar = (I7.h) holder;
        hVar.f2243l.e(userActivity2, true, this.f988d);
        hVar.f2239b.setOnClickListener(new Ad.a(9, hVar, userActivity2));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[PHI: r2
  0x009c: PHI (r2v11 int) = (r2v10 int), (r2v16 int), (r2v18 int), (r2v19 int) binds: [B:7:0x0037, B:15:0x005e, B:19:0x0075, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r22, int r23) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D7.a.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
