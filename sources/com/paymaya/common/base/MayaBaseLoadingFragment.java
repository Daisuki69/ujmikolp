package com.paymaya.common.base;

import N5.C0491z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaHtmlTextView;
import kotlin.jvm.internal.j;
import qf.d;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaBaseLoadingFragment extends MayaBaseFragment {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0491z f10341U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public FrameLayout f10342V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public FrameLayout f10343W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public FrameLayout f10344X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public FrameLayout f10345Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public FrameLayout f10346Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f10347a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f10348b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ImageView f10349c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f10350d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f10351e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f10352f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ImageView f10353g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f10354h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public MayaHtmlTextView f10355i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public TextView f10356j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f10357k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f10358l0;
    public int m0 = 1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f10359n0;

    public static /* synthetic */ void N1(MayaBaseLoadingFragment mayaBaseLoadingFragment, int i, String str, String str2, View.OnClickListener onClickListener, int i4) {
        int i6;
        String str3 = (i4 & 2) != 0 ? null : str;
        String str4 = (i4 & 4) != 0 ? null : str2;
        if ((i4 & 16) != 0) {
            mayaBaseLoadingFragment.getClass();
            i6 = 2131231241;
        } else {
            i6 = 2131231472;
        }
        mayaBaseLoadingFragment.M1(i, str3, str4, null, i6, onClickListener);
    }

    public abstract View G1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract View H1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public View I1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public abstract View J1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public View K1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final void L1() {
        this.m0 = 0;
        FrameLayout frameLayout = this.f10342V;
        if (frameLayout == null) {
            j.n("mFrameLayoutContentContainer");
            throw null;
        }
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.f10343W;
        if (frameLayout2 == null) {
            j.n("mFrameLayoutLoadingContainer");
            throw null;
        }
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = this.f10344X;
        if (frameLayout3 == null) {
            j.n("mFrameLayoutErrorContainer");
            throw null;
        }
        frameLayout3.setVisibility(8);
        FrameLayout frameLayout4 = this.f10346Z;
        if (frameLayout4 == null) {
            j.n("mFrameLayoutError2Container");
            throw null;
        }
        frameLayout4.setVisibility(8);
        FrameLayout frameLayout5 = this.f10345Y;
        if (frameLayout5 != null) {
            frameLayout5.setVisibility(8);
        } else {
            j.n("mFrameLayoutMaintenanceContainer");
            throw null;
        }
    }

    public final void M1(int i, String str, String str2, String str3, int i4, View.OnClickListener onClickListener) {
        TextView textView;
        this.m0 = 2;
        FrameLayout frameLayout = this.f10342V;
        if (frameLayout == null) {
            j.n("mFrameLayoutContentContainer");
            throw null;
        }
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = this.f10343W;
        if (frameLayout2 == null) {
            j.n("mFrameLayoutLoadingContainer");
            throw null;
        }
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = this.f10344X;
        if (frameLayout3 == null) {
            j.n("mFrameLayoutErrorContainer");
            throw null;
        }
        frameLayout3.setVisibility(0);
        FrameLayout frameLayout4 = this.f10346Z;
        if (frameLayout4 == null) {
            j.n("mFrameLayoutError2Container");
            throw null;
        }
        frameLayout4.setVisibility(8);
        FrameLayout frameLayout5 = this.f10345Y;
        if (frameLayout5 == null) {
            j.n("mFrameLayoutMaintenanceContainer");
            throw null;
        }
        frameLayout5.setVisibility(8);
        if (str3 != null && (textView = this.f10352f0) != null) {
            textView.setText(str3);
        }
        TextView textView2 = this.f10352f0;
        if (textView2 != null) {
            textView2.setOnClickListener(new d(onClickListener, 24));
        }
        if (i == 100) {
            TextView textView3 = this.f10352f0;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            ImageView imageView = this.f10349c0;
            if (imageView != null) {
                imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), 2131231241));
            }
            TextView textView4 = this.f10350d0;
            if (textView4 != null) {
                String string = getString(R.string.maya_label_something_went_wrong_title);
                j.f(string, "getString(...)");
                textView4.setText(string);
            }
            TextView textView5 = this.f10351e0;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.f10351e0;
            if (textView6 != null) {
                textView6.setText(getString(R.string.maya_label_connection_issue));
                return;
            }
            return;
        }
        if (i == 200) {
            TextView textView7 = this.f10352f0;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            ImageView imageView2 = this.f10349c0;
            if (imageView2 != null) {
                imageView2.setImageDrawable(ContextCompat.getDrawable(requireContext(), i4));
            }
            TextView textView8 = this.f10350d0;
            if (textView8 != null) {
                if (str2 == null || C2576A.H(str2)) {
                    str2 = getString(R.string.maya_label_something_went_wrong_title);
                    j.f(str2, "getString(...)");
                }
                textView8.setText(str2);
            }
            TextView textView9 = this.f10351e0;
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            TextView textView10 = this.f10351e0;
            if (textView10 != null) {
                if (str == null || C2576A.H(str)) {
                    str = getString(R.string.maya_label_lets_try_that_again);
                }
                textView10.setText(str);
                return;
            }
            return;
        }
        if (i == 300) {
            TextView textView11 = this.f10352f0;
            if (textView11 != null) {
                textView11.setVisibility(8);
            }
            ImageView imageView3 = this.f10349c0;
            if (imageView3 != null) {
                imageView3.setBackgroundResource(2131231799);
            }
            TextView textView12 = this.f10350d0;
            if (textView12 != null) {
                textView12.setText(getString(R.string.pma_dialog_error_shop_empty_title));
            }
            TextView textView13 = this.f10351e0;
            if (textView13 != null) {
                textView13.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 400) {
            TextView textView14 = this.f10352f0;
            if (textView14 != null) {
                textView14.setVisibility(8);
            }
            ImageView imageView4 = this.f10349c0;
            if (imageView4 != null) {
                imageView4.setBackgroundResource(2131231794);
            }
            TextView textView15 = this.f10350d0;
            if (textView15 != null) {
                textView15.setText(getString(R.string.pma_dialog_error_coming_soon_title));
            }
            TextView textView16 = this.f10351e0;
            if (textView16 != null) {
                textView16.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 500) {
            TextView textView17 = this.f10352f0;
            if (textView17 != null) {
                textView17.setVisibility(8);
            }
            ImageView imageView5 = this.f10349c0;
            if (imageView5 != null) {
                imageView5.setBackgroundResource(2131231799);
            }
            TextView textView18 = this.f10350d0;
            if (textView18 != null) {
                textView18.setText(getString(R.string.pma_dialog_error_no_recent_activity_title));
            }
            TextView textView19 = this.f10351e0;
            if (textView19 != null) {
                textView19.setVisibility(0);
            }
            TextView textView20 = this.f10351e0;
            if (textView20 != null) {
                textView20.setText(getString(R.string.pma_dialog_error_no_recent_activity_message));
                return;
            }
            return;
        }
        if (i == 600) {
            ImageView imageView6 = this.f10349c0;
            if (imageView6 != null) {
                imageView6.setBackgroundResource(2131231826);
            }
            TextView textView21 = this.f10350d0;
            if (textView21 != null) {
                textView21.setText(getString(R.string.pma_dialog_error_unfunded_title));
            }
            TextView textView22 = this.f10351e0;
            if (textView22 != null) {
                textView22.setVisibility(0);
            }
            TextView textView23 = this.f10351e0;
            if (textView23 != null) {
                textView23.setText(getString(R.string.pma_dialog_error_unfunded_message));
                return;
            }
            return;
        }
        if (i == 700) {
            TextView textView24 = this.f10352f0;
            if (textView24 != null) {
                textView24.setVisibility(0);
            }
            ImageView imageView7 = this.f10349c0;
            if (imageView7 != null) {
                imageView7.setImageDrawable(ContextCompat.getDrawable(requireContext(), i4));
            }
            TextView textView25 = this.f10350d0;
            if (textView25 != null) {
                textView25.setText(str2);
            }
            TextView textView26 = this.f10351e0;
            if (textView26 != null) {
                textView26.setVisibility(0);
            }
            TextView textView27 = this.f10351e0;
            if (textView27 != null) {
                textView27.setText(str);
                return;
            }
            return;
        }
        if (i != 800) {
            return;
        }
        TextView textView28 = this.f10352f0;
        if (textView28 != null) {
            textView28.setVisibility(4);
        }
        ImageView imageView8 = this.f10349c0;
        if (imageView8 != null) {
            imageView8.setBackgroundResource(2131231472);
        }
        TextView textView29 = this.f10350d0;
        if (textView29 != null) {
            textView29.setText(getString(R.string.maya_label_that_didnt_load_right));
        }
        TextView textView30 = this.f10351e0;
        if (textView30 != null) {
            textView30.setVisibility(0);
        }
        TextView textView31 = this.f10351e0;
        if (textView31 != null) {
            textView31.setText(getString(R.string.maya_label_device_management_error_no_device_loaded));
        }
    }

    public final void O1() {
        this.m0 = 1;
        FrameLayout frameLayout = this.f10342V;
        if (frameLayout == null) {
            j.n("mFrameLayoutContentContainer");
            throw null;
        }
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = this.f10344X;
        if (frameLayout2 == null) {
            j.n("mFrameLayoutErrorContainer");
            throw null;
        }
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = this.f10346Z;
        if (frameLayout3 == null) {
            j.n("mFrameLayoutError2Container");
            throw null;
        }
        frameLayout3.setVisibility(8);
        FrameLayout frameLayout4 = this.f10343W;
        if (frameLayout4 == null) {
            j.n("mFrameLayoutLoadingContainer");
            throw null;
        }
        frameLayout4.setVisibility(0);
        FrameLayout frameLayout5 = this.f10345Y;
        if (frameLayout5 != null) {
            frameLayout5.setVisibility(8);
        } else {
            j.n("mFrameLayoutMaintenanceContainer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_base, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = R.id.view_content_container;
        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_content_container);
        if (frameLayout2 != null) {
            i = R.id.view_error_2_container;
            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_error_2_container);
            if (frameLayout3 != null) {
                i = R.id.view_error_container;
                FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_error_container);
                if (frameLayout4 != null) {
                    i = R.id.view_loading_container;
                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_loading_container);
                    if (frameLayout5 != null) {
                        i = R.id.view_maintenance_container;
                        FrameLayout frameLayout6 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_maintenance_container);
                        if (frameLayout6 != null) {
                            this.f10341U = new C0491z(frameLayout, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, 5);
                            this.f10342V = frameLayout2;
                            this.f10343W = frameLayout5;
                            C0491z c0491z = this.f10341U;
                            j.d(c0491z);
                            this.f10344X = (FrameLayout) c0491z.f4305g;
                            C0491z c0491z2 = this.f10341U;
                            j.d(c0491z2);
                            this.f10345Y = (FrameLayout) c0491z2.h;
                            C0491z c0491z3 = this.f10341U;
                            j.d(c0491z3);
                            this.f10346Z = (FrameLayout) c0491z3.f;
                            FrameLayout frameLayout7 = this.f10342V;
                            if (frameLayout7 == null) {
                                j.n("mFrameLayoutContentContainer");
                                throw null;
                            }
                            frameLayout7.addView(G1(inflater, frameLayout7));
                            FrameLayout frameLayout8 = this.f10343W;
                            if (frameLayout8 == null) {
                                j.n("mFrameLayoutLoadingContainer");
                                throw null;
                            }
                            frameLayout8.addView(J1(inflater, frameLayout8));
                            FrameLayout frameLayout9 = this.f10344X;
                            if (frameLayout9 == null) {
                                j.n("mFrameLayoutErrorContainer");
                                throw null;
                            }
                            FrameLayout frameLayout10 = this.f10343W;
                            if (frameLayout10 == null) {
                                j.n("mFrameLayoutLoadingContainer");
                                throw null;
                            }
                            frameLayout9.addView(H1(inflater, frameLayout10));
                            FrameLayout frameLayout11 = this.f10343W;
                            if (frameLayout11 == null) {
                                j.n("mFrameLayoutLoadingContainer");
                                throw null;
                            }
                            View viewK1 = K1(inflater, frameLayout11);
                            if (viewK1 != null) {
                                FrameLayout frameLayout12 = this.f10345Y;
                                if (frameLayout12 == null) {
                                    j.n("mFrameLayoutMaintenanceContainer");
                                    throw null;
                                }
                                frameLayout12.addView(viewK1);
                            }
                            FrameLayout frameLayout13 = this.f10343W;
                            if (frameLayout13 == null) {
                                j.n("mFrameLayoutLoadingContainer");
                                throw null;
                            }
                            View viewI1 = I1(inflater, frameLayout13);
                            if (viewI1 != null) {
                                FrameLayout frameLayout14 = this.f10346Z;
                                if (frameLayout14 == null) {
                                    j.n("mFrameLayoutError2Container");
                                    throw null;
                                }
                                frameLayout14.addView(viewI1);
                            }
                            FrameLayout frameLayout15 = this.f10343W;
                            if (frameLayout15 == null) {
                                j.n("mFrameLayoutLoadingContainer");
                                throw null;
                            }
                            FrameLayout frameLayout16 = this.f10343W;
                            if (frameLayout16 == null) {
                                j.n("mFrameLayoutLoadingContainer");
                                throw null;
                            }
                            FrameLayout frameLayout17 = this.f10343W;
                            if (frameLayout17 == null) {
                                j.n("mFrameLayoutLoadingContainer");
                                throw null;
                            }
                            this.f10347a0 = (TextView) frameLayout17.findViewById(R.id.text_view_title);
                            FrameLayout frameLayout18 = this.f10343W;
                            if (frameLayout18 == null) {
                                j.n("mFrameLayoutLoadingContainer");
                                throw null;
                            }
                            this.f10348b0 = (TextView) frameLayout18.findViewById(R.id.text_view_message);
                            FrameLayout frameLayout19 = this.f10344X;
                            if (frameLayout19 == null) {
                                j.n("mFrameLayoutErrorContainer");
                                throw null;
                            }
                            this.f10349c0 = (ImageView) frameLayout19.findViewById(R.id.image_view_error_image);
                            FrameLayout frameLayout20 = this.f10344X;
                            if (frameLayout20 == null) {
                                j.n("mFrameLayoutErrorContainer");
                                throw null;
                            }
                            this.f10350d0 = (TextView) frameLayout20.findViewById(R.id.text_view_error_title);
                            FrameLayout frameLayout21 = this.f10344X;
                            if (frameLayout21 == null) {
                                j.n("mFrameLayoutErrorContainer");
                                throw null;
                            }
                            this.f10351e0 = (TextView) frameLayout21.findViewById(R.id.text_view_error_message);
                            FrameLayout frameLayout22 = this.f10344X;
                            if (frameLayout22 == null) {
                                j.n("mFrameLayoutErrorContainer");
                                throw null;
                            }
                            this.f10352f0 = (TextView) frameLayout22.findViewById(R.id.button_retry);
                            FrameLayout frameLayout23 = this.f10346Z;
                            if (frameLayout23 == null) {
                                j.n("mFrameLayoutError2Container");
                                throw null;
                            }
                            this.f10353g0 = (ImageView) frameLayout23.findViewById(R.id.image_view_error_image);
                            FrameLayout frameLayout24 = this.f10346Z;
                            if (frameLayout24 == null) {
                                j.n("mFrameLayoutError2Container");
                                throw null;
                            }
                            this.f10354h0 = (TextView) frameLayout24.findViewById(R.id.text_view_error_title);
                            FrameLayout frameLayout25 = this.f10346Z;
                            if (frameLayout25 == null) {
                                j.n("mFrameLayoutError2Container");
                                throw null;
                            }
                            this.f10355i0 = (MayaHtmlTextView) frameLayout25.findViewById(R.id.text_view_error_message);
                            FrameLayout frameLayout26 = this.f10346Z;
                            if (frameLayout26 == null) {
                                j.n("mFrameLayoutError2Container");
                                throw null;
                            }
                            this.f10356j0 = (TextView) frameLayout26.findViewById(R.id.button_done);
                            FrameLayout frameLayout27 = this.f10345Y;
                            if (frameLayout27 == null) {
                                j.n("mFrameLayoutMaintenanceContainer");
                                throw null;
                            }
                            FrameLayout frameLayout28 = this.f10345Y;
                            if (frameLayout28 == null) {
                                j.n("mFrameLayoutMaintenanceContainer");
                                throw null;
                            }
                            this.f10357k0 = (TextView) frameLayout28.findViewById(R.id.text_view_maintenance_title);
                            FrameLayout frameLayout29 = this.f10345Y;
                            if (frameLayout29 == null) {
                                j.n("mFrameLayoutMaintenanceContainer");
                                throw null;
                            }
                            this.f10358l0 = (TextView) frameLayout29.findViewById(R.id.text_view_maintenance_description);
                            O1();
                            C0491z c0491z4 = this.f10341U;
                            j.d(c0491z4);
                            return (FrameLayout) c0491z4.f4303b;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
