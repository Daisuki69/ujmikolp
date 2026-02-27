package Lb;

import android.widget.Button;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S0 f2948d;
    public final com.paymaya.data.preference.a e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2949g;
    public String h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2950k;

    public e(S0 s02, com.paymaya.data.preference.a aVar, Uh.d dVar) {
        super(dVar);
        this.f2948d = s02;
        this.e = aVar;
        this.f = "";
        this.f2949g = "";
        this.h = "";
    }

    public final void k(String str, String str2, String str3) {
        this.f = str;
        this.f2949g = str2;
        this.h = str3;
        Rb.f fVar = (Rb.f) this.c.get();
        boolean z4 = str.length() > 0 && str2.length() > 0 && str3.length() > 0;
        Button button = ((MayaChangePasswordFragment) fVar).f13951Z;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            j.n("mButtonSave");
            throw null;
        }
    }
}
