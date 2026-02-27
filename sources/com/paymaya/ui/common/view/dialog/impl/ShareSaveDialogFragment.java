package com.paymaya.ui.common.view.dialog.impl;

import N5.k1;
import O5.a;
import Pc.d;
import Q6.s;
import Rc.e;
import Rc.f;
import S.b;
import Tc.c;
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
import com.paymaya.common.base.BaseBottomSheetDialogFragment;
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
public class ShareSaveDialogFragment extends BaseBottomSheetDialogFragment implements c, e {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public d f14389Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public k1 f14390R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public f f14391S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public GridLayoutManager f14392T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Intent f14393U;

    @Override // Rc.e
    public final void a(ShareSaveAppInfo shareSaveAppInfo) {
        j.g(shareSaveAppInfo, "shareSaveAppInfo");
        d dVar = (d) p1();
        if (shareSaveAppInfo.equals(ShareSaveAppInfo.Companion.getSAVE_IMAGE())) {
            ShareSaveDialogFragment shareSaveDialogFragment = (ShareSaveDialogFragment) ((c) dVar.c.get());
            shareSaveDialogFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.SAVE);
            shareSaveDialogFragment.m1(c1219h);
            String strO1 = ((ShareSaveDialogFragment) ((c) dVar.c.get())).o1();
            if (strO1 != null) {
                ((ShareSaveDialogFragment) ((c) dVar.c.get())).q1(strO1);
                return;
            }
            return;
        }
        ShareSaveDialogFragment shareSaveDialogFragment2 = (ShareSaveDialogFragment) ((c) dVar.c.get());
        shareSaveDialogFragment2.getClass();
        String packageName = shareSaveAppInfo.getPackageName();
        String activityClassName = shareSaveAppInfo.getActivityClassName();
        if (packageName == null || activityClassName == null) {
            Intent intent = shareSaveDialogFragment2.f14393U;
            if (intent == null) {
                j.n("intent");
                throw null;
            }
            intent.setPackage(packageName);
        } else {
            Intent intent2 = shareSaveDialogFragment2.f14393U;
            if (intent2 == null) {
                j.n("intent");
                throw null;
            }
            intent2.setComponent(new ComponentName(packageName, activityClassName));
        }
        Intent intent3 = shareSaveDialogFragment2.f14393U;
        if (intent3 == null) {
            j.n("intent");
            throw null;
        }
        shareSaveDialogFragment2.startActivity(intent3);
        ((c) dVar.c.get()).dismiss();
    }

    public final String o1() {
        Intent intent = this.f14393U;
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

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
        a aVar = (a) W4.a.e().a().c;
        this.f10238B = (C1220i) aVar.f4716g.get();
        this.f14389Q = new d(new K0((Context) aVar.f4709d.get()));
        Bundle arguments = getArguments();
        if (arguments == null || (intent = (Intent) arguments.getParcelable("intent")) == null) {
            intent = new Intent();
        }
        this.f14393U = intent;
        ((AbstractC2509a) p1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        k1 k1VarB = k1.b(inflater, viewGroup);
        this.f14390R = k1VarB;
        return (ConstraintLayout) k1VarB.e;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) p1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f14390R = null;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog;
        super.onStart();
        f fVar = this.f14391S;
        if (fVar == null) {
            j.n("shareSaveDialogAdapter");
            throw null;
        }
        if (fVar.getItemCount() != 0 || (dialog = getDialog()) == null) {
            return;
        }
        dialog.hide();
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        k1 k1Var = this.f14390R;
        j.d(k1Var);
        ((ImageView) k1Var.f4138b).setOnClickListener(new b(this, 16));
        this.f14391S = new f(this);
        this.f14392T = new GridLayoutManager(requireContext(), 4);
        k1 k1Var2 = this.f14390R;
        j.d(k1Var2);
        f fVar = this.f14391S;
        if (fVar == null) {
            j.n("shareSaveDialogAdapter");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) k1Var2.f;
        recyclerView.setAdapter(fVar);
        GridLayoutManager gridLayoutManager = this.f14392T;
        if (gridLayoutManager == null) {
            j.n("shareSaveDialogLayoutManager");
            throw null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        k1 k1Var3 = this.f14390R;
        j.d(k1Var3);
        ((NestedScrollView) k1Var3.c).setOnScrollChangeListener(new Na.d(this, 22));
        ((d) p1()).j();
    }

    public final Oc.b p1() {
        d dVar = this.f14389Q;
        if (dVar != null) {
            return dVar;
        }
        j.n("shareSaveDialogFragmentPresenter");
        throw null;
    }

    public final void q1(String str) {
        String string;
        Uri uri = Uri.parse(str);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("filename")) == null) {
            string = String.format("paymaya_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        }
        File fileH = C.h(requireContext(), uri, string);
        boolean zU = AbstractC1955a.u(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        d dVar = (d) p1();
        if (fileH != null) {
            ShareSaveDialogFragment shareSaveDialogFragment = (ShareSaveDialogFragment) ((c) dVar.c.get());
            Toast.makeText(shareSaveDialogFragment.getActivity(), shareSaveDialogFragment.getString(R.string.pma_label_image_saved), 0).show();
            ((c) dVar.c.get()).dismiss();
        } else if (!zU) {
            ShareSaveDialogFragment shareSaveDialogFragment2 = (ShareSaveDialogFragment) ((c) dVar.c.get());
            AbstractC1955a.p(shareSaveDialogFragment2.requireActivity()).e(zh.b.a()).g(new Gh.f(new s(shareSaveDialogFragment2, 4), Eh.d.f1366d));
        } else {
            ShareSaveDialogFragment shareSaveDialogFragment3 = (ShareSaveDialogFragment) ((c) dVar.c.get());
            Toast.makeText(shareSaveDialogFragment3.getActivity(), shareSaveDialogFragment3.getString(R.string.pma_label_image_not_saved), 0).show();
            ((c) dVar.c.get()).dismiss();
        }
    }

    public final void r1(List shareSaveAppInfoList) {
        j.g(shareSaveAppInfoList, "shareSaveAppInfoList");
        f fVar = this.f14391S;
        if (fVar == null) {
            j.n("shareSaveDialogAdapter");
            throw null;
        }
        fVar.submitList(shareSaveAppInfoList);
        k1 k1Var = this.f14390R;
        j.d(k1Var);
        ((ConstraintLayout) k1Var.e).postInvalidate();
    }
}
