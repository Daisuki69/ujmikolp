package com.paymaya.mayaui.missions.view.fragment.impl;

import A5.l;
import B5.i;
import B9.c;
import F9.b;
import J7.e;
import N5.O;
import We.A;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.preference.a;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Mechanics;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMissionsDetailsFragment extends BaseFragment implements b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public c f12965S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public a f12966T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public O f12967U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SpringView f12968V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f12969W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f12970X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ImageView f12971Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f12972Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Group f12973a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f12974b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f12975c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Group f12976d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public RecyclerView f12977e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public HtmlTextView f12978f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Group f12979g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ProgressBar f12980h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TextView f12981i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Button f12982j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public LottieAnimationView f12983k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public MissionV2 f12984l0;
    public E9.c m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public G9.c f12985n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f12986o0;

    public static final void s1(MayaMissionsDetailsFragment mayaMissionsDetailsFragment) {
        MissionV2Mechanics mechanics;
        C1220i c1220i = mayaMissionsDetailsFragment.f10245B;
        FragmentActivity activity = mayaMissionsDetailsFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.MISSIONS);
        c1219hD.r(EnumC1216e.MISSION);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.CTA);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        MissionV2 missionV2 = mayaMissionsDetailsFragment.f12984l0;
        String buttonLink = null;
        c1219hD.j.put("mission_title", missionV2 != null ? missionV2.getTitle() : null);
        c1219hD.j.put("screen", "details");
        c1219hD.i();
        c1220i.c(activity, c1219hD);
        c cVarR1 = mayaMissionsDetailsFragment.r1();
        MissionV2 missionV22 = mayaMissionsDetailsFragment.f12984l0;
        if (missionV22 != null && (mechanics = missionV22.getMechanics()) != null) {
            buttonLink = mechanics.getButtonLink();
        }
        if (buttonLink == null || C2576A.H(buttonLink)) {
            return;
        }
        if (!C.Y(buttonLink)) {
            MayaMissionsDetailsFragment mayaMissionsDetailsFragment2 = (MayaMissionsDetailsFragment) ((b) cVarR1.c.get());
            mayaMissionsDetailsFragment2.getClass();
            G9.c cVar = mayaMissionsDetailsFragment2.f12985n0;
            if (cVar != null) {
                MayaMissionsActivity mayaMissionsActivity = (MayaMissionsActivity) cVar;
                mayaMissionsActivity.n1().k0(mayaMissionsActivity, buttonLink);
                return;
            }
            return;
        }
        MayaMissionsDetailsFragment mayaMissionsDetailsFragment3 = (MayaMissionsDetailsFragment) ((b) cVarR1.c.get());
        mayaMissionsDetailsFragment3.getClass();
        G9.c cVar2 = mayaMissionsDetailsFragment3.f12985n0;
        if (cVar2 != null) {
            MayaMissionsActivity mayaMissionsActivity2 = (MayaMissionsActivity) cVar2;
            mayaMissionsActivity2.n1();
            i.k(mayaMissionsActivity2, buttonLink);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.MISSION;
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.MISSIONS;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 1190 && i4 == -1) {
            MissionV2 missionV2 = intent != null ? (MissionV2) intent.getParcelableExtra("updated_mission") : null;
            c cVarR1 = r1();
            if (missionV2 != null) {
                MayaMissionsDetailsFragment mayaMissionsDetailsFragment = (MayaMissionsDetailsFragment) ((b) cVarR1.c.get());
                mayaMissionsDetailsFragment.getClass();
                mayaMissionsDetailsFragment.f12984l0 = missionV2;
                cVarR1.j();
            }
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12984l0 = (MissionV2) arguments.getParcelable("mission");
        }
        this.f12985n0 = (G9.c) getActivity();
        O5.a aVar = W4.a.e().s().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (a) aVar.e.get();
        this.f12965S = new c(aVar.D(), (a) aVar.e.get());
        this.f12966T = (a) aVar.e.get();
        r1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_missions_details, viewGroup, false);
        int i = R.id.bottom_space;
        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space)) != null) {
            i = R.id.call_to_action_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.call_to_action_button);
            if (button != null) {
                i = R.id.campaign_name_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.campaign_name_text_view);
                if (textView != null) {
                    SpringView springView = (SpringView) viewInflate;
                    i = R.id.details_bottom_space;
                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.details_bottom_space)) != null) {
                        i = R.id.details_content_scroll_view;
                        if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.details_content_scroll_view)) != null) {
                            i = R.id.details_view;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.details_view);
                            if (viewFindChildViewById != null) {
                                i = R.id.header_barrier;
                                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.header_barrier)) != null) {
                                    i = R.id.left_guideline;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                                        i = R.id.mechanics_description_html_text_view;
                                        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.mechanics_description_html_text_view);
                                        if (htmlTextView != null) {
                                            i = R.id.mechanics_label_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.mechanics_label_text_view)) != null) {
                                                i = R.id.mechanics_section_constraint_group_view;
                                                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.mechanics_section_constraint_group_view);
                                                if (group != null) {
                                                    i = R.id.mechanics_top_divider;
                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.mechanics_top_divider);
                                                    if (viewFindChildViewById2 != null) {
                                                        i = R.id.partner_logo_background_view;
                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.partner_logo_background_view);
                                                        if (viewFindChildViewById3 != null) {
                                                            i = R.id.partner_logo_constraint_group;
                                                            Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.partner_logo_constraint_group);
                                                            if (group2 != null) {
                                                                i = R.id.partner_logo_icon_image_view;
                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.partner_logo_icon_image_view);
                                                                if (imageView != null) {
                                                                    i = R.id.progress_indicator_progress_bar;
                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.progress_indicator_progress_bar);
                                                                    if (progressBar != null) {
                                                                        i = R.id.reward_description_text_view;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reward_description_text_view);
                                                                        if (textView2 != null) {
                                                                            i = R.id.reward_details_group;
                                                                            Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.reward_details_group);
                                                                            if (group3 != null) {
                                                                                i = R.id.reward_title_text_view;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reward_title_text_view);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.reward_type_graphic_image_view;
                                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.reward_type_graphic_image_view);
                                                                                    if (imageView2 != null) {
                                                                                        i = R.id.right_guideline;
                                                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                                                                            i = R.id.tasks_completed_text_view;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tasks_completed_text_view);
                                                                                            if (textView4 != null) {
                                                                                                i = R.id.tasks_instructions_text_view;
                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tasks_instructions_text_view)) != null) {
                                                                                                    i = R.id.tasks_label_text_view;
                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tasks_label_text_view)) != null) {
                                                                                                        i = R.id.tasks_progression_recycler_view;
                                                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.tasks_progression_recycler_view);
                                                                                                        if (recyclerView != null) {
                                                                                                            i = R.id.tasks_top_divider;
                                                                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.tasks_top_divider);
                                                                                                            if (viewFindChildViewById4 != null) {
                                                                                                                i = R.id.validity_period_text_view;
                                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.validity_period_text_view);
                                                                                                                if (textView5 != null) {
                                                                                                                    this.f12967U = new O(springView, button, textView, springView, viewFindChildViewById, htmlTextView, group, viewFindChildViewById2, viewFindChildViewById3, group2, imageView, progressBar, textView2, group3, textView3, imageView2, textView4, recyclerView, viewFindChildViewById4, textView5);
                                                                                                                    j.f(springView, "getRoot(...)");
                                                                                                                    return springView;
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

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        r1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ImageView imageView = this.f12972Z;
        if (imageView == null) {
            j.n("mImageViewPartnerLogoIcon");
            throw null;
        }
        A.d().a(imageView);
        this.f12967U = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        G9.c cVar = this.f12985n0;
        if (cVar != null) {
            ((MayaMissionsActivity) cVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        O o8 = this.f12967U;
        j.d(o8);
        this.f12968V = (SpringView) o8.f3813o;
        O o10 = this.f12967U;
        j.d(o10);
        this.f12969W = (TextView) o10.f3819u;
        O o11 = this.f12967U;
        j.d(o11);
        this.f12970X = o11.c;
        O o12 = this.f12967U;
        j.d(o12);
        this.f12971Y = o12.f3811l;
        O o13 = this.f12967U;
        j.d(o13);
        this.f12972Z = o13.h;
        O o14 = this.f12967U;
        j.d(o14);
        this.f12973a0 = o14.f3809g;
        O o15 = this.f12967U;
        j.d(o15);
        this.f12974b0 = o15.f3810k;
        O o16 = this.f12967U;
        j.d(o16);
        this.f12975c0 = o16.i;
        O o17 = this.f12967U;
        j.d(o17);
        this.f12976d0 = (Group) o17.j;
        O o18 = this.f12967U;
        j.d(o18);
        this.f12977e0 = (RecyclerView) o18.m;
        O o19 = this.f12967U;
        j.d(o19);
        this.f12978f0 = (HtmlTextView) o19.e;
        O o20 = this.f12967U;
        j.d(o20);
        this.f12979g0 = o20.f;
        O o21 = this.f12967U;
        j.d(o21);
        this.f12980h0 = (ProgressBar) o21.f3816r;
        O o22 = this.f12967U;
        j.d(o22);
        this.f12981i0 = (TextView) o22.f3817s;
        O o23 = this.f12967U;
        j.d(o23);
        this.f12982j0 = (Button) o23.f3807b;
        RecyclerView recyclerView = this.f12977e0;
        if (recyclerView == null) {
            j.n("mRecyclerViewTasksProgression");
            throw null;
        }
        Context context = recyclerView.getContext();
        j.f(context, "getContext(...)");
        a aVar = this.f12966T;
        if (aVar == null) {
            j.n("mPreference");
            throw null;
        }
        E9.c cVar = new E9.c(context, this, aVar.e().isMissionsV2EnterCodeEnabled());
        this.m0 = cVar;
        RecyclerView recyclerView2 = this.f12977e0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewTasksProgression");
            throw null;
        }
        recyclerView2.setAdapter(cVar);
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireActivity()));
        SpringView springView = this.f12968V;
        if (springView == null) {
            j.n("mSpringView");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.f12968V;
        if (springView2 == null) {
            j.n("mSpringView");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f12983k0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.f12968V;
        if (springView3 == null) {
            j.n("mSpringView");
            throw null;
        }
        springView3.setListener(new l(this, 29));
        r1().j();
        Button button = this.f12982j0;
        if (button == null) {
            j.n("mButtonCallToAction");
            throw null;
        }
        button.setOnClickListener(new Ba.a(this, 8));
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        o1(c1219h);
    }

    public final c r1() {
        c cVar = this.f12965S;
        if (cVar != null) {
            return cVar;
        }
        j.n("mMissionsDetailsFragmentPresenter");
        throw null;
    }

    public final void t1(int i) {
        ImageView imageView = this.f12971Y;
        if (imageView != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(requireActivity(), i));
        } else {
            j.n("mImageViewRewardTypeGraphic");
            throw null;
        }
    }
}
