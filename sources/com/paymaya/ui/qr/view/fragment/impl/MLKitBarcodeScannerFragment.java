package com.paymaya.ui.qr.view.fragment.impl;

import Kh.B;
import Oa.d;
import Q6.l;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.ui.qr.view.activity.impl.BarcodeScannerActivity;
import com.paymaya.ui.qr.view.widget.CameraSourcePreview;
import de.f;
import java.io.IOException;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public class MLKitBarcodeScannerFragment extends BaseFragment implements ce.b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public l f14670S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public d f14671T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public f f14672U;

    @BindView(R.id.camera_source_preview_pma_fragment_barcode_scanner_mlkit)
    CameraSourcePreview mCameraSourcePreview;

    @BindView(R.id.deny_permission_constraint_group_pma_fragment_qr_scanner)
    Group mConstraintGroupDeniedPermission;

    @BindView(R.id.barcode_frame_image_view_pma_fragment_barcode_scanner_mlkit)
    ImageView mImageViewBarcodeFrame;

    @BindView(R.id.barcode_spiels_text_view_pma_fragment_barcode_scanner_mlkit)
    TextView mTextViewBarcodeSpiels;

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
        this.f10249R = true;
        this.f10248Q.r(EnumC1216e.MLKIT_SCANNER);
        this.f14672U = (f) getActivity();
        O5.a aVar = (O5.a) W4.a.e().E().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        l lVar = new l(17);
        this.f14670S = lVar;
        lVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_barcode_scanner_mlkit, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14670S.i();
        d dVar = this.f14671T;
        if (dVar != null) {
            dVar.c();
        }
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
        int i = 1;
        if (!AbstractC1955a.v(getActivity(), "android.permission.CAMERA")) {
            l lVar = this.f14670S;
            MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment = (MLKitBarcodeScannerFragment) ((ce.b) lVar.c.get());
            mLKitBarcodeScannerFragment.getClass();
            B bE = AbstractC1955a.k(mLKitBarcodeScannerFragment).e(zh.b.a());
            Gh.f fVar = new Gh.f(new T3.l(lVar, 18), Eh.d.f1366d);
            bE.g(fVar);
            lVar.e(fVar);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.pma_dialog_fragment_allow_camera_permission, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        Button button = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_not_now_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_open_settings_button);
        button.setOnClickListener(new de.a(alertDialogCreate, 1));
        button2.setOnClickListener(new de.b(this, alertDialogCreate, i));
        alertDialogCreate.show();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.mCameraSourcePreview.b();
    }

    @OnClick({R.id.back_image_view_pma_fragment_qr_scanner})
    public void onQRBackPressed() {
        if (this.f14671T != null) {
            this.mCameraSourcePreview.b();
        }
        getActivity().onBackPressed();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((BarcodeScannerActivity) this.f14672U).Q(this);
        s1();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f14671T == null) {
            d dVar = new d(getActivity(), 1);
            this.f14671T = dVar;
            synchronized (dVar) {
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            l lVar = this.f14670S;
            String source = arguments.getString("source");
            lVar.getClass();
            j.g(source, "source");
            lVar.j();
            if (AbstractC1955a.u(((MLKitBarcodeScannerFragment) ((ce.b) lVar.c.get())).getContext(), "android.permission.CAMERA")) {
                ((MLKitBarcodeScannerFragment) ((ce.b) lVar.c.get())).r1();
            } else {
                ((MLKitBarcodeScannerFragment) ((ce.b) lVar.c.get())).mConstraintGroupDeniedPermission.setVisibility(0);
            }
        }
    }

    public final void r1() {
        this.mConstraintGroupDeniedPermission.setVisibility(8);
        s1();
    }

    public final void s1() {
        d dVar = this.f14671T;
        if (dVar != null) {
            try {
                CameraSourcePreview cameraSourcePreview = this.mCameraSourcePreview;
                if (cameraSourcePreview != null) {
                    cameraSourcePreview.e = dVar;
                    cameraSourcePreview.c = true;
                    cameraSourcePreview.a();
                }
            } catch (IOException unused) {
                yk.a.d();
                this.f14671T.c();
                this.f14671T = null;
            }
        }
    }
}
