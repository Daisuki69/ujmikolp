package Dc;

import Gc.f;
import Lh.h;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.VoucherBase;
import com.paymaya.domain.store.c1;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersPageFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC2509a implements Cc.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1 f1120d;
    public final com.paymaya.data.preference.a e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1121g;
    public int h;

    public d(com.paymaya.data.preference.a mPreference, c1 c1Var) {
        j.g(mPreference, "mPreference");
        this.f1120d = c1Var;
        this.e = mPreference;
        this.f = "";
        this.h = 1;
    }

    public final void k() {
        if (this.f1121g) {
            return;
        }
        this.f1121g = true;
        new Lh.d(new Lh.d(new Lh.d(new h(this.f1120d.b(1, this.f), zh.b.a(), 0), new J5.a(this, 20), 2), new J5.c(this, 18), 0), new V2.c(this, 17), 1).e();
    }

    public final void l(PayMayaError payMayaError) {
        SpringView springView = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).f14315q0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.i();
        Ac.c cVar = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).f14320z0;
        if (cVar == null) {
            j.n("mVoucherItemAdapter");
            throw null;
        }
        if (cVar.f254d) {
            cVar.g(false);
        }
        this.f1121g = false;
        ArrayList arrayList = new ArrayList(this.f1120d.d(this.f));
        if (!arrayList.isEmpty()) {
            n(arrayList);
            ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).L1();
        } else {
            if (payMayaError.isSessionTimeout()) {
                return;
            }
            if (payMayaError.isNetworkError()) {
                MayaVouchersPageFragment mayaVouchersPageFragment = (MayaVouchersPageFragment) ((Fc.d) this.c.get());
                mayaVouchersPageFragment.getClass();
                MayaBaseLoadingFragment.N1(mayaVouchersPageFragment, 100, null, null, new f(mayaVouchersPageFragment, 0), 30);
            } else {
                MayaVouchersPageFragment mayaVouchersPageFragment2 = (MayaVouchersPageFragment) ((Fc.d) this.c.get());
                MayaBaseLoadingFragment.N1(mayaVouchersPageFragment2, 200, mayaVouchersPageFragment2.getString(R.string.maya_label_loading_please_wait), mayaVouchersPageFragment2.getString(R.string.maya_label_that_didnt_load_right), new f(mayaVouchersPageFragment2, 1), 24);
            }
        }
    }

    public final void m(VoucherBase voucherBase) {
        j.g(voucherBase, "voucherBase");
        this.h = voucherBase.mMeta().mCurrentPage();
        ArrayList arrayList = new ArrayList(this.f1120d.d(this.f));
        if (arrayList.isEmpty()) {
            String str = this.f;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -591252731) {
                    if (iHashCode != 77184) {
                        if (iHashCode == 2408251 && str.equals("REDEEMED")) {
                            MayaVouchersPageFragment mayaVouchersPageFragment = (MayaVouchersPageFragment) ((Fc.d) this.c.get());
                            TextView textView = mayaVouchersPageFragment.u0;
                            if (textView == null) {
                                j.n("mTextViewEmptyVouchersTitle");
                                throw null;
                            }
                            textView.setText(R.string.maya_label_available_tab_empty_vouchers_title);
                            TextView textView2 = mayaVouchersPageFragment.f14318v0;
                            if (textView2 == null) {
                                j.n("mTextViewEmptyVouchersSubtitle");
                                throw null;
                            }
                            textView2.setText(R.string.maya_label_available_tab_empty_vouchers_subtitle);
                            Group group = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).t0;
                            if (group == null) {
                                j.n("mConstraintGroupEmptyVouchersSpiels");
                                throw null;
                            }
                            group.setVisibility(0);
                        }
                    } else if (str.equals("NEW")) {
                        MayaVouchersPageFragment mayaVouchersPageFragment2 = (MayaVouchersPageFragment) ((Fc.d) this.c.get());
                        TextView textView3 = mayaVouchersPageFragment2.u0;
                        if (textView3 == null) {
                            j.n("mTextViewEmptyVouchersTitle");
                            throw null;
                        }
                        textView3.setText(R.string.maya_label_available_tab_empty_vouchers_title);
                        TextView textView4 = mayaVouchersPageFragment2.f14318v0;
                        if (textView4 == null) {
                            j.n("mTextViewEmptyVouchersSubtitle");
                            throw null;
                        }
                        textView4.setText(R.string.maya_label_available_tab_empty_vouchers_subtitle);
                        Group group2 = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).t0;
                        if (group2 == null) {
                            j.n("mConstraintGroupEmptyVouchersSpiels");
                            throw null;
                        }
                        group2.setVisibility(0);
                    }
                } else if (str.equals("EXPIRED")) {
                    MayaVouchersPageFragment mayaVouchersPageFragment3 = (MayaVouchersPageFragment) ((Fc.d) this.c.get());
                    TextView textView5 = mayaVouchersPageFragment3.u0;
                    if (textView5 == null) {
                        j.n("mTextViewEmptyVouchersTitle");
                        throw null;
                    }
                    textView5.setText(R.string.maya_label_available_tab_empty_vouchers_title);
                    TextView textView6 = mayaVouchersPageFragment3.f14318v0;
                    if (textView6 == null) {
                        j.n("mTextViewEmptyVouchersSubtitle");
                        throw null;
                    }
                    textView6.setText(R.string.maya_label_available_tab_empty_vouchers_subtitle);
                    Group group3 = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).t0;
                    if (group3 == null) {
                        j.n("mConstraintGroupEmptyVouchersSpiels");
                        throw null;
                    }
                    group3.setVisibility(0);
                }
            }
            RecyclerView recyclerView = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).f14316r0;
            if (recyclerView == null) {
                j.n("mRecyclerViewItems");
                throw null;
            }
            recyclerView.setVisibility(8);
        } else {
            n(arrayList);
        }
        this.f1121g = false;
        SpringView springView = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).f14315q0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.i();
        Ac.c cVar = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).f14320z0;
        if (cVar == null) {
            j.n("mVoucherItemAdapter");
            throw null;
        }
        if (cVar.f254d) {
            cVar.g(false);
        }
        ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).L1();
    }

    public final void n(ArrayList arrayList) {
        Group group = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).t0;
        if (group == null) {
            j.n("mConstraintGroupEmptyVouchersSpiels");
            throw null;
        }
        group.setVisibility(8);
        RecyclerView recyclerView = ((MayaVouchersPageFragment) ((Fc.d) this.c.get())).f14316r0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setVisibility(0);
        MayaVouchersPageFragment mayaVouchersPageFragment = (MayaVouchersPageFragment) ((Fc.d) this.c.get());
        mayaVouchersPageFragment.getClass();
        Ac.c cVar = mayaVouchersPageFragment.f14320z0;
        if (cVar == null) {
            j.n("mVoucherItemAdapter");
            throw null;
        }
        ArrayList arrayList2 = cVar.c;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Ac.d(arrayList2, arrayList));
        j.f(diffResultCalculateDiff, "calculateDiff(...)");
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        diffResultCalculateDiff.dispatchUpdatesTo(cVar);
    }
}
