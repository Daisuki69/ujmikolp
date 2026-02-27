package G6;

import N5.C0466m;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import cj.C1110A;
import cj.C1132s;
import cj.H;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.BankPullListItem;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Ch.a, ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1784b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1785d;

    public /* synthetic */ f(int i, Object obj, Object obj2, Object obj3) {
        this.f1784b = obj;
        this.f1783a = i;
        this.c = obj2;
        this.f1785d = obj3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.f1783a;
        Player.PositionInfo positionInfo = (Player.PositionInfo) this.c;
        DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$45((AnalyticsListener.EventTime) this.f1784b, i, positionInfo, (Player.PositionInfo) this.f1785d, (AnalyticsListener) obj);
    }

    @Override // Ch.a
    public void run() {
        int i;
        Object next;
        g gVar = (g) this.f1784b;
        int i4 = this.f1783a;
        BankPullPaymentOption paymentOption = (BankPullPaymentOption) this.c;
        String str = (String) this.f1785d;
        kotlin.jvm.internal.j.g(paymentOption, "paymentOption");
        Pair pair = gVar.f;
        if (pair != null) {
            Object obj = pair.f18161b;
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<com.paymaya.domain.model.BankPullListItem.BankPullLinkedItem>");
            ArrayList arrayListW = C1110A.W((List) obj);
            arrayListW.remove(i4);
            if (arrayListW.isEmpty()) {
                Group group = ((MayaBankPullV2Fragment) ((K6.e) gVar.c.get())).t0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mGroupLinkedAccounts");
                    throw null;
                }
                group.setVisibility(8);
                gVar.f = new Pair(pair.f18160a, C1110A.V(arrayListW));
            }
            if (arrayListW.isEmpty()) {
                i = 0;
            } else {
                Iterator it = arrayListW.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.j.b(((BankPullListItem.BankPullLinkedItem) it.next()).getPaymentOption().getId(), paymentOption.getId()) && (i = i + 1) < 0) {
                        C1132s.j();
                        throw null;
                    }
                }
            }
            if (i < paymentOption.getMaxLinkedAccounts()) {
                Object obj2 = pair.f18160a;
                kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.paymaya.domain.model.BankPullListItem.BankPullItem>");
                ArrayList arrayListW2 = C1110A.W((List) obj2);
                Iterator it2 = C1110A.a0(arrayListW2).iterator();
                while (true) {
                    H h = (H) it2;
                    if (!h.f9381b.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = h.next();
                        if (kotlin.jvm.internal.j.b(((BankPullListItem.BankPullItem) ((IndexedValue) next).f18164b).getPaymentOption().getId(), paymentOption.getId())) {
                            break;
                        }
                    }
                }
                IndexedValue indexedValue = (IndexedValue) next;
                if (indexedValue != null && ((BankPullListItem.BankPullItem) indexedValue.f18164b).getHasReachedMaxLimit()) {
                    ((BankPullListItem.BankPullItem) arrayListW2.get(indexedValue.f18163a)).setHasReachedMaxLimit(false);
                    gVar.f = new Pair(C1110A.V(arrayListW2), C1110A.V(arrayListW));
                    K6.e eVar = (K6.e) gVar.c.get();
                    int i6 = indexedValue.f18163a;
                    J6.c cVar = ((MayaBankPullV2Fragment) eVar).w0;
                    if (cVar != null) {
                        cVar.notifyItemChanged(i6, Boolean.FALSE);
                    }
                }
            } else {
                gVar.f = new Pair(pair.f18160a, C1110A.V(arrayListW));
            }
        }
        MayaBankPullV2Fragment mayaBankPullV2Fragment = (MayaBankPullV2Fragment) ((K6.e) gVar.c.get());
        mayaBankPullV2Fragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(14);
        c1219h.t(EnumC1217f.UNLINK);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("bank", paymentOption.getId());
        LinkedPaymentOption paymentOption2 = paymentOption.getPaymentOption();
        c1219h.j.put("account_number", paymentOption2 != null ? paymentOption2.getLastFourDigits() : null);
        c1219h.j.put("bank_status", str);
        c1219h.i();
        mayaBankPullV2Fragment.z1(c1219h);
        J6.c cVar2 = mayaBankPullV2Fragment.f11648x0;
        if (cVar2 != null) {
            cVar2.f2423b.remove(i4);
            cVar2.notifyItemRemoved(i4);
        }
        FragmentActivity fragmentActivityRequireActivity = mayaBankPullV2Fragment.requireActivity();
        C0466m c0466m = mayaBankPullV2Fragment.f11642o0;
        kotlin.jvm.internal.j.d(c0466m);
        NestedScrollView nestedScrollView = (NestedScrollView) c0466m.f4150b;
        kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
        b0.e(fragmentActivityRequireActivity, nestedScrollView, null, R.string.maya_label_account_unlink_success_title_v2, R.drawable.maya_bg_snackbar_success_small_margin, R.style.JekoBoldSmallText_Snackbar_Success, 0, 0, 852);
    }
}
