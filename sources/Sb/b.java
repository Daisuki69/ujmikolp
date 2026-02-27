package Sb;

import android.content.Intent;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaLicensesBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMayaSettingsFragment f5696b;

    public /* synthetic */ b(BaseMayaSettingsFragment baseMayaSettingsFragment, int i) {
        this.f5695a = i;
        this.f5696b = baseMayaSettingsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5695a) {
            case 0:
                BaseMayaSettingsFragment baseMayaSettingsFragment = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment.J1(EnumC1217f.DATA_PERSONALIZATION);
                    baseMayaSettingsFragment.H1().o();
                    return;
                } finally {
                }
            case 1:
                BaseMayaSettingsFragment baseMayaSettingsFragment2 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment2.J1(EnumC1217f.CLOSE_ACCOUNT);
                    d dVar = baseMayaSettingsFragment2.f13906v0;
                    if (dVar != null) {
                        MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) dVar;
                        mayaSettingsActivity.n1().u(mayaSettingsActivity, "https://cares.paymaya.com/s/article/Account-Closure", mayaSettingsActivity.getString(R.string.pma_label_account_closure));
                    }
                    return;
                } finally {
                }
            case 2:
                BaseMayaSettingsFragment baseMayaSettingsFragment3 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    BaseMayaSettingsFragment.K1(baseMayaSettingsFragment3);
                    return;
                } finally {
                }
            case 3:
                BaseMayaSettingsFragment baseMayaSettingsFragment4 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment4.J1(EnumC1217f.CHANGE_PASSWORD);
                    d dVar2 = ((BaseMayaSettingsFragment) ((Rb.j) baseMayaSettingsFragment4.H1().c.get())).f13906v0;
                    if (dVar2 != null) {
                        AbstractC1236z.h((MayaSettingsActivity) dVar2, R.id.frame_layout_container, new MayaChangePasswordFragment());
                    }
                    return;
                } finally {
                }
            case 4:
                BaseMayaSettingsFragment baseMayaSettingsFragment5 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment5.J1(EnumC1217f.PRIVACY_POLICY);
                    d dVar3 = baseMayaSettingsFragment5.f13906v0;
                    if (dVar3 != null) {
                        MayaSettingsActivity mayaSettingsActivity2 = (MayaSettingsActivity) dVar3;
                        mayaSettingsActivity2.n1().k0(mayaSettingsActivity2, "https://www.paymaya.com/privacy/?in_app=true");
                    }
                    return;
                } finally {
                }
            case 5:
                BaseMayaSettingsFragment baseMayaSettingsFragment6 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment6.startActivityForResult(new Intent("android.settings.SECURITY_SETTINGS"), 0);
                    return;
                } finally {
                }
            case 6:
                BaseMayaSettingsFragment baseMayaSettingsFragment7 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment7.O1();
                    return;
                } finally {
                }
            case 7:
                BaseMayaSettingsFragment baseMayaSettingsFragment8 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment8.O1();
                    return;
                } finally {
                }
            case 8:
                BaseMayaSettingsFragment baseMayaSettingsFragment9 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment9.J1(EnumC1217f.TERMS);
                    d dVar4 = baseMayaSettingsFragment9.f13906v0;
                    if (dVar4 != null) {
                        MayaSettingsActivity mayaSettingsActivity3 = (MayaSettingsActivity) dVar4;
                        mayaSettingsActivity3.n1().k0(mayaSettingsActivity3, "https://www.paymaya.com/terms-and-condition/?in_app=true");
                    }
                    return;
                } finally {
                }
            case 9:
                BaseMayaSettingsFragment baseMayaSettingsFragment10 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment10.J1(EnumC1217f.LICENSES);
                    d dVar5 = ((BaseMayaSettingsFragment) ((Rb.j) baseMayaSettingsFragment10.H1().c.get())).f13906v0;
                    if (dVar5 != null) {
                        new MayaLicensesBottomSheetDialogFragment().show(((MayaSettingsActivity) dVar5).getSupportFragmentManager(), "licenses");
                    }
                    return;
                } finally {
                }
            case 10:
                BaseMayaSettingsFragment baseMayaSettingsFragment11 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment11.J1(EnumC1217f.SHOW_NAME);
                    baseMayaSettingsFragment11.H1().x();
                    return;
                } finally {
                }
            case 11:
                BaseMayaSettingsFragment baseMayaSettingsFragment12 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment12.J1(EnumC1217f.EMAIL_ADDRESS);
                    baseMayaSettingsFragment12.H1().w();
                    return;
                } finally {
                }
            default:
                BaseMayaSettingsFragment baseMayaSettingsFragment13 = this.f5696b;
                Callback.onClick_enter(view);
                try {
                    baseMayaSettingsFragment13.J1(EnumC1217f.CHANGE_MOBILE);
                    baseMayaSettingsFragment13.L1();
                    return;
                } finally {
                }
        }
    }
}
