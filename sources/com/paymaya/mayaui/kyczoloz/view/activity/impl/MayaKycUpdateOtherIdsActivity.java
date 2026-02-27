package com.paymaya.mayaui.kyczoloz.view.activity.impl;

import Ae.a;
import Ag.k;
import B5.i;
import D.C0187u;
import H8.c;
import N5.C0450f;
import N5.C0491z;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaKycUpdateOtherIdsActivity extends q implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f12458p = 0;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0450f f12459n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1219h f12460o;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = new a(19);
        super.onCreate(bundle);
        C1219h c1219hD = C1219h.d(EnumC1215d.EKYC_V6);
        c1219hD.r(EnumC1216e.REKYC_OTHER_ID);
        c1219hD.n(7);
        this.f12460o = c1219hD;
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_kyc_update_other_ids, (ViewGroup) null, false);
        int i = R.id.button_got_it;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_got_it);
        if (button != null) {
            i = R.id.constraint_layout_other_ids_sub_heading_1;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_other_ids_sub_heading_1)) != null) {
                i = R.id.constraint_layout_other_ids_sub_heading_2;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_other_ids_sub_heading_2)) != null) {
                    i = R.id.image_view_other_id_info;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_other_id_info)) != null) {
                        i = R.id.maya_kyc_toolbar_layout;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_toolbar_layout);
                        if (viewFindChildViewById != null) {
                            C0491z c0491zA = C0491z.a(viewFindChildViewById);
                            int i4 = R.id.text_view_header;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                i4 = R.id.text_view_other_ids_any_two_label;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_any_two_label)) != null) {
                                    i4 = R.id.text_view_other_ids_any_two_list;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_any_two_list)) != null) {
                                        i4 = R.id.text_view_other_ids_count_1;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_count_1)) != null) {
                                            i4 = R.id.text_view_other_ids_count_2;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_count_2)) != null) {
                                                i4 = R.id.text_view_other_ids_email_include_in_email_label;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_email_include_in_email_label)) != null) {
                                                    i4 = R.id.text_view_other_ids_email_your_id_label;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_email_your_id_label)) != null) {
                                                        i4 = R.id.text_view_other_ids_following_label;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_following_label)) != null) {
                                                            i4 = R.id.text_view_other_ids_following_list;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_following_list)) != null) {
                                                                i4 = R.id.text_view_other_ids_include_email_list;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_include_email_list)) != null) {
                                                                    i4 = R.id.text_view_other_ids_sub_heading_1;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_sub_heading_1)) != null) {
                                                                        i4 = R.id.text_view_other_ids_sub_heading_2;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_other_ids_sub_heading_2)) != null) {
                                                                            i4 = R.id.text_view_select_other_id_documents_message;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_select_other_id_documents_message)) != null) {
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                this.f12459n = new C0450f(constraintLayout, button, c0491zA, 1);
                                                                                setContentView(constraintLayout);
                                                                                C0450f c0450f = this.f12459n;
                                                                                j.d(c0450f);
                                                                                Q1((C0491z) c0450f.f4088d);
                                                                                a aVar2 = this.m;
                                                                                String strTnTj78 = numX49.tnTj78("bjVP");
                                                                                if (aVar2 == null) {
                                                                                    j.n(strTnTj78);
                                                                                    throw null;
                                                                                }
                                                                                aVar2.h(this);
                                                                                a aVar3 = this.m;
                                                                                if (aVar3 == null) {
                                                                                    j.n(strTnTj78);
                                                                                    throw null;
                                                                                }
                                                                                aVar3.j();
                                                                                C0450f c0450f2 = this.f12459n;
                                                                                j.d(c0450f2);
                                                                                ((Toolbar) ((C0491z) c0450f2.f4088d).e).setNavigationOnClickListener(new Ba.a(this, 15));
                                                                                C0450f c0450f3 = this.f12459n;
                                                                                j.d(c0450f3);
                                                                                C.r0((Button) c0450f3.f4087b, new k(this, 22));
                                                                                return;
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
                            i = i4;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjVb").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        a aVar = this.m;
        if (aVar == null) {
            j.n(numX49.tnTj78("bjV2"));
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
        k1();
        C1219h c1219h = this.f12460o;
        if (c1219h != null) {
            c1219h.f11205g = System.nanoTime();
        } else {
            j.n(numX49.tnTj78("bjVL"));
            throw null;
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
        C1220i c1220iK1 = k1();
        C1219h c1219h = this.f12460o;
        if (c1219h != null) {
            c1220iK1.d(this, c1219h);
        } else {
            j.n(numX49.tnTj78("bjVr"));
            throw null;
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        n1().u0(this);
    }
}
