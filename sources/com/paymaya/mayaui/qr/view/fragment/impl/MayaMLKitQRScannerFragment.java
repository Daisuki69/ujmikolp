package com.paymaya.mayaui.qr.view.fragment.impl;

import Ah.h;
import E1.c;
import G6.r;
import G6.v;
import G7.t;
import Gh.f;
import Kh.B;
import Ma.a;
import N5.C0441c;
import N5.M0;
import Na.e;
import Oa.d;
import Xh.i;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.MayaButtonWithIcon;
import com.paymaya.common.widget.TextViewWithImagesKt;
import com.paymaya.mayaui.common.view.activity.impl.MayaServiceUnavailableActivity;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.qr.view.widget.MayaCameraHeaderQRPH;
import com.paymaya.mayaui.qr.view.widget.MayaCameraSourcePreview;
import com.paymaya.mayaui.qr.view.widget.MayaQrScannerMaskView;
import java.io.IOException;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import r3.b;
import v.AbstractC2329d;
import w3.C2376a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMLKitQRScannerFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public M0 f13576U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public MayaCameraSourcePreview f13577V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Group f13578W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaQrScannerMaskView f13579X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public AppCompatImageView f13580Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f13581Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f13582a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C0441c f13583b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public AppCompatTextView f13584c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public MayaCameraHeaderQRPH f13585d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public AppCompatTextView f13586e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public MayaButtonWithIcon f13587f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public MayaButtonWithIcon f13588g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextViewWithImagesKt f13589h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public d f13590i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public e f13591j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public b f13592k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public v3.d f13593l0;
    public Ja.b m0;

    public static final void I1(MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment) {
        if (mayaMLKitQRScannerFragment.t1().e().isQREventsV2Enabled()) {
            String string = mayaMLKitQRScannerFragment.getResources().getString(R.string.maya_label_upload_qr);
            j.f(string, "getString(...)");
            mayaMLKitQRScannerFragment.J1(string);
        } else {
            EnumC1217f enumC1217f = ((Ja.b) mayaMLKitQRScannerFragment.H1()).f2498d.e().isQRScreensUpdateEnabled() ? EnumC1217f.UPLOAD_QR : EnumC1217f.GALLERY;
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(enumC1217f);
            mayaMLKitQRScannerFragment.A1(c1219h);
        }
        Ja.b bVar = (Ja.b) mayaMLKitQRScannerFragment.H1();
        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = (MayaMLKitQRScannerFragment) ((a) bVar.c.get());
        mayaMLKitQRScannerFragment2.getClass();
        B bE = (Build.VERSION.SDK_INT < 33 ? c.r(new Ze.c(mayaMLKitQRScannerFragment2).c("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) : h.d(new Ze.a("android.permission.READ_MEDIA_IMAGES", true, false))).e(zh.b.a());
        f fVar = new f(new r(bVar, 5), Eh.d.f1366d);
        bE.g(fVar);
        bVar.e(fVar);
    }

    public final void G1() {
        Q1();
        ((Ja.b) H1()).f2499g = false;
        ((Ja.b) H1()).f = false;
        MayaQrScannerMaskView mayaQrScannerMaskView = this.f13579X;
        if (mayaQrScannerMaskView != null) {
            mayaQrScannerMaskView.setErrorState(false);
        } else {
            j.n("mScanQrMask");
            throw null;
        }
    }

    public final Ia.a H1() {
        Ja.b bVar = this.m0;
        if (bVar != null) {
            return bVar;
        }
        j.n("mIMLKitQRScannerFragmentPresenter");
        throw null;
    }

    public final void J1(String str) {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.n(1));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("button", str);
        c1220iO1.c(activity, c1219hE);
    }

    public final void K1(int i, int i4) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        View viewInflate = requireActivity().getLayoutInflater().inflate(R.layout.pma_dialog_fragment_allow_camera_permission, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        j.f(alertDialogCreate, "create(...)");
        alertDialogCreate.setCanceledOnTouchOutside(false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text_view_camera_permission_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.text_view_camera_permission_description);
        Button button = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_not_now_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_open_settings_button);
        textView.setText(i);
        textView2.setText(i4);
        button.setOnClickListener(new Na.a(alertDialogCreate, 0));
        button2.setOnClickListener(new Ad.a(21, alertDialogCreate, this));
        alertDialogCreate.show();
    }

    public final void L1() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(requireContext().getPackageManager()) != null) {
            startActivityForResult(Intent.createChooser(intent, getString(R.string.pma_label_import_qr_from_gallery)), 300);
        }
    }

    public final void M1(Integer num) {
        ((Ja.b) H1()).f2499g = false;
        e eVar = this.f13591j0;
        if (eVar != null) {
            String string = getString(R.string.maya_label_upload_qr_error);
            j.f(string, "getString(...)");
            String string2 = getString(num != null ? num.intValue() : R.string.maya_label_upload_qr_error_content);
            j.f(string2, "getString(...)");
            ((MayaQRActivity) eVar).b2(string, string2, new v(this, 22));
        }
    }

    public final void N1(String str) {
        e eVar = this.f13591j0;
        if (eVar != null) {
            MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
            mayaQRActivity.n1();
            String string = mayaQRActivity.getString(R.string.maya_label_non_maya_qr_payment);
            if (str == null) {
                str = mayaQRActivity.getString(R.string.maya_label_non_maya_qr_maintenance_message);
                j.f(str, "getString(...)");
            }
            Intent intent = new Intent(mayaQRActivity, (Class<?>) MayaServiceUnavailableActivity.class);
            intent.putExtra("unavailable_page_title", string);
            intent.putExtra("unavailable_description", str);
            intent.setFlags(335544320);
            mayaQRActivity.startActivity(intent);
        }
    }

    public final void O1() {
        MayaButtonWithIcon mayaButtonWithIcon = this.f13587f0;
        if (mayaButtonWithIcon == null) {
            j.n("mUploadQrButton");
            throw null;
        }
        mayaButtonWithIcon.setVisibility(0);
        Group group = this.f13578W;
        if (group == null) {
            j.n("mConstraintGroupDeniedPermission");
            throw null;
        }
        group.setVisibility(8);
        Q1();
    }

    public final void P1() {
        TextView textView = this.f13582a0;
        if (textView == null) {
            j.n("mTextViewToolbar");
            throw null;
        }
        textView.setVisibility(8);
        MayaButtonWithIcon mayaButtonWithIcon = this.f13587f0;
        if (mayaButtonWithIcon == null) {
            j.n("mUploadQrButton");
            throw null;
        }
        mayaButtonWithIcon.setVisibility(0);
        Group group = this.f13578W;
        if (group == null) {
            j.n("mConstraintGroupDeniedPermission");
            throw null;
        }
        group.setVisibility(8);
        Q1();
    }

    public final void Q1() {
        d dVar;
        if (this.f13590i0 == null || !AbstractC1955a.u(getContext(), "android.permission.CAMERA")) {
            return;
        }
        try {
            MayaCameraSourcePreview mayaCameraSourcePreview = this.f13577V;
            if (mayaCameraSourcePreview == null) {
                j.n("mCameraSourcePreview");
                throw null;
            }
            d dVar2 = this.f13590i0;
            if (dVar2 == null && (dVar = mayaCameraSourcePreview.e) != null) {
                dVar.g();
            }
            mayaCameraSourcePreview.e = dVar2;
            if (dVar2 != null) {
                mayaCameraSourcePreview.c = true;
                mayaCameraSourcePreview.a();
            }
        } catch (IOException unused) {
            yk.a.d();
            d dVar3 = this.f13590i0;
            if (dVar3 != null) {
                dVar3.c();
            }
            this.f13590i0 = null;
        }
    }

    public final void R1() {
        try {
            MayaCameraSourcePreview mayaCameraSourcePreview = this.f13577V;
            if (mayaCameraSourcePreview == null) {
                j.n("mCameraSourcePreview");
                throw null;
            }
            d dVar = mayaCameraSourcePreview.e;
            if (dVar != null) {
                dVar.g();
            }
        } catch (Exception unused) {
            yk.a.e();
        }
    }

    public final void S1() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Object systemService = requireActivity().getSystemService("vibrator");
                j.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(150L, -1));
            } else {
                Object systemService2 = requireActivity().getSystemService("vibrator");
                j.e(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                ((Vibrator) systemService2).vibrate(150L);
            }
        } catch (Exception unused) {
            yk.a.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        Task taskAddOnSuccessListener;
        super.onActivityResult(i, i4, intent);
        if (i == 2 && AbstractC1955a.u(getContext(), "android.permission.CAMERA")) {
            Ja.b bVar = (Ja.b) H1();
            if (bVar.f2498d.e().isQRScreensUpdateEnabled()) {
                ((MayaMLKitQRScannerFragment) ((a) bVar.c.get())).P1();
                return;
            } else {
                ((MayaMLKitQRScannerFragment) ((a) bVar.c.get())).O1();
                return;
            }
        }
        if (i == 300 && i4 == -1 && intent != null) {
            Uri data = intent.getData();
            try {
                Context contextRequireContext = requireContext();
                j.d(data);
                C2376a c2376aA = C2376a.a(contextRequireContext, data);
                b bVar2 = this.f13592k0;
                j.d(bVar2);
                v3.d dVarT = i.t(bVar2);
                this.f13593l0 = dVarT;
                Task taskC = dVarT.c(c2376aA);
                if (taskC == null || (taskAddOnSuccessListener = taskC.addOnSuccessListener(new t(new N9.f(this, 1), 29))) == null) {
                    return;
                }
                taskAddOnSuccessListener.addOnFailureListener(new Na.d(this, 0));
            } catch (IOException unused) {
                yk.a.e();
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().r(EnumC1216e.MLKIT_SCANNER);
        this.f13591j0 = (e) getActivity();
        O5.a aVar = W4.a.e().v().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.m0 = new Ja.b((com.paymaya.data.preference.a) aVar.e.get(), aVar.B());
        ((AbstractC2509a) H1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_qr_scanner_mlkit, viewGroup, false);
        int i = R.id.allow_permission_message_text_view;
        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.allow_permission_message_text_view)) != null) {
            i = R.id.allow_permission_title_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.allow_permission_title_text_view)) != null) {
                i = R.id.back_image_view;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.back_image_view);
                if (appCompatImageView != null) {
                    i = R.id.button_show_my_qr;
                    MayaButtonWithIcon mayaButtonWithIcon = (MayaButtonWithIcon) ViewBindings.findChildViewById(viewInflate, R.id.button_show_my_qr);
                    if (mayaButtonWithIcon != null) {
                        i = R.id.deny_permission_background_view;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.deny_permission_background_view);
                        if (viewFindChildViewById != null) {
                            i = R.id.deny_permission_constraint_group;
                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.deny_permission_constraint_group);
                            if (group != null) {
                                i = R.id.enable_camera_text_view;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.enable_camera_text_view);
                                if (textView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = R.id.guide_line_border_scan_bottom;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line_border_scan_bottom)) != null) {
                                        i = R.id.guide_line_border_scan_top;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line_border_scan_top)) != null) {
                                            i = R.id.guideline_center_constraint;
                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_center_constraint)) != null) {
                                                i = R.id.maya_camera_source_preview;
                                                MayaCameraSourcePreview mayaCameraSourcePreview = (MayaCameraSourcePreview) ViewBindings.findChildViewById(viewInflate, R.id.maya_camera_source_preview);
                                                if (mayaCameraSourcePreview != null) {
                                                    i = R.id.maya_qr_scanner_mask_view;
                                                    MayaQrScannerMaskView mayaQrScannerMaskView = (MayaQrScannerMaskView) ViewBindings.findChildViewById(viewInflate, R.id.maya_qr_scanner_mask_view);
                                                    if (mayaQrScannerMaskView != null) {
                                                        i = R.id.text_view_camera_label;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_camera_label)) != null) {
                                                            i = R.id.text_view_qrph_scan_error;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_qrph_scan_error);
                                                            if (appCompatTextView != null) {
                                                                i = R.id.toolbar_text_view;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_text_view);
                                                                if (textView2 != null) {
                                                                    i = R.id.upload_qr_button;
                                                                    MayaButtonWithIcon mayaButtonWithIcon2 = (MayaButtonWithIcon) ViewBindings.findChildViewById(viewInflate, R.id.upload_qr_button);
                                                                    if (mayaButtonWithIcon2 != null) {
                                                                        i = R.id.view_scan_qr_header_default;
                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_scan_qr_header_default);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            C0441c c0441cB = C0441c.b(viewFindChildViewById2);
                                                                            i = R.id.view_scan_qr_header_qrph_banks;
                                                                            MayaCameraHeaderQRPH mayaCameraHeaderQRPH = (MayaCameraHeaderQRPH) ViewBindings.findChildViewById(viewInflate, R.id.view_scan_qr_header_qrph_banks);
                                                                            if (mayaCameraHeaderQRPH != null) {
                                                                                this.f13576U = new M0(constraintLayout, appCompatImageView, mayaButtonWithIcon, viewFindChildViewById, group, textView, mayaCameraSourcePreview, mayaQrScannerMaskView, appCompatTextView, textView2, mayaButtonWithIcon2, c0441cB, mayaCameraHeaderQRPH);
                                                                                j.f(constraintLayout, "getRoot(...)");
                                                                                return constraintLayout;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        v3.d dVar = this.f13593l0;
        if (dVar != null) {
            try {
                dVar.close();
            } catch (IOException unused) {
                yk.a.b();
            }
        }
        ((AbstractC2509a) H1()).i();
        d dVar2 = this.f13590i0;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f13576U = null;
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (t1().e().isQREventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.t(6));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            FragmentActivity activity = getActivity();
            j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity");
            c1219hE.j.put("source_page", ((MayaQRActivity) activity).getIntent().getStringExtra("source_page"));
            o1().c(getActivity(), c1219hE);
        }
        MayaCameraSourcePreview mayaCameraSourcePreview = this.f13577V;
        if (mayaCameraSourcePreview == null) {
            j.n("mCameraSourcePreview");
            throw null;
        }
        d dVar = mayaCameraSourcePreview.e;
        if (dVar != null) {
            dVar.g();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("attribution", n1().f10371a);
        A1(c1219hH);
        e eVar = this.f13591j0;
        if (eVar != null) {
            ((MayaQRActivity) eVar).Q(this);
        }
        Q1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((Ja.b) H1()).f = false;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        M0 m0 = this.f13576U;
        j.d(m0);
        this.f13577V = (MayaCameraSourcePreview) m0.j;
        M0 m02 = this.f13576U;
        j.d(m02);
        this.f13578W = (Group) m02.c;
        M0 m03 = this.f13576U;
        j.d(m03);
        this.f13579X = (MayaQrScannerMaskView) m03.f3770k;
        M0 m04 = this.f13576U;
        j.d(m04);
        this.f13580Y = (AppCompatImageView) m04.f3768d;
        M0 m05 = this.f13576U;
        j.d(m05);
        this.f13581Z = (TextView) m05.h;
        M0 m06 = this.f13576U;
        j.d(m06);
        this.f13582a0 = (TextView) m06.i;
        M0 m07 = this.f13576U;
        j.d(m07);
        C0441c c0441c = (C0441c) m07.m;
        this.f13583b0 = c0441c;
        this.f13584c0 = (AppCompatTextView) c0441c.c;
        M0 m08 = this.f13576U;
        j.d(m08);
        this.f13585d0 = (MayaCameraHeaderQRPH) m08.f3772n;
        M0 m09 = this.f13576U;
        j.d(m09);
        this.f13586e0 = (AppCompatTextView) m09.f3771l;
        M0 m010 = this.f13576U;
        j.d(m010);
        this.f13587f0 = (MayaButtonWithIcon) m010.f;
        M0 m011 = this.f13576U;
        j.d(m011);
        this.f13588g0 = (MayaButtonWithIcon) m011.e;
        M0 m012 = this.f13576U;
        j.d(m012);
        this.f13589h0 = ((MayaCameraHeaderQRPH) m012.f3772n).getMTextViewHeader();
        AppCompatImageView appCompatImageView = this.f13580Y;
        if (appCompatImageView == null) {
            j.n("mBackImageView");
            throw null;
        }
        final int i = 0;
        appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Na.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMLKitQRScannerFragment f4356b;

            {
                this.f4356b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaMLKitQRScannerFragment.f13590i0 != null) {
                                MayaCameraSourcePreview mayaCameraSourcePreview = mayaMLKitQRScannerFragment.f13577V;
                                if (mayaCameraSourcePreview == null) {
                                    kotlin.jvm.internal.j.n("mCameraSourcePreview");
                                    throw null;
                                }
                                Oa.d dVar = mayaCameraSourcePreview.e;
                                if (dVar != null) {
                                    dVar.g();
                                }
                            }
                            if (mayaMLKitQRScannerFragment.t1().e().isQREventsV2Enabled()) {
                                mayaMLKitQRScannerFragment.J1("Back");
                            }
                            mayaMLKitQRScannerFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    case 1:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (AbstractC1955a.v(mayaMLKitQRScannerFragment2.getActivity(), "android.permission.CAMERA")) {
                                mayaMLKitQRScannerFragment2.K1(R.string.maya_label_allow_permission_camera_title, R.string.maya_label_allow_permission_camera_description);
                            } else {
                                ((Ja.b) mayaMLKitQRScannerFragment2.H1()).r();
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment3 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaMLKitQRScannerFragment.I1(mayaMLKitQRScannerFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment4 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaMLKitQRScannerFragment4.t1().e().isQREventsV2Enabled()) {
                                String string2 = mayaMLKitQRScannerFragment4.getResources().getString(R.string.maya_label_show_my_qr);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                mayaMLKitQRScannerFragment4.J1(string2);
                            } else {
                                EnumC1217f enumC1217f = EnumC1217f.SHOW_QR;
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(enumC1217f);
                                mayaMLKitQRScannerFragment4.A1(c1219h);
                            }
                            e eVar = mayaMLKitQRScannerFragment4.f13591j0;
                            if (eVar != null) {
                                MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
                                mayaQRActivity.n1().K(mayaQRActivity);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f13581Z;
        if (textView == null) {
            j.n("mEnableCameraTextView");
            throw null;
        }
        final int i4 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Na.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMLKitQRScannerFragment f4356b;

            {
                this.f4356b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaMLKitQRScannerFragment.f13590i0 != null) {
                                MayaCameraSourcePreview mayaCameraSourcePreview = mayaMLKitQRScannerFragment.f13577V;
                                if (mayaCameraSourcePreview == null) {
                                    kotlin.jvm.internal.j.n("mCameraSourcePreview");
                                    throw null;
                                }
                                Oa.d dVar = mayaCameraSourcePreview.e;
                                if (dVar != null) {
                                    dVar.g();
                                }
                            }
                            if (mayaMLKitQRScannerFragment.t1().e().isQREventsV2Enabled()) {
                                mayaMLKitQRScannerFragment.J1("Back");
                            }
                            mayaMLKitQRScannerFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    case 1:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (AbstractC1955a.v(mayaMLKitQRScannerFragment2.getActivity(), "android.permission.CAMERA")) {
                                mayaMLKitQRScannerFragment2.K1(R.string.maya_label_allow_permission_camera_title, R.string.maya_label_allow_permission_camera_description);
                            } else {
                                ((Ja.b) mayaMLKitQRScannerFragment2.H1()).r();
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment3 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaMLKitQRScannerFragment.I1(mayaMLKitQRScannerFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment4 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaMLKitQRScannerFragment4.t1().e().isQREventsV2Enabled()) {
                                String string2 = mayaMLKitQRScannerFragment4.getResources().getString(R.string.maya_label_show_my_qr);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                mayaMLKitQRScannerFragment4.J1(string2);
                            } else {
                                EnumC1217f enumC1217f = EnumC1217f.SHOW_QR;
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(enumC1217f);
                                mayaMLKitQRScannerFragment4.A1(c1219h);
                            }
                            e eVar = mayaMLKitQRScannerFragment4.f13591j0;
                            if (eVar != null) {
                                MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
                                mayaQRActivity.n1().K(mayaQRActivity);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaButtonWithIcon mayaButtonWithIcon = this.f13587f0;
        if (mayaButtonWithIcon == null) {
            j.n("mUploadQrButton");
            throw null;
        }
        final int i6 = 2;
        mayaButtonWithIcon.setOnClickListener(new View.OnClickListener(this) { // from class: Na.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMLKitQRScannerFragment f4356b;

            {
                this.f4356b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaMLKitQRScannerFragment.f13590i0 != null) {
                                MayaCameraSourcePreview mayaCameraSourcePreview = mayaMLKitQRScannerFragment.f13577V;
                                if (mayaCameraSourcePreview == null) {
                                    kotlin.jvm.internal.j.n("mCameraSourcePreview");
                                    throw null;
                                }
                                Oa.d dVar = mayaCameraSourcePreview.e;
                                if (dVar != null) {
                                    dVar.g();
                                }
                            }
                            if (mayaMLKitQRScannerFragment.t1().e().isQREventsV2Enabled()) {
                                mayaMLKitQRScannerFragment.J1("Back");
                            }
                            mayaMLKitQRScannerFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    case 1:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (AbstractC1955a.v(mayaMLKitQRScannerFragment2.getActivity(), "android.permission.CAMERA")) {
                                mayaMLKitQRScannerFragment2.K1(R.string.maya_label_allow_permission_camera_title, R.string.maya_label_allow_permission_camera_description);
                            } else {
                                ((Ja.b) mayaMLKitQRScannerFragment2.H1()).r();
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment3 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaMLKitQRScannerFragment.I1(mayaMLKitQRScannerFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment4 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaMLKitQRScannerFragment4.t1().e().isQREventsV2Enabled()) {
                                String string2 = mayaMLKitQRScannerFragment4.getResources().getString(R.string.maya_label_show_my_qr);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                mayaMLKitQRScannerFragment4.J1(string2);
                            } else {
                                EnumC1217f enumC1217f = EnumC1217f.SHOW_QR;
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(enumC1217f);
                                mayaMLKitQRScannerFragment4.A1(c1219h);
                            }
                            e eVar = mayaMLKitQRScannerFragment4.f13591j0;
                            if (eVar != null) {
                                MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
                                mayaQRActivity.n1().K(mayaQRActivity);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaButtonWithIcon mayaButtonWithIcon2 = this.f13588g0;
        if (mayaButtonWithIcon2 == null) {
            j.n("mButtonShowMyQR");
            throw null;
        }
        final int i10 = 3;
        mayaButtonWithIcon2.setOnClickListener(new View.OnClickListener(this) { // from class: Na.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMLKitQRScannerFragment f4356b;

            {
                this.f4356b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaMLKitQRScannerFragment.f13590i0 != null) {
                                MayaCameraSourcePreview mayaCameraSourcePreview = mayaMLKitQRScannerFragment.f13577V;
                                if (mayaCameraSourcePreview == null) {
                                    kotlin.jvm.internal.j.n("mCameraSourcePreview");
                                    throw null;
                                }
                                Oa.d dVar = mayaCameraSourcePreview.e;
                                if (dVar != null) {
                                    dVar.g();
                                }
                            }
                            if (mayaMLKitQRScannerFragment.t1().e().isQREventsV2Enabled()) {
                                mayaMLKitQRScannerFragment.J1("Back");
                            }
                            mayaMLKitQRScannerFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    case 1:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (AbstractC1955a.v(mayaMLKitQRScannerFragment2.getActivity(), "android.permission.CAMERA")) {
                                mayaMLKitQRScannerFragment2.K1(R.string.maya_label_allow_permission_camera_title, R.string.maya_label_allow_permission_camera_description);
                            } else {
                                ((Ja.b) mayaMLKitQRScannerFragment2.H1()).r();
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment3 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaMLKitQRScannerFragment.I1(mayaMLKitQRScannerFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment4 = this.f4356b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaMLKitQRScannerFragment4.t1().e().isQREventsV2Enabled()) {
                                String string2 = mayaMLKitQRScannerFragment4.getResources().getString(R.string.maya_label_show_my_qr);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                mayaMLKitQRScannerFragment4.J1(string2);
                            } else {
                                EnumC1217f enumC1217f = EnumC1217f.SHOW_QR;
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(enumC1217f);
                                mayaMLKitQRScannerFragment4.A1(c1219h);
                            }
                            e eVar = mayaMLKitQRScannerFragment4.f13591j0;
                            if (eVar != null) {
                                MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
                                mayaQRActivity.n1().K(mayaQRActivity);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        if (this.f13590i0 == null) {
            d dVar = new d(getActivity(), 0);
            this.f13590i0 = dVar;
            synchronized (dVar) {
            }
        }
        d dVar2 = this.f13590i0;
        if (dVar2 != null) {
            requireContext();
            dVar2.f(new Lh.c(this));
        }
        ((Ja.b) H1()).j();
        this.f13592k0 = new b(new int[]{1}[0] | 256);
        AppCompatImageView appCompatImageView2 = this.f13580Y;
        if (appCompatImageView2 == null) {
            j.n("mBackImageView");
            throw null;
        }
        MayaBaseFragment.l1(appCompatImageView2);
        TextViewWithImagesKt textViewWithImagesKt = this.f13589h0;
        if (textViewWithImagesKt == null) {
            j.n("mTextViewHeaderScanQRPHCode");
            throw null;
        }
        e eVar = this.f13591j0;
        if (eVar != null) {
            MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
            string = mayaQRActivity.getIntent().getStringExtra("qr_scanner_header_title");
            if (string == null) {
                string = mayaQRActivity.getString(R.string.maya_label_qrph_code);
                j.f(string, "getString(...)");
            }
        } else {
            string = getString(R.string.maya_label_qrph_code);
            j.f(string, "getString(...)");
        }
        textViewWithImagesKt.setText(string);
        MayaButtonWithIcon mayaButtonWithIcon3 = this.f13588g0;
        if (mayaButtonWithIcon3 == null) {
            j.n("mButtonShowMyQR");
            throw null;
        }
        e eVar2 = this.f13591j0;
        mayaButtonWithIcon3.setVisibility((eVar2 == null || !((MayaQRActivity) eVar2).getIntent().getBooleanExtra("is_show_qr_button_visible", true)) ? 8 : 0);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.SCAN;
    }
}
