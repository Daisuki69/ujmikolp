package com.paymaya.common.utility;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.base.MayaBaseFragment;

/* JADX INFO: renamed from: com.paymaya.common.utility.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1236z {
    public static void a(AppCompatActivity appCompatActivity, int i, MayaBaseFragment mayaBaseFragment) {
        if (appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        appCompatActivity.getSupportFragmentManager().beginTransaction().add(i, mayaBaseFragment, d(appCompatActivity, mayaBaseFragment.getClass())).commit();
    }

    public static void b(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        if (supportFragmentManager.getBackStackEntryCount() > 1) {
            supportFragmentManager.popBackStack(supportFragmentManager.getBackStackEntryAt(1).getName(), 1);
        }
        appCompatActivity.onBackPressed();
    }

    public static void c(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        if (supportFragmentManager.getBackStackEntryCount() > 0) {
            supportFragmentManager.popBackStack(supportFragmentManager.getBackStackEntryAt(0).getName(), 1);
        }
    }

    public static String d(AppCompatActivity appCompatActivity, Class cls) {
        return appCompatActivity.getClass().getName() + Global.COLON + cls.getName();
    }

    public static void e(AppCompatActivity appCompatActivity, Class cls, boolean z4) {
        if (appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        appCompatActivity.getSupportFragmentManager().popBackStack(d(appCompatActivity, cls), z4 ? 1 : 0);
    }

    public static void f(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        appCompatActivity.getSupportFragmentManager().popBackStack();
    }

    public static void g(AppCompatActivity appCompatActivity, int i, Fragment fragment) {
        if (appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        appCompatActivity.getSupportFragmentManager().beginTransaction().replace(i, fragment, d(appCompatActivity, fragment.getClass())).commit();
    }

    public static void h(AppCompatActivity appCompatActivity, int i, Fragment fragment) {
        if (appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        appCompatActivity.getSupportFragmentManager().beginTransaction().replace(i, fragment, d(appCompatActivity, fragment.getClass())).addToBackStack(d(appCompatActivity, fragment.getClass())).commit();
    }

    public static void i(AppCompatActivity appCompatActivity, int i, Fragment fragment, int i4, int i6, int i10, int i11) {
        if (appCompatActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        appCompatActivity.getSupportFragmentManager().beginTransaction().setCustomAnimations(i4, i6, i10, i11).replace(i, fragment, d(appCompatActivity, fragment.getClass())).addToBackStack(d(appCompatActivity, fragment.getClass())).commit();
    }
}
