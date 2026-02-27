package com.paymaya.common.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.j;
import qj.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaBaseBindingFragment<T extends ViewBinding> extends MayaBaseFragment {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final n f10323U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ViewBinding f10324V;

    public MayaBaseBindingFragment(n inflateBinding) {
        j.g(inflateBinding, "inflateBinding");
        this.f10323U = inflateBinding;
    }

    public final ViewBinding G1() {
        ViewBinding viewBinding = this.f10324V;
        if (viewBinding != null) {
            return viewBinding;
        }
        throw new NullPointerException("Binding not yet set or already cleared.");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        this.f10324V = (ViewBinding) this.f10323U.invoke(inflater, viewGroup, Boolean.FALSE);
        View root = G1().getRoot();
        j.f(root, "getRoot(...)");
        return root;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f10324V = null;
        super.onDestroyView();
    }
}
