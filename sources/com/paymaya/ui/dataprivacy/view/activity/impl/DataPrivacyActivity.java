package com.paymaya.ui.dataprivacy.view.activity.impl;

import B5.i;
import D.C0187u;
import E8.D;
import E8.E;
import N5.C0441c;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.ui.common.view.dialog.impl.ErrorDialogFragment;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataAndPersonalizationFragment;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataPrivacyPolicyFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import i8.C1593a;
import java.util.ArrayList;
import java.util.ListIterator;
import kd.a;
import kotlin.jvm.internal.j;
import pd.c;
import pd.e;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public class DataPrivacyActivity extends AbstractActivityC2512d implements a, e, c, Wc.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f14472s = 0;
    public C0441c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f14474l;
    public ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f14475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Toolbar f14476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FrameLayout f14477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1593a f14478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Fragment f14479r;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f14479r = fragment;
        boolean z4 = fragment instanceof DataPrivacyPolicyFragment;
        String strTnTj78 = numX49.tnTj78("bVfP");
        if (z4) {
            Toolbar toolbar = this.f14476o;
            if (toolbar == null) {
                j.n(strTnTj78);
                throw null;
            }
            toolbar.setVisibility(8);
            setSupportActionBar((Toolbar) findViewById(R.id.toolbar_pma_fragment_data_privacy_policy));
            p1(true);
            o1(true);
            FrameLayout frameLayout = this.f14477p;
            if (frameLayout == null) {
                j.n(numX49.tnTj78("bVf2"));
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            j.e(layoutParams, numX49.tnTj78("bVfb"));
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            return;
        }
        if (fragment instanceof WebFragment) {
            Toolbar toolbar2 = this.f14476o;
            if (toolbar2 == null) {
                j.n(strTnTj78);
                throw null;
            }
            setSupportActionBar(toolbar2);
            n1(true);
            p1(true);
            o1(true);
            String str = this.f14475n;
            j.d(str);
            m1(str);
            t1();
            return;
        }
        if (fragment instanceof DataAndPersonalizationFragment) {
            Toolbar toolbar3 = this.f14476o;
            if (toolbar3 == null) {
                j.n(strTnTj78);
                throw null;
            }
            setSupportActionBar(toolbar3);
            n1(true);
            p1(true);
            o1(true);
            m1(getString(R.string.pma_label_data_and_personalization));
            t1();
        }
    }

    public final void a(PayMayaError payMayaError, String str) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bVfL"), str);
        bundle.putParcelable(numX49.tnTj78("bVfr"), payMayaError);
        errorDialogFragment.setArguments(bundle);
        errorDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bVfZ"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.DATA_PRIVACY;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str = this.f14474l;
        if (!j.b(str, numX49.tnTj78("bVfk"))) {
            if (!j.b(str, numX49.tnTj78("bVfu"))) {
                super.onBackPressed();
                return;
            }
            Fragment fragment = this.f14479r;
            if (!(fragment instanceof DataAndPersonalizationFragment) || !this.f14473k) {
                super.onBackPressed();
                return;
            }
            j.e(fragment, numX49.tnTj78("bVfV"));
            final DataAndPersonalizationFragment dataAndPersonalizationFragment = (DataAndPersonalizationFragment) fragment;
            AlertDialog.Builder builder = new AlertDialog.Builder(dataAndPersonalizationFragment.getContext());
            builder.setTitle(dataAndPersonalizationFragment.getString(R.string.pma_label_data_and_personalization_modified_title));
            final int i = 0;
            AlertDialog.Builder positiveButton = builder.setMessage(R.string.pma_label_data_and_personalization_modified_body).setPositiveButton(R.string.pma_label_save, new DialogInterface.OnClickListener() { // from class: pd.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    switch (i) {
                        case 0:
                            DataAndPersonalizationFragment dataAndPersonalizationFragment2 = dataAndPersonalizationFragment;
                            C1220i c1220i = dataAndPersonalizationFragment2.f10245B;
                            FragmentActivity activity = dataAndPersonalizationFragment2.getActivity();
                            C1219h c1219hD = C1219h.d(dataAndPersonalizationFragment2.m1());
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.SAVE_CHANGES);
                            c1220i.c(activity, c1219hD);
                            dataAndPersonalizationFragment2.r1().l();
                            break;
                        default:
                            DataAndPersonalizationFragment dataAndPersonalizationFragment3 = dataAndPersonalizationFragment;
                            c cVar = dataAndPersonalizationFragment3.f14486U;
                            if (cVar != null) {
                                cVar.finish();
                            }
                            C1220i c1220i2 = dataAndPersonalizationFragment3.f10245B;
                            FragmentActivity activity2 = dataAndPersonalizationFragment3.getActivity();
                            C1219h c1219hD2 = C1219h.d(dataAndPersonalizationFragment3.m1());
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.DONT_SAVE_CHANGES);
                            c1220i2.c(activity2, c1219hD2);
                            break;
                    }
                }
            });
            final int i4 = 1;
            positiveButton.setNegativeButton(R.string.pma_label_dont_save, new DialogInterface.OnClickListener() { // from class: pd.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    switch (i4) {
                        case 0:
                            DataAndPersonalizationFragment dataAndPersonalizationFragment2 = dataAndPersonalizationFragment;
                            C1220i c1220i = dataAndPersonalizationFragment2.f10245B;
                            FragmentActivity activity = dataAndPersonalizationFragment2.getActivity();
                            C1219h c1219hD = C1219h.d(dataAndPersonalizationFragment2.m1());
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.SAVE_CHANGES);
                            c1220i.c(activity, c1219hD);
                            dataAndPersonalizationFragment2.r1().l();
                            break;
                        default:
                            DataAndPersonalizationFragment dataAndPersonalizationFragment3 = dataAndPersonalizationFragment;
                            c cVar = dataAndPersonalizationFragment3.f14486U;
                            if (cVar != null) {
                                cVar.finish();
                            }
                            C1220i c1220i2 = dataAndPersonalizationFragment3.f10245B;
                            FragmentActivity activity2 = dataAndPersonalizationFragment3.getActivity();
                            C1219h c1219hD2 = C1219h.d(dataAndPersonalizationFragment3.m1());
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.DONT_SAVE_CHANGES);
                            c1220i2.c(activity2, c1219hD2);
                            break;
                    }
                }
            });
            builder.create().show();
            return;
        }
        Fragment fragment2 = this.f14479r;
        if (fragment2 instanceof DataPrivacyPolicyFragment) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setTitle(getString(R.string.pma_label_data_privacy_policy));
            builder2.setMessage(R.string.pma_label_by_disagreeing).setPositiveButton(R.string.pma_label_disagree, new D(this, 3)).setNegativeButton(R.string.pma_label_cancel, new E(3));
            builder2.create().show();
            return;
        }
        if (!(fragment2 instanceof DataAndPersonalizationFragment)) {
            super.onBackPressed();
            return;
        }
        ArrayList arrayList = this.m;
        j.d(arrayList);
        ListIterator listIterator = arrayList.listIterator();
        j.f(listIterator, numX49.tnTj78("bVfB"));
        while (listIterator.hasNext()) {
            Consent consent = (Consent) listIterator.next();
            ArrayList arrayList2 = this.m;
            j.d(arrayList2);
            arrayList2.set(listIterator.previousIndex(), consent.toBuilder().isEnabled(false).build());
        }
        super.onBackPressed();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().c().f4752a;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        j.g((com.paymaya.data.preference.a) aVar.e.get(), numX49.tnTj78("bVfS"));
        this.f14478q = new C1593a(3);
        super.onCreate(bundle);
        q1(R.color.light_light);
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        if (viewGroup == null) {
            throw new NullPointerException(numX49.tnTj78("bVfO"));
        }
        layoutInflater.inflate(R.layout.pma_activity_data_privacy_v2, viewGroup);
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewGroup, R.id.pma_activity_data_privacy_container);
        String strTnTj78 = numX49.tnTj78("bVfj");
        if (frameLayout == null) {
            throw new NullPointerException(strTnTj78.concat(viewGroup.getResources().getResourceName(R.id.pma_activity_data_privacy_container)));
        }
        this.j = new C0441c(viewGroup, frameLayout, 16);
        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewGroup, R.id.pma_view_toolbar);
        if (toolbar == null) {
            throw new NullPointerException(strTnTj78.concat(viewGroup.getResources().getResourceName(R.id.pma_view_toolbar)));
        }
        this.f14476o = toolbar;
        C0441c c0441c = this.j;
        j.d(c0441c);
        this.f14477p = (FrameLayout) c0441c.c;
        Bundle extras = getIntent().getExtras();
        String strTnTj782 = numX49.tnTj78("bVfd");
        if (extras != null) {
            this.f14474l = extras.getString(numX49.tnTj78("bVfi"));
            this.m = (ArrayList) extras.getSerializable(strTnTj782);
        }
        C1593a c1593a = this.f14478q;
        String strTnTj783 = numX49.tnTj78("bVfE");
        if (c1593a == null) {
            j.n(strTnTj783);
            throw null;
        }
        c1593a.h(this);
        if (bundle != null) {
            this.m = (ArrayList) bundle.getSerializable(strTnTj782);
            this.f14475n = bundle.getString(numX49.tnTj78("bVfF"), numX49.tnTj78("bVfH"));
            return;
        }
        C1593a c1593a2 = this.f14478q;
        if (c1593a2 != null) {
            c1593a2.j();
        } else {
            j.n(strTnTj783);
            throw null;
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6269b = null;
        C1593a c1593a = this.f14478q;
        if (c1593a == null) {
            j.n(numX49.tnTj78("bVfQ"));
            throw null;
        }
        c1593a.i();
        this.j = null;
        super.onDestroy();
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
        j.g(bundle, numX49.tnTj78("bVft"));
        bundle.putString(numX49.tnTj78("bVfU"), this.f14475n);
        bundle.putSerializable(numX49.tnTj78("bVfe"), this.m);
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
    }

    public final void t1() {
        TypedValue typedValue = new TypedValue();
        int iComplexToDimensionPixelSize = getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics()) : 0;
        FrameLayout frameLayout = this.f14477p;
        if (frameLayout == null) {
            j.n(numX49.tnTj78("bVfC"));
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        j.e(layoutParams, numX49.tnTj78("bVf8"));
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iComplexToDimensionPixelSize;
    }
}
