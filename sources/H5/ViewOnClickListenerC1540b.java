package h5;

import F.i;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import b5.C0910b;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.paymaya.common.utility.C;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import java.util.List;

/* JADX INFO: renamed from: h5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1540b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16932b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16933d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC1540b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f16931a = i;
        this.f16932b = obj;
        this.c = obj2;
        this.f16933d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.e;
        Object obj2 = this.f16933d;
        Object obj3 = this.c;
        Object obj4 = this.f16932b;
        switch (this.f16931a) {
            case 0:
                NativeCustomFormatAd nativeCustomFormatAd = (NativeCustomFormatAd) obj4;
                i iVar = (i) obj3;
                C0910b c0910b = (C0910b) obj2;
                Context context = (Context) obj;
                Callback.onClick_enter(view);
                try {
                    i.f(nativeCustomFormatAd, iVar, c0910b, context);
                    return;
                } finally {
                }
            default:
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) obj4;
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) obj3;
                TextView textView = (TextView) obj2;
                String str = (String) obj;
                List list = MayaUserProfileUpdateFragment.f14261f0;
                Callback.onClick_enter(view);
                try {
                    mayaUserProfileUpdateFragment.getClass();
                    textView.setVisibility(8);
                    mayaProfileInputLayout.setVisibility(0);
                    mayaUserProfileUpdateFragment.u2(true);
                    mayaUserProfileUpdateFragment.i2().setText(str);
                    mayaProfileInputLayout.requestFocus();
                    C.u0(mayaUserProfileUpdateFragment.getActivity(), mayaProfileInputLayout.getInputEditText());
                    return;
                } finally {
                }
        }
    }
}
