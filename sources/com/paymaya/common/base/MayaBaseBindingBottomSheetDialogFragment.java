package com.paymaya.common.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import qj.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaBaseBindingBottomSheetDialogFragment<T extends ViewBinding> extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final i f10321S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ViewBinding f10322T;

    /* JADX WARN: Multi-variable type inference failed */
    public MayaBaseBindingBottomSheetDialogFragment(n nVar) {
        this.f10321S = (i) nVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.i, qj.n] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        this.f10322T = (ViewBinding) this.f10321S.invoke(inflater, viewGroup, Boolean.FALSE);
        View root = s1().getRoot();
        j.f(root, "getRoot(...)");
        return root;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f10322T = null;
        super.onDestroyView();
    }

    public final ViewBinding s1() {
        ViewBinding viewBinding = this.f10322T;
        if (viewBinding != null) {
            return viewBinding;
        }
        throw new NullPointerException("Binding not yet set or already cleared.");
    }
}
