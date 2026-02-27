package com.paymaya.mayaui.common.view.dialog.impl;

import N5.k1;
import Na.d;
import O5.a;
import Q6.p;
import R4.i;
import Rc.e;
import S.b;
import V6.f;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShareSaveAppInfo;
import com.paymaya.domain.store.K0;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShareSaveDialogFragment extends MayaBaseBottomSheetDialogFragment implements f, e {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public p f11885S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public k1 f11886T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Rc.f f11887U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public GridLayoutManager f11888V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Intent f11889W;

    @Override // Rc.e
    public final void a(ShareSaveAppInfo shareSaveAppInfo) {
        j.g(shareSaveAppInfo, "shareSaveAppInfo");
        p pVar = (p) t1();
        if (shareSaveAppInfo.equals(ShareSaveAppInfo.Companion.getSAVE_IMAGE())) {
            MayaShareSaveDialogFragment mayaShareSaveDialogFragment = (MayaShareSaveDialogFragment) ((f) pVar.c.get());
            mayaShareSaveDialogFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.SAVE);
            mayaShareSaveDialogFragment.r1(c1219h);
            String strS1 = ((MayaShareSaveDialogFragment) ((f) pVar.c.get())).s1();
            if (strS1 != null) {
                ((MayaShareSaveDialogFragment) ((f) pVar.c.get())).u1(strS1);
                return;
            }
            return;
        }
        MayaShareSaveDialogFragment mayaShareSaveDialogFragment2 = (MayaShareSaveDialogFragment) ((f) pVar.c.get());
        mayaShareSaveDialogFragment2.getClass();
        String packageName = shareSaveAppInfo.getPackageName();
        String activityClassName = shareSaveAppInfo.getActivityClassName();
        if (packageName == null || activityClassName == null) {
            Intent intent = mayaShareSaveDialogFragment2.f11889W;
            if (intent == null) {
                j.n("intent");
                throw null;
            }
            intent.setPackage(packageName);
        } else {
            Intent intent2 = mayaShareSaveDialogFragment2.f11889W;
            if (intent2 == null) {
                j.n("intent");
                throw null;
            }
            intent2.setComponent(new ComponentName(packageName, activityClassName));
        }
        Intent intent3 = mayaShareSaveDialogFragment2.f11889W;
        if (intent3 == null) {
            j.n("intent");
            throw null;
        }
        mayaShareSaveDialogFragment2.startActivity(intent3);
        ((f) pVar.c.get()).dismiss();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
        a aVar = (a) W4.a.e().a().c;
        this.f10325B = (C1220i) aVar.f4716g.get();
        this.f11885S = new p(new K0((Context) aVar.f4709d.get()));
        Bundle arguments = getArguments();
        if (arguments == null || (intent = (Intent) arguments.getParcelable("intent")) == null) {
            intent = new Intent();
        }
        this.f11889W = intent;
        ((AbstractC2509a) t1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        k1 k1VarB = k1.b(inflater, viewGroup);
        this.f11886T = k1VarB;
        return (ConstraintLayout) k1VarB.e;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) t1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11886T = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog;
        super.onStart();
        Rc.f fVar = this.f11887U;
        if (fVar == null) {
            j.n("shareSaveDialogAdapter");
            throw null;
        }
        if (fVar.getItemCount() != 0 || (dialog = getDialog()) == null) {
            return;
        }
        dialog.hide();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        k1 k1Var = this.f11886T;
        j.d(k1Var);
        ((ImageView) k1Var.f4138b).setOnClickListener(new b(this, 21));
        this.f11887U = new Rc.f(this);
        this.f11888V = new GridLayoutManager(requireContext(), 4);
        k1 k1Var2 = this.f11886T;
        j.d(k1Var2);
        Rc.f fVar = this.f11887U;
        if (fVar == null) {
            j.n("shareSaveDialogAdapter");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) k1Var2.f;
        recyclerView.setAdapter(fVar);
        GridLayoutManager gridLayoutManager = this.f11888V;
        if (gridLayoutManager == null) {
            j.n("shareSaveDialogLayoutManager");
            throw null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        k1 k1Var3 = this.f11886T;
        j.d(k1Var3);
        ((NestedScrollView) k1Var3.c).setOnScrollChangeListener(new d(this, 25));
        ((p) t1()).j();
    }

    public final String s1() {
        Intent intent = this.f11889W;
        if (intent == null) {
            j.n("intent");
            throw null;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public final P6.a t1() {
        p pVar = this.f11885S;
        if (pVar != null) {
            return pVar;
        }
        j.n("shareSaveDialogFragmentPresenter");
        throw null;
    }

    public final void u1(String str) {
        String string;
        Uri uri = Uri.parse(str);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("filename")) == null) {
            string = String.format("paymaya_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        }
        File fileH = C.h(requireContext(), uri, string);
        boolean zU = AbstractC1955a.u(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        p pVar = (p) t1();
        if (fileH != null) {
            MayaShareSaveDialogFragment mayaShareSaveDialogFragment = (MayaShareSaveDialogFragment) ((f) pVar.c.get());
            Toast.makeText(mayaShareSaveDialogFragment.getActivity(), mayaShareSaveDialogFragment.getString(R.string.pma_label_image_saved), 0).show();
            ((f) pVar.c.get()).dismiss();
        } else if (!zU) {
            MayaShareSaveDialogFragment mayaShareSaveDialogFragment2 = (MayaShareSaveDialogFragment) ((f) pVar.c.get());
            AbstractC1955a.p(mayaShareSaveDialogFragment2.requireActivity()).e(zh.b.a()).g(new Gh.f(new i(mayaShareSaveDialogFragment2, 4), Eh.d.f1366d));
        } else {
            MayaShareSaveDialogFragment mayaShareSaveDialogFragment3 = (MayaShareSaveDialogFragment) ((f) pVar.c.get());
            Toast.makeText(mayaShareSaveDialogFragment3.getActivity(), mayaShareSaveDialogFragment3.getString(R.string.pma_label_image_not_saved), 0).show();
            ((f) pVar.c.get()).dismiss();
        }
    }

    public final void v1(List shareSaveAppInfoList) {
        j.g(shareSaveAppInfoList, "shareSaveAppInfoList");
        Rc.f fVar = this.f11887U;
        if (fVar == null) {
            j.n("shareSaveDialogAdapter");
            throw null;
        }
        fVar.submitList(shareSaveAppInfoList);
        k1 k1Var = this.f11886T;
        j.d(k1Var);
        ((ConstraintLayout) k1Var.e).postInvalidate();
    }
}
