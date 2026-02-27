package com.paymaya.common.base;

import S.a;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseLoadingFragment extends BaseFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public FrameLayout f10250S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public FrameLayout f10251T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public FrameLayout f10252U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ImageView f10253V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f10254W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f10255X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f10256Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f10257Z;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_base, viewGroup, false);
        this.f10250S = (FrameLayout) viewInflate.findViewById(R.id.pma_fragment_base_content_container);
        this.f10251T = (FrameLayout) viewInflate.findViewById(R.id.pma_fragment_base_loading_container);
        this.f10252U = (FrameLayout) viewInflate.findViewById(R.id.pma_fragment_base_error_container);
        FrameLayout frameLayout = this.f10250S;
        frameLayout.addView(s1(layoutInflater, frameLayout));
        FrameLayout frameLayout2 = this.f10251T;
        frameLayout2.addView(u1(layoutInflater, frameLayout2));
        this.f10252U.addView(t1(layoutInflater, this.f10251T));
        this.f10253V = (ImageView) viewInflate.findViewById(R.id.pma_view_error_image_view);
        this.f10254W = (TextView) viewInflate.findViewById(R.id.pma_view_error_text_view_title_error);
        this.f10255X = (TextView) viewInflate.findViewById(R.id.pma_view_error_text_view_subtitle_error);
        this.f10256Y = (TextView) viewInflate.findViewById(R.id.pma_view_error_text_view_retry);
        z1();
        return viewInflate;
    }

    public int r1() {
        return 2131231805;
    }

    public abstract View s1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract View t1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract View u1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public int v1() {
        return 2131231805;
    }

    public final void w1() {
        this.f10250S.setVisibility(0);
        this.f10251T.setVisibility(8);
        this.f10252U.setVisibility(8);
    }

    public final void x1(int i, View.OnClickListener onClickListener) {
        y1(i, "", onClickListener);
    }

    public final void y1(int i, String str, View.OnClickListener onClickListener) {
        this.f10250S.setVisibility(8);
        this.f10251T.setVisibility(8);
        this.f10252U.setVisibility(0);
        this.f10256Y.setOnClickListener(new a(onClickListener, 3));
        if (i == 100) {
            this.f10256Y.setVisibility(0);
            this.f10253V.setBackgroundResource(r1());
            this.f10254W.setText(getString(R.string.pma_dialog_error_no_internet_connection_title));
            this.f10255X.setVisibility(0);
            this.f10255X.setText(getString(R.string.pma_dialog_error_no_internet_connection_message));
            return;
        }
        if (i == 200) {
            this.f10256Y.setVisibility(0);
            this.f10253V.setBackgroundResource(v1());
            this.f10254W.setText(getString(R.string.pma_dialog_error_server_default_title));
            this.f10255X.setVisibility(0);
            if (TextUtils.isEmpty(str)) {
                this.f10255X.setText(getString(R.string.pma_dialog_error_server_default_message));
                return;
            } else {
                this.f10255X.setText(str);
                return;
            }
        }
        if (i == 300) {
            this.f10256Y.setVisibility(8);
            this.f10253V.setBackgroundResource(2131231799);
            this.f10254W.setText(getString(R.string.pma_dialog_error_shop_empty_title));
            this.f10255X.setVisibility(8);
            return;
        }
        if (i == 400) {
            this.f10256Y.setVisibility(8);
            this.f10253V.setBackgroundResource(2131231794);
            this.f10254W.setText(getString(R.string.pma_dialog_error_coming_soon_title));
            this.f10255X.setVisibility(8);
            return;
        }
        if (i == 500) {
            this.f10256Y.setVisibility(8);
            this.f10253V.setBackgroundResource(2131231799);
            this.f10254W.setText(getString(R.string.pma_dialog_error_no_recent_activity_title));
            this.f10255X.setVisibility(0);
            this.f10255X.setText(getString(R.string.pma_dialog_error_no_recent_activity_message));
            return;
        }
        if (i != 600) {
            return;
        }
        this.f10253V.setBackgroundResource(2131231826);
        this.f10254W.setText(getString(R.string.pma_dialog_error_unfunded_title));
        this.f10255X.setVisibility(0);
        this.f10255X.setText(getString(R.string.pma_dialog_error_unfunded_message));
    }

    public final void z1() {
        this.f10250S.setVisibility(8);
        this.f10252U.setVisibility(8);
        this.f10251T.setVisibility(0);
    }
}
