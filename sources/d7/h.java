package D7;

import A7.o;
import Ah.p;
import I7.i;
import J7.k;
import N5.C0453g;
import N5.s1;
import N5.u1;
import We.s;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.DateHeader;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.X0;
import com.paymaya.domain.store.Y0;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import z7.InterfaceC2554a;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends RecyclerView.Adapter implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaTransactionsFragment f1002b;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1003d;
    public final LayoutInflater e;

    public h(Context context, MayaTransactionsFragment mayaTransactionsFragment, com.paymaya.data.preference.a aVar) {
        this.f1001a = context;
        this.f1002b = mayaTransactionsFragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.e = (LayoutInflater) systemService;
    }

    @Override // J7.k
    public final boolean a(int i) {
        if (i >= this.c.size()) {
            return false;
        }
        int itemViewType = getItemViewType(i);
        return itemViewType == 0 || itemViewType == 1 || itemViewType == 2;
    }

    @Override // J7.k
    public final void b(int i, View view) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            View viewFindViewById = view.findViewById(R.id.text_view_date);
            j.e(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(((Dated) arrayList.get(i)).getMayaLocalDateTimeForDateHeader(this.f1001a.getResources().getConfiguration().locale, false));
        }
    }

    @Override // J7.k
    public final boolean c(int i) {
        return i < getItemCount() && getItemViewType(i) == 0;
    }

    public final void e(UserActivity userActivity) {
        int i = 4;
        int i4 = 0;
        int i6 = 2;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof UserActivity) {
                arrayList2.add(obj);
            }
        }
        int iIndexOf = arrayList2.indexOf(userActivity) + 1;
        if (iIndexOf > 0) {
            MayaTransactionsFragment mayaTransactionsFragment = this.f1002b;
            mayaTransactionsFragment.getClass();
            C1220i c1220iO1 = mayaTransactionsFragment.o1();
            FragmentActivity activity = mayaTransactionsFragment.getActivity();
            C1219h c1219h = new C1219h();
            c1219h.p(EnumC1215d.ACTIVITY_LIST);
            c1219h.n(17);
            c1219h.t(EnumC1217f.ENTRY);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("item_number", String.valueOf(iIndexOf));
            c1219h.j.put("service", userActivity.mMethod());
            c1220iO1.c(activity, c1219h);
            InterfaceC2554a interfaceC2554aP1 = mayaTransactionsFragment.P1();
            String strMId = userActivity.mId();
            o oVar = (o) interfaceC2554aP1;
            ((MayaBaseFragment) ((F7.c) oVar.c.get())).E1();
            Y0 y0 = oVar.f227d;
            p<UserActivity> activityDetails = y0.f11408b.getActivityDetails(strMId);
            X0 x02 = new X0(y0, 1);
            activityDetails.getClass();
            new Lh.d(new Lh.d(new Lh.h(new Lh.d(activityDetails, x02, i6), zh.b.a(), 0), new J5.a(oVar, i), i6), new J5.c(oVar, i), i4).e();
        }
    }

    public final void f(boolean z4) {
        if (z4 && !this.f1003d) {
            this.f1003d = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !this.f1003d) {
                return;
            }
            this.f1003d = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size() + (this.f1003d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.f1003d && i == getItemCount() - 1) {
            return 3;
        }
        Dated dated = (Dated) this.c.get(i);
        if (dated instanceof UserActivity) {
            return j.b(((UserActivity) dated).mType(), "System Alert") ? 1 : 2;
        }
        if (dated instanceof DateHeader) {
            return 0;
        }
        throw new PayMayaRuntimeException(s.f(i, "Cant determine view type at position "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        int itemViewType = getItemViewType(i);
        ArrayList arrayList = this.c;
        if (itemViewType == 0) {
            ((I7.a) holder).D(i, arrayList);
            return;
        }
        if (itemViewType == 1) {
            Object obj = arrayList.get(i);
            j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.UserActivity");
            UserActivity userActivity = (UserActivity) obj;
            I7.k kVar = (I7.k) holder;
            boolean z4 = kVar.f2255b;
            ConstraintLayout constraintLayout = kVar.c;
            constraintLayout.setClickable(z4);
            kVar.j.f(userActivity, false);
            constraintLayout.setOnClickListener(new Ad.a(12, kVar, userActivity));
            return;
        }
        if (itemViewType != 2) {
            if (itemViewType != 3) {
                throw new PayMayaRuntimeException(s.f(getItemViewType(i), "Invalid view type "));
            }
            return;
        }
        Object obj2 = arrayList.get(i);
        j.e(obj2, "null cannot be cast to non-null type com.paymaya.domain.model.UserActivity");
        UserActivity userActivity2 = (UserActivity) obj2;
        i iVar = (i) holder;
        iVar.f2249l.e(userActivity2, false, true);
        iVar.f2245b.setOnClickListener(new Ad.a(10, iVar, userActivity2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        LayoutInflater layoutInflater = this.e;
        if (i == 0) {
            return new I7.a(C0453g.b(layoutInflater, parent));
        }
        if (i != 1) {
            if (i == 2) {
                return new i(s1.a(layoutInflater, parent), this);
            }
            if (i != 3) {
                throw new PayMayaRuntimeException(s.f(i, "Invalid view type "));
            }
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading, parent, false);
            j.f(viewInflate, "inflate(...)");
            return new Z6.e(viewInflate);
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_holder_user_activity, parent, false);
        int i4 = R.id.guideline_end;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate2, R.id.guideline_end);
        if (guideline != null) {
            i4 = R.id.guideline_start;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(viewInflate2, R.id.guideline_start);
            if (guideline2 != null) {
                i4 = R.id.text_view_action;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_action);
                if (textView != null) {
                    i4 = R.id.text_view_date;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_date);
                    if (textView2 != null) {
                        i4 = R.id.text_view_target;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_target);
                        if (textView3 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
                            return new I7.k(new u1(constraintLayout, guideline, guideline2, textView, textView2, textView3, constraintLayout, 0), this);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i4)));
    }
}
