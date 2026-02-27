package com.paymaya.ui.qr.view.fragment.impl;

import C3.j;
import Gh.f;
import Kh.B;
import Q6.s;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.OnClick;
import ce.d;
import com.google.zxing.NotFoundException;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.Z;
import com.paymaya.ui.qr.view.activity.impl.QRActivity;
import d2.C1328c;
import de.m;
import de.n;
import de.o;
import o1.AbstractC1955a;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class QRScannerFragment extends BaseFragment implements d, Yj.a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Bb.a f14687S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public n f14688T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ee.d f14689U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public o f14690V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f14691W;

    @BindView(R.id.deny_permission_constraint_group_pma_fragment_qr_scanner)
    Group mConstraintGroupDeniedPermission;

    @BindView(R.id.scanner_frame_layout_pma_fragment_qr_scanner)
    FrameLayout mFrameLayoutScannerContainer;

    @BindView(R.id.other_option_group_pma_fragment_qr_scanner)
    Group mGroupOtherOptions;

    @Override // Yj.a
    public final void V0(j jVar) {
        Bb.a aVar = this.f14687S;
        aVar.getClass();
        aVar.l(jVar, 0);
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.SCAN;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        int i6 = 0;
        super.onActivityResult(i, i4, intent);
        if (i == 2 && AbstractC1955a.u(getContext(), "android.permission.CAMERA")) {
            u1();
            return;
        }
        if (i == 300 && i4 == -1 && intent != null) {
            try {
                j jVarM = Z.m(BitmapFactory.decodeStream(getContext().getContentResolver().openInputStream(intent.getData())));
                Bb.a aVar = this.f14687S;
                aVar.getClass();
                aVar.l(jVarM, 1);
            } catch (NotFoundException unused) {
                yk.a.b();
                Bb.a aVar2 = this.f14687S;
                QRScannerFragment qRScannerFragment = (QRScannerFragment) ((d) aVar2.c.get());
                ((QRActivity) qRScannerFragment.f14690V).t1(qRScannerFragment.getString(R.string.pma_label_import_qr_error), qRScannerFragment.getString(R.string.pma_label_import_qr_error_content), new m(qRScannerFragment, i6));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                aVar2.y(1, "No qr detected");
            } catch (Exception e) {
                Bb.a aVar3 = this.f14687S;
                QRScannerFragment qRScannerFragment2 = (QRScannerFragment) ((d) aVar3.c.get());
                ((QRActivity) qRScannerFragment2.f14690V).t1(qRScannerFragment2.getString(R.string.pma_label_import_qr_error), qRScannerFragment2.getString(R.string.pma_label_import_qr_error_content), new m(qRScannerFragment2, i6));
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                aVar3.y(1, "No qr detected");
                C1328c.a().b(e);
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
        Bb.a aVar = this.f14687S;
        B bE = AbstractC1955a.p(((QRScannerFragment) ((d) aVar.c.get())).getActivity()).e(zh.b.a());
        f fVar = new f(new Q6.n(aVar, 20), Eh.d.f1366d);
        bE.g(fVar);
        aVar.e(fVar);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f14690V = (o) getActivity();
        O5.a aVar = (O5.a) W4.a.e().E().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        Bb.a aVar2 = new Bb.a((com.paymaya.data.preference.a) aVar.e.get(), 18);
        this.f14687S = aVar2;
        aVar2.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_qr_scanner, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14687S.i();
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
        int i = 3;
        if (!AbstractC1955a.v(getActivity(), "android.permission.CAMERA")) {
            Bb.a aVar = this.f14687S;
            QRScannerFragment qRScannerFragment = (QRScannerFragment) ((d) aVar.c.get());
            qRScannerFragment.getClass();
            B bE = AbstractC1955a.k(qRScannerFragment).e(zh.b.a());
            f fVar = new f(new s(aVar, 20), Eh.d.f1366d);
            bE.g(fVar);
            aVar.e(fVar);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.pma_dialog_fragment_allow_camera_permission, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        Button button = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_not_now_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_open_settings_button);
        button.setOnClickListener(new de.a(alertDialogCreate, 3));
        button2.setOnClickListener(new de.b(this, alertDialogCreate, i));
        alertDialogCreate.show();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.f14688T != null) {
            v1();
        }
        super.onPause();
    }

    @OnClick({R.id.back_image_view_pma_fragment_qr_scanner})
    public void onQRBackPressed() {
        if (this.f14688T != null) {
            v1();
        }
        getActivity().onBackPressed();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((QRActivity) this.f14690V).Q(this);
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("attribution", l1().f10371a);
        o1(c1219h);
        n nVar = this.f14688T;
        if (nVar != null) {
            nVar.setResultHandler(this);
            if (this.f14691W) {
                return;
            }
            this.f14688T.b();
            this.f14691W = true;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14687S.j();
    }

    public final void r1() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            startActivityForResult(Intent.createChooser(intent, getString(R.string.pma_label_import_qr_from_gallery)), 300);
        }
    }

    public final void s1() {
        this.mGroupOtherOptions.setVisibility(0);
    }

    public final void t1() {
        this.mConstraintGroupDeniedPermission.setVisibility(0);
    }

    public final void u1() {
        this.f14688T = new n(this, getActivity());
        this.f14689U.setLaserEnabled(true);
        this.mConstraintGroupDeniedPermission.setVisibility(8);
        this.mFrameLayoutScannerContainer.addView(this.f14688T);
        this.f14688T.setResultHandler(this);
        if (this.f14691W) {
            return;
        }
        this.f14688T.b();
        this.f14691W = true;
    }

    public final void v1() {
        this.f14688T.c();
        this.f14691W = false;
    }

    public final void w1() {
        ((Vibrator) getActivity().getSystemService("vibrator")).vibrate(100L);
    }
}
