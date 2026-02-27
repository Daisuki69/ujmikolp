package androidx.preference;

import androidx.activity.BackEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileContactsSelectionFragment;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements FragmentManager.OnBackStackChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8164b;

    public /* synthetic */ a(Object obj, int i) {
        this.f8163a = i;
        this.f8164b = obj;
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final /* synthetic */ void onBackStackChangeCancelled() {
        int i = this.f8163a;
        j.a(this);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z4) {
        int i = this.f8163a;
        j.b(this, fragment, z4);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
        int i = this.f8163a;
        j.c(this, backEventCompat);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z4) {
        int i = this.f8163a;
        j.d(this, fragment, z4);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final void onBackStackChanged() {
        Object obj = this.f8164b;
        switch (this.f8163a) {
            case 0:
                PreferenceHeaderFragmentCompat.m129onViewCreated$lambda10((PreferenceHeaderFragmentCompat) obj);
                break;
            default:
                int i = MayaUserProfileUpdateActivity.f14235p;
                MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity = (MayaUserProfileUpdateActivity) obj;
                if (!(mayaUserProfileUpdateActivity.getSupportFragmentManager().findFragmentById(com.paymaya.R.id.frame_layout_container) instanceof MayaUserProfileContactsSelectionFragment) && !(mayaUserProfileUpdateActivity.getSupportFragmentManager().findFragmentById(com.paymaya.R.id.frame_layout_container) instanceof MayaAllowContactsPermissionFragment)) {
                    mayaUserProfileUpdateActivity.t1();
                    break;
                }
                break;
        }
    }
}
