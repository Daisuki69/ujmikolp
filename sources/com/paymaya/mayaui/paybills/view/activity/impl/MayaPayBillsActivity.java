package com.paymaya.mayaui.paybills.view.activity.impl;

import B5.i;
import D.C0187u;
import Kh.I;
import N4.d;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import W6.b;
import W6.c;
import W6.k;
import Y6.e;
import aa.InterfaceC0667a;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBindings;
import ba.o;
import ca.InterfaceC1085a;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BillerInput;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaMaintenanceFragment;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsConfirmationFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsReceiptFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import da.C1345a;
import fa.InterfaceC1480b;
import ha.InterfaceC1549b;
import ha.InterfaceC1551d;
import ha.m;
import ha.p;
import ha.w;
import ha.y;
import ha.z;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import pg.u;
import y5.AbstractC2509a;
import y5.g;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPayBillsActivity extends q implements InterfaceC1085a, e, w, InterfaceC1551d, p, m, InterfaceC1480b, g, InterfaceC1549b, z, y, k, c, b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f13334x = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f13335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FlutterEngine f13336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u f13337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MayaPostTransactionBottomSheetDialogFragment f13338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public BillerTransaction f13339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FavoriteDetails f13340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FavoriteCount f13341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Fragment f13342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ActivityResultLauncher f13343v = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C1345a(this));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f13344w;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        j.g(fragment, numX49.tnTj78("bjmP"));
        this.f13342u = fragment;
        w1(true);
        y1(true);
        x1(true);
        if ((fragment instanceof MayaMaintenanceFragment) || (fragment instanceof MayaBillersCategoryFragment) || (fragment instanceof MayaPayBillsSearchFragment)) {
            J1(R.string.maya_label_pay_bills_title);
            T1();
            r1();
            s1();
            return;
        }
        if (fragment instanceof MayaBillersFragment) {
            K1(((MayaBillersFragment) fragment).w0);
            T1();
            r1();
            s1();
            return;
        }
        if ((fragment instanceof MayaPayBillsFormFragment) || (fragment instanceof MayaPayBillsBIRFragment)) {
            t1();
        } else if (fragment instanceof MayaPayBillsConfirmationFragment) {
            t1();
        } else if (fragment instanceof MayaPayBillsReceiptFragment) {
            w1(false);
        }
    }

    @Override // y5.n
    public final void Q0(String str) {
        j.g(str, numX49.tnTj78("bjmb"));
        n1();
        i.l(this, str, AttributionSource.f10368d);
    }

    public final InterfaceC0667a V1() {
        o oVar = this.f13335n;
        if (oVar != null) {
            return oVar;
        }
        j.n(numX49.tnTj78("bjm2"));
        throw null;
    }

    public final void W1() {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        j.f(flutterEngineCache, numX49.tnTj78("bjmL"));
        String strTnTj78 = numX49.tnTj78("bjmr");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(strTnTj78, flutterEngine);
        }
        this.f13336o = flutterEngine;
        u uVar = new u(flutterEngine.getDartExecutor().getBinaryMessenger(), numX49.tnTj78("bjmZ"));
        this.f13337p = uVar;
        uVar.b(new C1345a(this));
        FlutterEngine flutterEngine2 = this.f13336o;
        String strTnTj782 = numX49.tnTj78("bjmk");
        if (flutterEngine2 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute(numX49.tnTj78("bjmB"));
        FlutterEngine flutterEngine3 = this.f13336o;
        if (flutterEngine3 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bjmV"), numX49.tnTj78("bjmS"), numX49.tnTj78("bjmu")));
    }

    public final boolean X1() {
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null ? extras.getBoolean(numX49.tnTj78("bjmj")) : false) {
                return true;
            }
        }
        return false;
    }

    public final void Y1(String str, Map map) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iK1.c(this, c1219hE);
    }

    public final void Z1(BillerTransaction billerTransaction, FavoriteDetails favoriteDetails, FavoriteStatus favoriteStatus) {
        j.g(billerTransaction, numX49.tnTj78("bjmd"));
        j.g(favoriteStatus, numX49.tnTj78("bjmi"));
        this.f13339r = billerTransaction;
        this.f13340s = favoriteDetails;
        String strMName = billerTransaction.mBiller().mName();
        String string = getString(R.string.maya_label_youre_almost_there);
        j.f(string, numX49.tnTj78("bjmE"));
        final int i = 1;
        final int i4 = 0;
        final MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragmentC = d.c(R.drawable.maya_ic_processing, string, getString(R.string.maya_label_pay_bills_processing_description, strMName), getString(R.string.maya_label_done), getString(R.string.maya_label_view_receipt), favoriteStatus);
        EnumC1215d enumC1215d = EnumC1215d.PAY_BILLS;
        mayaPostTransactionBottomSheetDialogFragmentC.f11877b0 = true;
        mayaPostTransactionBottomSheetDialogFragmentC.f11878c0 = enumC1215d;
        mayaPostTransactionBottomSheetDialogFragmentC.f11879d0 = EnumC1216e.SUCCESS;
        mayaPostTransactionBottomSheetDialogFragmentC.f11880e0 = new Function1(this) { // from class: da.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsActivity f16302b;

            {
                this.f16302b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment = mayaPostTransactionBottomSheetDialogFragmentC;
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                EnumC1215d enumC1215d2 = EnumC1215d.PAY_BILLS;
                MayaPayBillsActivity mayaPayBillsActivity = this.f16302b;
                String strTnTj78 = numX49.tnTj78("bdpb");
                View view = (View) obj;
                switch (i4) {
                    case 0:
                        int i6 = MayaPayBillsActivity.f13334x;
                        j.g(view, strTnTj78);
                        C1220i c1220iK1 = mayaPayBillsActivity.k1();
                        C1219h c1219hD = C1219h.d(enumC1215d2);
                        c1219hD.r(enumC1216e);
                        c1219hD.n(17);
                        c1219hD.t(EnumC1217f.DONE);
                        c1219hD.i();
                        c1220iK1.c(mayaPayBillsActivity, c1219hD);
                        mayaPayBillsActivity.finish();
                        mayaPostTransactionBottomSheetDialogFragment.dismiss();
                        mayaPayBillsActivity.f13338q = null;
                        break;
                    default:
                        int i10 = MayaPayBillsActivity.f13334x;
                        j.g(view, strTnTj78);
                        C1220i c1220iK12 = mayaPayBillsActivity.k1();
                        C1219h c1219hD2 = C1219h.d(enumC1215d2);
                        c1219hD2.r(enumC1216e);
                        c1219hD2.n(17);
                        c1219hD2.t(EnumC1217f.RECEIPT);
                        c1219hD2.i();
                        c1220iK12.c(mayaPayBillsActivity, c1219hD2);
                        BillerTransaction billerTransaction2 = mayaPayBillsActivity.f13339r;
                        FavoriteDetails favoriteDetails2 = mayaPayBillsActivity.f13340s;
                        MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = new MayaPayBillsReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable(numX49.tnTj78("bdp2"), billerTransaction2);
                        bundle.putParcelable(numX49.tnTj78("bdpL"), favoriteDetails2);
                        mayaPayBillsReceiptFragment.setArguments(bundle);
                        AbstractC1236z.h(mayaPayBillsActivity, R.id.fragment_container, mayaPayBillsReceiptFragment);
                        mayaPostTransactionBottomSheetDialogFragment.dismiss();
                        mayaPayBillsActivity.f13338q = null;
                        break;
                }
                return Unit.f18162a;
            }
        };
        mayaPostTransactionBottomSheetDialogFragmentC.f11881f0 = new Function1(this) { // from class: da.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsActivity f16302b;

            {
                this.f16302b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment = mayaPostTransactionBottomSheetDialogFragmentC;
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                EnumC1215d enumC1215d2 = EnumC1215d.PAY_BILLS;
                MayaPayBillsActivity mayaPayBillsActivity = this.f16302b;
                String strTnTj78 = numX49.tnTj78("bdpb");
                View view = (View) obj;
                switch (i) {
                    case 0:
                        int i6 = MayaPayBillsActivity.f13334x;
                        j.g(view, strTnTj78);
                        C1220i c1220iK1 = mayaPayBillsActivity.k1();
                        C1219h c1219hD = C1219h.d(enumC1215d2);
                        c1219hD.r(enumC1216e);
                        c1219hD.n(17);
                        c1219hD.t(EnumC1217f.DONE);
                        c1219hD.i();
                        c1220iK1.c(mayaPayBillsActivity, c1219hD);
                        mayaPayBillsActivity.finish();
                        mayaPostTransactionBottomSheetDialogFragment.dismiss();
                        mayaPayBillsActivity.f13338q = null;
                        break;
                    default:
                        int i10 = MayaPayBillsActivity.f13334x;
                        j.g(view, strTnTj78);
                        C1220i c1220iK12 = mayaPayBillsActivity.k1();
                        C1219h c1219hD2 = C1219h.d(enumC1215d2);
                        c1219hD2.r(enumC1216e);
                        c1219hD2.n(17);
                        c1219hD2.t(EnumC1217f.RECEIPT);
                        c1219hD2.i();
                        c1220iK12.c(mayaPayBillsActivity, c1219hD2);
                        BillerTransaction billerTransaction2 = mayaPayBillsActivity.f13339r;
                        FavoriteDetails favoriteDetails2 = mayaPayBillsActivity.f13340s;
                        MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = new MayaPayBillsReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable(numX49.tnTj78("bdp2"), billerTransaction2);
                        bundle.putParcelable(numX49.tnTj78("bdpL"), favoriteDetails2);
                        mayaPayBillsReceiptFragment.setArguments(bundle);
                        AbstractC1236z.h(mayaPayBillsActivity, R.id.fragment_container, mayaPayBillsReceiptFragment);
                        mayaPostTransactionBottomSheetDialogFragment.dismiss();
                        mayaPayBillsActivity.f13338q = null;
                        break;
                }
                return Unit.f18162a;
            }
        };
        mayaPostTransactionBottomSheetDialogFragmentC.f11882g0 = new C7.g(7, this, billerTransaction, favoriteDetails);
        this.f13338q = mayaPostTransactionBottomSheetDialogFragmentC;
        mayaPostTransactionBottomSheetDialogFragmentC.show(getSupportFragmentManager(), numX49.tnTj78("bjmF"));
    }

    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(0, str, null, null, null, false, payMayaError, null, false, 445).show(getSupportFragmentManager(), numX49.tnTj78("bjmH"));
    }

    public final void a2(String str, String str2, List list) {
        j.g(list, numX49.tnTj78("bjmO"));
        String strD = AbstractC1236z.d(this, MayaChoicesBottomSheetDialogFragment.class);
        MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragmentI = I.i(str, list, false);
        mayaChoicesBottomSheetDialogFragmentI.f11830V = str2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        j.f(supportFragmentManager, numX49.tnTj78("bjmQ"));
        j.d(strD);
        C.t0(mayaChoicesBottomSheetDialogFragmentI, supportFragmentManager, strD);
        mayaChoicesBottomSheetDialogFragmentI.f11835a0 = R.drawable.maya_bg_selector_choices_cell;
    }

    public final void b2(Favorite favorite) {
        String strTnTj78 = numX49.tnTj78("bjmt");
        j.g(favorite, strTnTj78);
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment = new MayaPayBillsBIRFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(strTnTj78, favorite);
        mayaPayBillsBIRFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.fragment_container, mayaPayBillsBIRFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    public final void c2(String str) {
        FavoriteCount favoriteCount = this.f13341t;
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment = new MayaPayBillsBIRFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjmU"), str);
        bundle.putParcelable(numX49.tnTj78("bjme"), favoriteCount);
        mayaPayBillsBIRFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.fragment_container, mayaPayBillsBIRFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    public final void d2(BillerInput billerInput, BillerTransaction billerTransaction, FavoriteDetails favoriteDetails, String str, String str2) {
        MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment = new MayaPayBillsConfirmationFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bjm8"), billerInput);
        bundle.putParcelable(numX49.tnTj78("bjmC"), billerTransaction);
        bundle.putParcelable(numX49.tnTj78("bjm4"), favoriteDetails);
        bundle.putString(numX49.tnTj78("bjmo"), str);
        bundle.putString(numX49.tnTj78("bjmK"), str2);
        mayaPayBillsConfirmationFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.fragment_container, mayaPayBillsConfirmationFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void e2(Favorite favorite) {
        String strTnTj78 = numX49.tnTj78("bjmw");
        j.g(favorite, strTnTj78);
        MayaPayBillsFormFragment mayaPayBillsFormFragment = new MayaPayBillsFormFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(strTnTj78, favorite);
        mayaPayBillsFormFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.fragment_container, mayaPayBillsFormFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    @Override // androidx.core.app.ComponentActivity, y5.n
    public final void f() {
        if (!X1()) {
            boolean z4 = false;
            if (getIntent().getExtras() != null) {
                Bundle extras = getIntent().getExtras();
                if (extras != null ? extras.getBoolean(numX49.tnTj78("bjmc")) : false) {
                    z4 = true;
                }
            }
            if (!z4) {
                setResult(2);
                finish();
                return;
            }
        }
        n1();
        i.j(this);
    }

    public final void f2(String str) {
        MayaPayBillsFormFragment mayaPayBillsFormFragment = new MayaPayBillsFormFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjmm"), str);
        mayaPayBillsFormFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.fragment_container, mayaPayBillsFormFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    public final void g2(BillerTransaction billerTransaction, FavoriteDetails favoriteDetails) {
        MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = new MayaPayBillsReceiptFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bjmD"), billerTransaction);
        bundle.putParcelable(numX49.tnTj78("bjmh"), favoriteDetails);
        mayaPayBillsReceiptFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.fragment_container, mayaPayBillsReceiptFragment);
    }

    @Override // W6.k
    public final void k0() {
    }

    @Override // y5.n
    public final void l(String str) {
        j.g(str, numX49.tnTj78("bjmM"));
        n1().k0(this, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r4 = this;
            com.paymaya.data.preference.a r0 = r4.p1()
            com.paymaya.domain.model.Config r0 = r0.e()
            boolean r0 = r0.isBillsPayEventsV2Enabled()
            if (r0 == 0) goto L3f
            androidx.fragment.app.Fragment r0 = r4.f13342u
            boolean r1 = r0 instanceof com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment
            java.lang.String r2 = "bjmN"
            java.lang.String r2 = dOYHB6.tiZVw8.numX49.tnTj78(r2)
            if (r1 == 0) goto L2b
            java.lang.String r1 = "bjm6"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            kotlin.jvm.internal.j.e(r0, r1)
            ga.a r0 = (ga.InterfaceC1514a) r0
            com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment r0 = (com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment) r0
            r0.U1(r2)
            goto L3f
        L2b:
            boolean r1 = r0 instanceof com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment
            if (r1 == 0) goto L3f
            java.lang.String r1 = "bjma"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            kotlin.jvm.internal.j.e(r0, r1)
            ga.g r0 = (ga.g) r0
            com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment r0 = (com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment) r0
            r0.K1(r2)
        L3f:
            androidx.fragment.app.Fragment r0 = r4.f13342u
            boolean r1 = r0 instanceof y5.InterfaceC2511c
            if (r1 == 0) goto L58
            java.lang.String r1 = "bjmX"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            kotlin.jvm.internal.j.e(r0, r1)
            y5.c r0 = (y5.InterfaceC2511c) r0
            boolean r0 = r0.e0()
            if (r0 != 0) goto L57
            goto L58
        L57:
            return
        L58:
            androidx.fragment.app.Fragment r0 = r4.f13342u
            boolean r1 = r0 instanceof com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment
            if (r1 != 0) goto L67
            boolean r0 = r0 instanceof com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment
            if (r0 == 0) goto L63
            goto L67
        L63:
            super.onBackPressed()
            return
        L67:
            boolean r0 = r4.X1()
            if (r0 != 0) goto La9
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L93
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L8e
            java.lang.String r3 = "bjmG"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
            boolean r0 = r0.getBoolean(r3)
            goto L8f
        L8e:
            r0 = r2
        L8f:
            if (r0 == 0) goto L93
            r0 = r1
            goto L94
        L93:
            r0 = r2
        L94:
            if (r0 != 0) goto La9
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            int r0 = r0.getBackStackEntryCount()
            if (r0 != r1) goto La1
            goto La2
        La1:
            r1 = r2
        La2:
            if (r1 == 0) goto La5
            goto La9
        La5:
            super.onBackPressed()
            return
        La9:
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity.onBackPressed():void");
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = W4.a.e().t().f4754a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f13335n = new o((com.paymaya.data.preference.a) aVar.e.get(), aVar.g(), aVar.h());
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_pay_bills, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 15);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                ((AbstractC2509a) V1()).h(this);
                if (bundle == null) {
                    ((o) V1()).j();
                    return;
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjm3").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6281r = null;
        ((AbstractC2509a) V1()).i();
        super.onDestroy();
        this.m = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            if (item.getItemId() == 16908332) {
                g1();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.onOptionsItemSelected_exit();
            return zOnOptionsItemSelected;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        n1().u0(this);
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.PAY_BILLS;
    }
}
