package com.paymaya.ui.qr.view.fragment.impl;

import C3.j;
import Gh.f;
import Kh.B;
import R4.i;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.OnClick;
import ce.InterfaceC1098a;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.Z;
import com.paymaya.ui.qr.view.activity.impl.BarcodeScannerActivity;
import de.c;
import de.d;
import io.flutter.plugins.firebase.crashlytics.Constants;
import o1.AbstractC1955a;
import p3.C2011b;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class BarcodeScannerFragment extends BaseFragment implements InterfaceC1098a, Yj.a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Zd.b f14663S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public c f14664T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ee.b f14665U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public d f14666V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f14667W;

    @BindView(R.id.deny_permission_constraint_group_pma_fragment_qr_scanner)
    Group mConstraintGroupDeniedPermission;

    @BindView(R.id.scanner_frame_layout_pma_fragment_qr_scanner)
    FrameLayout mFrameLayoutScannerContainer;

    @Override // Yj.a
    public final void V0(j jVar) {
        Zd.b bVar = this.f14663S;
        bVar.getClass();
        String str = jVar.f719a;
        int i = Zd.a.f6924a[Z.j(str).ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                bVar.l(str);
                return;
            } else {
                bVar.l(str);
                return;
            }
        }
        Object obj = (InterfaceC1098a) bVar.c.get();
        C1219h c1219hH = AbstractC2329d.h(12);
        c1219hH.t(EnumC1217f.SCAN);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(Constants.REASON, "Not Supported");
        ((BaseFragment) obj).o1(c1219hH);
        bVar.k();
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.BARCODE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 2 && AbstractC1955a.u(getContext(), "android.permission.CAMERA")) {
            r1();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14666V = (d) getActivity();
        Lh.c cVarE = W4.a.e().E();
        O5.a aVar = (O5.a) cVarE.c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        ((C2011b) cVarE.f2990b).getClass();
        Zd.b bVar = new Zd.b(0);
        this.f14663S = bVar;
        bVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_qr_scanner, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14663S.i();
        super.onDestroy();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @OnClick({R.id.enable_camera_text_view_pma_fragment_merchant_qr_scanner})
    public void onEnableCameraPressed() {
        int i = 0;
        if (!AbstractC1955a.v(getActivity(), "android.permission.CAMERA")) {
            Zd.b bVar = this.f14663S;
            BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) ((InterfaceC1098a) bVar.c.get());
            barcodeScannerFragment.getClass();
            B bE = AbstractC1955a.k(barcodeScannerFragment).e(zh.b.a());
            f fVar = new f(new i(bVar, 17), Eh.d.f1366d);
            bE.g(fVar);
            bVar.e(fVar);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.pma_dialog_fragment_allow_camera_permission, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        Button button = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_not_now_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_open_settings_button);
        button.setOnClickListener(new de.a(alertDialogCreate, 0));
        button2.setOnClickListener(new de.b(this, alertDialogCreate, i));
        alertDialogCreate.show();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        c cVar = this.f14664T;
        if (cVar != null) {
            cVar.c();
            this.f14667W = false;
        }
        super.onPause();
    }

    @OnClick({R.id.back_image_view_pma_fragment_qr_scanner})
    public void onQRBackPressed() {
        c cVar = this.f14664T;
        if (cVar != null) {
            cVar.c();
            this.f14667W = false;
        }
        getActivity().onBackPressed();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((BarcodeScannerActivity) this.f14666V).Q(this);
        c cVar = this.f14664T;
        if (cVar != null) {
            cVar.setResultHandler(this);
            if (this.f14667W) {
                return;
            }
            this.f14664T.b();
            this.f14667W = true;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Zd.b bVar = this.f14663S;
            String source = arguments.getString("source");
            bVar.getClass();
            kotlin.jvm.internal.j.g(source, "source");
            bVar.j();
            bVar.e = source;
            if (AbstractC1955a.u(((BarcodeScannerFragment) ((InterfaceC1098a) bVar.c.get())).getContext(), "android.permission.CAMERA")) {
                ((BarcodeScannerFragment) ((InterfaceC1098a) bVar.c.get())).r1();
            } else {
                ((BarcodeScannerFragment) ((InterfaceC1098a) bVar.c.get())).mConstraintGroupDeniedPermission.setVisibility(0);
            }
        }
    }

    public final void r1() {
        this.f14664T = new c(this, getActivity());
        this.f14665U.setLaserEnabled(true);
        this.mConstraintGroupDeniedPermission.setVisibility(8);
        this.mFrameLayoutScannerContainer.addView(this.f14664T);
        this.f14664T.setResultHandler(this);
        this.f14664T.b();
    }
}
