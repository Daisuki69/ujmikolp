package com.paymaya.ui.qr.view.fragment.impl;

import Gh.f;
import Kh.B;
import Q6.r;
import Zd.d;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.Group;
import androidx.media3.exoplayer.ExoPlayer;
import butterknife.BindView;
import butterknife.OnClick;
import ce.c;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.ui.qr.view.activity.impl.QRActivity;
import com.paymaya.ui.qr.view.widget.CameraSourcePreview;
import de.h;
import de.i;
import e2.C1421c;
import java.io.IOException;
import o1.AbstractC1955a;
import v.AbstractC2329d;
import w3.C2376a;

/* JADX INFO: loaded from: classes4.dex */
public class MLKitQRScannerFragment extends BaseFragment implements c {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public d f14675S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Oa.d f14676T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public i f14677U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public r3.b f14678V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public v3.d f14679W;

    @BindView(R.id.camera_source_preview_pma_fragment_qr_scanner_mlkit)
    CameraSourcePreview mCameraSourcePreview;

    @BindView(R.id.deny_permission_constraint_group_pma_fragment_qr_scanner)
    Group mConstraintGroupDeniedPermission;

    @BindView(R.id.other_option_group_pma_fragment_qr_scanner)
    Group mGroupOtherOptions;

    @BindView(R.id.qr_code_frame_image_view_pma_fragment_qr_scanner_mlkit)
    ImageView mImageViewQRCodeFrame;

    @BindView(R.id.qr_code_spiels_text_view_pma_fragment_qr_scanner_mlkit)
    TextView mTextViewQRCodeSpiels;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.SCAN;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 2 && AbstractC1955a.u(getContext(), "android.permission.CAMERA")) {
            w1();
            return;
        }
        if (i == 300 && i4 == -1 && intent != null) {
            try {
                C2376a c2376aA = C2376a.a(getContext(), intent.getData());
                if (this.f14679W == null) {
                    this.f14679W = Xh.i.t(this.f14678V);
                }
                this.f14679W.c(c2376aA).addOnSuccessListener(new h(this)).addOnFailureListener(new h(this));
            } catch (IOException unused) {
                yk.a.e();
            }
        }
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
    @OnClick({R.id.import_from_gallery_text_view_pma_fragment_qr_scanner})
    public void onClickImportFromGallery() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.GALLERY);
        o1(c1219hH);
        if (AbstractC1955a.u(getActivity(), "android.permission.READ_EXTERNAL_STORAGE")) {
            r1();
            return;
        }
        d dVar = this.f14675S;
        B bE = AbstractC1955a.p(((MLKitQRScannerFragment) ((c) dVar.c.get())).getActivity()).e(zh.b.a());
        f fVar = new f(new Qd.a(dVar, 20), Eh.d.f1366d);
        bE.g(fVar);
        dVar.e(fVar);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f10248Q.r(EnumC1216e.MLKIT_SCANNER);
        this.f14677U = (i) getActivity();
        O5.a aVar = (O5.a) W4.a.e().E().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        d dVar = new d((com.paymaya.data.preference.a) aVar.e.get());
        this.f14675S = dVar;
        dVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_qr_scanner_mlkit, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14675S.i();
        Oa.d dVar = this.f14676T;
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
        int i = 2;
        if (!AbstractC1955a.v(getActivity(), "android.permission.CAMERA")) {
            d dVar = this.f14675S;
            MLKitQRScannerFragment mLKitQRScannerFragment = (MLKitQRScannerFragment) ((c) dVar.c.get());
            mLKitQRScannerFragment.getClass();
            B bE = AbstractC1955a.k(mLKitQRScannerFragment).e(zh.b.a());
            f fVar = new f(new r(dVar, 20), Eh.d.f1366d);
            bE.g(fVar);
            dVar.e(fVar);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.pma_dialog_fragment_allow_camera_permission, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        Button button = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_not_now_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_open_settings_button);
        button.setOnClickListener(new de.a(alertDialogCreate, 2));
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
        if (this.f14676T != null) {
            this.mCameraSourcePreview.b();
        }
        getActivity().onBackPressed();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("attribution", l1().f10371a);
        o1(c1219hH);
        ((QRActivity) this.f14677U).Q(this);
        x1();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f14675S.e = false;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f14676T == null) {
            Oa.d dVar = new Oa.d(getActivity(), 1);
            this.f14676T = dVar;
            dVar.e();
        }
        Oa.d dVar2 = this.f14676T;
        C1421c c1421c = new C1421c(this);
        synchronized (dVar2.f4782g) {
            dVar2.j = c1421c;
        }
        this.f14675S.j();
        this.f14678V = new r3.b(new int[]{1}[0] | 256);
    }

    public final void r1() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            startActivityForResult(Intent.createChooser(intent, getString(R.string.pma_label_import_qr_from_gallery)), 300);
        }
    }

    public final void s1() {
        this.f14675S.f = false;
        ((QRActivity) this.f14677U).t1(getString(R.string.pma_label_import_qr_error), getString(R.string.pma_label_import_qr_error_content), new h(this));
    }

    public final void t1() {
        this.mGroupOtherOptions.setVisibility(0);
    }

    public final void u1() {
        this.mConstraintGroupDeniedPermission.setVisibility(0);
    }

    public final void v1() {
        this.mCameraSourcePreview.b();
        this.mImageViewQRCodeFrame.setImageResource(2131231927);
        this.mTextViewQRCodeSpiels.setText(getString(R.string.pma_label_qr_code_invalid_please_try_again));
        new Handler().postDelayed(new Runnable() { // from class: com.paymaya.ui.qr.view.fragment.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                MLKitQRScannerFragment mLKitQRScannerFragment = this.f14759a;
                if (mLKitQRScannerFragment.isAdded()) {
                    mLKitQRScannerFragment.x1();
                    mLKitQRScannerFragment.f14675S.f = false;
                    mLKitQRScannerFragment.mImageViewQRCodeFrame.setImageResource(2131231926);
                    mLKitQRScannerFragment.mTextViewQRCodeSpiels.setText(mLKitQRScannerFragment.getActivity().getString(R.string.pma_label_align_qr_code));
                }
            }
        }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    public final void w1() {
        this.mConstraintGroupDeniedPermission.setVisibility(8);
        x1();
    }

    public final void x1() {
        if (this.f14676T == null || !AbstractC1955a.u(getContext(), "android.permission.CAMERA")) {
            return;
        }
        try {
            CameraSourcePreview cameraSourcePreview = this.mCameraSourcePreview;
            if (cameraSourcePreview != null) {
                Oa.d dVar = this.f14676T;
                if (dVar == null) {
                    cameraSourcePreview.b();
                }
                cameraSourcePreview.e = dVar;
                if (dVar != null) {
                    cameraSourcePreview.c = true;
                    cameraSourcePreview.a();
                }
            }
        } catch (IOException unused) {
            yk.a.d();
            this.f14676T.c();
            this.f14676T = null;
        }
    }

    public final void y1() {
        try {
            this.mCameraSourcePreview.b();
        } catch (Exception unused) {
            yk.a.e();
        }
    }

    public final void z1() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                ((Vibrator) getActivity().getSystemService("vibrator")).vibrate(VibrationEffect.createOneShot(150L, -1));
            } else {
                ((Vibrator) getActivity().getSystemService("vibrator")).vibrate(150L);
            }
        } catch (Exception unused) {
            yk.a.e();
        }
    }
}
