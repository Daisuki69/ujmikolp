package com.paymaya.mayaui.common.view.activity.impl;

import Bb.f;
import D.C0187u;
import J5.b;
import Lh.c;
import N5.C0450f;
import S6.h;
import W4.a;
import Xh.i;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.common.view.activity.impl.MayaSupportWebActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import d7.C1335b;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaSupportWebActivity extends MayaWebActivity implements h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f11798y = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0450f f11799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f11800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Group f11801t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ConstraintLayout f11802u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AppCompatTextView f11803v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageButton f11804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageButton f11805x;

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity
    public final C1335b V1() {
        int i = C1335b.f16288b;
        C0450f c0450f = this.f11799r;
        j.d(c0450f);
        return i.x((CoordinatorLayout) c0450f.f4088d);
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity
    public final void W1() {
        g2().i();
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity
    public final Drawable X1() {
        return ContextCompat.getDrawable(this, 2131231657);
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity
    public final void Y1() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            boolean z4 = extras.getBoolean(numX49.tnTj78("btAPB"), false);
            String string = extras.getString(numX49.tnTj78("btAPu"), numX49.tnTj78("btAPV"));
            f fVarG2 = g2();
            j.d(string);
            if (z4) {
                return;
            }
            if (string.equals(numX49.tnTj78("btAPS"))) {
                ((MayaSupportWebActivity) ((h) fVarG2.c.get())).h2(numX49.tnTj78("btAPj"));
            } else if (string.equals(numX49.tnTj78("btAPd"))) {
                ((MayaSupportWebActivity) ((h) fVarG2.c.get())).h2(numX49.tnTj78("btAPi"));
            }
        }
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity
    public final void Z1() {
        M1(R.color.light_light);
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity
    public final void a2() {
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_web_support, (ViewGroup) null, false);
        int i = R.id.barrier_toolbar;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_toolbar);
        String strTnTj78 = numX49.tnTj78("btAPE");
        if (barrier != null) {
            i = R.id.container_maya_activity_web;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_maya_activity_web);
            if (frameLayout != null) {
                i = R.id.coordinator_layout;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(viewInflate, R.id.coordinator_layout);
                if (coordinatorLayout != null) {
                    this.f11799r = new C0450f((ViewGroup) viewInflate, (Object) frameLayout, (Object) coordinatorLayout, 2);
                    M1(R.color.light_light);
                    C0450f c0450f = this.f11799r;
                    j.d(c0450f);
                    setContentView((ConstraintLayout) c0450f.c);
                    C0450f c0450f2 = this.f11799r;
                    j.d(c0450f2);
                    ConstraintLayout constraintLayout = (ConstraintLayout) c0450f2.c;
                    int i4 = R.id.group_help_center_header;
                    Group group = (Group) ViewBindings.findChildViewById(constraintLayout, R.id.group_help_center_header);
                    if (group != null) {
                        i4 = R.id.help_center_text_view;
                        if (((AppCompatTextView) ViewBindings.findChildViewById(constraintLayout, R.id.help_center_text_view)) != null) {
                            i4 = R.id.image_view_close;
                            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(constraintLayout, R.id.image_view_close);
                            if (imageButton != null) {
                                i4 = R.id.image_view_history;
                                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(constraintLayout, R.id.image_view_history);
                                if (imageButton2 != null) {
                                    i4 = R.id.resume_button;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(constraintLayout, R.id.resume_button);
                                    if (viewFindChildViewById != null) {
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindChildViewById;
                                        int i6 = R.id.text_resume;
                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_resume)) != null) {
                                            i6 = R.id.text_view_inbox_flutter_count;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_inbox_flutter_count);
                                            if (appCompatTextView != null) {
                                                if (ViewBindings.findChildViewById(constraintLayout, R.id.view_help_center_header) != null) {
                                                    this.f11801t = group;
                                                    this.f11805x = imageButton;
                                                    this.f11804w = imageButton2;
                                                    this.f11802u = constraintLayout2;
                                                    this.f11803v = appCompatTextView;
                                                    return;
                                                }
                                                i4 = R.id.view_help_center_header;
                                            }
                                        }
                                        throw new NullPointerException(strTnTj78.concat(viewFindChildViewById.getResources().getResourceName(i6)));
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException(strTnTj78.concat(constraintLayout.getResources().getResourceName(i4)));
                }
            }
        }
        throw new NullPointerException(strTnTj78.concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity
    public final void b2() {
        c cVarA = a.e().a();
        O5.a aVar = (O5.a) cVarA.c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (B5.i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f11807n = new Bb.a((com.paymaya.data.preference.a) ((O5.a) cVarA.c).e.get(), 13);
        this.f11800s = new f((b) aVar.f4744v0.get());
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity
    public final void c2() {
        g2().h(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString(numX49.tnTj78("btAPF"));
            extras.getString(numX49.tnTj78("btAPH"));
            extras.getBoolean(numX49.tnTj78("btAPO"), false);
            extras.getBoolean(numX49.tnTj78("btAPQ"), false);
            f fVarG2 = g2();
            fVarG2.j();
            ((MayaWebActivity) ((h) fVarG2.c.get())).e2(string);
            Group group = ((MayaSupportWebActivity) ((h) fVarG2.c.get())).f11801t;
            if (group == null) {
                j.n(numX49.tnTj78("btAPC"));
                throw null;
            }
            group.setVisibility(0);
            final MayaSupportWebActivity mayaSupportWebActivity = (MayaSupportWebActivity) ((h) fVarG2.c.get());
            ImageButton imageButton = mayaSupportWebActivity.f11805x;
            if (imageButton == null) {
                j.n(numX49.tnTj78("btAP8"));
                throw null;
            }
            final int i = 0;
            Ke.b.b(imageButton, new Function0(mayaSupportWebActivity) { // from class: T6.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaSupportWebActivity f5811b;

                {
                    this.f5811b = mayaSupportWebActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            int i4 = MayaSupportWebActivity.f11798y;
                            MayaSupportWebActivity mayaSupportWebActivity2 = this.f5811b;
                            mayaSupportWebActivity2.setResult(1001);
                            mayaSupportWebActivity2.finish();
                            break;
                        case 1:
                            int i6 = MayaSupportWebActivity.f11798y;
                            MayaSupportWebActivity mayaSupportWebActivity3 = this.f5811b;
                            mayaSupportWebActivity3.n1();
                            B5.i.k(mayaSupportWebActivity3, "paymaya://chatwithus");
                            break;
                        default:
                            MayaSupportWebActivity mayaSupportWebActivity4 = this.f5811b;
                            int i10 = MayaSupportWebActivity.f11798y;
                            Bb.f fVarG22 = mayaSupportWebActivity4.g2();
                            String strD = C.d("paymaya://chatwithus", "route", "history");
                            if (strD != null) {
                                MayaWebActivity mayaWebActivity = (MayaWebActivity) ((h) fVarG22.c.get());
                                mayaWebActivity.n1();
                                B5.i.k(mayaWebActivity, strD);
                            }
                            break;
                    }
                    return Unit.f18162a;
                }
            });
            ConstraintLayout constraintLayout = mayaSupportWebActivity.f11802u;
            String strTnTj78 = numX49.tnTj78("btAPt");
            if (constraintLayout == null) {
                j.n(strTnTj78);
                throw null;
            }
            final int i4 = 1;
            Ke.b.b(constraintLayout, new Function0(mayaSupportWebActivity) { // from class: T6.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaSupportWebActivity f5811b;

                {
                    this.f5811b = mayaSupportWebActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            int i42 = MayaSupportWebActivity.f11798y;
                            MayaSupportWebActivity mayaSupportWebActivity2 = this.f5811b;
                            mayaSupportWebActivity2.setResult(1001);
                            mayaSupportWebActivity2.finish();
                            break;
                        case 1:
                            int i6 = MayaSupportWebActivity.f11798y;
                            MayaSupportWebActivity mayaSupportWebActivity3 = this.f5811b;
                            mayaSupportWebActivity3.n1();
                            B5.i.k(mayaSupportWebActivity3, "paymaya://chatwithus");
                            break;
                        default:
                            MayaSupportWebActivity mayaSupportWebActivity4 = this.f5811b;
                            int i10 = MayaSupportWebActivity.f11798y;
                            Bb.f fVarG22 = mayaSupportWebActivity4.g2();
                            String strD = C.d("paymaya://chatwithus", "route", "history");
                            if (strD != null) {
                                MayaWebActivity mayaWebActivity = (MayaWebActivity) ((h) fVarG22.c.get());
                                mayaWebActivity.n1();
                                B5.i.k(mayaWebActivity, strD);
                            }
                            break;
                    }
                    return Unit.f18162a;
                }
            });
            ImageButton imageButton2 = mayaSupportWebActivity.f11804w;
            String strTnTj782 = numX49.tnTj78("btAPU");
            if (imageButton2 == null) {
                j.n(strTnTj782);
                throw null;
            }
            final int i6 = 2;
            Ke.b.b(imageButton2, new Function0(mayaSupportWebActivity) { // from class: T6.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaSupportWebActivity f5811b;

                {
                    this.f5811b = mayaSupportWebActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i6) {
                        case 0:
                            int i42 = MayaSupportWebActivity.f11798y;
                            MayaSupportWebActivity mayaSupportWebActivity2 = this.f5811b;
                            mayaSupportWebActivity2.setResult(1001);
                            mayaSupportWebActivity2.finish();
                            break;
                        case 1:
                            int i62 = MayaSupportWebActivity.f11798y;
                            MayaSupportWebActivity mayaSupportWebActivity3 = this.f5811b;
                            mayaSupportWebActivity3.n1();
                            B5.i.k(mayaSupportWebActivity3, "paymaya://chatwithus");
                            break;
                        default:
                            MayaSupportWebActivity mayaSupportWebActivity4 = this.f5811b;
                            int i10 = MayaSupportWebActivity.f11798y;
                            Bb.f fVarG22 = mayaSupportWebActivity4.g2();
                            String strD = C.d("paymaya://chatwithus", "route", "history");
                            if (strD != null) {
                                MayaWebActivity mayaWebActivity = (MayaWebActivity) ((h) fVarG22.c.get());
                                mayaWebActivity.n1();
                                B5.i.k(mayaWebActivity, strD);
                            }
                            break;
                    }
                    return Unit.f18162a;
                }
            });
            boolean z4 = ((b) fVarG2.e).f2416b;
            String strTnTj783 = numX49.tnTj78("btAPe");
            if (!z4) {
                MayaSupportWebActivity mayaSupportWebActivity2 = (MayaSupportWebActivity) ((h) fVarG2.c.get());
                ImageButton imageButton3 = mayaSupportWebActivity2.f11804w;
                if (imageButton3 == null) {
                    j.n(strTnTj782);
                    throw null;
                }
                imageButton3.setVisibility(0);
                ConstraintLayout constraintLayout2 = mayaSupportWebActivity2.f11802u;
                if (constraintLayout2 == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                constraintLayout2.setVisibility(8);
                AppCompatTextView appCompatTextView = mayaSupportWebActivity2.f11803v;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                    return;
                } else {
                    j.n(strTnTj783);
                    throw null;
                }
            }
            MayaSupportWebActivity mayaSupportWebActivity3 = (MayaSupportWebActivity) ((h) fVarG2.c.get());
            ImageButton imageButton4 = mayaSupportWebActivity3.f11804w;
            if (imageButton4 == null) {
                j.n(strTnTj782);
                throw null;
            }
            imageButton4.setVisibility(8);
            ConstraintLayout constraintLayout3 = mayaSupportWebActivity3.f11802u;
            if (constraintLayout3 == null) {
                j.n(strTnTj78);
                throw null;
            }
            constraintLayout3.setVisibility(0);
            if (((b) fVarG2.e).c) {
                AppCompatTextView appCompatTextView2 = ((MayaSupportWebActivity) ((h) fVarG2.c.get())).f11803v;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setVisibility(0);
                } else {
                    j.n(strTnTj783);
                    throw null;
                }
            }
        }
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, S6.j, Y6.n
    public final void d(String str) {
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final f g2() {
        f fVar = this.f11800s;
        if (fVar != null) {
            return fVar;
        }
        j.n(numX49.tnTj78("btAP4"));
        throw null;
    }

    public final void h2(String str) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(str);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put(numX49.tnTj78("btAPo"), numX49.tnTj78("btAPK"));
        c1219hE.i();
        c1220iK1.b(c1219hE);
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f11808o;
        if (activityResultCaller instanceof X6.h) {
            j.e(activityResultCaller, numX49.tnTj78("btAPw"));
            if (((MayaWebFragment) ((X6.h) activityResultCaller)).Q1()) {
                return;
            }
        }
        super.onBackPressed();
        setResult(1001);
        finish();
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        iKNpI8.xCZPS1(this, bundle);
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity, android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
    }
}
