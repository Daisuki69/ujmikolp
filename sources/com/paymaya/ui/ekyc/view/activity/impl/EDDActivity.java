package com.paymaya.ui.ekyc.view.activity.impl;

import D.C0187u;
import D7.d;
import O5.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.BindView;
import butterknife.ButterKnife;
import cj.t;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.u;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1254d0;
import com.paymaya.domain.store.N;
import com.paymaya.ui.common.view.dialog.impl.ErrorDialogFragment;
import com.paymaya.ui.ekyc.view.dialog.impl.EkycIdDetailDialogFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDAccountUsageFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationDetailsFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationStatusFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDBankInformationFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIncomeSourceFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIntroFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDRelatedCompaniesFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmissionReviewFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmittedFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;
import com.paymaya.ui.ekyc.view.widget.EDDOptionsInput;
import com.paymaya.ui.settings.view.dialog.impl.ConfirmCancelDialogFragment;
import com.paymaya.ui.travel.view.widget.StepProgressBar;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import pe.b;
import sd.C2254c;
import td.InterfaceC2283a;
import ud.C2308a;
import y5.AbstractActivityC2512d;
import zd.InterfaceC2560d;
import zd.InterfaceC2562f;
import zd.i;
import zd.j;
import zd.l;
import zd.m;
import zd.n;
import zd.o;
import zd.r;
import zd.s;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDActivity extends AbstractActivityC2512d implements InterfaceC2283a, n, InterfaceC2560d, m, o, j, l, r, s, i, InterfaceC2562f, b {
    public static final /* synthetic */ int m = 0;
    public C2254c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f14495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Fragment f14496l;

    @BindView(R.id.fragment_container_frame_layout_pma_activity_edd)
    public FrameLayout mFrameLayout;

    @BindView(R.id.step_progress_bar_pma_activity_edd)
    public StepProgressBar mStepProgressBar;

    @BindView(R.id.view_pager_pma_activity_edd)
    public ViewPager2 mViewPager;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f14496l = fragment;
        if (fragment != null) {
            if (fragment instanceof EDDIntroFragment) {
                l1(R.string.pma_label_upgrade_application_status);
                p1(false);
                o1(false);
                x1(0, false);
                return;
            }
            if (fragment instanceof EDDAccountUsageFragment) {
                l1(R.string.pma_label_edd_primary_account_usage);
                p1(true);
                o1(true);
                x1(0, true);
                return;
            }
            if (fragment instanceof EDDIncomeSourceFragment) {
                l1(R.string.pma_label_edd_income_source);
                p1(true);
                o1(true);
                x1(1, true);
                return;
            }
            if (fragment instanceof EDDRelatedCompaniesFragment) {
                l1(R.string.pma_label_edd_related_companies);
                p1(true);
                o1(true);
                x1(2, true);
                return;
            }
            if (fragment instanceof EDDBankInformationFragment) {
                l1(R.string.pma_label_edd_bank_information);
                p1(true);
                o1(true);
                x1(3, true);
                return;
            }
            if (fragment instanceof EDDFinancialDocumentsFragment) {
                l1(R.string.pma_label_edd_financial_documents);
                p1(true);
                o1(true);
                x1(4, true);
                return;
            }
            if (fragment instanceof EDDSubmissionReviewFragment) {
                l1(R.string.pma_label_edd_submission_review);
                p1(true);
                o1(true);
                x1(4, false);
                return;
            }
            if (fragment instanceof EDDSubmittedFragment) {
                n1(false);
                p1(true);
                o1(true);
                x1(4, false);
                return;
            }
            if ((fragment instanceof EDDApplicationStatusFragment) || (fragment instanceof EDDApplicationDetailsFragment)) {
                l1(R.string.pma_label_edd_application_details);
                n1(true);
                p1(true);
                o1(true);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.EDD;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        Object next;
        super.onActivityResult(i, i4, intent);
        Object obj = null;
        if (i4 == -1 && i == 106) {
            Fragment fragment = this.f14496l;
            if (!(fragment instanceof EDDFinancialDocumentsFragment) || intent == null) {
                return;
            }
            kotlin.jvm.internal.j.e(fragment, numX49.tnTj78("bVsP"));
            String stringExtra = intent.getStringExtra(numX49.tnTj78("bVsb"));
            String stringExtra2 = intent.getStringExtra(numX49.tnTj78("bVs2"));
            ArrayList<Bd.j> arrayList = ((EDDFinancialDocumentsFragment) fragment).f14508V;
            ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
            for (Bd.j jVar : arrayList) {
                kotlin.jvm.internal.j.e(jVar, numX49.tnTj78("bVsL"));
                arrayList2.add((EDDInputFinancialDocument) jVar);
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (kotlin.jvm.internal.j.b(((EDDInputFinancialDocument) next2).getDocumentId(), stringExtra)) {
                    obj = next2;
                    break;
                }
            }
            EDDInputFinancialDocument eDDInputFinancialDocument = (EDDInputFinancialDocument) obj;
            if (eDDInputFinancialDocument != null) {
                eDDInputFinancialDocument.setFileUrl(stringExtra2);
                return;
            }
            return;
        }
        if (i4 == 8 && i == 900 && intent != null) {
            String stringExtra3 = intent.getStringExtra(numX49.tnTj78("bVsr"));
            if (stringExtra3 == null) {
                stringExtra3 = numX49.tnTj78("bVsZ");
            }
            int intExtra = intent.getIntExtra(numX49.tnTj78("bVsk"), 0);
            Fragment fragment2 = this.f14496l;
            boolean z4 = fragment2 instanceof EDDIncomeSourceFragment;
            String strTnTj78 = numX49.tnTj78("bVsB");
            if (z4) {
                kotlin.jvm.internal.j.e(fragment2, numX49.tnTj78("bVsu"));
                Iterator it2 = ((EDDIncomeSourceFragment) fragment2).f14508V.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Bd.j jVar2 = (Bd.j) next;
                    kotlin.jvm.internal.j.e(jVar2, strTnTj78);
                    if (((EDDOptionsInput) jVar2).getItemId() == intExtra) {
                        break;
                    }
                }
                EDDOptionsInput eDDOptionsInput = next instanceof EDDOptionsInput ? (EDDOptionsInput) next : null;
                if (eDDOptionsInput != null) {
                    eDDOptionsInput.setSelectedOption(stringExtra3);
                    return;
                }
                return;
            }
            if (fragment2 instanceof EDDBankInformationFragment) {
                kotlin.jvm.internal.j.e(fragment2, numX49.tnTj78("bVsV"));
                for (Object obj2 : ((EDDBankInformationFragment) fragment2).f14508V) {
                    Bd.j jVar3 = (Bd.j) obj2;
                    kotlin.jvm.internal.j.e(jVar3, strTnTj78);
                    if (((EDDOptionsInput) jVar3).getItemId() == intExtra) {
                        EDDOptionsInput eDDOptionsInput2 = obj2 instanceof EDDOptionsInput ? (EDDOptionsInput) obj2 : null;
                        if (eDDOptionsInput2 != null) {
                            eDDOptionsInput2.setSelectedOption(stringExtra3);
                            return;
                        }
                        return;
                    }
                }
                throw new NoSuchElementException(numX49.tnTj78("bVsS"));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Fragment fragment = this.f14496l;
        if (fragment instanceof EDDSubmittedFragment) {
            this.e.getClass();
            B5.i.j(this);
            if (this.f21061d.e().isEddRestrictionsEnabled()) {
                this.f21061d.p0(numX49.tnTj78("bVsj"));
                return;
            }
            return;
        }
        if (fragment instanceof EDDAccountUsageFragment) {
            new ConfirmCancelDialogFragment().show(getSupportFragmentManager(), numX49.tnTj78("bVsd"));
        } else if (u1().getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            u1().setCurrentItem(r0.getCurrentItem() - 1);
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = W4.a.e().d().f4753a;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (B5.i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        N nP = aVar.p();
        u uVar = (u) aVar.y0.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        C1254d0 c1254d0 = new C1254d0();
        c1254d0.f11433b = uVar;
        c1254d0.c = payMayaClientApi;
        c1254d0.f11434d = aVar2;
        this.j = new C2254c(nP, c1254d0, aVar.f(), aVar.r(), (com.paymaya.data.preference.a) aVar.e.get());
        super.onCreate(bundle);
        setContentView(R.layout.pma_activity_edd);
        ButterKnife.bind(this);
        t1().h(this);
        q1(R.color.light_light);
        if (bundle == null) {
            t1().j();
            return;
        }
        v1();
        C2254c c2254cT1 = t1();
        EDD edd = (EDD) bundle.getParcelable(numX49.tnTj78("bVsi"));
        if (edd != null) {
            c2254cT1.i = edd;
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().i = null;
        this.f14495k = null;
        t1().i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            kotlin.jvm.internal.j.g(item, "item");
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

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("bVsE"));
        bundle.putParcelable(numX49.tnTj78("bVsF"), t1().i);
        super.onSaveInstanceState(bundle);
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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
        this.e.u0(this);
    }

    public final C2254c t1() {
        C2254c c2254c = this.j;
        if (c2254c != null) {
            return c2254c;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bVsH"));
        throw null;
    }

    public final ViewPager2 u1() {
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bVsO"));
        throw null;
    }

    public final void v1() {
        this.f14495k = new d(this);
        u1().setUserInputEnabled(false);
        u1().setAdapter(this.f14495k);
        u1().setCurrentItem(0, false);
        u1().registerOnPageChangeCallback(new C2308a(this));
    }

    public final void w1() {
        int currentItem = u1().getCurrentItem() + 1;
        d dVar = this.f14495k;
        if (currentItem < (dVar != null ? ((ArrayList) dVar.f992b).size() : 0)) {
            ViewPager2 viewPager2U1 = u1();
            viewPager2U1.setCurrentItem(viewPager2U1.getCurrentItem() + 1);
        }
        C.Q(this, getCurrentFocus());
    }

    public final void x1(int i, boolean z4) {
        StepProgressBar stepProgressBar = this.mStepProgressBar;
        String strTnTj78 = numX49.tnTj78("bVsQ");
        if (stepProgressBar == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        stepProgressBar.setCurrentStep(i);
        StepProgressBar stepProgressBar2 = this.mStepProgressBar;
        if (stepProgressBar2 != null) {
            stepProgressBar2.setVisibility(z4 ? 0 : 8);
        } else {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
    }

    public final void y1(PayMayaError payMayaError) {
        String string = getString(R.string.pma_toast_error_title_upgrade_to_plus_error);
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bVst"), string);
        bundle.putParcelable(numX49.tnTj78("bVsU"), payMayaError);
        errorDialogFragment.setArguments(bundle);
        errorDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bVse"));
    }

    public final void z1(File file, String str) {
        EkycIdDetailDialogFragment ekycIdDetailDialogFragment = new EkycIdDetailDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bVs8"), str);
        bundle.putSerializable(numX49.tnTj78("bVsC"), file);
        ekycIdDetailDialogFragment.setArguments(bundle);
        ekycIdDetailDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bVs4"));
    }
}
