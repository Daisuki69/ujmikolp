package com.paymaya.mayaui.missions.view.fragment.impl;

import Ae.a;
import F9.h;
import Fa.c;
import G6.u;
import G9.m;
import N5.H;
import We.A;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import cj.C1132s;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.domain.model.MissionV2Reward;
import com.paymaya.domain.model.MissionV2Validity;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsPreviewBottomSheetFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.j;
import sj.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMissionsPreviewBottomSheetFragment extends MayaBaseBottomSheetDialogFragment implements h {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public H f13038S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public a f13039T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public m f13040U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public MissionV2 f13041V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13042W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13043X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ImageView f13044Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f13045Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Group f13046a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f13047b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f13048c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ProgressBar f13049d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f13050e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Button f13051f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Button f13052g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Group f13053h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final EnumC1215d f13054i0 = EnumC1215d.MISSIONS;

    public static final void s1(MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment) {
        C1220i c1220iN1 = mayaMissionsPreviewBottomSheetFragment.n1();
        FragmentActivity activity = mayaMissionsPreviewBottomSheetFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaMissionsPreviewBottomSheetFragment.f13054i0);
        c1219hD.r(EnumC1216e.MISSION);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.CTA);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        MissionV2 missionV2 = mayaMissionsPreviewBottomSheetFragment.f13041V;
        String title = missionV2 != null ? missionV2.getTitle() : null;
        HashMap map = c1219hD.j;
        map.put("mission_title", title);
        map.put("screen", "quick preview");
        c1219hD.i();
        c1220iN1.c(activity, c1219hD);
        mayaMissionsPreviewBottomSheetFragment.dismiss();
        m mVar = mayaMissionsPreviewBottomSheetFragment.f13040U;
        if (mVar != null) {
            ((MayaMissionsActivity) mVar).X1(mayaMissionsPreviewBottomSheetFragment.f13041V);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        O5.a aVar = W4.a.e().s().f4753a;
        this.f10325B = (C1220i) aVar.f4716g.get();
        com.paymaya.data.preference.a mPreference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(mPreference, "mPreference");
        this.f13039T = new a(4);
        this.f13040U = (m) getActivity();
        a aVar2 = this.f13039T;
        if (aVar2 == null) {
            j.n("mMissionsPreviewBottomSheetFragmentPresenter");
            throw null;
        }
        aVar2.h(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13041V = (MissionV2) arguments.getParcelable("mission");
        }
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 4));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_missions_preview_bottom_sheet, viewGroup, false);
        int i = R.id.campaign_name_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.campaign_name_text_view);
        if (textView != null) {
            i = R.id.cancel_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.cancel_button);
            if (button != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.header_barrier;
                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.header_barrier)) != null) {
                    i = R.id.learn_more_button;
                    Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.learn_more_button);
                    if (button2 != null) {
                        i = R.id.left_guideline;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                            i = R.id.mission_details_container;
                            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.mission_details_container)) != null) {
                                i = R.id.partner_logo_background_view;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.partner_logo_background_view);
                                if (viewFindChildViewById != null) {
                                    i = R.id.partner_logo_constraint_group;
                                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.partner_logo_constraint_group);
                                    if (group != null) {
                                        i = R.id.partner_logo_icon_image_view;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.partner_logo_icon_image_view);
                                        if (imageView != null) {
                                            i = R.id.progress_indicator_progress_bar;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.progress_indicator_progress_bar);
                                            if (progressBar != null) {
                                                i = R.id.reward_description_text_view;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reward_description_text_view);
                                                if (textView2 != null) {
                                                    i = R.id.reward_group;
                                                    Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.reward_group);
                                                    if (group2 != null) {
                                                        i = R.id.reward_title_text_view;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reward_title_text_view);
                                                        if (textView3 != null) {
                                                            i = R.id.reward_type_graphic_image_view;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.reward_type_graphic_image_view);
                                                            if (imageView2 != null) {
                                                                i = R.id.rewards_bottom_space;
                                                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.rewards_bottom_space)) != null) {
                                                                    i = R.id.rewards_view;
                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.rewards_view);
                                                                    if (viewFindChildViewById2 != null) {
                                                                        i = R.id.right_guideline;
                                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                                                            i = R.id.sheet_background_view;
                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                                                                            if (viewFindChildViewById3 != null) {
                                                                                i = R.id.tasks_completed_text_view;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tasks_completed_text_view);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.validity_period_text_view;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.validity_period_text_view);
                                                                                    if (textView5 != null) {
                                                                                        this.f13038S = new H(constraintLayout, textView, button, button2, viewFindChildViewById, group, imageView, progressBar, textView2, group2, textView3, imageView2, viewFindChildViewById2, viewFindChildViewById3, textView4, textView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f13039T;
        if (aVar == null) {
            j.n("mMissionsPreviewBottomSheetFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ImageView imageView = this.f13045Z;
        if (imageView == null) {
            j.n("mPartnerLogoIconImageView");
            throw null;
        }
        A.d().a(imageView);
        this.f13038S = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m mVar = this.f13040U;
        if (mVar != null) {
            ((MayaMissionsActivity) mVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String upperCase;
        int i;
        final int i4 = 1;
        final int i6 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        H h = this.f13038S;
        j.d(h);
        this.f13042W = (TextView) h.f3636k;
        H h6 = this.f13038S;
        j.d(h6);
        this.f13043X = h6.c;
        H h7 = this.f13038S;
        j.d(h7);
        this.f13044Y = (ImageView) h7.f3641q;
        H h8 = this.f13038S;
        j.d(h8);
        this.f13045Z = (ImageView) h8.f3638n;
        H h10 = this.f13038S;
        j.d(h10);
        this.f13046a0 = (Group) h10.m;
        H h11 = this.f13038S;
        j.d(h11);
        this.f13047b0 = h11.f3635g;
        H h12 = this.f13038S;
        j.d(h12);
        this.f13048c0 = h12.f;
        H h13 = this.f13038S;
        j.d(h13);
        this.f13049d0 = (ProgressBar) h13.f3639o;
        H h14 = this.f13038S;
        j.d(h14);
        this.f13050e0 = (TextView) h14.j;
        H h15 = this.f13038S;
        j.d(h15);
        this.f13051f0 = (Button) h15.f3634d;
        H h16 = this.f13038S;
        j.d(h16);
        this.f13052g0 = (Button) h16.f3637l;
        H h17 = this.f13038S;
        j.d(h17);
        this.f13053h0 = (Group) h17.f3640p;
        Button button = this.f13051f0;
        if (button == null) {
            j.n("mCancelButton");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: G9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMissionsPreviewBottomSheetFragment f1936b;

            {
                this.f1936b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment = this.f1936b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaMissionsPreviewBottomSheetFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment2 = this.f1936b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaMissionsPreviewBottomSheetFragment.s1(mayaMissionsPreviewBottomSheetFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13052g0;
        if (button2 == null) {
            j.n("mLearnMoreButton");
            throw null;
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: G9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMissionsPreviewBottomSheetFragment f1936b;

            {
                this.f1936b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment = this.f1936b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaMissionsPreviewBottomSheetFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment2 = this.f1936b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaMissionsPreviewBottomSheetFragment.s1(mayaMissionsPreviewBottomSheetFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        a aVar = this.f13039T;
        if (aVar == null) {
            j.n("mMissionsPreviewBottomSheetFragmentPresenter");
            throw null;
        }
        MissionV2 missionV2 = this.f13041V;
        aVar.j();
        if (missionV2 != null) {
            String status = missionV2.getStatus();
            if (status != null) {
                upperCase = status.toUpperCase(Locale.ROOT);
                j.f(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            if (j.b(upperCase, "COMPLETED")) {
                TextView textView = ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).f13042W;
                if (textView == null) {
                    j.n("mValidityPeriodTextView");
                    throw null;
                }
                textView.setVisibility(8);
            } else {
                MissionV2Validity validity = missionV2.getValidity();
                if (validity != null) {
                    TextView textView2 = ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).f13042W;
                    if (textView2 == null) {
                        j.n("mValidityPeriodTextView");
                        throw null;
                    }
                    textView2.setVisibility(0);
                    h hVar = (h) aVar.c.get();
                    String upperCase2 = validity.getPartialCompletionText().toUpperCase(Locale.ROOT);
                    j.f(upperCase2, "toUpperCase(...)");
                    MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment = (MayaMissionsPreviewBottomSheetFragment) hVar;
                    mayaMissionsPreviewBottomSheetFragment.getClass();
                    TextView textView3 = mayaMissionsPreviewBottomSheetFragment.f13042W;
                    if (textView3 == null) {
                        j.n("mValidityPeriodTextView");
                        throw null;
                    }
                    textView3.setText(mayaMissionsPreviewBottomSheetFragment.getString(R.string.maya_label_missions_validity, upperCase2));
                }
            }
            h hVar2 = (h) aVar.c.get();
            String campaignName = missionV2.getTitle();
            MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment2 = (MayaMissionsPreviewBottomSheetFragment) hVar2;
            mayaMissionsPreviewBottomSheetFragment2.getClass();
            j.g(campaignName, "campaignName");
            TextView textView4 = mayaMissionsPreviewBottomSheetFragment2.f13043X;
            if (textView4 == null) {
                j.n("mCampaignNameTextView");
                throw null;
            }
            textView4.setText(campaignName);
            MissionV2Reward reward = missionV2.getReward();
            if (reward != null) {
                String previewIcon = reward.getPreviewIcon();
                if (j.b(previewIcon, "coin")) {
                    ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).t1(2131231317);
                } else if (j.b(previewIcon, "voucher")) {
                    ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).t1(2131231676);
                } else {
                    ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).t1(2131231371);
                }
            }
            String imageUrl = missionV2.getImageUrl();
            if (imageUrl == null || C2576A.H(imageUrl)) {
                Group group = ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).f13046a0;
                if (group == null) {
                    j.n("mPartnerLogoConstraintGroup");
                    throw null;
                }
                group.setVisibility(8);
            } else {
                MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment3 = (MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get());
                int dimensionPixelSize = mayaMissionsPreviewBottomSheetFragment3.getResources().getDimensionPixelSize(R.dimen.maya_mission_partner_logo_size);
                ImageView imageView = mayaMissionsPreviewBottomSheetFragment3.f13045Z;
                if (imageView == null) {
                    j.n("mPartnerLogoIconImageView");
                    throw null;
                }
                C.b0(imageUrl, imageView, dimensionPixelSize, dimensionPixelSize, new u(mayaMissionsPreviewBottomSheetFragment3, 3));
            }
            MissionV2Reward reward2 = missionV2.getReward();
            if (reward2 != null) {
                if (reward2.isTitleAndDescriptionEmpty()) {
                    Group group2 = ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).f13053h0;
                    if (group2 == null) {
                        j.n("mRewardGroup");
                        throw null;
                    }
                    group2.setVisibility(8);
                } else {
                    Group group3 = ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).f13053h0;
                    if (group3 == null) {
                        j.n("mRewardGroup");
                        throw null;
                    }
                    group3.setVisibility(0);
                }
                String title = reward2.getTitle();
                if (title != null) {
                    MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment4 = (MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get());
                    mayaMissionsPreviewBottomSheetFragment4.getClass();
                    TextView textView5 = mayaMissionsPreviewBottomSheetFragment4.f13047b0;
                    if (textView5 == null) {
                        j.n("mRewardTitleTextView");
                        throw null;
                    }
                    textView5.setText(title);
                }
                String description = reward2.getDescription();
                if (description != null) {
                    MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment5 = (MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get());
                    mayaMissionsPreviewBottomSheetFragment5.getClass();
                    TextView textView6 = mayaMissionsPreviewBottomSheetFragment5.f13048c0;
                    if (textView6 == null) {
                        j.n("mRewardDescriptionTextView");
                        throw null;
                    }
                    textView6.setText(description);
                }
            }
            List<MissionV2Action> actions = missionV2.getActions();
            List<MissionV2Action> list = actions;
            if (list == null || list.isEmpty()) {
                return;
            }
            List<MissionV2Action> list2 = actions;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (j.b(((MissionV2Action) it.next()).getInDetailsCompleted(), Boolean.TRUE) && (i = i + 1) < 0) {
                        C1132s.j();
                        throw null;
                    }
                }
            }
            int size = actions.size();
            int iA = b.a((((double) i) / ((double) size)) * 100.0d);
            ProgressBar progressBar = ((MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get())).f13049d0;
            if (progressBar == null) {
                j.n("mProgressIndicatorProgressBar");
                throw null;
            }
            progressBar.setProgress(iA);
            MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment6 = (MayaMissionsPreviewBottomSheetFragment) ((h) aVar.c.get());
            TextView textView7 = mayaMissionsPreviewBottomSheetFragment6.f13050e0;
            if (textView7 != null) {
                textView7.setText(mayaMissionsPreviewBottomSheetFragment6.getResources().getQuantityString(R.plurals.maya_label_missions_format_mission_tasks_completed, size, Integer.valueOf(i), Integer.valueOf(size)));
            } else {
                j.n("mTasksCompletedTextView");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1215d p1() {
        return this.f13054i0;
    }

    public final void t1(int i) {
        ImageView imageView = this.f13044Y;
        if (imageView != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), i));
        } else {
            j.n("mRewardTypeGraphicImageView");
            throw null;
        }
    }
}
