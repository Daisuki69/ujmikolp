package com.tencent.could.huiyansdk.manager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.fragments.BaseFragment;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15660a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FragmentManager f15661b;
    public FragmentTransaction c;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.a$a, reason: collision with other inner class name */
    public static final class C0083a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15662a = new a();
    }

    public void a(Fragment fragment) {
        FragmentManager fragmentManager = this.f15661b;
        if (fragmentManager == null || fragment == null) {
            return;
        }
        this.c = fragmentManager.beginTransaction();
        FragmentManager fragmentManager2 = this.f15661b;
        int i = R.id.txy_main_fragment;
        fragmentManager2.findFragmentById(i);
        this.c.replace(i, fragment).addToBackStack(null).commit();
    }

    public BaseFragment a() {
        FragmentManager fragmentManager = this.f15661b;
        if (fragmentManager == null) {
            return null;
        }
        Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(R.id.txy_main_fragment);
        if (fragmentFindFragmentById instanceof BaseFragment) {
            return (BaseFragment) fragmentFindFragmentById;
        }
        return null;
    }
}
