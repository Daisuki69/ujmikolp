package Ic;

import Gc.g;
import Kh.B;
import N5.F;
import We.A;
import android.app.AlarmManager;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.AlarmManagerCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.RecyclerView;
import bg.AbstractC0983W;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.receiver.ScheduledNotificationReceiver;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.I;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.ScheduledNotification;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherNotificationSettings;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersPageFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f2279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ac.c f2280b;
    public final A7.f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Voucher f2281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(F f, A picasso, com.paymaya.data.preference.a preference, Ac.c cVar) {
        super((ConstraintLayout) f.f3614b);
        j.g(picasso, "picasso");
        j.g(preference, "preference");
        this.f2279a = f;
        this.c = new A7.f(this, preference);
        this.f2280b = cVar;
        final int i = 0;
        ((ConstraintLayout) f.f3615d).setOnClickListener(new View.OnClickListener(this) { // from class: Ic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f2278b;

            {
                this.f2278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        b bVar = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            bVar.f2280b.f(bVar.f2281d);
                            return;
                        } finally {
                        }
                    case 1:
                        b bVar2 = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            b.D(bVar2);
                            return;
                        } finally {
                        }
                    default:
                        b bVar3 = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            b.E(bVar3);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        ((AppCompatCheckBox) f.h).setOnClickListener(new View.OnClickListener(this) { // from class: Ic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f2278b;

            {
                this.f2278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        b bVar = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            bVar.f2280b.f(bVar.f2281d);
                            return;
                        } finally {
                        }
                    case 1:
                        b bVar2 = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            b.D(bVar2);
                            return;
                        } finally {
                        }
                    default:
                        b bVar3 = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            b.E(bVar3);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i6 = 2;
        ((ImageView) f.f3616g).setOnClickListener(new View.OnClickListener(this) { // from class: Ic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f2278b;

            {
                this.f2278b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        b bVar = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            bVar.f2280b.f(bVar.f2281d);
                            return;
                        } finally {
                        }
                    case 1:
                        b bVar2 = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            b.D(bVar2);
                            return;
                        } finally {
                        }
                    default:
                        b bVar3 = this.f2278b;
                        Callback.onClick_enter(view);
                        try {
                            b.E(bVar3);
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public static final void D(b bVar) {
        List<String> listMNotifyDatesBeforeExpiry;
        Ac.c cVar = bVar.f2280b;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) bVar.f2279a.h;
        Voucher voucher = bVar.f2281d;
        boolean zIsChecked = appCompatCheckBox.isChecked();
        cVar.getClass();
        MayaVouchersPageFragment mayaVouchersPageFragment = cVar.f252a;
        g gVar = mayaVouchersPageFragment.f14311A0;
        if (gVar != null) {
            ((MayaVouchersActivity) gVar).V1();
        }
        Context contextRequireContext = mayaVouchersPageFragment.requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (AbstractC0983W.r(contextRequireContext)) {
            appCompatCheckBox.setChecked(false);
            return;
        }
        C1220i c1220iO1 = mayaVouchersPageFragment.o1();
        FragmentActivity activity = mayaVouchersPageFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaVouchersPageFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.REMINDER);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("campaign_name", voucher != null ? voucher.mCampaignName() : null);
        c1219hD.j.put(SessionDescription.ATTR_TYPE, zIsChecked ? "subscribe" : "unsubscribe");
        c1220iO1.c(activity, c1219hD);
        FragmentActivity activity2 = mayaVouchersPageFragment.getActivity();
        int i = R.string.pma_notification_channel_id_reminders;
        boolean zA = I.a(activity2, mayaVouchersPageFragment.getString(R.string.pma_notification_channel_id_reminders));
        if (voucher != null) {
            Dc.d dVar = (Dc.d) mayaVouchersPageFragment.P1();
            Voucher voucherBuild = voucher.toBuilder().mHasReminder(zIsChecked).build();
            if (zA && zIsChecked) {
                j.d(voucherBuild);
                VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings = voucherBuild.mNotificationSettings();
                List<String> listMNotifyDatesBeforeExpiry2 = voucherNotificationSettingsMNotificationSettings != null ? voucherNotificationSettingsMNotificationSettings.mNotifyDatesBeforeExpiry() : null;
                if (listMNotifyDatesBeforeExpiry2 != null && !listMNotifyDatesBeforeExpiry2.isEmpty()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() + 5000;
                    VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings2 = voucherBuild.mNotificationSettings();
                    if (voucherNotificationSettingsMNotificationSettings2 != null && (listMNotifyDatesBeforeExpiry = voucherNotificationSettingsMNotificationSettings2.mNotifyDatesBeforeExpiry()) != null) {
                        Iterator<String> it = listMNotifyDatesBeforeExpiry.iterator();
                        while (it.hasNext()) {
                            long millis = DateTime.parse(it.next(), AbstractC1234x.f11255o).getMillis();
                            if (millis > jCurrentTimeMillis) {
                                MayaVouchersPageFragment mayaVouchersPageFragment2 = (MayaVouchersPageFragment) ((Fc.d) dVar.c.get());
                                mayaVouchersPageFragment2.getClass();
                                if (mayaVouchersPageFragment2.getContext() != null) {
                                    ScheduledNotification.Builder builderMTitle = ScheduledNotification.sBuilder().mNotificationChannelId(mayaVouchersPageFragment2.getString(i)).mSchedulingRequestCode(voucherBuild.mAssignmentId()).mSchedulingDataIdentifier(voucherBuild.mAssignmentId() + Global.UNDERSCORE + millis).mNotificationTriggerTime(millis).mTitle(mayaVouchersPageFragment2.getString(R.string.maya_label_voucher_reminder_notification_default_title));
                                    VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings3 = voucherBuild.mNotificationSettings();
                                    ScheduledNotification scheduledNotificationBuild = builderMTitle.mText(voucherNotificationSettingsMNotificationSettings3 != null ? voucherNotificationSettingsMNotificationSettings3.mNotificationSpiel() : null).mContentIntent(mayaVouchersPageFragment2.Q1(voucherBuild, millis)).build();
                                    Context contextRequireContext2 = mayaVouchersPageFragment2.requireContext();
                                    int i4 = ScheduledNotificationReceiver.f10363a;
                                    AlarmManagerCompat.setExactAndAllowWhileIdle((AlarmManager) contextRequireContext2.getSystemService("alarm"), 0, scheduledNotificationBuild.mNotificationTriggerTime(), ScheduledNotificationReceiver.a(contextRequireContext2, scheduledNotificationBuild));
                                }
                                i = R.string.pma_notification_channel_id_reminders;
                            }
                        }
                    }
                }
                ((MayaVouchersPageFragment) ((Fc.d) dVar.c.get())).U1();
            } else if (zA || !zIsChecked) {
                j.d(voucherBuild);
                VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings4 = voucherBuild.mNotificationSettings();
                List<String> listMNotifyDatesBeforeExpiry3 = voucherNotificationSettingsMNotificationSettings4 != null ? voucherNotificationSettingsMNotificationSettings4.mNotifyDatesBeforeExpiry() : null;
                List<String> list = listMNotifyDatesBeforeExpiry3;
                if (list != null && !list.isEmpty()) {
                    for (String str : listMNotifyDatesBeforeExpiry3) {
                        Fc.d dVar2 = (Fc.d) dVar.c.get();
                        long millis2 = DateTime.parse(str, AbstractC1234x.f11255o).getMillis();
                        MayaVouchersPageFragment mayaVouchersPageFragment3 = (MayaVouchersPageFragment) dVar2;
                        mayaVouchersPageFragment3.getClass();
                        if (mayaVouchersPageFragment3.getContext() != null) {
                            ScheduledNotification.Builder builderMTitle2 = ScheduledNotification.sBuilder().mNotificationChannelId(mayaVouchersPageFragment3.getString(R.string.pma_notification_channel_id_reminders)).mSchedulingRequestCode(voucherBuild.mAssignmentId()).mSchedulingDataIdentifier(voucherBuild.mAssignmentId() + Global.UNDERSCORE + millis2).mNotificationTriggerTime(millis2).mTitle(mayaVouchersPageFragment3.getString(R.string.maya_label_voucher_reminder_notification_default_title));
                            VoucherNotificationSettings voucherNotificationSettingsMNotificationSettings5 = voucherBuild.mNotificationSettings();
                            ScheduledNotification scheduledNotificationBuild2 = builderMTitle2.mText(voucherNotificationSettingsMNotificationSettings5 != null ? voucherNotificationSettingsMNotificationSettings5.mNotificationSpiel() : null).mContentIntent(mayaVouchersPageFragment3.Q1(voucherBuild, millis2)).build();
                            Context contextRequireContext3 = mayaVouchersPageFragment3.requireContext();
                            int i6 = ScheduledNotificationReceiver.f10363a;
                            ((AlarmManager) contextRequireContext3.getSystemService("alarm")).cancel(ScheduledNotificationReceiver.a(contextRequireContext3, scheduledNotificationBuild2));
                        }
                    }
                }
                MayaVouchersPageFragment mayaVouchersPageFragment4 = (MayaVouchersPageFragment) ((Fc.d) dVar.c.get());
                FragmentActivity activity3 = mayaVouchersPageFragment4.getActivity();
                SpringView springView = mayaVouchersPageFragment4.f14315q0;
                if (springView == null) {
                    j.n("mSwipeRefreshLayout");
                    throw null;
                }
                b0.e(activity3, springView, null, R.string.maya_label_voucher_reminder_cancelled, R.drawable.maya_bg_snackbar_success_small_margin, R.style.JekoBoldSmallText_Snackbar_Success, 0, 0, 852);
                C1220i c1220iO12 = mayaVouchersPageFragment4.o1();
                FragmentActivity activity4 = mayaVouchersPageFragment4.getActivity();
                C1219h c1219hD2 = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
                c1219hD2.n(5);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map = c1219hD2.j;
                map.put(SessionDescription.ATTR_TYPE, "unsubscribe");
                map.put("status", "failure");
                c1220iO12.c(activity4, c1219hD2);
            } else {
                ((MayaVouchersPageFragment) ((Fc.d) dVar.c.get())).T1();
                zIsChecked = false;
            }
            dVar.f1120d.e(voucherBuild.mAssignmentId(), zIsChecked);
        }
        if (zA) {
            return;
        }
        appCompatCheckBox.setChecked(false);
    }

    public static final void E(b bVar) {
        Ac.c cVar = bVar.f2280b;
        Voucher voucher = bVar.f2281d;
        MayaVouchersPageFragment mayaVouchersPageFragment = cVar.f252a;
        C1220i c1220iO1 = mayaVouchersPageFragment.o1();
        FragmentActivity activity = mayaVouchersPageFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
        c1219hD.n(17);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("assignment_id", String.valueOf(voucher != null ? Integer.valueOf(voucher.mAssignmentId()) : null));
        c1220iO1.c(activity, c1219hD);
        if (voucher != null) {
            B bE = E1.c.r(new Ze.c(mayaVouchersPageFragment).c("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR")).e(zh.b.a());
            Gh.f fVar = new Gh.f(new A7.f(15, mayaVouchersPageFragment, voucher), Eh.d.f1366d);
            bE.g(fVar);
            mayaVouchersPageFragment.f14313o0.a(fVar);
        }
    }
}
