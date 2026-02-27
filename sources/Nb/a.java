package Nb;

import Ah.p;
import D8.C0214w;
import G6.v;
import Lh.h;
import Th.e;
import android.view.View;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.store.C1279q;
import com.paymaya.domain.store.C1287u0;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryEmailFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFragment;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import y5.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaSettingsActivity f4378b;

    public /* synthetic */ a(MayaSettingsActivity mayaSettingsActivity, int i) {
        this.f4377a = i;
        this.f4378b = mayaSettingsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2;
        int i4 = 0;
        switch (this.f4377a) {
            case 0:
                View it = (View) obj;
                int i6 = MayaSettingsActivity.f13839r;
                j.g(it, "it");
                MayaSettingsActivity mayaSettingsActivity = this.f4378b;
                mayaSettingsActivity.getClass();
                AbstractC1236z.e(mayaSettingsActivity, MayaChangeMinFragment.class, false);
                return Unit.f18162a;
            case 1:
                View it2 = (View) obj;
                int i10 = MayaSettingsActivity.f13839r;
                j.g(it2, "it");
                MayaSettingsActivity mayaSettingsActivity2 = this.f4378b;
                mayaSettingsActivity2.n1().s(mayaSettingsActivity2, false);
                return Unit.f18162a;
            case 2:
                MayaSettingsActivity mayaSettingsActivity3 = this.f4378b;
                String str = (String) obj;
                int i11 = MayaSettingsActivity.f13839r;
                MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment = (MayaAccountRecoveryEmailFragment) mayaSettingsActivity3.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaSettingsActivity3, MayaAccountRecoveryEmailFragment.class));
                if (mayaAccountRecoveryEmailFragment != null) {
                    Lb.a aVarI1 = mayaAccountRecoveryEmailFragment.I1();
                    ((MayaBaseFragment) ((Rb.a) aVarI1.c.get())).E1();
                    String strH1 = ((MayaAccountRecoveryEmailFragment) ((Rb.a) aVarI1.c.get())).H1();
                    C1293x0 c1293x0 = (C1293x0) aVarI1.f2942g;
                    c1293x0.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(SessionDescription.ATTR_TYPE, "email");
                    } catch (JSONException unused) {
                        yk.a.e();
                    }
                    try {
                        jSONObject.put("value", strH1);
                    } catch (JSONException unused2) {
                        yk.a.e();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("password", str);
                    } catch (JSONException unused3) {
                        yk.a.e();
                    }
                    try {
                        jSONObject2.put("backup_identity", jSONObject);
                    } catch (JSONException unused4) {
                        yk.a.e();
                    }
                    p<Profile> pVarUpdateProfile = c1293x0.c.updateProfile(RequestBody.create(f.f21063a, jSONObject2.toString().getBytes(Charset.forName("UTF-8"))));
                    C1287u0 c1287u0 = new C1287u0(c1293x0, i4);
                    pVarUpdateProfile.getClass();
                    new Lh.d(new Lh.d(new h(new Lh.d(pVarUpdateProfile, c1287u0, i), zh.b.a(), 0), new Gb.d(aVarI1, 13), i), new v(aVarI1, 15), i4).e();
                    break;
                }
                return Unit.f18162a;
            case 3:
                MayaSettingsActivity mayaSettingsActivity4 = this.f4378b;
                String str2 = (String) obj;
                int i12 = MayaSettingsActivity.f13839r;
                MayaChangeMinFragment mayaChangeMinFragment = (MayaChangeMinFragment) mayaSettingsActivity4.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaSettingsActivity4, MayaChangeMinFragment.class));
                if (mayaChangeMinFragment != null) {
                    C0214w c0214w = mayaChangeMinFragment.f13942Z;
                    if (c0214w == null) {
                        j.n("mFragmentPresenter");
                        throw null;
                    }
                    ((MayaBaseFragment) ((Rb.d) c0214w.c.get())).E1();
                    C1279q c1279q = (C1279q) c0214w.f;
                    c1279q.getClass();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("password", str2);
                    } catch (JSONException unused5) {
                        yk.a.e();
                    }
                    byte[] bytes = jSONObject3.toString().getBytes(Charset.forName("UTF-8"));
                    RequestBody.Companion companion = RequestBody.Companion;
                    j.d(bytes);
                    c0214w.e(new Lh.d(new Lh.d(new h(c1279q.f11472b.requestChangeIdentity(RequestBody.Companion.create$default(companion, f.f21063a, bytes, 0, 0, 12, (Object) null)).h(e.c), zh.b.a(), 0), new v(c0214w, 16), i), new Gc.h(c0214w, 14), i4).e());
                    break;
                }
                return Unit.f18162a;
            case 4:
                View it3 = (View) obj;
                int i13 = MayaSettingsActivity.f13839r;
                j.g(it3, "it");
                MayaSettingsActivity mayaSettingsActivity5 = this.f4378b;
                mayaSettingsActivity5.n1().s(mayaSettingsActivity5, false);
                return Unit.f18162a;
            default:
                View it4 = (View) obj;
                int i14 = MayaSettingsActivity.f13839r;
                j.g(it4, "it");
                MayaSettingsActivity mayaSettingsActivity6 = this.f4378b;
                mayaSettingsActivity6.n1().z(mayaSettingsActivity6);
                return Unit.f18162a;
        }
    }
}
