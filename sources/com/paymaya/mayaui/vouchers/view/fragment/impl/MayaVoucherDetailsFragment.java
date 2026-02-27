package com.paymaya.mayaui.vouchers.view.fragment.impl;

import Ag.k;
import D8.C0214w;
import E1.c;
import Fc.b;
import G5.t;
import Gc.d;
import Gh.f;
import Kh.B;
import N5.V0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.AlarmManagerCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import cj.C1112C;
import com.dynatrace.android.agent.Global;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.receiver.ScheduledNotificationReceiver;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.I;
import com.paymaya.common.utility.b0;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.preference.a;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ScheduledNotification;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherNotificationSettings;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.c1;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVoucherDetailsFragment extends MayaBaseLoadingFragment implements b, t, Gc.b {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ImageView f14287A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public HtmlTextView f14288B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public HtmlTextView f14289C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public Button f14290D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Button f14291E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Group f14292F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public CoordinatorLayout f14293G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public Group f14294H0;
    public TextView I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public ImageView f14295J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C0214w f14296K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public Voucher f14297L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public d f14298M0;
    public String N0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public V0 f14299o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ConstraintLayout f14300p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Toolbar f14301q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f14302r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f14303s0;
    public TextView t0;
    public TextView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public View f14304v0;
    public AppCompatCheckBox w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ImageView f14305x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ImageView f14306z0;

    public static final void R1(MayaVoucherDetailsFragment mayaVoucherDetailsFragment) {
        C0214w c0214wP1 = mayaVoucherDetailsFragment.P1();
        String strC = C.c("https://support.maya.ph/s/", ((a) c0214wP1.e).r(), ((a) c0214wP1.e).u(), ((C1265j) c0214wP1.f1106g).a());
        MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = (MayaVoucherDetailsFragment) ((b) c0214wP1.c.get());
        d dVar = mayaVoucherDetailsFragment2.f14298M0;
        if (dVar != null) {
            String string = mayaVoucherDetailsFragment2.getString(R.string.maya_label_help);
            j.f(string, "getString(...)");
            MayaVouchersActivity mayaVouchersActivity = (MayaVouchersActivity) dVar;
            mayaVouchersActivity.n1().v(mayaVouchersActivity, strC, string);
        }
    }

    public static final void S1(MayaVoucherDetailsFragment mayaVoucherDetailsFragment) {
        C0214w c0214wP1 = mayaVoucherDetailsFragment.P1();
        Voucher voucher = mayaVoucherDetailsFragment.f14297L0;
        if (voucher != null) {
            MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = (MayaVoucherDetailsFragment) ((b) c0214wP1.c.get());
            mayaVoucherDetailsFragment2.getClass();
            MayaVoucherClaimBottomSheetDialogFragment mayaVoucherClaimBottomSheetDialogFragment = new MayaVoucherClaimBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("voucher", voucher);
            mayaVoucherClaimBottomSheetDialogFragment.setArguments(bundle);
            mayaVoucherClaimBottomSheetDialogFragment.show(mayaVoucherDetailsFragment2.getChildFragmentManager(), "claim");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public static final void T1(MayaVoucherDetailsFragment mayaVoucherDetailsFragment) {
        boolean z4;
        VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings;
        ?? r16;
        boolean z5;
        long j;
        VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings2;
        d dVar = mayaVoucherDetailsFragment.f14298M0;
        if (dVar != null) {
            ((MayaVouchersActivity) dVar).V1();
        }
        Context contextRequireContext = mayaVoucherDetailsFragment.requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        String str = null;
        if (AbstractC0983W.r(contextRequireContext)) {
            AppCompatCheckBox appCompatCheckBox = mayaVoucherDetailsFragment.w0;
            if (appCompatCheckBox != null) {
                appCompatCheckBox.setChecked(false);
                return;
            } else {
                j.n("mCheckBoxReminder");
                throw null;
            }
        }
        FragmentActivity activity = mayaVoucherDetailsFragment.getActivity();
        int i = R.string.pma_notification_channel_id_reminders;
        boolean zA = I.a(activity, mayaVoucherDetailsFragment.getString(R.string.pma_notification_channel_id_reminders));
        C0214w c0214wP1 = mayaVoucherDetailsFragment.P1();
        Voucher voucher = mayaVoucherDetailsFragment.f14297L0;
        AppCompatCheckBox appCompatCheckBox2 = mayaVoucherDetailsFragment.w0;
        if (appCompatCheckBox2 == null) {
            j.n("mCheckBoxReminder");
            throw null;
        }
        boolean zIsChecked = appCompatCheckBox2.isChecked();
        if (zA && zIsChecked) {
            List<String> listMNotifyDatesBeforeExpiry = (voucher == null || (voucherNotificationSettingsMNotificationSettings2 = voucher.mNotificationSettings()) == null) ? null : voucherNotificationSettingsMNotificationSettings2.mNotifyDatesBeforeExpiry();
            if (listMNotifyDatesBeforeExpiry != null && !listMNotifyDatesBeforeExpiry.isEmpty()) {
                long jCurrentTimeMillis = System.currentTimeMillis() + 5000;
                VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings3 = voucher.mNotificationSettings();
                if (voucherNotificationSettingsMNotificationSettings3 != null) {
                    List<String> listMNotifyDatesBeforeExpiry2 = voucherNotificationSettingsMNotificationSettings3.mNotifyDatesBeforeExpiry();
                    if (listMNotifyDatesBeforeExpiry2 == null) {
                        listMNotifyDatesBeforeExpiry2 = C1112C.f9377a;
                    }
                    Iterator<String> it = listMNotifyDatesBeforeExpiry2.iterator();
                    while (it.hasNext()) {
                        String str2 = str;
                        long millis = DateTime.parse(it.next(), AbstractC1234x.f11255o).getMillis();
                        if (millis > jCurrentTimeMillis) {
                            MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = (MayaVoucherDetailsFragment) ((b) c0214wP1.c.get());
                            mayaVoucherDetailsFragment2.getClass();
                            if (mayaVoucherDetailsFragment2.getContext() != null) {
                                z5 = zA;
                                ScheduledNotification.Builder builderMTitle = ScheduledNotification.sBuilder().mNotificationChannelId(mayaVoucherDetailsFragment2.getString(i)).mSchedulingRequestCode(voucher.mAssignmentId()).mSchedulingDataIdentifier(voucher.mAssignmentId() + Global.UNDERSCORE + millis).mNotificationTriggerTime(millis).mTitle(mayaVoucherDetailsFragment2.getString(R.string.maya_label_voucher_reminder_notification_default_title));
                                VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings4 = voucher.mNotificationSettings();
                                ScheduledNotification scheduledNotificationBuild = builderMTitle.mText(voucherNotificationSettingsMNotificationSettings4 != null ? voucherNotificationSettingsMNotificationSettings4.mNotificationSpiel() : str2).mContentIntent(mayaVoucherDetailsFragment2.Q1(voucher, millis)).build();
                                Context contextRequireContext2 = mayaVoucherDetailsFragment2.requireContext();
                                int i4 = ScheduledNotificationReceiver.f10363a;
                                j = jCurrentTimeMillis;
                                AlarmManagerCompat.setExactAndAllowWhileIdle((AlarmManager) contextRequireContext2.getSystemService("alarm"), 0, scheduledNotificationBuild.mNotificationTriggerTime(), ScheduledNotificationReceiver.a(contextRequireContext2, scheduledNotificationBuild));
                            } else {
                                z5 = zA;
                                j = jCurrentTimeMillis;
                            }
                            str = str2;
                            zA = z5;
                            jCurrentTimeMillis = j;
                            i = R.string.pma_notification_channel_id_reminders;
                        } else {
                            str = str2;
                        }
                    }
                }
            }
            z4 = zA;
            r16 = str;
            ((MayaVoucherDetailsFragment) ((b) c0214wP1.c.get())).Y1();
        } else {
            z4 = zA;
            Object obj = null;
            if (z4 || !zIsChecked) {
                List<String> listMNotifyDatesBeforeExpiry3 = (voucher == null || (voucherNotificationSettingsMNotificationSettings = voucher.mNotificationSettings()) == null) ? null : voucherNotificationSettingsMNotificationSettings.mNotifyDatesBeforeExpiry();
                List<String> list = listMNotifyDatesBeforeExpiry3;
                if (list != null && !list.isEmpty()) {
                    for (String str3 : listMNotifyDatesBeforeExpiry3) {
                        b bVar = (b) c0214wP1.c.get();
                        long millis2 = DateTime.parse(str3, AbstractC1234x.f11255o).getMillis();
                        MayaVoucherDetailsFragment mayaVoucherDetailsFragment3 = (MayaVoucherDetailsFragment) bVar;
                        mayaVoucherDetailsFragment3.getClass();
                        j.g(voucher, "voucher");
                        if (mayaVoucherDetailsFragment3.getContext() != null) {
                            ScheduledNotification.Builder builderMTitle2 = ScheduledNotification.sBuilder().mNotificationChannelId(mayaVoucherDetailsFragment3.getString(R.string.pma_notification_channel_id_reminders)).mSchedulingRequestCode(voucher.mAssignmentId()).mSchedulingDataIdentifier(voucher.mAssignmentId() + Global.UNDERSCORE + millis2).mNotificationTriggerTime(millis2).mTitle(mayaVoucherDetailsFragment3.getString(R.string.maya_label_voucher_reminder_notification_default_title));
                            VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings5 = voucher.mNotificationSettings();
                            ScheduledNotification scheduledNotificationBuild2 = builderMTitle2.mText(voucherNotificationSettingsMNotificationSettings5 != null ? voucherNotificationSettingsMNotificationSettings5.mNotificationSpiel() : null).mContentIntent(mayaVoucherDetailsFragment3.Q1(voucher, millis2)).build();
                            Context contextRequireContext3 = mayaVoucherDetailsFragment3.requireContext();
                            int i6 = ScheduledNotificationReceiver.f10363a;
                            ((AlarmManager) contextRequireContext3.getSystemService("alarm")).cancel(ScheduledNotificationReceiver.a(contextRequireContext3, scheduledNotificationBuild2));
                        }
                    }
                }
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment4 = (MayaVoucherDetailsFragment) ((b) c0214wP1.c.get());
                FragmentActivity activity2 = mayaVoucherDetailsFragment4.getActivity();
                CoordinatorLayout coordinatorLayout = mayaVoucherDetailsFragment4.f14293G0;
                if (coordinatorLayout == null) {
                    j.n("mCoordinatorLayoutContainer");
                    throw null;
                }
                b0.e(activity2, coordinatorLayout, null, R.string.maya_label_voucher_reminder_cancelled, R.drawable.maya_bg_snackbar_success_small_margin, R.style.JekoBoldSmallText_Snackbar_Success, 0, mayaVoucherDetailsFragment4.f10339S, 340);
                C1220i c1220iO1 = mayaVoucherDetailsFragment4.o1();
                FragmentActivity activity3 = mayaVoucherDetailsFragment4.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
                c1219hD.n(5);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map = c1219hD.j;
                map.put(SessionDescription.ATTR_TYPE, "unsubscribe");
                map.put("status", "failure");
                c1220iO1.c(activity3, c1219hD);
                r16 = obj;
            } else {
                ((MayaVoucherDetailsFragment) ((b) c0214wP1.c.get())).X1();
                zIsChecked = false;
                r16 = obj;
            }
        }
        if (voucher != null) {
            ((c1) c0214wP1.f).e(voucher.mAssignmentId(), zIsChecked);
        }
        if (z4) {
            return;
        }
        AppCompatCheckBox appCompatCheckBox3 = mayaVoucherDetailsFragment.w0;
        if (appCompatCheckBox3 == null) {
            j.n("mCheckBoxReminder");
            throw r16;
        }
        appCompatCheckBox3.setChecked(false);
    }

    public static final void U1(MayaVoucherDetailsFragment mayaVoucherDetailsFragment) {
        C1220i c1220iO1 = mayaVoucherDetailsFragment.o1();
        FragmentActivity activity = mayaVoucherDetailsFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
        c1219hD.n(17);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        Voucher voucher = mayaVoucherDetailsFragment.f14297L0;
        c1219hD.j.put("assignment_id", String.valueOf(voucher != null ? Integer.valueOf(voucher.mAssignmentId()) : null));
        c1220iO1.c(activity, c1219hD);
        C0214w c0214wP1 = mayaVoucherDetailsFragment.P1();
        MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = (MayaVoucherDetailsFragment) ((b) c0214wP1.c.get());
        mayaVoucherDetailsFragment2.getClass();
        B bE = c.r(new Ze.c(mayaVoucherDetailsFragment2).c("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR")).e(zh.b.a());
        f fVar = new f(new V2.c(c0214wP1, 16), Eh.d.f1366d);
        bE.g(fVar);
        c0214wP1.e(fVar);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_voucher_details, viewGroup, false);
        int i = R.id.group_voucher_code;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_voucher_code);
        if (group != null) {
            i = R.id.image_view_voucher_code_copy;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_voucher_code_copy);
            if (imageView != null) {
                i = R.id.space_bottom_voucher_code;
                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_bottom_voucher_code)) != null) {
                    i = R.id.text_view_voucher_code_label;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_voucher_code_label)) != null) {
                        i = R.id.text_view_voucher_code_value;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_voucher_code_value);
                        if (textView != null) {
                            i = R.id.view_voucher_code_background;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_voucher_code_background);
                            if (viewFindChildViewById != null) {
                                i = R.id.voucher_details_amount_text_view;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_amount_text_view);
                                if (textView2 != null) {
                                    i = R.id.voucher_details_app_bar_layout;
                                    AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_app_bar_layout);
                                    if (appBarLayout != null) {
                                        i = R.id.voucher_details_banner_image;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_banner_image);
                                        if (imageView2 != null) {
                                            i = R.id.voucher_details_calendar_image;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_calendar_image);
                                            if (imageView3 != null) {
                                                i = R.id.voucher_details_claim_button;
                                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_claim_button);
                                                if (button != null) {
                                                    i = R.id.voucher_details_collapsing_toolbar;
                                                    if (((CollapsingToolbarLayout) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_collapsing_toolbar)) != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                        i = R.id.voucher_details_content_container;
                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_content_container);
                                                        if (frameLayout != null) {
                                                            i = R.id.voucher_details_content_html_text_view;
                                                            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_content_html_text_view);
                                                            if (htmlTextView != null) {
                                                                i = R.id.voucher_details_coordinator;
                                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_coordinator);
                                                                if (coordinatorLayout != null) {
                                                                    i = R.id.voucher_details_default_banner_image;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_default_banner_image);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.voucher_details_details_text_view;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_details_text_view)) != null) {
                                                                            i = R.id.voucher_details_divider_1;
                                                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_divider_1);
                                                                            if (viewFindChildViewById2 != null) {
                                                                                i = R.id.voucher_details_divider_2;
                                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_divider_2);
                                                                                if (viewFindChildViewById3 != null) {
                                                                                    i = R.id.voucher_details_divider_3;
                                                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_divider_3);
                                                                                    if (viewFindChildViewById4 != null) {
                                                                                        i = R.id.voucher_details_faq_and_mechanics_constraint_group;
                                                                                        if (((Group) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_faq_and_mechanics_constraint_group)) != null) {
                                                                                            i = R.id.voucher_details_guideline;
                                                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_guideline)) != null) {
                                                                                                i = R.id.voucher_details_icon_image;
                                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_icon_image)) != null) {
                                                                                                    i = R.id.voucher_details_name_text_view;
                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_name_text_view);
                                                                                                    if (textView3 != null) {
                                                                                                        i = R.id.voucher_details_promo_details_constraint_group;
                                                                                                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_promo_details_constraint_group);
                                                                                                        if (group2 != null) {
                                                                                                            i = R.id.voucher_details_ref_text_view;
                                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_ref_text_view);
                                                                                                            if (textView4 != null) {
                                                                                                                i = R.id.voucher_details_reminder_check_box;
                                                                                                                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_reminder_check_box);
                                                                                                                if (appCompatCheckBox != null) {
                                                                                                                    i = R.id.voucher_details_report_an_issue_button;
                                                                                                                    Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_report_an_issue_button);
                                                                                                                    if (button2 != null) {
                                                                                                                        i = R.id.voucher_details_right_inset_space;
                                                                                                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_right_inset_space);
                                                                                                                        if (viewFindChildViewById5 != null) {
                                                                                                                            i = R.id.voucher_details_scroll;
                                                                                                                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_scroll)) != null) {
                                                                                                                                i = R.id.voucher_details_terms_content_html_text_view;
                                                                                                                                HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_terms_content_html_text_view);
                                                                                                                                if (htmlTextView2 != null) {
                                                                                                                                    i = R.id.voucher_details_terms_text_view;
                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_terms_text_view)) != null) {
                                                                                                                                        i = R.id.voucher_details_ticker_container;
                                                                                                                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_ticker_container)) != null) {
                                                                                                                                            i = R.id.voucher_details_toolbar;
                                                                                                                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_toolbar);
                                                                                                                                            if (toolbar != null) {
                                                                                                                                                i = R.id.voucher_details_toolbar_container;
                                                                                                                                                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_toolbar_container)) != null) {
                                                                                                                                                    i = R.id.voucher_details_toolbar_title;
                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_toolbar_title)) != null) {
                                                                                                                                                        i = R.id.voucher_details_top_container;
                                                                                                                                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_top_container)) != null) {
                                                                                                                                                            i = R.id.voucher_details_valid_content_text_view;
                                                                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_valid_content_text_view);
                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                i = R.id.voucher_details_valid_header_text_view;
                                                                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.voucher_details_valid_header_text_view);
                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                    this.f14299o0 = new V0(constraintLayout, group, imageView, textView, viewFindChildViewById, textView2, appBarLayout, imageView2, imageView3, button, constraintLayout, frameLayout, htmlTextView, coordinatorLayout, imageView4, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, textView3, group2, textView4, appCompatCheckBox, button2, viewFindChildViewById5, htmlTextView2, toolbar, textView5, textView6);
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

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_voucher_view_loading, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View K1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.maya_view_maintenance_dashboard, viewGroup, false);
    }

    public final C0214w P1() {
        C0214w c0214w = this.f14296K0;
        if (c0214w != null) {
            return c0214w;
        }
        j.n("mVoucherDetailsFragmentPresenter");
        throw null;
    }

    public final PendingIntent Q1(Voucher voucher, long j) {
        Intent intent = new Intent(getContext(), (Class<?>) DeepLinkActivity.class);
        intent.setData(Uri.parse(C.n(j, voucher.mCode(), voucher.mCampaignName())));
        PendingIntent activity = PendingIntent.getActivity(getContext(), voucher.mAssignmentId(), intent, 1140850688);
        j.f(activity, "getActivity(...)");
        return activity;
    }

    public final void V1(Voucher voucher) {
        j.g(voucher, "voucher");
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
        c1219hD.n(12);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("assignment_id", String.valueOf(voucher.mAssignmentId()));
        c1220iO1.c(activity, c1219hD);
    }

    public final void W1(PayMayaError payMayaError) {
        d dVar = this.f14298M0;
        if (dVar != null) {
            String string = getString(R.string.maya_label_voucher_claim_error);
            MayaVouchersActivity mayaVouchersActivity = (MayaVouchersActivity) dVar;
            if (C.W(mayaVouchersActivity)) {
                AbstractC1236z.e(mayaVouchersActivity, MayaVoucherDetailsFragment.class, false);
            }
            M2.b.Z(0, string, null, null, null, false, payMayaError, null, false, 445).show(mayaVouchersActivity.getSupportFragmentManager(), "error_dialog");
        }
    }

    public final void X1() {
        FragmentActivity activity = getActivity();
        CoordinatorLayout coordinatorLayout = this.f14293G0;
        if (coordinatorLayout != null) {
            b0.e(activity, coordinatorLayout, null, R.string.maya_label_voucher_reminder_error, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoSemiBoldSmallText_Error, 0, this.f10339S, 340);
        } else {
            j.n("mCoordinatorLayoutContainer");
            throw null;
        }
    }

    public final void Y1() {
        FragmentActivity activity = getActivity();
        CoordinatorLayout coordinatorLayout = this.f14293G0;
        if (coordinatorLayout == null) {
            j.n("mCoordinatorLayoutContainer");
            throw null;
        }
        b0.e(activity, coordinatorLayout, null, R.string.maya_label_voucher_reminder_success, R.drawable.maya_bg_snackbar_success_small_margin, R.style.JekoBoldSmallText_Snackbar_Success, 0, this.f10339S, 340);
        C1220i c1220iO1 = o1();
        FragmentActivity activity2 = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
        c1219hD.n(5);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hD.j;
        map.put(SessionDescription.ATTR_TYPE, "subscribe");
        map.put("status", "success");
        c1220iO1.c(activity2, c1219hD);
    }

    public final void Z1() {
        TextView textView = this.t0;
        if (textView == null) {
            j.n("mTextViewValidity");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.u0;
        if (textView2 == null) {
            j.n("mTextViewValidityLabel");
            throw null;
        }
        textView2.setVisibility(0);
        View view = this.f14304v0;
        if (view != null) {
            view.setVisibility(0);
        } else {
            j.n("mDividerValidity");
            throw null;
        }
    }

    @Override // G5.t
    public final void m(String str, View view) {
        j.g(view, "view");
        d dVar = this.f14298M0;
        if (dVar != null) {
            MayaVouchersActivity mayaVouchersActivity = (MayaVouchersActivity) dVar;
            mayaVouchersActivity.n1().k0(mayaVouchersActivity, str);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.N0 = arguments.getString("voucher");
        }
        this.f10338R = true;
        this.f14298M0 = (d) getActivity();
        O5.a aVar = W4.a.e().C().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f14296K0 = new C0214w((a) aVar.e.get(), aVar.Y(), aVar.e(), (Uh.d) aVar.f4748y.get());
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14299o0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d dVar = this.f14298M0;
        if (dVar != null) {
            ((MayaVouchersActivity) dVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        V0 v02 = this.f14299o0;
        j.d(v02);
        this.f14300p0 = v02.j;
        V0 v03 = this.f14299o0;
        j.d(v03);
        this.f14293G0 = v03.m;
        V0 v04 = this.f14299o0;
        j.d(v04);
        this.f14301q0 = v04.f3968y;
        j.d(this.f14299o0);
        V0 v05 = this.f14299o0;
        j.d(v05);
        this.f14302r0 = v05.f3961r;
        V0 v06 = this.f14299o0;
        j.d(v06);
        this.f14303s0 = v06.f;
        V0 v07 = this.f14299o0;
        j.d(v07);
        this.t0 = v07.f3969z;
        V0 v08 = this.f14299o0;
        j.d(v08);
        this.u0 = v08.f3950A;
        V0 v09 = this.f14299o0;
        j.d(v09);
        this.f14304v0 = v09.f3959p;
        V0 v010 = this.f14299o0;
        j.d(v010);
        this.w0 = v010.f3964u;
        V0 v011 = this.f14299o0;
        j.d(v011);
        this.f14305x0 = v011.h;
        V0 v012 = this.f14299o0;
        j.d(v012);
        this.y0 = v012.f3963t;
        V0 v013 = this.f14299o0;
        j.d(v013);
        this.f14306z0 = v013.f3954g;
        V0 v014 = this.f14299o0;
        j.d(v014);
        this.f14287A0 = v014.f3957n;
        V0 v015 = this.f14299o0;
        j.d(v015);
        this.f14288B0 = v015.f3956l;
        V0 v016 = this.f14299o0;
        j.d(v016);
        this.f14289C0 = v016.f3967x;
        V0 v017 = this.f14299o0;
        j.d(v017);
        this.f14290D0 = v017.f3965v;
        V0 v018 = this.f14299o0;
        j.d(v018);
        this.f14291E0 = v018.i;
        V0 v019 = this.f14299o0;
        j.d(v019);
        this.f14292F0 = v019.f3962s;
        V0 v020 = this.f14299o0;
        j.d(v020);
        this.f14294H0 = v020.f3952b;
        V0 v021 = this.f14299o0;
        j.d(v021);
        this.I0 = v021.f3953d;
        V0 v022 = this.f14299o0;
        j.d(v022);
        this.f14295J0 = v022.c;
        Toolbar toolbar = this.f14301q0;
        if (toolbar == null) {
            j.n("mToolbar");
            throw null;
        }
        MayaBaseFragment.l1(toolbar);
        HtmlTextView htmlTextView = this.f14288B0;
        if (htmlTextView == null) {
            j.n("mHtmlTextViewFaqContent");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        HtmlTextView htmlTextView2 = this.f14289C0;
        if (htmlTextView2 == null) {
            j.n("mHtmlTextViewMechanicsContent");
            throw null;
        }
        htmlTextView2.setOnLinkClickListener(this);
        P1().p(this.N0);
        Button button = this.f14290D0;
        if (button == null) {
            j.n("mTextViewReportAnIssue");
            throw null;
        }
        button.setOnClickListener(new Gc.c(this, 0));
        Button button2 = this.f14291E0;
        if (button2 == null) {
            j.n("mButtonClaim");
            throw null;
        }
        button2.setOnClickListener(new Gc.c(this, 1));
        Toolbar toolbar2 = this.f14301q0;
        if (toolbar2 == null) {
            j.n("mToolbar");
            throw null;
        }
        toolbar2.setNavigationOnClickListener(new Gc.c(this, 2));
        AppCompatCheckBox appCompatCheckBox = this.w0;
        if (appCompatCheckBox == null) {
            j.n("mCheckBoxReminder");
            throw null;
        }
        appCompatCheckBox.setOnClickListener(new Gc.c(this, 3));
        ImageView imageView = this.f14305x0;
        if (imageView == null) {
            j.n("mImageViewReminderCalendar");
            throw null;
        }
        imageView.setOnClickListener(new Gc.c(this, 4));
        ImageView imageView2 = this.f14295J0;
        if (imageView2 != null) {
            Ke.b.b(imageView2, new k(this, 19));
        } else {
            j.n("mImageViewVoucherCodeCopy");
            throw null;
        }
    }
}
