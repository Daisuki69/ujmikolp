package com.paymaya.mayaui.sendmoney.view.fragment.impl;

import Bb.f;
import Fb.b;
import G5.r;
import Gb.c;
import Gb.d;
import N5.C0437a1;
import N5.C0453g;
import O5.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Decoration;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import yb.C2518b;
import yb.InterfaceC2517a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSendMoneyDecorationPreviewFragment extends MayaBaseFragment implements b, InterfaceC2517a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f13763U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RecyclerView f13764V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Group f13765W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ConstraintLayout f13766X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ImageView f13767Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f13768Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f13769a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public f f13770b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public c f13771c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C2518b f13772d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Decoration f13774f0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final d f13773e0 = new d(this, 0);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final EnumC1216e f13775g0 = EnumC1216e.CARD_PREVIEW;

    public final void G1(String imageUrl) {
        j.g(imageUrl, "imageUrl");
        ConstraintLayout constraintLayout = this.f13766X;
        if (constraintLayout == null) {
            j.n("mConstraintLayoutCardContainer");
            throw null;
        }
        constraintLayout.setVisibility(4);
        getActivity();
        ImageView imageView = this.f13767Y;
        if (imageView != null) {
            C.h0(imageUrl, imageView, this.f13773e0);
        } else {
            j.n("mImageViewThemeBackground");
            throw null;
        }
    }

    public final void H1() {
        ConstraintLayout constraintLayout = this.f13766X;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        } else {
            j.n("mConstraintLayoutCardContainer");
            throw null;
        }
    }

    public final void I1(String str) {
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("theme_id", str);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put(SessionDescription.ATTR_TYPE, "theme");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return this.f13775g0;
    }

    @Override // yb.InterfaceC2517a
    public final void e(Decoration decoration) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.THEME);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("theme_id", decoration != null ? decoration.getMId() : null);
        A1(c1219hH);
        f fVar = this.f13770b0;
        if (fVar == null) {
            j.n("mMayaSendMoneyCardPreviewFragmentPresenter");
            throw null;
        }
        ((MayaSendMoneyDecorationPreviewFragment) ((b) fVar.c.get())).f13774f0 = decoration;
        if ((decoration != null ? decoration.getMImageUrl() : null) == null || decoration.getMImageUrl().length() == 0) {
            ((MayaSendMoneyDecorationPreviewFragment) ((b) fVar.c.get())).H1();
        } else {
            ((MayaSendMoneyDecorationPreviewFragment) ((b) fVar.c.get())).G1(decoration.getMImageUrl());
        }
        MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment = (MayaSendMoneyDecorationPreviewFragment) ((b) fVar.c.get());
        C2518b c2518b = mayaSendMoneyDecorationPreviewFragment.f13772d0;
        if (c2518b == null) {
            j.n("mMayaSendMoneyDecorationAdapter");
            throw null;
        }
        c2518b.e(decoration);
        c cVar = mayaSendMoneyDecorationPreviewFragment.f13771c0;
        if (cVar != null) {
            cVar.y0(decoration);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyDecorationPreviewFragment.MayaSendMoneyDecorationPreviewFragmentListener");
        this.f13771c0 = (c) activity;
        a aVar = W4.a.e().x().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        f fVar = new f(aVar.o(), 0);
        this.f13770b0 = fVar;
        fVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_decoration_preview, (ViewGroup) null, false);
        int i = R.id.constraint_group_theme_design_selection;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_theme_design_selection);
        if (group != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.lottie_animation_view_loading;
            if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_animation_view_loading)) != null) {
                i = R.id.maya_view_decoration_card_content;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.maya_view_decoration_card_content);
                if (viewFindChildViewById != null) {
                    int i4 = R.id.barrier_bottom_decoration_content;
                    if (((Barrier) ViewBindings.findChildViewById(viewFindChildViewById, R.id.barrier_bottom_decoration_content)) != null) {
                        i4 = R.id.constraint_group_gif_views;
                        Group group2 = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_group_gif_views);
                        if (group2 != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindChildViewById;
                            i4 = R.id.guideline_left_boundary;
                            if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.guideline_left_boundary)) != null) {
                                i4 = R.id.guideline_right_boundary;
                                if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.guideline_right_boundary)) != null) {
                                    i4 = R.id.image_view_gif_header_graphic;
                                    if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_gif_header_graphic)) != null) {
                                        i4 = R.id.image_view_maya_logo;
                                        if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_maya_logo)) != null) {
                                            i4 = R.id.image_view_theme_background;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_theme_background);
                                            if (imageView != null) {
                                                i4 = R.id.linear_layout_gif_retry_load;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_gif_retry_load);
                                                if (linearLayout != null) {
                                                    i4 = R.id.lottie_animation_view_gif_loading_shimmer;
                                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_view_gif_loading_shimmer);
                                                    if (lottieAnimationView != null) {
                                                        i4 = R.id.space_bottom_image_design_boundary;
                                                        if (((Space) ViewBindings.findChildViewById(viewFindChildViewById, R.id.space_bottom_image_design_boundary)) != null) {
                                                            i4 = R.id.space_top_header;
                                                            if (((Space) ViewBindings.findChildViewById(viewFindChildViewById, R.id.space_top_header)) != null) {
                                                                i4 = R.id.text_view_amount;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_amount);
                                                                if (textView != null) {
                                                                    i4 = R.id.text_view_message;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_message);
                                                                    if (textView2 != null) {
                                                                        i4 = R.id.text_view_powered_by_giphy;
                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_powered_by_giphy)) != null) {
                                                                            i4 = R.id.text_view_tap_to_retry;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_tap_to_retry)) != null) {
                                                                                C0437a1 c0437a1 = new C0437a1(constraintLayout2, group2, constraintLayout2, imageView, linearLayout, lottieAnimationView, textView, textView2);
                                                                                i = R.id.recycler_view_theme_design_selection;
                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_theme_design_selection);
                                                                                if (recyclerView != null) {
                                                                                    i = R.id.scroll_view_content;
                                                                                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_content)) != null) {
                                                                                        i = R.id.text_view_select_design_label;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_select_design_label)) != null) {
                                                                                            this.f13763U = new C0453g(10, constraintLayout, group, c0437a1, recyclerView);
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
                    throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f13770b0;
        if (fVar == null) {
            j.n("mMayaSendMoneyCardPreviewFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13763U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c cVar = this.f13771c0;
        if (cVar != null) {
            cVar.Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f13763U;
        j.d(c0453g);
        this.f13764V = (RecyclerView) c0453g.e;
        C0453g c0453g2 = this.f13763U;
        j.d(c0453g2);
        this.f13765W = (Group) c0453g2.c;
        C0453g c0453g3 = this.f13763U;
        j.d(c0453g3);
        C0437a1 c0437a1 = (C0437a1) c0453g3.f4095d;
        this.f13766X = c0437a1.c;
        this.f13767Y = c0437a1.f4054d;
        this.f13768Z = c0437a1.f;
        this.f13769a0 = c0437a1.e;
        this.f13772d0 = new C2518b(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.maya_padding_normal);
        RecyclerView recyclerView = this.f13764V;
        if (recyclerView == null) {
            j.n("mRecyclerViewThemeDesignSelection");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        C2518b c2518b = this.f13772d0;
        if (c2518b == null) {
            j.n("mMayaSendMoneyDecorationAdapter");
            throw null;
        }
        recyclerView.setAdapter(c2518b);
        recyclerView.addItemDecoration(new r(dimensionPixelSize / 2, dimensionPixelSize, dimensionPixelSize));
        recyclerView.setItemAnimator(null);
        f fVar = this.f13770b0;
        if (fVar != null) {
            fVar.j();
        } else {
            j.n("mMayaSendMoneyCardPreviewFragmentPresenter");
            throw null;
        }
    }
}
