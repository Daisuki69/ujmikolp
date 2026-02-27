package com.clevertap.android.sdk.inapp.fragment;

import D.C0187u;
import D.d0;
import N.k;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CTInAppBasePartialFragment extends CTInAppBaseFragment {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final AtomicBoolean f9526T = new AtomicBoolean();

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    public final void l1() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Pattern pattern = d0.f906a;
            if (activity.isFinishing() || activity.isDestroyed() || !this.f9526T.compareAndSet(false, true)) {
                return;
            }
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            j.f(supportFragmentManager, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            j.f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
            try {
                fragmentTransactionBeginTransaction.remove(this).commit();
            } catch (IllegalStateException unused) {
                supportFragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    public final void n1() {
        this.f9522R = new WeakReference((k) C0187u.j(requireContext(), o1()).f949b.f818k);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f9526T.get()) {
            l1();
        }
    }
}
