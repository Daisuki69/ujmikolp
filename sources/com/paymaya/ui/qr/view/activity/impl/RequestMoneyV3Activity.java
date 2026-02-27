package com.paymaya.ui.qr.view.activity.impl;

import B5.i;
import Bb.a;
import D.C0187u;
import Wc.c;
import ae.d;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.Z;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.paymaya.ui.common.view.fragment.impl.UpgradePayMayaPlusFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFormFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3Fragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3NewFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import de.s;
import de.x;
import de.z;
import kotlin.jvm.internal.j;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestMoneyV3Activity extends AbstractActivityC2512d implements d, x, z, s, c {
    public a j;

    @Override // Wc.c
    public final void M() {
        AbstractC1236z.f(this);
    }

    @Override // Wc.c
    public final void O0() {
        this.e.s(this, false);
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        o1(true);
        n1(true);
        q1(R.color.light_light);
        boolean z4 = fragment instanceof RequestMoneyV3Fragment;
        String strTnTj78 = numX49.tnTj78("bSPP");
        if (z4) {
            Z.a(this, 1.0f);
            Bundle arguments = ((RequestMoneyV3Fragment) fragment).getArguments();
            m1((arguments != null ? (TransferAppLink) arguments.getParcelable(strTnTj78) : null) != null ? getString(R.string.pma_label_custom_qr_code) : getString(R.string.pma_label_request_money));
        } else if (fragment instanceof RequestMoneyV3NewFragment) {
            Z.a(this, 1.0f);
            Bundle arguments2 = ((RequestMoneyV3NewFragment) fragment).getArguments();
            m1((arguments2 != null ? (TransferAppLink) arguments2.getParcelable(strTnTj78) : null) != null ? getString(R.string.pma_label_custom_qr_code) : getString(R.string.pma_label_request_money));
        } else if (fragment instanceof RequestMoneyFormFragment) {
            Z.a(this, -1.0f);
            m1(getString(R.string.pma_label_generate_custom_qr_code));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // Wc.c
    public final void j() {
        getSupportFragmentManager().popBackStack();
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.REQUEST_MONEY;
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = (O5.a) W4.a.e().E().c;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        this.j = new a((com.paymaya.data.preference.a) aVar.e.get(), 19);
        super.onCreate(bundle);
        setContentView(R.layout.pma_activity_request_money_v3);
        a aVar2 = this.j;
        String strTnTj78 = numX49.tnTj78("bSPb");
        if (aVar2 == null) {
            j.n(strTnTj78);
            throw null;
        }
        aVar2.h(this);
        if (bundle == null) {
            a aVar3 = this.j;
            if (aVar3 != null) {
                aVar3.j();
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6284u = null;
        a aVar = this.j;
        if (aVar == null) {
            j.n(numX49.tnTj78("bSP2"));
            throw null;
        }
        aVar.i();
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

    public final void t1(Uri uri, String str, String str2) {
        ComponentName componentName = getComponentName();
        Intent action = new Intent().setAction(numX49.tnTj78("bSPL"));
        action.putExtra(numX49.tnTj78("bSPr"), getPackageName());
        action.putExtra(numX49.tnTj78("bSPZ"), getPackageName());
        action.putExtra(numX49.tnTj78("bSPk"), componentName);
        action.putExtra(numX49.tnTj78("bSPB"), componentName);
        action.addFlags(524288);
        action.addFlags(1);
        String string = getString(R.string.pma_label_share_or_save);
        action.putExtra(numX49.tnTj78("bSPu"), str);
        action.setType(numX49.tnTj78("bSPV"));
        action.putExtra(numX49.tnTj78("bSPS"), uri);
        ShareSaveDialogFragment shareSaveDialogFragment = new ShareSaveDialogFragment();
        Bundle bundleE = androidx.media3.datasource.cache.c.e(numX49.tnTj78("bSPj"), string, numX49.tnTj78("bSPd"), str2);
        bundleE.putParcelable(numX49.tnTj78("bSPi"), action);
        shareSaveDialogFragment.setArguments(bundleE);
        shareSaveDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bSPE"));
    }

    public final void u1(boolean z4) {
        a aVar = this.j;
        if (aVar == null) {
            j.n(numX49.tnTj78("bSPt"));
            throw null;
        }
        if (!numX49.tnTj78("bSPF").equalsIgnoreCase(aVar.e.l())) {
            RequestMoneyV3Activity requestMoneyV3Activity = (RequestMoneyV3Activity) ((d) aVar.c.get());
            requestMoneyV3Activity.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(numX49.tnTj78("bSPO"), numX49.tnTj78("bSPQ"));
            UpgradePayMayaPlusFragment upgradePayMayaPlusFragment = new UpgradePayMayaPlusFragment();
            upgradePayMayaPlusFragment.setArguments(bundle);
            AbstractC1236z.h(requestMoneyV3Activity, R.id.pma_activity_request_money_v3_fragment_container, upgradePayMayaPlusFragment);
            return;
        }
        RequestMoneyV3Activity requestMoneyV3Activity2 = (RequestMoneyV3Activity) ((d) aVar.c.get());
        if (z4) {
            requestMoneyV3Activity2.getSupportFragmentManager().popBackStack();
        } else {
            requestMoneyV3Activity2.getClass();
        }
        RequestMoneyFormFragment requestMoneyFormFragment = new RequestMoneyFormFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(numX49.tnTj78("bSPH"), z4);
        requestMoneyFormFragment.setArguments(bundle2);
        AbstractC1236z.h(requestMoneyV3Activity2, R.id.pma_activity_request_money_v3_fragment_container, requestMoneyFormFragment);
    }
}
