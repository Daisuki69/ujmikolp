package Zb;

import E8.RunnableC0219b;
import android.os.Handler;
import android.os.Looper;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaShopV2Activity f6923b;

    public /* synthetic */ a(MayaShopV2Activity mayaShopV2Activity, int i) {
        this.f6922a = i;
        this.f6923b = mayaShopV2Activity;
    }

    @Override // pg.s
    public final void onMethodCall(r methodCall, t result) {
        switch (this.f6922a) {
            case 0:
                int i = MayaShopV2Activity.f13985B;
                j.g(methodCall, "methodCall");
                j.g(result, "result");
                MayaShopV2Activity mayaShopV2Activity = this.f6923b;
                mayaShopV2Activity.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC0219b(methodCall, mayaShopV2Activity, result, "packages/paymaya_checkout", 2));
                break;
            default:
                int i4 = MayaShopV2Activity.f13985B;
                j.g(methodCall, "methodCall");
                j.g(result, "result");
                MayaShopV2Activity mayaShopV2Activity2 = this.f6923b;
                mayaShopV2Activity2.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC0219b(methodCall, mayaShopV2Activity2, result, "packages/maya_load", 2));
                break;
        }
    }
}
