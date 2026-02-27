package w9;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20708a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20709b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ c(MayaMfaActivity mayaMfaActivity, Function0 function0) {
        this.f20709b = mayaMfaActivity;
        this.c = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function0 function0 = this.c;
        MayaMfaActivity mayaMfaActivity = this.f20709b;
        switch (this.f20708a) {
            case 0:
                int i = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    function0.invoke();
                    mayaMfaActivity.finish();
                    return;
                } finally {
                }
            default:
                int i4 = MayaMfaActivity.f12926w;
                Callback.onClick_enter(view);
                try {
                    mayaMfaActivity.f12931r = "mfa_expired";
                    mayaMfaActivity.setResult(1016);
                    mayaMfaActivity.finish();
                    function0.invoke();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ c(Function0 function0, MayaMfaActivity mayaMfaActivity) {
        this.c = function0;
        this.f20709b = mayaMfaActivity;
    }
}
