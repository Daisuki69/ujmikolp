package oa;

import A5.b;
import S5.c;
import android.content.Intent;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.inboxsupport.view.activity.impl.MayaInboxSupportActivity;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;

/* JADX INFO: renamed from: oa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1973a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaProfileActivity f18812b;

    public /* synthetic */ ViewOnClickListenerC1973a(MayaProfileActivity mayaProfileActivity, int i) {
        this.f18811a = i;
        this.f18812b = mayaProfileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MayaProfileActivity mayaProfileActivity = this.f18812b;
        switch (this.f18811a) {
            case 0:
                int i = MayaProfileActivity.f13490r;
                Callback.onClick_enter(view);
                try {
                    C1219h c1219h = new C1219h();
                    c1219h.n(17);
                    c1219h.t(EnumC1217f.BACK);
                    c1219h.i();
                    mayaProfileActivity.v1(c1219h);
                    mayaProfileActivity.onBackPressed();
                    return;
                } finally {
                }
            case 1:
                int i4 = MayaProfileActivity.f13490r;
                Callback.onClick_enter(view);
                try {
                    C1219h c1219h2 = new C1219h();
                    c1219h2.n(17);
                    c1219h2.t(EnumC1217f.QR);
                    c1219h2.i();
                    mayaProfileActivity.v1(c1219h2);
                    mayaProfileActivity.n1().K(mayaProfileActivity);
                    mayaProfileActivity.finish();
                    return;
                } finally {
                }
            case 2:
                int i6 = MayaProfileActivity.f13490r;
                Callback.onClick_enter(view);
                try {
                    MayaProfileActivity.W1(mayaProfileActivity);
                    return;
                } finally {
                }
            default:
                int i10 = MayaProfileActivity.f13490r;
                Callback.onClick_enter(view);
                try {
                    if (c.b(mayaProfileActivity.m1(), b.f123o)) {
                        mayaProfileActivity.n1();
                        Intent intent = new Intent(mayaProfileActivity, (Class<?>) MayaInboxSupportActivity.class);
                        intent.putExtra("intent", "dedup");
                        mayaProfileActivity.startActivity(intent);
                    } else {
                        mayaProfileActivity.n1().w(mayaProfileActivity, "https://cares.paymaya.com/s/article/What-do-I-do-if-my-PayMaya-account-is-tagged-as-a-duplicate-one");
                    }
                    return;
                } finally {
                }
        }
    }
}
