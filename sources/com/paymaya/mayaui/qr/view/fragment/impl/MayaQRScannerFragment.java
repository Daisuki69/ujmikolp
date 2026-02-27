package com.paymaya.mayaui.qr.view.fragment.impl;

import A7.j;
import Ah.h;
import E1.c;
import Eh.d;
import G6.w;
import Gh.f;
import Kh.B;
import Ma.b;
import N5.C0441c;
import N5.E;
import Na.i;
import Na.k;
import Oa.g;
import Yj.a;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
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
import com.google.zxing.NotFoundException;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.V;
import com.paymaya.common.utility.Z;
import com.paymaya.common.widget.MayaButtonWithIcon;
import com.paymaya.common.widget.TextViewWithImagesKt;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import com.paymaya.mayaui.qr.view.widget.MayaCameraHeaderQRPH;
import d2.C1328c;
import o1.AbstractC1955a;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaQRScannerFragment extends MayaBaseFragment implements b, a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public E f13594U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Group f13595V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public AppCompatImageView f13596W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13597X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f13598Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0441c f13599Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AppCompatTextView f13600a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public MayaCameraHeaderQRPH f13601b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public AppCompatTextView f13602c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public MayaButtonWithIcon f13603d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public MayaButtonWithIcon f13604e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public FrameLayout f13605f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TextViewWithImagesKt f13606g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public j f13607h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Yj.b f13608i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public g f13609j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public i f13610k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f13611l0;
    public boolean m0;

    public static final void H1(MayaQRScannerFragment mayaQRScannerFragment) {
        if (mayaQRScannerFragment.t1().e().isQREventsV2Enabled()) {
            String string = mayaQRScannerFragment.getResources().getString(R.string.maya_label_upload_qr);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            mayaQRScannerFragment.I1(string);
        } else {
            EnumC1217f enumC1217f = ((com.paymaya.data.preference.a) mayaQRScannerFragment.G1().e).e().isQRScreensUpdateEnabled() ? EnumC1217f.UPLOAD_QR : EnumC1217f.GALLERY;
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(enumC1217f);
            mayaQRScannerFragment.A1(c1219h);
        }
        j jVarG1 = mayaQRScannerFragment.G1();
        MayaQRScannerFragment mayaQRScannerFragment2 = (MayaQRScannerFragment) ((b) jVarG1.c.get());
        mayaQRScannerFragment2.getClass();
        B bE = (Build.VERSION.SDK_INT < 33 ? c.r(new Ze.c(mayaQRScannerFragment2).c("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) : h.d(new Ze.a("android.permission.READ_MEDIA_IMAGES", true, false))).e(zh.b.a());
        f fVar = new f(new w(jVarG1, 4), d.f1366d);
        bE.g(fVar);
        jVarG1.e(fVar);
    }

    public final j G1() {
        j jVar = this.f13607h0;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mIQRScannerFragmentPresenter");
        throw null;
    }

    public final void I1(String str) {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.n(1));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("button", str);
        c1220iO1.c(activity, c1219hE);
    }

    public final void J1(int i, int i4) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        View viewInflate = requireActivity().getLayoutInflater().inflate(R.layout.pma_dialog_fragment_allow_camera_permission, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        kotlin.jvm.internal.j.f(alertDialogCreate, "create(...)");
        alertDialogCreate.setCanceledOnTouchOutside(false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text_view_camera_permission_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.text_view_camera_permission_description);
        Button button = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_not_now_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.pma_dialog_fragment_allow_camera_permission_open_settings_button);
        textView.setText(i);
        textView2.setText(i4);
        button.setOnClickListener(new Na.a(alertDialogCreate, 1));
        button2.setOnClickListener(new Ad.a(22, alertDialogCreate, this));
        alertDialogCreate.show();
    }

    public final void K1() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(requireContext().getPackageManager()) != null) {
            startActivityForResult(Intent.createChooser(intent, getString(R.string.pma_label_import_qr_from_gallery)), 300);
        }
    }

    public final void L1(Integer num) {
        i iVar = this.f13610k0;
        if (iVar != null) {
            String string = getString(R.string.maya_label_upload_qr_error);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            String string2 = getString(num != null ? num.intValue() : R.string.maya_label_upload_qr_error_content);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            ((MayaQRActivity) iVar).b2(string, string2, new w(this, 21));
        }
    }

    public final void M1() {
        this.f13608i0 = new Na.j(this, getActivity());
        g gVar = this.f13609j0;
        if (gVar != null) {
            gVar.setLaserEnabled(true);
        }
        g gVar2 = this.f13609j0;
        if (gVar2 != null) {
            gVar2.setLaserColor(0);
        }
        Group group = this.f13595V;
        if (group == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupDeniedPermission");
            throw null;
        }
        group.setVisibility(8);
        MayaButtonWithIcon mayaButtonWithIcon = this.f13603d0;
        if (mayaButtonWithIcon == null) {
            kotlin.jvm.internal.j.n("mUploadQrButton");
            throw null;
        }
        mayaButtonWithIcon.setVisibility(0);
        FrameLayout frameLayout = this.f13605f0;
        if (frameLayout == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutScannerContainer");
            throw null;
        }
        frameLayout.addView(this.f13608i0);
        Yj.b bVar = this.f13608i0;
        kotlin.jvm.internal.j.e(bVar, "null cannot be cast to non-null type me.dm7.barcodescanner.zxing.ZXingScannerView");
        bVar.setResultHandler(this);
        if (this.f13611l0) {
            return;
        }
        Yj.b bVar2 = this.f13608i0;
        if (bVar2 != null) {
            bVar2.b();
        }
        this.f13611l0 = true;
    }

    public final void N1() {
        this.f13608i0 = new k(this, getActivity());
        g gVar = this.f13609j0;
        if (gVar != null) {
            gVar.setLaserEnabled(true);
        }
        g gVar2 = this.f13609j0;
        if (gVar2 != null) {
            gVar2.setLaserColor(0);
        }
        Group group = this.f13595V;
        if (group == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupDeniedPermission");
            throw null;
        }
        group.setVisibility(8);
        TextView textView = this.f13598Y;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewToolbar");
            throw null;
        }
        textView.setVisibility(8);
        MayaButtonWithIcon mayaButtonWithIcon = this.f13603d0;
        if (mayaButtonWithIcon == null) {
            kotlin.jvm.internal.j.n("mUploadQrButton");
            throw null;
        }
        mayaButtonWithIcon.setVisibility(0);
        FrameLayout frameLayout = this.f13605f0;
        if (frameLayout == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutScannerContainer");
            throw null;
        }
        frameLayout.addView(this.f13608i0);
        Yj.b bVar = this.f13608i0;
        kotlin.jvm.internal.j.e(bVar, "null cannot be cast to non-null type me.dm7.barcodescanner.zxing.ZXingScannerView");
        bVar.setResultHandler(this);
        if (this.f13611l0) {
            return;
        }
        Yj.b bVar2 = this.f13608i0;
        if (bVar2 != null) {
            bVar2.b();
        }
        this.f13611l0 = true;
    }

    public final void O1() {
        Yj.b bVar = this.f13608i0;
        if (bVar != null) {
            bVar.c();
        }
        this.f13611l0 = false;
    }

    public final void P1() {
        Object systemService = requireActivity().getSystemService("vibrator");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
    }

    @Override // Yj.a
    public final void V0(C3.j jVar) {
        V[] allowedQRPHCodeTypes;
        j jVarG1 = G1();
        i iVar = this.f13610k0;
        if (iVar == null || (allowedQRPHCodeTypes = ((MayaQRActivity) iVar).V1()) == null) {
            allowedQRPHCodeTypes = V.values();
        }
        kotlin.jvm.internal.j.g(allowedQRPHCodeTypes, "allowedQRPHCodeTypes");
        jVarG1.v(jVar, 0, allowedQRPHCodeTypes);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        V[] allowedQRPHCodeTypes;
        super.onActivityResult(i, i4, intent);
        if (i == 2 && AbstractC1955a.u(getContext(), "android.permission.CAMERA")) {
            j jVarG1 = G1();
            if (((com.paymaya.data.preference.a) jVarG1.e).e().isQRScreensUpdateEnabled()) {
                ((MayaQRScannerFragment) ((b) jVarG1.c.get())).N1();
                return;
            } else {
                ((MayaQRScannerFragment) ((b) jVarG1.c.get())).M1();
                return;
            }
        }
        if (i == 300 && i4 == -1 && intent != null) {
            Uri data = intent.getData();
            try {
                ContentResolver contentResolver = requireContext().getContentResolver();
                kotlin.jvm.internal.j.d(data);
                C3.j jVarM = Z.m(BitmapFactory.decodeStream(contentResolver.openInputStream(data)));
                j jVarG12 = G1();
                i iVar = this.f13610k0;
                if (iVar == null || (allowedQRPHCodeTypes = ((MayaQRActivity) iVar).V1()) == null) {
                    allowedQRPHCodeTypes = V.values();
                }
                kotlin.jvm.internal.j.g(allowedQRPHCodeTypes, "allowedQRPHCodeTypes");
                jVarG12.v(jVarM, 1, allowedQRPHCodeTypes);
            } catch (NotFoundException unused) {
                yk.a.b();
                G1().t();
            } catch (Exception e) {
                G1().t();
                C1328c.a().b(e);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f13610k0 = (i) getActivity();
        O5.a aVar = W4.a.e().v().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f13607h0 = new j((com.paymaya.data.preference.a) aVar.e.get(), aVar.B());
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_qr_scanner, viewGroup, false);
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
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.deny_permission_background_view;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.deny_permission_background_view);
                        if (viewFindChildViewById != null) {
                            i = R.id.deny_permission_constraint_group;
                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.deny_permission_constraint_group);
                            if (group != null) {
                                i = R.id.enable_camera_text_view;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.enable_camera_text_view);
                                if (textView != null) {
                                    i = R.id.guide_line_border_scan_bottom;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line_border_scan_bottom)) != null) {
                                        i = R.id.guide_line_border_scan_top;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line_border_scan_top)) != null) {
                                            i = R.id.guideline_center_constraint;
                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_center_constraint)) != null) {
                                                i = R.id.qr_scanner_frame_layout;
                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.qr_scanner_frame_layout);
                                                if (frameLayout != null) {
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
                                                                            this.f13594U = new E(constraintLayout, appCompatImageView, mayaButtonWithIcon, viewFindChildViewById, group, textView, frameLayout, appCompatTextView, textView2, mayaButtonWithIcon2, c0441cB, mayaCameraHeaderQRPH);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        this.f13594U = null;
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.f13608i0 != null) {
            O1();
        }
        super.onPause();
        if (!t1().e().isQREventsV2Enabled() || this.m0) {
            return;
        }
        C1219h c1219hE = C1219h.e(AbstractC1213b.t(6));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        FragmentActivity activity = getActivity();
        kotlin.jvm.internal.j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity");
        c1219hE.j.put("source_page", ((MayaQRActivity) activity).getIntent().getStringExtra("source_page"));
        o1().c(getActivity(), c1219hE);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        i iVar = this.f13610k0;
        if (iVar != null) {
            ((MayaQRActivity) iVar).Q(this);
        }
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("attribution", n1().f10371a);
        A1(c1219hH);
        Yj.b bVar = this.f13608i0;
        if (bVar != null) {
            bVar.setResultHandler(this);
            if (this.f13611l0) {
                return;
            }
            Yj.b bVar2 = this.f13608i0;
            if (bVar2 != null) {
                bVar2.b();
            }
            this.f13611l0 = true;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        E e = this.f13594U;
        kotlin.jvm.internal.j.d(e);
        this.f13596W = (AppCompatImageView) e.e;
        E e7 = this.f13594U;
        kotlin.jvm.internal.j.d(e7);
        this.f13597X = (TextView) e7.f;
        E e10 = this.f13594U;
        kotlin.jvm.internal.j.d(e10);
        this.f13598Y = (TextView) e10.f3588g;
        E e11 = this.f13594U;
        kotlin.jvm.internal.j.d(e11);
        C0441c c0441c = (C0441c) e11.f3586b;
        this.f13599Z = c0441c;
        this.f13600a0 = (AppCompatTextView) c0441c.c;
        E e12 = this.f13594U;
        kotlin.jvm.internal.j.d(e12);
        this.f13601b0 = (MayaCameraHeaderQRPH) e12.m;
        E e13 = this.f13594U;
        kotlin.jvm.internal.j.d(e13);
        this.f13602c0 = (AppCompatTextView) e13.j;
        E e14 = this.f13594U;
        kotlin.jvm.internal.j.d(e14);
        this.f13606g0 = ((MayaCameraHeaderQRPH) e14.m).getMTextViewHeader();
        E e15 = this.f13594U;
        kotlin.jvm.internal.j.d(e15);
        this.f13603d0 = (MayaButtonWithIcon) e15.f3589k;
        E e16 = this.f13594U;
        kotlin.jvm.internal.j.d(e16);
        this.f13604e0 = (MayaButtonWithIcon) e16.h;
        E e17 = this.f13594U;
        kotlin.jvm.internal.j.d(e17);
        this.f13605f0 = (FrameLayout) e17.f3587d;
        E e18 = this.f13594U;
        kotlin.jvm.internal.j.d(e18);
        this.f13595V = (Group) e18.f3590l;
        AppCompatImageView appCompatImageView = this.f13596W;
        if (appCompatImageView == null) {
            kotlin.jvm.internal.j.n("mBackImageView");
            throw null;
        }
        final int i = 0;
        appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Na.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaQRScannerFragment f4360b;

            {
                this.f4360b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaQRScannerFragment mayaQRScannerFragment = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaQRScannerFragment.m0 = true;
                            if (mayaQRScannerFragment.f13608i0 != null) {
                                mayaQRScannerFragment.O1();
                            }
                            if (mayaQRScannerFragment.t1().e().isQREventsV2Enabled()) {
                                mayaQRScannerFragment.I1("Back");
                            }
                            mayaQRScannerFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    case 1:
                        MayaQRScannerFragment mayaQRScannerFragment2 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            if (AbstractC1955a.v(mayaQRScannerFragment2.getActivity(), "android.permission.CAMERA")) {
                                mayaQRScannerFragment2.J1(R.string.maya_label_allow_permission_camera_title, R.string.maya_label_allow_permission_camera_description);
                            } else {
                                mayaQRScannerFragment2.G1().B();
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaQRScannerFragment mayaQRScannerFragment3 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaQRScannerFragment.H1(mayaQRScannerFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaQRScannerFragment mayaQRScannerFragment4 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaQRScannerFragment4.t1().e().isQREventsV2Enabled()) {
                                String string2 = mayaQRScannerFragment4.getResources().getString(R.string.maya_label_show_my_qr);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                mayaQRScannerFragment4.I1(string2);
                            } else {
                                EnumC1217f enumC1217f = EnumC1217f.SHOW_QR;
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(enumC1217f);
                                mayaQRScannerFragment4.A1(c1219h);
                            }
                            i iVar = mayaQRScannerFragment4.f13610k0;
                            if (iVar != null) {
                                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                                mayaQRActivity.n1().K(mayaQRActivity);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f13597X;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mEnableCameraTextView");
            throw null;
        }
        final int i4 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Na.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaQRScannerFragment f4360b;

            {
                this.f4360b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaQRScannerFragment mayaQRScannerFragment = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaQRScannerFragment.m0 = true;
                            if (mayaQRScannerFragment.f13608i0 != null) {
                                mayaQRScannerFragment.O1();
                            }
                            if (mayaQRScannerFragment.t1().e().isQREventsV2Enabled()) {
                                mayaQRScannerFragment.I1("Back");
                            }
                            mayaQRScannerFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    case 1:
                        MayaQRScannerFragment mayaQRScannerFragment2 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            if (AbstractC1955a.v(mayaQRScannerFragment2.getActivity(), "android.permission.CAMERA")) {
                                mayaQRScannerFragment2.J1(R.string.maya_label_allow_permission_camera_title, R.string.maya_label_allow_permission_camera_description);
                            } else {
                                mayaQRScannerFragment2.G1().B();
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaQRScannerFragment mayaQRScannerFragment3 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaQRScannerFragment.H1(mayaQRScannerFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaQRScannerFragment mayaQRScannerFragment4 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaQRScannerFragment4.t1().e().isQREventsV2Enabled()) {
                                String string2 = mayaQRScannerFragment4.getResources().getString(R.string.maya_label_show_my_qr);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                mayaQRScannerFragment4.I1(string2);
                            } else {
                                EnumC1217f enumC1217f = EnumC1217f.SHOW_QR;
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(enumC1217f);
                                mayaQRScannerFragment4.A1(c1219h);
                            }
                            i iVar = mayaQRScannerFragment4.f13610k0;
                            if (iVar != null) {
                                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                                mayaQRActivity.n1().K(mayaQRActivity);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaButtonWithIcon mayaButtonWithIcon = this.f13603d0;
        if (mayaButtonWithIcon == null) {
            kotlin.jvm.internal.j.n("mUploadQrButton");
            throw null;
        }
        final int i6 = 2;
        mayaButtonWithIcon.setOnClickListener(new View.OnClickListener(this) { // from class: Na.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaQRScannerFragment f4360b;

            {
                this.f4360b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaQRScannerFragment mayaQRScannerFragment = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaQRScannerFragment.m0 = true;
                            if (mayaQRScannerFragment.f13608i0 != null) {
                                mayaQRScannerFragment.O1();
                            }
                            if (mayaQRScannerFragment.t1().e().isQREventsV2Enabled()) {
                                mayaQRScannerFragment.I1("Back");
                            }
                            mayaQRScannerFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    case 1:
                        MayaQRScannerFragment mayaQRScannerFragment2 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            if (AbstractC1955a.v(mayaQRScannerFragment2.getActivity(), "android.permission.CAMERA")) {
                                mayaQRScannerFragment2.J1(R.string.maya_label_allow_permission_camera_title, R.string.maya_label_allow_permission_camera_description);
                            } else {
                                mayaQRScannerFragment2.G1().B();
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaQRScannerFragment mayaQRScannerFragment3 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaQRScannerFragment.H1(mayaQRScannerFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaQRScannerFragment mayaQRScannerFragment4 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaQRScannerFragment4.t1().e().isQREventsV2Enabled()) {
                                String string2 = mayaQRScannerFragment4.getResources().getString(R.string.maya_label_show_my_qr);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                mayaQRScannerFragment4.I1(string2);
                            } else {
                                EnumC1217f enumC1217f = EnumC1217f.SHOW_QR;
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(enumC1217f);
                                mayaQRScannerFragment4.A1(c1219h);
                            }
                            i iVar = mayaQRScannerFragment4.f13610k0;
                            if (iVar != null) {
                                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                                mayaQRActivity.n1().K(mayaQRActivity);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaButtonWithIcon mayaButtonWithIcon2 = this.f13604e0;
        if (mayaButtonWithIcon2 == null) {
            kotlin.jvm.internal.j.n("mButtonShowMyQR");
            throw null;
        }
        final int i10 = 3;
        mayaButtonWithIcon2.setOnClickListener(new View.OnClickListener(this) { // from class: Na.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaQRScannerFragment f4360b;

            {
                this.f4360b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaQRScannerFragment mayaQRScannerFragment = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaQRScannerFragment.m0 = true;
                            if (mayaQRScannerFragment.f13608i0 != null) {
                                mayaQRScannerFragment.O1();
                            }
                            if (mayaQRScannerFragment.t1().e().isQREventsV2Enabled()) {
                                mayaQRScannerFragment.I1("Back");
                            }
                            mayaQRScannerFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    case 1:
                        MayaQRScannerFragment mayaQRScannerFragment2 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            if (AbstractC1955a.v(mayaQRScannerFragment2.getActivity(), "android.permission.CAMERA")) {
                                mayaQRScannerFragment2.J1(R.string.maya_label_allow_permission_camera_title, R.string.maya_label_allow_permission_camera_description);
                            } else {
                                mayaQRScannerFragment2.G1().B();
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        MayaQRScannerFragment mayaQRScannerFragment3 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaQRScannerFragment.H1(mayaQRScannerFragment3);
                            return;
                        } finally {
                        }
                    default:
                        MayaQRScannerFragment mayaQRScannerFragment4 = this.f4360b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaQRScannerFragment4.t1().e().isQREventsV2Enabled()) {
                                String string2 = mayaQRScannerFragment4.getResources().getString(R.string.maya_label_show_my_qr);
                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                mayaQRScannerFragment4.I1(string2);
                            } else {
                                EnumC1217f enumC1217f = EnumC1217f.SHOW_QR;
                                C1219h c1219h = new C1219h();
                                c1219h.n(17);
                                c1219h.t(enumC1217f);
                                mayaQRScannerFragment4.A1(c1219h);
                            }
                            i iVar = mayaQRScannerFragment4.f13610k0;
                            if (iVar != null) {
                                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                                mayaQRActivity.n1().K(mayaQRActivity);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        G1().j();
        AppCompatImageView appCompatImageView2 = this.f13596W;
        if (appCompatImageView2 == null) {
            kotlin.jvm.internal.j.n("mBackImageView");
            throw null;
        }
        MayaBaseFragment.l1(appCompatImageView2);
        TextViewWithImagesKt textViewWithImagesKt = this.f13606g0;
        if (textViewWithImagesKt == null) {
            kotlin.jvm.internal.j.n("mTextViewHeaderScanQRPHCode");
            throw null;
        }
        i iVar = this.f13610k0;
        if (iVar != null) {
            MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
            string = mayaQRActivity.getIntent().getStringExtra("qr_scanner_header_title");
            if (string == null) {
                string = mayaQRActivity.getString(R.string.maya_label_qrph_code);
                kotlin.jvm.internal.j.f(string, "getString(...)");
            }
        } else {
            string = getString(R.string.maya_label_qrph_code);
            kotlin.jvm.internal.j.f(string, "getString(...)");
        }
        textViewWithImagesKt.setText(string);
        MayaButtonWithIcon mayaButtonWithIcon3 = this.f13604e0;
        if (mayaButtonWithIcon3 == null) {
            kotlin.jvm.internal.j.n("mButtonShowMyQR");
            throw null;
        }
        i iVar2 = this.f13610k0;
        mayaButtonWithIcon3.setVisibility((iVar2 == null || !((MayaQRActivity) iVar2).getIntent().getBooleanExtra("is_show_qr_button_visible", true)) ? 8 : 0);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.SCAN;
    }
}
