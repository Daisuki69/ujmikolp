package com.paymaya.ui.common.view.activity.impl;

import N5.C0450f;
import Qc.b;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public final class TLSProviderPromptActivity extends AbstractActivityC2512d implements b {
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f14374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0450f f14375l;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.pma_fragment_maintenance, (ViewGroup) null, false);
        int i = R.id.bird_image_view_pma_fragment_updater;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.bird_image_view_pma_fragment_updater)) != null) {
            i = R.id.constraint_layout_pma_fragment_maintenance;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_pma_fragment_maintenance)) != null) {
                i = R.id.logo_image_view_pma_fragment_maintenance;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.logo_image_view_pma_fragment_maintenance)) != null) {
                    i = R.id.message_text_view_pma_fragment_maintenance;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.message_text_view_pma_fragment_maintenance);
                    if (textView != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view_pma_fragment_maintenance);
                        if (textView2 != null) {
                            this.f14375l = new C0450f((ViewGroup) nestedScrollView, (Object) textView, (Object) textView2, 23);
                            setContentView(nestedScrollView);
                            C0450f c0450f = this.f14375l;
                            j.d(c0450f);
                            this.j = (TextView) c0450f.f4088d;
                            C0450f c0450f2 = this.f14375l;
                            j.d(c0450f2);
                            this.f14374k = (TextView) c0450f2.f4087b;
                            TextView textView3 = this.j;
                            if (textView3 == null) {
                                j.n(numX49.tnTj78("bV7O"));
                                throw null;
                            }
                            textView3.setText(getString(R.string.pma_label_device_unsupported));
                            TextView textView4 = this.f14374k;
                            if (textView4 != null) {
                                textView4.setText(getString(R.string.pma_label_device_unsupported_message));
                                return;
                            } else {
                                j.n(numX49.tnTj78("bV7H"));
                                throw null;
                            }
                        }
                        i = R.id.title_text_view_pma_fragment_maintenance;
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bV7Q").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
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
    }
}
