package B9;

import Ah.p;
import G6.v;
import Lh.h;
import M8.T2;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.domain.model.MissionV2Mechanics;
import com.paymaya.domain.model.MissionV2Reward;
import com.paymaya.domain.model.MissionV2Validity;
import com.paymaya.domain.store.C1272m0;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeBottomSheetFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f383d = 2;
    public final C1272m0 e;

    public c(C1272m0 c1272m0) {
        this.e = c1272m0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        String upperCase;
        Intent intent;
        String strL;
        MissionV2Action missionV2Action;
        List<MissionV2Action> actions;
        Object next;
        Intent intent2;
        int i;
        Intent intent3;
        Intent intent4;
        int i4 = 2;
        int i6 = 0;
        switch (this.f383d) {
            case 0:
                super.j();
                MissionV2 missionV2 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12984l0;
                if (missionV2 == null) {
                    G9.c cVar = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12985n0;
                    if (cVar != null) {
                        ((MayaMissionsActivity) cVar).getSupportFragmentManager().popBackStack();
                        return;
                    }
                    return;
                }
                String status = missionV2.getStatus();
                if (status != null) {
                    upperCase = status.toUpperCase(Locale.ROOT);
                    j.f(upperCase, "toUpperCase(...)");
                } else {
                    upperCase = null;
                }
                if (j.b(upperCase, "COMPLETED")) {
                    TextView textView = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12969W;
                    if (textView == null) {
                        j.n("mTextViewValidityPeriod");
                        throw null;
                    }
                    textView.setVisibility(8);
                } else {
                    MissionV2Validity validity = missionV2.getValidity();
                    if (validity != null) {
                        TextView textView2 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12969W;
                        if (textView2 == null) {
                            j.n("mTextViewValidityPeriod");
                            throw null;
                        }
                        textView2.setVisibility(0);
                        F9.b bVar = (F9.b) this.c.get();
                        String upperCase2 = validity.getPartialCompletionText().toUpperCase(Locale.ROOT);
                        j.f(upperCase2, "toUpperCase(...)");
                        MayaMissionsDetailsFragment mayaMissionsDetailsFragment = (MayaMissionsDetailsFragment) bVar;
                        mayaMissionsDetailsFragment.getClass();
                        TextView textView3 = mayaMissionsDetailsFragment.f12969W;
                        if (textView3 == null) {
                            j.n("mTextViewValidityPeriod");
                            throw null;
                        }
                        textView3.setText(mayaMissionsDetailsFragment.getString(R.string.maya_label_missions_validity, upperCase2));
                    }
                }
                F9.b bVar2 = (F9.b) this.c.get();
                String campaignName = missionV2.getTitle();
                MayaMissionsDetailsFragment mayaMissionsDetailsFragment2 = (MayaMissionsDetailsFragment) bVar2;
                mayaMissionsDetailsFragment2.getClass();
                j.g(campaignName, "campaignName");
                TextView textView4 = mayaMissionsDetailsFragment2.f12970X;
                if (textView4 == null) {
                    j.n("mTextViewCampaignName");
                    throw null;
                }
                textView4.setText(campaignName);
                MissionV2Reward reward = missionV2.getReward();
                if (reward != null) {
                    String previewIcon = reward.getPreviewIcon();
                    if (j.b(previewIcon, "coin")) {
                        ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).t1(2131231317);
                    } else if (j.b(previewIcon, "voucher")) {
                        ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).t1(2131231676);
                    } else {
                        ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).t1(2131231371);
                    }
                }
                String imageUrl = missionV2.getImageUrl();
                if (imageUrl == null || C2576A.H(imageUrl)) {
                    Group group = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12973a0;
                    if (group == null) {
                        j.n("mConstraintGroupPartnerLogo");
                        throw null;
                    }
                    group.setVisibility(8);
                } else {
                    MayaMissionsDetailsFragment mayaMissionsDetailsFragment3 = (MayaMissionsDetailsFragment) ((F9.b) this.c.get());
                    int dimensionPixelSize = mayaMissionsDetailsFragment3.getResources().getDimensionPixelSize(R.dimen.maya_mission_partner_logo_size);
                    ImageView imageView = mayaMissionsDetailsFragment3.f12972Z;
                    if (imageView == null) {
                        j.n("mImageViewPartnerLogoIcon");
                        throw null;
                    }
                    C.b0(imageUrl, imageView, dimensionPixelSize, dimensionPixelSize, new v(mayaMissionsDetailsFragment3, i4));
                }
                MissionV2Reward reward2 = missionV2.getReward();
                if (reward2 != null) {
                    if (reward2.isTitleAndDescriptionEmpty()) {
                        Group group2 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12976d0;
                        if (group2 == null) {
                            j.n("mRewardDetailsGroup");
                            throw null;
                        }
                        group2.setVisibility(8);
                    } else {
                        Group group3 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12976d0;
                        if (group3 == null) {
                            j.n("mRewardDetailsGroup");
                            throw null;
                        }
                        group3.setVisibility(0);
                    }
                    String title = reward2.getTitle();
                    if (title != null) {
                        MayaMissionsDetailsFragment mayaMissionsDetailsFragment4 = (MayaMissionsDetailsFragment) ((F9.b) this.c.get());
                        mayaMissionsDetailsFragment4.getClass();
                        TextView textView5 = mayaMissionsDetailsFragment4.f12974b0;
                        if (textView5 == null) {
                            j.n("mTextViewRewardTitle");
                            throw null;
                        }
                        textView5.setText(title);
                    }
                    String description = reward2.getDescription();
                    if (description != null) {
                        MayaMissionsDetailsFragment mayaMissionsDetailsFragment5 = (MayaMissionsDetailsFragment) ((F9.b) this.c.get());
                        mayaMissionsDetailsFragment5.getClass();
                        TextView textView6 = mayaMissionsDetailsFragment5.f12975c0;
                        if (textView6 == null) {
                            j.n("mTextViewRewardDescription");
                            throw null;
                        }
                        textView6.setText(description);
                    }
                }
                List<MissionV2Action> missionsActions = missionV2.getActions();
                List<MissionV2Action> list = missionsActions;
                if (list != null && !list.isEmpty()) {
                    MayaMissionsDetailsFragment mayaMissionsDetailsFragment6 = (MayaMissionsDetailsFragment) ((F9.b) this.c.get());
                    mayaMissionsDetailsFragment6.getClass();
                    j.g(missionsActions, "missionsActions");
                    E9.c cVar2 = mayaMissionsDetailsFragment6.m0;
                    if (cVar2 != null) {
                        ArrayList arrayList = cVar2.c;
                        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new E9.d(arrayList, missionsActions));
                        j.f(diffResultCalculateDiff, "calculateDiff(...)");
                        arrayList.clear();
                        arrayList.addAll(missionsActions);
                        diffResultCalculateDiff.dispatchUpdatesTo(cVar2);
                    }
                }
                MissionV2Mechanics mechanics = missionV2.getMechanics();
                String description2 = mechanics != null ? mechanics.getDescription() : null;
                if (description2 == null || C2576A.H(description2)) {
                    Group group4 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12979g0;
                    if (group4 == null) {
                        j.n("mConstraintGroupMechanicsSection");
                        throw null;
                    }
                    group4.setVisibility(8);
                } else {
                    MayaMissionsDetailsFragment mayaMissionsDetailsFragment7 = (MayaMissionsDetailsFragment) ((F9.b) this.c.get());
                    mayaMissionsDetailsFragment7.getClass();
                    HtmlTextView htmlTextView = mayaMissionsDetailsFragment7.f12978f0;
                    if (htmlTextView == null) {
                        j.n("mHtmlTextViewMechanicsDescription");
                        throw null;
                    }
                    htmlTextView.setTextHTML(description2);
                    Group group5 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12979g0;
                    if (group5 == null) {
                        j.n("mConstraintGroupMechanicsSection");
                        throw null;
                    }
                    group5.setVisibility(0);
                }
                List<MissionV2Action> actions2 = missionV2.getActions();
                List<MissionV2Action> list2 = actions2;
                if (list2 != null && !list2.isEmpty()) {
                    List<MissionV2Action> list3 = actions2;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator<T> it = list3.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (j.b(((MissionV2Action) it.next()).getInDetailsCompleted(), Boolean.TRUE) && (i = i + 1) < 0) {
                                C1132s.j();
                                throw null;
                            }
                        }
                    }
                    int size = actions2.size();
                    int iA = sj.b.a((((double) i) / ((double) size)) * 100.0d);
                    ProgressBar progressBar = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12980h0;
                    if (progressBar == null) {
                        j.n("mProgressBarProgressIndicator");
                        throw null;
                    }
                    progressBar.setProgress(iA);
                    MayaMissionsDetailsFragment mayaMissionsDetailsFragment8 = (MayaMissionsDetailsFragment) ((F9.b) this.c.get());
                    TextView textView7 = mayaMissionsDetailsFragment8.f12981i0;
                    if (textView7 == null) {
                        j.n("mTextViewTasksCompleted");
                        throw null;
                    }
                    textView7.setText(mayaMissionsDetailsFragment8.getResources().getQuantityString(R.plurals.maya_label_missions_format_mission_tasks_completed, size, Integer.valueOf(i), Integer.valueOf(size)));
                }
                MissionV2Mechanics mechanics2 = missionV2.getMechanics();
                String buttonTitle = mechanics2 != null ? mechanics2.getButtonTitle() : null;
                String buttonLink = mechanics2 != null ? mechanics2.getButtonLink() : null;
                if (mechanics2 != null) {
                    if (buttonTitle == null || buttonTitle.length() == 0 || buttonLink == null || buttonLink.length() == 0) {
                        Button button = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12982j0;
                        if (button == null) {
                            j.n("mButtonCallToAction");
                            throw null;
                        }
                        button.setVisibility(8);
                    } else {
                        MayaMissionsDetailsFragment mayaMissionsDetailsFragment9 = (MayaMissionsDetailsFragment) ((F9.b) this.c.get());
                        mayaMissionsDetailsFragment9.getClass();
                        Button button2 = mayaMissionsDetailsFragment9.f12982j0;
                        if (button2 == null) {
                            j.n("mButtonCallToAction");
                            throw null;
                        }
                        button2.setText(buttonTitle);
                        Button button3 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12982j0;
                        if (button3 == null) {
                            j.n("mButtonCallToAction");
                            throw null;
                        }
                        button3.setVisibility(0);
                    }
                }
                FragmentActivity activity = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).getActivity();
                String dataString = (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString();
                if (37 == C.w(dataString) && (strL = C.L(dataString, "task")) != null && !C2576A.H(strL)) {
                    MissionV2 missionV22 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).f12984l0;
                    if (missionV22 == null || (actions = missionV22.getActions()) == null) {
                        missionV2Action = null;
                    } else {
                        Iterator<T> it2 = actions.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (j.b(((MissionV2Action) next).getId(), strL)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        missionV2Action = (MissionV2Action) next;
                    }
                    if (missionV2Action != null && !j.b(missionV2Action.getInDetailsCompleted(), Boolean.TRUE) && z.o(missionV2Action.getAction(), "ENTER_CODE", true)) {
                        MayaMissionsDetailsFragment mayaMissionsDetailsFragment10 = (MayaMissionsDetailsFragment) ((F9.b) this.c.get());
                        mayaMissionsDetailsFragment10.getClass();
                        G9.c cVar3 = mayaMissionsDetailsFragment10.f12985n0;
                        if (cVar3 != null) {
                            MissionV2 missionV23 = mayaMissionsDetailsFragment10.f12984l0;
                            MayaMissionsActivity mayaMissionsActivity = (MayaMissionsActivity) cVar3;
                            mayaMissionsActivity.f12956p = missionV23;
                            mayaMissionsActivity.f12957q = missionV2Action;
                            mayaMissionsActivity.Y1(missionV23, missionV2Action);
                        }
                    }
                }
                FragmentActivity activity2 = ((MayaMissionsDetailsFragment) ((F9.b) this.c.get())).getActivity();
                if (activity2 == null || (intent = activity2.getIntent()) == null) {
                    return;
                }
                intent.setData(null);
                return;
            case 1:
                super.j();
                MissionV2Action missionV2Action2 = ((MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) this.c.get())).f12989U;
                String enterCodeSpiel = missionV2Action2 != null ? missionV2Action2.getEnterCodeSpiel() : null;
                if (enterCodeSpiel == null || C2576A.H(enterCodeSpiel)) {
                    MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment = (MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) this.c.get());
                    TextView textView8 = mayaMissionsEnterCodeBottomSheetFragment.f12993Y;
                    if (textView8 != null) {
                        textView8.setText(mayaMissionsEnterCodeBottomSheetFragment.getString(R.string.maya_label_missions_enter_code_instructions));
                        return;
                    } else {
                        j.n("mInstructionsTextView");
                        throw null;
                    }
                }
                MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment2 = (MayaMissionsEnterCodeBottomSheetFragment) ((F9.c) this.c.get());
                mayaMissionsEnterCodeBottomSheetFragment2.getClass();
                TextView textView9 = mayaMissionsEnterCodeBottomSheetFragment2.f12993Y;
                if (textView9 != null) {
                    textView9.setText(enterCodeSpiel);
                    return;
                } else {
                    j.n("mInstructionsTextView");
                    throw null;
                }
            default:
                super.j();
                FragmentActivity activity3 = ((MayaMissionsFragment) ((F9.e) this.c.get())).getActivity();
                String dataString2 = (activity3 == null || (intent4 = activity3.getIntent()) == null) ? null : intent4.getDataString();
                if (dataString2 == null || C2576A.H(dataString2)) {
                    ((MayaMissionsFragment) ((F9.e) this.c.get())).P1();
                    return;
                }
                if (37 == C.w(dataString2)) {
                    String strL2 = C.L(dataString2, "campaignID");
                    String strL3 = C.L(dataString2, "task");
                    if (strL2 == null || C2576A.H(strL2)) {
                        ((MayaMissionsFragment) ((F9.e) this.c.get())).P1();
                    } else {
                        ((MayaMissionsFragment) ((F9.e) this.c.get())).O1();
                        C1272m0 c1272m0 = this.e;
                        c1272m0.getClass();
                        p<MissionV2> missionDetails = c1272m0.f11462b.getMissionDetails(strL2, T2.t());
                        j.f(missionDetails, "getMissionDetails(...)");
                        new Lh.d(new Lh.d(new h(missionDetails, zh.b.a(), 0), new J5.c(this, 7), i4), new V2.c(this, 5), i6).e();
                        if (strL3 != null && !C2576A.H(strL3)) {
                            return;
                        }
                    }
                } else {
                    ((MayaMissionsFragment) ((F9.e) this.c.get())).P1();
                }
                FragmentActivity activity4 = ((MayaMissionsFragment) ((F9.e) this.c.get())).getActivity();
                if (activity4 == null || (intent3 = activity4.getIntent()) == null) {
                    return;
                }
                intent3.setData(null);
                return;
        }
    }

    public c(C1272m0 c1272m0, Uh.d dVar) {
        super(dVar);
        this.e = c1272m0;
    }

    public c(C1272m0 c1272m0, com.paymaya.data.preference.a mPreference) {
        j.g(mPreference, "mPreference");
        this.e = c1272m0;
    }
}
